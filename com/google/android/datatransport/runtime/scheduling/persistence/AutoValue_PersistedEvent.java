/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent;

final class AutoValue_PersistedEvent
extends PersistedEvent {
    private final EventInternal event;
    private final long id;
    private final TransportContext transportContext;

    public AutoValue_PersistedEvent(long l2, TransportContext transportContext, EventInternal eventInternal) {
        this.id = l2;
        if (transportContext != null) {
            this.transportContext = transportContext;
            if (eventInternal != null) {
                this.event = eventInternal;
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("Null event");
            throw nullPointerException;
        }
        NullPointerException nullPointerException = new NullPointerException("Null transportContext");
        throw nullPointerException;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        Object object2 = object instanceof PersistedEvent;
        if (object2) {
            boolean bl3;
            TransportContext transportContext;
            Object object3;
            long l2 = this.id;
            long l3 = ((PersistedEvent)(object = (PersistedEvent)object)).getId();
            long l4 = l2 - l3;
            object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 || !(object2 = (object3 = this.transportContext).equals(transportContext = ((PersistedEvent)object).getTransportContext())) || !(bl3 = (object3 = this.event).equals(object = ((PersistedEvent)object).getEvent()))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public EventInternal getEvent() {
        return this.event;
    }

    public long getId() {
        return this.id;
    }

    public TransportContext getTransportContext() {
        return this.transportContext;
    }

    public int hashCode() {
        long l2 = this.id;
        long l3 = l2 >>> 32;
        int n3 = (int)(l2 ^ l3);
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        int n7 = this.transportContext.hashCode();
        n3 = (n3 ^ n7) * n4;
        return this.event.hashCode() ^ n3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("PersistedEvent{id=");
        long l2 = this.id;
        stringBuilder.append(l2);
        stringBuilder.append(", transportContext=");
        Object object = this.transportContext;
        stringBuilder.append(object);
        stringBuilder.append(", event=");
        object = this.event;
        stringBuilder.append(object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

