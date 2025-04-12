/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 */
package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.GmsRpc;
import com.google.firebase.messaging.j;
import java.util.concurrent.Executor;

final class ProxyNotificationPreferences {
    private static final String FCM_PREFERENCES = "com.google.firebase.messaging";

    private ProxyNotificationPreferences() {
    }

    public static /* synthetic */ void a(Context context, boolean bl2, Void void_) {
        ProxyNotificationPreferences.setProxyRetentionPreferences(context, bl2);
    }

    private static SharedPreferences getPreference(Context context) {
        Context context2 = context.getApplicationContext();
        if (context2 != null) {
            context = context2;
        }
        return context.getSharedPreferences(FCM_PREFERENCES, 0);
    }

    public static boolean isProxyNotificationInitialized(Context context) {
        return ProxyNotificationPreferences.getPreference(context).getBoolean("proxy_notification_initialized", false);
    }

    public static boolean isProxyNotificationRetentionSet(SharedPreferences sharedPreferences2, boolean bl2) {
        boolean bl3;
        String string2 = "proxy_retention";
        boolean bl4 = sharedPreferences2.contains(string2);
        boolean bl5 = false;
        if (bl4 && (bl3 = sharedPreferences2.getBoolean(string2, false)) == bl2) {
            bl5 = true;
        }
        return bl5;
    }

    public static void setProxyNotificationsInitialized(Context context, boolean bl2) {
        context = ProxyNotificationPreferences.getPreference(context).edit();
        context.putBoolean("proxy_notification_initialized", bl2);
        context.apply();
    }

    public static void setProxyRetention(Context context, GmsRpc object, boolean bl2) {
        boolean bl3 = PlatformVersion.isAtLeastQ();
        if (!bl3) {
            return;
        }
        Object object2 = ProxyNotificationPreferences.getPreference(context);
        bl3 = ProxyNotificationPreferences.isProxyNotificationRetentionSet(object2, bl2);
        if (!bl3) {
            object = ((GmsRpc)object).setRetainProxiedNotifications(bl2);
            object2 = new Object();
            j j3 = new j(context, bl2);
            ((Task)object).addOnSuccessListener((Executor)object2, (OnSuccessListener)j3);
        }
    }

    public static void setProxyRetentionPreferences(Context context, boolean bl2) {
        context = ProxyNotificationPreferences.getPreference(context).edit();
        context.putBoolean("proxy_retention", bl2);
        context.apply();
    }
}

