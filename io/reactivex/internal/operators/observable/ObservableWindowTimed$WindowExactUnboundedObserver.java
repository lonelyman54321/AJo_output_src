/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;

final class ObservableWindowTimed$WindowExactUnboundedObserver
extends vc2_2
implements yr0_2,
Runnable {
    public static final Object f;
    public yr0_2 c;
    public uv3_0 d;
    public volatile boolean e;

    public final void a(yr0_2 object) {
        yr0_2 yr0_22 = this.c;
        boolean bl2 = gr0_2.validate(yr0_22, (yr0_2)object);
        if (!bl2) {
            return;
        }
        this.c = object;
        this.d = object = new uv3_0();
        throw null;
    }

    public final void b(Object object) {
        boolean bl2 = this.e;
        if (bl2) {
            return;
        }
        AtomicInteger atomicInteger = this.a;
        int n3 = atomicInteger.get();
        boolean bl3 = false;
        if (n3 == 0 && (bl2 = atomicInteger.compareAndSet(0, n3 = 1))) {
            bl3 = true;
        }
        bl2 = false;
        atomicInteger = null;
        if (bl3) {
            uv3_0 uv3_02 = this.d;
            uv3_02.b(object);
            object = this.a;
            n3 = -1;
            int n4 = ((AtomicInteger)object).addAndGet(n3);
            if (n4 == 0) {
                return;
            }
            throw null;
        }
        r52_0.next(object);
        throw null;
    }

    public final void dispose() {
        this.b = true;
    }

    public final boolean isDisposed() {
        return this.b;
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
        boolean bl2 = this.b;
        if (bl2) {
            this.e = bl2 = true;
        }
        throw null;
    }
}

