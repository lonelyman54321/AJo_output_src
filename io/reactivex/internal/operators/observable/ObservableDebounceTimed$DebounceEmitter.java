/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.observable;

import io.reactivex.internal.operators.observable.ObservableDebounceTimed$a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

final class ObservableDebounceTimed$DebounceEmitter
extends AtomicReference
implements Runnable,
yr0_2 {
    private static final long serialVersionUID = 6812032969491025141L;
    public final Object a;
    public final long b;
    public final ObservableDebounceTimed$a c;
    public final AtomicBoolean d;

    public ObservableDebounceTimed$DebounceEmitter(Object object, long l2, ObservableDebounceTimed$a a2) {
        AtomicBoolean atomicBoolean;
        this.d = atomicBoolean = new AtomicBoolean();
        this.a = object;
        this.b = l2;
        this.c = a2;
    }

    public final void dispose() {
        gr0_2.dispose(this);
    }

    public final boolean isDisposed() {
        boolean bl2;
        gr0_2 gr0_22;
        Object v4 = this.get();
        if (v4 == (gr0_22 = gr0_2.DISPOSED)) {
            bl2 = true;
        } else {
            bl2 = false;
            v4 = null;
        }
        return bl2;
    }

    public final void run() {
        Object object = this.d;
        boolean bl2 = true;
        boolean bl3 = ((AtomicBoolean)object).compareAndSet(false, bl2);
        if (bl3) {
            object = this.c;
            long l2 = this.b;
            Object object2 = this.a;
            long l3 = ((ObservableDebounceTimed$a)object).g;
            long l4 = l2 - l3;
            Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object3 == false) {
                object = ((ObservableDebounceTimed$a)object).a;
                object.b(object2);
                gr0_2.dispose(this);
            }
        }
    }
}

