/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler$Worker;
import io.reactivex.internal.schedulers.ExecutorScheduler;
import io.reactivex.internal.schedulers.ExecutorScheduler$ExecutorWorker$BooleanRunnable;
import io.reactivex.internal.schedulers.ExecutorScheduler$ExecutorWorker$InterruptibleRunnable;
import io.reactivex.internal.schedulers.ExecutorScheduler$ExecutorWorker$SequentialDispose;
import io.reactivex.internal.schedulers.ScheduledRunnable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ExecutorScheduler$ExecutorWorker
extends Scheduler$Worker
implements Runnable {
    public final boolean a;
    public final Executor b;
    public final hq1_2 c;
    public volatile boolean d;
    public final AtomicInteger e;
    public final t30_0 f;

    public ExecutorScheduler$ExecutorWorker(boolean bl2, Executor object) {
        Object object2 = new AtomicInteger();
        this.e = object2;
        this.f = object2 = new t30_0();
        this.b = object;
        this.c = object = new hq1_2();
        this.a = bl2;
    }

    public final yr0_2 b(Runnable object) {
        boolean bl2 = this.d;
        if (bl2) {
            return iz0_2.INSTANCE;
        }
        Object object2 = "run is null";
        x03_0.b(object, (String)object2);
        bl2 = this.a;
        if (bl2) {
            t30_0 t30_02 = this.f;
            object2 = new ExecutorScheduler$ExecutorWorker$InterruptibleRunnable((Runnable)object, t30_02);
            object = this.f;
            ((t30_0)object).b((yr0_2)object2);
        } else {
            object2 = new ExecutorScheduler$ExecutorWorker$BooleanRunnable((Runnable)object);
        }
        this.c.offer(object2);
        object = this.e;
        int n3 = ((AtomicInteger)object).getAndIncrement();
        if (n3 == 0) {
            try {
                object = this.b;
            }
            catch (RejectedExecutionException rejectedExecutionException) {
                this.d = true;
                this.c.clear();
                dr2_2.b(rejectedExecutionException);
                return iz0_2.INSTANCE;
            }
            object.execute(this);
        }
        return object2;
    }

    public final yr0_2 c(Runnable scheduledFuture, long l2, TimeUnit timeUnit) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object <= 0) {
            return this.b((Runnable)((Object)scheduledFuture));
        }
        boolean bl2 = this.d;
        if (bl2) {
            return iz0_2.INSTANCE;
        }
        lz2_2 lz2_22 = new AtomicReference();
        lz2_2 lz2_23 = new lz2_2(lz2_22);
        x03_0.b(scheduledFuture, "run is null");
        ExecutorScheduler$ExecutorWorker$SequentialDispose executorScheduler$ExecutorWorker$SequentialDispose = new ExecutorScheduler$ExecutorWorker$SequentialDispose(this, lz2_23, (Runnable)((Object)scheduledFuture));
        scheduledFuture = this.f;
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(executorScheduler$ExecutorWorker$SequentialDispose, (ar0_2)((Object)scheduledFuture));
        this.f.b(scheduledRunnable);
        scheduledFuture = this.b;
        boolean bl3 = scheduledFuture instanceof ScheduledExecutorService;
        if (bl3) {
            try {
                scheduledFuture = (ScheduledExecutorService)((Object)scheduledFuture);
            }
            catch (RejectedExecutionException rejectedExecutionException) {
                this.d = true;
                dr2_2.b(rejectedExecutionException);
                return iz0_2.INSTANCE;
            }
            scheduledFuture = scheduledFuture.schedule(scheduledRunnable, l2, timeUnit);
            scheduledRunnable.a(scheduledFuture);
        } else {
            scheduledFuture = ExecutorScheduler.e.c(scheduledRunnable, l2, timeUnit);
            nr0_2 nr0_22 = new nr0_2((yr0_2)((Object)scheduledFuture));
            scheduledRunnable.a(nr0_22);
        }
        gr0_2.replace(lz2_22, scheduledRunnable);
        return lz2_23;
    }

    public final void dispose() {
        int n3 = this.d;
        if (n3 == 0) {
            this.d = true;
            this.f.dispose();
            Object object = this.e;
            n3 = ((AtomicInteger)object).getAndIncrement();
            if (n3 == 0) {
                object = this.c;
                ((hq1_2)object).clear();
            }
        }
    }

    public final boolean isDisposed() {
        return this.d;
    }

    public final void run() {
        hq1_2 hq1_22 = this.c;
        int n3 = 1;
        block0: while (true) {
            boolean bl2;
            if (bl2 = this.d) {
                hq1_22.clear();
                return;
            }
            do {
                Object object;
                if ((object = (Runnable)hq1_22.poll()) == null) {
                    bl2 = this.d;
                    if (bl2) {
                        hq1_22.clear();
                        return;
                    }
                    object = this.e;
                    n3 = -n3;
                    if ((n3 = ((AtomicInteger)object).addAndGet(n3)) != 0) continue block0;
                    return;
                }
                object.run();
            } while (!(bl2 = this.d));
            break;
        }
        hq1_22.clear();
    }
}

