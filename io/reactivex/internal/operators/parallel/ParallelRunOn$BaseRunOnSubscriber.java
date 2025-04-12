/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.parallel;

import java.util.concurrent.atomic.AtomicInteger;

abstract class ParallelRunOn$BaseRunOnSubscriber
extends AtomicInteger
implements df3_2,
ef3_2,
Runnable {
    private static final long serialVersionUID = 9222303586456402150L;
    public ef3_2 a;
    public volatile boolean b;
    public volatile boolean c;

    public final void b(Object object) {
        boolean bl2 = this.b;
        if (bl2) {
            return;
        }
        throw null;
    }

    public final void cancel() {
        boolean bl2 = this.c;
        if (bl2) {
            return;
        }
        this.c = true;
        this.a.cancel();
        throw null;
    }

    public final void onComplete() {
        int n3 = this.b;
        if (n3 != 0) {
            return;
        }
        this.b = true;
        n3 = this.getAndIncrement();
        if (n3 != 0) {
            return;
        }
        throw null;
    }

    public final void onError(Throwable throwable) {
        boolean bl2 = this.b;
        if (bl2) {
            dr2_2.b(throwable);
            return;
        }
        this.b = true;
        int n3 = this.getAndIncrement();
        if (n3 != 0) {
            return;
        }
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
}

