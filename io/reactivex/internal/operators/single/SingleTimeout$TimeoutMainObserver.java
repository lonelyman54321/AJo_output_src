/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;

final class SingleTimeout$TimeoutMainObserver
extends AtomicReference
implements t53_0,
Runnable,
yr0_2 {
    private static final long serialVersionUID = 37497744973048446L;

    public final void a(yr0_2 yr0_22) {
        gr0_2.setOnce(this, yr0_22);
    }

    public final void dispose() {
        gr0_2.dispose(this);
        gr0_2.dispose(null);
    }

    public final boolean isDisposed() {
        return gr0_2.isDisposed((yr0_2)this.get());
    }

    public final void onError(Throwable throwable) {
        boolean bl2;
        gr0_2 gr0_22;
        yr0_2 yr0_22 = (yr0_2)this.get();
        if (yr0_22 != (gr0_22 = gr0_2.DISPOSED) && (bl2 = this.compareAndSet(yr0_22, gr0_22))) {
            gr0_2.dispose(null);
            throw null;
        }
        dr2_2.b(throwable);
    }

    public final void onSuccess(Object object) {
        boolean bl2;
        gr0_2 gr0_22;
        object = (yr0_2)this.get();
        if (object != (gr0_22 = gr0_2.DISPOSED) && (bl2 = this.compareAndSet(object, gr0_22))) {
            gr0_2.dispose(null);
            throw null;
        }
    }

    public final void run() {
        boolean bl2;
        gr0_2 gr0_22;
        yr0_2 yr0_22 = (yr0_2)this.get();
        if (yr0_22 != (gr0_22 = gr0_2.DISPOSED) && (bl2 = this.compareAndSet(yr0_22, gr0_22))) {
            if (yr0_22 != null) {
                yr0_22.dispose();
            }
            throw null;
        }
    }
}

