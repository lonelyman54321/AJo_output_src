/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.flowable;

final class FlowableWindowTimed$WindowSkipSubscriber
extends wc2_2
implements ef3_2,
Runnable {
    public ef3_2 d;

    public final void a(ef3_2 ef3_22) {
        ef3_2 ef3_23 = this.d;
        boolean bl2 = gf3_2.validate(ef3_23, ef3_22);
        if (!bl2) {
            return;
        }
        this.d = ef3_22;
        throw null;
    }

    public final void b(Object object) {
        boolean bl2 = this.d();
        if (bl2) {
            throw null;
        }
        throw null;
    }

    public final void cancel() {
        this.c = true;
    }

    public final void onComplete() {
        boolean bl2 = this.c();
        if (bl2) {
            throw null;
        }
        throw null;
    }

    public final void onError(Throwable throwable) {
        boolean bl2 = this.c();
        if (bl2) {
            throw null;
        }
        throw null;
    }

    public final void run() {
        tv3_0 tv3_02 = new tv3_0(null);
        boolean bl2 = this.c;
        if (bl2) {
            bl2 = this.c();
            if (!bl2) {
                return;
            }
            throw null;
        }
        throw null;
    }
}

