/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

final class ExecutionList$RunnableExecutorPair {
    final Executor executor;
    ExecutionList$RunnableExecutorPair next;
    final Runnable runnable;

    public ExecutionList$RunnableExecutorPair(Runnable runnable2, Executor executor, ExecutionList$RunnableExecutorPair executionList$RunnableExecutorPair) {
        this.runnable = runnable2;
        this.executor = executor;
        this.next = executionList$RunnableExecutorPair;
    }
}

