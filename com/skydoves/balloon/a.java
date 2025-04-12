/*
 * Decompiled with CFR 0.152.
 */
package com.skydoves.balloon;

import com.skydoves.balloon.a$a;

public final class a
extends Enum {
    private static final /* synthetic */ a[] $VALUES;
    public static final /* enum */ a BOTTOM;
    public static final a$a Companion;
    public static final /* enum */ a END;
    public static final /* enum */ a START;
    public static final /* enum */ a TOP;

    private static final /* synthetic */ a[] $values() {
        a a2 = BOTTOM;
        a2 = TOP;
        a2 = START;
        a2 = END;
        a[] aArray = new a[]{a2, a2, a2, a2};
        return aArray;
    }

    static {
        Object object;
        BOTTOM = object = new a("BOTTOM", 0);
        TOP = object = new a("TOP", 1);
        START = object = new a("START", 2);
        END = object = new a("END", 3);
        $VALUES = a.$values();
        object = new Object();
        Companion = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private a() {
        void var2_-1;
        void var1_-1;
    }

    public static a valueOf(String string2) {
        return Enum.valueOf(a.class, string2);
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }
}

