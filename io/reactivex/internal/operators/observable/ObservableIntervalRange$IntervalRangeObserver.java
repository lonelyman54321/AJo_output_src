/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;

final class ObservableIntervalRange$IntervalRangeObserver
extends AtomicReference
implements yr0_2,
Runnable {
    private static final long serialVersionUID = 1891866368734007884L;

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
        boolean bl2 = this.isDisposed();
        if (bl2) {
            return;
        }
        throw null;
    }
}

