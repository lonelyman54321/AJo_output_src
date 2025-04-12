/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.flowable;

final class FlowableBufferTimed$BufferExactUnboundedSubscriber
extends wc2_2
implements ef3_2,
Runnable,
yr0_2 {
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
            this.cancel();
            xz0_2.error(throwable, null);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void b(Object object) {
        // MONITORENTER : this
        // MONITOREXIT : this
    }

    public final void cancel() {
        this.c = true;
        this.d.cancel();
        gr0_2.dispose(null);
    }

    public final void dispose() {
        this.cancel();
    }

    public final boolean isDisposed() {
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void onComplete() {
        Object var1_1 = null;
        gr0_2.dispose(null);
        // MONITORENTER : this
        // MONITOREXIT : this
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void onError(Throwable throwable) {
        throwable = null;
        gr0_2.dispose(null);
        // MONITORENTER : this
        // MONITOREXIT : this
        throw null;
    }

    public final void run() {
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

