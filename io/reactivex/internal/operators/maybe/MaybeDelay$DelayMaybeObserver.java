/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;

final class MaybeDelay$DelayMaybeObserver
extends AtomicReference
implements vk1_1,
yr0_2,
Runnable {
    private static final long serialVersionUID = 5566860102500855068L;
    public Throwable a;

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
        this.a = throwable;
        throw null;
    }

    public final void run() {
        this.a.getClass();
        throw null;
    }
}

