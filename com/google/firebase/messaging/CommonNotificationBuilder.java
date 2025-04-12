/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.NotificationChannel
 *  android.app.NotificationManager
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.graphics.Color
 *  android.graphics.drawable.Drawable
 *  android.media.RingtoneManager
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.os.SystemClock
 *  android.text.TextUtils
 */
package com.google.firebase.messaging;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.firebase.messaging.CommonNotificationBuilder$DisplayNotificationInfo;
import com.google.firebase.messaging.NotificationParams;
import java.util.concurrent.atomic.AtomicInteger;

public final class CommonNotificationBuilder {
    private static final String ACTION_RECEIVER = "com.google.android.c2dm.intent.RECEIVE";
    public static final String FCM_FALLBACK_NOTIFICATION_CHANNEL = "fcm_fallback_notification_channel";
    public static final String FCM_FALLBACK_NOTIFICATION_CHANNEL_LABEL = "fcm_fallback_notification_channel_label";
    private static final String FCM_FALLBACK_NOTIFICATION_CHANNEL_NAME_NO_RESOURCE = "Misc";
    private static final int ILLEGAL_RESOURCE_ID = 0;
    public static final String METADATA_DEFAULT_CHANNEL_ID = "com.google.firebase.messaging.default_notification_channel_id";
    public static final String METADATA_DEFAULT_COLOR = "com.google.firebase.messaging.default_notification_color";
    public static final String METADATA_DEFAULT_ICON = "com.google.firebase.messaging.default_notification_icon";
    private static final AtomicInteger requestCodeProvider;

    static {
        AtomicInteger atomicInteger;
        int n3 = (int)SystemClock.elapsedRealtime();
        requestCodeProvider = atomicInteger = new AtomicInteger(n3);
    }

    private CommonNotificationBuilder() {
    }

    private static PendingIntent createContentIntent(Context context, NotificationParams notificationParams, String string2, PackageManager object) {
        if ((string2 = CommonNotificationBuilder.createTargetIntent(string2, notificationParams, object)) == null) {
            return null;
        }
        string2.addFlags(0x4000000);
        object = notificationParams.paramsWithReservedKeysRemoved();
        string2.putExtras((Bundle)object);
        int n3 = CommonNotificationBuilder.shouldUploadMetrics(notificationParams);
        if (n3 != 0) {
            object = "gcm.n.analytics_data";
            notificationParams = notificationParams.paramsForAnalyticsIntent();
            string2.putExtra((String)object, (Bundle)notificationParams);
        }
        int n4 = CommonNotificationBuilder.generatePendingIntentRequestCode();
        n3 = CommonNotificationBuilder.getPendingIntentFlags(0x40000000);
        return PendingIntent.getActivity((Context)context, (int)n4, (Intent)string2, (int)n3);
    }

    private static PendingIntent createDeleteIntent(Context context, Context context2, NotificationParams notificationParams) {
        boolean bl2 = CommonNotificationBuilder.shouldUploadMetrics(notificationParams);
        if (!bl2) {
            return null;
        }
        Intent intent = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS");
        notificationParams = notificationParams.paramsForAnalyticsIntent();
        notificationParams = intent.putExtras((Bundle)notificationParams);
        return CommonNotificationBuilder.createMessagingPendingIntent(context, context2, (Intent)notificationParams);
    }

    private static PendingIntent createMessagingPendingIntent(Context context, Context object, Intent intent) {
        int n3 = CommonNotificationBuilder.generatePendingIntentRequestCode();
        Intent intent2 = new Intent(ACTION_RECEIVER);
        object = object.getPackageName();
        object = intent2.setPackage((String)object).putExtra("wrapped_intent", (Parcelable)intent);
        int n4 = CommonNotificationBuilder.getPendingIntentFlags(0x40000000);
        return PendingIntent.getBroadcast((Context)context, (int)n3, (Intent)object, (int)n4);
    }

