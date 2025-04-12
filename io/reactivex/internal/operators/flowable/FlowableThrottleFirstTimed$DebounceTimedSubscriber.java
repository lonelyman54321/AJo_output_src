/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;

final class FlowableThrottleFirstTimed$DebounceTimedSubscriber
extends AtomicLong
implements df3_2,
ef3_2,
Runnable {
    private static final long serialVersionUID = -9102637559663639004L;
    public ef3_2 a;
    public volatile boolean b;
    public boolean c;

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
        boolean bl2 = this.c;
        if (bl2) {
            return;
        }
        bl2 = this.b;
        if (!bl2) {
            long l2;
            this.b = bl2 = true;
            long l3 = this.get();
            long l4 = l3 - (l2 = 0L);
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 != false) {
                throw null;
            }
            this.c = bl2;
            this.cancel();
            throw null;
        }
    }

    public final void cancel() {
        this.a.cancel();
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

    public final void request(long l2) {
        boolean bl2 = gf3_2.validate(l2);
        if (bl2) {
            bu_2.a(this, l2);
        }
    }

    public final void run() {
        this.b = false;
    }
}

