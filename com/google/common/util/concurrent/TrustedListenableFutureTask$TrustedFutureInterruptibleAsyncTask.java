/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.InterruptibleTask;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.TrustedListenableFutureTask;

final class TrustedListenableFutureTask$TrustedFutureInterruptibleAsyncTask
extends InterruptibleTask {
    private final AsyncCallable callable;
    final /* synthetic */ TrustedListenableFutureTask this$0;

    public TrustedListenableFutureTask$TrustedFutureInterruptibleAsyncTask(TrustedListenableFutureTask object, AsyncCallable asyncCallable) {
        this.this$0 = object;
        this.callable = object = (AsyncCallable)Preconditions.checkNotNull(asyncCallable);
    }

    public void afterRanInterruptiblyFailure(Throwable throwable) {
        this.this$0.setException(throwable);
    }

    public void afterRanInterruptiblySuccess(ListenableFuture listenableFuture) {
        this.this$0.setFuture(listenableFuture);
    }

    public final boolean isDone() {
        return this.this$0.isDone();
    }

    public ListenableFuture runInterruptibly() {
        ListenableFuture listenableFuture = this.callable.call();
        AsyncCallable asyncCallable = this.callable;
        return (ListenableFuture)Preconditions.checkNotNull((Object)listenableFuture, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", (Object)asyncCallable);
    }

    public String toPendingString() {
        return this.callable.toString();
    }
}

