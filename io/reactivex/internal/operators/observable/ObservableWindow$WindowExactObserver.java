/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;

final class ObservableWindow$WindowExactObserver
extends AtomicInteger
implements e62_0,
yr0_2,
Runnable {
    private static final long serialVersionUID = -7481782523886138128L;
    public long a;
    public yr0_2 b;
    public uv3_0 c;
    public volatile boolean d;

    public final void a(yr0_2 yr0_22) {
        yr0_2 yr0_23 = this.b;
        boolean bl2 = gr0_2.validate(yr0_23, yr0_22);
        if (!bl2) {
            return;
        }
        this.b = yr0_22;
        throw null;
    }

    public final void b(Object object) {
        boolean bl2;
        uv3_0 uv3_02 = this.c;
        if (uv3_02 == null && !(bl2 = this.d)) {
            this.c = object = new uv3_0(this);
            throw null;
        }
        if (uv3_02 != null) {
            long l2;
            uv3_02.b(object);
            this.a = l2 = this.a + 1L;
            long l3 = 0L;
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l4 >= 0) {
                this.a = l3;
                this.c = null;
                uv3_02.onComplete();
                l4 = (long)this.d;
                if (l4 != false) {
                    object = this.b;
                    object.dispose();
                }
            }
        }
    }

    public final void dispose() {
        this.d = true;
    }

    public final boolean isDisposed() {
        return this.d;
    }

    public final void onComplete() {
        uv3_0 uv3_02 = this.c;
        if (uv3_02 != null) {
            this.c = null;
            uv3_02.onComplete();
        }
        throw null;
    }

    public final void onError(Throwable throwable) {
        uv3_0 uv3_02 = this.c;
        if (uv3_02 != null) {
            this.c = null;
            uv3_02.onError(throwable);
        }
        throw null;
    }

    public final void run() {
        boolean bl2 = this.d;
        if (bl2) {
            yr0_2 yr0_22 = this.b;
            yr0_22.dispose();
        }
    }
}

