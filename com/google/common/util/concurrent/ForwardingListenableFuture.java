/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.ForwardingFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

public abstract class ForwardingListenableFuture
extends ForwardingFuture
implements ListenableFuture {
    public void addListener(Runnable runnable2, Executor executor) {
        this.delegate().addListener(runnable2, executor);
    }

    public abstract ListenableFuture delegate();
}

