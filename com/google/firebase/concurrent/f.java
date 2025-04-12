/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledExecutorService;
import com.google.firebase.concurrent.DelegatingScheduledFuture$Completer;

public final class f
implements Runnable {
    public final /* synthetic */ DelegatingScheduledExecutorService a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ DelegatingScheduledFuture$Completer c;

    public /* synthetic */ f(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable2, DelegatingScheduledFuture$Completer delegatingScheduledFuture$Completer) {
        this.a = delegatingScheduledExecutorService;
        this.b = runnable2;
        this.c = delegatingScheduledFuture$Completer;
    }

    public final void run() {
        Runnable runnable2 = this.b;
        DelegatingScheduledFuture$Completer delegatingScheduledFuture$Completer = this.c;
        DelegatingScheduledExecutorService.j(this.a, runnable2, delegatingScheduledFuture$Completer);
    }
}

