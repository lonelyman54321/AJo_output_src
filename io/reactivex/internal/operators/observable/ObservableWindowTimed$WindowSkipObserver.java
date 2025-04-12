/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;

final class ObservableWindowTimed$WindowSkipObserver
extends vc2_2
implements yr0_2,
Runnable {
    public yr0_2 c;

    public final void a(yr0_2 yr0_22) {
        yr0_2 yr0_23 = this.c;
        boolean bl2 = gr0_2.validate(yr0_23, yr0_22);
        if (!bl2) {
            return;
        }
        this.c = yr0_22;
        throw null;
    }

    public final void b(Object object) {
        boolean bl2;
        object = this.a;
        int n3 = ((AtomicInteger)object).get();
        boolean bl3 = false;
        if (n3 == 0 && (bl2 = ((AtomicInteger)object).compareAndSet(0, n3 = 1))) {
            bl3 = true;
        }
        bl2 = false;
        object = null;
        if (bl3) {
            throw null;
        }
        throw null;
    }

    public final void dispose() {
        this.b = true;
    }

    public final boolean isDisposed() {
        return this.b;
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
        uv3_0 uv3_02 = new uv3_0();
        boolean bl2 = this.b;
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

