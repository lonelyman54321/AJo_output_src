/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledExecutorService;
import com.google.firebase.concurrent.DelegatingScheduledFuture$Completer;
import com.google.firebase.concurrent.DelegatingScheduledFuture$Resolver;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class g
implements DelegatingScheduledFuture$Resolver {
    public final /* synthetic */ DelegatingScheduledExecutorService a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TimeUnit e;

    public /* synthetic */ g(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable2, long l2, long l3, TimeUnit timeUnit) {
        this.a = delegatingScheduledExecutorService;
        this.b = runnable2;
        this.c = l2;
        this.d = l3;
        this.e = timeUnit;
    }

    public final ScheduledFuture addCompleter(DelegatingScheduledFuture$Completer delegatingScheduledFuture$Completer) {
        long l2 = this.d;
        TimeUnit timeUnit = this.e;
        DelegatingScheduledExecutorService delegatingScheduledExecutorService = this.a;
        Runnable runnable2 = this.b;
        long l3 = this.c;
        return DelegatingScheduledExecutorService.c(delegatingScheduledExecutorService, runnable2, l3, l2, timeUnit, delegatingScheduledFuture$Completer);
    }
}

