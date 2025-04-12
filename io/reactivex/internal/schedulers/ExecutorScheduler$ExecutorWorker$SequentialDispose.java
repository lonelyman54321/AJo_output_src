/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.schedulers;

import io.reactivex.internal.schedulers.ExecutorScheduler$ExecutorWorker;
import java.util.concurrent.atomic.AtomicReference;

final class ExecutorScheduler$ExecutorWorker$SequentialDispose
implements Runnable {
    public final lz2_2 a;
    public final Runnable b;
    public final /* synthetic */ ExecutorScheduler$ExecutorWorker c;

    public ExecutorScheduler$ExecutorWorker$SequentialDispose(ExecutorScheduler$ExecutorWorker executorWorker, lz2_2 lz2_22, Runnable runnable2) {
        this.c = executorWorker;
        this.a = lz2_22;
        this.b = runnable2;
    }

    public final void run() {
        yr0_2 yr0_22 = this.c;
        Object object = this.b;
        yr0_22 = yr0_22.b((Runnable)object);
        object = this.a;
        object.getClass();
        gr0_2.replace((AtomicReference)object, yr0_22);
    }
}

