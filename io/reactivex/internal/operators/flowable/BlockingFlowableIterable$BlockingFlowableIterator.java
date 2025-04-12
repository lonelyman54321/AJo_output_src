/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.flowable;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;

final class BlockingFlowableIterable$BlockingFlowableIterator
extends AtomicReference
implements df3_2,
Iterator,
Runnable,
yr0_2 {
    private static final long serialVersionUID = 6695226475494099826L;
    public volatile Throwable a;

    public final void a(ef3_2 ef3_22) {
        gf3_2.setOnce(this, ef3_22, 0L);
    }

    public final void b(Object object) {
        throw null;
    }

    public final void dispose() {
        gf3_2.cancel(this);
        throw null;
    }

    public final boolean hasNext() {
        boolean bl2 = this.isDisposed();
        if (bl2) {
            Throwable throwable = this.a;
            if (throwable == null) {
                return false;
            }
            throw uc0_2.a(throwable);
        }
        throw null;
    }

    public final boolean isDisposed() {
        boolean bl2;
        gf3_2 gf3_22;
        Object v4 = this.get();
        if (v4 == (gf3_22 = gf3_2.CANCELLED)) {
            bl2 = true;
        } else {
            bl2 = false;
            v4 = null;
        }
        return bl2;
    }

    public final Object next() {
        this.hasNext();
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final void onComplete() {
        throw null;
    }

    public final void onError(Throwable throwable) {
        this.a = throwable;
        throw null;
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("remove");
        throw unsupportedOperationException;
    }

    public final void run() {
        gf3_2.cancel(this);
        throw null;
    }
}

