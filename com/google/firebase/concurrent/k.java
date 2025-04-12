/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledExecutorService;
import com.google.firebase.concurrent.DelegatingScheduledFuture$Completer;
import java.util.concurrent.Callable;

public final class k
implements Runnable {
    public final /* synthetic */ Callable a;
    public final /* synthetic */ DelegatingScheduledFuture$Completer b;

    public /* synthetic */ k(Callable callable, DelegatingScheduledFuture$Completer delegatingScheduledFuture$Completer) {
        this.a = callable;
        this.b = delegatingScheduledFuture$Completer;
    }

    public final void run() {
        Callable callable = this.a;
        DelegatingScheduledFuture$Completer delegatingScheduledFuture$Completer = this.b;
        DelegatingScheduledExecutorService.d(callable, delegatingScheduledFuture$Completer);
    }
}

