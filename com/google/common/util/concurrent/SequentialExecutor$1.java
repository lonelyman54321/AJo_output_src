/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.SequentialExecutor;

class SequentialExecutor$1
implements Runnable {
    final /* synthetic */ Runnable val$task;

    public SequentialExecutor$1(SequentialExecutor sequentialExecutor, Runnable runnable2) {
        this.val$task = runnable2;
    }

    public void run() {
        this.val$task.run();
    }

    public String toString() {
        return this.val$task.toString();
    }
}

