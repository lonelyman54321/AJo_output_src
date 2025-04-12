/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.single;

import io.reactivex.Scheduler;
import io.reactivex.internal.operators.single.SingleDelay$Delay;
import io.reactivex.internal.operators.single.SingleSubscribeOn;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleDelay
extends g53_0 {
    public final q63_0 a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public final boolean e;

    public SingleDelay(SingleSubscribeOn singleSubscribeOn, long l2, TimeUnit timeUnit, Scheduler scheduler) {
        this.a = singleSubscribeOn;
        this.b = l2;
        this.c = timeUnit;
        this.d = scheduler;
        this.e = false;
    }

    public final void g(t53_0 t53_02) {
        lz2_2 lz2_22 = new AtomicReference();
        t53_02.a(lz2_22);
        SingleDelay$Delay singleDelay$Delay = new SingleDelay$Delay(this, lz2_22, t53_02);
        this.a.a(singleDelay$Delay);
    }
}

