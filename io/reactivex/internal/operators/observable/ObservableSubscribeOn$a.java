/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;

public final class ObservableSubscribeOn$a
extends AtomicReference
implements e62_0,
yr0_2 {
    private static final long serialVersionUID = 8094547886072529208L;
    public final e62_0 a;
    public final AtomicReference b;

    public ObservableSubscribeOn$a(e62_0 atomicReference) {
        this.a = atomicReference;
        this.b = atomicReference = new AtomicReference();
    }

    public final void a(yr0_2 yr0_22) {
        gr0_2.setOnce(this.b, yr0_22);
    }

    public final void b(Object object) {
        this.a.b(object);
    }

    public final void dispose() {
        gr0_2.dispose(this.b);
        gr0_2.dispose(this);
    }

    public final boolean isDisposed() {
        return gr0_2.isDisposed((yr0_2)this.get());
    }

    public final void onComplete() {
        this.a.onComplete();
    }

    public final void onError(Throwable throwable) {
        this.a.onError(throwable);
    }
}

