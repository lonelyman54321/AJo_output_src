/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledExecutorService;
import com.google.firebase.concurrent.DelegatingScheduledFuture$Completer;
import com.google.firebase.concurrent.DelegatingScheduledFuture$Resolver;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class b
implements DelegatingScheduledFuture$Resolver {
    public final /* synthetic */ DelegatingScheduledExecutorService a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TimeUnit d;

    public /* synthetic */ b(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable2, long l2, TimeUnit timeUnit) {
        this.a = delegatingScheduledExecutorService;
        this.b = runnable2;
        this.c = l2;
        this.d = timeUnit;
    }

    public final ScheduledFuture addCompleter(DelegatingScheduledFuture$Completer delegatingScheduledFuture$Completer) {
        long l2 = this.c;
        TimeUnit timeUnit = this.d;
        DelegatingScheduledExecutorService delegatingScheduledExecutorService = this.a;
        Runnable runnable2 = this.b;
        return DelegatingScheduledExecutorService.m(delegatingScheduledExecutorService, runnable2, l2, timeUnit, delegatingScheduledFuture$Completer);
    }
}

