/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex;

import io.reactivex.Scheduler$Worker;

final class Scheduler$PeriodicDirectTask
implements yr0_2,
Runnable {
    public final Runnable a;
    public final Scheduler$Worker b;
    public volatile boolean c;

    public Scheduler$PeriodicDirectTask(Runnable runnable2, Scheduler$Worker scheduler$Worker) {
        this.a = runnable2;
        this.b = scheduler$Worker;
    }

    public final void dispose() {
        this.c = true;
        this.b.dispose();
    }

    public final boolean isDisposed() {
        return this.c;
    }

    public final void run() {
        boolean bl2 = this.c;
        if (!bl2) {
            Runnable runnable2;
            try {
                runnable2 = this.a;
            }
            catch (Throwable throwable) {
                mm0.h(throwable);
                this.b.dispose();
                throw uc0_2.a(throwable);
            }
            runnable2.run();
        }
    }
}

