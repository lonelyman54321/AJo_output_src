/*
 * Decompiled with CFR 0.152.
 */
package com.squareup.otto;

import com.squareup.otto.EventHandler;

class Bus$EventWithHandler {
    final Object event;
    final EventHandler handler;

    public Bus$EventWithHandler(Object object, EventHandler eventHandler) {
        this.event = object;
        this.handler = eventHandler;
    }
}

