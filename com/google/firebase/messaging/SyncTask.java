/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.ConnectivityManager
 *  android.os.Build$VERSION
 *  android.os.PowerManager
 *  android.os.PowerManager$WakeLock
 *  android.util.Log
 */
package com.google.firebase.messaging;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.GmsRpc;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.SyncTask$ConnectivityChangeReceiver;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class SyncTask
implements Runnable {
    private final FirebaseMessaging firebaseMessaging;
    private final long nextDelaySeconds;
    ExecutorService processorExecutor;
    private final PowerManager.WakeLock syncWakeLock;

    public SyncTask(FirebaseMessaging firebaseMessaging, long l2) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<Runnable>();
        NamedThreadFactory namedThreadFactory = new NamedThreadFactory("firebase-iid-executor");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long)30, timeUnit, linkedBlockingQueue, namedThreadFactory);
        this.processorExecutor = threadPoolExecutor;
        this.firebaseMessaging = firebaseMessaging;
        this.nextDelaySeconds = l2;
        firebaseMessaging = ((PowerManager)this.getContext().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.syncWakeLock = firebaseMessaging;
        firebaseMessaging.setReferenceCounted(false);
    }

    public static /* synthetic */ FirebaseMessaging access$000(SyncTask syncTask) {
        return syncTask.firebaseMessaging;
    }

    public static boolean isDebugLogEnabled() {
        boolean bl2;
        int n3;
        String string2 = "FirebaseMessaging";
        int n4 = 3;
        int n7 = Log.isLoggable((String)string2, (int)n4);
        if (!(n7 != 0 || (n7 = Build.VERSION.SDK_INT) == (n3 = 23) && (bl2 = Log.isLoggable((String)string2, (int)n4)))) {
            bl2 = false;
            string2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public Context getContext() {
        return this.firebaseMessaging.getApplicationContext();
    }

    public boolean isDeviceConnected() {
        boolean bl2;
        Context context = this.getContext();
        String string2 = "connectivity";
        if ((context = (ConnectivityManager)context.getSystemService(string2)) != null) {
            context = context.getActiveNetworkInfo();
        } else {
            bl2 = false;
            context = null;
        }
        if (context != null && (bl2 = context.isConnected())) {
            bl2 = true;
        } else {
            bl2 = false;
            context = null;
        }
        return bl2;
    }

    public boolean maybeRefreshToken() {
        Object object = this.firebaseMessaging;
        object = ((FirebaseMessaging)object).blockingGetToken();
        if (object == null) {
            return false;
        }
        object = "FirebaseMessaging";
        int n3 = 3;
        try {
            Log.isLoggable((String)object, (int)n3);
            return true;
        }
        catch (IOException iOException) {
        }
        catch (SecurityException securityException) {
            return false;
        }
        String string2 = iOException.getMessage();
        n3 = GmsRpc.isErrorMessageForRetryableError(string2);
        if (n3 != 0) {
            iOException.getMessage();
            return false;
        }
        string2 = iOException.getMessage();
        if (string2 == null) {
            return false;
        }
        throw iOException;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void run() {
        Throwable throwable2;
        Context context;
        boolean bl2;
        Object object;
        block11: {
            ServiceStarter serviceStarter;
            block12: {
                FirebaseMessaging firebaseMessaging;
                IOException iOException2;
                boolean bl3;
                block10: {
                    block9: {
                        block8: {
                            serviceStarter = ServiceStarter.getInstance();
                            bl3 = serviceStarter.hasWakeLockPermission((Context)(object = this.getContext()));
                            if (bl3) {
                                serviceStarter = this.syncWakeLock;
                                serviceStarter.acquire();
                            }
                            bl3 = false;
                            serviceStarter = null;
                            object = this.firebaseMessaging;
                            boolean bl4 = true;
                            ((FirebaseMessaging)object).setSyncScheduledOrRunning(bl4);
                            object = this.firebaseMessaging;
                            bl2 = ((FirebaseMessaging)object).isGmsCorePresent();
                            if (bl2) break block8;
                            object = this.firebaseMessaging;
                            ((FirebaseMessaging)object).setSyncScheduledOrRunning(false);
                            serviceStarter = ServiceStarter.getInstance();
                            object = this.getContext();
                            bl3 = serviceStarter.hasWakeLockPermission((Context)object);
                            if (!bl3) return;
                            serviceStarter = this.syncWakeLock;
                            serviceStarter.release();
                            return;
                        }
                        object = ServiceStarter.getInstance();
                        context = this.getContext();
                        bl2 = ((ServiceStarter)object).hasAccessNetworkStatePermission(context);
                        if (!bl2 || (bl2 = this.isDeviceConnected())) break block9;
                        object = new SyncTask$ConnectivityChangeReceiver(this);
                        ((SyncTask$ConnectivityChangeReceiver)((Object)object)).registerReceiver();
                        serviceStarter = ServiceStarter.getInstance();
                        object = this.getContext();
                        bl3 = serviceStarter.hasWakeLockPermission((Context)object);
                        if (!bl3) return;
                        serviceStarter = this.syncWakeLock;
                        serviceStarter.release();
                        return;
                    }
                    try {
                        bl2 = this.maybeRefreshToken();
                        if (bl2) {
                            object = this.firebaseMessaging;
                            ((FirebaseMessaging)object).setSyncScheduledOrRunning(false);
                            break block10;
                        }
                        object = this.firebaseMessaging;
                        long l2 = this.nextDelaySeconds;
                        ((FirebaseMessaging)object).syncWithDelaySecondsInternal(l2);
                    }
                    catch (Throwable throwable2) {
                        break block11;
                    }
                    catch (IOException iOException2) {}
                }
                serviceStarter = ServiceStarter.getInstance();
                object = this.getContext();
                bl3 = serviceStarter.hasWakeLockPermission((Context)object);
                if (!bl3) return;
                break block12;
                {
                    iOException2.getMessage();
                    firebaseMessaging = this.firebaseMessaging;
                    firebaseMessaging.setSyncScheduledOrRunning(false);
                }
                serviceStarter = ServiceStarter.getInstance();
                firebaseMessaging = this.getContext();
                bl3 = serviceStarter.hasWakeLockPermission((Context)firebaseMessaging);
                if (!bl3) return;
            }
            serviceStarter = this.syncWakeLock;
            serviceStarter.release();
            return;
        }
        object = ServiceStarter.getInstance();
        context = this.getContext();
        bl2 = ((ServiceStarter)object).hasWakeLockPermission(context);
        if (!bl2) throw throwable2;
        object = this.syncWakeLock;
        object.release();
        throw throwable2;
    }
}

