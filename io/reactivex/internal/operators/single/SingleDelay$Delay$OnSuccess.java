/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.single;

import io.reactivex.internal.operators.single.SingleDelay$Delay;

final class SingleDelay$Delay$OnSuccess
implements Runnable {
    public final Object a;
    public final /* synthetic */ SingleDelay$Delay b;

    public SingleDelay$Delay$OnSuccess(SingleDelay$Delay singleDelay$Delay, Object object) {
        this.b = singleDelay$Delay;
        this.a = object;
    }

    public final void run() {
        t53_0 t53_02 = this.b.b;
        Object object = this.a;
        t53_02.onSuccess(object);
    }
}

