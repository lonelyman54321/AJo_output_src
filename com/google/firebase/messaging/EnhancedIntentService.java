/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Intent
 *  android.os.Binder
 *  android.os.IBinder
 *  android.util.Log
 */
package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.EnhancedIntentService$1;
import com.google.firebase.messaging.FcmExecutors;
import com.google.firebase.messaging.WakeLockHolder;
import com.google.firebase.messaging.WithinAppServiceBinder;
import java.util.concurrent.ExecutorService;

public abstract class EnhancedIntentService
extends Service {
    static final long MESSAGE_TIMEOUT_S = 20L;
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    final ExecutorService executor;
    private int lastStartId;
    private final Object lock;
    private int runningTasks;

    public EnhancedIntentService() {
        Object object = FcmExecutors.newIntentHandleExecutor();
        this.executor = object;
        this.lock = object = new Object();
        this.runningTasks = 0;
    }

    public static /* synthetic */ void a(EnhancedIntentService enhancedIntentService, Intent intent, TaskCompletionSource taskCompletionSource) {
        enhancedIntentService.lambda$processIntent$0(intent, taskCompletionSource);
    }

    public static /* synthetic */ Task access$000(EnhancedIntentService enhancedIntentService, Intent intent) {
        return enhancedIntentService.processIntent(intent);
    }

    public static /* synthetic */ void b(EnhancedIntentService enhancedIntentService, Intent intent, Task task2) {
        enhancedIntentService.lambda$onStartCommand$1(intent, task2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void finishTask(Intent object) {
        if (object != null) {
            WakeLockHolder.completeWakefulIntent(object);
        }
        object = this.lock;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        int n3;
                        this.runningTasks = n3 = this.runningTasks + -1;
                        if (n3 != 0) break block4;
                        n3 = this.lastStartId;
                        this.stopSelfResultHook(n3);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    private /* synthetic */ void lambda$onStartCommand$1(Intent intent, Task task2) {
        this.finishTask(intent);
    }

    private /* synthetic */ void lambda$processIntent$0(Intent intent, TaskCompletionSource taskCompletionSource) {
        try {
            this.handleIntent(intent);
            return;
        }
        finally {
            taskCompletionSource.setResult(null);
        }
    }

    private Task processIntent(Intent intent) {
        boolean bl2 = this.handleIntentOnMainThread(intent);
        if (bl2) {
            return Tasks.forResult(null);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ExecutorService executorService = this.executor;
        uz0_0 uz0_02 = new uz0_0(this, intent, taskCompletionSource);
        executorService.execute(uz0_02);
        return taskCompletionSource.getTask();
    }

    public Intent getStartCommandIntent(Intent intent) {
        return intent;
    }

    public abstract void handleIntent(Intent var1);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final IBinder onBind(Intent object) {
        synchronized (this) {
            object = TAG;
            int n3 = 3;
            try {
                Log.isLoggable((String)object, (int)n3);
                object = this.binder;
                if (object != null) return this.binder;
                EnhancedIntentService$1 enhancedIntentService$1 = new EnhancedIntentService$1(this);
                object = new WithinAppServiceBinder(enhancedIntentService$1);
                this.binder = object;
                return this.binder;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int onStartCommand(Intent intent, int n3, int n4) {
        Object object = this.lock;
        synchronized (object) {
            this.lastStartId = n4;
            this.runningTasks = n4 = this.runningTasks + 1;
        }
        object = this.getStartCommandIntent(intent);
        n4 = 2;
        if (object == null) {
            this.finishTask(intent);
            return n4;
        }
        boolean bl2 = ((Task)(object = this.processIntent((Intent)object))).isComplete();
        if (bl2) {
            this.finishTask(intent);
            return n4;
        }
        jl1_0 jl1_02 = new Object();
        tz0_1 tz0_12 = new tz0_1(this, intent);
        ((Task)object).addOnCompleteListener(jl1_02, (OnCompleteListener)tz0_12);
        return 3;
    }

    public boolean stopSelfResultHook(int n3) {
        return this.stopSelfResult(n3);
    }
}

