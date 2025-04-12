/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledExecutorService;
import com.google.firebase.concurrent.DelegatingScheduledFuture$Completer;
import java.util.concurrent.Callable;

public final class l
implements Callable {
    public final /* synthetic */ DelegatingScheduledExecutorService a;
    public final /* synthetic */ Callable b;
    public final /* synthetic */ DelegatingScheduledFuture$Completer c;

    public /* synthetic */ l(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Callable callable, DelegatingScheduledFuture$Completer delegatingScheduledFuture$Completer) {
        this.a = delegatingScheduledExecutorService;
        this.b = callable;
        this.c = delegatingScheduledFuture$Completer;
    }

    public final Object call() {
        Callable callable = this.b;
        DelegatingScheduledFuture$Completer delegatingScheduledFuture$Completer = this.c;
        return DelegatingScheduledExecutorService.g(this.a, callable, delegatingScheduledFuture$Completer);
    }
}

