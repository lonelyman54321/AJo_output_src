/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.ClosingFuture;
import com.google.common.util.concurrent.ClosingFuture$CloseableList;
import com.google.common.util.concurrent.ClosingFuture$DeferredCloser;
import com.google.common.util.concurrent.FutureCallback;
import java.io.Closeable;
import java.util.concurrent.Executor;

class ClosingFuture$1
implements FutureCallback {
    final /* synthetic */ Executor val$closingExecutor;
    final /* synthetic */ ClosingFuture val$closingFuture;

    public ClosingFuture$1(ClosingFuture closingFuture, Executor executor) {
        this.val$closingFuture = closingFuture;
        this.val$closingExecutor = executor;
    }

    public void onFailure(Throwable throwable) {
    }

    public void onSuccess(Closeable closeable) {
        ClosingFuture$DeferredCloser closingFuture$DeferredCloser = ClosingFuture$CloseableList.access$300(ClosingFuture.access$200(this.val$closingFuture));
        Executor executor = this.val$closingExecutor;
        closingFuture$DeferredCloser.eventuallyClose(closeable, executor);
    }
}

