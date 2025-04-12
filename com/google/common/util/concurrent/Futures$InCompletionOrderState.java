/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.Futures$1;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

final class Futures$InCompletionOrderState {
    private volatile int delegateIndex = 0;
    private final AtomicInteger incompleteOutputCount;
    private final ListenableFuture[] inputFutures;
    private boolean shouldInterrupt = true;
    private boolean wasCancelled = false;

    private Futures$InCompletionOrderState(ListenableFuture[] listenableFutureArray) {
        AtomicInteger atomicInteger;
        this.inputFutures = listenableFutureArray;
        int n3 = listenableFutureArray.length;
        this.incompleteOutputCount = atomicInteger = new AtomicInteger(n3);
    }

    public /* synthetic */ Futures$InCompletionOrderState(ListenableFuture[] listenableFutureArray, Futures$1 futures$1) {
        this(listenableFutureArray);
    }

    public static /* synthetic */ void access$300(Futures$InCompletionOrderState futures$InCompletionOrderState, boolean bl2) {
        futures$InCompletionOrderState.recordOutputCancellation(bl2);
    }

    public static /* synthetic */ ListenableFuture[] access$400(Futures$InCompletionOrderState futures$InCompletionOrderState) {
        return futures$InCompletionOrderState.inputFutures;
    }

    public static /* synthetic */ AtomicInteger access$500(Futures$InCompletionOrderState futures$InCompletionOrderState) {
        return futures$InCompletionOrderState.incompleteOutputCount;
    }

    public static /* synthetic */ void access$600(Futures$InCompletionOrderState futures$InCompletionOrderState, ImmutableList immutableList, int n3) {
        futures$InCompletionOrderState.recordInputCompletion(immutableList, n3);
    }

    private void recordCompletion() {
        ListenableFuture[] listenableFutureArray = this.incompleteOutputCount;
        int n3 = listenableFutureArray.decrementAndGet();
        if (n3 == 0 && (n3 = (int)(this.wasCancelled ? 1 : 0)) != 0) {
            for (ListenableFuture listenableFuture : this.inputFutures) {
                if (listenableFuture == null) continue;
                boolean bl2 = this.shouldInterrupt;
                listenableFuture.cancel(bl2);
            }
        }
    }

    private void recordInputCompletion(ImmutableList immutableList, int n3) {
        int n4;
        int n7;
        ListenableFuture listenableFuture = this.inputFutures[n3];
        Objects.requireNonNull(listenableFuture);
        Object object = this.inputFutures;
        object[n3] = null;
        for (n3 = this.delegateIndex; n3 < (n7 = immutableList.size()); ++n3) {
            object = (AbstractFuture)immutableList.get(n3);
            n7 = (int)(((AbstractFuture)object).setFuture(listenableFuture) ? 1 : 0);
            if (n7 == 0) continue;
            this.recordCompletion();
            this.delegateIndex = ++n3;
            return;
        }
        this.delegateIndex = n4 = immutableList.size();
    }

    private void recordOutputCancellation(boolean bl2) {
        boolean bl3;
        this.wasCancelled = bl3 = true;
        if (!bl2) {
            bl2 = false;
            this.shouldInterrupt = false;
        }
        this.recordCompletion();
    }
}

