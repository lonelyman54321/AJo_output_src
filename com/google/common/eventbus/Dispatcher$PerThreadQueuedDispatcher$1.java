/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.eventbus;

import com.google.common.collect.Queues;
import com.google.common.eventbus.Dispatcher$PerThreadQueuedDispatcher;
import java.util.Queue;

class Dispatcher$PerThreadQueuedDispatcher$1
extends ThreadLocal {
    public Dispatcher$PerThreadQueuedDispatcher$1(Dispatcher.PerThreadQueuedDispatcher perThreadQueuedDispatcher) {
    }

    public Queue initialValue() {
        return Queues.newArrayDeque();
    }
}

