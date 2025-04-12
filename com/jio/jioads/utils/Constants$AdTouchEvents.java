/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.utils;

public final class Constants$AdTouchEvents
extends Enum {
    public static final /* enum */ Constants$AdTouchEvents SWIPE_DOWN;
    public static final /* enum */ Constants$AdTouchEvents SWIPE_LEFT;
    public static final /* enum */ Constants$AdTouchEvents SWIPE_RIGHT;
    public static final /* enum */ Constants$AdTouchEvents SWIPE_UP;
    public static final /* synthetic */ Constants$AdTouchEvents[] b;
    public static final /* synthetic */ ga0_2 c;
    public final String a;

    static {
        Constants$AdTouchEvents constants$AdTouchEvents;
        Object object = "SWIPE_UP";
        SWIPE_UP = constants$AdTouchEvents = new Constants$AdTouchEvents(0, object, object);
        int n3 = 1;
        Object object2 = "SWIPE_DOWN";
        object = new Constants$AdTouchEvents(n3, object2, object2);
        SWIPE_DOWN = object;
        int n4 = 2;
        Object object3 = "SWIPE_LEFT";
        object2 = new Constants$AdTouchEvents(n4, object3, object3);
        SWIPE_LEFT = object2;
        int n7 = 3;
        Enum[] enumArray = "SWIPE_RIGHT";
        object3 = new Constants$AdTouchEvents(n7, (String)enumArray, (String)enumArray);
        SWIPE_RIGHT = object3;
        enumArray = new Constants$AdTouchEvents[4];
        enumArray[0] = constants$AdTouchEvents;
        enumArray[n3] = object;
        enumArray[n4] = object2;
        enumArray[n7] = object3;
        b = enumArray;
        c = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public Constants$AdTouchEvents() {
        void var3_2;
        void var1_-1;
        void var2_-1;
        this.a = var3_2;
    }

    public static ga0_2 getEntries() {
        return c;
    }

    public static Constants$AdTouchEvents valueOf(String string2) {
        return Enum.valueOf(Constants$AdTouchEvents.class, string2);
    }

    public static Constants$AdTouchEvents[] values() {
        return (Constants$AdTouchEvents[])b.clone();
    }

    public final String getValue() {
        return this.a;
    }
}

