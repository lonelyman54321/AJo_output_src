/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.WrappingExecutorService;
import java.util.concurrent.Callable;

public final class t
implements Runnable {
    public final /* synthetic */ Callable a;

    public /* synthetic */ t(Callable callable) {
        this.a = callable;
    }

    public final void run() {
        WrappingExecutorService.a(this.a);
    }
}

