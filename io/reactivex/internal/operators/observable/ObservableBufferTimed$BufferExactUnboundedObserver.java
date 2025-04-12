/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.observable;

final class ObservableBufferTimed$BufferExactUnboundedObserver
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
        yr0_22 = null;
        try {
            throw null;
        }
        catch (Throwable throwable) {
            mm0.h(throwable);
            this.dispose();
            iz0_2.error(throwable, null);
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

    public final void dispose() {
        gr0_2.dispose(null);
        this.c.dispose();
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
        // MONITORENTER : this
        // MONITOREXIT : this
        gr0_2.dispose(null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void onError(Throwable throwable) {
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
            throw null;
        }
    }
}

