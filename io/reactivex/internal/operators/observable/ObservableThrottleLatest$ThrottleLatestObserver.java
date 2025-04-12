/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;

final class ObservableThrottleLatest$ThrottleLatestObserver
extends AtomicInteger
implements e62_0,
yr0_2,
Runnable {
    private static final long serialVersionUID = -8296689127439125014L;
    public yr0_2 a;
    public volatile boolean b;
    public Throwable c;
    public volatile boolean d;

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
        throw null;
    }

    public final void c() {
        int n3 = this.getAndIncrement();
        if (n3 != 0) {
            return;
        }
        n3 = (int)(this.d ? 1 : 0);
        if (n3 == 0) {
            Throwable throwable;
            n3 = (int)(this.b ? 1 : 0);
            if (n3 != 0 && (throwable = this.c) != null) {
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public final void dispose() {
        this.d = true;
        this.a.dispose();
        throw null;
    }

    public final boolean isDisposed() {
        return this.d;
    }

    public final void onComplete() {
        this.b = true;
        this.c();
    }

    public final void onError(Throwable throwable) {
        this.c = throwable;
        this.b = true;
        this.c();
    }

    public final void run() {
        this.c();
    }
}

