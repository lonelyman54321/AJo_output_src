/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicReference;

final class FlowableTimer$TimerSubscriber
extends AtomicReference
implements ef3_2,
Runnable {
    private static final long serialVersionUID = -2809475196591179431L;
    public volatile boolean a;

    public final void cancel() {
        gr0_2.dispose(this);
    }

    public final void request(long l2) {
        boolean bl2 = gf3_2.validate(l2);
        if (bl2) {
            this.a = bl2 = true;
        }
    }

    public final void run() {
        gr0_2 gr0_22;
        Object object = this.get();
        if (object != (gr0_22 = gr0_2.DISPOSED)) {
            boolean bl2 = this.a;
            gr0_22 = null;
            if (bl2) {
                throw null;
            }
            object = iz0_2.INSTANCE;
            this.lazySet(object);
            new RuntimeException("Can't deliver value due to lack of requests");
            throw null;
        }
    }
}

