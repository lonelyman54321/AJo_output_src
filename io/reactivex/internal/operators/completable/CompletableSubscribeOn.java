/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.completable;

import io.reactivex.Scheduler;
import io.reactivex.internal.operators.completable.CompletableSubscribeOn$SubscribeOnObserver;
import java.util.concurrent.atomic.AtomicReference;

public final class CompletableSubscribeOn
extends u00_0 {
    public final u00_0 a;
    public final Scheduler b;

    public CompletableSubscribeOn(u00_0 u00_02, Scheduler scheduler) {
        this.a = u00_02;
        this.b = scheduler;
    }

    public final void b(h00_0 object) {
        u00_0 u00_02 = this.a;
        AtomicReference atomicReference = new CompletableSubscribeOn$SubscribeOnObserver((h00_0)object, u00_02);
        object.a((yr0_2)((Object)atomicReference));
        object = this.b.b((Runnable)((Object)atomicReference));
        atomicReference = ((CompletableSubscribeOn$SubscribeOnObserver)atomicReference).b;
        atomicReference.getClass();
        gr0_2.replace(atomicReference, (yr0_2)object);
    }
}

