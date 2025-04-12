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
import io.reactivex.Scheduler;
import io.reactivex.Scheduler$Worker;
import io.reactivex.android.schedulers.HandlerScheduler$ScheduledRunnable;
import io.reactivex.android.schedulers.HandlerScheduler$a;
import java.util.concurrent.TimeUnit;

public final class HandlerScheduler
extends Scheduler {
    public final Handler c;
    public final boolean d;

    public HandlerScheduler(Handler handler) {
        this.c = handler;
        this.d = false;
    }

    public final Scheduler$Worker a() {
        Handler handler = this.c;
        boolean bl2 = this.d;
        HandlerScheduler$a handlerScheduler$a = new HandlerScheduler$a(handler, bl2);
        return handlerScheduler$a;
    }

    public final yr0_2 c(Runnable object, long l2, TimeUnit timeUnit) {
        if (object != null) {
            if (timeUnit != null) {
                Handler handler = this.c;
                HandlerScheduler$ScheduledRunnable handlerScheduler$ScheduledRunnable = new HandlerScheduler$ScheduledRunnable(handler, (Runnable)object);
                object = Message.obtain((Handler)handler, (Runnable)handlerScheduler$ScheduledRunnable);
                boolean bl2 = this.d;
                if (bl2) {
                    g21_0.a((Message)object);
                }
                l2 = timeUnit.toMillis(l2);
                handler.sendMessageDelayed((Message)object, l2);
                return handlerScheduler$ScheduledRunnable;
            }
            object = new NullPointerException("unit == null");
            throw object;
        }
        object = new NullPointerException("run == null");
        throw object;
    }
}

