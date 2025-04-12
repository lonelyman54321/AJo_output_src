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
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.Metadata;
import com.google.firebase.messaging.TopicsSubscriber;
import com.google.firebase.messaging.TopicsSyncTask$ConnectivityChangeReceiver;
import java.io.IOException;

class TopicsSyncTask
implements Runnable {
    private static final Object TOPIC_SYNC_TASK_LOCK;
    private static Boolean hasAccessNetworkStatePermission;
    private static Boolean hasWakeLockPermission;
    private final Context context;
    private final Metadata metadata;
    private final long nextDelaySeconds;
    private final PowerManager.WakeLock syncWakeLock;
    private final TopicsSubscriber topicsSubscriber;

    static {
        Object object;
        TOPIC_SYNC_TASK_LOCK = object = new Object();
    }

    public TopicsSyncTask(TopicsSubscriber topicsSubscriber, Context context, Metadata metadata, long l2) {
        this.topicsSubscriber = topicsSubscriber;
        this.context = context;
        this.nextDelaySeconds = l2;
        this.metadata = metadata;
        topicsSubscriber = ((PowerManager)context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
        this.syncWakeLock = topicsSubscriber;
    }

    public static /* synthetic */ boolean access$000(TopicsSyncTask topicsSyncTask) {
        return topicsSyncTask.isDeviceConnected();
    }

    public static /* synthetic */ boolean access$100() {
        return TopicsSyncTask.isLoggable();
    }

    public static /* synthetic */ TopicsSubscriber access$200(TopicsSyncTask topicsSyncTask) {
        return topicsSyncTask.topicsSubscriber;
    }

    public static /* synthetic */ Context access$300(TopicsSyncTask topicsSyncTask) {
        return topicsSyncTask.context;
    }

    private static String createPermissionMissingLog(String string2) {
        return cP.a("Missing Permission: ", string2, ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean hasAccessNetworkStatePermission(Context object) {
        Object object2 = TOPIC_SYNC_TASK_LOCK;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                boolean bl2;
                block4: {
                    Boolean bl3;
                    block3: {
                        try {
                            bl3 = hasAccessNetworkStatePermission;
                            if (bl3 != null) break block3;
                            String string2 = "android.permission.ACCESS_NETWORK_STATE";
                            bl2 = TopicsSyncTask.hasPermission((Context)object, string2, bl3);
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    bl2 = bl3;
                }
                object = bl2;
                hasAccessNetworkStatePermission = object;
                return (Boolean)object;
            }
            throw throwable2;
        }
    }

    private static boolean hasPermission(Context context, String string2, Boolean object) {
        int n3;
        boolean bl2;
        if (object != null) {
            return (Boolean)object;
        }
        int n4 = context.checkCallingOrSelfPermission(string2);
        if (!n4) {
            n4 = 1;
        } else {
            n4 = 0;
            context = null;
        }
        if (!n4 && (bl2 = Log.isLoggable((String)(object = "FirebaseMessaging"), (int)(n3 = 3)))) {
            TopicsSyncTask.createPermissionMissingLog(string2);
        }
        return n4 != 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean hasWakeLockPermission(Context object) {
        Object object2 = TOPIC_SYNC_TASK_LOCK;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                boolean bl2;
                block4: {
                    Boolean bl3;
                    block3: {
                        try {
                            bl3 = hasWakeLockPermission;
                            if (bl3 != null) break block3;
                            String string2 = "android.permission.WAKE_LOCK";
                            bl2 = TopicsSyncTask.hasPermission((Context)object, string2, bl3);
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    bl2 = bl3;
                }
                object = bl2;
                hasWakeLockPermission = object;
                return (Boolean)object;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean isDeviceConnected() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                Object object;
                try {
                    object = this.context;
                    String string2 = "connectivity";
                    object = object.getSystemService(string2);
                    object = (ConnectivityManager)object;
                    if (object == null) return false;
                    object = object.getActiveNetworkInfo();
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                if (object == null) return false;
                boolean bl2 = object.isConnected();
                if (!bl2) return false;
                return true;
            }
            throw throwable2;
        }
    }

    private static boolean isLoggable() {
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

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void run() {
        Throwable throwable2;
        boolean bl2;
        Object object;
        block19: {
            Context context;
            block20: {
                boolean bl3;
                block18: {
                    block17: {
                        context = this.context;
                        bl3 = TopicsSyncTask.hasWakeLockPermission(context);
                        if (bl3) {
                            context = this.syncWakeLock;
                            long l2 = Constants.WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS;
                            context.acquire(l2);
                        }
                        bl3 = false;
                        context = null;
                        object = this.topicsSubscriber;
                        boolean bl4 = true;
                        ((TopicsSubscriber)object).setSyncScheduledOrRunning(bl4);
                        object = this.metadata;
                        bl2 = ((Metadata)object).isGmscorePresent();
                        if (bl2) break block17;
                        object = this.topicsSubscriber;
                        ((TopicsSubscriber)object).setSyncScheduledOrRunning(false);
                        context = this.context;
                        bl3 = TopicsSyncTask.hasWakeLockPermission(context);
                        if (!bl3) return;
                        try {
                            context = this.syncWakeLock;
                            context.release();
                            return;
                        }
                        catch (RuntimeException runtimeException) {
                            return;
                        }
                    }
                    object = this.context;
                    bl2 = TopicsSyncTask.hasAccessNetworkStatePermission((Context)object);
                    if (!bl2 || (bl2 = this.isDeviceConnected())) break block18;
                    object = new TopicsSyncTask$ConnectivityChangeReceiver(this, this);
                    ((TopicsSyncTask$ConnectivityChangeReceiver)((Object)object)).registerReceiver();
                    context = this.context;
                    bl3 = TopicsSyncTask.hasWakeLockPermission(context);
                    if (!bl3) return;
                    try {
                        context = this.syncWakeLock;
                        context.release();
                        return;
                    }
                    catch (RuntimeException runtimeException) {
                        return;
                    }
                }
                try {
                    object = this.topicsSubscriber;
                    bl2 = ((TopicsSubscriber)object).syncTopics();
                    if (bl2) {
                        object = this.topicsSubscriber;
                        ((TopicsSubscriber)object).setSyncScheduledOrRunning(false);
                    } else {
                        object = this.topicsSubscriber;
                        long l3 = this.nextDelaySeconds;
                        ((TopicsSubscriber)object).syncWithDelaySecondsInternal(l3);
                    }
                    context = this.context;
                }
                catch (Throwable throwable2) {
                    break block19;
                }
                catch (IOException iOException) {}
                bl3 = TopicsSyncTask.hasWakeLockPermission(context);
                if (!bl3) return;
                break block20;
                {
                    iOException.getMessage();
                    TopicsSubscriber topicsSubscriber = this.topicsSubscriber;
                    topicsSubscriber.setSyncScheduledOrRunning(false);
                    context = this.context;
                }
                bl3 = TopicsSyncTask.hasWakeLockPermission(context);
                if (!bl3) return;
            }
            try {
                context = this.syncWakeLock;
                context.release();
                return;
            }
            catch (RuntimeException runtimeException) {}
            return;
        }
        object = this.context;
        bl2 = TopicsSyncTask.hasWakeLockPermission((Context)object);
        if (!bl2) throw throwable2;
        try {
            object = this.syncWakeLock;
            object.release();
        }
        catch (RuntimeException runtimeException) {
            throw throwable2;
        }
        throw throwable2;
    }
}

