/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.schedulers;

import java.util.concurrent.atomic.AtomicReference;

final class ExecutorScheduler$DelayedRunnable
extends AtomicReference
implements Runnable,
yr0_2 {
    private static final long serialVersionUID = -4101336210206799084L;
    public final lz2_2 a;
    public final lz2_2 b;

    public ExecutorScheduler$DelayedRunnable(Runnable lz2_22) {
        super(lz2_22);
        this.a = lz2_22 = new AtomicReference();
        super();
        this.b = lz2_22;
    }

    public final void dispose() {
        lz2_2 lz2_22 = this.getAndSet(null);
        if (lz2_22 != null) {
            lz2_22 = this.a;
            lz2_22.getClass();
            gr0_2.dispose(lz2_22);
            lz2_22 = this.b;
            lz2_22.getClass();
            gr0_2.dispose(lz2_22);
        }
    }

    public final boolean isDisposed() {
        boolean bl2;
        Object v4 = this.get();
        if (v4 == null) {
            bl2 = true;
        } else {
            bl2 = false;
            v4 = null;
        }
        return bl2;
    }

    public final void run() {
        lz2_2 lz2_22 = this.b;
        yr0_2 yr0_22 = this.a;
        Object object = (Runnable)this.get();
        if (object != null) {
            gr0_2 gr0_22 = null;
            try {
                object.run();
                this.lazySet(null);
                object = gr0_2.DISPOSED;
                yr0_22.lazySet(object);
                lz2_22.lazySet(object);
            }
            catch (Throwable throwable) {
                this.lazySet(null);
                gr0_22 = gr0_2.DISPOSED;
                yr0_22.lazySet(gr0_22);
                yr0_22 = gr0_2.DISPOSED;
                lz2_22.lazySet(yr0_22);
                throw throwable;
            }
        }
    }
}

