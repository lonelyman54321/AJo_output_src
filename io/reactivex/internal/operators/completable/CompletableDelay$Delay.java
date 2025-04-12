/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicReference;

final class CompletableDelay$Delay
extends AtomicReference
implements h00_0,
Runnable,
yr0_2 {
    private static final long serialVersionUID = 465972761105851022L;
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
        Throwable throwable = this.a;
        this.a = null;
        throwable.getClass();
        throw null;
    }
}

