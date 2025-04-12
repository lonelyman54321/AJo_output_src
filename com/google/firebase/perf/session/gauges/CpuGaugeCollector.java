/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Process
 *  android.system.Os
 *  android.system.OsConstants
 */
package com.google.firebase.perf.session.gauges;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.CpuMetricReading;
import com.google.firebase.perf.v1.CpuMetricReading$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class CpuGaugeCollector {
    private static final int CSTIME_POSITION_IN_PROC_PID_STAT = 16;
    private static final int CUTIME_POSITION_IN_PROC_PID_STAT = 15;
    public static final long INVALID_CPU_COLLECTION_FREQUENCY = 255L;
    private static final int INVALID_SC_PER_CPU_CLOCK_TICK = 255;
    private static final long MICROSECONDS_PER_SECOND = 0L;
    private static final int STIME_POSITION_IN_PROC_PID_STAT = 14;
    private static final int UNSET_CPU_METRIC_COLLECTION_RATE = 255;
    private static final int UTIME_POSITION_IN_PROC_PID_STAT = 13;
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final long clockTicksPerSecond;
    private long cpuMetricCollectionRateMs = -1;
    private final ScheduledExecutorService cpuMetricCollectorExecutor;
    private ScheduledFuture cpuMetricCollectorJob = null;
    public final ConcurrentLinkedQueue cpuMetricReadings;
    private final String procFileName;

    static {
        MICROSECONDS_PER_SECOND = TimeUnit.SECONDS.toMicros(1L);
    }

    public CpuGaugeCollector() {
        long l2;
        Object object = new ConcurrentLinkedQueue();
        this.cpuMetricReadings = object;
        this.cpuMetricCollectorExecutor = object = Executors.newSingleThreadScheduledExecutor();
        int n3 = Process.myPid();
        StringBuilder stringBuilder = new StringBuilder("/proc/");
        object = Integer.toString(n3);
        stringBuilder.append((String)object);
        stringBuilder.append("/stat");
        this.procFileName = object = stringBuilder.toString();
        this.clockTicksPerSecond = l2 = this.getClockTicksPerSecond();
    }

    public CpuGaugeCollector(ScheduledExecutorService scheduledExecutorService, String string2, long l2) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        this.cpuMetricReadings = concurrentLinkedQueue = new ConcurrentLinkedQueue();
        this.cpuMetricCollectorExecutor = scheduledExecutorService;
        this.procFileName = string2;
        this.clockTicksPerSecond = l2;
    }

    public static /* synthetic */ void a(CpuGaugeCollector cpuGaugeCollector, Timer timer) {
        cpuGaugeCollector.lambda$scheduleCpuMetricCollectionWithRate$0(timer);
    }

    public static /* synthetic */ void b(CpuGaugeCollector cpuGaugeCollector, Timer timer) {
        cpuGaugeCollector.lambda$scheduleCpuMetricCollectionOnce$1(timer);
    }

    private long convertClockTicksToMicroseconds(long l2) {
        double d2 = l2;
        double d5 = this.clockTicksPerSecond;
        d2 /= d5;
        d5 = MICROSECONDS_PER_SECOND;
        return Math.round(d2 * d5);
    }

    private long getClockTicksPerSecond() {
        return Os.sysconf((int)OsConstants._SC_CLK_TCK);
    }

    public static boolean isInvalidCollectionFrequency(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object <= 0;
        return bl2;
    }

    private /* synthetic */ void lambda$scheduleCpuMetricCollectionOnce$1(Timer object) {
        if ((object = this.syncCollectCpuMetric((Timer)object)) != null) {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.cpuMetricReadings;
            concurrentLinkedQueue.add(object);
        }
    }

    private /* synthetic */ void lambda$scheduleCpuMetricCollectionWithRate$0(Timer object) {
        if ((object = this.syncCollectCpuMetric((Timer)object)) != null) {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.cpuMetricReadings;
            concurrentLinkedQueue.add(object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void scheduleCpuMetricCollectionOnce(Timer object) {
        String string2 = "Unable to collect Cpu Metric: ";
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    try {
                        ScheduledExecutorService scheduledExecutorService = this.cpuMetricCollectorExecutor;
                        jd0 jd02 = new jd0(this, (Timer)object);
                        object = TimeUnit.MILLISECONDS;
                        long l2 = 0L;
                        scheduledExecutorService.schedule(jd02, l2, (TimeUnit)((Object)object));
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
    private void scheduleCpuMetricCollectionWithRate(long l2, Timer object) {
        String string2 = "Unable to start collecting Cpu Metrics: ";
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    this.cpuMetricCollectionRateMs = l2;
                    try {
                        ScheduledFuture<?> scheduledFuture;
                        ScheduledExecutorService scheduledExecutorService = this.cpuMetricCollectorExecutor;
                        id0_0 id0_02 = new id0_0(this, (Timer)object);
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        long l3 = 0L;
                        this.cpuMetricCollectorJob = scheduledFuture = scheduledExecutorService.scheduleAtFixedRate(id0_02, l3, l2, timeUnit);
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

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private CpuMetricReading syncCollectCpuMetric(Timer object) {
        IOException iOException222222;
        Object object2;
        Object object3;
        String string2;
        block13: {
            String string3;
            if (object == null) {
                return null;
            }
            string2 = this.procFileName;
            object3 = new FileReader(string2);
            object2 = new BufferedReader((Reader)object3);
            long l2 = ((Timer)object).getCurrentTimestampMicros();
            object = ((BufferedReader)object2).readLine();
            Object object4 = " ";
            object = ((String)object).split((String)object4);
            int n3 = 13;
            object4 = object[n3];
            long l3 = Long.parseLong((String)object4);
            int n4 = 15;
            Object object5 = object[n4];
            long l4 = Long.parseLong((String)object5);
            int n7 = 14;
            Object object6 = object[n7];
            long l7 = Long.parseLong((String)object6);
            int n8 = 16;
            object = object[n8];
            long l8 = Long.parseLong((String)object);
            object = CpuMetricReading.newBuilder();
            object = ((CpuMetricReading$Builder)object).setClientTimeUs(l2);
            l2 = this.convertClockTicksToMicroseconds(l7 += l8);
            object = ((CpuMetricReading$Builder)object).setSystemTimeUs(l2);
            l2 = this.convertClockTicksToMicroseconds(l3 += l4);
            object = ((CpuMetricReading$Builder)object).setUserTimeUs(l2);
            object = ((GeneratedMessageLite$Builder)object).build();
            object = (CpuMetricReading)object;
            ((BufferedReader)object2).close();
            return object;
            catch (Throwable throwable) {
                try {
                    ((BufferedReader)object2).close();
                    throw throwable;
                }
                catch (Throwable throwable2) {
                    try {
                        throwable.addSuppressed(throwable2);
                        throw throwable;
                    }
                    catch (NullPointerException nullPointerException) {
                    }
                    catch (NumberFormatException numberFormatException) {
                    }
                    catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    }
                    catch (IOException iOException222222) {
                        break block13;
                    }
                }
            }
            object2 = logger;
            string2 = "Unexpected '/proc/[pid]/stat' file format encountered: ";
            object3 = new StringBuilder(string2);
            string3 = ((Throwable)((Object)string3)).getMessage();
            ((StringBuilder)object3).append(string3);
            string3 = ((StringBuilder)object3).toString();
            ((AndroidLogger)object2).warn(string3);
            return null;
        }
        object2 = logger;
        string2 = "Unable to read 'proc/[pid]/stat' file: ";
        object3 = new StringBuilder(string2);
        String string4 = iOException222222.getMessage();
        ((StringBuilder)object3).append(string4);
        string4 = ((StringBuilder)object3).toString();
        ((AndroidLogger)object2).warn(string4);
        return null;
    }

    public void collectOnce(Timer timer) {
        this.scheduleCpuMetricCollectionOnce(timer);
    }

    public void startCollecting(long l2, Timer timer) {
        long l3;
        long l4 = this.clockTicksPerSecond;
        long l7 = -1;
        long l8 = l4 - l7;
        Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object != false && (object = (l3 = l4 - (l7 = 0L)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) != false) {
            boolean bl2 = CpuGaugeCollector.isInvalidCollectionFrequency(l2);
            if (bl2) {
                return;
            }
            ScheduledFuture scheduledFuture = this.cpuMetricCollectorJob;
            if (scheduledFuture != null) {
                l4 = this.cpuMetricCollectionRateMs;
                long l12 = l4 - l2;
                Object object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                if (object2 != false) {
                    this.stopCollecting();
                    this.scheduleCpuMetricCollectionWithRate(l2, timer);
                }
                return;
            }
            this.scheduleCpuMetricCollectionWithRate(l2, timer);
        }
    }

    public void stopCollecting() {
        ScheduledFuture scheduledFuture = this.cpuMetricCollectorJob;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.cpuMetricCollectorJob = null;
        this.cpuMetricCollectionRateMs = -1;
    }
}

