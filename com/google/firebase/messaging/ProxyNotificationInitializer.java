/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.NotificationManager
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Binder
 *  android.util.Log
 */
package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.ProxyNotificationPreferences;
import com.google.firebase.messaging.i;
import java.util.concurrent.Executor;

final class ProxyNotificationInitializer {
    private static final String MANIFEST_METADATA_NOTIFICATION_DELEGATION_ENABLED = "firebase_messaging_notification_delegation_enabled";

    private ProxyNotificationInitializer() {
    }

    public static /* synthetic */ void a(Context context, boolean bl2, TaskCompletionSource taskCompletionSource) {
        ProxyNotificationInitializer.lambda$setEnableProxyNotification$0(context, bl2, taskCompletionSource);
    }

    private static boolean allowedToUse(Context context) {
        int n3 = Binder.getCallingUid();
        context = context.getApplicationInfo();
        int n4 = context.uid;
        if (n3 == n4) {
            n4 = 1;
        } else {
            n4 = 0;
            context = null;
        }
        return n4 != 0;
    }

    public static void initialize(Context context) {
        boolean bl2 = ProxyNotificationPreferences.isProxyNotificationInitialized(context);
        if (bl2) {
            return;
        }
        jl1_0 jl1_02 = new Object();
        boolean bl3 = ProxyNotificationInitializer.shouldEnableProxyNotification(context);
        ProxyNotificationInitializer.setEnableProxyNotification(jl1_02, context, bl3);
    }

    public static boolean isProxyNotificationEnabled(Context object) {
        boolean bl2 = PlatformVersion.isAtLeastQ();
        int n3 = 3;
        String string2 = "FirebaseMessaging";
        if (!bl2) {
            Log.isLoggable((String)string2, (int)n3);
            return false;
        }
        bl2 = ProxyNotificationInitializer.allowedToUse(object);
        if (!bl2) {
            object.getPackageName();
            return false;
        }
        String string3 = "com.google.android.gms";
        boolean bl3 = string3.equals(object = pb2_0.a((NotificationManager)el3_1.a(object)));
        if (bl3) {
            Log.isLoggable((String)string2, (int)n3);
            return true;
        }
        return false;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ void lambda$setEnableProxyNotification$0(Context object, boolean bl2, TaskCompletionSource taskCompletionSource) {
        Throwable throwable2;
        block7: {
            boolean bl3;
            block6: {
                try {
                    bl3 = ProxyNotificationInitializer.allowedToUse(object);
                    if (bl3) break block6;
                    object.getPackageName();
                    taskCompletionSource.trySetResult(null);
                    return;
                }
                catch (Throwable throwable2) {
                    break block7;
                }
            }
            bl3 = true;
            {
                ProxyNotificationPreferences.setProxyNotificationsInitialized(object, bl3);
                object = el3_1.a(object);
                object = (NotificationManager)object;
                String string2 = "com.google.android.gms";
                if (bl2) {
                    QB2.a((NotificationManager)object);
                } else {
                    String string3 = pb2_0.a((NotificationManager)object);
                    bl2 = string2.equals(string3);
                    if (bl2) {
                        Ek0.a((NotificationManager)object);
                    }
                }
                taskCompletionSource.trySetResult(null);
            }
            return;
        }
        taskCompletionSource.trySetResult(null);
        throw throwable2;
    }

    public static Task setEnableProxyNotification(Executor executor, Context context, boolean bl2) {
        boolean bl3 = PlatformVersion.isAtLeastQ();
        if (!bl3) {
            return Tasks.forResult(null);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        i i3 = new i(context, bl2, taskCompletionSource);
        executor.execute(i3);
        return taskCompletionSource.getTask();
    }

    private static boolean shouldEnableProxyNotification(Context object) {
        block9: {
            String string2 = MANIFEST_METADATA_NOTIFICATION_DELEGATION_ENABLED;
            try {
                object = object.getApplicationContext();
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {}
            PackageManager packageManager = object.getPackageManager();
            if (packageManager == null) break block9;
            object = object.getPackageName();
            int n3 = 128;
            object = packageManager.getApplicationInfo((String)object, n3);
            if (object == null) break block9;
            packageManager = object.metaData;
            if (packageManager == null) break block9;
            boolean bl2 = packageManager.containsKey(string2);
            if (!bl2) break block9;
            object = object.metaData;
            return object.getBoolean(string2);
        }
        return true;
    }
}

