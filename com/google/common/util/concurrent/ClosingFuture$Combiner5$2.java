/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.ClosingFuture;
import com.google.common.util.concurrent.ClosingFuture$Combiner$AsyncCombiningCallable;
import com.google.common.util.concurrent.ClosingFuture$Combiner5;
import com.google.common.util.concurrent.ClosingFuture$Combiner5$AsyncClosingFunction5;
import com.google.common.util.concurrent.ClosingFuture$DeferredCloser;
import com.google.common.util.concurrent.ClosingFuture$Peeker;

class ClosingFuture$Combiner5$2
implements ClosingFuture$Combiner$AsyncCombiningCallable {
    final /* synthetic */ ClosingFuture$Combiner5 this$0;
    final /* synthetic */ ClosingFuture$Combiner5$AsyncClosingFunction5 val$function;

    public ClosingFuture$Combiner5$2(ClosingFuture$Combiner5 closingFuture$Combiner5, ClosingFuture$Combiner5$AsyncClosingFunction5 closingFuture$Combiner5$AsyncClosingFunction5) {
        this.this$0 = closingFuture$Combiner5;
        this.val$function = closingFuture$Combiner5$AsyncClosingFunction5;
    }

    public ClosingFuture call(ClosingFuture$DeferredCloser closingFuture$DeferredCloser, ClosingFuture$Peeker closingFuture$Peeker) {
        ClosingFuture$Combiner5$AsyncClosingFunction5 closingFuture$Combiner5$AsyncClosingFunction5 = this.val$function;
        Object object = ClosingFuture$Combiner5.access$2700(this.this$0);
        Object object2 = closingFuture$Peeker.getDone((ClosingFuture)object);
        object = ClosingFuture$Combiner5.access$2800(this.this$0);
        Object object3 = closingFuture$Peeker.getDone((ClosingFuture)object);
        object = ClosingFuture$Combiner5.access$2900(this.this$0);
        Object object4 = closingFuture$Peeker.getDone((ClosingFuture)object);
        object = ClosingFuture$Combiner5.access$3000(this.this$0);
        Object object5 = closingFuture$Peeker.getDone((ClosingFuture)object);
        object = ClosingFuture$Combiner5.access$3100(this.this$0);
        Object object6 = closingFuture$Peeker.getDone((ClosingFuture)object);
        object = closingFuture$DeferredCloser;
        return closingFuture$Combiner5$AsyncClosingFunction5.apply(closingFuture$DeferredCloser, object2, object3, object4, object5, object6);
    }

    public String toString() {
        return this.val$function.toString();
    }
}

