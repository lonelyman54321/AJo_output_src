/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.IBinder
 *  android.util.Log
 */
package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.WithinAppServiceBinder;
import com.google.firebase.messaging.WithinAppServiceConnection$BindRequest;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class WithinAppServiceConnection
implements ServiceConnection {
    private WithinAppServiceBinder binder;
    private boolean connectionInProgress;
    private final Intent connectionIntent;
    private final Context context;
    private final Queue intentQueue;
    private final ScheduledExecutorService scheduledExecutorService;

    public WithinAppServiceConnection(Context context, String string2) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = WithinAppServiceConnection.createScheduledThreadPoolExecutor();
        this(context, string2, scheduledThreadPoolExecutor);
    }

    public WithinAppServiceConnection(Context object, String string2, ScheduledExecutorService scheduledExecutorService) {
        Intent intent;
        this.intentQueue = intent = new ArrayDeque();
        this.connectionInProgress = false;
        this.context = object = object.getApplicationContext();
        intent = new Intent(string2);
        object = object.getPackageName();
        object = intent.setPackage((String)object);
        this.connectionIntent = object;
        this.scheduledExecutorService = scheduledExecutorService;
    }

    private static ScheduledThreadPoolExecutor createScheduledThreadPoolExecutor() {
        boolean bl2 = true;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor((int)(bl2 ? 1 : 0));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        scheduledThreadPoolExecutor.setKeepAliveTime(40, timeUnit);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(bl2);
        return scheduledThreadPoolExecutor;
    }

    private void finishAllInQueue() {
        Object object;
        boolean bl2;
        while (!(bl2 = (object = this.intentQueue).isEmpty())) {
            object = (WithinAppServiceConnection$BindRequest)this.intentQueue.poll();
            ((WithinAppServiceConnection$BindRequest)object).finish();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void flushQueue() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Object object = "FirebaseMessaging";
                int n3 = 3;
                try {
                    Log.isLoggable((String)object, (int)n3);
                    while (true) {
                        boolean bl2;
                        if (bl2 = (object = this.intentQueue).isEmpty()) {
                            return;
                        }
                        object = "FirebaseMessaging";
                        Log.isLoggable((String)object, (int)n3);
                        object = this.binder;
                        if (object != null && (bl2 = object.isBinderAlive())) {
                            object = "FirebaseMessaging";
                            Log.isLoggable((String)object, (int)n3);
                            object = this.intentQueue;
                            object = object.poll();
                            object = (WithinAppServiceConnection$BindRequest)object;
                            WithinAppServiceBinder withinAppServiceBinder = this.binder;
                            withinAppServiceBinder.send((WithinAppServiceConnection$BindRequest)object);
                            continue;
                        }
                        break;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                this.startConnectionIfNeeded();
                return;
            }
            throw throwable2;
        }
    }

    private void startConnectionIfNeeded() {
        Object object = "FirebaseMessaging";
        int n3 = 3;
        Log.isLoggable((String)object, (int)n3);
        boolean bl2 = this.connectionInProgress;
        if (bl2) {
            return;
        }
        this.connectionInProgress = bl2 = true;
        try {
            object = ConnectionTracker.getInstance();
        }
        catch (SecurityException securityException) {}
        Context context = this.context;
        Intent intent = this.connectionIntent;
        int n4 = 65;
        bl2 = ((ConnectionTracker)object).bindService(context, intent, this, n4);
        if (bl2) {
            return;
        }
        this.connectionInProgress = false;
        this.finishAllInQueue();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onServiceConnected(ComponentName componentName, IBinder object) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    boolean bl2;
                    String string2 = "FirebaseMessaging";
                    int n3 = 3;
                    try {
                        boolean bl3 = Log.isLoggable((String)string2, (int)n3);
                        if (bl3) {
                            Objects.toString(componentName);
                        }
                        bl2 = false;
                        componentName = null;
                        this.connectionInProgress = false;
                    }
                    catch (Throwable throwable2) {}
                    bl2 = object instanceof WithinAppServiceBinder;
                    if (bl2) break block5;
                    Objects.toString(object);
                    this.finishAllInQueue();
                    return;
                    break block6;
                }
                object = (WithinAppServiceBinder)((Object)object);
                this.binder = object;
                this.flushQueue();
                return;
            }
            throw throwable2;
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        String string2 = "FirebaseMessaging";
        int n3 = 3;
        boolean bl2 = Log.isLoggable((String)string2, (int)n3);
        if (bl2) {
            Objects.toString(componentName);
        }
        this.flushQueue();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Task sendIntent(Intent object) {
        synchronized (this) {
            Object object2 = "FirebaseMessaging";
            int n3 = 3;
            Log.isLoggable((String)object2, (int)n3);
            object2 = new WithinAppServiceConnection$BindRequest((Intent)object);
            object = this.scheduledExecutorService;
            ((WithinAppServiceConnection$BindRequest)object2).arrangeTimeout((ScheduledExecutorService)object);
            object = this.intentQueue;
            object.add(object2);
            this.flushQueue();
            return ((WithinAppServiceConnection$BindRequest)object2).getTask();
        }
    }
}

