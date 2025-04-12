/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 */
package com.google.firebase.remoteconfig;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.RemoteConfigComponent$GlobalBackgroundListener;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHandler;
import com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient;
import com.google.firebase.remoteconfig.internal.ConfigStorageClient;
import com.google.firebase.remoteconfig.internal.Personalization;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateFactory;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public class RemoteConfigComponent
implements FirebaseRemoteConfigInterop {
    public static final String ACTIVATE_FILE_NAME = "activate";
    public static final long CONNECTION_TIMEOUT_IN_SECONDS = 60L;
    public static final String DEFAULTS_FILE_NAME = "defaults";
    private static final Clock DEFAULT_CLOCK;
    public static final String DEFAULT_NAMESPACE = "firebase";
    private static final Random DEFAULT_RANDOM;
    public static final String FETCH_FILE_NAME = "fetch";
    private static final String FIREBASE_REMOTE_CONFIG_FILE_NAME_PREFIX = "frc";
    private static final String PREFERENCES_FILE_NAME = "settings";
    private static final Map frcNamespaceInstancesStatic;
    private final Provider analyticsConnector;
    private final String appId;
    private final Context context;
    private Map customHeaders;
    private final ScheduledExecutorService executor;
    private final FirebaseABTesting firebaseAbt;
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final Map frcNamespaceInstances;

    static {
        Serializable serializable;
        DEFAULT_CLOCK = DefaultClock.getInstance();
        DEFAULT_RANDOM = serializable = new Random();
        serializable = new HashMap();
        frcNamespaceInstancesStatic = serializable;
    }

    public RemoteConfigComponent(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Provider provider) {
        this(context, scheduledExecutorService, firebaseApp, firebaseInstallationsApi, firebaseABTesting, provider, true);
    }

    public RemoteConfigComponent(Context object, ScheduledExecutorService scheduledExecutorService, FirebaseApp object2, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Provider provider, boolean bl2) {
        HashMap hashMap;
        this.frcNamespaceInstances = hashMap = new HashMap();
        this.customHeaders = hashMap = new HashMap();
        this.context = object;
        this.executor = scheduledExecutorService;
        this.firebaseApp = object2;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.firebaseAbt = firebaseABTesting;
        this.analyticsConnector = provider;
        this.appId = object2 = ((FirebaseApp)object2).getOptions().getApplicationId();
        RemoteConfigComponent$GlobalBackgroundListener.access$000(object);
        if (bl2) {
            super(this);
            Tasks.call(scheduledExecutorService, (Callable)object);
        }
    }

    public static /* synthetic */ AnalyticsConnector a() {
        return RemoteConfigComponent.lambda$getFetchHandler$0();
    }

    public static /* synthetic */ void access$100(boolean bl2) {
        RemoteConfigComponent.notifyRCInstances(bl2);
    }

    private ConfigCacheClient getCacheClient(String object, String object2) {
        String string2 = this.appId;
        String string3 = "_";
        object = h30_0.a(og_1.a("frc_", string2, string3, (String)object, string3), (String)object2, ".json");
        object2 = this.executor;
        object = ConfigStorageClient.getInstance(this.context, (String)object);
        return ConfigCacheClient.getInstance((Executor)object2, (ConfigStorageClient)object);
    }

    private ConfigGetParameterHandler getGetHandler(ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2) {
        ScheduledExecutorService scheduledExecutorService = this.executor;
        ConfigGetParameterHandler configGetParameterHandler = new ConfigGetParameterHandler(scheduledExecutorService, configCacheClient, configCacheClient2);
        return configGetParameterHandler;
    }

    private static Personalization getPersonalization(FirebaseApp object, String string2, Provider provider) {
        boolean bl2 = RemoteConfigComponent.isPrimaryApp((FirebaseApp)object);
        if (bl2 && (bl2 = string2.equals(object = DEFAULT_NAMESPACE))) {
            object = new Personalization(provider);
            return object;
        }
        return null;
    }

    private RolloutsStateSubscriptionsHandler getRolloutsStateSubscriptionsHandler(ConfigCacheClient configCacheClient, ConfigCacheClient object) {
        object = RolloutsStateFactory.create(configCacheClient, (ConfigCacheClient)object);
        ScheduledExecutorService scheduledExecutorService = this.executor;
        RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler = new RolloutsStateSubscriptionsHandler(configCacheClient, (RolloutsStateFactory)object, scheduledExecutorService);
        return rolloutsStateSubscriptionsHandler;
    }

    public static ConfigSharedPrefsClient getSharedPrefsClient(Context context, String object, String string2) {
        object = uc0_0.a("frc_", (String)object, "_", string2, "_settings");
        context = context.getSharedPreferences((String)object, 0);
        object = new ConfigSharedPrefsClient((SharedPreferences)context);
        return object;
    }

    private static boolean isAbtSupported(FirebaseApp firebaseApp, String string2) {
        boolean bl2;
        String string3 = DEFAULT_NAMESPACE;
        boolean bl3 = string2.equals(string3);
        if (bl3 && (bl2 = RemoteConfigComponent.isPrimaryApp(firebaseApp))) {
            bl2 = true;
        } else {
            bl2 = false;
            firebaseApp = null;
        }
        return bl2;
    }

    private static boolean isPrimaryApp(FirebaseApp firebaseApp) {
        return firebaseApp.getName().equals("[DEFAULT]");
    }

    private static /* synthetic */ AnalyticsConnector lambda$getFetchHandler$0() {
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void notifyRCInstances(boolean bl2) {
        Class<RemoteConfigComponent> clazz = RemoteConfigComponent.class;
        synchronized (clazz) {
            Throwable throwable2;
            block5: {
                try {
                    boolean bl3;
                    Iterator iterator = frcNamespaceInstancesStatic;
                    iterator = iterator.values();
                    iterator = iterator.iterator();
                    while (bl3 = iterator.hasNext()) {
                        Object object = iterator.next();
                        object = (FirebaseRemoteConfig)object;
                        ((FirebaseRemoteConfig)object).setConfigUpdateBackgroundState(bl2);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
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
    public FirebaseRemoteConfig get(FirebaseApp firebaseApp, String string2, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2, ConfigCacheClient configCacheClient3, ConfigFetchHandler configFetchHandler, ConfigGetParameterHandler configGetParameterHandler, ConfigSharedPrefsClient configSharedPrefsClient, RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler) {
        RemoteConfigComponent remoteConfigComponent = this;
        Object object = string2;
        synchronized (this) {
            Throwable throwable2;
            block7: {
                Object object2;
                block6: {
                    try {
                        Executor executor2;
                        FirebaseABTesting firebaseABTesting2;
                        object2 = this.frcNamespaceInstances;
                        boolean bl2 = object2.containsKey(string2);
                        if (bl2) break block6;
                        Context context = this.context;
                        bl2 = RemoteConfigComponent.isAbtSupported(firebaseApp, string2);
                        if (bl2) {
                            firebaseABTesting2 = firebaseABTesting;
                        } else {
                            bl2 = false;
                            object2 = null;
                            firebaseABTesting2 = null;
                        }
                        Context context2 = remoteConfigComponent.context;
                        object2 = this;
                        Object object3 = firebaseApp;
                        ConfigRealtimeHandler configRealtimeHandler = this.getRealtime(firebaseApp, firebaseInstallationsApi, configFetchHandler, configCacheClient2, context2, string2, configSharedPrefsClient);
                        FirebaseRemoteConfig firebaseRemoteConfig = executor2;
                        object2 = executor2;
                        executor2 = executor;
                        firebaseRemoteConfig(context, firebaseApp, firebaseInstallationsApi, firebaseABTesting2, executor, configCacheClient, configCacheClient2, configCacheClient3, configFetchHandler, configGetParameterHandler, configSharedPrefsClient, configRealtimeHandler, rolloutsStateSubscriptionsHandler);
                        firebaseRemoteConfig.startLoadingConfigsFromDisk();
                        object3 = remoteConfigComponent.frcNamespaceInstances;
                        object3.put(object, firebaseRemoteConfig);
                        object3 = frcNamespaceInstancesStatic;
                        object3.put(object, firebaseRemoteConfig);
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                object2 = remoteConfigComponent.frcNamespaceInstances;
                object = object2.get(object);
                return (FirebaseRemoteConfig)object;
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
    public FirebaseRemoteConfig get(String object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                ConfigGetParameterHandler configGetParameterHandler;
                ConfigSharedPrefsClient configSharedPrefsClient;
                Object object2;
                ConfigCacheClient configCacheClient;
                ConfigCacheClient configCacheClient2;
                ConfigCacheClient configCacheClient3;
                block4: {
                    Object object3 = FETCH_FILE_NAME;
                    try {
                        configCacheClient3 = this.getCacheClient((String)object, (String)object3);
                        object3 = ACTIVATE_FILE_NAME;
                        configCacheClient2 = this.getCacheClient((String)object, (String)object3);
                        object3 = DEFAULTS_FILE_NAME;
                        configCacheClient = this.getCacheClient((String)object, (String)object3);
                        object3 = this.context;
                        object2 = this.appId;
                        configSharedPrefsClient = RemoteConfigComponent.getSharedPrefsClient((Context)object3, (String)object2, (String)object);
                        configGetParameterHandler = this.getGetHandler(configCacheClient2, configCacheClient);
                        object3 = this.firebaseApp;
                        object2 = this.analyticsConnector;
                        object3 = RemoteConfigComponent.getPersonalization((FirebaseApp)object3, (String)object, (Provider)object2);
                        if (object3 == null) break block4;
                        object2 = new xi2_0((Personalization)object3);
                        configGetParameterHandler.addListener((BiConsumer)object2);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler = this.getRolloutsStateSubscriptionsHandler(configCacheClient2, configCacheClient);
                FirebaseApp firebaseApp = this.firebaseApp;
                FirebaseInstallationsApi firebaseInstallationsApi = this.firebaseInstallations;
                FirebaseABTesting firebaseABTesting = this.firebaseAbt;
                ScheduledExecutorService scheduledExecutorService = this.executor;
                ConfigFetchHandler configFetchHandler = this.getFetchHandler((String)object, configCacheClient3, configSharedPrefsClient);
                object2 = this;
                return this.get(firebaseApp, (String)object, firebaseInstallationsApi, firebaseABTesting, scheduledExecutorService, configCacheClient3, configCacheClient2, configCacheClient, configFetchHandler, configGetParameterHandler, configSharedPrefsClient, rolloutsStateSubscriptionsHandler);
            }
            throw throwable2;
        }
    }

    public FirebaseRemoteConfig getDefault() {
        return this.get(DEFAULT_NAMESPACE);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ConfigFetchHandler getFetchHandler(String string2, ConfigCacheClient configCacheClient, ConfigSharedPrefsClient configSharedPrefsClient) {
        synchronized (this) {
            try {
                ConfigFetchHandler configFetchHandler;
                FirebaseInstallationsApi firebaseInstallationsApi = this.firebaseInstallations;
                Object object = this.firebaseApp;
                boolean bl2 = RemoteConfigComponent.isPrimaryApp((FirebaseApp)object);
                object = bl2 ? this.analyticsConnector : new Object();
                Object object2 = object;
                ScheduledExecutorService scheduledExecutorService = this.executor;
                Clock clock = DEFAULT_CLOCK;
                Random random = DEFAULT_RANDOM;
                object = this.firebaseApp;
                object = ((FirebaseApp)object).getOptions();
                object = ((FirebaseOptions)object).getApiKey();
                ConfigFetchHttpClient configFetchHttpClient = this.getFrcBackendApiClient((String)object, string2, configSharedPrefsClient);
                Map map2 = this.customHeaders;
                object = configFetchHandler;
                return new ConfigFetchHandler(firebaseInstallationsApi, (Provider)object2, scheduledExecutorService, clock, random, configCacheClient, configFetchHttpClient, configSharedPrefsClient, map2);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public ConfigFetchHttpClient getFrcBackendApiClient(String string2, String string3, ConfigSharedPrefsClient configSharedPrefsClient) {
        String string4 = this.firebaseApp.getOptions().getApplicationId();
        Context context = this.context;
        long l2 = configSharedPrefsClient.getFetchTimeoutInSeconds();
        long l3 = configSharedPrefsClient.getFetchTimeoutInSeconds();
        ConfigFetchHttpClient configFetchHttpClient = new ConfigFetchHttpClient(context, string4, string2, string3, l2, l3);
        return configFetchHttpClient;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ConfigRealtimeHandler getRealtime(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Context context, String string2, ConfigSharedPrefsClient configSharedPrefsClient) {
        synchronized (this) {
            ScheduledExecutorService scheduledExecutorService = this.executor;
            return new ConfigRealtimeHandler(firebaseApp, firebaseInstallationsApi, configFetchHandler, configCacheClient, context, string2, configSharedPrefsClient, scheduledExecutorService);
        }
    }

    public void registerRolloutsStateSubscriber(String string2, RolloutsStateSubscriber rolloutsStateSubscriber) {
        this.get(string2).getRolloutsStateSubscriptionsHandler().registerRolloutsStateSubscriber(rolloutsStateSubscriber);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setCustomHeaders(Map map2) {
        synchronized (this) {
            this.customHeaders = map2;
            return;
        }
    }
}

