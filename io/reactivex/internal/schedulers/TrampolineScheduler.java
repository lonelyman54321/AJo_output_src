/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.Scheduler$Worker;
import io.reactivex.internal.schedulers.TrampolineScheduler$TrampolineWorker;
import java.util.concurrent.TimeUnit;

public final class TrampolineScheduler
extends Scheduler {
    public static final /* synthetic */ int c;

    static {
        new Scheduler();
    }

    public final Scheduler$Worker a() {
        TrampolineScheduler$TrampolineWorker trampolineScheduler$TrampolineWorker = new TrampolineScheduler$TrampolineWorker();
        return trampolineScheduler$TrampolineWorker;
    }

    public final yr0_2 b(Runnable runnable2) {
        x03_0.b(runnable2, "run is null");
        runnable2.run();
        return iz0_2.INSTANCE;
    }

    public final yr0_2 c(Runnable runnable2, long l2, TimeUnit timeUnit) {
        timeUnit.sleep(l2);
        Object object = "run is null";
        try {
            x03_0.b(runnable2, (String)object);
            runnable2.run();
        }
        catch (InterruptedException interruptedException) {
            object = Thread.currentThread();
            ((Thread)object).interrupt();
            dr2_2.b(interruptedException);
        }
        return iz0_2.INSTANCE;
    }
}

