/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.schedulers;

public final class ScheduledDirectPeriodicTask
extends j0_0
implements Runnable {
    private static final long serialVersionUID = 1811839108042568751L;

    public final void run() {
        Runnable runnable2;
        this.b = runnable2 = Thread.currentThread();
        runnable2 = null;
        Runnable runnable3 = this.a;
        runnable3.run();
        try {
            this.b = null;
        }
        catch (Throwable throwable) {
            this.b = null;
            runnable2 = j0_0.c;
            this.lazySet(runnable2);
            dr2_2.b(throwable);
        }
    }
}