    public static CommonNotificationBuilder$DisplayNotificationInfo createNotificationInfo(Context object, Context object2, NotificationParams notificationParams, String charSequence, Bundle bundle) {
        Object object3;
        Object object4;
        String string2 = object2.getPackageName();
        Resources resources = object2.getResources();
        PackageManager packageManager = object2.getPackageManager();
        J42 j42 = new J42((Context)object2, (String)charSequence);
        charSequence = notificationParams.getPossiblyLocalizedString(resources, string2, "gcm.n.title");
        boolean bl2 = TextUtils.isEmpty((CharSequence)charSequence);
        if (!bl2) {
            charSequence = J42.b(charSequence);
            j42.e = charSequence;
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)(charSequence = notificationParams.getPossiblyLocalizedString(resources, string2, "gcm.n.body"))))) {
            object4 = J42.b(charSequence);
            j42.f = object4;
            object4 = new U42();
            charSequence = J42.b(charSequence);
            ((g42_0)object4).e = charSequence;
            j42.g((U42)object4);
        }
        charSequence = notificationParams.getString("gcm.n.icon");
        int n3 = CommonNotificationBuilder.getSmallIcon(packageManager, resources, string2, charSequence, bundle);
        object4 = j42.P;
        ((Notification)object4).icon = n3;
        charSequence = CommonNotificationBuilder.getSound(string2, notificationParams, resources);
        if (charSequence != null) {
            j42.f((Uri)charSequence);
        }
        charSequence = CommonNotificationBuilder.createContentIntent(object, notificationParams, string2, packageManager);
        j42.g = charSequence;
        if ((object = CommonNotificationBuilder.createDeleteIntent(object, object2, notificationParams)) != null) {
            charSequence = j42.P;
            ((Notification)charSequence).deleteIntent = object;
        }
        object = notificationParams.getString("gcm.n.color");
        if ((object = CommonNotificationBuilder.getColor(object2, (String)object, bundle)) != null) {
            j42.D = object3 = object.intValue();
        }
        object3 = notificationParams.getBoolean("gcm.n.sticky");
        int n4 = 1;
        n3 = 16;
        j42.d(n3, (boolean)(object3 ^= n4));
        j42.y = object3 = notificationParams.getBoolean("gcm.n.local_only");
        object = notificationParams.getString("gcm.n.ticker");
        if (object != null) {
            charSequence = j42.P;
            object = J42.b((CharSequence)object);
            ((Notification)charSequence).tickerText = object;
        }
        if ((object = notificationParams.getNotificationPriority()) != null) {
            j42.l = object3 = object.intValue();
        }
        if ((object = notificationParams.getVisibility()) != null) {
            j42.E = object3 = object.intValue();
        }
        if ((object = notificationParams.getNotificationCount()) != null) {
            j42.k = object3 = object.intValue();
        }
        if ((object = notificationParams.getLong("gcm.n.event_time")) != null) {
            j42.m = n4;
            long l2 = object.longValue();
            object = j42.P;
            object.when = l2;
        }
        if ((object = (Object)notificationParams.getVibrateTimings()) != null) {
            charSequence = j42.P;
            ((Notification)charSequence).vibrate = (long[])object;
        }
        object = notificationParams.getLightSettings();
        n3 = 0;
        charSequence = null;
        if (object != null) {
            Context context = object[0];
            Context context2 = object[n4];
            int n7 = 2;
            object3 = object[n7];
            resources = j42.P;
            resources.ledARGB = (int)context;
            resources.ledOnMS = (int)context2;
            resources.ledOffMS = object3;
            if (context2 == false || object3 == 0) {
                n4 = 0;
                object2 = null;
            }
            resources.flags = object3 = resources.flags & 0xFFFFFFFE | n4;
        }
        object3 = CommonNotificationBuilder.getConsolidatedDefaults(notificationParams);
        j42.c((int)object3);
        object2 = CommonNotificationBuilder.getTag(notificationParams);
        object = new CommonNotificationBuilder$DisplayNotificationInfo(j42, (String)object2, 0);
        return object;
    }

    public static CommonNotificationBuilder$DisplayNotificationInfo createNotificationInfo(Context context, NotificationParams notificationParams) {
        PackageManager packageManager = context.getPackageManager();
        String string2 = context.getPackageName();
        packageManager = CommonNotificationBuilder.getManifestMetadata(packageManager, string2);
        string2 = notificationParams.getNotificationChannelId();
        string2 = CommonNotificationBuilder.getOrCreateChannel(context, string2, (Bundle)packageManager);
        return CommonNotificationBuilder.createNotificationInfo(context, context, notificationParams, string2, (Bundle)packageManager);
    }

    private static Intent createTargetIntent(String string2, NotificationParams notificationParams, PackageManager packageManager) {
        String string3 = notificationParams.getString("gcm.n.click_action");
        boolean bl2 = TextUtils.isEmpty((CharSequence)string3);
        if (!bl2) {
            notificationParams = new Intent(string3);
            notificationParams.setPackage(string2);
            notificationParams.setFlags(0x10000000);
            return notificationParams;
        }
        if ((notificationParams = notificationParams.getLink()) != null) {
            packageManager = new Intent("android.intent.action.VIEW");
            packageManager.setPackage(string2);
            packageManager.setData((Uri)notificationParams);
            return packageManager;
        }
        return packageManager.getLaunchIntentForPackage(string2);
    }

    private static int generatePendingIntentRequestCode() {
        return requestCodeProvider.incrementAndGet();
    }

    private static Integer getColor(Context context, String string2, Bundle bundle) {
        int n3;
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            try {
                n3 = Color.parseColor((String)string2);
            }
            catch (IllegalArgumentException illegalArgumentException) {}
            return n3;
        }
        string2 = METADATA_DEFAULT_COLOR;
        bl2 = false;
        n3 = bundle.getInt(string2, 0);
        if (n3 != 0) {
            int n4;
            try {
                n4 = t70.getColor(context, n3);
            }
            catch (Resources.NotFoundException notFoundException) {}
            return n4;
        }
        return null;
    }

    private static int getConsolidatedDefaults(NotificationParams notificationParams) {
        int n3;
        boolean bl2;
        int n4;
        String string2 = "gcm.n.default_sound";
        int n32 = notificationParams.getBoolean(string2);
        String string3 = "gcm.n.default_vibrate_timings";
        boolean bl3 = notificationParams.getBoolean(string3);
        if (bl3) {
            n4 = n32 | 2;
        }
        if (bl2 = notificationParams.getBoolean(string3 = "gcm.n.default_light_settings")) {
            n3 = n4 | 4;
        }
        return n3;
    }

    private static Bundle getManifestMetadata(PackageManager packageManager, String string2) {
        block4: {
            int n3 = 128;
            packageManager = packageManager.getApplicationInfo(string2, n3);
            if (packageManager == null) break block4;
            try {
                packageManager = packageManager.metaData;
                if (packageManager != null) {
                    return packageManager;
                }
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                ((Object)((Object)nameNotFoundException)).toString();
            }
        }
        return Bundle.EMPTY;
    }

    public static String getOrCreateChannel(Context object, String string2, Bundle object2) {
        PackageManager packageManager;
        Object object3;
        boolean bl2;
        block9: {
            int n3 = Build.VERSION.SDK_INT;
            bl2 = false;
            object3 = null;
            int n4 = 26;
            if (n3 < n4) {
                return null;
            }
            try {
                packageManager = object.getPackageManager();
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                return null;
            }
            String string3 = object.getPackageName();
            packageManager = packageManager.getApplicationInfo(string3, 0);
            n3 = packageManager.targetSdkVersion;
            if (n3 >= n4) break block9;
            return null;
        }
        packageManager = (NotificationManager)el3_1.a(object);
        bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2 && (object3 = v42_0.a((NotificationManager)packageManager, string2)) != null) {
            return string2;
        }
        string2 = object2.getString(METADATA_DEFAULT_CHANNEL_ID);
        boolean bl3 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl3 && (object2 = v42_0.a((NotificationManager)packageManager, string2)) != null) {
            return string2;
        }
        string2 = oi_0.a((NotificationManager)packageManager);
        if (string2 == null) {
            String string4;
            string2 = object.getResources();
            int n7 = string2.getIdentifier((String)(object3 = FCM_FALLBACK_NOTIFICATION_CHANNEL_LABEL), string4 = "string", (String)(object2 = object.getPackageName()));
            object = n7 == 0 ? FCM_FALLBACK_NOTIFICATION_CHANNEL_NAME_NO_RESOURCE : object.getString(n7);
            object = ni_1.a((String)object);
            x31.a((NotificationManager)packageManager, (NotificationChannel)object);
        }
        return FCM_FALLBACK_NOTIFICATION_CHANNEL;
    }

    private static int getPendingIntentFlags(int n3) {
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 23;
        if (n4 >= n7) {
            n4 = 0x4000000;
            n3 |= n4;
        }
        return n3;
    }

    private static int getSmallIcon(PackageManager packageManager, Resources resources, String string2, String string3, Bundle bundle) {
        boolean bl2;
        boolean bl3;
        int n3;
        String string4;
        int n4 = TextUtils.isEmpty((CharSequence)string3);
        if (n4 == 0) {
            boolean bl4;
            string4 = "drawable";
            n4 = resources.getIdentifier(string3, string4, string2);
            if (n4 != 0 && (bl4 = CommonNotificationBuilder.isValidIcon(resources, n4))) {
                return n4;
            }
            string4 = "mipmap";
            n3 = resources.getIdentifier(string3, string4, string2);
            if (n3 != 0 && (n4 = (int)(CommonNotificationBuilder.isValidIcon(resources, n3) ? 1 : 0)) != 0) {
                return n3;
            }
        }
        string3 = METADATA_DEFAULT_ICON;
        n4 = 0;
        string4 = null;
        n3 = bundle.getInt(string3, 0);
        if (n3 == 0 || !(bl3 = CommonNotificationBuilder.isValidIcon(resources, n3))) {
            packageManager = packageManager.getApplicationInfo(string2, 0);
            try {
                n3 = packageManager.icon;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                ((Object)((Object)nameNotFoundException)).toString();
            }
        }
        if (n3 == 0 || !(bl2 = CommonNotificationBuilder.isValidIcon(resources, n3))) {
            n3 = 17301651;
        }
        return n3;
    }

    private static Uri getSound(String string2, NotificationParams object, Resources object2) {
        int n3;
        boolean bl2 = TextUtils.isEmpty((CharSequence)(object = ((NotificationParams)object).getSoundResourceName()));
        if (bl2) {
            return null;
        }
        String string3 = "default";
        bl2 = string3.equals(object);
        if (!bl2 && (n3 = object2.getIdentifier((String)object, string3 = "raw", string2)) != 0) {
            object2 = new StringBuilder("android.resource://");
            ((StringBuilder)object2).append(string2);
            ((StringBuilder)object2).append("/raw/");
            ((StringBuilder)object2).append((String)object);
            return Uri.parse((String)((StringBuilder)object2).toString());
        }
        return RingtoneManager.getDefaultUri((int)2);
    }

    private static String getTag(NotificationParams object) {
        String string2 = "gcm.n.tag";
        boolean bl2 = TextUtils.isEmpty((CharSequence)(object = ((NotificationParams)object).getString(string2)));
        if (!bl2) {
            return object;
        }
        object = new StringBuilder("FCM-Notification:");
        long l2 = SystemClock.uptimeMillis();
        ((StringBuilder)object).append(l2);
        return ((StringBuilder)object).toString();
    }

    private static boolean isValidIcon(Resources resources, int n3) {
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 26;
        boolean bl2 = true;
        if (n4 != n7) {
            return bl2;
        }
        n4 = 0;
        n7 = 0;
        try {
            resources = resources.getDrawable(n3, null);
        }
        catch (Resources.NotFoundException notFoundException) {
            return false;
        }
        boolean bl3 = h00.b((Drawable)resources);
        if (bl3) {
            return false;
        }
        return bl2;
    }

    public static boolean shouldUploadMetrics(NotificationParams notificationParams) {
        return notificationParams.getBoolean("google.c.a.e");
    }
}

