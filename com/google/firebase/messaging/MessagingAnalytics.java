/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.Log
 */
package com.google.firebase.messaging;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.ProductData;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.NotificationParams;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.messaging.reporting.MessagingClientEvent$Builder;
import com.google.firebase.messaging.reporting.MessagingClientEvent$Event;
import com.google.firebase.messaging.reporting.MessagingClientEvent$MessageType;
import com.google.firebase.messaging.reporting.MessagingClientEvent$SDKPlatform;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension$Builder;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

public class MessagingAnalytics {
    private static final int DEFAULT_PRODUCT_ID = 111881503;
    private static final String DELIVERY_METRICS_EXPORT_TO_BIG_QUERY_PREF = "export_to_big_query";
    private static final String FCM_PREFERENCES = "com.google.firebase.messaging";
    private static final String MANIFEST_DELIVERY_METRICS_EXPORT_TO_BIG_QUERY_ENABLED = "delivery_metrics_exported_to_big_query_enabled";
    private static final String REENGAGEMENT_MEDIUM = "notification";
    private static final String REENGAGEMENT_SOURCE = "Firebase";

    public static boolean deliveryMetricsExportToBigQueryEnabled() {
        block10: {
            String string2 = MANIFEST_DELIVERY_METRICS_EXPORT_TO_BIG_QUERY_ENABLED;
            try {
                FirebaseApp.getInstance();
            }
            catch (PackageManager.NameNotFoundException | IllegalStateException throwable) {}
            Object object = FirebaseApp.getInstance().getApplicationContext();
            SharedPreferences sharedPreferences2 = object.getSharedPreferences(FCM_PREFERENCES, 0);
            String string3 = DELIVERY_METRICS_EXPORT_TO_BIG_QUERY_PREF;
            boolean bl2 = sharedPreferences2.contains(string3);
            if (bl2) {
                return sharedPreferences2.getBoolean(string3, false);
            }
            sharedPreferences2 = object.getPackageManager();
            if (sharedPreferences2 == null) break block10;
            object = object.getPackageName();
            int n3 = 128;
            object = sharedPreferences2.getApplicationInfo((String)object, n3);
            if (object == null) break block10;
            sharedPreferences2 = object.metaData;
            if (sharedPreferences2 == null) break block10;
            boolean bl3 = sharedPreferences2.containsKey(string2);
            if (!bl3) break block10;
            object = object.metaData;
            return object.getBoolean(string2, false);
        }
        return false;
    }

