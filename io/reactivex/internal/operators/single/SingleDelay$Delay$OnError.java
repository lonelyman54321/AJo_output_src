/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.single;

import io.reactivex.internal.operators.single.SingleDelay$Delay;

final class SingleDelay$Delay$OnError
implements Runnable {
    public final Throwable a;
    public final /* synthetic */ SingleDelay$Delay b;

    public SingleDelay$Delay$OnError(SingleDelay$Delay delay, Throwable throwable) {
        this.b = delay;
        this.a = throwable;
    }

    public final void run() {
        t53_0 t53_02 = this.b.b;
        Throwable throwable = this.a;
        t53_02.onError(throwable);
    }
}

