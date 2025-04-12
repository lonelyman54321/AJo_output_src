/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.ExecutionSequencer;
import com.google.common.util.concurrent.ExecutionSequencer$TaskNonReentrantExecutor;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;

class ExecutionSequencer$2
implements AsyncCallable {
    final /* synthetic */ AsyncCallable val$callable;
    final /* synthetic */ ExecutionSequencer$TaskNonReentrantExecutor val$taskExecutor;

    public ExecutionSequencer$2(ExecutionSequencer executionSequencer, ExecutionSequencer$TaskNonReentrantExecutor executionSequencer$TaskNonReentrantExecutor, AsyncCallable asyncCallable) {
        this.val$taskExecutor = executionSequencer$TaskNonReentrantExecutor;
        this.val$callable = asyncCallable;
    }

    public ListenableFuture call() {
        ExecutionSequencer$TaskNonReentrantExecutor executionSequencer$TaskNonReentrantExecutor = this.val$taskExecutor;
        boolean bl2 = ExecutionSequencer$TaskNonReentrantExecutor.access$200(executionSequencer$TaskNonReentrantExecutor);
        if (!bl2) {
            return Futures.immediateCancelledFuture();
        }
        return this.val$callable.call();
    }

    public String toString() {
        return this.val$callable.toString();
    }
}

