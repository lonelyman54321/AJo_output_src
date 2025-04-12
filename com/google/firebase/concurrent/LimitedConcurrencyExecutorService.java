/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import com.google.firebase.concurrent.LimitedConcurrencyExecutor;
import com.google.firebase.concurrent.o;
import com.google.firebase.concurrent.p;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

final class LimitedConcurrencyExecutorService
extends LimitedConcurrencyExecutor
implements ExecutorService {
    private final ExecutorService delegate;

    public LimitedConcurrencyExecutorService(ExecutorService executorService, int n3) {
        super(executorService, n3);
        this.delegate = executorService;
    }

    public static /* synthetic */ Object b(Runnable runnable2, Object object) {
        return LimitedConcurrencyExecutorService.lambda$submit$0(runnable2, object);
    }

    public static /* synthetic */ Object c(Runnable runnable2) {
        return LimitedConcurrencyExecutorService.lambda$submit$1(runnable2);
    }

    private static /* synthetic */ Object lambda$submit$0(Runnable runnable2, Object object) {
        runnable2.run();
        return object;
    }

    private static /* synthetic */ Object lambda$submit$1(Runnable runnable2) {
        runnable2.run();
        return null;
    }

    public boolean awaitTermination(long l2, TimeUnit timeUnit) {
        return this.delegate.awaitTermination(l2, timeUnit);
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

    public void shutdown() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Shutting down is not allowed.");
        throw unsupportedOperationException;
    }

    public List shutdownNow() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Shutting down is not allowed.");
        throw unsupportedOperationException;
    }

    public Future submit(Runnable runnable2) {
        o o3 = new o(runnable2);
        return this.submit((Callable)o3);
    }

    public Future submit(Runnable runnable2, Object object) {
        p p2 = new p(runnable2, object);
        return this.submit((Callable)p2);
    }

    public Future submit(Callable callable) {
        FutureTask futureTask = new FutureTask(callable);
        this.execute(futureTask);
        return futureTask;
    }
}

