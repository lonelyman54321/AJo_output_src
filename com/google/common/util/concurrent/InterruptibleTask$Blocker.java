/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.InterruptibleTask;
import com.google.common.util.concurrent.InterruptibleTask$1;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;

final class InterruptibleTask$Blocker
extends AbstractOwnableSynchronizer
implements Runnable {
    private final InterruptibleTask task;

    private InterruptibleTask$Blocker(InterruptibleTask interruptibleTask) {
        this.task = interruptibleTask;
    }

    public /* synthetic */ InterruptibleTask$Blocker(InterruptibleTask interruptibleTask, InterruptibleTask$1 interruptibleTask$1) {
        this(interruptibleTask);
    }

    public static /* synthetic */ void access$200(InterruptibleTask$Blocker interruptibleTask$Blocker, Thread thread2) {
        interruptibleTask$Blocker.setOwner(thread2);
    }

    private void setOwner(Thread thread2) {
        this.setExclusiveOwnerThread(thread2);
    }

    public Thread getOwner() {
        return this.getExclusiveOwnerThread();
    }

    public void run() {
    }

    public String toString() {
        return this.task.toString();
    }
}

