/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.ClosingFuture;
import com.google.common.util.concurrent.ClosingFuture$Combiner$CombiningCallable;
import com.google.common.util.concurrent.ClosingFuture$Combiner3;
import com.google.common.util.concurrent.ClosingFuture$Combiner3$ClosingFunction3;
import com.google.common.util.concurrent.ClosingFuture$DeferredCloser;
import com.google.common.util.concurrent.ClosingFuture$Peeker;

class ClosingFuture$Combiner3$1
implements ClosingFuture$Combiner$CombiningCallable {
    final /* synthetic */ ClosingFuture$Combiner3 this$0;
    final /* synthetic */ ClosingFuture$Combiner3$ClosingFunction3 val$function;

    public ClosingFuture$Combiner3$1(ClosingFuture$Combiner3 closingFuture$Combiner3, ClosingFuture$Combiner3$ClosingFunction3 closingFuture$Combiner3$ClosingFunction3) {
        this.this$0 = closingFuture$Combiner3;
        this.val$function = closingFuture$Combiner3$ClosingFunction3;
    }

    public Object call(ClosingFuture$DeferredCloser closingFuture$DeferredCloser, ClosingFuture$Peeker object) {
        ClosingFuture$Combiner3$ClosingFunction3 closingFuture$Combiner3$ClosingFunction3 = this.val$function;
        Object object2 = ClosingFuture$Combiner3.access$2000(this.this$0);
        object2 = ((ClosingFuture$Peeker)object).getDone((ClosingFuture)object2);
        Object object3 = ClosingFuture$Combiner3.access$2100(this.this$0);
        object3 = ((ClosingFuture$Peeker)object).getDone((ClosingFuture)object3);
        ClosingFuture closingFuture = ClosingFuture$Combiner3.access$2200(this.this$0);
        object = ((ClosingFuture$Peeker)object).getDone(closingFuture);
        return closingFuture$Combiner3$ClosingFunction3.apply(closingFuture$DeferredCloser, object2, object3, object);
    }

    public String toString() {
        return this.val$function.toString();
    }
}

