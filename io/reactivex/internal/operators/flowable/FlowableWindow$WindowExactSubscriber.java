/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;

final class FlowableWindow$WindowExactSubscriber
extends AtomicInteger
implements df3_2,
ef3_2,
Runnable {
    private static final long serialVersionUID = -2365647875069161133L;
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
            long l7 = 1L;
            tv3_02.b(object);
            long l8 = (l2 += l7) - l3;
            long l12 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (l12 == false) {
                this.a = l3;
                this.c = null;
                tv3_02.onComplete();
            } else {
                this.a = l2;
            }
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
        int n3 = gf3_2.validate(l2);
        if (n3 != 0) {
            long l3;
            n3 = 31;
            long l4 = l2 >>> n3;
            long l7 = 0L;
            long l8 = l4 - l7;
            Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object != false && (object = (l3 = (l4 = l7 / l7) - l2) == 0L ? 0 : (l3 < 0L ? -1 : 1)) != false) {
                l7 = Long.MAX_VALUE;
            }
            ef3_2 ef3_22 = this.b;
            ef3_22.request(l7);
        }
    }

    public final void run() {
        int n3 = this.decrementAndGet();
        if (n3 == 0) {
            ef3_2 ef3_22 = this.b;
            ef3_22.cancel();
        }
    }
}

