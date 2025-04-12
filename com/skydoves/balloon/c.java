/*
 * Decompiled with CFR 0.152.
 */
package com.skydoves.balloon;

import com.skydoves.balloon.c$a;

public final class c
extends Enum {
    private static final /* synthetic */ c[] $VALUES;
    public static final /* enum */ c BOTTOM;
    public static final c$a Companion;
    public static final /* enum */ c END;
    public static final /* enum */ c START;
    public static final /* enum */ c TOP;

    private static final /* synthetic */ c[] $values() {
        c c2 = START;
        c2 = END;
        c2 = TOP;
        c2 = BOTTOM;
        c[] cArray = new c[]{c2, c2, c2, c2};
        return cArray;
    }

    static {
        Object object;
        START = object = new c("START", 0);
        END = object = new c("END", 1);
        TOP = object = new c("TOP", 2);
        BOTTOM = object = new c("BOTTOM", 3);
        $VALUES = c.$values();
        object = new Object();
        Companion = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private c() {
        void var2_-1;
        void var1_-1;
    }

    public static c valueOf(String string2) {
        return Enum.valueOf(c.class, string2);
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }
}

