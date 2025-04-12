/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;

final class SingleUnsubscribeOn$UnsubscribeOnSingleObserver
extends AtomicReference
implements t53_0,
yr0_2,
Runnable {
    private static final long serialVersionUID = 3256698449646456986L;
    public yr0_2 a;

    public final void a(yr0_2 yr0_22) {
        boolean bl2 = gr0_2.setOnce(this, yr0_22);
        if (!bl2) {
            return;
        }
        throw null;
    }

    public final void dispose() {
        gr0_2 gr0_22 = gr0_2.DISPOSED;
        yr0_2 yr0_22 = this.getAndSet(gr0_22);
        if (yr0_22 == gr0_22) {
            return;
        }
        this.a = yr0_22;
        throw null;
    }

    public final boolean isDisposed() {
        return gr0_2.isDisposed((yr0_2)this.get());
    }

    public final void onError(Throwable throwable) {
        throw null;
    }

    public final void onSuccess(Object object) {
        throw null;
    }

    public final void run() {
        this.a.dispose();
    }
}

