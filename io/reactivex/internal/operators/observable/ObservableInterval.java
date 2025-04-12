/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.observable;

import io.reactivex.Scheduler;
import io.reactivex.Scheduler$Worker;
import io.reactivex.internal.operators.observable.ObservableInterval$IntervalObserver;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import io.reactivex.internal.schedulers.TrampolineScheduler$TrampolineWorker;
import java.util.concurrent.TimeUnit;

public final class ObservableInterval
extends t62_0 {
    public final Scheduler a;
    public final long b;
    public final long c;
    public final TimeUnit d;

    public ObservableInterval(long l2, long l3, TimeUnit timeUnit, Scheduler scheduler) {
        this.b = l2;
        this.c = l3;
        this.d = timeUnit;
        this.a = scheduler;
    }

    public final void f(e62_0 object) {
        ObservableInterval$IntervalObserver observableInterval$IntervalObserver = new ObservableInterval$IntervalObserver((e62_0)object);
        object.a(observableInterval$IntervalObserver);
        Object object2 = this.a;
        boolean bl2 = object2 instanceof TrampolineScheduler;
        if (bl2) {
            ((TrampolineScheduler)object2).getClass();
            object2 = new TrampolineScheduler$TrampolineWorker();
            gr0_2.setOnce(observableInterval$IntervalObserver, (yr0_2)object2);
            TimeUnit timeUnit = this.d;
            long l2 = this.b;
            long l3 = this.c;
            ((Scheduler$Worker)object2).d(observableInterval$IntervalObserver, l2, l3, timeUnit);
        } else {
            TimeUnit timeUnit = this.d;
            long l4 = this.b;
            long l7 = this.c;
            object = ((Scheduler)object2).d(observableInterval$IntervalObserver, l4, l7, timeUnit);
            gr0_2.setOnce(observableInterval$IntervalObserver, (yr0_2)object);
        }
    }
}

