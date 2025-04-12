/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicReference;

final class FlowableSubscribeOn$SubscribeOnSubscriber
extends AtomicReference
implements df3_2,
ef3_2,
Runnable {
    private static final long serialVersionUID = 8094547886072529208L;

    public final void a(ef3_2 ef3_22) {
        boolean bl2 = gf3_2.setOnce(null, ef3_22);
        if (!bl2) {
            return;
        }
        throw null;
    }

    public final void b(Object object) {
        throw null;
    }

    public final void cancel() {
        gf3_2.cancel(null);
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
        throw null;
    }

    public final void run() {
        Thread thread2 = Thread.currentThread();
        this.lazySet(thread2);
        throw null;
    }
}

