/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import com.google.firebase.concurrent.SequentialExecutor;

class SequentialExecutor$1
implements Runnable {
    final /* synthetic */ SequentialExecutor this$0;
    final /* synthetic */ Runnable val$task;

    public SequentialExecutor$1(SequentialExecutor sequentialExecutor, Runnable runnable2) {
        this.this$0 = sequentialExecutor;
        this.val$task = runnable2;
    }

    public void run() {
        this.val$task.run();
    }

    public String toString() {
        return this.val$task.toString();
    }
}

