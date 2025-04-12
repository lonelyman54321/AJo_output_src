/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;
import com.google.common.util.concurrent.Platform;
import com.google.common.util.concurrent.t;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

abstract class WrappingExecutorService
implements ExecutorService {
    private final ExecutorService delegate;

    public WrappingExecutorService(ExecutorService executorService) {
        this.delegate = executorService = (ExecutorService)Preconditions.checkNotNull(executorService);
    }

    public static /* synthetic */ void a(Callable callable) {
        WrappingExecutorService.lambda$wrapTask$0(callable);
    }

    private static /* synthetic */ void lambda$wrapTask$0(Callable callable) {
        try {
            callable.call();
            return;
        }
        catch (Exception exception) {
            Platform.restoreInterruptIfIsInterruptedException(exception);
            Throwables.throwIfUnchecked(exception);
            RuntimeException runtimeException = new RuntimeException(exception);
            throw runtimeException;
        }
    }

    private ImmutableList wrapTasks(Collection object) {
        boolean bl2;
        ImmutableList$Builder immutableList$Builder = ImmutableList.builder();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Callable callable = (Callable)object.next();
            callable = this.wrapTask(callable);
            immutableList$Builder.add(callable);
        }
        return immutableList$Builder.build();
    }

    public final boolean awaitTermination(long l2, TimeUnit timeUnit) {
        return this.delegate.awaitTermination(l2, timeUnit);
    }

    public final void execute(Runnable runnable2) {
        ExecutorService executorService = this.delegate;
        runnable2 = this.wrapTask(runnable2);
        executorService.execute(runnable2);
    }

    public final List invokeAll(Collection collection) {
        ExecutorService executorService = this.delegate;
        collection = this.wrapTasks(collection);
        return executorService.invokeAll(collection);
    }

    public final List invokeAll(Collection collection, long l2, TimeUnit timeUnit) {
        ExecutorService executorService = this.delegate;
        collection = this.wrapTasks(collection);
        return executorService.invokeAll(collection, l2, timeUnit);
    }

    public final Object invokeAny(Collection collection) {
        ExecutorService executorService = this.delegate;
        collection = this.wrapTasks(collection);
        return executorService.invokeAny(collection);
    }

    public final Object invokeAny(Collection collection, long l2, TimeUnit timeUnit) {
        ExecutorService executorService = this.delegate;
        collection = this.wrapTasks(collection);
        return executorService.invokeAny(collection, l2, timeUnit);
    }

    public final boolean isShutdown() {
        return this.delegate.isShutdown();
    }

    public final boolean isTerminated() {
        return this.delegate.isTerminated();
    }

    public final void shutdown() {
        this.delegate.shutdown();
    }

    public final List shutdownNow() {
        return this.delegate.shutdownNow();
    }

    public final Future submit(Runnable runnable2) {
        ExecutorService executorService = this.delegate;
        runnable2 = this.wrapTask(runnable2);
        return executorService.submit(runnable2);
    }

    public final Future submit(Runnable runnable2, Object object) {
        ExecutorService executorService = this.delegate;
        runnable2 = this.wrapTask(runnable2);
        return executorService.submit(runnable2, object);
    }

    public final Future submit(Callable callable) {
        ExecutorService executorService = this.delegate;
        callable = (Callable)Preconditions.checkNotNull(callable);
        callable = this.wrapTask(callable);
        return executorService.submit(callable);
    }

    public Runnable wrapTask(Runnable object) {
        object = Executors.callable((Runnable)object, null);
        object = this.wrapTask((Callable)object);
        t t3 = new t((Callable)object);
        return t3;
    }

    public abstract Callable wrapTask(Callable var1);
}

