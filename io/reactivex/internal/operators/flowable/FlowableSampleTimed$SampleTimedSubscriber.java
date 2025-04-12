/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicReference;

abstract class FlowableSampleTimed$SampleTimedSubscriber
extends AtomicReference
implements df3_2,
ef3_2,
Runnable {
    private static final long serialVersionUID = -3517602651313910099L;
    public ef3_2 a;

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
        this.lazySet(object);
    }

    public abstract void c();

    public final void cancel() {
        gr0_2.dispose(null);
        this.a.cancel();
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

    public final void request(long l2) {
        boolean bl2 = gf3_2.validate(l2);
        if (!bl2) {
            return;
        }
        bu_2.a(null, l2);
        throw null;
    }
}

