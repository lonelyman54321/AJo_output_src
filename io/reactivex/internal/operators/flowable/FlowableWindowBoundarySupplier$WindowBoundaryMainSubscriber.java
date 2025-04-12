/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

final class FlowableWindowBoundarySupplier$WindowBoundaryMainSubscriber
extends AtomicInteger
implements df3_2,
ef3_2,
Runnable {
    public static final Object b;
    private static final long serialVersionUID = 2233020065421370272L;
    public ef3_2 a;

    static {
        new AtomicReference();
    }

    public final void a(ef3_2 ef3_22) {
        ef3_2 ef3_23 = this.a;
        boolean bl2 = gf3_2.validate(ef3_23, ef3_22);
        if (!bl2) {
            return;
        }
        this.a = ef3_22;
        throw null;
    }

    public final void b(Object object) {
        throw null;
    }

    public final void cancel() {
        throw null;
    }

    public final void onComplete() {
        throw null;
    }

    public final void onError(Throwable throwable) {
        throw null;
    }

    public final void request(long l2) {
        bu_2.a(null, l2);
        throw null;
    }

    public final void run() {
        throw null;
    }
}

