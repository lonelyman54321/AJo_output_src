/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import com.google.firebase.concurrent.LimitedConcurrencyExecutor;

public final class n
implements Runnable {
    public final /* synthetic */ LimitedConcurrencyExecutor a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ n(LimitedConcurrencyExecutor limitedConcurrencyExecutor, Runnable runnable2) {
        this.a = limitedConcurrencyExecutor;
        this.b = runnable2;
    }

    public final void run() {
        LimitedConcurrencyExecutor limitedConcurrencyExecutor = this.a;
        Runnable runnable2 = this.b;
        LimitedConcurrencyExecutor.a(limitedConcurrencyExecutor, runnable2);
    }
}

