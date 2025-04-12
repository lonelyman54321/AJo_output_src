/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.utils;

public final class Constants$PRIORITY_EVENTS
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ Constants$PRIORITY_EVENTS[] $VALUES;
    public static final /* enum */ Constants$PRIORITY_EVENTS ADD_TO_CART;
    public static final /* enum */ Constants$PRIORITY_EVENTS ADD_TO_WISHLIST;
    public static final /* enum */ Constants$PRIORITY_EVENTS APP_LAUNCH;
    public static final /* enum */ Constants$PRIORITY_EVENTS PRODUCT_CANCELLED;
    public static final /* enum */ Constants$PRIORITY_EVENTS PRODUCT_RETURNED;
    public static final /* enum */ Constants$PRIORITY_EVENTS PURCHASE_COMPLETED;
    public static final /* enum */ Constants$PRIORITY_EVENTS REMOVE_FROM_CART;
    public static final /* enum */ Constants$PRIORITY_EVENTS REMOVE_FROM_WISHLIST;
    private int priorityEventValue;

    private static final /* synthetic */ Constants$PRIORITY_EVENTS[] $values() {
        Constants$PRIORITY_EVENTS constants$PRIORITY_EVENTS = ADD_TO_CART;
        constants$PRIORITY_EVENTS = REMOVE_FROM_CART;
        constants$PRIORITY_EVENTS = ADD_TO_WISHLIST;
        constants$PRIORITY_EVENTS = REMOVE_FROM_WISHLIST;
        constants$PRIORITY_EVENTS = PURCHASE_COMPLETED;
        constants$PRIORITY_EVENTS = APP_LAUNCH;
        constants$PRIORITY_EVENTS = PRODUCT_CANCELLED;
        constants$PRIORITY_EVENTS = PRODUCT_RETURNED;
        Constants$PRIORITY_EVENTS[] constants$PRIORITY_EVENTSArray = new Constants$PRIORITY_EVENTS[]{constants$PRIORITY_EVENTS, constants$PRIORITY_EVENTS, constants$PRIORITY_EVENTS, constants$PRIORITY_EVENTS, constants$PRIORITY_EVENTS, constants$PRIORITY_EVENTS, constants$PRIORITY_EVENTS, constants$PRIORITY_EVENTS};
        return constants$PRIORITY_EVENTSArray;
    }

    static {
        int n3 = 3;
        Enum[] enumArray = new Constants$PRIORITY_EVENTS("ADD_TO_CART", 0, n3);
        ADD_TO_CART = enumArray;
        int n4 = 1;
        int n7 = 4;
        enumArray = new Constants$PRIORITY_EVENTS("REMOVE_FROM_CART", n4, n7);
        REMOVE_FROM_CART = enumArray;
        int n8 = 5;
        enumArray = new Constants$PRIORITY_EVENTS("ADD_TO_WISHLIST", 2, n8);
        ADD_TO_WISHLIST = enumArray;
        int n10 = 6;
        enumArray = new Constants$PRIORITY_EVENTS("REMOVE_FROM_WISHLIST", n3, n10);
        REMOVE_FROM_WISHLIST = enumArray;
        n3 = 7;
        enumArray = new Constants$PRIORITY_EVENTS("PURCHASE_COMPLETED", n7, n3);
        PURCHASE_COMPLETED = enumArray;
        enumArray = new Constants$PRIORITY_EVENTS("APP_LAUNCH", n8, n4);
        APP_LAUNCH = enumArray;
        enumArray = new Constants$PRIORITY_EVENTS("PRODUCT_CANCELLED", n10, 17);
        PRODUCT_CANCELLED = enumArray;
        enumArray = new Constants$PRIORITY_EVENTS("PRODUCT_RETURNED", n3, 18);
        PRODUCT_RETURNED = enumArray;
        enumArray = Constants$PRIORITY_EVENTS.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Constants$PRIORITY_EVENTS() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.priorityEventValue = var3_2;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static Constants$PRIORITY_EVENTS valueOf(String string2) {
        return Enum.valueOf(Constants$PRIORITY_EVENTS.class, string2);
    }

    public static Constants$PRIORITY_EVENTS[] values() {
        return (Constants$PRIORITY_EVENTS[])$VALUES.clone();
    }

    public final int getPriorityEventValue() {
        return this.priorityEventValue;
    }

    public final void setPriorityEventValue(int n3) {
        this.priorityEventValue = n3;
    }
}

