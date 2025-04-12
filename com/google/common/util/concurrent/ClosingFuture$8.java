/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.ClosingFuture;
import com.google.common.util.concurrent.ClosingFuture$AsyncClosingFunction;
import com.google.common.util.concurrent.ClosingFuture$CloseableList;
import com.google.common.util.concurrent.ListenableFuture;

class ClosingFuture$8
implements AsyncFunction {
    final /* synthetic */ ClosingFuture this$0;
    final /* synthetic */ ClosingFuture$AsyncClosingFunction val$fallback;

    public ClosingFuture$8(ClosingFuture closingFuture, ClosingFuture$AsyncClosingFunction closingFuture$AsyncClosingFunction) {
        this.this$0 = closingFuture;
        this.val$fallback = closingFuture$AsyncClosingFunction;
    }

    public ListenableFuture apply(Throwable throwable) {
        ClosingFuture$CloseableList closingFuture$CloseableList = ClosingFuture.access$200(this.this$0);
        ClosingFuture$AsyncClosingFunction closingFuture$AsyncClosingFunction = this.val$fallback;
        return closingFuture$CloseableList.applyAsyncClosingFunction(closingFuture$AsyncClosingFunction, throwable);
    }

    public String toString() {
        return this.val$fallback.toString();
    }
}

