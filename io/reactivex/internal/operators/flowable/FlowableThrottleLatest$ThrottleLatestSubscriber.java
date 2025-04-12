/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;

final class FlowableThrottleLatest$ThrottleLatestSubscriber
extends AtomicInteger
implements df3_2,
ef3_2,
Runnable {
    private static final long serialVersionUID = -8296689127439125014L;
    public ef3_2 a;
    public volatile boolean b;
    public Throwable c;
    public volatile boolean d;

    public final void a(ef3_2 ef3_22) {
        ef3_2 ef3_23 = this.a;
        boolean bl2 = gf3_2.validate(ef3_23, ef3_22);
        if (!bl2) {
            return;
        }
        this.a = ef3_22;
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

    public final void cancel() {
        this.d = true;
        this.a.cancel();
        throw null;
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

    public final void request(long l2) {
        boolean bl2 = gf3_2.validate(l2);
        if (!bl2) {
            return;
        }
        bu_2.a(null, l2);
        throw null;
    }

    public final void run() {
        this.c();
    }
}

