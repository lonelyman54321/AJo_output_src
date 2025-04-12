/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import com.google.firebase.concurrent.LimitedConcurrencyExecutorService;
import java.util.concurrent.Callable;

public final class o
implements Callable {
    public final /* synthetic */ Runnable a;

    public /* synthetic */ o(Runnable runnable2) {
        this.a = runnable2;
    }

    public final Object call() {
        return LimitedConcurrencyExecutorService.c(this.a);
    }
}

