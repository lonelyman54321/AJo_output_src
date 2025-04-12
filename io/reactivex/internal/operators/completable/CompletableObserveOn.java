/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.completable;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.HandlerScheduler;
import io.reactivex.internal.operators.completable.CompletableObserveOn$ObserveOnCompletableObserver;

public final class CompletableObserveOn
extends u00_0 {
    public final u00_0 a;
    public final Scheduler b;

    public CompletableObserveOn(u00_0 u00_02, HandlerScheduler handlerScheduler) {
        this.a = u00_02;
        this.b = handlerScheduler;
    }

    public final void b(h00_0 h00_02) {
        Scheduler scheduler = this.b;
        CompletableObserveOn$ObserveOnCompletableObserver completableObserveOn$ObserveOnCompletableObserver = new CompletableObserveOn$ObserveOnCompletableObserver(h00_02, scheduler);
        this.a.a(completableObserveOn$ObserveOnCompletableObserver);
    }
}

