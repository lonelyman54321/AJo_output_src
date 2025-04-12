/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.ClosingFuture;
import com.google.common.util.concurrent.ClosingFuture$Combiner$CombiningCallable;
import com.google.common.util.concurrent.ClosingFuture$Combiner4;
import com.google.common.util.concurrent.ClosingFuture$Combiner4$ClosingFunction4;
import com.google.common.util.concurrent.ClosingFuture$DeferredCloser;
import com.google.common.util.concurrent.ClosingFuture$Peeker;

class ClosingFuture$Combiner4$1
implements ClosingFuture$Combiner$CombiningCallable {
    final /* synthetic */ ClosingFuture$Combiner4 this$0;
    final /* synthetic */ ClosingFuture$Combiner4$ClosingFunction4 val$function;

    public ClosingFuture$Combiner4$1(ClosingFuture$Combiner4 closingFuture$Combiner4, ClosingFuture$Combiner4$ClosingFunction4 closingFuture$Combiner4$ClosingFunction4) {
        this.this$0 = closingFuture$Combiner4;
        this.val$function = closingFuture$Combiner4$ClosingFunction4;
    }

    public Object call(ClosingFuture$DeferredCloser closingFuture$DeferredCloser, ClosingFuture$Peeker closingFuture$Peeker) {
        ClosingFuture$Combiner4$ClosingFunction4 closingFuture$Combiner4$ClosingFunction4 = this.val$function;
        Object object = ClosingFuture$Combiner4.access$2300(this.this$0);
        Object object2 = closingFuture$Peeker.getDone((ClosingFuture)object);
        object = ClosingFuture$Combiner4.access$2400(this.this$0);
        Object object3 = closingFuture$Peeker.getDone((ClosingFuture)object);
        object = ClosingFuture$Combiner4.access$2500(this.this$0);
        Object object4 = closingFuture$Peeker.getDone((ClosingFuture)object);
        object = ClosingFuture$Combiner4.access$2600(this.this$0);
        Object object5 = closingFuture$Peeker.getDone((ClosingFuture)object);
        object = closingFuture$DeferredCloser;
        return closingFuture$Combiner4$ClosingFunction4.apply(closingFuture$DeferredCloser, object2, object3, object4, object5);
    }

    public String toString() {
        return this.val$function.toString();
    }
}

