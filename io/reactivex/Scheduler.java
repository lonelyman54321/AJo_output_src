/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex;

import io.reactivex.Scheduler$DisposeTask;
import io.reactivex.Scheduler$PeriodicDirectTask;
import io.reactivex.Scheduler$Worker;
import java.util.concurrent.TimeUnit;

public abstract class Scheduler {
    public static final boolean a = Boolean.getBoolean("rx2.scheduler.use-nanotime");
    public static final long b;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        long l2 = Long.getLong("rx2.scheduler.drift-tolerance", 15);
        b = timeUnit.toNanos(l2);
    }

    public abstract Scheduler$Worker a();

    public yr0_2 b(Runnable runnable2) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        return this.c(runnable2, 0L, timeUnit);
    }

    public yr0_2 c(Runnable runnable2, long l2, TimeUnit timeUnit) {
        Scheduler$Worker scheduler$Worker = this.a();
        x03_0.b(runnable2, "run is null");
        Scheduler$DisposeTask scheduler$DisposeTask = new Scheduler$DisposeTask(runnable2, scheduler$Worker);
        scheduler$Worker.c(scheduler$DisposeTask, l2, timeUnit);
        return scheduler$DisposeTask;
    }

    public yr0_2 d(Runnable object, long l2, long l3, TimeUnit timeUnit) {
        iz0_2 iz0_22;
        Scheduler$PeriodicDirectTask scheduler$PeriodicDirectTask;
        Scheduler$Worker scheduler$Worker = this.a();
        object = scheduler$Worker.d(scheduler$PeriodicDirectTask = new Scheduler$PeriodicDirectTask((Runnable)object, scheduler$Worker), l2, l3, timeUnit);
        if (object == (iz0_22 = iz0_2.INSTANCE)) {
            return object;
        }
        return scheduler$PeriodicDirectTask;
    }
}

