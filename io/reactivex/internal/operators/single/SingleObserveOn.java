/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.single;

import io.reactivex.Scheduler;
import io.reactivex.internal.operators.single.SingleObserveOn$ObserveOnSingleObserver;

public final class SingleObserveOn
extends g53_0 {
    public final q63_0 a;
    public final Scheduler b;

    public SingleObserveOn(q63_0 q63_02, Scheduler scheduler) {
        this.a = q63_02;
        this.b = scheduler;
    }

    public final void g(t53_0 t53_02) {
        Scheduler scheduler = this.b;
        SingleObserveOn$ObserveOnSingleObserver singleObserveOn$ObserveOnSingleObserver = new SingleObserveOn$ObserveOnSingleObserver(t53_02, scheduler);
        this.a.a(singleObserveOn$ObserveOnSingleObserver);
    }
}

