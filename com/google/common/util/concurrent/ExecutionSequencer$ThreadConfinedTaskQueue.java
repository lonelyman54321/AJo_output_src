/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.ExecutionSequencer$1;
import java.util.concurrent.Executor;

final class ExecutionSequencer$ThreadConfinedTaskQueue {
    Executor nextExecutor;
    Runnable nextTask;
    Thread thread;

    private ExecutionSequencer$ThreadConfinedTaskQueue() {
    }

    public /* synthetic */ ExecutionSequencer$ThreadConfinedTaskQueue(ExecutionSequencer$1 executionSequencer$1) {
        this();
    }
}

