/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;

final class ObservableRefCount$RefConnection
extends AtomicReference
implements Runnable,
o60_0 {
    private static final long serialVersionUID = -4552101107598366241L;

    public final void accept(Object object) {
        object = (yr0_2)object;
        gr0_2.replace(this, (yr0_2)object);
        throw null;
    }

    public final void run() {
        throw null;
    }
}

