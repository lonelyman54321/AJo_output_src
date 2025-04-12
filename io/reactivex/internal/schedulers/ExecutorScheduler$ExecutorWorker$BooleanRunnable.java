/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.schedulers;

import java.util.concurrent.atomic.AtomicBoolean;

final class ExecutorScheduler$ExecutorWorker$BooleanRunnable
extends AtomicBoolean
implements Runnable,
yr0_2 {
    private static final long serialVersionUID = -2421395018820541164L;
    public final Runnable a;

    public ExecutorScheduler$ExecutorWorker$BooleanRunnable(Runnable runnable2) {
        this.a = runnable2;
    }

    public final void dispose() {
        this.lazySet(true);
    }

    public final boolean isDisposed() {
        return this.get();
    }

    public final void run() {
        boolean bl2 = this.get();
        if (bl2) {
            return;
        }
        bl2 = true;
        try {
            Runnable runnable2 = this.a;
            runnable2.run();
            return;
        }
        finally {
            this.lazySet(bl2);
        }
    }
}

