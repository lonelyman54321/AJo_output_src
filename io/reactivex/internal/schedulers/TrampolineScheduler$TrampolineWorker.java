/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler$Worker;
import io.reactivex.internal.schedulers.TrampolineScheduler$SleepingRunnable;
import io.reactivex.internal.schedulers.TrampolineScheduler$TrampolineWorker$AppendToQueueTask;
import io.reactivex.internal.schedulers.TrampolineScheduler$a;
import java.io.Serializable;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class TrampolineScheduler$TrampolineWorker
extends Scheduler$Worker {
    public final PriorityBlockingQueue a;
    public final AtomicInteger b;
    public final AtomicInteger c;
    public volatile boolean d;

    public TrampolineScheduler$TrampolineWorker() {
        Serializable serializable;
        this.a = serializable = new Serializable();
        this.b = serializable;
        super();
        this.c = serializable;
    }

    public final yr0_2 b(Runnable runnable2) {
        long l2 = Scheduler$Worker.a(TimeUnit.MILLISECONDS);
        return this.e(l2, runnable2);
    }

    public final yr0_2 c(Runnable runnable2, long l2, TimeUnit object) {
        long l3 = Scheduler$Worker.a(TimeUnit.MILLISECONDS);
        l2 = object.toMillis(l2) + l3;
        object = new TrampolineScheduler$SleepingRunnable(runnable2, this, l2);
        return this.e(l2, (Runnable)object);
    }

    public final void dispose() {
        this.d = true;
    }

    public final yr0_2 e(long l2, Runnable runnable2) {
        boolean bl2 = this.d;
        if (bl2) {
            return iz0_2.INSTANCE;
        }
        Object object = l2;
        Object object2 = this.c;
        int n3 = ((AtomicInteger)object2).incrementAndGet();
        TrampolineScheduler$a trampolineScheduler$a = new TrampolineScheduler$a(runnable2, (Long)object, n3);
        this.a.add(trampolineScheduler$a);
        object = this.b;
        int n4 = ((AtomicInteger)object).getAndIncrement();
        if (n4 == 0) {
            n4 = 1;
            while (true) {
                if ((n3 = (int)(this.d ? 1 : 0)) != 0) {
                    this.a.clear();
                    return iz0_2.INSTANCE;
                }
                object2 = (TrampolineScheduler$a)this.a.poll();
                if (object2 == null) {
                    object2 = this.b;
                    n4 = -n4;
                    if ((n4 = ((AtomicInteger)object2).addAndGet(n4)) != 0) continue;
                    return iz0_2.INSTANCE;
                }
                boolean bl3 = ((TrampolineScheduler$a)object2).d;
                if (bl3) continue;
                object2 = ((TrampolineScheduler$a)object2).a;
                object2.run();
            }
        }
        object = new TrampolineScheduler$TrampolineWorker$AppendToQueueTask(this, trampolineScheduler$a);
        object2 = new AtomicReference(object);
        return object2;
    }

    public final boolean isDisposed() {
        return this.d;
    }
}

