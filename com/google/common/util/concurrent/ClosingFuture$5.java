/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.ClosingFuture;
import com.google.common.util.concurrent.ClosingFuture$AsyncClosingFunction;
import com.google.common.util.concurrent.ClosingFuture$CloseableList;
import com.google.common.util.concurrent.ListenableFuture;

class ClosingFuture$5
implements AsyncFunction {
    final /* synthetic */ ClosingFuture this$0;
    final /* synthetic */ ClosingFuture$AsyncClosingFunction val$function;

    public ClosingFuture$5(ClosingFuture closingFuture, ClosingFuture$AsyncClosingFunction closingFuture$AsyncClosingFunction) {
        this.this$0 = closingFuture;
        this.val$function = closingFuture$AsyncClosingFunction;
    }

    public ListenableFuture apply(Object object) {
        ClosingFuture$CloseableList closingFuture$CloseableList = ClosingFuture.access$200(this.this$0);
        ClosingFuture$AsyncClosingFunction closingFuture$AsyncClosingFunction = this.val$function;
        return closingFuture$CloseableList.applyAsyncClosingFunction(closingFuture$AsyncClosingFunction, object);
    }

    public String toString() {
        return this.val$function.toString();
    }
}

