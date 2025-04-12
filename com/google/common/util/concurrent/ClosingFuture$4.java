/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.ClosingFuture;
import com.google.common.util.concurrent.ClosingFuture$CloseableList;
import com.google.common.util.concurrent.ClosingFuture$ClosingFunction;
import com.google.common.util.concurrent.ListenableFuture;

class ClosingFuture$4
implements AsyncFunction {
    final /* synthetic */ ClosingFuture this$0;
    final /* synthetic */ ClosingFuture$ClosingFunction val$function;

    public ClosingFuture$4(ClosingFuture closingFuture, ClosingFuture$ClosingFunction closingFuture$ClosingFunction) {
        this.this$0 = closingFuture;
        this.val$function = closingFuture$ClosingFunction;
    }

    public ListenableFuture apply(Object object) {
        ClosingFuture$CloseableList closingFuture$CloseableList = ClosingFuture.access$200(this.this$0);
        ClosingFuture$ClosingFunction closingFuture$ClosingFunction = this.val$function;
        return closingFuture$CloseableList.applyClosingFunction(closingFuture$ClosingFunction, object);
    }

    public String toString() {
        return this.val$function.toString();
    }
}

