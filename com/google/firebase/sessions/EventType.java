/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.encoders.json.NumberedEnum;

public final class EventType
extends Enum
implements NumberedEnum {
    private static final /* synthetic */ EventType[] $VALUES;
    public static final /* enum */ EventType EVENT_TYPE_UNKNOWN;
    public static final /* enum */ EventType SESSION_START;
    private final int number;

    private static final /* synthetic */ EventType[] $values() {
        EventType eventType = EVENT_TYPE_UNKNOWN;
        eventType = SESSION_START;
        EventType[] eventTypeArray = new EventType[]{eventType, eventType};
        return eventTypeArray;
    }

    static {
        EventType eventType;
        EVENT_TYPE_UNKNOWN = eventType = new EventType("EVENT_TYPE_UNKNOWN", 0, 0);
        int n3 = 1;
        SESSION_START = eventType = new EventType("SESSION_START", n3, n3);
        $VALUES = EventType.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private EventType() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.number = var3_2;
    }

    public static EventType valueOf(String string2) {
        return Enum.valueOf(EventType.class, string2);
    }

    public static EventType[] values() {
        return (EventType[])$VALUES.clone();
    }

    public int getNumber() {
        return this.number;
    }
}

