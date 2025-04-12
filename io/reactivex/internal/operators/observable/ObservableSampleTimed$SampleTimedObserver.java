/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;

abstract class ObservableSampleTimed$SampleTimedObserver
extends AtomicReference
implements e62_0,
yr0_2,
Runnable {
    private static final long serialVersionUID = -3517602651313910099L;
    public yr0_2 a;

    public final void a(yr0_2 yr0_22) {
        yr0_2 yr0_23 = this.a;
        boolean bl2 = gr0_2.validate(yr0_23, yr0_22);
        if (!bl2) {
            return;
        }
        this.a = yr0_22;
        throw null;
    }

    public final void b(Object object) {
        this.lazySet(object);
    }

    public abstract void c();

    public final void dispose() {
        gr0_2.dispose(null);
        this.a.dispose();
    }

    public final boolean isDisposed() {
        return this.a.isDisposed();
    }

    public final void onComplete() {
        gr0_2.dispose(null);
        this.c();
        throw null;
    }

    public final void onError(Throwable throwable) {
        gr0_2.dispose(null);
        throw null;
    }
}

