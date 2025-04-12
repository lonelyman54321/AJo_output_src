/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.single;

import io.reactivex.Scheduler;
import io.reactivex.internal.operators.single.SingleSubscribeOn$SubscribeOnObserver;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleSubscribeOn
extends g53_0 {
    public final q63_0 a;
    public final Scheduler b;

    public SingleSubscribeOn(q63_0 q63_02, Scheduler scheduler) {
        this.a = q63_02;
        this.b = scheduler;
    }

    public final void g(t53_0 object) {
        q63_0 q63_02 = this.a;
        AtomicReference atomicReference = new SingleSubscribeOn$SubscribeOnObserver((t53_0)object, q63_02);
        object.a((yr0_2)((Object)atomicReference));
        object = this.b.b((Runnable)((Object)atomicReference));
        atomicReference = ((SingleSubscribeOn$SubscribeOnObserver)atomicReference).b;
        atomicReference.getClass();
        gr0_2.replace(atomicReference, (yr0_2)object);
    }
}

