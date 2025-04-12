/*
 * Decompiled with CFR 0.152.
 */
package com.jio.retargeting.util;

public final class Event
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ Event[] $VALUES;
    public static final /* enum */ Event ADD_TO_CART;
    public static final /* enum */ Event PURCHASE_COMPLETED;
    public static final /* enum */ Event REMOVE_FROM_CART;

    static {
        Event event;
        Event event2;
        Event event3;
        ADD_TO_CART = event3 = new Event("ADD_TO_CART", 0);
        int n3 = 1;
        REMOVE_FROM_CART = event2 = new Event("REMOVE_FROM_CART", n3);
        int n4 = 2;
        PURCHASE_COMPLETED = event = new Event("PURCHASE_COMPLETED", n4);
        Enum[] enumArray = new Event[3];
        enumArray[0] = event3;
        enumArray[n3] = event2;
        enumArray[n4] = event;
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public Event() {
        void var2_-1;
        void var1_-1;
    }

    public static Event valueOf(String string2) {
        return Enum.valueOf(Event.class, string2);
    }

    public static Event[] values() {
        return (Event[])$VALUES.clone();
    }
}

