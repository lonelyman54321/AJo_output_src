/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.ClosingFuture;
import com.google.common.util.concurrent.ClosingFuture$DeferredCloser;

public interface ClosingFuture$AsyncClosingFunction {
    public ClosingFuture apply(ClosingFuture$DeferredCloser var1, Object var2);
}

