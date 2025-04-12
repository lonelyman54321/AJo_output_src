/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.flowable;

import java.util.ArrayList;

final class FlowableBufferTimed$BufferSkipBoundedSubscriber
extends wc2_2
implements ef3_2,
Runnable {
    public ef3_2 d;

    public final void a(ef3_2 ef3_22) {
        ef3_2 ef3_23 = this.d;
        boolean bl2 = gf3_2.validate(ef3_23, ef3_22);
        if (!bl2) {
            return;
        }
        this.d = ef3_22;
        ef3_22 = null;
        try {
            throw null;
        }
        catch (Throwable throwable) {
            mm0.h(throwable);
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

    public final void cancel() {
        this.c = true;
        this.d.cancel();
        throw null;
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

    public final void onError(Throwable throwable) {
        throw null;
    }

    public final void run() {
        boolean bl2 = this.c;
        if (bl2) {
            return;
        }
        bl2 = false;
        try {
            throw null;
        }
        catch (Throwable throwable) {
            mm0.h(throwable);
            this.cancel();
            throw null;
        }
    }
}

