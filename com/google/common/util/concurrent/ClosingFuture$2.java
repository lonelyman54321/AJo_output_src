/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.ClosingFuture;
import com.google.common.util.concurrent.ClosingFuture$CloseableList;
import com.google.common.util.concurrent.ClosingFuture$ClosingCallable;
import com.google.common.util.concurrent.ClosingFuture$DeferredCloser;
import java.util.concurrent.Callable;

class ClosingFuture$2
implements Callable {
    final /* synthetic */ ClosingFuture this$0;
    final /* synthetic */ ClosingFuture$ClosingCallable val$callable;

    public ClosingFuture$2(ClosingFuture closingFuture, ClosingFuture$ClosingCallable closingCallable) {
        this.this$0 = closingFuture;
        this.val$callable = closingCallable;
    }

    public Object call() {
        ClosingFuture$ClosingCallable closingFuture$ClosingCallable = this.val$callable;
        ClosingFuture.DeferredCloser deferredCloser = ClosingFuture$CloseableList.access$300(ClosingFuture.access$200(this.this$0));
        return closingFuture$ClosingCallable.call(deferredCloser);
    }

    public String toString() {
        return this.val$callable.toString();
    }
}

