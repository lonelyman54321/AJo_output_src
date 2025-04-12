/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.ClosingFuture;
import com.google.common.util.concurrent.ClosingFuture$Combiner$CombiningCallable;
import com.google.common.util.concurrent.ClosingFuture$Combiner2;
import com.google.common.util.concurrent.ClosingFuture$Combiner2$ClosingFunction2;
import com.google.common.util.concurrent.ClosingFuture$DeferredCloser;
import com.google.common.util.concurrent.ClosingFuture$Peeker;

class ClosingFuture$Combiner2$1
implements ClosingFuture$Combiner$CombiningCallable {
    final /* synthetic */ ClosingFuture$Combiner2 this$0;
    final /* synthetic */ ClosingFuture$Combiner2$ClosingFunction2 val$function;

    public ClosingFuture$Combiner2$1(ClosingFuture$Combiner2 closingFuture$Combiner2, ClosingFuture$Combiner2$ClosingFunction2 closingFuture$Combiner2$ClosingFunction2) {
        this.this$0 = closingFuture$Combiner2;
        this.val$function = closingFuture$Combiner2$ClosingFunction2;
    }

    public Object call(ClosingFuture$DeferredCloser closingFuture$DeferredCloser, ClosingFuture$Peeker object) {
        ClosingFuture$Combiner2$ClosingFunction2 closingFuture$Combiner2$ClosingFunction2 = this.val$function;
        Object object2 = ClosingFuture$Combiner2.access$1800(this.this$0);
        object2 = ((ClosingFuture$Peeker)object).getDone((ClosingFuture)object2);
        ClosingFuture closingFuture = ClosingFuture$Combiner2.access$1900(this.this$0);
        object = ((ClosingFuture$Peeker)object).getDone(closingFuture);
        return closingFuture$Combiner2$ClosingFunction2.apply(closingFuture$DeferredCloser, object2, object);
    }

    public String toString() {
        return this.val$function.toString();
    }
}

