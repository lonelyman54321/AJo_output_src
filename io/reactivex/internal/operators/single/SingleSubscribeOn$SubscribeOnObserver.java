/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;

final class SingleSubscribeOn$SubscribeOnObserver
extends AtomicReference
implements t53_0,
yr0_2,
Runnable {
    private static final long serialVersionUID = 7000911171163930287L;
    public final t53_0 a;
    public final lz2_2 b;
    public final q63_0 c;

    public SingleSubscribeOn$SubscribeOnObserver(t53_0 atomicReference, q63_0 q63_02) {
        this.a = atomicReference;
        this.c = q63_02;
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

    public final void onError(Throwable throwable) {
        this.a.onError(throwable);
    }

    public final void onSuccess(Object object) {
        this.a.onSuccess(object);
    }

    public final void run() {
        this.c.a(this);
    }
}

