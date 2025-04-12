/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.ClosingFuture$CloseableList;
import java.io.Closeable;
import java.util.concurrent.Executor;

public final class ClosingFuture$DeferredCloser {
    private final ClosingFuture$CloseableList list;

    public ClosingFuture$DeferredCloser(ClosingFuture$CloseableList closingFuture$CloseableList) {
        this.list = closingFuture$CloseableList;
    }

    public Object eventuallyClose(Object object, Executor executor) {
        Preconditions.checkNotNull(executor);
        if (object != null) {
            ClosingFuture$CloseableList closingFuture$CloseableList = this.list;
            Object object2 = object;
            object2 = (Closeable)object;
            closingFuture$CloseableList.add((Closeable)object2, executor);
        }
        return object;
    }
}

