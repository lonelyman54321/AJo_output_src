/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.ExecutionSequencer;
import com.google.common.util.concurrent.ExecutionSequencer$TaskNonReentrantExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.TrustedListenableFutureTask;

public final class j
implements Runnable {
    public final /* synthetic */ TrustedListenableFutureTask a;
    public final /* synthetic */ SettableFuture b;
    public final /* synthetic */ ListenableFuture c;
    public final /* synthetic */ ListenableFuture d;
    public final /* synthetic */ ExecutionSequencer$TaskNonReentrantExecutor e;

    public /* synthetic */ j(TrustedListenableFutureTask trustedListenableFutureTask, SettableFuture settableFuture, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ExecutionSequencer$TaskNonReentrantExecutor executionSequencer$TaskNonReentrantExecutor) {
        this.a = trustedListenableFutureTask;
        this.b = settableFuture;
        this.c = listenableFuture;
        this.d = listenableFuture2;
        this.e = executionSequencer$TaskNonReentrantExecutor;
    }

    public final void run() {
        ListenableFuture listenableFuture = this.d;
        ExecutionSequencer$TaskNonReentrantExecutor executionSequencer$TaskNonReentrantExecutor = this.e;
        TrustedListenableFutureTask trustedListenableFutureTask = this.a;
        SettableFuture settableFuture = this.b;
        ListenableFuture listenableFuture2 = this.c;
        ExecutionSequencer.a(trustedListenableFutureTask, settableFuture, listenableFuture2, listenableFuture, executionSequencer$TaskNonReentrantExecutor);
    }
}

