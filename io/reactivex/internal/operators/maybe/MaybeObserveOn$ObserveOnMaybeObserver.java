/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;

final class MaybeObserveOn$ObserveOnMaybeObserver
extends AtomicReference
implements vk1_1,
yr0_2,
Runnable {
    private static final long serialVersionUID = 8571289934935992137L;
    public Object a;
    public Throwable b;

    public final void a(yr0_2 yr0_22) {
        boolean bl2 = gr0_2.setOnce(this, yr0_22);
        if (!bl2) {
            return;
        }
        throw null;
    }

    public final void dispose() {
        gr0_2.dispose(this);
    }

    public final boolean isDisposed() {
        return gr0_2.isDisposed((yr0_2)this.get());
    }

    public final void onComplete() {
        throw null;
    }

    public final void onError(Throwable throwable) {
        this.b = throwable;
        throw null;
    }

    public final void run() {
        Throwable throwable = this.b;
        if (throwable != null) {
            this.b = null;
            throw null;
        }
        this.a.getClass();
        this.a = null;
        throw null;
    }
}

