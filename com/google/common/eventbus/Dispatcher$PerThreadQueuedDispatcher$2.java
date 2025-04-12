/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.eventbus;

import com.google.common.eventbus.Dispatcher$PerThreadQueuedDispatcher;

class Dispatcher$PerThreadQueuedDispatcher$2
extends ThreadLocal {
    public Dispatcher$PerThreadQueuedDispatcher$2(Dispatcher$PerThreadQueuedDispatcher dispatcher$PerThreadQueuedDispatcher) {
    }

    public Boolean initialValue() {
        return Boolean.FALSE;
    }
}

