/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.ClosingFuture;
import com.google.common.util.concurrent.Futures;

public final class ClosingFuture$ValueAndCloser {
    private final ClosingFuture closingFuture;

    public ClosingFuture$ValueAndCloser(ClosingFuture closingFuture) {
        this.closingFuture = closingFuture = (ClosingFuture)Preconditions.checkNotNull(closingFuture);
    }

    public void closeAsync() {
        ClosingFuture.access$100(this.closingFuture);
    }

    public Object get() {
        return Futures.getDone(ClosingFuture.access$000(this.closingFuture));
    }
}

