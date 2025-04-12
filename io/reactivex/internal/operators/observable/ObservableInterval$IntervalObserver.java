/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;

final class ObservableInterval$IntervalObserver
extends AtomicReference
implements yr0_2,
Runnable {
    private static final long serialVersionUID = 346773832286157679L;
    public final e62_0 a;
    public long b;

    public ObservableInterval$IntervalObserver(e62_0 e62_02) {
        this.a = e62_02;
    }

    public final void dispose() {
        gr0_2.dispose(this);
    }

    public final boolean isDisposed() {
        boolean bl2;
        gr0_2 gr0_22;
        Object v4 = this.get();
        if (v4 == (gr0_22 = gr0_2.DISPOSED)) {
            bl2 = true;
        } else {
            bl2 = false;
            v4 = null;
        }
        return bl2;
    }

    public final void run() {
        Object object;
        Object object2 = this.get();
        if (object2 != (object = gr0_2.DISPOSED)) {
            long l2;
            long l3 = this.b;
            this.b = l2 = 1L + l3;
            object2 = l3;
            object = this.a;
            object.b(object2);
        }
    }
}

