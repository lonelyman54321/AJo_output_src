/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicReference;

final class CompletableSubscribeOn$SubscribeOnObserver
extends AtomicReference
implements h00_0,
yr0_2,
Runnable {
    private static final long serialVersionUID = 7000911171163930287L;
    public final h00_0 a;
    public final lz2_2 b;
    public final u00_0 c;

    public CompletableSubscribeOn$SubscribeOnObserver(h00_0 atomicReference, u00_0 u00_02) {
        this.a = atomicReference;
        this.c = u00_02;
        atomicReference = new AtomicReference();
        this.b = atomicReference;
    }

    public final void a(yr0_2 yr0_22) {
        gr0_2.setOnce(this, yr0_22);
    }

    public final void dispose() {
        gr0_2.dispose(this);
        lz2_2 lz2_22 = this.b;
        lz2_22.getClass();
        gr0_2.dispose(lz2_22);
    }

    public final boolean isDisposed() {
        return gr0_2.isDisposed((yr0_2)this.get());
    }

    public final void onComplete() {
        this.a.onComplete();
    }

    public final void onError(Throwable throwable) {
        this.a.onError(throwable);
    }

    public final void run() {
        this.c.a(this);
    }
}

