/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.observable;

import io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import io.reactivex.internal.operators.observable.ObservableSubscribeOn$a;

final class ObservableSubscribeOn$SubscribeTask
implements Runnable {
    public final ObservableSubscribeOn$a a;
    public final /* synthetic */ ObservableSubscribeOn b;

    public ObservableSubscribeOn$SubscribeTask(ObservableSubscribeOn observableSubscribeOn, ObservableSubscribeOn$a a2) {
        this.b = observableSubscribeOn;
        this.a = a2;
    }

    public final void run() {
        D62 d62 = this.b.a;
        ObservableSubscribeOn$a observableSubscribeOn$a = this.a;
        d62.c(observableSubscribeOn$a);
    }
}

