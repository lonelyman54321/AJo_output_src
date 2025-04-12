/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import com.google.firebase.concurrent.LimitedConcurrencyExecutorService;
import java.util.concurrent.Callable;

public final class p
implements Callable {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p(Runnable runnable2, Object object) {
        this.a = runnable2;
        this.b = object;
    }

    public final Object call() {
        Runnable runnable2 = this.a;
        Object object = this.b;
        return LimitedConcurrencyExecutorService.b(runnable2, object);
    }
}

