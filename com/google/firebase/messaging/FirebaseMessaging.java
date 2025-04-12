/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.util.Log
 */
package com.google.firebase.messaging;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.datatransport.TransportFactory;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.events.Subscriber;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal$NewTokenListener;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.google.firebase.messaging.FcmExecutors;
import com.google.firebase.messaging.FcmLifecycleCallbacks;
import com.google.firebase.messaging.FirebaseMessaging$AutoInit;
import com.google.firebase.messaging.GmsRpc;
import com.google.firebase.messaging.MessagingAnalytics;
import com.google.firebase.messaging.Metadata;
import com.google.firebase.messaging.ProxyNotificationInitializer;
import com.google.firebase.messaging.ProxyNotificationPreferences;
import com.google.firebase.messaging.RemoteMessage;
import com.google.firebase.messaging.RequestDeduplicator;
import com.google.firebase.messaging.Store;
import com.google.firebase.messaging.Store$Token;
import com.google.firebase.messaging.SyncTask;
import com.google.firebase.messaging.TopicsSubscriber;
import com.google.firebase.messaging.b;
import com.google.firebase.messaging.c;
import com.google.firebase.messaging.d;
import com.google.firebase.messaging.e;
import com.google.firebase.messaging.f;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class FirebaseMessaging {
    private static final String EXTRA_DUMMY_P_INTENT = "app";
    static final String GMS_PACKAGE = "com.google.android.gms";
    public static final String INSTANCE_ID_SCOPE = "FCM";
    private static final long MAX_DELAY_SEC = 0L;
    private static final long MIN_DELAY_SEC = 30L;
    private static final String SEND_INTENT_ACTION = "com.google.android.gcm.intent.SEND";
    private static final String SUBTYPE_DEFAULT = "";
    static final String TAG = "FirebaseMessaging";
    private static Store store;
    static ScheduledExecutorService syncExecutor;
    static Provider transportFactory;
    private final FirebaseMessaging$AutoInit autoInit;
    private final Context context;
    private final Executor fileExecutor;
    private final FirebaseApp firebaseApp;
    private final GmsRpc gmsRpc;
    private final FirebaseInstanceIdInternal iid;
    private final Executor initExecutor;
    private final Application.ActivityLifecycleCallbacks lifecycleCallbacks;
    private final Metadata metadata;
    private final RequestDeduplicator requestDeduplicator;
    private boolean syncScheduledOrRunning;
    private final Task topicsSubscriberTask;

    static {
        MAX_DELAY_SEC = TimeUnit.HOURS.toSeconds(8);
        mn0_1 mn0_12 = new Object();
        transportFactory = mn0_12;
    }

    public FirebaseMessaging(FirebaseApp object, FirebaseInstanceIdInternal object2, Provider object3, Subscriber object4, Metadata metadata, GmsRpc gmsRpc, Executor executor, Executor executor2, Executor executor3) {
        RequestDeduplicator requestDeduplicator;
        this.syncScheduledOrRunning = false;
        transportFactory = object3;
        this.firebaseApp = object;
        this.iid = object2;
        this.autoInit = object3 = new FirebaseMessaging$AutoInit(this, (Subscriber)object4);
        object3 = ((FirebaseApp)object).getApplicationContext();
        this.context = object3;
        object4 = new FcmLifecycleCallbacks();
        this.lifecycleCallbacks = object4;
        this.metadata = metadata;
        this.gmsRpc = gmsRpc;
        this.requestDeduplicator = requestDeduplicator = new RequestDeduplicator(executor);
        this.initExecutor = executor2;
        this.fileExecutor = executor3;
        object = ((FirebaseApp)object).getApplicationContext();
        boolean bl2 = object instanceof Application;
        if (bl2) {
            object = (Application)object;
            object.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)object4);
        } else {
            Objects.toString(object);
        }
        if (object2 != null) {
            object = new kn0_0(this);
            object2.addNewTokenListener((FirebaseInstanceIdInternal$NewTokenListener)object);
        }
        object = new s8_0(this, 1);
        executor2.execute((Runnable)object);
        object = FcmExecutors.newTopicsSyncExecutor();
        this.topicsSubscriberTask = object = TopicsSubscriber.createInstance(this, metadata, gmsRpc, (Context)object3, (ScheduledExecutorService)object);
        object2 = new c(this);
        ((Task)object).addOnSuccessListener(executor2, (OnSuccessListener)object2);
        object = new t8(this, 1);
        executor2.execute((Runnable)object);
    }

    public FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider provider, Provider provider2, FirebaseInstallationsApi firebaseInstallationsApi, Provider provider3, Subscriber subscriber) {
        Object object = firebaseApp.getApplicationContext();
        Metadata metadata = new Metadata((Context)object);
        object = this;
        this(firebaseApp, firebaseInstanceIdInternal, provider, provider2, firebaseInstallationsApi, provider3, subscriber, metadata);
    }

    public FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider provider, Provider provider2, FirebaseInstallationsApi firebaseInstallationsApi, Provider provider3, Subscriber subscriber, Metadata metadata) {
        GmsRpc gmsRpc = new GmsRpc(firebaseApp, metadata, provider, provider2, firebaseInstallationsApi);
        ExecutorService executorService = FcmExecutors.newTaskExecutor();
        ScheduledExecutorService scheduledExecutorService = FcmExecutors.newInitExecutor();
        Executor executor = FcmExecutors.newFileIOExecutor();
        this(firebaseApp, firebaseInstanceIdInternal, provider3, subscriber, metadata, gmsRpc, executorService, scheduledExecutorService, executor);
    }

    public static /* synthetic */ void a(FirebaseMessaging firebaseMessaging, Void void_) {
        firebaseMessaging.lambda$setNotificationDelegationEnabled$6(void_);
    }

    public static /* synthetic */ FirebaseApp access$000(FirebaseMessaging firebaseMessaging) {
        return firebaseMessaging.firebaseApp;
    }

    public static /* synthetic */ void access$100(FirebaseMessaging firebaseMessaging) {
        firebaseMessaging.startSyncIfNecessary();
    }

    public static /* synthetic */ Task b(FirebaseMessaging firebaseMessaging, String string2, Store$Token token, String string3) {
        return firebaseMessaging.lambda$blockingGetToken$13(string2, token, string3);
    }

    public static /* synthetic */ void c(FirebaseMessaging firebaseMessaging) {
        firebaseMessaging.lambda$new$2();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void clearStoreForTest() {
        Class<FirebaseMessaging> clazz = FirebaseMessaging.class;
        synchronized (clazz) {
            Object var1_1 = null;
            store = null;
            return;
        }
    }

    public static void clearTransportFactoryForTest() {
        ln0_1 ln0_12 = new Object();
        transportFactory = ln0_12;
    }

    public static /* synthetic */ void d(FirebaseMessaging firebaseMessaging, String string2) {
        firebaseMessaging.lambda$new$1(string2);
    }

    public static /* synthetic */ void e(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        firebaseMessaging.lambda$getToken$7(taskCompletionSource);
    }

    public static /* synthetic */ void f(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        firebaseMessaging.lambda$deleteToken$8(taskCompletionSource);
    }

    public static /* synthetic */ Task g(String string2, TopicsSubscriber topicsSubscriber) {
        return topicsSubscriber.unsubscribeFromTopic(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static FirebaseMessaging getInstance() {
        Class<FirebaseMessaging> clazz = FirebaseMessaging.class;
        synchronized (clazz) {
            FirebaseApp firebaseApp = FirebaseApp.getInstance();
            return FirebaseMessaging.getInstance(firebaseApp);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static FirebaseMessaging getInstance(FirebaseApp object) {
        Class<FirebaseMessaging> clazz = FirebaseMessaging.class;
        synchronized (clazz) {
            Object object2 = FirebaseMessaging.class;
            object = ((FirebaseApp)object).get((Class)object2);
            object = (FirebaseMessaging)object;
            object2 = "Firebase Messaging component is not present";
            Preconditions.checkNotNull(object, object2);
            return object;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Store getStore(Context object) {
        Class<FirebaseMessaging> clazz = FirebaseMessaging.class;
        synchronized (clazz) {
            try {
                Store store = FirebaseMessaging.store;
                if (store != null) return FirebaseMessaging.store;
                FirebaseMessaging.store = store = new Store((Context)object);
                return FirebaseMessaging.store;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private String getSubtype() {
        String string2 = "[DEFAULT]";
        String string3 = this.firebaseApp.getName();
        boolean bl2 = string2.equals(string3);
        string3 = bl2 ? SUBTYPE_DEFAULT : this.firebaseApp.getPersistenceKey();
        return string3;
    }

    public static TransportFactory getTransportFactory() {
        return (TransportFactory)transportFactory.get();
    }

    public static /* synthetic */ TransportFactory h() {
        return FirebaseMessaging.lambda$static$0();
    }

    private void handleProxiedNotificationData() {
        Task task2 = this.gmsRpc.getProxyNotificationData();
        Executor executor = this.initExecutor;
        on0_0 on0_02 = new on0_0(this);
        task2.addOnSuccessListener(executor, (OnSuccessListener)on0_02);
    }

    public static /* synthetic */ void i(FirebaseMessaging firebaseMessaging) {
        firebaseMessaging.lambda$new$4();
    }

    private void initializeProxyNotifications() {
        ProxyNotificationInitializer.initialize(this.context);
        Context context = this.context;
        GmsRpc gmsRpc = this.gmsRpc;
        boolean bl2 = this.shouldRetainProxyNotifications();
        ProxyNotificationPreferences.setProxyRetention(context, gmsRpc, bl2);
        boolean bl3 = this.shouldRetainProxyNotifications();
        if (bl3) {
            this.handleProxiedNotificationData();
        }
    }

    private void invokeOnTokenRefresh(String object) {
        String string2 = "[DEFAULT]";
        Object object2 = this.firebaseApp.getName();
        boolean bl2 = string2.equals(object2);
        if (bl2) {
            object2 = TAG;
            int n3 = 3;
            bl2 = Log.isLoggable((String)object2, (int)n3);
            if (bl2) {
                object2 = this.firebaseApp;
                ((FirebaseApp)object2).getName();
            }
            object2 = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            object2.putExtra("token", (String)object);
            string2 = this.context;
            object = new FcmBroadcastProcessor((Context)string2);
            ((FcmBroadcastProcessor)object).process((Intent)object2);
        }
    }

    public static /* synthetic */ void j(FirebaseMessaging firebaseMessaging, CloudMessage cloudMessage) {
        firebaseMessaging.lambda$handleProxiedNotificationData$5(cloudMessage);
    }

    public static /* synthetic */ TransportFactory k() {
        return FirebaseMessaging.lambda$clearTransportFactoryForTest$12();
    }

    public static /* synthetic */ Task l(FirebaseMessaging firebaseMessaging, String string2, Store$Token token) {
        return firebaseMessaging.lambda$blockingGetToken$14(string2, token);
    }

    private /* synthetic */ Task lambda$blockingGetToken$13(String string2, Store$Token store$Token, String string3) {
        boolean bl2;
        Store store = FirebaseMessaging.getStore(this.context);
        String string4 = this.getSubtype();
        String string5 = this.metadata.getAppVersionCode();
        store.saveToken(string4, string2, string3, string5);
        if (store$Token == null || !(bl2 = string3.equals(string2 = store$Token.token))) {
            this.invokeOnTokenRefresh(string3);
        }
        return Tasks.forResult(string3);
    }

    private /* synthetic */ Task lambda$blockingGetToken$14(String string2, Store$Token store$Token) {
        Task task2 = this.gmsRpc.getToken();
        Executor executor = this.fileExecutor;
        d d2 = new d(this, string2, store$Token);
        return task2.onSuccessTask(executor, d2);
    }

    private static /* synthetic */ TransportFactory lambda$clearTransportFactoryForTest$12() {
        return null;
    }

    private /* synthetic */ void lambda$deleteToken$8(TaskCompletionSource taskCompletionSource) {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.iid;
        Object object = this.firebaseApp;
        object = Metadata.getDefaultSenderId((FirebaseApp)object);
        String string2 = INSTANCE_ID_SCOPE;
        firebaseInstanceIdInternal.deleteToken((String)object, string2);
        firebaseInstanceIdInternal = null;
        try {
            taskCompletionSource.setResult(null);
        }
        catch (Exception exception) {
            taskCompletionSource.setException(exception);
        }
    }

    private /* synthetic */ void lambda$deleteToken$9(TaskCompletionSource taskCompletionSource) {
        Object object = this.gmsRpc;
        object = ((GmsRpc)object).deleteToken();
        Tasks.await((Task)object);
        object = this.context;
        object = FirebaseMessaging.getStore((Context)object);
        String string2 = this.getSubtype();
        Object object2 = this.firebaseApp;
        object2 = Metadata.getDefaultSenderId((FirebaseApp)object2);
        ((Store)object).deleteToken(string2, (String)object2);
        object = null;
        try {
            taskCompletionSource.setResult(null);
        }
        catch (Exception exception) {
            taskCompletionSource.setException(exception);
        }
    }

    private /* synthetic */ void lambda$getToken$7(TaskCompletionSource taskCompletionSource) {
        String string2 = this.blockingGetToken();
        try {
            taskCompletionSource.setResult(string2);
        }
        catch (Exception exception) {
            taskCompletionSource.setException(exception);
        }
    }

    private /* synthetic */ void lambda$handleProxiedNotificationData$5(CloudMessage cloudMessage) {
        if (cloudMessage != null) {
            cloudMessage = cloudMessage.getIntent();
            MessagingAnalytics.logNotificationReceived((Intent)cloudMessage);
            this.handleProxiedNotificationData();
        }
    }

    private /* synthetic */ void lambda$new$1(String string2) {
        this.invokeOnTokenRefresh(string2);
    }

    private /* synthetic */ void lambda$new$2() {
        boolean bl2 = this.isAutoInitEnabled();
        if (bl2) {
            this.startSyncIfNecessary();
        }
    }

    private /* synthetic */ void lambda$new$3(TopicsSubscriber topicsSubscriber) {
        boolean bl2 = this.isAutoInitEnabled();
        if (bl2) {
            topicsSubscriber.startTopicsSyncIfNecessary();
        }
    }

    private /* synthetic */ void lambda$new$4() {
        this.initializeProxyNotifications();
    }

    private /* synthetic */ void lambda$setNotificationDelegationEnabled$6(Void void_) {
        void_ = this.context;
        GmsRpc gmsRpc = this.gmsRpc;
        boolean bl2 = this.shouldRetainProxyNotifications();
        ProxyNotificationPreferences.setProxyRetention((Context)void_, gmsRpc, bl2);
    }

    private static /* synthetic */ TransportFactory lambda$static$0() {
        return null;
    }

    public static /* synthetic */ void m(FirebaseMessaging firebaseMessaging, TopicsSubscriber topicsSubscriber) {
        firebaseMessaging.lambda$new$3(topicsSubscriber);
    }

    public static /* synthetic */ Task n(String string2, TopicsSubscriber topicsSubscriber) {
        return topicsSubscriber.subscribeToTopic(string2);
    }

    public static /* synthetic */ void o(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        firebaseMessaging.lambda$deleteToken$9(taskCompletionSource);
    }

    private boolean shouldRetainProxyNotifications() {
        ProxyNotificationInitializer.initialize(this.context);
        Object object = this.context;
        boolean bl2 = ProxyNotificationInitializer.isProxyNotificationEnabled((Context)object);
        boolean bl3 = false;
        if (!bl2) {
            return false;
        }
        object = this.firebaseApp;
        Class<AnalyticsConnector> clazz = AnalyticsConnector.class;
        object = ((FirebaseApp)object).get(clazz);
        boolean bl4 = true;
        if (object != null) {
            return bl4;
        }
        bl2 = MessagingAnalytics.deliveryMetricsExportToBigQueryEnabled();
        if (bl2 && (object = transportFactory) != null) {
            bl3 = true;
        }
        return bl3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void startSync() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        boolean bl2 = this.syncScheduledOrRunning;
                        if (bl2) break block4;
                        long l2 = 0L;
                        this.syncWithDelaySecondsInternal(l2);
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

    private void startSyncIfNecessary() {
        Object object = this.iid;
        if (object != null) {
            object.getToken();
            return;
        }
        object = this.getTokenWithoutTriggeringSync();
        boolean bl2 = this.tokenNeedsRefresh((Store$Token)object);
        if (bl2) {
            this.startSync();
        }
    }

    /*
     * WARNING - void declaration
     */
    public String blockingGetToken() {
        void var1_7;
        Object object = this.iid;
        if (object != null) {
            void var1_4;
            object = object.getTokenTask();
            object = Tasks.await((Task)object);
            try {
                return (String)object;
            }
            catch (InterruptedException interruptedException) {
            }
            catch (ExecutionException executionException) {
                // empty catch block
            }
            IOException iOException = new IOException((Throwable)var1_4);
            throw iOException;
        }
        object = this.getTokenWithoutTriggeringSync();
        boolean bl2 = this.tokenNeedsRefresh((Store$Token)object);
        if (!bl2) {
            return ((Store$Token)object).token;
        }
        Object object2 = Metadata.getDefaultSenderId(this.firebaseApp);
        RequestDeduplicator requestDeduplicator = this.requestDeduplicator;
        f f5 = new f(this, (String)object2, (Store$Token)object);
        object = requestDeduplicator.getOrStartGetTokenRequest((String)object2, f5);
        object = Tasks.await((Task)object);
        try {
            return (String)object;
        }
        catch (InterruptedException interruptedException) {
        }
        catch (ExecutionException executionException) {
            // empty catch block
        }
        object2 = new IOException((Throwable)var1_7);
        throw object2;
    }

    public Task deleteToken() {
        Object object = this.iid;
        if (object != null) {
            object = new TaskCompletionSource();
            Executor executor = this.initExecutor;
            pn0_0 pn0_02 = new pn0_0(this, (TaskCompletionSource)object);
            executor.execute(pn0_02);
            return ((TaskCompletionSource)object).getTask();
        }
        object = this.getTokenWithoutTriggeringSync();
        if (object == null) {
            return Tasks.forResult(null);
        }
        object = new TaskCompletionSource();
        ExecutorService executorService = FcmExecutors.newNetworkIOExecutor();
        jn0_1 jn0_12 = new jn0_1(this, (TaskCompletionSource)object);
        executorService.execute(jn0_12);
        return ((TaskCompletionSource)object).getTask();
    }

    public boolean deliveryMetricsExportToBigQueryEnabled() {
        return MessagingAnalytics.deliveryMetricsExportToBigQueryEnabled();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void enqueueTaskWithDelaySeconds(Runnable runnable2, long l2) {
        Class<FirebaseMessaging> clazz = FirebaseMessaging.class;
        synchronized (clazz) {
            Throwable throwable2;
            block4: {
                Object object;
                ScheduledExecutorService scheduledExecutorService;
                block3: {
                    try {
                        scheduledExecutorService = syncExecutor;
                        if (scheduledExecutorService != null) break block3;
                        String string2 = "TAG";
                        object = new NamedThreadFactory(string2);
                        int n3 = 1;
                        syncExecutor = scheduledExecutorService = new ScheduledThreadPoolExecutor(n3, (ThreadFactory)object);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                scheduledExecutorService = syncExecutor;
                object = TimeUnit.SECONDS;
                scheduledExecutorService.schedule(runnable2, l2, (TimeUnit)((Object)object));
                return;
            }
            throw throwable2;
        }
    }

    public Context getApplicationContext() {
        return this.context;
    }

    public Task getToken() {
        Object object = this.iid;
        if (object != null) {
            return object.getTokenTask();
        }
        object = new TaskCompletionSource();
        Executor executor = this.initExecutor;
        nn0_0 nn0_02 = new nn0_0(this, (TaskCompletionSource)object);
        executor.execute(nn0_02);
        return ((TaskCompletionSource)object).getTask();
    }

    public Store$Token getTokenWithoutTriggeringSync() {
        Store store = FirebaseMessaging.getStore(this.context);
        String string2 = this.getSubtype();
        String string3 = Metadata.getDefaultSenderId(this.firebaseApp);
        return store.getToken(string2, string3);
    }

    public Task getTopicsSubscriberTask() {
        return this.topicsSubscriberTask;
    }

    public boolean isAutoInitEnabled() {
        return this.autoInit.isEnabled();
    }

    public boolean isGmsCorePresent() {
        return this.metadata.isGmscorePresent();
    }

    public boolean isNotificationDelegationEnabled() {
        return ProxyNotificationInitializer.isProxyNotificationEnabled(this.context);
    }

    public void send(RemoteMessage object) {
        String string2 = ((RemoteMessage)object).getTo();
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            string2 = new Intent(SEND_INTENT_ACTION);
            Intent intent = new Intent();
            intent.setPackage("com.google.example.invalidpackage");
            Context context = this.context;
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 23;
            n3 = n3 >= n4 ? 0x4000000 : 0;
            intent = PendingIntent.getBroadcast((Context)context, (int)0, (Intent)intent, (int)n3);
            string2.putExtra(EXTRA_DUMMY_P_INTENT, (Parcelable)intent);
            string2.setPackage(GMS_PACKAGE);
            ((RemoteMessage)object).populateSendMessageIntent((Intent)string2);
            this.context.sendOrderedBroadcast((Intent)string2, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
        object = new IllegalArgumentException("Missing 'to'");
        throw object;
    }

    public void setAutoInitEnabled(boolean bl2) {
        this.autoInit.setEnabled(bl2);
    }

    public void setDeliveryMetricsExportToBigQuery(boolean bl2) {
        MessagingAnalytics.setDeliveryMetricsExportToBigQuery(bl2);
        Context context = this.context;
        GmsRpc gmsRpc = this.gmsRpc;
        boolean bl3 = this.shouldRetainProxyNotifications();
        ProxyNotificationPreferences.setProxyRetention(context, gmsRpc, bl3);
    }

    public Task setNotificationDelegationEnabled(boolean bl2) {
        Executor executor = this.initExecutor;
        Object object = this.context;
        Task task2 = ProxyNotificationInitializer.setEnableProxyNotification(executor, object, bl2);
        executor = new Object();
        object = new Q02(this, 2);
        return task2.addOnSuccessListener(executor, (OnSuccessListener)object);
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

    public Task subscribeToTopic(String string2) {
        Task task2 = this.topicsSubscriberTask;
        b b2 = new b(string2);
        return task2.onSuccessTask(b2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void syncWithDelaySecondsInternal(long l2) {
        synchronized (this) {
            boolean bl2;
            long l3 = (long)2 * l2;
            long l4 = 30;
            l3 = Math.max(l4, l3);
            l4 = MAX_DELAY_SEC;
            l3 = Math.min(l3, l4);
            SyncTask syncTask = new SyncTask(this, l3);
            this.enqueueTaskWithDelaySeconds(syncTask, l2);
            this.syncScheduledOrRunning = bl2 = true;
            return;
        }
    }

    public boolean tokenNeedsRefresh(Store$Token store$Token) {
        String string2;
        boolean bl2;
        if (store$Token != null && !(bl2 = store$Token.needsRefresh(string2 = this.metadata.getAppVersionCode()))) {
            bl2 = false;
            store$Token = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public Task unsubscribeFromTopic(String string2) {
        Task task2 = this.topicsSubscriberTask;
        e e2 = new e(string2);
        return task2.onSuccessTask(e2);
    }
}

