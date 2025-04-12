/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.observable;

import io.reactivex.Scheduler;
import io.reactivex.Scheduler$Worker;
import io.reactivex.android.schedulers.HandlerScheduler;
import io.reactivex.internal.operators.observable.ObservableObserveOn$ObserveOnObserver;
import io.reactivex.internal.schedulers.TrampolineScheduler;

public final class ObservableObserveOn
extends i1_0 {
    public final Scheduler b;
    public final boolean c;
    public final int d;

    public ObservableObserveOn(D62 d62, HandlerScheduler handlerScheduler, int n3) {
        super(d62);
        this.b = handlerScheduler;
        this.c = false;
        this.d = n3;
    }

    public final void f(e62_0 e62_02) {
        Object object = this.b;
        boolean bl2 = object instanceof TrampolineScheduler;
        D62 d62 = this.a;
        if (bl2) {
            d62.c(e62_02);
        } else {
            object = ((Scheduler)object).a();
            boolean bl3 = this.c;
            int n3 = this.d;
            ObservableObserveOn$ObserveOnObserver observableObserveOn$ObserveOnObserver = new ObservableObserveOn$ObserveOnObserver(e62_02, (Scheduler$Worker)object, bl3, n3);
            d62.c(observableObserveOn$ObserveOnObserver);
        }
    }
}

