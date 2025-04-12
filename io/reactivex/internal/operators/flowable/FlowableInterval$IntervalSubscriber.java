/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;

final class FlowableInterval$IntervalSubscriber
extends AtomicLong
implements ef3_2,
Runnable {
    private static final long serialVersionUID = -2809475196591179431L;

    public final void cancel() {
        gr0_2.dispose(null);
    }

    public final void request(long l2) {
        boolean bl2 = gf3_2.validate(l2);
        if (bl2) {
            bu_2.a(this, l2);
        }
    }

    public final void run() {
        throw null;
    }
}

