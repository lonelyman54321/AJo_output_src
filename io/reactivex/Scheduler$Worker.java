/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex;

import io.reactivex.Scheduler;
import io.reactivex.Scheduler$Worker$PeriodicTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public abstract class Scheduler$Worker
implements yr0_2 {
    public static long a(TimeUnit timeUnit) {
        long l2;
        boolean bl2 = Scheduler.a;
        if (!bl2) {
            l2 = System.currentTimeMillis();
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            l2 = timeUnit.convert(l2, timeUnit2);
        } else {
            l2 = System.nanoTime();
            TimeUnit timeUnit3 = TimeUnit.NANOSECONDS;
            l2 = timeUnit.convert(l2, timeUnit3);
        }
        return l2;
    }

    public yr0_2 b(Runnable runnable2) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        return this.c(runnable2, 0L, timeUnit);
    }

    public abstract yr0_2 c(Runnable var1, long var2, TimeUnit var4);

    public final yr0_2 d(Runnable runnable2, long l2, long l3, TimeUnit timeUnit) {
        iz0_2 iz0_22;
        lz2_2 lz2_22 = new AtomicReference();
        lz2_2 lz2_23 = new lz2_2(lz2_22);
        long l4 = l3;
        long l7 = timeUnit.toNanos(l3);
        long l8 = Scheduler$Worker.a(TimeUnit.NANOSECONDS);
        l4 = timeUnit.toNanos(l2);
        long l12 = l4 + l8;
        Scheduler$Worker$PeriodicTask scheduler$Worker$PeriodicTask = new Scheduler$Worker$PeriodicTask(this, l12, runnable2, l8, lz2_23, l7);
        yr0_2 yr0_22 = this.c(scheduler$Worker$PeriodicTask, l2, timeUnit);
        if (yr0_22 == (iz0_22 = iz0_2.INSTANCE)) {
            return yr0_22;
        }
        gr0_2.replace(lz2_22, yr0_22);
        return lz2_23;
    }
}

