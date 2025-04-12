/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.single;

import io.reactivex.Scheduler;
import io.reactivex.internal.operators.single.SingleDelay;
import io.reactivex.internal.operators.single.SingleDelay$Delay$OnError;
import io.reactivex.internal.operators.single.SingleDelay$Delay$OnSuccess;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleDelay$Delay
implements t53_0 {
    public final lz2_2 a;
    public final t53_0 b;
    public final /* synthetic */ SingleDelay c;

    public SingleDelay$Delay(SingleDelay singleDelay, lz2_2 lz2_22, t53_0 t53_02) {
        this.c = singleDelay;
        this.a = lz2_22;
        this.b = t53_02;
    }

    public final void a(yr0_2 yr0_22) {
        lz2_2 lz2_22 = this.a;
        lz2_22.getClass();
        gr0_2.replace(lz2_22, yr0_22);
    }

    public final void onError(Throwable object) {
        Object object2 = this.c;
        Scheduler scheduler = ((SingleDelay)object2).d;
        SingleDelay$Delay$OnError singleDelay$Delay$OnError = new SingleDelay$Delay$OnError(this, (Throwable)object);
        boolean bl2 = ((SingleDelay)object2).e;
        long l2 = bl2 ? ((SingleDelay)object2).b : 0L;
        object = ((SingleDelay)object2).c;
        object = scheduler.c(singleDelay$Delay$OnError, l2, (TimeUnit)((Object)object));
        object2 = this.a;
        object2.getClass();
        gr0_2.replace((AtomicReference)object2, (yr0_2)object);
    }

    public final void onSuccess(Object object) {
        Object object2 = this.c;
        Scheduler scheduler = ((SingleDelay)object2).d;
        SingleDelay$Delay$OnSuccess singleDelay$Delay$OnSuccess = new SingleDelay$Delay$OnSuccess(this, object);
        long l2 = ((SingleDelay)object2).b;
        object = ((SingleDelay)object2).c;
        object = scheduler.c(singleDelay$Delay$OnSuccess, l2, (TimeUnit)((Object)object));
        object2 = this.a;
        object2.getClass();
        gr0_2.replace((AtomicReference)object2, (yr0_2)object);
    }
}

