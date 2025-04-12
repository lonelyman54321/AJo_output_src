/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.internal;

import com.affise.attribution.internal.InternalEventName$Companion;

public final class InternalEventName
extends Enum {
    private static final /* synthetic */ InternalEventName[] $VALUES;
    public static final InternalEventName$Companion Companion;
    public static final /* enum */ InternalEventName SESSION_START;
    private final String eventName;

    private static final /* synthetic */ InternalEventName[] $values() {
        InternalEventName internalEventName = SESSION_START;
        InternalEventName[] internalEventNameArray = new InternalEventName[]{internalEventName};
        return internalEventNameArray;
    }

    static {
        Object object;
        SESSION_START = object = new InternalEventName("SESSION_START", 0, "SessionStart");
        $VALUES = InternalEventName.$values();
        object = new InternalEventName$Companion(null);
        Companion = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private InternalEventName() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.eventName = var3_2;
    }

    public static final InternalEventName from(String string2) {
        return Companion.from(string2);
    }

    public static InternalEventName valueOf(String string2) {
        return Enum.valueOf(InternalEventName.class, string2);
    }

    public static InternalEventName[] values() {
        return (InternalEventName[])$VALUES.clone();
    }

    public final String getEventName() {
        return this.eventName;
    }
}

