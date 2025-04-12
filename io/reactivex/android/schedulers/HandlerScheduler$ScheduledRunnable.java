/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package io.reactivex.android.schedulers;

import android.os.Handler;

final class HandlerScheduler$ScheduledRunnable
implements Runnable,
yr0_2 {
    public final Handler a;
    public final Runnable b;
    public volatile boolean c;

    public HandlerScheduler$ScheduledRunnable(Handler handler, Runnable runnable2) {
        this.a = handler;
        this.b = runnable2;
    }

    public final void dispose() {
        this.a.removeCallbacks((Runnable)this);
        this.c = true;
    }

    public final boolean isDisposed() {
        return this.c;
    }

    public final void run() {
        Runnable runnable2 = this.b;
        try {
            runnable2.run();
        }
        catch (Throwable throwable) {
            dr2_2.b(throwable);
        }
    }
}

