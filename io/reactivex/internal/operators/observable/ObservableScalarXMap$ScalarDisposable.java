/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;

public final class ObservableScalarXMap$ScalarDisposable
extends AtomicInteger
implements uc2_2,
Runnable {
    private static final long serialVersionUID = 3880992722410194083L;

    public final void clear() {
        this.lazySet(3);
    }

    public final void dispose() {
        this.set(3);
    }

    public final boolean isDisposed() {
        int n3;
        int n4 = this.get();
        n4 = n4 == (n3 = 3) ? 1 : 0;
        return n4 != 0;
    }

    public final boolean isEmpty() {
        int n3;
        int n4 = this.get();
        if (n4 == (n3 = 1)) {
            n3 = 0;
        }
        return n3 != 0;
    }

    public final boolean offer(Object object) {
        object = new UnsupportedOperationException("Should not be called!");
        throw object;
    }

    public final Object poll() {
        int n3;
        int n4 = this.get();
        if (n4 == (n3 = 1)) {
            n4 = 3;
            this.lazySet(n4);
        }
        return null;
    }

    public final int requestFusion(int n3) {
        n3 = 1;
        this.lazySet(n3);
        return n3;
    }

    public final void run() {
        int n3;
        int n4 = this.get();
        if (n4 == 0 && (n4 = (int)(this.compareAndSet(0, n3 = 2) ? 1 : 0)) != 0) {
            throw null;
        }
    }
}

