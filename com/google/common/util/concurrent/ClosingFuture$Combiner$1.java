/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ClosingFuture$CloseableList;
import com.google.common.util.concurrent.ClosingFuture$Combiner;
import com.google.common.util.concurrent.ClosingFuture$Combiner$CombiningCallable;
import com.google.common.util.concurrent.ClosingFuture$Peeker;
import java.util.concurrent.Callable;

class ClosingFuture$Combiner$1
implements Callable {
    final /* synthetic */ ClosingFuture$Combiner this$0;
    final /* synthetic */ ClosingFuture$Combiner$CombiningCallable val$combiningCallable;

    public ClosingFuture$Combiner$1(ClosingFuture$Combiner combiner, ClosingFuture$Combiner$CombiningCallable combiningCallable) {
        this.this$0 = combiner;
        this.val$combiningCallable = combiningCallable;
    }

    public Object call() {
        Object object = this.this$0.inputs;
        ClosingFuture$Peeker closingFuture$Peeker = new ClosingFuture$Peeker((ImmutableList)object, null);
        object = this.val$combiningCallable;
        ClosingFuture$CloseableList closingFuture$CloseableList = ClosingFuture$Combiner.access$1300(this.this$0);
        return ClosingFuture$Peeker.access$1500(closingFuture$Peeker, (ClosingFuture$Combiner$CombiningCallable)object, closingFuture$CloseableList);
    }

    public String toString() {
        return this.val$combiningCallable.toString();
    }
}

