/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.schedulers;

import io.reactivex.internal.schedulers.ExecutorScheduler;
import io.reactivex.internal.schedulers.ExecutorScheduler$DelayedRunnable;

final class ExecutorScheduler$DelayedDispose
implements Runnable {
    public final ExecutorScheduler$DelayedRunnable a;
    public final /* synthetic */ ExecutorScheduler b;

    public ExecutorScheduler$DelayedDispose(ExecutorScheduler executorScheduler, ExecutorScheduler$DelayedRunnable delayedRunnable) {
        this.b = executorScheduler;
        this.a = delayedRunnable;
    }

    public final void run() {
        yr0_2 yr0_22 = this.a;
        lz2_2 lz2_22 = yr0_22.b;
        yr0_22 = this.b.b((Runnable)((Object)yr0_22));
        lz2_22.getClass();
        gr0_2.replace(lz2_22, yr0_22);
    }
}

