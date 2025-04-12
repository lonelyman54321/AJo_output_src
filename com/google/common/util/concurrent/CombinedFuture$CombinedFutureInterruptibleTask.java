/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.AbstractFuture$TrustedFuture;
import com.google.common.util.concurrent.CombinedFuture;
import com.google.common.util.concurrent.InterruptibleTask;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

abstract class CombinedFuture$CombinedFutureInterruptibleTask
extends InterruptibleTask {
    private final Executor listenerExecutor;
    final /* synthetic */ CombinedFuture this$0;

    public CombinedFuture$CombinedFutureInterruptibleTask(CombinedFuture object, Executor executor) {
        this.this$0 = object;
        this.listenerExecutor = object = (Executor)Preconditions.checkNotNull(executor);
    }

    public final void afterRanInterruptiblyFailure(Throwable object) {
        CombinedFuture combinedFuture = this.this$0;
        CombinedFuture.access$002(combinedFuture, null);
        boolean bl2 = object instanceof ExecutionException;
        if (bl2) {
            combinedFuture = this.this$0;
            object = ((ExecutionException)object).getCause();
            combinedFuture.setException((Throwable)object);
        } else {
            bl2 = object instanceof CancellationException;
            if (bl2) {
                object = this.this$0;
                bl2 = false;
                combinedFuture = null;
                ((AbstractFuture$TrustedFuture)object).cancel(false);
            } else {
                combinedFuture = this.this$0;
                combinedFuture.setException((Throwable)object);
            }
        }
    }

    public final void afterRanInterruptiblySuccess(Object object) {
        CombinedFuture.access$002(this.this$0, null);
        this.setValue(object);
    }

    public final void execute() {
        Executor executor = this.listenerExecutor;
        try {
            executor.execute(this);
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            CombinedFuture combinedFuture = this.this$0;
            combinedFuture.setException(rejectedExecutionException);
        }
    }

    public final boolean isDone() {
        return this.this$0.isDone();
    }

    public abstract void setValue(Object var1);
}

