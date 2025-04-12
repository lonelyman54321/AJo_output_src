/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.ExecutionSequencer$1;
import com.google.common.util.concurrent.ExecutionSequencer$2;
import com.google.common.util.concurrent.ExecutionSequencer$TaskNonReentrantExecutor;
import com.google.common.util.concurrent.ExecutionSequencer$ThreadConfinedTaskQueue;
import com.google.common.util.concurrent.FluentFuture$TrustedFuture;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.TrustedListenableFutureTask;
import com.google.common.util.concurrent.j;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class ExecutionSequencer {
    private ExecutionSequencer$ThreadConfinedTaskQueue latestTaskQueue;
    private final AtomicReference ref;

    private ExecutionSequencer() {
        ListenableFuture listenableFuture = Futures.immediateVoidFuture();
        Object object = new AtomicReference(listenableFuture);
        this.ref = object;
        this.latestTaskQueue = object = new ExecutionSequencer$ThreadConfinedTaskQueue(null);
    }

    public static /* synthetic */ void a(TrustedListenableFutureTask trustedListenableFutureTask, SettableFuture settableFuture, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ExecutionSequencer$TaskNonReentrantExecutor executionSequencer$TaskNonReentrantExecutor) {
        ExecutionSequencer.lambda$submitAsync$0(trustedListenableFutureTask, settableFuture, listenableFuture, listenableFuture2, executionSequencer$TaskNonReentrantExecutor);
    }

    public static /* synthetic */ ExecutionSequencer$ThreadConfinedTaskQueue access$300(ExecutionSequencer executionSequencer) {
        return executionSequencer.latestTaskQueue;
    }

    public static /* synthetic */ ExecutionSequencer$ThreadConfinedTaskQueue access$302(ExecutionSequencer executionSequencer, ExecutionSequencer$ThreadConfinedTaskQueue executionSequencer$ThreadConfinedTaskQueue) {
        executionSequencer.latestTaskQueue = executionSequencer$ThreadConfinedTaskQueue;
        return executionSequencer$ThreadConfinedTaskQueue;
    }

    public static ExecutionSequencer create() {
        ExecutionSequencer executionSequencer = new ExecutionSequencer();
        return executionSequencer;
    }

    private static /* synthetic */ void lambda$submitAsync$0(TrustedListenableFutureTask trustedListenableFutureTask, SettableFuture settableFuture, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ExecutionSequencer$TaskNonReentrantExecutor executionSequencer$TaskNonReentrantExecutor) {
        boolean bl2 = trustedListenableFutureTask.isDone();
        if (bl2) {
            settableFuture.setFuture(listenableFuture);
        } else {
            boolean bl3 = listenableFuture2.isCancelled();
            if (bl3 && (bl3 = ExecutionSequencer$TaskNonReentrantExecutor.access$400(executionSequencer$TaskNonReentrantExecutor))) {
                bl3 = false;
                settableFuture = null;
                trustedListenableFutureTask.cancel(false);
            }
        }
    }

    public ListenableFuture submit(Callable callable, Executor executor) {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(executor);
        ExecutionSequencer$1 executionSequencer$1 = new ExecutionSequencer$1(this, callable);
        return this.submitAsync(executionSequencer$1, executor);
    }

    public ListenableFuture submitAsync(AsyncCallable object, Executor object2) {
        j j3;
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(object2);
        ExecutionSequencer$TaskNonReentrantExecutor executionSequencer$TaskNonReentrantExecutor = new ExecutionSequencer$TaskNonReentrantExecutor((Executor)object2, this, null);
        object2 = new ExecutionSequencer$2(this, executionSequencer$TaskNonReentrantExecutor, (AsyncCallable)object);
        SettableFuture settableFuture = SettableFuture.create();
        Object object3 = object = this.ref.getAndSet(settableFuture);
        object3 = (ListenableFuture)object;
        object = TrustedListenableFutureTask.create((AsyncCallable)object2);
        object3.addListener((Runnable)object, executionSequencer$TaskNonReentrantExecutor);
        object2 = Futures.nonCancellationPropagating((ListenableFuture)object);
        Object object4 = j3;
        j3 = new j((TrustedListenableFutureTask)object, settableFuture, (ListenableFuture)object3, (ListenableFuture)object2, executionSequencer$TaskNonReentrantExecutor);
        object4 = MoreExecutors.directExecutor();
        object2.addListener(j3, (Executor)object4);
        object4 = MoreExecutors.directExecutor();
        ((FluentFuture$TrustedFuture)object).addListener(j3, (Executor)object4);
        return object2;
    }
}

