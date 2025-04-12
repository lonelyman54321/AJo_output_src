/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.schedulers;

import io.reactivex.internal.schedulers.TrampolineScheduler$TrampolineWorker;
import io.reactivex.internal.schedulers.TrampolineScheduler$a;
import java.util.concurrent.PriorityBlockingQueue;

final class TrampolineScheduler$TrampolineWorker$AppendToQueueTask
implements Runnable {
    public final TrampolineScheduler$a a;
    public final /* synthetic */ TrampolineScheduler$TrampolineWorker b;

    public TrampolineScheduler$TrampolineWorker$AppendToQueueTask(TrampolineScheduler$TrampolineWorker trampolineScheduler$TrampolineWorker, TrampolineScheduler$a a2) {
        this.b = trampolineScheduler$TrampolineWorker;
        this.a = a2;
    }

    public final void run() {
        this.a.d = true;
        PriorityBlockingQueue priorityBlockingQueue = this.b.a;
        TrampolineScheduler$a trampolineScheduler$a = this.a;
        priorityBlockingQueue.remove(trampolineScheduler$a);
    }
}

