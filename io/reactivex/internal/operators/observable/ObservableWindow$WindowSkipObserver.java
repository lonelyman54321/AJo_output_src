/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicBoolean;

final class ObservableWindow$WindowSkipObserver
extends AtomicBoolean
implements e62_0,
yr0_2,
Runnable {
    private static final long serialVersionUID = 3366976432059579510L;
    public volatile boolean a;
    public yr0_2 b;

    public final void a(yr0_2 yr0_22) {
        yr0_2 yr0_23 = this.b;
        boolean bl2 = gr0_2.validate(yr0_23, yr0_22);
        if (!bl2) {
            return;
        }
        this.b = yr0_22;
        throw null;
    }

    public final void b(Object object) {
        boolean bl2;
        long l2 = 0L;
        long l3 = l2 % l2;
        long l4 = l3 - l2;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 == false && !(bl2 = this.a)) {
            throw null;
        }
        throw null;
    }

    public final void dispose() {
        this.a = true;
    }

    public final boolean isDisposed() {
        return this.a;
    }

    public final void onComplete() {
        throw null;
    }

    public final void onError(Throwable throwable) {
        throw null;
    }

    public final void run() {
        throw null;
    }
}

