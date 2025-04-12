/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.observable;

import io.reactivex.Scheduler$Worker;
import io.reactivex.internal.operators.observable.ObservableDebounceTimed$DebounceEmitter;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableDebounceTimed$a
implements e62_0,
yr0_2 {
    public final e62_0 a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler$Worker d;
    public yr0_2 e;
    public yr0_2 f;
    public volatile long g;
    public boolean h;

    public ObservableDebounceTimed$a(e03_0 e03_02, long l2, TimeUnit timeUnit, Scheduler$Worker scheduler$Worker) {
        this.a = e03_02;
        this.b = l2;
        this.c = timeUnit;
        this.d = scheduler$Worker;
    }

    public final void a(yr0_2 object) {
        yr0_2 yr0_22 = this.e;
        boolean bl2 = gr0_2.validate(yr0_22, (yr0_2)object);
        if (bl2) {
            this.e = object;
            object = this.a;
            object.a(this);
        }
    }

    public final void b(Object object) {
        boolean bl2 = this.h;
        if (bl2) {
            return;
        }
        long l2 = this.g;
        long l3 = 1L;
        this.g = l2 += l3;
        yr0_2 yr0_22 = this.f;
        if (yr0_22 != null) {
            yr0_22.dispose();
        }
        this.f = yr0_22 = new ObservableDebounceTimed$DebounceEmitter(object, l2, this);
        object = this.d;
        l2 = this.b;
        TimeUnit timeUnit = this.c;
        object = ((Scheduler$Worker)object).c((Runnable)((Object)yr0_22), l2, timeUnit);
        gr0_2.replace((AtomicReference)((Object)yr0_22), (yr0_2)object);
    }

    public final void dispose() {
        this.e.dispose();
        this.d.dispose();
    }

    public final boolean isDisposed() {
        return this.d.isDisposed();
    }

    public final void onComplete() {
        boolean bl2 = this.h;
        if (bl2) {
            return;
        }
        this.h = bl2 = true;
        yr0_2 yr0_22 = this.f;
        if (yr0_22 != null) {
            yr0_2 yr0_23 = yr0_22;
            yr0_23 = (ObservableDebounceTimed$DebounceEmitter)yr0_22;
            gr0_2.dispose((AtomicReference)((Object)yr0_23));
        }
        if ((yr0_22 = (ObservableDebounceTimed$DebounceEmitter)yr0_22) != null) {
            ((ObservableDebounceTimed$DebounceEmitter)yr0_22).run();
        }
        this.a.onComplete();
        this.d.dispose();
    }

    public final void onError(Throwable throwable) {
        boolean bl2 = this.h;
        if (bl2) {
            dr2_2.b(throwable);
            return;
        }
        yr0_2 yr0_22 = this.f;
        if (yr0_22 != null) {
            yr0_22 = (ObservableDebounceTimed$DebounceEmitter)yr0_22;
            gr0_2.dispose((AtomicReference)((Object)yr0_22));
        }
        this.h = true;
        this.a.onError(throwable);
        this.d.dispose();
    }
}

