/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.StorageUnit;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.Utils;
import com.google.firebase.perf.v1.AndroidMemoryReading;
import com.google.firebase.perf.v1.AndroidMemoryReading$Builder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class MemoryGaugeCollector {
    public static final long INVALID_MEMORY_COLLECTION_FREQUENCY = 255L;
    private static final int UNSET_MEMORY_METRIC_COLLECTION_RATE = 255;
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private long memoryMetricCollectionRateMs;
    private final ScheduledExecutorService memoryMetricCollectorExecutor;
    private ScheduledFuture memoryMetricCollectorJob;
    public final ConcurrentLinkedQueue memoryMetricReadings;
    private final Runtime runtime;

    public MemoryGaugeCollector() {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        Runtime runtime = Runtime.getRuntime();
        this(scheduledExecutorService, runtime);
    }

    public MemoryGaugeCollector(ScheduledExecutorService concurrentLinkedQueue, Runtime runtime) {
        this.memoryMetricCollectorJob = null;
        this.memoryMetricCollectionRateMs = -1;
        this.memoryMetricCollectorExecutor = concurrentLinkedQueue;
        this.memoryMetricReadings = concurrentLinkedQueue = new ConcurrentLinkedQueue();
        this.runtime = runtime;
    }

    public static /* synthetic */ void a(MemoryGaugeCollector memoryGaugeCollector, Timer timer) {
        memoryGaugeCollector.lambda$scheduleMemoryMetricCollectionWithRate$0(timer);
    }

    public static /* synthetic */ void b(MemoryGaugeCollector memoryGaugeCollector, Timer timer) {
        memoryGaugeCollector.lambda$scheduleMemoryMetricCollectionOnce$1(timer);
    }

    private int getCurrentUsedAppJavaHeapMemoryKb() {
        StorageUnit storageUnit = StorageUnit.BYTES;
        long l2 = this.runtime.totalMemory();
        long l3 = this.runtime.freeMemory();
        return Utils.saturatedIntCast(storageUnit.toKilobytes(l2 -= l3));
    }

    public static boolean isInvalidCollectionFrequency(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object <= 0;
        return bl2;
    }

    private /* synthetic */ void lambda$scheduleMemoryMetricCollectionOnce$1(Timer object) {
        if ((object = this.syncCollectMemoryMetric((Timer)object)) != null) {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.memoryMetricReadings;
            concurrentLinkedQueue.add(object);
        }
    }

    private /* synthetic */ void lambda$scheduleMemoryMetricCollectionWithRate$0(Timer object) {
        if ((object = this.syncCollectMemoryMetric((Timer)object)) != null) {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.memoryMetricReadings;
            concurrentLinkedQueue.add(object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void scheduleMemoryMetricCollectionOnce(Timer object) {
        String string2 = "Unable to collect Memory Metric: ";
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    try {
                        ScheduledExecutorService scheduledExecutorService = this.memoryMetricCollectorExecutor;
                        un1_1 un1_12 = new un1_1(this, (Timer)object);
                        object = TimeUnit.MILLISECONDS;
                        long l2 = 0L;
                        scheduledExecutorService.schedule(un1_12, l2, (TimeUnit)((Object)object));
                    }
                    catch (RejectedExecutionException rejectedExecutionException) {
                        AndroidLogger androidLogger = logger;
                        StringBuilder stringBuilder = new StringBuilder(string2);
                        String string3 = rejectedExecutionException.getMessage();
                        stringBuilder.append(string3);
                        string3 = stringBuilder.toString();
                        androidLogger.warn(string3);
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void scheduleMemoryMetricCollectionWithRate(long l2, Timer object) {
        String string2 = "Unable to start collecting Memory Metrics: ";
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    this.memoryMetricCollectionRateMs = l2;
                    try {
                        ScheduledFuture<?> scheduledFuture;
                        ScheduledExecutorService scheduledExecutorService = this.memoryMetricCollectorExecutor;
                        tn1_1 tn1_12 = new tn1_1(this, (Timer)object);
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        long l3 = 0L;
                        this.memoryMetricCollectorJob = scheduledFuture = scheduledExecutorService.scheduleAtFixedRate(tn1_12, l3, l2, timeUnit);
                    }
                    catch (RejectedExecutionException rejectedExecutionException) {
                        AndroidLogger androidLogger = logger;
                        object = new StringBuilder(string2);
                        String string3 = rejectedExecutionException.getMessage();
                        ((StringBuilder)object).append(string3);
                        string3 = ((StringBuilder)object).toString();
                        androidLogger.warn(string3);
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

    private AndroidMemoryReading syncCollectMemoryMetric(Timer object) {
        if (object == null) {
            return null;
        }
        long l2 = ((Timer)object).getCurrentTimestampMicros();
        object = AndroidMemoryReading.newBuilder().setClientTimeUs(l2);
        int n3 = this.getCurrentUsedAppJavaHeapMemoryKb();
        return (AndroidMemoryReading)((AndroidMemoryReading$Builder)object).setUsedAppJavaHeapMemoryKb(n3).build();
    }

    public void collectOnce(Timer timer) {
        this.scheduleMemoryMetricCollectionOnce(timer);
    }

    public void startCollecting(long l2, Timer timer) {
        boolean bl2 = MemoryGaugeCollector.isInvalidCollectionFrequency(l2);
        if (bl2) {
            return;
        }
        ScheduledFuture scheduledFuture = this.memoryMetricCollectorJob;
        if (scheduledFuture != null) {
            long l3 = this.memoryMetricCollectionRateMs;
            long l4 = l3 - l2;
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object != false) {
                this.stopCollecting();
                this.scheduleMemoryMetricCollectionWithRate(l2, timer);
            }
            return;
        }
        this.scheduleMemoryMetricCollectionWithRate(l2, timer);
    }

    public void stopCollecting() {
        ScheduledFuture scheduledFuture = this.memoryMetricCollectorJob;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.memoryMetricCollectorJob = null;
        this.memoryMetricCollectionRateMs = -1;
    }
}

