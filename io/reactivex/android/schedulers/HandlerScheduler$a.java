/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Message
 */
package io.reactivex.android.schedulers;

import android.os.Handler;
import android.os.Message;
import io.reactivex.Scheduler$Worker;
import io.reactivex.android.schedulers.HandlerScheduler$ScheduledRunnable;
import java.util.concurrent.TimeUnit;

public final class HandlerScheduler$a
extends Scheduler$Worker {
    public final Handler a;
    public final boolean b;
    public volatile boolean c;

    public HandlerScheduler$a(Handler handler, boolean bl2) {
        this.a = handler;
        this.b = bl2;
    }

    public final yr0_2 c(Runnable object, long l2, TimeUnit timeUnit) {
        if (object != null) {
            if (timeUnit != null) {
                boolean bl2 = this.c;
                if (bl2) {
                    return iz0_2.INSTANCE;
                }
                Handler handler = this.a;
                HandlerScheduler$ScheduledRunnable handlerScheduler$ScheduledRunnable = new HandlerScheduler$ScheduledRunnable(handler, (Runnable)object);
                object = Message.obtain((Handler)handler, (Runnable)handlerScheduler$ScheduledRunnable);
                ((Message)object).obj = this;
                boolean bl3 = this.b;
                if (bl3) {
                    g21_0.a((Message)object);
                }
                handler = this.a;
                l2 = timeUnit.toMillis(l2);
                handler.sendMessageDelayed((Message)object, l2);
                boolean bl4 = this.c;
                if (bl4) {
                    this.a.removeCallbacks((Runnable)handlerScheduler$ScheduledRunnable);
                    return iz0_2.INSTANCE;
                }
                return handlerScheduler$ScheduledRunnable;
            }
            object = new NullPointerException("unit == null");
            throw object;
        }
        object = new NullPointerException("run == null");
        throw object;
    }

    public final void dispose() {
        this.c = true;
        this.a.removeCallbacksAndMessages((Object)this);
    }

    public final boolean isDisposed() {
        return this.c;
    }
}

