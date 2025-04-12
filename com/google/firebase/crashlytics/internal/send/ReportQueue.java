/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
package com.google.firebase.crashlytics.internal.send;

import android.os.SystemClock;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.runtime.ForcedSender;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.crashlytics.internal.send.ReportQueue$ReportRunnable;
import com.google.firebase.crashlytics.internal.send.a;
import com.google.firebase.crashlytics.internal.send.b;
import com.google.firebase.crashlytics.internal.settings.Settings;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class ReportQueue {
    private static final int MAX_DELAY_MS = 3600000;
    private static final int MS_PER_MINUTE = 60000;
    private static final int MS_PER_SECOND = 1000;
    private static final int STARTUP_DURATION_MS = 2000;
    private final double base;
    private long lastUpdatedMs;
    private final OnDemandCounter onDemandCounter;
    private final BlockingQueue queue;
    private final int queueCapacity;
    private final double ratePerMinute;
    private final ThreadPoolExecutor singleThreadExecutor;
    private final long startTimeMs;
    private int step;
    private final long stepDurationMs;
    private final Transport transport;

    public ReportQueue(double d2, double d5, long l2, Transport object, OnDemandCounter arrayBlockingQueue) {
        ThreadPoolExecutor threadPoolExecutor;
        int n3;
        long l3;
        this.ratePerMinute = d2;
        this.base = d5;
        this.stepDurationMs = l2;
        this.transport = object;
        this.onDemandCounter = arrayBlockingQueue;
        this.startTimeMs = l3 = SystemClock.elapsedRealtime();
        this.queueCapacity = n3 = (int)d2;
        this.queue = arrayBlockingQueue = new ArrayBlockingQueue<Runnable>(n3);
        object = TimeUnit.MILLISECONDS;
        this.singleThreadExecutor = threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, (TimeUnit)((Object)object), arrayBlockingQueue);
        this.step = 0;
        this.lastUpdatedMs = 0L;
    }

    public ReportQueue(Transport transport, Settings settings, OnDemandCounter onDemandCounter) {
        double d2 = settings.onDemandUploadRatePerMinute;
        double d5 = settings.onDemandBackoffBase;
        long l2 = (long)settings.onDemandBackoffStepDurationSeconds * 1000L;
        this(d2, d5, l2, transport, onDemandCounter);
    }

    public static /* synthetic */ void a(ReportQueue reportQueue, TaskCompletionSource taskCompletionSource, boolean bl2, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, Exception exception) {
        reportQueue.lambda$sendReport$1(taskCompletionSource, bl2, crashlyticsReportWithSessionId, exception);
    }

    public static /* synthetic */ void access$100(ReportQueue reportQueue, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, TaskCompletionSource taskCompletionSource) {
        reportQueue.sendReport(crashlyticsReportWithSessionId, taskCompletionSource);
    }

    public static /* synthetic */ OnDemandCounter access$200(ReportQueue reportQueue) {
        return reportQueue.onDemandCounter;
    }

    public static /* synthetic */ double access$300(ReportQueue reportQueue) {
        return reportQueue.calcDelay();
    }

    public static /* synthetic */ void access$400(double d2) {
        ReportQueue.sleep(d2);
    }

    public static /* synthetic */ void b(ReportQueue reportQueue, CountDownLatch countDownLatch) {
        reportQueue.lambda$flushScheduledReportsIfAble$0(countDownLatch);
    }

    private double calcDelay() {
        double d2 = this.ratePerMinute;
        double d5 = 60000.0 / d2;
        d2 = this.base;
        double d7 = this.calcStep();
        d2 = Math.pow(d2, d7) * d5;
        return Math.min(3600000.0, d2);
    }

    private int calcStep() {
        long l2 = this.lastUpdatedMs;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            this.lastUpdatedMs = l2 = this.now();
        }
        l2 = this.now();
        l3 = this.lastUpdatedMs;
        l2 -= l3;
        l3 = this.stepDurationMs;
        int n3 = (int)(l2 /= l3);
        int n4 = this.isQueueFull();
        if (n4 != 0) {
            n4 = this.step + n3;
            n3 = 100;
            n4 = Math.min(n3, n4);
        } else {
            n4 = this.step - n3;
            n3 = 0;
            n4 = Math.max(0, n4);
        }
        n3 = this.step;
        if (n3 != n4) {
            long l7;
            this.step = n4;
            this.lastUpdatedMs = l7 = this.now();
        }
        return n4;
    }

    private boolean isQueueAvailable() {
        int n3;
        BlockingQueue blockingQueue = this.queue;
        int n4 = blockingQueue.size();
        if (n4 < (n3 = this.queueCapacity)) {
            n4 = 1;
        } else {
            n4 = 0;
            blockingQueue = null;
        }
        return n4 != 0;
    }

    private boolean isQueueFull() {
        int n3;
        BlockingQueue blockingQueue = this.queue;
        int n4 = blockingQueue.size();
        if (n4 == (n3 = this.queueCapacity)) {
            n4 = 1;
        } else {
            n4 = 0;
            blockingQueue = null;
        }
        return n4 != 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$flushScheduledReportsIfAble$0(CountDownLatch countDownLatch) {
        try {
            Transport transport = this.transport;
            Priority priority = Priority.HIGHEST;
            ForcedSender.sendBlocking(transport, priority);
        }
        catch (Exception exception) {}
        countDownLatch.countDown();
    }

    private /* synthetic */ void lambda$sendReport$1(TaskCompletionSource taskCompletionSource, boolean bl2, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, Exception exception) {
        if (exception != null) {
            taskCompletionSource.trySetException(exception);
            return;
        }
        if (bl2) {
            this.flushScheduledReportsIfAble();
        }
        taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
    }

    private long now() {
        return System.currentTimeMillis();
    }

    private void sendReport(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, TaskCompletionSource taskCompletionSource) {
        boolean bl2;
        Logger logger = Logger.getLogger();
        Object object = new StringBuilder("Sending report through Google DataTransport: ");
        Object object2 = crashlyticsReportWithSessionId.getSessionId();
        ((StringBuilder)object).append((String)object2);
        object = ((StringBuilder)object).toString();
        logger.d((String)object);
        long l2 = SystemClock.elapsedRealtime();
        long l3 = this.startTimeMs;
        l2 -= l3;
        l3 = 2000L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 < 0) {
            bl2 = true;
        } else {
            bl2 = false;
            logger = null;
        }
        object = this.transport;
        object2 = Event.ofUrgent(crashlyticsReportWithSessionId.getReport());
        b b2 = new b(this, taskCompletionSource, bl2, crashlyticsReportWithSessionId);
        object.schedule((Event)object2, b2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void sleep(double d2) {
        long l2 = (long)d2;
        try {
            Thread.sleep(l2);
            return;
        }
        catch (InterruptedException interruptedException) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public TaskCompletionSource enqueueReport(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, boolean bl2) {
        Object object = "Dropping report due to queue being full: ";
        CharSequence charSequence = "Closing task for report: ";
        Object object2 = "Queue size: ";
        String string2 = "Enqueueing report: ";
        BlockingQueue blockingQueue = this.queue;
        synchronized (blockingQueue) {
            Throwable throwable2;
            block5: {
                Object object3;
                TaskCompletionSource taskCompletionSource;
                try {
                    taskCompletionSource = new TaskCompletionSource();
                    if (!bl2) {
                        this.sendReport(crashlyticsReportWithSessionId, taskCompletionSource);
                        return taskCompletionSource;
                    }
                    object3 = this.onDemandCounter;
                    ((OnDemandCounter)object3).incrementRecordedOnDemandExceptions();
                    bl2 = this.isQueueAvailable();
                    if (bl2) {
                        object3 = Logger.getLogger();
                        object = new StringBuilder(string2);
                        string2 = crashlyticsReportWithSessionId.getSessionId();
                        ((StringBuilder)object).append(string2);
                        object = ((StringBuilder)object).toString();
                        ((Logger)object3).d((String)object);
                        object3 = Logger.getLogger();
                        object = new StringBuilder((String)object2);
                        object2 = this.queue;
                        int n3 = object2.size();
                        ((StringBuilder)object).append(n3);
                        object = ((StringBuilder)object).toString();
                        ((Logger)object3).d((String)object);
                        object3 = this.singleThreadExecutor;
                        n3 = 0;
                        object2 = null;
                        object = new ReportQueue$ReportRunnable(this, crashlyticsReportWithSessionId, taskCompletionSource, null);
                        ((ThreadPoolExecutor)object3).execute((Runnable)object);
                        object3 = Logger.getLogger();
                        object = new StringBuilder((String)charSequence);
                        charSequence = crashlyticsReportWithSessionId.getSessionId();
                        ((StringBuilder)object).append((String)charSequence);
                        object = ((StringBuilder)object).toString();
                        ((Logger)object3).d((String)object);
                        taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
                        return taskCompletionSource;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                this.calcStep();
                object3 = Logger.getLogger();
                charSequence = new StringBuilder((String)object);
                object = crashlyticsReportWithSessionId.getSessionId();
                ((StringBuilder)charSequence).append((String)object);
                object = ((StringBuilder)charSequence).toString();
                ((Logger)object3).d((String)object);
                object3 = this.onDemandCounter;
                ((OnDemandCounter)object3).incrementDroppedOnDemandExceptions();
                taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
                return taskCompletionSource;
            }
            throw throwable2;
        }
    }

    public void flushScheduledReportsIfAble() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        a a2 = new a(this, countDownLatch);
        Thread thread2 = new Thread(a2);
        thread2.start();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Utils.awaitUninterruptibly(countDownLatch, 2, timeUnit);
    }
}

