/*
 * Decompiled with CFR 0.152.
 */
package com.skydoves.balloon;

import com.skydoves.balloon.d$a;

public final class d
extends Enum {
    private static final /* synthetic */ d[] $VALUES;
    public static final /* enum */ d BOTTOM;
    public static final d$a Companion;
    public static final /* enum */ d END;
    public static final /* enum */ d START;
    public static final /* enum */ d TOP;

    private static final /* synthetic */ d[] $values() {
        d d2 = START;
        d2 = END;
        d2 = TOP;
        d2 = BOTTOM;
        d[] dArray = new d[]{d2, d2, d2, d2};
        return dArray;
    }

    static {
        Object object;
        START = object = new d("START", 0);
        END = object = new d("END", 1);
        TOP = object = new d("TOP", 2);
        BOTTOM = object = new d("BOTTOM", 3);
        $VALUES = d.$values();
        object = new Object();
        Companion = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private d() {
        void var2_-1;
        void var1_-1;
    }

    public static d valueOf(String string2) {
        return Enum.valueOf(d.class, string2);
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }
}

