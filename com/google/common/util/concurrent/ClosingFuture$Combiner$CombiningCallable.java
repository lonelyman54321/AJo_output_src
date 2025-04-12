/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.ClosingFuture$DeferredCloser;
import com.google.common.util.concurrent.ClosingFuture$Peeker;

public interface ClosingFuture$Combiner$CombiningCallable {
    public Object call(ClosingFuture$DeferredCloser var1, ClosingFuture$Peeker var2);
}

