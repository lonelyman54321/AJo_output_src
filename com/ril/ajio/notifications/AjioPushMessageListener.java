/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.NotificationManager
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Bitmap
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.text.TextUtils
 *  org.json.JSONArray
 *  org.json.JSONException
 */
package com.ril.ajio.notifications;

import ai.haptik.android.wrapper.sdk.HaptikSDK;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.google.firebase.messaging.RemoteMessage$Notification;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.CleverTapEvents;
import com.ril.ajio.data.database.entity.NotificationActions;
import com.ril.ajio.data.database.entity.Notifications;
import com.ril.ajio.launch.DynamicIconChangeWorker;
import com.ril.ajio.launch.activity.SplashScreenActivity;
import com.ril.ajio.notifications.PushNotiForOrderStatus;
import com.ril.ajio.notifications.a;
import com.ril.ajio.services.network.OkHttpClientProvider;
import java.io.File;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;

public class AjioPushMessageListener
extends FirebaseMessagingService {
    public String a;
    public String b;
    public boolean c = false;
    public AJIOApplication d;
    public String e;
    public final HashMap f;
    public Bitmap g;
    public Bitmap h;
    public final g52 i;

    public AjioPushMessageListener() {
        Object object = new HashMap();
        this.f = object;
        this.h = null;
        this.i = object = new g52();
    }

    public final void c(int n3, int n4, String string2, String string3) {
        boolean bl2;
        da$a da$a = new da$a();
        da$a.n = string2;
        da$a.h = bl2 = true;
        da$a.A = bl2;
        da$a.y = string2;
        a a2 = new a(this, n3, n4, string3, string2);
        da$a.w = a2;
        da$a.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(int n3, Bitmap object, String string2) {
        Exception exception2;
        block4: {
            int n4;
            Object object2 = this.f;
            int n7 = 0;
            Object object3 = 0;
            Object v4 = ((HashMap)object2).get(object3);
            if (v4 == null) return;
            n7 = (Integer)(object3 = (Integer)((HashMap)object2).get(object3));
            if (n7 != (n4 = 1)) return;
            object3 = n4;
            if ((object3 = ((HashMap)object2).get(object3)) == null) return;
            object3 = n4;
            n3 = (Integer)(object2 = (Integer)((HashMap)object2).get(object3));
            if (n3 != n4) return;
            try {
                object2 = this.d;
                object3 = "notification";
                object2 = object2.getSystemService((String)object3);
                object2 = (NotificationManager)object2;
                n3 = Build.VERSION.SDK_INT;
                n7 = 26;
                n4 = 0;
                v4 = null;
                if (n3 >= n7) throw null;
                if (object != null) throw null;
                object2 = new U42();
                object = this.h;
                if (object != null) {
                    ((F42)object2).m((Bitmap)object);
                    object = this.b;
                    boolean bl2 = TextUtils.isEmpty((CharSequence)object);
                    if (bl2) throw null;
                    bl2 = TextUtils.isEmpty((CharSequence)string2);
                    if (!bl2) throw null;
                    object = this.b;
                    ((F42)object2).n((CharSequence)object);
                    throw null;
                }
            }
            catch (Exception exception2) {
                break block4;
            }
            n3 = (int)(TextUtils.isEmpty((CharSequence)string2) ? 1 : 0);
            if (n3 != 0) {
                return;
            }
            object2 = new U42();
            object = J42.b(string2);
            ((g42_0)object2).e = object;
            throw null;
        }
        yn3_0.a(exception2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(RemoteMessage remoteMessage, Bundle bundle, Bundle bundle2, Bundle bundle3, Boolean bl2) {
        long l2;
        int n3;
        int n4;
        int n7;
        int n8;
        String string2;
        int n10;
        Object object;
        int n14;
        String string3;
        Object object2;
        ArrayList<Object> arrayList;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        Object object8;
        Object object9;
        Object object10;
        Object object11;
        Object object12;
        AjioPushMessageListener ajioPushMessageListener;
        block45: {
            block39: {
                Object object13;
                ajioPushMessageListener = this;
                object12 = bundle;
                object11 = bundle2;
                object10 = "gamification_identifier";
                object9 = "Info";
                object8 = bundle2.getString((String)object9);
                object7 = "Offer";
                object6 = bundle2.getString((String)object7);
                object5 = "Coupon";
                object4 = bundle2.getString((String)object5);
                object3 = new Notifications();
                arrayList = new ArrayList<Object>();
                object2 = UUID.randomUUID().toString();
                ((Notifications)object3).setId((String)object2);
                object2 = bundle2.keySet();
                if (object2 == null) {
                    return;
                }
                object2 = "nt";
                string3 = bundle2.getString((String)object2);
                n14 = TextUtils.isEmpty((CharSequence)string3);
                if (n14 == 0) {
                    bundle2.remove((String)object2);
                } else if (remoteMessage != null && (object2 = remoteMessage.getNotification()) != null) {
                    object2 = remoteMessage.getNotification();
                    string3 = ((RemoteMessage$Notification)object2).getTitle();
                }
                object2 = "wzrk_st";
                object = object11.getString((String)object2);
                n14 = TextUtils.isEmpty((CharSequence)object);
                if (n14 == 0) {
                    object11.remove((String)object2);
                }
                object2 = "wzrk_nms";
                object = object11.getString((String)object2);
                ajioPushMessageListener.b = object;
                n14 = TextUtils.isEmpty((CharSequence)object);
                if (n14 == 0) {
                    object11.remove((String)object2);
                }
                object2 = "nm";
                object = object11.getString((String)object2);
                ajioPushMessageListener.a = object;
                n14 = TextUtils.isEmpty((CharSequence)object);
                if (n14 == 0) {
                    object11.remove((String)object2);
                } else if (remoteMessage != null && (object2 = remoteMessage.getNotification()) != null) {
                    ajioPushMessageListener.a = object2 = remoteMessage.getNotification().getBody();
                }
                object2 = remoteMessage.getData();
                object = "wzrk_d";
                boolean bl3 = object2.containsKey(object);
                if (!bl3 && !(bl3 = TextUtils.isEmpty((CharSequence)(object2 = ajioPushMessageListener.a)))) {
                    bl3 = false;
                    object2 = null;
                } else {
                    bl3 = true;
                }
                ajioPushMessageListener.c = bl3;
                ((Notifications)object3).setTitle(string3);
                object2 = ajioPushMessageListener.a;
                ((Notifications)object3).setMessage((String)object2);
                object2 = Calendar.getInstance();
                long l3 = ((Calendar)object2).getTimeInMillis();
                ((Notifications)object3).setDate(l3);
                l3 = 5000L;
                ((Notifications)object3).setNotiType(l3);
                ((Notifications)object3).setUnread(1);
                ((Notifications)object3).setOffer((String)object6);
                ((Notifications)object3).setInfo((String)object8);
                bl3 = ajioPushMessageListener.c;
                if (!bl3 && (object2 = bundle3.keySet()) != null) {
                    object2 = AnalyticsManager.getInstance().getCt();
                    object = new AnalyticsData$Builder();
                    object13 = bundle3;
                    object = ((AnalyticsData$Builder)object).bundle(bundle3).build();
                    ((CleverTapEvents)object2).notificationDelivered((AnalyticsData)object);
                }
                object2 = new ArrayList();
                object = object11.getString("ico");
                ((ArrayList)object2).add(object);
                ((Notifications)object3).setIconUrl((String)object);
                object = object11.getString("wzrk_bp");
                n10 = TextUtils.isEmpty((CharSequence)object);
                if (n10 != 0 && (object13 = remoteMessage.getNotification()) != null && (object13 = remoteMessage.getNotification().getImageUrl()) != null) {
                    object = remoteMessage.getNotification().getImageUrl().toString();
                }
                ((ArrayList)object2).add(object);
                n10 = TextUtils.isEmpty((CharSequence)object);
                if (n10 == 0) {
                    ((Notifications)object3).setImgUrl((String)object);
                }
                object = at2_1.a;
                AJIOApplication.Companion.getClass();
                object13 = AJIOApplication$a.a();
                string2 = string3;
                object = new Intent((Context)object13, SplashScreenActivity.class);
                string3 = "wzrk_dl";
                object13 = object11.getString(string3);
                ajioPushMessageListener.e = object13;
                if (object13 != null) {
                    object13 = Uri.parse((String)object13);
                    object.setData((Uri)object13);
                    object11.remove(string3);
                    string3 = ajioPushMessageListener.e;
                    ((Notifications)object3).setDeepLinkUrl(string3);
                } else {
                    string3 = "click_action";
                    object13 = object11.getString(string3);
                    ajioPushMessageListener.e = object13;
                    if (object13 != null) {
                        object13 = Uri.parse((String)object13);
                        object.setData((Uri)object13);
                        object11.remove(string3);
                        string3 = ajioPushMessageListener.e;
                        ((Notifications)object3).setDeepLinkUrl(string3);
                    }
                }
                boolean bl4 = TextUtils.isEmpty((CharSequence)object6);
                if (!bl4) {
                    object12.putString((String)object7, (String)object6);
                    n8 = TextUtils.isEmpty((CharSequence)object4);
                    if (n8 == 0) {
                        object12.putString((String)object5, (String)object4);
                    }
                }
                if ((n8 = TextUtils.isEmpty((CharSequence)object8)) == 0) {
                    object12.putString((String)object9, (String)object8);
                }
                object12 = bundle2.keySet().iterator();
                do {
                    n7 = object12.hasNext();
                    object8 = "orderDetails";
                    if (n7 == 0) break block39;
                } while ((n8 = TextUtils.isEmpty((CharSequence)(object9 = (String)object12.next()))) != 0 || (n7 = ((String)object9).contains((CharSequence)object8)) == 0);
                n7 = 1;
                break block45;
            }
            n7 = 0;
            object9 = null;
        }
        if (n7 != 0) {
            object12 = bundle2.keySet().iterator();
            while ((n8 = object12.hasNext()) != 0) {
                JsonSyntaxException jsonSyntaxException2;
                block43: {
                    NumberFormatException numberFormatException2;
                    block42: {
                        block41: {
                            block40: {
                                object7 = (String)object12.next();
                                boolean bl5 = TextUtils.isEmpty((CharSequence)object7);
                                if (bl5 || !(bl5 = ((String)object7).contains((CharSequence)object8))) continue;
                                object12 = object11.getString((String)object7);
                                if (object12 == null) break;
                                try {
                                    object8 = new Gson();
                                    object7 = PushNotiForOrderStatus.class;
                                    object12 = ((Gson)object8).fromJson((String)object12, (Class)object7);
                                    object12 = (PushNotiForOrderStatus)object12;
                                    object8 = ((PushNotiForOrderStatus)object12).getOrderID();
                                    if (object8 == null) break;
                                    object8 = ((PushNotiForOrderStatus)object12).getUniqueID();
                                    if (object8 == null || (n4 = ((String)(object8 = ((PushNotiForOrderStatus)object12).getUniqueID())).length()) <= 0) break block40;
                                    object8 = new StringBuilder();
                                    object7 = ((PushNotiForOrderStatus)object12).getOrderID();
                                    object7 = ((String)object7).trim();
                                    ((StringBuilder)object8).append((String)object7);
                                    object7 = "_";
                                    ((StringBuilder)object8).append((String)object7);
                                    object7 = ((PushNotiForOrderStatus)object12).getUniqueID();
                                    object7 = ((String)object7).trim();
                                    ((StringBuilder)object8).append((String)object7);
                                    object8 = ((StringBuilder)object8).toString();
                                    ((Notifications)object3).setOrderId((String)object8);
                                    break block41;
                                }
                                catch (NumberFormatException numberFormatException2) {
                                    break block42;
                                }
                                catch (JsonSyntaxException jsonSyntaxException2) {
                                    n4 = 0;
                                    object8 = null;
                                    break block43;
                                }
                            }
                            object8 = ((PushNotiForOrderStatus)object12).getOrderID();
                            ((Notifications)object3).setOrderId((String)object8);
                        }
                        object12 = ((PushNotiForOrderStatus)object12).getOrderStatusCode();
                        ((Notifications)object3).setOrderStatusCode((String)object12);
                        long l4 = 5001L;
                        ((Notifications)object3).setNotiType(l4);
                        break;
                    }
                    object12 = numberFormatException2.getLocalizedMessage();
                    n4 = 0;
                    object8 = null;
                    object7 = new Object[]{};
                    object6 = yn3_0.a;
                    ((yn3$a)object6).a((String)object12, (Object[])object7);
                    break;
                }
                object12 = jsonSyntaxException2.getLocalizedMessage();
                object7 = new Object[]{};
                object8 = yn3_0.a;
                ((yn3$a)object8).a((String)object12, (Object[])object7);
                break;
            }
        }
        object12 = bundle2.keySet();
        object8 = object12.iterator();
        while ((n3 = object8.hasNext()) != 0) {
            NumberFormatException numberFormatException3;
            block44: {
                object12 = (String)object8.next();
                n8 = TextUtils.isEmpty((CharSequence)object12);
                if (n8 != 0) continue;
                object7 = "Action";
                try {
                    n8 = ((String)object12).contains((CharSequence)object7);
                    object6 = "notification";
                    object4 = "deeplinkUrl";
                    string3 = "title";
                    if (n8 != 0) {
                        object7 = "-";
                        n14 = ((String[])(object7 = ((String)object12).split((String)object7))).length;
                        if (n14 <= (n10 = 1)) continue;
                        object7 = object7[n10];
                        object12 = object11.getString((String)object12);
                        object = na_1.Companion;
                        object.getClass();
                        Intrinsics.checkNotNullParameter(object7, string3);
                        Intrinsics.checkNotNullParameter(object12, (String)object4);
                        Intrinsics.checkNotNullParameter(object3, (String)object6);
                        object12 = na$a.a((String)object7, (String)object12, (Notifications)object3);
                        n8 = 5001;
                        ((NotificationActions)object12).setActionType(n8);
                        arrayList.add(object12);
                        continue;
                    }
                }
                catch (NumberFormatException numberFormatException3) {
                    break block44;
                }
                n8 = ((String)object12).contains((CharSequence)object5);
                if (n8 != 0) {
                    object7 = object11.getString((String)object12);
                    object = na_1.Companion;
                    object.getClass();
                    Intrinsics.checkNotNullParameter(object12, string3);
                    Intrinsics.checkNotNullParameter(object7, (String)object4);
                    Intrinsics.checkNotNullParameter(object3, (String)object6);
                    object12 = na$a.a((String)object12, (String)object7, (Notifications)object3);
                    n8 = 5002;
                    ((NotificationActions)object12).setActionType(n8);
                    arrayList.add(object12);
                    continue;
                }
                object7 = "Valid";
                n8 = ((String)object12).contains((CharSequence)object7);
                if (n8 != 0) {
                    object7 = object11.getString((String)object12);
                    object = na_1.Companion;
                    object.getClass();
                    Intrinsics.checkNotNullParameter(object12, string3);
                    Intrinsics.checkNotNullParameter(object7, (String)object4);
                    Intrinsics.checkNotNullParameter(object3, (String)object6);
                    object12 = na$a.a((String)object12, (String)object7, (Notifications)object3);
                    n8 = 5003;
                    ((NotificationActions)object12).setActionType(n8);
                    arrayList.add(object12);
                    continue;
                }
                n3 = ((String)object12).contains((CharSequence)object10);
                if (n3 == 0 || (object12 = object11.getString((String)object10)) == null) continue;
                object7 = "AjioGamification_about_to_expire";
                n8 = (int)(((String)object12).equalsIgnoreCase((String)object7) ? 1 : 0);
                if (n8 != 0) {
                    l2 = 5002L;
                    ((Notifications)object3).setNotiType(l2);
                    continue;
                }
                object7 = "AjioGamification_won";
                n3 = (int)(((String)object12).equalsIgnoreCase((String)object7) ? 1 : 0);
                if (n3 == 0) continue;
                l2 = 5003L;
                ((Notifications)object3).setNotiType(l2);
                continue;
            }
            yn3_0.a(numberFormatException3);
        }
        object12 = ajioPushMessageListener.i;
        object12.getClass();
        Intrinsics.checkNotNullParameter(object3, "notifications");
        Intrinsics.checkNotNullParameter(arrayList, "actionList");
        object11 = z40_0.Companion;
        object11 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object11).a;
        boolean bl6 = ((ao0_0)object11).a("newnotificationCenterEnable");
        object10 = ((Notifications)object3).getMessage();
        n4 = 0;
        object8 = null;
        if (object10 != null && bl6) {
            object11 = e01_0.a;
            object10 = ir0_2.a;
            object7 = new f52_0((Notifications)object3, (g52)object12, arrayList, null);
            n3 = 2;
            Ae3.d((i90_0)object11, (CoroutineContext)object10, null, (Function2)object7, n3);
        }
        if ((n3 = bl2.booleanValue()) != 0) return;
        object12 = ((Notifications)object3).getTitle();
        object11 = ((Notifications)object3).getMessage();
        l2 = ((Notifications)object3).getDate();
        object10 = ajioPushMessageListener.e;
        try {
            object5 = AnalyticsManager.getInstance();
            object5 = ((AnalyticsManager)object5).getCt();
            object4 = new AnalyticsData$Builder();
            object3 = cp_1.Companion;
            object3.getClass();
            object3 = cp$a.e();
            object3.getClass();
            object12 = cp_1.j(l2, (String)object12, (String)object11, (String)object10);
            object12 = ((AnalyticsData$Builder)object4).eventMap((HashMap)object12);
            object12 = ((AnalyticsData$Builder)object12).build();
            ((CleverTapEvents)object5).sendNotificationInfo((AnalyticsData)object12);
        }
        catch (Exception exception) {
            bl6 = false;
            object12 = new Object[]{};
            object11 = yn3_0.a;
            object10 = "Exception while logging event";
            ((yn3$a)object11).a((String)object10, (Object[])object12);
        }
        n3 = n7 != 0 ? 999810 : 899809;
        ajioPushMessageListener.g = null;
        ajioPushMessageListener.h = null;
        object11 = ajioPushMessageListener.f;
        ((HashMap)object11).clear();
        int n15 = 0;
        object10 = null;
        object9 = 0;
        object7 = 0;
        ((HashMap)object11).put(object9, object7);
        n7 = 1;
        object7 = n7;
        object6 = 0;
        ((HashMap)object11).put(object7, object6);
        object7 = (String)((ArrayList)object2).get(0);
        object6 = (String)((ArrayList)object2).get(n7);
        boolean bl7 = TextUtils.isEmpty((CharSequence)object7);
        if (bl7 && (bl7 = TextUtils.isEmpty((CharSequence)object6))) {
            object10 = 0;
            object7 = n7;
            ((HashMap)object11).put(object10, object7);
            object10 = n7;
            object9 = n7;
            ((HashMap)object11).put(object10, object9);
            object11 = ajioPushMessageListener.a;
            ajioPushMessageListener.d(n3, null, (String)object11);
            return;
        }
        n15 = TextUtils.isEmpty((CharSequence)object7);
        if (n15 == 0 && (n15 = TextUtils.isEmpty((CharSequence)object6)) == 0) {
            string3 = string2;
            object10 = null;
            ajioPushMessageListener.c(0, n3, (String)object7, string2);
            n15 = 1;
            ajioPushMessageListener.c(n15, n3, (String)object6, string2);
            return;
        }
        string3 = string2;
        n15 = 1;
        n7 = (int)(TextUtils.isEmpty((CharSequence)object7) ? 1 : 0);
        if (n7 == 0 && (n7 = (int)(TextUtils.isEmpty((CharSequence)object6) ? 1 : 0)) != 0) {
            object9 = n15;
            object10 = n15;
            ((HashMap)object11).put(object9, object10);
            n7 = 0;
            object9 = null;
            ajioPushMessageListener.c(0, n3, (String)object7, string2);
            return;
        }
        n7 = 0;
        object9 = null;
        n4 = (int)(TextUtils.isEmpty((CharSequence)object6) ? 1 : 0);
        if (n4 != 0) return;
        n4 = (int)(TextUtils.isEmpty((CharSequence)object7) ? 1 : 0);
        if (n4 == 0) return;
        object9 = 0;
        object8 = n15;
        ((HashMap)object11).put(object9, object8);
        ajioPushMessageListener.c(n15, n3, (String)object6, string3);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onMessageReceived(RemoteMessage remoteMessage) {
        boolean bl2;
        boolean bl3;
        Object object7;
        Object object8;
        Object object9;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        AjioPushMessageListener ajioPushMessageListener;
        block41: {
            block40: {
                boolean bl4;
                Object object10;
                Object object11;
                Object object12;
                int n3;
                int n4;
                Object object13;
                int n7;
                long l2;
                int n10;
                block36: {
                    block39: {
                        block35: {
                            long l3;
                            long l4;
                            int n8;
                            long l7;
                            long l8;
                            block38: {
                                block37: {
                                    ajioPushMessageListener = this;
                                    object6 = remoteMessage;
                                    n10 = 1;
                                    object5 = null;
                                    try {
                                        object4 = AnalyticsManager.getInstance();
                                        object4 = ((AnalyticsManager)object4).getCt();
                                        object3 = new AnalyticsData$Builder();
                                        object2 = cp_1.Companion;
                                        object2.getClass();
                                        object2 = cp$a.e();
                                        object2.getClass();
                                        object2 = cp_1.s();
                                        object3 = ((AnalyticsData$Builder)object3).eventMap((HashMap)object2);
                                        object3 = ((AnalyticsData$Builder)object3).build();
                                        ((CleverTapEvents)object4).sendNotificationPermissionEvent((AnalyticsData)object3);
                                    }
                                    catch (Exception exception) {
                                        object3 = new StringBuilder("Exception while logging notification permission events");
                                        object4 = exception.getMessage();
                                        ((StringBuilder)object3).append((String)object4);
                                        object4 = ((StringBuilder)object3).toString();
                                        object3 = new Object[]{};
                                        object2 = yn3_0.a;
                                        ((yn3$a)object2).d((String)object4, (Object[])object3);
                                    }
                                    object4 = remoteMessage.getData();
                                    object3 = "af-uinstall-tracking";
                                    boolean n32 = object4.containsKey(object3);
                                    if (n32) {
                                        return;
                                    }
                                    object4 = HaptikSDK.INSTANCE;
                                    object3 = remoteMessage.getData();
                                    boolean bl5 = ((HaptikSDK)object4).isHaptikNotification((Map)object3);
                                    if (bl5) {
                                        object4 = v31.a;
                                        Intrinsics.checkNotNullParameter(object3, "data");
                                        object4 = yn3_0.a;
                                        Object object14 = new Object[]{};
                                        object6 = "checkHaptikNotification";
                                        ((yn3$a)object4).a((String)object6, (Object[])object14);
                                        object4 = z40_0.Companion;
                                        object4 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object4).a;
                                        object14 = "CC_CHAT";
                                        boolean bl6 = ((ao0_0)object4).a((String)object14);
                                        if (!bl6) return;
                                        object14 = AJIOApplication$a.a().getMainLooper();
                                        object4 = new Handler(object14);
                                        object14 = new u31_0(object3, 0);
                                        object4.post((Runnable)object14);
                                        return;
                                    }
                                    na_1.Companion.getClass();
                                    object4 = "format(...)";
                                    AJIOApplication.Companion.getClass();
                                    object = AJIOApplication$a.a();
                                    object2 = new jo_2((Context)object);
                                    object = "NOTIFICATION_TIMESTAMP";
                                    l2 = 0L;
                                    l8 = ((sw_0)object2).getPreference((String)object, l2);
                                    long l14 = l8 == l2 ? 0 : (l8 < l2 ? -1 : 1);
                                    if (l14 <= 0) break block39;
                                    l7 = System.currentTimeMillis();
                                    Object object15 = new SimpleDateFormat("dd");
                                    object9 = "HH";
                                    Serializable serializable = new SimpleDateFormat((String)object9);
                                    try {
                                        object9 = new Date(l8);
                                        object9 = object15.format((Date)object9);
                                        Intrinsics.checkNotNullExpressionValue(object9, (String)object4);
                                        n7 = Integer.parseInt((String)object9);
                                        object13 = new Date(l8);
                                        object13 = serializable.format((Date)object13);
                                        Intrinsics.checkNotNullExpressionValue(object13, (String)object4);
                                        n4 = Integer.parseInt((String)object13);
                                        object8 = new Date(l7);
                                        object8 = object15.format((Date)object8);
                                        Intrinsics.checkNotNullExpressionValue(object8, (String)object4);
                                        n3 = Integer.parseInt((String)object8);
                                        object12 = new Date(l7);
                                        object12 = serializable.format((Date)object12);
                                        Intrinsics.checkNotNullExpressionValue(object12, (String)object4);
                                        n8 = Integer.parseInt((String)object12);
                                        object12 = yn3_0.a;
                                        object11 = "prev date: %s";
                                        Object object16 = n7;
                                        object15 = new Object[n10];
                                        object15[0] = object16;
                                        ((yn3$a)object12).a((String)object11, object15);
                                        object11 = "prev hour: %s";
                                        object16 = n4;
                                        object15 = new Object[n10];
                                        object15[0] = object16;
                                        ((yn3$a)object12).a((String)object11, object15);
                                        object11 = "cur date: %s";
                                        object16 = n3;
                                        object15 = new Object[n10];
                                        object15[0] = object16;
                                        ((yn3$a)object12).a((String)object11, object15);
                                        object11 = "cur hour: %s";
                                        object16 = n8;
                                        object15 = new Object[n10];
                                        object15[0] = object16;
                                        ((yn3$a)object12).a((String)object11, object15);
                                        object11 = z40_0.Companion;
                                        object16 = AJIOApplication$a.a();
                                        object11.getClass();
                                        object11 = z40$a.a((Context)object16);
                                        object11 = ((z40_0)object11).a;
                                        object16 = "notif_freq_hours";
                                        l7 = ((ao0_0)object11).h((String)object16);
                                        object15 = "hour freq: %s";
                                        serializable = Long.valueOf(l7);
                                        object10 = object3;
                                    }
                                    catch (Exception exception) {
                                        object10 = object3;
                                        break block35;
                                    }
                                    try {
                                        long l12;
                                        object3 = new Object[n10];
                                        object3[0] = serializable;
                                        ((yn3$a)object12).a((String)object15, (Object[])object3);
                                        if (n7 != n3 || (l4 = (l12 = l7 - (l8 = 0L)) == 0L ? 0 : (l12 < 0L ? -1 : 1)) <= 0) break block36;
                                        n7 = 6;
                                        if (n4 < n7 || l4 <= 0) break block37;
                                    }
                                    catch (Exception exception) {
                                        break block35;
                                    }
                                    l3 = n4 -= n7;
                                    {
                                        l3 /= l7;
                                        break block38;
                                    }
                                }
                                l3 = l8;
                            }
                            if (n8 >= n7 && l4 > 0) {
                                int n14 = n8 - n7;
                                l2 = n14;
                                {
                                    l2 /= l7;
                                }
                            } else {
                                l2 = l8;
                            }
                            long l15 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
                            if (l15 == false) {
                                return;
                            }
                            break block36;
                        }
                        object3 = yn3_0.a;
                        ((yn3$a)object3).e((Throwable)object4);
                        break block36;
                    }
                    object10 = object3;
                }
                l2 = System.currentTimeMillis();
                ((sw_0)object2).putPreference((String)object, l2);
                AJIOApplication.Companion.getClass();
                ajioPushMessageListener.d = object4 = AJIOApplication$a.a();
                object3 = new Bundle();
                object2 = new Bundle();
                object = new Bundle();
                object4 = remoteMessage.getData();
                int n15 = object4.size();
                if (n15 <= 0) return;
                na_1.Companion.getClass();
                Intrinsics.checkNotNullParameter(object6, "message");
                object4 = remoteMessage.getData();
                object9 = "burst_network_cache";
                object4 = (String)object4.get(object9);
                if (object4 != null && (bl4 = ((String)(object9 = "true")).equalsIgnoreCase((String)object4))) {
                    object4 = OkHttpClientProvider.Companion.getInstance();
                    object9 = AJIOApplication$a.a().getCacheDir();
                    ((OkHttpClientProvider)object4).burstCache((File)object9);
                }
                object4 = remoteMessage.getData().entrySet().iterator();
                while ((n7 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                    object9 = (Map.Entry)object4.next();
                    object13 = (String)object9.getKey();
                    object8 = (String)object9.getValue();
                    object2.putString((String)object13, (String)object8);
                    object13 = (String)object9.getKey();
                    object8 = (String)object9.getValue();
                    object.putString((String)object13, (String)object8);
                    object13 = (String)object9.getKey();
                    object9 = (String)object9.getValue();
                    object3.putString((String)object13, (String)object9);
                }
                object9 = "wzrk_acts";
                boolean bl7 = object2.containsKey((String)object9);
                if (bl7) {
                    try {
                        object4 = object2.getString((String)object9);
                        n4 = (int)(TextUtils.isEmpty((CharSequence)object4) ? 1 : 0);
                        if (n4 == 0) {
                            void var9_23;
                            object13 = new JSONArray((String)object4);
                            boolean bl8 = false;
                            object4 = null;
                            while (var9_23 < (n3 = object13.length())) {
                                object8 = object13.getJSONObject((int)var9_23);
                                object12 = "l";
                                object8 = object8.getString((String)object12);
                                object12 = object13.getJSONObject((int)var9_23);
                                object11 = "dl";
                                object12 = object12.getString((String)object11);
                                object2.putString((String)object8, (String)object12);
                                var9_23 += n10;
                            }
                        }
                    }
                    catch (JSONException jSONException) {
                        yn3_0.a((Exception)((Object)jSONException));
                    }
                    object2.remove((String)object9);
                }
                object4 = com.clevertap.android.sdk.a.i((Bundle)object2);
                boolean bl9 = ((m52_0)object4).a;
                if (!bl9) {
                    object4 = Boolean.FALSE;
                    AjioPushMessageListener ajioPushMessageListener2 = this;
                    object6 = remoteMessage;
                    object5 = object3;
                    object3 = object2;
                    object2 = object;
                    object = object4;
                    this.e(remoteMessage, (Bundle)object5, (Bundle)object3, (Bundle)object2, (Boolean)object4);
                    return;
                }
                object13 = object10;
                object4 = (String)object10.get(object9);
                object9 = "SalesDay";
                if (object4 != null) {
                    object4 = ((String)object4).toLowerCase();
                    object13 = ((String)object9).toLowerCase();
                    n4 = (int)(((String)object4).contains((CharSequence)object13) ? 1 : 0);
                    object8 = "DefaultIcon";
                    object12 = ((String)object8).toLowerCase();
                    boolean bl10 = ((String)object4).contains((CharSequence)object12);
                    if (n4 != 0 || bl10) {
                        object4 = DynamicIconChangeWorker.Companion;
                        object4.getClass();
                        boolean bl11 = DynamicIconChangeWorker.b;
                        if (bl11) return;
                        if (n4 != 0) {
                            AJIOApplication.Companion.getClass();
                            object6 = AJIOApplication$a.a();
                            object4 = new jo_2((Context)object6);
                            mz3_0.b((jo_2)object4, n10 != 0, (String)object9);
                            return;
                        }
                        AJIOApplication.Companion.getClass();
                        object6 = AJIOApplication$a.a();
                        object4 = new jo_2((Context)object6);
                        mz3_0.b((jo_2)object4, n10 != 0, (String)object8);
                        return;
                    }
                }
                object4 = h40_0.a;
                object4 = z40_0.Companion;
                object4 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object4).a;
                object7 = "dynamic_app_icon_config";
                object4 = ((cw)object4).d((String)object7);
                object13 = "master";
                boolean bl12 = object4.optBoolean((String)object13);
                object8 = "";
                if (!bl12) break block40;
                object4 = z40$a.a((Context)AJIOApplication$a.a()).a.d((String)object7);
                boolean bl13 = object4.optBoolean((String)object13);
                if (bl13) {
                    object4 = z40$a.a((Context)AJIOApplication$a.a()).a.d((String)object7);
                    object7 = "eventDescription";
                    object4 = object4.optJSONObject((String)object7);
                } else {
                    boolean bl14 = false;
                    object4 = null;
                }
                if (object4 != null && (object4 = object4.optString((String)(object7 = "eventName"))) != null) break block41;
            }
            object4 = object8;
        }
        if (bl3 = ((String)object4).equalsIgnoreCase((String)object9)) {
            object8 = "https://assets.ajio.com/cms/AJIO/MOBILE/ic_adaptive_launcher_all_stars_round_color.png";
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)object8))) {
            object4 = remoteMessage.getData();
            object7 = "ico";
            object4.put(object7, object8);
        }
        object4 = new lh_1();
        object7 = ajioPushMessageListener.d;
        ((lh_1)object4).a((Context)object7, (RemoteMessage)object6);
        try {
            object4 = AnalyticsManager.getInstance();
            object4 = ((AnalyticsManager)object4).getCt();
            object7 = new AnalyticsData$Builder();
            object9 = cp_1.Companion;
            object9.getClass();
            object9 = cp$a.e();
            object9.getClass();
            object9 = cp_1.h((Bundle)object2);
            object7 = ((AnalyticsData$Builder)object7).eventMap((HashMap)object9);
            object7 = ((AnalyticsData$Builder)object7).build();
            ((CleverTapEvents)object4).sendNotificationInfo((AnalyticsData)object7);
        }
        catch (Exception exception) {
            object4 = new Object[]{};
            object7 = yn3_0.a;
            object5 = "Exception while logging event";
            ((yn3$a)object7).a((String)object5, (Object[])object4);
        }
        object4 = Boolean.TRUE;
        object7 = this;
        object6 = remoteMessage;
        object5 = object3;
        object3 = object2;
        object2 = object;
        object = object4;
        this.e(remoteMessage, (Bundle)object5, (Bundle)object3, (Bundle)object2, (Boolean)object4);
    }

    public final void onNewToken(String string2) {
        XB2$a xB2$a;
        Object object = com.clevertap.android.sdk.a.g((Context)this);
        if (object != null) {
            object = ((com.clevertap.android.sdk.a)object).b.p;
            xB2$a = XB2$a.FCM;
            ((hC2)object).e(string2, xB2$a);
        }
        HaptikSDK.INSTANCE.setNotificationToken((Context)this, string2);
        object = AppsFlyerLib.getInstance();
        xB2$a = this.getApplicationContext();
        ((AppsFlyerLib)object).updateServerUninstallToken((Context)xB2$a, string2);
    }
}

