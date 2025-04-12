/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.observable;

import io.reactivex.Scheduler;
import io.reactivex.internal.operators.observable.ObservableSubscribeOn$SubscribeTask;
import io.reactivex.internal.operators.observable.ObservableSubscribeOn$a;

public final class ObservableSubscribeOn
extends i1_0 {
    public final Scheduler b;

    public ObservableSubscribeOn(D62 d62, Scheduler scheduler) {
        super(d62);
        this.b = scheduler;
    }

    public final void f(e62_0 object) {
        ObservableSubscribeOn$a observableSubscribeOn$a = new ObservableSubscribeOn$a((e62_0)object);
        object.a(observableSubscribeOn$a);
        object = new ObservableSubscribeOn$SubscribeTask(this, observableSubscribeOn$a);
        object = this.b.b((Runnable)object);
        gr0_2.setOnce(observableSubscribeOn$a, (yr0_2)object);
    }
}

