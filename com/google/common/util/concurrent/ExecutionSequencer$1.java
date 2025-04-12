/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.ExecutionSequencer;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

class ExecutionSequencer$1
implements AsyncCallable {
    final /* synthetic */ Callable val$callable;

    public ExecutionSequencer$1(ExecutionSequencer executionSequencer, Callable callable) {
        this.val$callable = callable;
    }

    public ListenableFuture call() {
        return Futures.immediateFuture(this.val$callable.call());
    }

    public String toString() {
        return this.val$callable.toString();
    }
}

