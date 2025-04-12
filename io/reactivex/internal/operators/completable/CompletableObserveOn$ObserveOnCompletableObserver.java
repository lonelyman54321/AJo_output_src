/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.completable;

import io.reactivex.Scheduler;
import java.util.concurrent.atomic.AtomicReference;

final class CompletableObserveOn$ObserveOnCompletableObserver
extends AtomicReference
implements h00_0,
yr0_2,
Runnable {
    private static final long serialVersionUID = 8571289934935992137L;
    public final h00_0 a;
    public final Scheduler b;
    public Throwable c;

    public CompletableObserveOn$ObserveOnCompletableObserver(h00_0 h00_02, Scheduler scheduler) {
        this.a = h00_02;
        this.b = scheduler;
    }

    public final void a(yr0_2 object) {
        boolean bl2 = gr0_2.setOnce(this, (yr0_2)object);
        if (bl2) {
            object = this.a;
            object.a(this);
        }
    }

    public final void dispose() {
        gr0_2.dispose(this);
    }

    public final boolean isDisposed() {
        return gr0_2.isDisposed((yr0_2)this.get());
    }

    public final void onComplete() {
        yr0_2 yr0_22 = this.b.b(this);
        gr0_2.replace(this, yr0_22);
    }

    public final void onError(Throwable object) {
        this.c = object;
        object = this.b.b(this);
        gr0_2.replace(this, (yr0_2)object);
    }

    public final void run() {
        Throwable throwable = this.c;
        h00_0 h00_02 = this.a;
        if (throwable != null) {
            this.c = null;
            h00_02.onError(throwable);
        } else {
            h00_02.onComplete();
        }
    }
}

