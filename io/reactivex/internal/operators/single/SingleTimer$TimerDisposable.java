/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;

final class SingleTimer$TimerDisposable
extends AtomicReference
implements yr0_2,
Runnable {
    private static final long serialVersionUID = 8465401857522493082L;

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

