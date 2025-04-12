/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.util.Base64
 *  android.util.Log
 */
package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.WakeLockHolder;
import com.google.firebase.messaging.WithinAppServiceConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class FcmBroadcastProcessor {
    private static final String EXTRA_BINARY_DATA = "rawData";
    private static final String EXTRA_BINARY_DATA_BASE_64 = "gcm.rawData64";
    private static WithinAppServiceConnection fcmServiceConn;
    private static final Object lock;
    private final Context context;
    private final Executor executor;

    static {
        Object object;
        lock = object = new Object();
    }

    public FcmBroadcastProcessor(Context object) {
        this.context = object;
        this.executor = object;
    }

    public FcmBroadcastProcessor(Context context, ExecutorService executorService) {
        this.context = context;
        this.executor = executorService;
    }

    public static /* synthetic */ Task a(Context context, Intent intent, boolean bl2, Task task2) {
        return FcmBroadcastProcessor.lambda$startMessagingService$2(context, intent, bl2, task2);
    }

    public static /* synthetic */ Integer b(Context context, Intent intent) {
        return FcmBroadcastProcessor.lambda$startMessagingService$0(context, intent);
    }

    private static Task bindToMessagingService(Context object, Intent object2, boolean bl2) {
        int n3 = 3;
        Log.isLoggable((String)"FirebaseMessaging", (int)n3);
        WithinAppServiceConnection withinAppServiceConnection = FcmBroadcastProcessor.getServiceConnection((Context)object, "com.google.firebase.MESSAGING_EVENT");
        if (bl2) {
            ServiceStarter serviceStarter = ServiceStarter.getInstance();
            bl2 = serviceStarter.hasWakeLockPermission((Context)object);
            if (bl2) {
                WakeLockHolder.sendWakefulServiceIntent((Context)object, withinAppServiceConnection, object2);
            } else {
                withinAppServiceConnection.sendIntent((Intent)object2);
            }
            return Tasks.forResult(-1);
        }
        object = withinAppServiceConnection.sendIntent((Intent)object2);
        object2 = new Object();
        ej0_1 ej0_12 = new Object();
        return ((Task)object).continueWith((Executor)object2, ej0_12);
    }

    public static /* synthetic */ Integer c(Task task2) {
        return FcmBroadcastProcessor.lambda$bindToMessagingService$3(task2);
    }

    public static /* synthetic */ Integer d(Task task2) {
        return FcmBroadcastProcessor.lambda$startMessagingService$1(task2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static WithinAppServiceConnection getServiceConnection(Context object, String string2) {
        Object object2 = lock;
        synchronized (object2) {
            try {
                WithinAppServiceConnection withinAppServiceConnection = fcmServiceConn;
                if (withinAppServiceConnection != null) return fcmServiceConn;
                fcmServiceConn = withinAppServiceConnection = new WithinAppServiceConnection((Context)object, string2);
                return fcmServiceConn;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private static /* synthetic */ Integer lambda$bindToMessagingService$3(Task task2) {
        return -1;
    }

    private static /* synthetic */ Integer lambda$startMessagingService$0(Context context, Intent intent) {
        return ServiceStarter.getInstance().startMessagingService(context, intent);
    }

    private static /* synthetic */ Integer lambda$startMessagingService$1(Task task2) {
        return 403;
    }

    private static /* synthetic */ Task lambda$startMessagingService$2(Context object, Intent object2, boolean bl2, Task task2) {
        int n3;
        Integer n4;
        int n7 = PlatformVersion.isAtLeastO();
        if (n7 != 0 && (n7 = (n4 = (Integer)task2.getResult()).intValue()) == (n3 = 402)) {
            object = FcmBroadcastProcessor.bindToMessagingService((Context)object, object2, bl2);
            object2 = new Object();
            bJ0 bJ02 = new Object();
            return ((Task)object).continueWith((Executor)object2, bJ02);
        }
        return task2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void reset() {
        Object object = lock;
        synchronized (object) {
            Object var1_1 = null;
            fcmServiceConn = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void setServiceConnection(WithinAppServiceConnection withinAppServiceConnection) {
        Object object = lock;
        synchronized (object) {
            fcmServiceConn = withinAppServiceConnection;
            return;
        }
    }

    public Task process(Intent intent) {
        String string2 = EXTRA_BINARY_DATA_BASE_64;
        Object object = intent.getStringExtra(string2);
        if (object != null) {
            object = Base64.decode((String)object, (int)0);
            String string3 = EXTRA_BINARY_DATA;
            intent.putExtra(string3, (byte[])object);
            intent.removeExtra(string2);
        }
        string2 = this.context;
        return this.startMessagingService((Context)string2, intent);
    }

    /*
     * Unable to fully structure code
     */
    public Task startMessagingService(Context var1_1, Intent var2_2) {
        var3_3 = PlatformVersion.isAtLeastO();
        var4_4 = false;
        if (var3_3 == 0) ** GOTO lbl-1000
        var5_5 = var1_1.getApplicationInfo();
        var3_3 = var5_5.targetSdkVersion;
        var6_6 = 26;
        if (var3_3 >= var6_6) {
            var3_3 = 1;
        } else lbl-1000:
        // 2 sources

        {
            var3_3 = 0;
            var5_5 = null;
        }
        var6_6 = var2_2.getFlags();
        var7_7 = 0x10000000;
        if ((var6_6 &= var7_7) != 0) {
            var4_4 = true;
        }
        if (var3_3 != 0 && !var4_4) {
            return FcmBroadcastProcessor.bindToMessagingService(var1_1, var2_2, var4_4);
        }
        var5_5 = this.executor;
        var8_8 = new cj0_1(var1_1, var2_2);
        var5_5 = Tasks.call((Executor)var5_5, (Callable)var8_8);
        var8_8 = this.executor;
        var9_9 = new dj0_1(var1_1, var2_2, var4_4);
        return var5_5.continueWithTask((Executor)var8_8, var9_9);
    }
}

