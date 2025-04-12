/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex;

import io.reactivex.Scheduler;
import io.reactivex.Scheduler$Worker;
import java.util.concurrent.TimeUnit;

final class Scheduler$Worker$PeriodicTask
implements Runnable {
    public final Runnable a;
    public final lz2_2 b;
    public final long c;
    public long d;
    public long e;
    public long f;
    public final /* synthetic */ Scheduler$Worker g;

    public Scheduler$Worker$PeriodicTask(Scheduler$Worker scheduler$Worker, long l2, Runnable runnable2, long l3, lz2_2 lz2_22, long l4) {
        this.g = scheduler$Worker;
        this.a = runnable2;
        this.b = lz2_22;
        this.c = l4;
        this.e = l3;
        this.f = l2;
    }

    public final void run() {
        Scheduler$Worker$PeriodicTask scheduler$Worker$PeriodicTask = this;
        this.a.run();
        lz2_2 lz2_22 = this.b;
        boolean bl2 = lz2_22.isDisposed();
        if (!bl2) {
            long l2;
            long l3;
            Object object = TimeUnit.NANOSECONDS;
            Scheduler$Worker scheduler$Worker = this.g;
            scheduler$Worker.getClass();
            long l4 = Scheduler$Worker.a(object);
            long l7 = Scheduler.b;
            long l8 = l4 + l7;
            long l12 = this.e;
            long l14 = 1L;
            long l15 = this.c;
            long l16 = l8 == l12 ? 0 : (l8 < l12 ? -1 : 1);
            if (l16 >= 0 && (l3 = (l2 = l4 - (l12 = l12 + l15 + l7)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) < 0) {
                l7 = this.f;
                this.d = l8 = this.d + l14;
                l8 = l8 * l15 + l7;
            } else {
                l8 = l4 + l15;
                scheduler$Worker$PeriodicTask.d = l7 = scheduler$Worker$PeriodicTask.d + l14;
                l15 *= l7;
                scheduler$Worker$PeriodicTask.f = l7 = l8 - l15;
            }
            scheduler$Worker$PeriodicTask.e = l4;
            object = scheduler$Worker.c(scheduler$Worker$PeriodicTask, l8 -= l4, (TimeUnit)((Object)object));
            gr0_2.replace(lz2_22, (yr0_2)object);
        }
    }
}

