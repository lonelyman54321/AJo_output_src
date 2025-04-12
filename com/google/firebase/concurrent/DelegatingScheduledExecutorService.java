/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import com.google.firebase.concurrent.DelegatingScheduledFuture$Completer;
import com.google.firebase.concurrent.b;
import com.google.firebase.concurrent.c;
import com.google.firebase.concurrent.d;
import com.google.firebase.concurrent.e;
import com.google.firebase.concurrent.f;
import com.google.firebase.concurrent.g;
import com.google.firebase.concurrent.h;
import com.google.firebase.concurrent.i;
import com.google.firebase.concurrent.j;
import com.google.firebase.concurrent.k;
import com.google.firebase.concurrent.l;
import com.google.firebase.concurrent.m;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class DelegatingScheduledExecutorService
implements ScheduledExecutorService {
    private final ExecutorService delegate;
    private final ScheduledExecutorService scheduler;

    public DelegatingScheduledExecutorService(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.delegate = executorService;
        this.scheduler = scheduledExecutorService;
    }

    public static /* synthetic */ ScheduledFuture a(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Callable callable, long l2, TimeUnit timeUnit, DelegatingScheduledFuture$Completer completer) {
        return delegatingScheduledExecutorService.lambda$schedule$5(callable, l2, timeUnit, completer);
    }

    public static /* synthetic */ ScheduledFuture b(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable2, long l2, long l3, TimeUnit timeUnit, DelegatingScheduledFuture$Completer completer) {
        return delegatingScheduledExecutorService.lambda$scheduleWithFixedDelay$11(runnable2, l2, l3, timeUnit, completer);
    }

    public static /* synthetic */ ScheduledFuture c(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable2, long l2, long l3, TimeUnit timeUnit, DelegatingScheduledFuture$Completer completer) {
        return delegatingScheduledExecutorService.lambda$scheduleAtFixedRate$8(runnable2, l2, l3, timeUnit, completer);
    }

    public static /* synthetic */ void d(Callable callable, DelegatingScheduledFuture$Completer completer) {
        DelegatingScheduledExecutorService.lambda$schedule$3(callable, completer);
    }

    public static /* synthetic */ void e(Runnable runnable2, DelegatingScheduledFuture$Completer completer) {
        DelegatingScheduledExecutorService.lambda$scheduleAtFixedRate$6(runnable2, completer);
    }

    public static /* synthetic */ void f(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable2, DelegatingScheduledFuture$Completer completer) {
        delegatingScheduledExecutorService.lambda$scheduleAtFixedRate$7(runnable2, completer);
    }

    public static /* synthetic */ Future g(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Callable callable, DelegatingScheduledFuture$Completer completer) {
        return delegatingScheduledExecutorService.lambda$schedule$4(callable, completer);
    }

    public static /* synthetic */ void i(Runnable runnable2, DelegatingScheduledFuture$Completer completer) {
        DelegatingScheduledExecutorService.lambda$scheduleWithFixedDelay$9(runnable2, completer);
    }

    public static /* synthetic */ void j(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable2, DelegatingScheduledFuture$Completer completer) {
        delegatingScheduledExecutorService.lambda$schedule$1(runnable2, completer);
    }

    public static /* synthetic */ void k(Runnable runnable2, DelegatingScheduledFuture$Completer completer) {
        DelegatingScheduledExecutorService.lambda$schedule$0(runnable2, completer);
    }

    public static /* synthetic */ void l(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable2, DelegatingScheduledFuture$Completer completer) {
        delegatingScheduledExecutorService.lambda$scheduleWithFixedDelay$10(runnable2, completer);
    }

    private static /* synthetic */ void lambda$schedule$0(Runnable runnable2, DelegatingScheduledFuture$Completer delegatingScheduledFuture$Completer) {
        runnable2.run();
        runnable2 = null;
        try {
            delegatingScheduledFuture$Completer.set(null);
        }
        catch (Exception exception) {
            delegatingScheduledFuture$Completer.setException(exception);
        }
    }

    private /* synthetic */ void lambda$schedule$1(Runnable runnable2, DelegatingScheduledFuture$Completer delegatingScheduledFuture$Completer) {
        ExecutorService executorService = this.delegate;
        h h3 = new h(runnable2, delegatingScheduledFuture$Completer);
        executorService.execute(h3);
    }

    private /* synthetic */ ScheduledFuture lambda$schedule$2(Runnable runnable2, long l2, TimeUnit timeUnit, DelegatingScheduledFuture$Completer delegatingScheduledFuture$Completer) {
        ScheduledExecutorService scheduledExecutorService = this.scheduler;
        f f5 = new f(this, runnable2, delegatingScheduledFuture$Completer);
        return scheduledExecutorService.schedule(f5, l2, timeUnit);
    }

    private static /* synthetic */ void lambda$schedule$3(Callable callable, DelegatingScheduledFuture$Completer delegatingScheduledFuture$Completer) {
        callable = callable.call();
        try {
            delegatingScheduledFuture$Completer.set(callable);
        }
        catch (Exception exception) {
            delegatingScheduledFuture$Completer.setException(exception);
        }
    }

    private /* synthetic */ Future lambda$schedule$4(Callable callable, DelegatingScheduledFuture$Completer delegatingScheduledFuture$Completer) {
        ExecutorService executorService = this.delegate;
        k k2 = new k(callable, delegatingScheduledFuture$Completer);
        return executorService.submit(k2);
    }

    private /* synthetic */ ScheduledFuture lambda$schedule$5(Callable callable, long l2, TimeUnit timeUnit, DelegatingScheduledFuture$Completer delegatingScheduledFuture$Completer) {
        ScheduledExecutorService scheduledExecutorService = this.scheduler;
        l l3 = new l(this, callable, delegatingScheduledFuture$Completer);
        return scheduledExecutorService.schedule(l3, l2, timeUnit);
    }

    private static /* synthetic */ void lambda$scheduleAtFixedRate$6(Runnable runnable2, DelegatingScheduledFuture$Completer delegatingScheduledFuture$Completer) {
        try {
            runnable2.run();
            return;
        }
        catch (Exception exception) {
            delegatingScheduledFuture$Completer.setException(exception);
            throw exception;
        }
    }

    private /* synthetic */ void lambda$scheduleAtFixedRate$7(Runnable runnable2, DelegatingScheduledFuture$Completer delegatingScheduledFuture$Completer) {
        ExecutorService executorService = this.delegate;
        m m2 = new m(runnable2, delegatingScheduledFuture$Completer);
        executorService.execute(m2);
    }

    private /* synthetic */ ScheduledFuture lambda$scheduleAtFixedRate$8(Runnable runnable2, long l2, long l3, TimeUnit timeUnit, DelegatingScheduledFuture$Completer delegatingScheduledFuture$Completer) {
        ScheduledExecutorService scheduledExecutorService = this.scheduler;
        e e2 = new e(this, runnable2, delegatingScheduledFuture$Completer);
        return scheduledExecutorService.scheduleAtFixedRate(e2, l2, l3, timeUnit);
    }

    private /* synthetic */ void lambda$scheduleWithFixedDelay$10(Runnable runnable2, DelegatingScheduledFuture$Completer delegatingScheduledFuture$Completer) {
        ExecutorService executorService = this.delegate;
        c c2 = new c(runnable2, delegatingScheduledFuture$Completer);
        executorService.execute(c2);
    }

    private /* synthetic */ ScheduledFuture lambda$scheduleWithFixedDelay$11(Runnable runnable2, long l2, long l3, TimeUnit timeUnit, DelegatingScheduledFuture$Completer delegatingScheduledFuture$Completer) {
        ScheduledExecutorService scheduledExecutorService = this.scheduler;
        d d2 = new d(this, runnable2, delegatingScheduledFuture$Completer);
        return scheduledExecutorService.scheduleWithFixedDelay(d2, l2, l3, timeUnit);
    }

    private static /* synthetic */ void lambda$scheduleWithFixedDelay$9(Runnable runnable2, DelegatingScheduledFuture$Completer delegatingScheduledFuture$Completer) {
        try {
            runnable2.run();
        }
        catch (Exception exception) {
            delegatingScheduledFuture$Completer.setException(exception);
        }
    }

    public static /* synthetic */ ScheduledFuture m(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable2, long l2, TimeUnit timeUnit, DelegatingScheduledFuture$Completer delegatingScheduledFuture$Completer) {
        return delegatingScheduledExecutorService.lambda$schedule$2(runnable2, l2, timeUnit, delegatingScheduledFuture$Completer);
    }

    public boolean awaitTermination(long l2, TimeUnit timeUnit) {
        return this.delegate.awaitTermination(l2, timeUnit);
    }

    public void execute(Runnable runnable2) {
        this.delegate.execute(runnable2);
    }

    public List invokeAll(Collection collection) {
        return this.delegate.invokeAll(collection);
    }

    public List invokeAll(Collection collection, long l2, TimeUnit timeUnit) {
        return this.delegate.invokeAll(collection, l2, timeUnit);
    }

    public Object invokeAny(Collection collection) {
        return this.delegate.invokeAny(collection);
    }

    public Object invokeAny(Collection collection, long l2, TimeUnit timeUnit) {
        return this.delegate.invokeAny(collection, l2, timeUnit);
    }

    public boolean isShutdown() {
        return this.delegate.isShutdown();
    }

    public boolean isTerminated() {
        return this.delegate.isTerminated();
    }

    public ScheduledFuture schedule(Runnable runnable2, long l2, TimeUnit timeUnit) {
        b b2 = new b(this, runnable2, l2, timeUnit);
        DelegatingScheduledFuture delegatingScheduledFuture = new DelegatingScheduledFuture(b2);
        return delegatingScheduledFuture;
    }

    public ScheduledFuture schedule(Callable callable, long l2, TimeUnit timeUnit) {
        j j3 = new j(this, callable, l2, timeUnit);
        DelegatingScheduledFuture delegatingScheduledFuture = new DelegatingScheduledFuture(j3);
        return delegatingScheduledFuture;
    }

    public ScheduledFuture scheduleAtFixedRate(Runnable runnable2, long l2, long l3, TimeUnit timeUnit) {
        g g3 = new g(this, runnable2, l2, l3, timeUnit);
        DelegatingScheduledFuture delegatingScheduledFuture = new DelegatingScheduledFuture(g3);
        return delegatingScheduledFuture;
    }

    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable2, long l2, long l3, TimeUnit timeUnit) {
        i i3 = new i(this, runnable2, l2, l3, timeUnit);
        DelegatingScheduledFuture delegatingScheduledFuture = new DelegatingScheduledFuture(i3);
        return delegatingScheduledFuture;
    }

    public void shutdown() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Shutting down is not allowed.");
        throw unsupportedOperationException;
    }

    public List shutdownNow() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Shutting down is not allowed.");
        throw unsupportedOperationException;
    }

    public Future submit(Runnable runnable2) {
        return this.delegate.submit(runnable2);
    }

    public Future submit(Runnable runnable2, Object object) {
        return this.delegate.submit(runnable2, object);
    }

    public Future submit(Callable callable) {
        return this.delegate.submit(callable);
    }
}

