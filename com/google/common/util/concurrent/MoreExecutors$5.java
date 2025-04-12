/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

class MoreExecutors$5
implements Executor {
    final /* synthetic */ Executor val$delegate;
    final /* synthetic */ AbstractFuture val$future;

    public MoreExecutors$5(Executor executor, AbstractFuture abstractFuture) {
        this.val$delegate = executor;
        this.val$future = abstractFuture;
    }

    public void execute(Runnable runnable2) {
        Object object = this.val$delegate;
        try {
            object.execute(runnable2);
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            object = this.val$future;
            ((AbstractFuture)object).setException(rejectedExecutionException);
        }
    }
}

