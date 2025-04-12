/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;

final class FlowableWindow$WindowOverlapSubscriber
extends AtomicInteger
implements df3_2,
ef3_2,
Runnable {
    private static final long serialVersionUID = 2428527070996323976L;
    public ef3_2 a;
    public volatile boolean b;

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
        int n3 = this.b;
        if (n3 == 0) {
            this.getAndIncrement();
            n3 = tv3_0.l;
            new tv3_0(this);
            throw null;
        }
        throw null;
    }

    public final void cancel() {
        this.b = true;
        throw null;
    }

    public final void onComplete() {
        throw null;
    }

    public final void onError(Throwable throwable) {
        throw null;
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
        int n3 = this.decrementAndGet();
        if (n3 == 0) {
            ef3_2 ef3_22 = this.a;
            ef3_22.cancel();
        }
    }
}

