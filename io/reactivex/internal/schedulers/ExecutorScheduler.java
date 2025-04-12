/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.Scheduler$Worker;
import io.reactivex.internal.schedulers.ExecutorScheduler$DelayedDispose;
import io.reactivex.internal.schedulers.ExecutorScheduler$DelayedRunnable;
import io.reactivex.internal.schedulers.ExecutorScheduler$ExecutorWorker;
import io.reactivex.internal.schedulers.ExecutorScheduler$ExecutorWorker$BooleanRunnable;
import io.reactivex.internal.schedulers.ExecutorScheduler$ExecutorWorker$InterruptibleRunnable;
import io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class ExecutorScheduler
extends Scheduler {
    public static final Scheduler e = qt2_2.a;
    public final boolean c;
    public final Executor d;

    public ExecutorScheduler(Executor executor) {
        this.d = executor;
        this.c = false;
    }

    public final Scheduler$Worker a() {
        Executor executor = this.d;
        boolean bl2 = this.c;
        ExecutorScheduler$ExecutorWorker executorScheduler$ExecutorWorker = new ExecutorScheduler$ExecutorWorker(bl2, executor);
        return executorScheduler$ExecutorWorker;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final yr0_2 b(Runnable object) {
        RejectedExecutionException rejectedExecutionException2;
        Executor executor = this.d;
        Object object2 = "run is null";
        x03_0.b(object, (String)object2);
        boolean bl2 = executor instanceof ExecutorService;
        if (bl2) {
            try {
                object2 = new j0_0((Runnable)object);
                executor = (ExecutorService)executor;
                object = executor.submit(object2);
                ((j0_0)object2).a((Future)object);
                return object2;
            }
            catch (RejectedExecutionException rejectedExecutionException2) {}
        } else {
            bl2 = this.c;
            if (bl2) {
                object2 = new ExecutorScheduler$ExecutorWorker$InterruptibleRunnable((Runnable)object, null);
                executor.execute((Runnable)object2);
                return object2;
            }
            object2 = new ExecutorScheduler$ExecutorWorker$BooleanRunnable((Runnable)object);
            executor.execute((Runnable)object2);
            return object2;
        }
        dr2_2.b(rejectedExecutionException2);
        return iz0_2.INSTANCE;
    }

    public final yr0_2 c(Runnable object, long l2, TimeUnit timeUnit) {
        x03_0.b(object, "run is null");
        Object object2 = this.d;
        boolean bl2 = object2 instanceof ScheduledExecutorService;
        if (bl2) {
            lt2_2 lt2_22;
            try {
                lt2_22 = new j0_0((Runnable)object);
                object2 = (ScheduledExecutorService)object2;
            }
            catch (RejectedExecutionException rejectedExecutionException) {
                dr2_2.b(rejectedExecutionException);
                return iz0_2.INSTANCE;
            }
            object = object2.schedule(lt2_22, l2, timeUnit);
            lt2_22.a((Future)object);
            return lt2_22;
        }
        object2 = new ExecutorScheduler$DelayedRunnable((Runnable)object);
        object = new ExecutorScheduler$DelayedDispose(this, (ExecutorScheduler$DelayedRunnable)object2);
        object = e.c((Runnable)object, l2, timeUnit);
        lz2_2 lz2_22 = ((ExecutorScheduler$DelayedRunnable)object2).a;
        lz2_22.getClass();
        gr0_2.replace(lz2_22, (yr0_2)object);
        return object2;
    }

    public final yr0_2 d(Runnable object, long l2, long l3, TimeUnit timeUnit) {
        Executor executor = this.d;
        boolean bl2 = executor instanceof ScheduledExecutorService;
        if (bl2) {
            Executor executor2;
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask;
            try {
                scheduledDirectPeriodicTask = new j0_0((Runnable)object);
                executor2 = executor;
            }
            catch (RejectedExecutionException rejectedExecutionException) {
                dr2_2.b(rejectedExecutionException);
                return iz0_2.INSTANCE;
            }
            executor2 = (ScheduledExecutorService)executor;
            object = executor2.scheduleAtFixedRate(scheduledDirectPeriodicTask, l2, l3, timeUnit);
            scheduledDirectPeriodicTask.a((Future)object);
            return scheduledDirectPeriodicTask;
        }
        return super.d((Runnable)object, l2, l3, timeUnit);
    }
}

