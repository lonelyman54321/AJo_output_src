/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.single;

import io.reactivex.Scheduler;
import java.util.concurrent.atomic.AtomicReference;

final class SingleObserveOn$ObserveOnSingleObserver
extends AtomicReference
implements t53_0,
yr0_2,
Runnable {
    private static final long serialVersionUID = 3528003840217436037L;
    public final t53_0 a;
    public final Scheduler b;
    public Object c;
    public Throwable d;

    public SingleObserveOn$ObserveOnSingleObserver(t53_0 t53_02, Scheduler scheduler) {
        this.a = t53_02;
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

    public final void onError(Throwable object) {
        this.d = object;
        object = this.b.b(this);
        gr0_2.replace(this, (yr0_2)object);
    }

    public final void onSuccess(Object object) {
        this.c = object;
        object = this.b.b(this);
        gr0_2.replace(this, (yr0_2)object);
    }

    public final void run() {
        Object object = this.d;
        t53_0 t53_02 = this.a;
        if (object != null) {
            t53_02.onError((Throwable)object);
        } else {
            object = this.c;
            t53_02.onSuccess(object);
        }
    }
}

