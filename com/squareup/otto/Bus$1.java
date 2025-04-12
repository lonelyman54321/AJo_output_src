/*
 * Decompiled with CFR 0.152.
 */
package com.squareup.otto;

import com.squareup.otto.Bus;
import java.util.concurrent.ConcurrentLinkedQueue;

class Bus$1
extends ThreadLocal {
    final /* synthetic */ Bus this$0;

    public Bus$1(Bus bus) {
        this.this$0 = bus;
    }

    public ConcurrentLinkedQueue initialValue() {
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        return concurrentLinkedQueue;
    }
}

