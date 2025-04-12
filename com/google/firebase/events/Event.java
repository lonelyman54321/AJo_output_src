/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.events;

import com.google.firebase.components.Preconditions;

public class Event {
    private final Object payload;
    private final Class type;

    public Event(Class object, Object object2) {
        object = (Class)Preconditions.checkNotNull(object);
        this.type = object;
        this.payload = object = Preconditions.checkNotNull(object2);
    }

    public Object getPayload() {
        return this.payload;
    }

    public Class getType() {
        return this.type;
    }

    public String toString() {
        Class clazz = this.type;
        Object object = this.payload;
        Object[] objectArray = new Object[]{clazz, object};
        return String.format("Event{type: %s, payload: %s}", objectArray);
    }
}

