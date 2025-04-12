/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.ClosingFuture;
import com.google.common.util.concurrent.ClosingFuture$AsyncClosingFunction;
import com.google.common.util.concurrent.ClosingFuture$DeferredCloser;

class ClosingFuture$6
implements ClosingFuture$AsyncClosingFunction {
    final /* synthetic */ AsyncFunction val$function;

    public ClosingFuture$6(AsyncFunction asyncFunction) {
        this.val$function = asyncFunction;
    }

    public ClosingFuture apply(ClosingFuture$DeferredCloser closingFuture$DeferredCloser, Object object) {
        return ClosingFuture.from(this.val$function.apply(object));
    }
}