    public static MessagingClientEvent eventToProto(MessagingClientEvent$Event object, Intent intent) {
        long l2;
        long l3;
        long l4;
        long l7;
        if (intent == null) {
            return null;
        }
        if ((intent = intent.getExtras()) == null) {
            intent = Bundle.EMPTY;
        }
        Object object2 = MessagingClientEvent.newBuilder();
        int n3 = MessagingAnalytics.getTtl((Bundle)intent);
        object = ((MessagingClientEvent$Builder)object2).setTtl(n3).setEvent((MessagingClientEvent$Event)object);
        object2 = MessagingAnalytics.getInstanceId((Bundle)intent);
        object = ((MessagingClientEvent$Builder)object).setInstanceId((String)object2);
        object2 = MessagingAnalytics.getPackageName();
        object = ((MessagingClientEvent$Builder)object).setPackageName((String)object2);
        object2 = MessagingClientEvent$SDKPlatform.ANDROID;
        object = ((MessagingClientEvent$Builder)object).setSdkPlatform((MessagingClientEvent$SDKPlatform)object2);
        object2 = MessagingAnalytics.getMessageTypeForFirelog((Bundle)intent);
        object = ((MessagingClientEvent$Builder)object).setMessageType((MessagingClientEvent$MessageType)object2);
        int n4 = MessagingAnalytics.getMessagePriorityForFirelog((Bundle)intent);
        object = ((MessagingClientEvent$Builder)object).setPriority(n4);
        object2 = MessagingAnalytics.getMessageId((Bundle)intent);
        if (object2 != null) {
            ((MessagingClientEvent$Builder)object).setMessageId((String)object2);
        }
        if ((object2 = MessagingAnalytics.getTopic((Bundle)intent)) != null) {
            ((MessagingClientEvent$Builder)object).setTopic((String)object2);
        }
        if ((object2 = MessagingAnalytics.getCollapseKey((Bundle)intent)) != null) {
            ((MessagingClientEvent$Builder)object).setCollapseKey((String)object2);
        }
        if ((object2 = MessagingAnalytics.getMessageLabel((Bundle)intent)) != null) {
            ((MessagingClientEvent$Builder)object).setAnalyticsLabel((String)object2);
        }
        if ((object2 = MessagingAnalytics.getComposerLabel((Bundle)intent)) != null) {
            ((MessagingClientEvent$Builder)object).setComposerLabel((String)object2);
        }
        if ((l7 = (l4 = (l3 = MessagingAnalytics.getProjectNumber((Bundle)intent)) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) > 0) {
            ((MessagingClientEvent$Builder)object).setProjectNumber(l3);
        }
        return ((MessagingClientEvent$Builder)object).build();
    }

    public static String getCollapseKey(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    public static String getComposerId(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    public static String getComposerLabel(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    /*
     * WARNING - void declaration
     */
    public static String getInstanceId(Bundle object) {
        void var0_3;
        Object object2 = "google.to";
        boolean bl2 = TextUtils.isEmpty((CharSequence)(object = object.getString((String)object2)));
        if (!bl2) {
            return object;
        }
        object = FirebaseApp.getInstance();
        object = FirebaseInstallations.getInstance((FirebaseApp)object);
        object = ((FirebaseInstallations)object).getId();
        object = Tasks.await((Task)object);
        try {
            return (String)object;
        }
        catch (InterruptedException interruptedException) {
        }
        catch (ExecutionException executionException) {
            // empty catch block
        }
        object2 = new RuntimeException((Throwable)var0_3);
        throw object2;
    }

    public static String getMessageChannel(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    public static String getMessageId(Bundle bundle) {
        String string2 = bundle.getString("google.message_id");
        if (string2 == null) {
            string2 = bundle.getString("message_id");
        }
        return string2;
    }

    public static String getMessageLabel(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    private static int getMessagePriority(String string2) {
        String string3 = "high";
        boolean bl2 = string3.equals(string2);
        if (bl2) {
            return 1;
        }
        string3 = "normal";
        boolean bl3 = string3.equals(string2);
        if (bl3) {
            return 2;
        }
        return 0;
    }

    public static int getMessagePriorityForFirelog(Bundle bundle) {
        int n3;
        int n4 = MessagingAnalytics.getPriority(bundle);
        if (n4 == (n3 = 2)) {
            return 5;
        }
        n3 = 1;
        if (n4 == n3) {
            return 10;
        }
        return 0;
    }

    public static String getMessageTime(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    public static MessagingClientEvent$MessageType getMessageTypeForFirelog(Bundle object) {
        boolean bl2;
        object = object != null && (bl2 = NotificationParams.isNotification(object)) ? MessagingClientEvent$MessageType.DISPLAY_NOTIFICATION : MessagingClientEvent$MessageType.DATA_MESSAGE;
        return object;
    }

    public static String getMessageTypeForScion(Bundle object) {
        boolean bl2;
        object = object != null && (bl2 = NotificationParams.isNotification(object)) ? "display" : "data";
        return object;
    }

    public static String getPackageName() {
        return FirebaseApp.getInstance().getApplicationContext().getPackageName();
    }

    public static int getPriority(Bundle bundle) {
        String string2 = bundle.getString("google.delivered_priority");
        if (string2 == null) {
            String string3 = "1";
            string2 = bundle.getString("google.priority_reduced");
            boolean bl2 = string3.equals(string2);
            if (bl2) {
                return 2;
            }
            string2 = bundle.getString("google.priority");
        }
        return MessagingAnalytics.getMessagePriority(string2);
    }

    public static long getProjectNumber(Bundle object) {
        int n3;
        String string2 = "google.c.sender.id";
        boolean bl2 = object.containsKey(string2);
        if (bl2) {
            try {
                object = object.getString(string2);
            }
            catch (NumberFormatException numberFormatException) {}
            return Long.parseLong((String)object);
        }
        if ((string2 = ((FirebaseApp)(object = FirebaseApp.getInstance())).getOptions().getGcmSenderId()) != null) {
            try {
                return Long.parseLong(string2);
            }
            catch (NumberFormatException numberFormatException) {}
        }
        object = ((FirebaseApp)object).getOptions().getApplicationId();
        string2 = "1:";
        boolean n4 = ((String)object).startsWith(string2);
        long l2 = 0L;
        if (!n4) {
            return Long.parseLong((String)object);
        }
        string2 = ":";
        int n7 = ((Object)(object = ((String)object).split(string2))).length;
        if (n7 < (n3 = 2)) {
            return l2;
        }
        boolean bl3 = ((String)(object = object[1])).isEmpty();
        if (bl3) {
            return l2;
        }
        try {
            return Long.parseLong((String)object);
        }
        catch (NumberFormatException numberFormatException) {
            return l2;
        }
    }

    public static String getTopic(Bundle object) {
        boolean bl2;
        String string2 = "from";
        if ((object = object.getString(string2)) == null || !(bl2 = ((String)object).startsWith(string2 = "/topics/"))) {
            object = null;
        }
        return object;
    }

    public static int getTtl(Bundle object) {
        String string2 = "google.ttl";
        boolean bl2 = (object = object.get(string2)) instanceof Integer;
        if (bl2) {
            return (Integer)object;
        }
        bl2 = object instanceof String;
        if (bl2) {
            string2 = object;
            string2 = (String)object;
            try {
                return Integer.parseInt(string2);
            }
            catch (NumberFormatException numberFormatException) {
                Objects.toString(object);
            }
        }
        return 0;
    }

    public static String getUseDeviceTime(Bundle bundle) {
        String string2 = "google.c.a.udt";
        boolean bl2 = bundle.containsKey(string2);
        if (bl2) {
            return bundle.getString(string2);
        }
        return null;
    }

    private static boolean isDirectBootMessage(Intent object) {
        object = object.getAction();
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(object);
    }

    public static void logNotificationDismiss(Intent intent) {
        intent = intent.getExtras();
        MessagingAnalytics.logToScion("_nd", (Bundle)intent);
    }

    public static void logNotificationForeground(Intent intent) {
        intent = intent.getExtras();
        MessagingAnalytics.logToScion("_nf", (Bundle)intent);
    }

    public static void logNotificationOpen(Bundle bundle) {
        MessagingAnalytics.setUserPropertyIfRequired(bundle);
        MessagingAnalytics.logToScion("_no", bundle);
    }

    public static void logNotificationReceived(Intent intent) {
        Object object;
        Object object2;
        boolean bl2 = MessagingAnalytics.shouldUploadScionMetrics(intent);
        if (bl2) {
            object2 = "_nr";
            object = intent.getExtras();
            MessagingAnalytics.logToScion((String)object2, object);
        }
        if (bl2 = MessagingAnalytics.shouldUploadFirelogAnalytics(intent)) {
            object2 = MessagingClientEvent$Event.MESSAGE_DELIVERED;
            object = FirebaseMessaging.getTransportFactory();
            MessagingAnalytics.logToFirelog((MessagingClientEvent$Event)object2, intent, (TransportFactory)object);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void logToFirelog(MessagingClientEvent$Event object, Intent object2, TransportFactory object3) {
        int n3;
        Transport transport;
        if (transport == null) {
            return;
        }
        if ((object = MessagingAnalytics.eventToProto((MessagingClientEvent$Event)object, object2)) == null) {
            return;
        }
        Object object4 = "google.product_id";
        int n4 = 111881503;
        try {
            n3 = object2.getIntExtra((String)object4, n4);
        }
        catch (RuntimeException runtimeException) {
            return;
        }
        Integer n7 = n3;
        ProductData productData = ProductData.withProductId(n7);
        object4 = "FCM_CLIENT_EVENT_LOGGING";
        Class<MessagingClientEventExtension> clazz = MessagingClientEventExtension.class;
        Object object5 = "proto";
        object5 = Encoding.of((String)object5);
        zo1_2 zo1_22 = new Object();
        transport = transport.getTransport((String)object4, clazz, (Encoding)object5, zo1_22);
        object4 = MessagingClientEventExtension.newBuilder();
        object = ((MessagingClientEventExtension$Builder)object4).setMessagingClientEvent((MessagingClientEvent)object);
        object = ((MessagingClientEventExtension$Builder)object).build();
        object = Event.ofData(object, productData);
        transport.send((Event)object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void logToScion(String string2, Bundle object) {
        boolean bl2;
        int n3;
        boolean bl3;
        String string3;
        block19: {
            try {
                FirebaseApp.getInstance();
                if (object != null) break block19;
            }
            catch (IllegalStateException illegalStateException) {
                return;
            }
            object = new Bundle();
        }
        Bundle bundle = new Bundle();
        Class<AnalyticsConnector> clazz = MessagingAnalytics.getComposerId((Bundle)object);
        if (clazz != null) {
            string3 = "_nmid";
            bundle.putString(string3, (String)((Object)clazz));
        }
        if ((clazz = MessagingAnalytics.getComposerLabel((Bundle)object)) != null) {
            string3 = "_nmn";
            bundle.putString(string3, (String)((Object)clazz));
        }
        if (!(bl3 = TextUtils.isEmpty((CharSequence)((Object)(clazz = MessagingAnalytics.getMessageLabel((Bundle)object)))))) {
            string3 = "label";
            bundle.putString(string3, (String)((Object)clazz));
        }
        if (!(bl3 = TextUtils.isEmpty((CharSequence)((Object)(clazz = MessagingAnalytics.getMessageChannel((Bundle)object)))))) {
            string3 = "message_channel";
            bundle.putString(string3, (String)((Object)clazz));
        }
        if ((clazz = MessagingAnalytics.getTopic((Bundle)object)) != null) {
            string3 = "_nt";
            bundle.putString(string3, (String)((Object)clazz));
        }
        if ((clazz = MessagingAnalytics.getMessageTime((Bundle)object)) != null) {
            string3 = "_nmt";
            try {
                n3 = Integer.parseInt((String)((Object)clazz));
            }
            catch (NumberFormatException numberFormatException) {}
            bundle.putInt(string3, n3);
        }
        if ((clazz = MessagingAnalytics.getUseDeviceTime((Bundle)object)) != null) {
            string3 = "_ndt";
            try {
                n3 = Integer.parseInt((String)((Object)clazz));
            }
            catch (NumberFormatException numberFormatException) {}
            bundle.putInt(string3, n3);
        }
        object = MessagingAnalytics.getMessageTypeForScion((Bundle)object);
        clazz = "_nr";
        n3 = (int)(((String)((Object)clazz)).equals(string2) ? 1 : 0);
        if (n3 != 0 || (n3 = (int)(((String)((Object)(clazz = "_nf"))).equals(string2) ? 1 : 0)) != 0) {
            clazz = "_nmc";
            bundle.putString((String)((Object)clazz), (String)object);
        }
        if (bl2 = Log.isLoggable((String)(object = "FirebaseMessaging"), (int)(n3 = 3))) {
            bundle.toString();
        }
        object = FirebaseApp.getInstance();
        clazz = AnalyticsConnector.class;
        if ((object = (AnalyticsConnector)((FirebaseApp)object).get(clazz)) != null) {
            clazz = "fcm";
            object.logEvent((String)((Object)clazz), string2, bundle);
        }
        return;
    }

    public static void setDeliveryMetricsExportToBigQuery(boolean bl2) {
        FirebaseApp.getInstance().getApplicationContext().getSharedPreferences(FCM_PREFERENCES, 0).edit().putBoolean(DELIVERY_METRICS_EXPORT_TO_BIG_QUERY_PREF, bl2).apply();
    }

    private static void setUserPropertyIfRequired(Bundle object) {
        if (object == null) {
            return;
        }
        Object object2 = object.getString("google.c.a.tc");
        String string2 = "1";
        boolean bl2 = string2.equals(object2);
        int n3 = 3;
        String string3 = "FirebaseMessaging";
        if (bl2) {
            object2 = FirebaseApp.getInstance();
            Object object3 = AnalyticsConnector.class;
            object2 = (AnalyticsConnector)((FirebaseApp)object2).get((Class)object3);
            Log.isLoggable((String)string3, (int)n3);
            if (object2 != null) {
                object = object.getString("google.c.a.c_id");
                string3 = "fcm";
                object2.setUserProperty(string3, "_ln", object);
                string2 = new Bundle();
                string2.putString("source", REENGAGEMENT_SOURCE);
                String string4 = REENGAGEMENT_MEDIUM;
                string2.putString("medium", string4);
                object3 = "campaign";
                string2.putString((String)object3, (String)object);
                object = "_cmp";
                object2.logEvent(string3, (String)object, (Bundle)string2);
            }
        } else {
            Log.isLoggable((String)string3, (int)n3);
        }
    }

    public static boolean shouldUploadFirelogAnalytics(Intent intent) {
        boolean bl2;
        if (intent != null && !(bl2 = MessagingAnalytics.isDirectBootMessage(intent))) {
            return MessagingAnalytics.deliveryMetricsExportToBigQueryEnabled();
        }
        return false;
    }

    public static boolean shouldUploadScionMetrics(Intent intent) {
        boolean bl2;
        if (intent != null && !(bl2 = MessagingAnalytics.isDirectBootMessage(intent))) {
            return MessagingAnalytics.shouldUploadScionMetrics(intent.getExtras());
        }
        return false;
    }

    public static boolean shouldUploadScionMetrics(Bundle object) {
        if (object == null) {
            return false;
        }
        object = object.getString("google.c.a.e");
        return "1".equals(object);
    }
}

