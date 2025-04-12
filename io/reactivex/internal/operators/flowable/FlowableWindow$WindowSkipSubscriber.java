/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;

final class FlowableWindow$WindowSkipSubscriber
extends AtomicInteger
implements df3_2,
ef3_2,
Runnable {
    private static final long serialVersionUID = -8792836352386833856L;
    public long a;
    public ef3_2 b;
    public tv3_0 c;

    public final void a(ef3_2 ef3_22) {
        ef3_2 ef3_23 = this.b;
        boolean bl2 = gf3_2.validate(ef3_23, ef3_22);
        if (!bl2) {
            return;
        }
        this.b = ef3_22;
        throw null;
    }

    public final void b(Object object) {
        long l2 = this.a;
        tv3_0 tv3_02 = this.c;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 != false) {
            long l7;
            long l8 = 1L;
            l2 += l8;
            if (tv3_02 != null) {
                tv3_02.b(object);
            }
            if ((l7 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1)) == false) {
                this.c = null;
                tv3_02.onComplete();
            }
            this.a = l7 == false ? l3 : l2;
            return;
        }
        this.getAndIncrement();
        int n3 = tv3_0.l;
        this.c = object = new tv3_0(this);
        throw null;
    }

    public final void cancel() {
        throw null;
    }

    public final void onComplete() {
        tv3_0 tv3_02 = this.c;
        if (tv3_02 != null) {
            this.c = null;
            tv3_02.onComplete();
        }
        throw null;
    }

    public final void onError(Throwable throwable) {
        tv3_0 tv3_02 = this.c;
        if (tv3_02 != null) {
            this.c = null;
            tv3_02.onError(throwable);
        }
        throw null;
    }

    public final void request(long l2) {
        boolean bl2 = gf3_2.validate(l2);
        if (!bl2) {
            return;
        }
        throw null;
    }

    public final void run() {
        int n3 = this.decrementAndGet();
        if (n3 == 0) {
            ef3_2 ef3_22 = this.b;
            ef3_22.cancel();
        }
    }
}

