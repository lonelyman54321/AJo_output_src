/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler$Worker;
import io.reactivex.internal.schedulers.TrampolineScheduler$TrampolineWorker;
import java.util.concurrent.TimeUnit;

final class TrampolineScheduler$SleepingRunnable
implements Runnable {
    public final Runnable a;
    public final TrampolineScheduler$TrampolineWorker b;
    public final long c;

    public TrampolineScheduler$SleepingRunnable(Runnable runnable2, TrampolineScheduler$TrampolineWorker trampolineWorker, long l2) {
        this.a = runnable2;
        this.b = trampolineWorker;
        this.c = l2;
    }

    public final void run() {
        Object object = this.b;
        boolean bl2 = ((TrampolineScheduler$TrampolineWorker)object).d;
        if (!bl2) {
            object = this.b;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            object.getClass();
            long l2 = Scheduler$Worker.a(timeUnit);
            long l3 = this.c;
            long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
            if (l4 > 0) {
                l3 -= l2;
                try {
                    Thread.sleep(l3);
                }
                catch (InterruptedException interruptedException) {
                    Thread.currentThread().interrupt();
                    dr2_2.b(interruptedException);
                    return;
                }
            }
            object = this.b;
            bl2 = ((TrampolineScheduler$TrampolineWorker)object).d;
            if (!bl2) {
                object = this.a;
                object.run();
            }
        }
    }
}

