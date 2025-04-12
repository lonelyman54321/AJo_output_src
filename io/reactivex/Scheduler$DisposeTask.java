/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex;

import io.reactivex.Scheduler$Worker;

final class Scheduler$DisposeTask
implements yr0_2,
Runnable {
    public final Runnable a;
    public final Scheduler$Worker b;
    public Thread c;

    public Scheduler$DisposeTask(Runnable runnable2, Scheduler$Worker scheduler$Worker) {
        this.a = runnable2;
        this.b = scheduler$Worker;
    }

    public final void dispose() {
        boolean bl2;
        Object object = this.c;
        Thread thread2 = Thread.currentThread();
        if (object == thread2 && (bl2 = (object = this.b) instanceof b32_0)) {
            object = (b32_0)object;
            bl2 = ((b32_0)object).b;
            if (!bl2) {
                ((b32_0)object).b = bl2 = true;
                object = ((b32_0)object).a;
                object.shutdown();
            }
        } else {
            object = this.b;
            object.dispose();
        }
    }

    public final boolean isDisposed() {
        return this.b.isDisposed();
    }

    public final void run() {
        Thread thread2;
        this.c = thread2 = Thread.currentThread();
        thread2 = null;
        try {
            Runnable runnable2 = this.a;
            runnable2.run();
            return;
        }
        finally {
            this.dispose();
            this.c = null;
        }
    }
}

