/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.ClosingFuture$CloseableList;
import com.google.common.util.concurrent.ClosingFuture$Combiner;
import com.google.common.util.concurrent.ClosingFuture$Combiner$AsyncCombiningCallable;
import com.google.common.util.concurrent.ClosingFuture$Peeker;
import com.google.common.util.concurrent.ListenableFuture;

class ClosingFuture$Combiner$2
implements AsyncCallable {
    final /* synthetic */ ClosingFuture$Combiner this$0;
    final /* synthetic */ ClosingFuture$Combiner$AsyncCombiningCallable val$combiningCallable;

    public ClosingFuture$Combiner$2(ClosingFuture$Combiner closingFuture$Combiner, ClosingFuture$Combiner$AsyncCombiningCallable closingFuture$Combiner$AsyncCombiningCallable) {
        this.this$0 = closingFuture$Combiner;
        this.val$combiningCallable = closingFuture$Combiner$AsyncCombiningCallable;
    }

    public ListenableFuture call() {
        Object object = this.this$0.inputs;
        ClosingFuture$Peeker closingFuture$Peeker = new ClosingFuture$Peeker((ImmutableList)object, null);
        object = this.val$combiningCallable;
        ClosingFuture$CloseableList closingFuture$CloseableList = ClosingFuture$Combiner.access$1300(this.this$0);
        return ClosingFuture$Peeker.access$1700(closingFuture$Peeker, (ClosingFuture$Combiner$AsyncCombiningCallable)object, closingFuture$CloseableList);
    }

    public String toString() {
        return this.val$combiningCallable.toString();
    }
}

