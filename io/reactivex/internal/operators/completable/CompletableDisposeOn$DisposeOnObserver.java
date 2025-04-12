/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.completable;

final class CompletableDisposeOn$DisposeOnObserver
implements h00_0,
yr0_2,
Runnable {
    public yr0_2 a;
    public volatile boolean b;

    public final void a(yr0_2 yr0_22) {
        yr0_2 yr0_23 = this.a;
        boolean bl2 = gr0_2.validate(yr0_23, yr0_22);
        if (!bl2) {
            return;
        }
        this.a = yr0_22;
        throw null;
    }

    public final void dispose() {
        this.b = true;
        throw null;
    }

    public final boolean isDisposed() {
        return this.b;
    }

    public final void onComplete() {
        boolean bl2 = this.b;
        if (bl2) {
            return;
        }
        throw null;
    }

    public final void onError(Throwable throwable) {
        boolean bl2 = this.b;
        if (bl2) {
            dr2_2.b(throwable);
            return;
        }
        throw null;
    }

    public final void run() {
        this.a.dispose();
        gr0_2 gr0_22 = gr0_2.DISPOSED;
        this.a = gr0_22;
    }
}

