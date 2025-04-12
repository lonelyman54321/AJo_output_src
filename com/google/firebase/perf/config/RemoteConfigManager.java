/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 */
package com.google.firebase.perf.config;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.StartupTime;
import com.google.firebase.inject.Provider;
import com.google.firebase.perf.config.ConfigurationConstants$ExperimentTTID;
import com.google.firebase.perf.config.DeviceCacheManager;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Optional;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0L;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000L;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    private static final RemoteConfigManager instance;
    private static final AndroidLogger logger;
    private final ConcurrentHashMap allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final DeviceCacheManager cache;
    private final Executor executor;
    private FirebaseRemoteConfig firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private Provider firebaseRemoteConfigProvider;

    static {
        RemoteConfigManager remoteConfigManager;
        logger = AndroidLogger.getInstance();
        instance = remoteConfigManager = new RemoteConfigManager();
        TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);
    }

    private RemoteConfigManager() {
        DeviceCacheManager deviceCacheManager = DeviceCacheManager.getInstance();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<Runnable>();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 0L, timeUnit, linkedBlockingQueue);
        Object object = new Random();
        long l2 = ((Random)object).nextInt(25000);
        long l3 = 5000L + l2;
        long l4 = RemoteConfigManager.getInitialStartupMillis();
        object = this;
        this(deviceCacheManager, threadPoolExecutor, null, l3, l4);
    }

    public RemoteConfigManager(DeviceCacheManager concurrentHashMap, Executor object, FirebaseRemoteConfig firebaseRemoteConfig, long l2, long l3) {
        long l4;
        this.firebaseRemoteConfigLastFetchTimestampMs = l4 = 0L;
        this.cache = concurrentHashMap;
        this.executor = object;
        this.firebaseRemoteConfig = firebaseRemoteConfig;
        if (firebaseRemoteConfig == null) {
            concurrentHashMap = new ConcurrentHashMap();
        } else {
            object = firebaseRemoteConfig.getAll();
            super(object);
        }
        this.allRcConfigMap = concurrentHashMap;
        this.appStartTimeInMs = l3;
        this.appStartConfigFetchDelayInMs = l2;
    }

    public static /* synthetic */ void a(RemoteConfigManager remoteConfigManager, Exception exception) {
        remoteConfigManager.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(exception);
    }

    public static /* synthetic */ void b(RemoteConfigManager remoteConfigManager, Boolean bl2) {
        remoteConfigManager.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(bl2);
    }

    public static long getInitialStartupMillis() {
        Object object = FirebaseApp.getInstance();
        Object object2 = StartupTime.class;
        object = ((FirebaseApp)object).get((Class)object2);
        try {
            object = (StartupTime)object;
        }
        catch (IllegalStateException illegalStateException) {
            object = logger;
            object2 = "Unable to get StartupTime instance.";
            ((AndroidLogger)object).debug((String)object2);
            object = null;
        }
        if (object != null) {
            return ((StartupTime)object).getEpochMillis();
        }
        return System.currentTimeMillis();
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private FirebaseRemoteConfigValue getRemoteConfigValue(String string2) {
        int n3;
        Object object;
        int n4 = 2;
        this.triggerRemoteConfigFetchIfNecessary();
        boolean bl2 = this.isFirebaseRemoteConfigAvailable();
        if (bl2 && (bl2 = ((ConcurrentHashMap)(object = this.allRcConfigMap)).containsKey(string2)) && (n3 = (object = (FirebaseRemoteConfigValue)this.allRcConfigMap.get(string2)).getSource()) == n4) {
            AndroidLogger androidLogger = logger;
            String string3 = object.asString();
            Object[] objectArray = new Object[n4];
            objectArray[0] = string3;
            objectArray[1] = string2;
            androidLogger.debug("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", objectArray);
            return object;
        }
        return null;
    }

    public static int getVersionCode(Context object) {
        PackageManager packageManager;
        try {
            packageManager = object.getPackageManager();
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return 0;
        }
        object = object.getPackageName();
        object = packageManager.getPackageInfo((String)object, 0);
        return object.versionCode;
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long l2) {
        long l3 = this.appStartTimeInMs;
        long l4 = (l2 -= l3) - (l3 = this.appStartConfigFetchDelayInMs);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object >= 0;
        return bl2;
    }

    private boolean hasLastFetchBecomeStale(long l2) {
        long l3 = this.firebaseRemoteConfigLastFetchTimestampMs;
        long l4 = (l2 -= l3) - (l3 = TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object > 0;
        return bl2;
    }

    private /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean object) {
        object = this.firebaseRemoteConfig.getAll();
        this.syncConfigValues((Map)object);
    }

    private /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exception) {
        AndroidLogger androidLogger = logger;
        Object[] objectArray = new Object[]{exception};
        androidLogger.warn("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", objectArray);
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        boolean bl2;
        long l2 = this.getCurrentSystemTimeMillis();
        boolean bl3 = this.hasAppStartConfigFetchDelayElapsed(l2);
        bl2 = bl3 && (bl2 = this.hasLastFetchBecomeStale(l2));
        return bl2;
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        long l2;
        this.firebaseRemoteConfigLastFetchTimestampMs = l2 = this.getCurrentSystemTimeMillis();
        Task task2 = this.firebaseRemoteConfig.fetchAndActivate();
        Executor executor = this.executor;
        Object object = new di2_0(this);
        task2 = task2.addOnSuccessListener(executor, (OnSuccessListener)object);
        executor = this.executor;
        object = new ei2_0(this);
        task2.addOnFailureListener(executor, (OnFailureListener)object);
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        boolean bl2 = this.isFirebaseRemoteConfigAvailable();
        if (!bl2) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.allRcConfigMap;
        bl2 = concurrentHashMap.isEmpty();
        if (bl2) {
            concurrentHashMap = this.allRcConfigMap;
            Map map2 = this.firebaseRemoteConfig.getAll();
            concurrentHashMap.putAll(map2);
        }
        if (bl2 = this.shouldFetchAndActivateRemoteConfigValues()) {
            this.triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
        }
    }

    public Optional getBoolean(String string2) {
        block6: {
            if (string2 == null) {
                logger.debug("The key to get Remote Config boolean value is null.");
                return Optional.absent();
            }
            Object object = this.getRemoteConfigValue(string2);
            if (object != null) {
                boolean bl2 = object.asBoolean();
                Object object2 = bl2;
                try {
                    return Optional.of(object2);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    object2 = object.asString();
                    bl2 = ((String)object2).isEmpty();
                    if (bl2) break block6;
                    object2 = logger;
                    object = object.asString();
                    int n3 = 2;
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = object;
                    int n4 = 1;
                    objectArray[n4] = string2;
                    string2 = "Could not parse value: '%s' for key: '%s'.";
                    ((AndroidLogger)object2).debug(string2, objectArray);
                }
            }
        }
        return Optional.absent();
    }

    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public Optional getDouble(String string2) {
        block6: {
            if (string2 == null) {
                logger.debug("The key to get Remote Config double value is null.");
                return Optional.absent();
            }
            Object object = this.getRemoteConfigValue(string2);
            if (object != null) {
                double d2 = object.asDouble();
                Object object2 = d2;
                try {
                    return Optional.of(object2);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    object2 = object.asString();
                    boolean bl2 = ((String)object2).isEmpty();
                    if (bl2) break block6;
                    object2 = logger;
                    object = object.asString();
                    int n3 = 2;
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = object;
                    int n4 = 1;
                    objectArray[n4] = string2;
                    string2 = "Could not parse value: '%s' for key: '%s'.";
                    ((AndroidLogger)object2).debug(string2, objectArray);
                }
            }
        }
        return Optional.absent();
    }

    public Optional getLong(String string2) {
        block6: {
            if (string2 == null) {
                logger.debug("The key to get Remote Config long value is null.");
                return Optional.absent();
            }
            Object object = this.getRemoteConfigValue(string2);
            if (object != null) {
                long l2 = object.asLong();
                Object object2 = l2;
                try {
                    return Optional.of(object2);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    object2 = object.asString();
                    boolean bl2 = ((String)object2).isEmpty();
                    if (bl2) break block6;
                    object2 = logger;
                    object = object.asString();
                    int n3 = 2;
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = object;
                    int n4 = 1;
                    objectArray[n4] = string2;
                    string2 = "Could not parse value: '%s' for key: '%s'.";
                    ((AndroidLogger)object2).debug(string2, objectArray);
                }
            }
        }
        return Optional.absent();
    }

    /*
     * Exception decompiling
     */
    public Object getRemoteConfigValueOrDefault(String var1_1, Object var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [2 : 60->67)] java.lang.IllegalArgumentException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public Optional getString(String object) {
        if (object == null) {
            logger.debug("The key to get Remote Config String value is null.");
            return Optional.absent();
        }
        if ((object = this.getRemoteConfigValue((String)object)) != null) {
            return Optional.of(object.asString());
        }
        return Optional.absent();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        boolean bl2;
        Object object = this.firebaseRemoteConfig;
        if (object == null && (object = this.firebaseRemoteConfigProvider) != null && (object = (RemoteConfigComponent)object.get()) != null) {
            String string2 = FIREPERF_FRC_NAMESPACE_NAME;
            this.firebaseRemoteConfig = object = ((RemoteConfigComponent)object).get(string2);
        }
        if ((object = this.firebaseRemoteConfig) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public boolean isLastFetchFailed() {
        int n3;
        int n4;
        Object object = this.firebaseRemoteConfig;
        int n7 = 1;
        if (object != null && (n4 = (object = ((FirebaseRemoteConfig)object).getInfo()).getLastFetchStatus()) != n7 && (n4 = (object = this.firebaseRemoteConfig.getInfo()).getLastFetchStatus()) != (n3 = 2)) {
            n7 = 0;
        }
        return n7 != 0;
    }

    public void setFirebaseRemoteConfigProvider(Provider provider) {
        this.firebaseRemoteConfigProvider = provider;
    }

    public void syncConfigValues(Map object) {
        Object object2;
        boolean bl2;
        this.allRcConfigMap.putAll(object);
        Object object3 = this.allRcConfigMap.keySet().iterator();
        while (bl2 = object3.hasNext()) {
            object2 = (String)object3.next();
            boolean bl3 = object.containsKey(object2);
            if (bl3) continue;
            ConcurrentHashMap concurrentHashMap = this.allRcConfigMap;
            concurrentHashMap.remove(object2);
        }
        object = ConfigurationConstants$ExperimentTTID.getInstance();
        object3 = this.allRcConfigMap;
        object2 = ((ConfigurationConstants$ExperimentTTID)object).getRemoteConfigFlag();
        if ((object3 = (FirebaseRemoteConfigValue)((ConcurrentHashMap)object3).get(object2)) != null) {
            object2 = this.cache;
            object = ((ConfigurationConstants$ExperimentTTID)object).getDeviceCacheFlag();
            boolean bl4 = object3.asBoolean();
            try {
                ((DeviceCacheManager)object2).setValue((String)object, bl4);
            }
            catch (Exception exception) {
                object = logger;
                object3 = "ExperimentTTID remote config flag has invalid value, expected boolean.";
                ((AndroidLogger)object).debug((String)object3);
            }
        } else {
            object = logger;
            object3 = "ExperimentTTID remote config flag does not exist.";
            ((AndroidLogger)object).debug((String)object3);
        }
    }
}

