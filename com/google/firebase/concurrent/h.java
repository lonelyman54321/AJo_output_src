/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledExecutorService;
import com.google.firebase.concurrent.DelegatingScheduledFuture$Completer;

public final class h
implements Runnable {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ DelegatingScheduledFuture$Completer b;

    public /* synthetic */ h(Runnable runnable2, DelegatingScheduledFuture$Completer delegatingScheduledFuture$Completer) {
        this.a = runnable2;
        this.b = delegatingScheduledFuture$Completer;
    }

    public final void run() {
        Runnable runnable2 = this.a;
        DelegatingScheduledFuture$Completer delegatingScheduledFuture$Completer = this.b;
        DelegatingScheduledExecutorService.k(runnable2, delegatingScheduledFuture$Completer);
    }
}

