/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.CombinedFuture;
import com.google.common.util.concurrent.CombinedFuture$CombinedFutureInterruptibleTask;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

final class CombinedFuture$CallableInterruptibleTask
extends CombinedFuture$CombinedFutureInterruptibleTask {
    private final Callable callable;
    final /* synthetic */ CombinedFuture this$0;

    public CombinedFuture$CallableInterruptibleTask(CombinedFuture object, Callable callable, Executor executor) {
        this.this$0 = object;
        super((CombinedFuture)object, executor);
        this.callable = object = (Callable)Preconditions.checkNotNull(callable);
    }

    public Object runInterruptibly() {
        return this.callable.call();
    }

    public void setValue(Object object) {
        this.this$0.set(object);
    }

    public String toPendingString() {
        return this.callable.toString();
    }
}

