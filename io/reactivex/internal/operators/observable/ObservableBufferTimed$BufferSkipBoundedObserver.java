/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.observable;

import java.util.ArrayList;

final class ObservableBufferTimed$BufferSkipBoundedObserver
extends vc2_2
implements Runnable,
yr0_2 {
    public yr0_2 c;

    public final void a(yr0_2 yr0_22) {
        yr0_2 yr0_23 = this.c;
        boolean bl2 = gr0_2.validate(yr0_23, yr0_22);
        if (!bl2) {
            return;
        }
        this.c = yr0_22;
        bl2 = false;
        yr0_23 = null;
        try {
            throw null;
        }
        catch (Throwable throwable) {
            mm0.h(throwable);
            yr0_22.dispose();
            iz0_2.error(throwable, null);
            throw null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(Object object) {
        synchronized (this) {
            object = null;
            throw null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void dispose() {
        boolean bl2 = this.b;
        if (bl2) {
            return;
        }
        this.b = true;
        synchronized (this) {
            bl2 = false;
            Object var2_2 = null;
            throw null;
        }
    }

    public final boolean isDisposed() {
        return this.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onComplete() {
        synchronized (this) {
            ArrayList arrayList = new ArrayList(null);
            throw null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onError(Throwable throwable) {
        synchronized (this) {
            throwable = null;
            throw null;
        }
    }

    public final void run() {
        boolean bl2 = this.b;
        if (bl2) {
            return;
        }
        bl2 = false;
        try {
            throw null;
        }
        catch (Throwable throwable) {
            mm0.h(throwable);
            throw null;
        }
    }
}

