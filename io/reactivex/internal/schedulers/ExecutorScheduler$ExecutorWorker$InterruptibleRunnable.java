/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.schedulers;

import java.util.concurrent.atomic.AtomicInteger;

final class ExecutorScheduler$ExecutorWorker$InterruptibleRunnable
extends AtomicInteger
implements Runnable,
yr0_2 {
    private static final long serialVersionUID = -3603436687413320876L;
    public final Runnable a;
    public final ar0_2 b;
    public volatile Thread c;

    public ExecutorScheduler$ExecutorWorker$InterruptibleRunnable(Runnable runnable2, ar0_2 ar0_22) {
        this.a = runnable2;
        this.b = ar0_22;
    }

    public final void dispose() {
        int n3;
        int n4;
        while ((n4 = this.get()) < (n3 = 2)) {
            Object object;
            n3 = 4;
            if (n4 == 0) {
                object = null;
                n4 = (int)(this.compareAndSet(0, n3) ? 1 : 0);
                if (n4 == 0) continue;
                object = this.b;
                if (object == null) break;
                object.a(this);
                break;
            }
            int n7 = 3;
            n4 = (int)(this.compareAndSet(1, n7) ? 1 : 0);
            if (n4 == 0) continue;
            object = this.c;
            if (object != null) {
                ((Thread)object).interrupt();
                n4 = 0;
                object = null;
                this.c = null;
            }
            this.set(n3);
            object = this.b;
            if (object == null) break;
            object.a(this);
            break;
        }
    }

    public final boolean isDisposed() {
        int n3;
        int n4 = this.get();
        n4 = n4 >= (n3 = 2) ? 1 : 0;
        return n4 != 0;
    }

    public final void run() {
        block11: {
            block12: {
                int n3 = this.get();
                if (n3 != 0) break block11;
                Object object = Thread.currentThread();
                this.c = object;
                object = null;
                int n4 = 1;
                n3 = (int)(this.compareAndSet(0, n4) ? 1 : 0);
                if (n3 == 0) break block12;
                n3 = 3;
                int n7 = 2;
                Runnable runnable2 = this.a;
                try {
                    runnable2.run();
                    this.c = null;
                }
                catch (Throwable throwable) {
                    this.c = null;
                    n4 = (int)(this.compareAndSet(n4, n7) ? 1 : 0);
                    if (n4 == 0) {
                        while ((n4 = this.get()) == n3) {
                            Thread.yield();
                        }
                        Thread.interrupted();
                    } else {
                        object = this.b;
                        if (object != null) {
                            object.a(this);
                        }
                    }
                    throw throwable;
                }
                n4 = (int)(this.compareAndSet(n4, n7) ? 1 : 0);
                if (n4 != 0) {
                    object = this.b;
                    if (object != null) {
                        object.a(this);
                    }
                } else {
                    while ((n4 = this.get()) == n3) {
                        Thread.yield();
                    }
                    Thread.interrupted();
                }
                break block11;
            }
            this.c = null;
        }
    }
}

