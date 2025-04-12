/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.ClosingFuture;
import com.google.common.util.concurrent.ClosingFuture$ValueAndCloserConsumer;

class ClosingFuture$10
implements Runnable {
    final /* synthetic */ ClosingFuture this$0;
    final /* synthetic */ ClosingFuture.ValueAndCloserConsumer val$consumer;

    public ClosingFuture$10(ClosingFuture closingFuture, ClosingFuture.ValueAndCloserConsumer valueAndCloserConsumer) {
        this.this$0 = closingFuture;
        this.val$consumer = valueAndCloserConsumer;
    }

    public void run() {
        ClosingFuture.ValueAndCloserConsumer valueAndCloserConsumer = this.val$consumer;
        ClosingFuture closingFuture = this.this$0;
        ClosingFuture.access$1200(valueAndCloserConsumer, closingFuture);
    }
}

