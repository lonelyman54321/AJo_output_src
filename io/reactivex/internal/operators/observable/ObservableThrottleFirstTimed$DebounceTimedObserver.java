/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;

final class ObservableThrottleFirstTimed$DebounceTimedObserver
extends AtomicReference
implements e62_0,
yr0_2,
Runnable {
    private static final long serialVersionUID = 786994795061867455L;
    public yr0_2 a;
    public volatile boolean b;
    public boolean c;

    public final void a(yr0_2 yr0_22) {
        yr0_2 yr0_23 = this.a;
        boolean bl2 = gr0_2.validate(yr0_23, yr0_22);
        if (!bl2) {
            return;
        }
        this.a = yr0_22;
        throw null;
    }

    public final void b(Object object) {
        boolean bl2 = this.b;
        if (!bl2 && !(bl2 = this.c)) {
            this.b = true;
            throw null;
        }
    }

    public final void dispose() {
        this.a.dispose();
        throw null;
    }

    public final boolean isDisposed() {
        throw null;
    }

    public final void onComplete() {
        boolean bl2 = this.c;
        if (bl2) {
            return;
        }
        this.c = true;
        throw null;
    }

    public final void onError(Throwable throwable) {
        boolean bl2 = this.c;
        if (bl2) {
            dr2_2.b(throwable);
            return;
        }
        this.c = true;
        throw null;
    }

    public final void run() {
        this.b = false;
    }
}

