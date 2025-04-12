/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.ClosingFuture;
import com.google.common.util.concurrent.ClosingFuture$AsyncClosingCallable;
import com.google.common.util.concurrent.ClosingFuture$CloseableList;
import com.google.common.util.concurrent.ClosingFuture$DeferredCloser;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;

class ClosingFuture$3
implements AsyncCallable {
    final /* synthetic */ ClosingFuture this$0;
    final /* synthetic */ ClosingFuture$AsyncClosingCallable val$callable;

    public ClosingFuture$3(ClosingFuture closingFuture, ClosingFuture$AsyncClosingCallable closingFuture$AsyncClosingCallable) {
        this.this$0 = closingFuture;
        this.val$callable = closingFuture$AsyncClosingCallable;
    }

    public ListenableFuture call() {
        Object object;
        Object object2 = null;
        ClosingFuture$CloseableList closingFuture$CloseableList = new ClosingFuture$CloseableList(null);
        try {
            object2 = this.val$callable;
            object = ClosingFuture$CloseableList.access$300(closingFuture$CloseableList);
            object2 = object2.call((ClosingFuture$DeferredCloser)object);
            object = this.this$0;
            object = ClosingFuture.access$200((ClosingFuture)object);
            ClosingFuture.access$1000((ClosingFuture)object2, (ClosingFuture$CloseableList)object);
            object2 = ClosingFuture.access$000((ClosingFuture)object2);
            return object2;
        }
        finally {
            object = ClosingFuture.access$200(this.this$0);
            Executor executor = MoreExecutors.directExecutor();
            ((ClosingFuture$CloseableList)object).add(closingFuture$CloseableList, executor);
        }
    }

    public String toString() {
        return this.val$callable.toString();
    }
}

