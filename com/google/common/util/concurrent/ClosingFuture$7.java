/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.ClosingFuture;
import com.google.common.util.concurrent.ClosingFuture$CloseableList;
import com.google.common.util.concurrent.ClosingFuture$ClosingFunction;
import com.google.common.util.concurrent.ListenableFuture;

class ClosingFuture$7
implements AsyncFunction {
    final /* synthetic */ ClosingFuture this$0;
    final /* synthetic */ ClosingFuture$ClosingFunction val$fallback;

    public ClosingFuture$7(ClosingFuture closingFuture, ClosingFuture$ClosingFunction closingFuture$ClosingFunction) {
        this.this$0 = closingFuture;
        this.val$fallback = closingFuture$ClosingFunction;
    }

    public ListenableFuture apply(Throwable throwable) {
        ClosingFuture$CloseableList closingFuture$CloseableList = ClosingFuture.access$200(this.this$0);
        ClosingFuture$ClosingFunction closingFuture$ClosingFunction = this.val$fallback;
        return closingFuture$CloseableList.applyClosingFunction(closingFuture$ClosingFunction, throwable);
    }

    public String toString() {
        return this.val$fallback.toString();
    }
}

