/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;

final class FlowableWindowTimed$WindowExactUnboundedSubscriber
extends wc2_2
implements ef3_2,
Runnable {
    public static final Object g;
    public ef3_2 d;
    public tv3_0 e;
    public volatile boolean f;

    public final void a(ef3_2 object) {
        ef3_2 ef3_22 = this.d;
        boolean bl2 = gf3_2.validate(ef3_22, (ef3_2)object);
        if (!bl2) {
            return;
        }
        this.d = object;
        this.e = object = new tv3_0(null);
        throw null;
    }

    public final void b(Object object) {
        int n3 = this.f;
        if (n3 != 0) {
            return;
        }
        n3 = this.d();
        if (n3 != 0) {
            tv3_0 tv3_02 = this.e;
            tv3_02.b(object);
            object = this.a;
            n3 = -1;
            int n4 = ((AtomicInteger)object).addAndGet(n3);
            if (n4 == 0) {
                return;
            }
            this.f();
            return;
        }
        r52_0.next(object);
        throw null;
    }

    public final void cancel() {
        this.c = true;
    }

    public final void f() {
        throw null;
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
        boolean bl2 = this.c;
        if (bl2) {
            this.f = bl2 = true;
        }
        throw null;
    }
}

