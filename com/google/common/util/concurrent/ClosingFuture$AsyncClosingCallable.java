/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.ClosingFuture;
import com.google.common.util.concurrent.ClosingFuture$DeferredCloser;

public interface ClosingFuture$AsyncClosingCallable {
    public ClosingFuture call(ClosingFuture$DeferredCloser var1);
}

