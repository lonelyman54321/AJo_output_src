/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicReference;

final class CompletableTimer$TimerDisposable
extends AtomicReference
implements yr0_2,
Runnable {
    private static final long serialVersionUID = 3167244060586201109L;

    public final void dispose() {
        gr0_2.dispose(this);
    }

    public final boolean isDisposed() {
        return gr0_2.isDisposed((yr0_2)this.get());
    }

    public final void run() {
        throw null;
    }
}

