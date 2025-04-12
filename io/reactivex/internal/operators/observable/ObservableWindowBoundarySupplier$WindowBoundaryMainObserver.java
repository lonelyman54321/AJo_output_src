/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

final class ObservableWindowBoundarySupplier$WindowBoundaryMainObserver
extends AtomicInteger
implements e62_0,
yr0_2,
Runnable {
    public static final Object b;
    private static final long serialVersionUID = 2233020065421370272L;
    public yr0_2 a;

    static {
        new AtomicReference();
    }

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
        throw null;
    }

    public final void dispose() {
        throw null;
    }

    public final boolean isDisposed() {
        throw null;
    }

    public final void onComplete() {
        throw null;
    }

    public final void onError(Throwable throwable) {
        throw null;
    }

    public final void run() {
        throw null;
    }
}

