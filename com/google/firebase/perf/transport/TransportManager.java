/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.text.TextUtils
 */
package com.google.firebase.perf.transport;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.BuildConfig;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.application.AppStateMonitor$AppStateCallback;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.logging.ConsoleUrlGenerator;
import com.google.firebase.perf.metrics.validator.PerfMetricValidator;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.transport.FlgTransport;
import com.google.firebase.perf.transport.PendingPerfEvent;
import com.google.firebase.perf.transport.RateLimiter;
import com.google.firebase.perf.transport.a;
import com.google.firebase.perf.util.Constants$CounterNames;
import com.google.firebase.perf.util.Rate;
import com.google.firebase.perf.v1.AndroidApplicationInfo;
import com.google.firebase.perf.v1.AndroidApplicationInfo$Builder;
import com.google.firebase.perf.v1.ApplicationInfo;
import com.google.firebase.perf.v1.ApplicationInfo$Builder;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.GaugeMetric;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.google.firebase.perf.v1.PerfMetric;
import com.google.firebase.perf.v1.PerfMetric$Builder;
import com.google.firebase.perf.v1.PerfMetricOrBuilder;
import com.google.firebase.perf.v1.TraceMetric;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

public class TransportManager
implements AppStateMonitor$AppStateCallback {
    private static final int CORE_POOL_SIZE = 0;
    private static final String KEY_AVAILABLE_GAUGES_FOR_CACHING = "KEY_AVAILABLE_GAUGES_FOR_CACHING";
    private static final String KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING = "KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING";
    private static final String KEY_AVAILABLE_TRACES_FOR_CACHING = "KEY_AVAILABLE_TRACES_FOR_CACHING";
    private static final int MAX_GAUGE_METRICS_CACHE_SIZE = 50;
    private static final int MAX_NETWORK_REQUEST_METRICS_CACHE_SIZE = 50;
    private static final int MAX_POOL_SIZE = 1;
    private static final int MAX_TRACE_METRICS_CACHE_SIZE = 50;
    private static final TransportManager instance;
    private static final AndroidLogger logger;
    private Context appContext;
    private AppStateMonitor appStateMonitor;
    private ApplicationInfo$Builder applicationInfoBuilder;
    private final Map cacheMap;
    private ConfigResolver configResolver;
    private ExecutorService executorService;
    private FirebaseApp firebaseApp;
    private FirebaseInstallationsApi firebaseInstallationsApi;
    private FirebasePerformance firebasePerformance;
    private FlgTransport flgTransport;
    private Provider flgTransportFactoryProvider;
    private boolean isForegroundState;
    private final AtomicBoolean isTransportInitialized;
    private String packageName;
    private final ConcurrentLinkedQueue pendingEventsQueue;
    private String projectId;
    private RateLimiter rateLimiter;

    static {
        TransportManager transportManager;
        logger = AndroidLogger.getInstance();
        instance = transportManager = new TransportManager();
    }

    private TransportManager() {
        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<String, Integer>();
        this.pendingEventsQueue = concurrentHashMap;
        super(false);
        this.isTransportInitialized = concurrentHashMap;
        this.isForegroundState = false;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<Runnable>();
        concurrentHashMap = new ConcurrentHashMap<String, Integer>(0, 1, (long)10, timeUnit, linkedBlockingQueue);
        this.executorService = concurrentHashMap;
        this.cacheMap = concurrentHashMap = new ConcurrentHashMap<String, Integer>();
        Integer n3 = 50;
        concurrentHashMap.put(KEY_AVAILABLE_TRACES_FOR_CACHING, n3);
        concurrentHashMap.put(KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING, n3);
        concurrentHashMap.put(KEY_AVAILABLE_GAUGES_FOR_CACHING, n3);
    }

    public static /* synthetic */ void a(TransportManager transportManager) {
        transportManager.syncInit();
    }

    public static /* synthetic */ void b(TransportManager transportManager, PendingPerfEvent pendingPerfEvent) {
        transportManager.lambda$finishInitialization$0(pendingPerfEvent);
    }

    public static /* synthetic */ void c(TransportManager transportManager, TraceMetric traceMetric, ApplicationProcessState applicationProcessState) {
        transportManager.lambda$log$2(traceMetric, applicationProcessState);
    }

    public static /* synthetic */ void d(TransportManager transportManager, NetworkRequestMetric networkRequestMetric, ApplicationProcessState applicationProcessState) {
        transportManager.lambda$log$3(networkRequestMetric, applicationProcessState);
    }

    private void dispatchLog(PerfMetric perfMetric) {
        int n3 = 1;
        String string2 = null;
        boolean bl2 = perfMetric.hasTraceMetric();
        if (bl2) {
            AndroidLogger androidLogger = logger;
            String string3 = TransportManager.getLogcatMsg(perfMetric);
            Object object = perfMetric.getTraceMetric();
            object = this.getConsoleUrl((TraceMetric)object);
            int n4 = 2;
            Object[] objectArray = new Object[n4];
            objectArray[0] = string3;
            objectArray[n3] = object;
            String string4 = "Logging %s. In a minute, visit the Firebase console to view your data: %s";
            androidLogger.info(string4, objectArray);
        } else {
            AndroidLogger androidLogger = logger;
            String string5 = TransportManager.getLogcatMsg(perfMetric);
            Object[] objectArray = new Object[n3];
            objectArray[0] = string5;
            string2 = "Logging %s";
            androidLogger.info(string2, objectArray);
        }
        this.flgTransport.log(perfMetric);
    }

    public static /* synthetic */ void e(TransportManager transportManager) {
        transportManager.lambda$onUpdateAppState$1();
    }

    public static /* synthetic */ void f(TransportManager transportManager, GaugeMetric gaugeMetric, ApplicationProcessState applicationProcessState) {
        transportManager.lambda$log$4(gaugeMetric, applicationProcessState);
    }

    private void finishInitialization() {
        boolean bl2;
        Object object = this.appStateMonitor;
        Object object2 = instance;
        Object object3 = new WeakReference(object2);
        ((AppStateMonitor)object).registerForAppState((WeakReference)object3);
        this.applicationInfoBuilder = object = ApplicationInfo.newBuilder();
        object3 = this.firebaseApp.getOptions().getApplicationId();
        object = ((ApplicationInfo$Builder)object).setGoogleAppId((String)object3);
        object3 = AndroidApplicationInfo.newBuilder();
        object2 = this.packageName;
        object3 = ((AndroidApplicationInfo$Builder)object3).setPackageName((String)object2);
        object2 = BuildConfig.FIREPERF_VERSION_NAME;
        object3 = ((AndroidApplicationInfo$Builder)object3).setSdkVersion((String)object2);
        object2 = TransportManager.getVersionName(this.appContext);
        object3 = ((AndroidApplicationInfo$Builder)object3).setVersionName((String)object2);
        ((ApplicationInfo$Builder)object).setAndroidAppInfo((AndroidApplicationInfo$Builder)object3);
        object = this.isTransportInitialized;
        boolean bl3 = true;
        ((AtomicBoolean)object).set(bl3);
        while (!(bl2 = ((ConcurrentLinkedQueue)(object = this.pendingEventsQueue)).isEmpty())) {
            object = (PendingPerfEvent)this.pendingEventsQueue.poll();
            if (object == null) continue;
            object3 = this.executorService;
            object2 = new a(this, (PendingPerfEvent)object);
            object3.execute((Runnable)object2);
        }
    }

    private String getConsoleUrl(TraceMetric object) {
        String string2;
        boolean bl2 = ((String)(object = ((TraceMetric)object).getName())).startsWith(string2 = "_st_");
        if (bl2) {
            string2 = this.projectId;
            String string3 = this.packageName;
            return ConsoleUrlGenerator.generateScreenTraceUrl(string2, string3, (String)object);
        }
        string2 = this.projectId;
        String string4 = this.packageName;
        return ConsoleUrlGenerator.generateCustomTraceUrl(string2, string4, (String)object);
    }

    private Map getGlobalCustomAttributes() {
        this.updateFirebasePerformanceIfPossibleAndNeeded();
        Map map2 = this.firebasePerformance;
        map2 = map2 != null ? ((FirebasePerformance)((Object)map2)).getAttributes() : Collections.emptyMap();
        return map2;
    }

    public static TransportManager getInstance() {
        return instance;
    }

    private static String getLogcatMsg(GaugeMetric gaugeMetric) {
        boolean bl2 = gaugeMetric.hasGaugeMetadata();
        int n3 = gaugeMetric.getCpuMetricReadingsCount();
        int n4 = gaugeMetric.getAndroidMemoryReadingsCount();
        StringBuilder stringBuilder = new StringBuilder("gauges (hasMetadata: ");
        stringBuilder.append(bl2);
        stringBuilder.append(", cpuGaugeCount: ");
        stringBuilder.append(n3);
        stringBuilder.append(", memoryGaugeCount: ");
        return g30.a(n4, ")", stringBuilder);
    }

    private static String getLogcatMsg(NetworkRequestMetric object) {
        String string2;
        double d2;
        long l2;
        boolean bl2 = ((NetworkRequestMetric)object).hasTimeToResponseCompletedUs();
        if (bl2) {
            l2 = ((NetworkRequestMetric)object).getTimeToResponseCompletedUs();
        } else {
            l2 = 0L;
            d2 = 0.0;
        }
        boolean n3 = ((NetworkRequestMetric)object).hasHttpResponseCode();
        if (n3) {
            int n4 = ((NetworkRequestMetric)object).getHttpResponseCode();
            string2 = String.valueOf(n4);
        } else {
            string2 = "UNKNOWN";
        }
        Cloneable cloneable = Locale.ENGLISH;
        object = ((NetworkRequestMetric)object).getUrl();
        cloneable = new DecimalFormat("#.####");
        d2 = (double)l2 / 1000.0;
        String string3 = ((NumberFormat)cloneable).format(d2);
        return h30_0.a(og_1.a("network request trace: ", (String)object, " (responseCode: ", string2, ", responseTime: "), string3, "ms)");
    }

    private static String getLogcatMsg(PerfMetricOrBuilder perfMetricOrBuilder) {
        boolean bl2 = perfMetricOrBuilder.hasTraceMetric();
        if (bl2) {
            return TransportManager.getLogcatMsg(perfMetricOrBuilder.getTraceMetric());
        }
        bl2 = perfMetricOrBuilder.hasNetworkRequestMetric();
        if (bl2) {
            return TransportManager.getLogcatMsg(perfMetricOrBuilder.getNetworkRequestMetric());
        }
        bl2 = perfMetricOrBuilder.hasGaugeMetric();
        if (bl2) {
            return TransportManager.getLogcatMsg(perfMetricOrBuilder.getGaugeMetric());
        }
        return "log";
    }

    private static String getLogcatMsg(TraceMetric object) {
        long l2 = ((TraceMetric)object).getDurationUs();
        Cloneable cloneable = Locale.ENGLISH;
        object = ((TraceMetric)object).getName();
        cloneable = new DecimalFormat("#.####");
        double d2 = (double)l2 / 1000.0;
        String string2 = ((NumberFormat)cloneable).format(d2);
        return uc0_0.a("trace metric: ", (String)object, " (duration: ", string2, "ms)");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String getVersionName(Context object) {
        PackageManager packageManager;
        String string2 = "";
        try {
            packageManager = object.getPackageManager();
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return string2;
        }
        String string3 = object.getPackageName();
        PackageInfo packageInfo = packageManager.getPackageInfo(string3, 0);
        String string4 = packageInfo.versionName;
        if (string4 != null) return string4;
        return string2;
    }

    private void incrementDropCount(PerfMetric object) {
        boolean bl2 = ((PerfMetric)object).hasTraceMetric();
        long l2 = 1L;
        if (bl2) {
            object = this.appStateMonitor;
            String string2 = Constants$CounterNames.TRACE_EVENT_RATE_LIMITED.toString();
            ((AppStateMonitor)object).incrementCount(string2, l2);
        } else {
            boolean bl3 = ((PerfMetric)object).hasNetworkRequestMetric();
            if (bl3) {
                object = this.appStateMonitor;
                String string3 = Constants$CounterNames.NETWORK_TRACE_EVENT_RATE_LIMITED.toString();
                ((AppStateMonitor)object).incrementCount(string3, l2);
            }
        }
    }

    private boolean isAllowedToCache(PerfMetricOrBuilder object) {
        Integer n3 = null;
        Object object2 = this.cacheMap;
        Object object3 = KEY_AVAILABLE_TRACES_FOR_CACHING;
        object2 = (Integer)object2.get(object3);
        int n4 = (Integer)object2;
        Object object4 = this.cacheMap;
        String string2 = KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING;
        object4 = (Integer)object4.get(string2);
        int n7 = (Integer)object4;
        Object object5 = this.cacheMap;
        String string3 = KEY_AVAILABLE_GAUGES_FOR_CACHING;
        object5 = (Integer)object5.get(string3);
        int n8 = (Integer)object5;
        boolean bl2 = object.hasTraceMetric();
        int n10 = 1;
        if (bl2 && n4 > 0) {
            object = this.cacheMap;
            n3 = n4 - n10;
            object.put(object3, n3);
            return n10 != 0;
        }
        boolean bl3 = object.hasNetworkRequestMetric();
        if (bl3 && n7 > 0) {
            object = this.cacheMap;
            n3 = n7 - n10;
            object.put(string2, n3);
            return n10 != 0;
        }
        bl3 = object.hasGaugeMetric();
        if (bl3 && n8 > 0) {
            object = this.cacheMap;
            n3 = n8 - n10;
            object.put(string3, n3);
            return n10 != 0;
        }
        object3 = logger;
        object = TransportManager.getLogcatMsg((PerfMetricOrBuilder)object);
        Object[] objectArray = new Object[4];
        objectArray[0] = object;
        objectArray[n10] = object2;
        objectArray[2] = object4;
        objectArray[3] = object5;
        ((AndroidLogger)object3).debug("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", objectArray);
        return false;
    }

    private boolean isAllowedToDispatch(PerfMetric object) {
        int n3 = 1;
        Object object2 = this.configResolver;
        boolean bl2 = ((ConfigResolver)object2).isPerformanceMonitoringEnabled();
        if (!bl2) {
            object2 = logger;
            object = TransportManager.getLogcatMsg((PerfMetricOrBuilder)object);
            Object[] objectArray = new Object[n3];
            objectArray[0] = object;
            ((AndroidLogger)object2).info("Performance collection is not enabled, dropping %s", objectArray);
            return false;
        }
        object2 = ((PerfMetric)object).getApplicationInfo();
        bl2 = ((ApplicationInfo)object2).hasAppInstanceId();
        if (!bl2) {
            object2 = logger;
            object = TransportManager.getLogcatMsg((PerfMetricOrBuilder)object);
            Object[] objectArray = new Object[n3];
            objectArray[0] = object;
            ((AndroidLogger)object2).warn("App Instance ID is null or empty, dropping %s", objectArray);
            return false;
        }
        object2 = this.appContext;
        bl2 = PerfMetricValidator.isValid((PerfMetric)object, (Context)object2);
        if (!bl2) {
            object2 = logger;
            object = TransportManager.getLogcatMsg((PerfMetricOrBuilder)object);
            Object[] objectArray = new Object[n3];
            objectArray[0] = object;
            ((AndroidLogger)object2).warn("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", objectArray);
            return false;
        }
        object2 = this.rateLimiter;
        bl2 = ((RateLimiter)object2).isEventSampled((PerfMetric)object);
        if (!bl2) {
            this.incrementDropCount((PerfMetric)object);
            object2 = logger;
            object = TransportManager.getLogcatMsg((PerfMetricOrBuilder)object);
            Object[] objectArray = new Object[n3];
            objectArray[0] = object;
            ((AndroidLogger)object2).info("Event dropped due to device sampling - %s", objectArray);
            return false;
        }
        object2 = this.rateLimiter;
        bl2 = ((RateLimiter)object2).isEventRateLimited((PerfMetric)object);
        if (bl2) {
            this.incrementDropCount((PerfMetric)object);
            object2 = logger;
            object = TransportManager.getLogcatMsg((PerfMetricOrBuilder)object);
            Object[] objectArray = new Object[n3];
            objectArray[0] = object;
            ((AndroidLogger)object2).info("Rate limited (per device) - %s", objectArray);
            return false;
        }
        return n3 != 0;
    }

    private /* synthetic */ void lambda$finishInitialization$0(PendingPerfEvent object) {
        PerfMetric$Builder perfMetric$Builder = ((PendingPerfEvent)object).perfMetricBuilder;
        object = ((PendingPerfEvent)object).appState;
        this.syncLog(perfMetric$Builder, (ApplicationProcessState)object);
    }

    private /* synthetic */ void lambda$log$2(TraceMetric messageLiteOrBuilder, ApplicationProcessState applicationProcessState) {
        messageLiteOrBuilder = PerfMetric.newBuilder().setTraceMetric((TraceMetric)messageLiteOrBuilder);
        this.syncLog((PerfMetric$Builder)messageLiteOrBuilder, applicationProcessState);
    }

    private /* synthetic */ void lambda$log$3(NetworkRequestMetric messageLiteOrBuilder, ApplicationProcessState applicationProcessState) {
        messageLiteOrBuilder = PerfMetric.newBuilder().setNetworkRequestMetric((NetworkRequestMetric)messageLiteOrBuilder);
        this.syncLog((PerfMetric$Builder)messageLiteOrBuilder, applicationProcessState);
    }

    private /* synthetic */ void lambda$log$4(GaugeMetric messageLiteOrBuilder, ApplicationProcessState applicationProcessState) {
        messageLiteOrBuilder = PerfMetric.newBuilder().setGaugeMetric((GaugeMetric)messageLiteOrBuilder);
        this.syncLog((PerfMetric$Builder)messageLiteOrBuilder, applicationProcessState);
    }

    private /* synthetic */ void lambda$onUpdateAppState$1() {
        RateLimiter rateLimiter = this.rateLimiter;
        boolean bl2 = this.isForegroundState;
        rateLimiter.changeRate(bl2);
    }

    private PerfMetric setApplicationInfoAndBuild(PerfMetric$Builder perfMetric$Builder, ApplicationProcessState object) {
        this.updateFirebaseInstallationIdIfPossibleAndNeeded();
        Object object2 = this.applicationInfoBuilder;
        object = ((ApplicationInfo$Builder)object2).setApplicationProcessState((ApplicationProcessState)object);
        boolean bl2 = perfMetric$Builder.hasTraceMetric();
        if (bl2 || (bl2 = perfMetric$Builder.hasNetworkRequestMetric())) {
            object = (ApplicationInfo$Builder)((GeneratedMessageLite$Builder)object).clone();
            object2 = this.getGlobalCustomAttributes();
            object = ((ApplicationInfo$Builder)object).putAllCustomAttributes((Map)object2);
        }
        return (PerfMetric)perfMetric$Builder.setApplicationInfo((ApplicationInfo$Builder)object).build();
    }

    private void syncInit() {
        Rate rate;
        Object object;
        this.appContext = object = this.firebaseApp.getApplicationContext();
        object = object.getPackageName();
        this.packageName = object;
        object = ConfigResolver.getInstance();
        this.configResolver = object;
        Object object2 = this.appContext;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        Object object3 = rate;
        rate = new Rate(100, 1L, timeUnit);
        object = new RateLimiter((Context)object2, rate, 500L);
        this.rateLimiter = object;
        object = AppStateMonitor.getInstance();
        this.appStateMonitor = object;
        object2 = this.flgTransportFactoryProvider;
        object3 = this.configResolver.getAndCacheLogSourceName();
        object = new FlgTransport((Provider)object2, (String)object3);
        this.flgTransport = object;
        this.finishInitialization();
    }

    private void syncLog(PerfMetric$Builder object, ApplicationProcessState applicationProcessState) {
        boolean bl2 = this.isInitialized();
        if (!bl2) {
            bl2 = this.isAllowedToCache((PerfMetricOrBuilder)object);
            if (bl2) {
                Object object2 = logger;
                Object object3 = TransportManager.getLogcatMsg((PerfMetricOrBuilder)object);
                int n3 = 1;
                Object[] objectArray = new Object[n3];
                objectArray[0] = object3;
                ((AndroidLogger)object2).debug("Transport is not initialized yet, %s will be queued for to be dispatched later", objectArray);
                object2 = this.pendingEventsQueue;
                object3 = new PendingPerfEvent((PerfMetric$Builder)object, applicationProcessState);
                ((ConcurrentLinkedQueue)object2).add(object3);
            }
            return;
        }
        boolean bl3 = this.isAllowedToDispatch((PerfMetric)(object = this.setApplicationInfoAndBuild((PerfMetric$Builder)object, applicationProcessState)));
        if (bl3) {
            this.dispatchLog((PerfMetric)object);
            object = SessionManager.getInstance();
            ((SessionManager)object).stopGaugeCollectionIfSessionRunningTooLong();
        }
    }

    private void updateFirebaseInstallationIdIfPossibleAndNeeded() {
        block15: {
            Object object;
            Object object2;
            Object object3;
            boolean bl2;
            block11: {
                boolean bl3;
                block16: {
                    ExecutionException executionException2;
                    Object object4;
                    int n3;
                    block14: {
                        InterruptedException interruptedException2;
                        block13: {
                            bl2 = false;
                            object3 = null;
                            n3 = 1;
                            object2 = this.configResolver;
                            bl3 = ((ConfigResolver)object2).isPerformanceMonitoringEnabled();
                            if (!bl3) break block15;
                            object2 = this.applicationInfoBuilder;
                            bl3 = ((ApplicationInfo$Builder)object2).hasAppInstanceId();
                            if (bl3 && !(bl3 = this.isForegroundState)) {
                                return;
                            }
                            object2 = this.firebaseInstallationsApi;
                            object2 = object2.getId();
                            object4 = TimeUnit.MILLISECONDS;
                            long l2 = 60000L;
                            object2 = Tasks.await((Task)object2, l2, (TimeUnit)((Object)object4));
                            try {
                                object2 = (String)object2;
                                break block11;
                            }
                            catch (TimeoutException timeoutException) {
                            }
                            catch (InterruptedException interruptedException2) {
                                break block13;
                            }
                            catch (ExecutionException executionException2) {
                                break block14;
                            }
                            object4 = logger;
                            object2 = timeoutException.getMessage();
                            object = new Object[n3];
                            object[0] = object2;
                            object3 = "Task to retrieve Installation Id is timed out: %s";
                            ((AndroidLogger)object4).error((String)object3, object);
                            break block16;
                        }
                        object4 = logger;
                        object2 = interruptedException2.getMessage();
                        object = new Object[n3];
                        object[0] = object2;
                        object3 = "Task to retrieve Installation Id is interrupted: %s";
                        ((AndroidLogger)object4).error((String)object3, object);
                        break block16;
                    }
                    object4 = logger;
                    object2 = executionException2.getMessage();
                    object = new Object[n3];
                    object[0] = object2;
                    object3 = "Unable to retrieve Installation Id: %s";
                    ((AndroidLogger)object4).error((String)object3, object);
                }
                bl3 = false;
                object2 = null;
            }
            bl2 = TextUtils.isEmpty((CharSequence)object2);
            if (!bl2) {
                object3 = this.applicationInfoBuilder;
                ((ApplicationInfo$Builder)object3).setAppInstanceId((String)object2);
            } else {
                object3 = logger;
                object = "Firebase Installation Id is empty, contact Firebase Support for debugging.";
                ((AndroidLogger)object3).warn((String)object);
            }
        }
    }

    private void updateFirebasePerformanceIfPossibleAndNeeded() {
        boolean bl2;
        FirebasePerformance firebasePerformance = this.firebasePerformance;
        if (firebasePerformance == null && (bl2 = this.isInitialized())) {
            this.firebasePerformance = firebasePerformance = FirebasePerformance.getInstance();
        }
    }

    public void clearAppInstanceId() {
        this.applicationInfoBuilder.clearAppInstanceId();
    }

    public ConcurrentLinkedQueue getPendingEventsQueue() {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.pendingEventsQueue;
        ConcurrentLinkedQueue concurrentLinkedQueue2 = new ConcurrentLinkedQueue(concurrentLinkedQueue);
        return concurrentLinkedQueue2;
    }

    public void initialize(FirebaseApp object, FirebaseInstallationsApi object2, Provider provider) {
        this.firebaseApp = object;
        this.projectId = object = ((FirebaseApp)object).getOptions().getProjectId();
        this.firebaseInstallationsApi = object2;
        this.flgTransportFactoryProvider = provider;
        object = this.executorService;
        object2 = new fn0_0(this, 1);
        object.execute((Runnable)object2);
    }

    public void initializeForTest(FirebaseApp object, FirebasePerformance object2, FirebaseInstallationsApi firebaseInstallationsApi, Provider provider, ConfigResolver configResolver, RateLimiter rateLimiter, AppStateMonitor appStateMonitor, FlgTransport flgTransport, ExecutorService executorService) {
        String string2;
        this.firebaseApp = object;
        this.projectId = string2 = ((FirebaseApp)object).getOptions().getProjectId();
        object = ((FirebaseApp)object).getApplicationContext();
        this.appContext = object;
        this.firebasePerformance = object2;
        this.firebaseInstallationsApi = firebaseInstallationsApi;
        this.flgTransportFactoryProvider = provider;
        this.configResolver = configResolver;
        this.rateLimiter = rateLimiter;
        this.appStateMonitor = appStateMonitor;
        this.flgTransport = flgTransport;
        this.executorService = executorService;
        object = this.cacheMap;
        object2 = 50;
        object.put(KEY_AVAILABLE_TRACES_FOR_CACHING, object2);
        this.cacheMap.put(KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING, object2);
        this.cacheMap.put(KEY_AVAILABLE_GAUGES_FOR_CACHING, object2);
        this.finishInitialization();
    }

    public boolean isInitialized() {
        return this.isTransportInitialized.get();
    }

    public void log(GaugeMetric gaugeMetric) {
        ApplicationProcessState applicationProcessState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.log(gaugeMetric, applicationProcessState);
    }

    public void log(GaugeMetric gaugeMetric, ApplicationProcessState applicationProcessState) {
        ExecutorService executorService = this.executorService;
        tr3_0 tr3_02 = new tr3_0(this, gaugeMetric, applicationProcessState);
        executorService.execute(tr3_02);
    }

    public void log(NetworkRequestMetric networkRequestMetric) {
        ApplicationProcessState applicationProcessState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.log(networkRequestMetric, applicationProcessState);
    }

    public void log(NetworkRequestMetric networkRequestMetric, ApplicationProcessState applicationProcessState) {
        ExecutorService executorService = this.executorService;
        en0_0 en0_02 = new en0_0(this, 1, networkRequestMetric, applicationProcessState);
        executorService.execute(en0_02);
    }

    public void log(TraceMetric traceMetric) {
        ApplicationProcessState applicationProcessState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.log(traceMetric, applicationProcessState);
    }

    public void log(TraceMetric traceMetric, ApplicationProcessState applicationProcessState) {
        ExecutorService executorService = this.executorService;
        dn0_0 dn0_02 = new dn0_0(this, 1, traceMetric, applicationProcessState);
        executorService.execute(dn0_02);
    }

    public void onUpdateAppState(ApplicationProcessState object) {
        boolean bl2;
        Object object2 = ApplicationProcessState.FOREGROUND;
        if (object == object2) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        this.isForegroundState = bl2;
        bl2 = this.isInitialized();
        if (bl2) {
            object = this.executorService;
            object2 = new sr3_0(this, 0);
            object.execute((Runnable)object2);
        }
    }

    public void setInitialized(boolean bl2) {
        this.isTransportInitialized.set(bl2);
    }
}

