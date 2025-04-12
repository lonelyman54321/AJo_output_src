/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.firebase.perf.session.gauges;

import android.content.Context;
import com.google.firebase.components.Lazy;
import com.google.firebase.inject.Provider;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.gauges.CpuGaugeCollector;
import com.google.firebase.perf.session.gauges.GaugeManager$1;
import com.google.firebase.perf.session.gauges.GaugeMetadataManager;
import com.google.firebase.perf.session.gauges.MemoryGaugeCollector;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.AndroidMemoryReading;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.CpuMetricReading;
import com.google.firebase.perf.v1.GaugeMetadata;
import com.google.firebase.perf.v1.GaugeMetadata$Builder;
import com.google.firebase.perf.v1.GaugeMetric;
import com.google.firebase.perf.v1.GaugeMetric$Builder;
import com.google.firebase.perf.v1.GaugeMetricOrBuilder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20L;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = 255L;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20L;
    private static final GaugeManager instance;
    private static final AndroidLogger logger;
    private ApplicationProcessState applicationProcessState;
    private final ConfigResolver configResolver;
    private final Lazy cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final Lazy gaugeManagerExecutor;
    private GaugeMetadataManager gaugeMetadataManager;
    private final Lazy memoryGaugeCollector;
    private String sessionId;
    private final TransportManager transportManager;

    static {
        GaugeManager gaugeManager;
        logger = AndroidLogger.getInstance();
        instance = gaugeManager = new GaugeManager();
    }

    private GaugeManager() {
        GaugeManager gaugeManager;
        Lazy lazy = new Lazy((Provider)((Object)gaugeManager));
        TransportManager transportManager = TransportManager.getInstance();
        ConfigResolver configResolver = ConfigResolver.getInstance();
        Lazy lazy2 = new Lazy((Provider)((Object)gaugeManager));
        super();
        Lazy lazy3 = new Lazy((Provider)((Object)gaugeManager));
        gaugeManager = this;
        this(lazy, transportManager, configResolver, null, lazy2, lazy3);
    }

    public GaugeManager(Lazy lazy, TransportManager transportManager, ConfigResolver configResolver, GaugeMetadataManager gaugeMetadataManager, Lazy lazy2, Lazy lazy3) {
        ApplicationProcessState applicationProcessState;
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = applicationProcessState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = lazy;
        this.transportManager = transportManager;
        this.configResolver = configResolver;
        this.gaugeMetadataManager = gaugeMetadataManager;
        this.cpuGaugeCollector = lazy2;
        this.memoryGaugeCollector = lazy3;
    }

    public static /* synthetic */ void a(GaugeManager gaugeManager, String string2, ApplicationProcessState applicationProcessState) {
        gaugeManager.lambda$startCollectingGauges$2(string2, applicationProcessState);
    }

    public static /* synthetic */ MemoryGaugeCollector b() {
        return memoryGaugeCollector = new MemoryGaugeCollector();
    }

    public static /* synthetic */ CpuGaugeCollector c() {
        return cpuGaugeCollector = new CpuGaugeCollector();
    }

    private static void collectGaugeMetricOnce(CpuGaugeCollector cpuGaugeCollector, MemoryGaugeCollector memoryGaugeCollector, Timer timer) {
        cpuGaugeCollector.collectOnce(timer);
        memoryGaugeCollector.collectOnce(timer);
    }

    public static /* synthetic */ void d(GaugeManager gaugeManager, String string2, ApplicationProcessState applicationProcessState) {
        gaugeManager.lambda$stopCollectingGauges$3(string2, applicationProcessState);
    }

    private long getCpuGaugeCollectionFrequencyMs(ApplicationProcessState object) {
        long l2;
        int[] nArray = GaugeManager$1.$SwitchMap$com$google$firebase$perf$v1$ApplicationProcessState;
        int n3 = ((Enum)object).ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        long l3 = -1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                l2 = l3;
            } else {
                object = this.configResolver;
                l2 = ((ConfigResolver)object).getSessionsCpuCaptureFrequencyForegroundMs();
            }
        } else {
            object = this.configResolver;
            l2 = ((ConfigResolver)object).getSessionsCpuCaptureFrequencyBackgroundMs();
        }
        n3 = (int)(CpuGaugeCollector.isInvalidCollectionFrequency(l2) ? 1 : 0);
        if (n3 != 0) {
            return l3;
        }
        return l2;
    }

    private GaugeMetadata getGaugeMetadata() {
        GaugeMetadata$Builder gaugeMetadata$Builder = GaugeMetadata.newBuilder();
        int n3 = this.gaugeMetadataManager.getDeviceRamSizeKb();
        gaugeMetadata$Builder = gaugeMetadata$Builder.setDeviceRamSizeKb(n3);
        n3 = this.gaugeMetadataManager.getMaxAppJavaHeapMemoryKb();
        gaugeMetadata$Builder = gaugeMetadata$Builder.setMaxAppJavaHeapMemoryKb(n3);
        n3 = this.gaugeMetadataManager.getMaxEncouragedAppJavaHeapMemoryKb();
        return (GaugeMetadata)gaugeMetadata$Builder.setMaxEncouragedAppJavaHeapMemoryKb(n3).build();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static GaugeManager getInstance() {
        Class<GaugeManager> clazz = GaugeManager.class;
        synchronized (clazz) {
            return instance;
        }
    }

    private long getMemoryGaugeCollectionFrequencyMs(ApplicationProcessState object) {
        long l2;
        int[] nArray = GaugeManager$1.$SwitchMap$com$google$firebase$perf$v1$ApplicationProcessState;
        int n3 = ((Enum)object).ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        long l3 = -1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                l2 = l3;
            } else {
                object = this.configResolver;
                l2 = ((ConfigResolver)object).getSessionsMemoryCaptureFrequencyForegroundMs();
            }
        } else {
            object = this.configResolver;
            l2 = ((ConfigResolver)object).getSessionsMemoryCaptureFrequencyBackgroundMs();
        }
        n3 = (int)(MemoryGaugeCollector.isInvalidCollectionFrequency(l2) ? 1 : 0);
        if (n3 != 0) {
            return l3;
        }
        return l2;
    }

    private /* synthetic */ void lambda$startCollectingGauges$2(String string2, ApplicationProcessState applicationProcessState) {
        this.syncFlush(string2, applicationProcessState);
    }

    private /* synthetic */ void lambda$stopCollectingGauges$3(String string2, ApplicationProcessState applicationProcessState) {
        this.syncFlush(string2, applicationProcessState);
    }

    private boolean startCollectingCpuMetrics(long l2, Timer timer) {
        long l3 = -1;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            logger.debug("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        ((CpuGaugeCollector)this.cpuGaugeCollector.get()).startCollecting(l2, timer);
        return true;
    }

    private long startCollectingGauges(ApplicationProcessState applicationProcessState, Timer timer) {
        long l2 = this.getCpuGaugeCollectionFrequencyMs(applicationProcessState);
        boolean bl2 = this.startCollectingCpuMetrics(l2, timer);
        long l3 = -1;
        if (!bl2) {
            l2 = l3;
        }
        long l4 = this.getMemoryGaugeCollectionFrequencyMs(applicationProcessState);
        Object object = this.startCollectingMemoryMetrics(l4, timer);
        if (object) {
            long l7;
            object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            l2 = !object ? l4 : (l7 = Math.min(l2, l4));
        }
        return l2;
    }

    private boolean startCollectingMemoryMetrics(long l2, Timer timer) {
        long l3 = -1;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            logger.debug("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        ((MemoryGaugeCollector)this.memoryGaugeCollector.get()).startCollecting(l2, timer);
        return true;
    }

    private void syncFlush(String object, ApplicationProcessState applicationProcessState) {
        Object object2;
        boolean bl2;
        GaugeMetricOrBuilder gaugeMetricOrBuilder = GaugeMetric.newBuilder();
        while (!(bl2 = ((ConcurrentLinkedQueue)(object2 = ((CpuGaugeCollector)this.cpuGaugeCollector.get()).cpuMetricReadings)).isEmpty())) {
            object2 = (CpuMetricReading)((CpuGaugeCollector)this.cpuGaugeCollector.get()).cpuMetricReadings.poll();
            gaugeMetricOrBuilder.addCpuMetricReadings((CpuMetricReading)object2);
        }
        while (!(bl2 = ((ConcurrentLinkedQueue)(object2 = ((MemoryGaugeCollector)this.memoryGaugeCollector.get()).memoryMetricReadings)).isEmpty())) {
            object2 = (AndroidMemoryReading)((MemoryGaugeCollector)this.memoryGaugeCollector.get()).memoryMetricReadings.poll();
            gaugeMetricOrBuilder.addAndroidMemoryReadings((AndroidMemoryReading)object2);
        }
        gaugeMetricOrBuilder.setSessionId((String)object);
        object = this.transportManager;
        gaugeMetricOrBuilder = (GaugeMetric)gaugeMetricOrBuilder.build();
        ((TransportManager)object).log((GaugeMetric)gaugeMetricOrBuilder, applicationProcessState);
    }

    public void collectGaugeMetricOnce(Timer timer) {
        CpuGaugeCollector cpuGaugeCollector = (CpuGaugeCollector)this.cpuGaugeCollector.get();
        MemoryGaugeCollector memoryGaugeCollector = (MemoryGaugeCollector)this.memoryGaugeCollector.get();
        GaugeManager.collectGaugeMetricOnce(cpuGaugeCollector, memoryGaugeCollector, timer);
    }

    public void initializeGaugeMetadataManager(Context context) {
        GaugeMetadataManager gaugeMetadataManager;
        this.gaugeMetadataManager = gaugeMetadataManager = new GaugeMetadataManager(context);
    }

    public boolean logGaugeMetadata(String object, ApplicationProcessState applicationProcessState) {
        Object object2 = this.gaugeMetadataManager;
        if (object2 != null) {
            object = GaugeMetric.newBuilder().setSessionId((String)object);
            object2 = this.getGaugeMetadata();
            object = (GaugeMetric)((GaugeMetric$Builder)object).setGaugeMetadata((GaugeMetadata)object2).build();
            this.transportManager.log((GaugeMetric)object, applicationProcessState);
            return true;
        }
        return false;
    }

    public void startCollectingGauges(PerfSession scheduledFuture, ApplicationProcessState object) {
        long l2;
        long l3;
        long l4;
        long l7;
        Object object2 = this.sessionId;
        if (object2 != null) {
            this.stopCollectingGauges();
        }
        if ((l7 = (l4 = (l3 = this.startCollectingGauges((ApplicationProcessState)object, (Timer)(object2 = ((PerfSession)((Object)scheduledFuture)).getTimer()))) - (l2 = (long)-1)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
            logger.warn("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        scheduledFuture = ((PerfSession)((Object)scheduledFuture)).sessionId();
        this.sessionId = scheduledFuture;
        this.applicationProcessState = object;
        Object object3 = this.gaugeManagerExecutor;
        Object object4 = object3 = ((Lazy)object3).get();
        object4 = (ScheduledExecutorService)object3;
        my0_0 my0_02 = new my0_0(this, (String)((Object)scheduledFuture), (ApplicationProcessState)object);
        long l8 = 20;
        long l12 = l3 * l8;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        scheduledFuture = object4.scheduleAtFixedRate(my0_02, l12, l12, timeUnit);
        try {
            this.gaugeManagerDataCollectionJob = scheduledFuture;
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            object = logger;
            String string2 = "Unable to start collecting Gauges: ";
            object2 = new StringBuilder(string2);
            String string3 = rejectedExecutionException.getMessage();
            ((StringBuilder)object2).append(string3);
            string3 = ((StringBuilder)object2).toString();
            ((AndroidLogger)object).warn(string3);
        }
    }

    public void stopCollectingGauges() {
        ly0_1 ly0_12;
        Object object = this.sessionId;
        if (object == null) {
            return;
        }
        ApplicationProcessState applicationProcessState = this.applicationProcessState;
        ((CpuGaugeCollector)this.cpuGaugeCollector.get()).stopCollecting();
        ((MemoryGaugeCollector)this.memoryGaugeCollector.get()).stopCollecting();
        Object object2 = this.gaugeManagerDataCollectionJob;
        if (object2 != null) {
            ly0_12 = null;
            object2.cancel(false);
        }
        object2 = (ScheduledExecutorService)this.gaugeManagerExecutor.get();
        ly0_12 = new ly0_1(this, (String)object, applicationProcessState);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        object2.schedule(ly0_12, (long)20, timeUnit);
        this.sessionId = null;
        this.applicationProcessState = object = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
    }
}

