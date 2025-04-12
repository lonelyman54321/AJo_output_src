/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import com.google.firebase.concurrent.PausableExecutor;
import com.google.firebase.concurrent.PausableExecutorImpl;
import com.google.firebase.concurrent.PausableExecutorService;
import com.google.firebase.concurrent.q;
import com.google.firebase.concurrent.r;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

final class PausableExecutorServiceImpl
implements PausableExecutorService {
    private final ExecutorService delegateService;
    private final PausableExecutor pausableDelegate;

    public PausableExecutorServiceImpl(boolean bl2, ExecutorService executorService) {
        this.delegateService = executorService;
        PausableExecutorImpl pausableExecutorImpl = new PausableExecutorImpl(bl2, executorService);
        this.pausableDelegate = pausableExecutorImpl;
    }

    public static /* synthetic */ Object a(Runnable runnable2) {
        return PausableExecutorServiceImpl.lambda$submit$1(runnable2);
    }

    public static /* synthetic */ Object b(Runnable runnable2, Object object) {
        return PausableExecutorServiceImpl.lambda$submit$0(runnable2, object);
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
        return this.delegateService.awaitTermination(l2, timeUnit);
    }

    public void execute(Runnable runnable2) {
        this.pausableDelegate.execute(runnable2);
    }

    public List invokeAll(Collection collection) {
        return this.delegateService.invokeAll(collection);
    }

    public List invokeAll(Collection collection, long l2, TimeUnit timeUnit) {
        return this.delegateService.invokeAll(collection, l2, timeUnit);
    }

    public Object invokeAny(Collection collection) {
        return this.delegateService.invokeAny(collection);
    }

    public Object invokeAny(Collection collection, long l2, TimeUnit timeUnit) {
        return this.delegateService.invokeAny(collection, l2, timeUnit);
    }

    public boolean isPaused() {
        return this.pausableDelegate.isPaused();
    }

    public boolean isShutdown() {
        return this.delegateService.isShutdown();
    }

    public boolean isTerminated() {
        return this.delegateService.isTerminated();
    }

    public void pause() {
        this.pausableDelegate.pause();
    }

    public void resume() {
        this.pausableDelegate.resume();
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
        q q2 = new q(runnable2);
        return this.submit((Callable)q2);
    }

    public Future submit(Runnable runnable2, Object object) {
        r r5 = new r(runnable2, object);
        return this.submit((Callable)r5);
    }

    public Future submit(Callable callable) {
        FutureTask futureTask = new FutureTask(callable);
        this.execute(futureTask);
        return futureTask;
    }
}

