/*
 * Decompiled with CFR 0.152.
 */
package com.squareup.otto;

public class DeadEvent {
    public final Object event;
    public final Object source;

    public DeadEvent(Object object, Object object2) {
        this.source = object;
        this.event = object2;
    }
}

