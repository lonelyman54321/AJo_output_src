/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.util.Log
 */
package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.GmsRpc;
import com.google.firebase.messaging.Metadata;
import com.google.firebase.messaging.TopicOperation;
import com.google.firebase.messaging.TopicsStore;
import com.google.firebase.messaging.TopicsSyncTask;
import com.google.firebase.messaging.m;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class TopicsSubscriber {
    static final String ERROR_INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR";
    static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
    private static final long MAX_DELAY_SEC = 0L;
    private static final long MIN_DELAY_SEC = 30L;
    private static final long RPC_TIMEOUT_SEC = 30L;
    private final Context context;
    private final FirebaseMessaging firebaseMessaging;
    private final Metadata metadata;
    private final Map pendingOperations;
    private final GmsRpc rpc;
    private final TopicsStore store;
    private final ScheduledExecutorService syncExecutor;
    private boolean syncScheduledOrRunning;

    static {
        MAX_DELAY_SEC = TimeUnit.HOURS.toSeconds(8);
    }

    private TopicsSubscriber(FirebaseMessaging firebaseMessaging, Metadata metadata, TopicsStore topicsStore, GmsRpc gmsRpc, Context context, ScheduledExecutorService scheduledExecutorService) {
        Jp jp = new Jp();
        this.pendingOperations = jp;
        this.syncScheduledOrRunning = false;
        this.firebaseMessaging = firebaseMessaging;
        this.metadata = metadata;
        this.store = topicsStore;
        this.rpc = gmsRpc;
        this.context = context;
        this.syncExecutor = scheduledExecutorService;
    }

    public static /* synthetic */ TopicsSubscriber a(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, Metadata metadata, GmsRpc gmsRpc) {
        return TopicsSubscriber.lambda$createInstance$0(context, scheduledExecutorService, firebaseMessaging, metadata, gmsRpc);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void addToPendingOperations(TopicOperation arrayDeque, TaskCompletionSource taskCompletionSource) {
        Map map2 = this.pendingOperations;
        synchronized (map2) {
            Throwable throwable2;
            block5: {
                block4: {
                    ArrayDeque<TaskCompletionSource> arrayDeque2;
                    block3: {
                        try {
                            arrayDeque = ((TopicOperation)((Object)arrayDeque)).serialize();
                            arrayDeque2 = this.pendingOperations;
                            boolean bl2 = arrayDeque2.containsKey(arrayDeque);
                            if (!bl2) break block3;
                            arrayDeque2 = this.pendingOperations;
                            arrayDeque = arrayDeque2.get(arrayDeque);
                            arrayDeque = arrayDeque;
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    arrayDeque2 = new ArrayDeque<TaskCompletionSource>();
                    Map map3 = this.pendingOperations;
                    map3.put(arrayDeque, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(taskCompletionSource);
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void awaitTask(Task task2) {
        ExecutionException executionException2;
        Object object;
        block8: {
            void var0_4;
            object = TimeUnit.SECONDS;
            long l2 = 30;
            try {
                Tasks.await(task2, l2, object);
                return;
            }
            catch (TimeoutException timeoutException) {
            }
            catch (InterruptedException interruptedException) {
            }
            catch (ExecutionException executionException2) {
                break block8;
            }
            object = new IOException(ERROR_SERVICE_NOT_AVAILABLE, (Throwable)var0_4);
            throw object;
        }
        object = executionException2.getCause();
        boolean bl2 = object instanceof IOException;
        if (!bl2) {
            bl2 = object instanceof RuntimeException;
            if (bl2) {
                throw (RuntimeException)object;
            }
            object = new IOException(executionException2);
            throw object;
        }
        throw (IOException)object;
    }

    private void blockingSubscribeToTopic(String string2) {
        GmsRpc gmsRpc = this.rpc;
        String string3 = this.firebaseMessaging.blockingGetToken();
        TopicsSubscriber.awaitTask(gmsRpc.subscribeToTopic(string3, string2));
    }

    private void blockingUnsubscribeFromTopic(String string2) {
        GmsRpc gmsRpc = this.rpc;
        String string3 = this.firebaseMessaging.blockingGetToken();
        TopicsSubscriber.awaitTask(gmsRpc.unsubscribeFromTopic(string3, string2));
    }

    public static Task createInstance(FirebaseMessaging firebaseMessaging, Metadata metadata, GmsRpc gmsRpc, Context context, ScheduledExecutorService scheduledExecutorService) {
        m m2 = new m(context, scheduledExecutorService, firebaseMessaging, metadata, gmsRpc);
        return Tasks.call(scheduledExecutorService, m2);
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

    private static /* synthetic */ TopicsSubscriber lambda$createInstance$0(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, Metadata metadata, GmsRpc gmsRpc) {
        TopicsStore topicsStore = TopicsStore.getInstance(context, scheduledExecutorService);
        TopicsSubscriber topicsSubscriber = new TopicsSubscriber(firebaseMessaging, metadata, topicsStore, gmsRpc, context, scheduledExecutorService);
        return topicsSubscriber;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void markCompletePendingOperation(TopicOperation object) {
        Map map2 = this.pendingOperations;
        synchronized (map2) {
            Throwable throwable2;
            block6: {
                boolean bl2;
                Object object2;
                try {
                    object = ((TopicOperation)object).serialize();
                    object2 = this.pendingOperations;
                    bl2 = object2.containsKey(object);
                    if (!bl2) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                object2 = this.pendingOperations;
                object2 = object2.get(object);
                object2 = (ArrayDeque)object2;
                Object object3 = ((ArrayDeque)object2).poll();
                if ((object3 = (TaskCompletionSource)object3) != null) {
                    ((TaskCompletionSource)object3).setResult(null);
                }
                if (bl2 = ((ArrayDeque)object2).isEmpty()) {
                    object2 = this.pendingOperations;
                    object2.remove(object);
                }
                return;
            }
            throw throwable2;
        }
    }

    private void startSync() {
        boolean bl2 = this.isSyncScheduledOrRunning();
        if (!bl2) {
            long l2 = 0L;
            this.syncWithDelaySecondsInternal(l2);
        }
    }

    public TopicsStore getStore() {
        return this.store;
    }

    public boolean hasPendingOperation() {
        boolean bl2;
        TopicOperation topicOperation = this.store.getNextTopicOperation();
        if (topicOperation != null) {
            bl2 = true;
        } else {
            bl2 = false;
            topicOperation = null;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean isSyncScheduledOrRunning() {
        synchronized (this) {
            return this.syncScheduledOrRunning;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean performTopicOperation(TopicOperation var1_1) {
        block10: {
            block9: {
                block8: {
                    try {
                        var2_3 = var1_1.getOperation();
                        var3_5 = var2_3.hashCode();
                        var4_6 = 83;
                        var5_7 = true;
                        if (var3_5 == var4_6) break block8;
                        var4_6 = 85;
                        if (var3_5 == var4_6 && (var7_11 = (boolean)var2_3.equals(var6_8 = "U"))) {
                            var7_11 = true;
                            break block9;
                        }
                        ** GOTO lbl-1000
                    }
                    catch (IOException var1_2) {
                        break block10;
                    }
                }
                var6_9 = "S";
                var7_11 = var2_3.equals(var6_9);
                if (var7_11) {
                    var7_11 = false;
                    var2_3 = null;
                } else lbl-1000:
                // 2 sources

                {
                    var7_11 = -1 != 0;
                }
            }
            if (!var7_11) {
                var2_3 = var1_1.getTopic();
                this.blockingSubscribeToTopic(var2_3);
                var7_11 = TopicsSubscriber.isDebugLogEnabled();
                if (var7_11 == false) return var5_7;
                var1_1.getTopic();
                return var5_7;
            }
            if (var7_11 != var5_7) {
                TopicsSubscriber.isDebugLogEnabled();
                return var5_7;
            }
            var2_3 = var1_1.getTopic();
            this.blockingUnsubscribeFromTopic(var2_3);
            var7_11 = TopicsSubscriber.isDebugLogEnabled();
            if (var7_11 == false) return var5_7;
            var1_1.getTopic();
            return var5_7;
        }
        var2_4 = "SERVICE_NOT_AVAILABLE";
        var6_10 = var1_2.getMessage();
        var7_12 = var2_4.equals(var6_10);
        if (!(var7_12 || (var7_12 = (var2_4 = "INTERNAL_SERVER_ERROR").equals(var6_10 = var1_2.getMessage())) || (var7_12 = (var2_4 = "TOO_MANY_SUBSCRIBERS").equals(var6_10 = var1_2.getMessage())))) {
            var2_4 = var1_2.getMessage();
            if (var2_4 != null) throw var1_2;
            return false;
        }
        var1_2.getMessage();
        return false;
    }

    public void scheduleSyncTaskWithDelaySeconds(Runnable runnable2, long l2) {
        ScheduledExecutorService scheduledExecutorService = this.syncExecutor;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        scheduledExecutorService.schedule(runnable2, l2, timeUnit);
    }

    public Task scheduleTopicOperation(TopicOperation topicOperation) {
        this.store.addTopicOperation(topicOperation);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.addToPendingOperations(topicOperation, taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setSyncScheduledOrRunning(boolean bl2) {
        synchronized (this) {
            this.syncScheduledOrRunning = bl2;
            return;
        }
    }

    public void startTopicsSyncIfNecessary() {
        boolean bl2 = this.hasPendingOperation();
        if (bl2) {
            this.startSync();
        }
    }

    public Task subscribeToTopic(String object) {
        object = TopicOperation.subscribe((String)object);
        object = this.scheduleTopicOperation((TopicOperation)object);
        this.startTopicsSyncIfNecessary();
        return object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean syncTopics() {
        Throwable throwable2;
        while (true) {
            Object object;
            synchronized (this) {
                try {
                    object = this.store;
                    object = ((TopicsStore)object).getNextTopicOperation();
                    if (object == null) {
                        TopicsSubscriber.isDebugLogEnabled();
                        return true;
                    }
                }
                catch (Throwable throwable2) {
                    break;
                }
            }
            boolean bl2 = this.performTopicOperation((TopicOperation)object);
            if (!bl2) {
                return false;
            }
            TopicsStore topicsStore = this.store;
            topicsStore.removeTopicOperation((TopicOperation)object);
            this.markCompletePendingOperation((TopicOperation)object);
        }
        {
            throw throwable2;
        }
    }

    public void syncWithDelaySecondsInternal(long l2) {
        long l3 = (long)2 * l2;
        l3 = Math.max((long)30, l3);
        long l4 = MAX_DELAY_SEC;
        long l7 = Math.min(l3, l4);
        Context context = this.context;
        Metadata metadata = this.metadata;
        TopicsSyncTask topicsSyncTask = new TopicsSyncTask(this, context, metadata, l7);
        this.scheduleSyncTaskWithDelaySeconds(topicsSyncTask, l2);
        this.setSyncScheduledOrRunning(true);
    }

    public Task unsubscribeFromTopic(String object) {
        object = TopicOperation.unsubscribe((String)object);
        object = this.scheduleTopicOperation((TopicOperation)object);
        this.startTopicsSyncIfNecessary();
        return object;
    }
}

