/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.InterruptibleTask;
import com.google.common.util.concurrent.TrustedListenableFutureTask;
import java.util.concurrent.Callable;

final class TrustedListenableFutureTask$TrustedFutureInterruptibleTask
extends InterruptibleTask {
    private final Callable callable;
    final /* synthetic */ TrustedListenableFutureTask this$0;

    public TrustedListenableFutureTask$TrustedFutureInterruptibleTask(TrustedListenableFutureTask object, Callable callable) {
        this.this$0 = object;
        this.callable = object = (Callable)Preconditions.checkNotNull(callable);
    }

    public void afterRanInterruptiblyFailure(Throwable throwable) {
        this.this$0.setException(throwable);
    }

    public void afterRanInterruptiblySuccess(Object object) {
        this.this$0.set(object);
    }

    public final boolean isDone() {
        return this.this$0.isDone();
    }

    public Object runInterruptibly() {
        return this.callable.call();
    }

    public String toPendingString() {
        return this.callable.toString();
    }
}

