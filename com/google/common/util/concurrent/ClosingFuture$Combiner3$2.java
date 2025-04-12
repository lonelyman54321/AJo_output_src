/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.ClosingFuture;
import com.google.common.util.concurrent.ClosingFuture$Combiner$AsyncCombiningCallable;
import com.google.common.util.concurrent.ClosingFuture$Combiner3;
import com.google.common.util.concurrent.ClosingFuture$Combiner3$AsyncClosingFunction3;
import com.google.common.util.concurrent.ClosingFuture$DeferredCloser;
import com.google.common.util.concurrent.ClosingFuture$Peeker;

class ClosingFuture$Combiner3$2
implements ClosingFuture$Combiner$AsyncCombiningCallable {
    final /* synthetic */ ClosingFuture$Combiner3 this$0;
    final /* synthetic */ ClosingFuture$Combiner3$AsyncClosingFunction3 val$function;

    public ClosingFuture$Combiner3$2(ClosingFuture$Combiner3 closingFuture$Combiner3, ClosingFuture$Combiner3$AsyncClosingFunction3 closingFuture$Combiner3$AsyncClosingFunction3) {
        this.this$0 = closingFuture$Combiner3;
        this.val$function = closingFuture$Combiner3$AsyncClosingFunction3;
    }

    public ClosingFuture call(ClosingFuture$DeferredCloser closingFuture$DeferredCloser, ClosingFuture$Peeker object) {
        ClosingFuture$Combiner3$AsyncClosingFunction3 closingFuture$Combiner3$AsyncClosingFunction3 = this.val$function;
        Object object2 = ClosingFuture$Combiner3.access$2000(this.this$0);
        object2 = ((ClosingFuture$Peeker)object).getDone((ClosingFuture)object2);
        Object object3 = ClosingFuture$Combiner3.access$2100(this.this$0);
        object3 = ((ClosingFuture$Peeker)object).getDone((ClosingFuture)object3);
        ClosingFuture closingFuture = ClosingFuture$Combiner3.access$2200(this.this$0);
        object = ((ClosingFuture$Peeker)object).getDone(closingFuture);
        return closingFuture$Combiner3$AsyncClosingFunction3.apply(closingFuture$DeferredCloser, object2, object3, object);
    }

    public String toString() {
        return this.val$function.toString();
    }
}

