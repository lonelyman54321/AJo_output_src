/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import com.google.firebase.concurrent.PausableExecutorServiceImpl;
import java.util.concurrent.Callable;

public final class q
implements Callable {
    public final /* synthetic */ Runnable a;

    public /* synthetic */ q(Runnable runnable2) {
        this.a = runnable2;
    }

    public final Object call() {
        return PausableExecutorServiceImpl.a(this.a);
    }
}

