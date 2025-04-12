/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.BlockingQueue;

class MoreExecutors$1
implements Runnable {
    final /* synthetic */ ListenableFuture val$future;
    final /* synthetic */ BlockingQueue val$queue;

    public MoreExecutors$1(BlockingQueue blockingQueue, ListenableFuture listenableFuture) {
        this.val$queue = blockingQueue;
        this.val$future = listenableFuture;
    }

    public void run() {
        BlockingQueue blockingQueue = this.val$queue;
        ListenableFuture listenableFuture = this.val$future;
        blockingQueue.add(listenableFuture);
    }
}

