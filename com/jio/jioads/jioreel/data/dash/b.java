/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.jioreel.data.dash;

public final class b
extends Enum {
    public static final /* enum */ b a;
    public static final /* enum */ b b;
    public static final /* enum */ b c;
    public static final /* synthetic */ b[] d;

    static {
        b b2;
        b b3;
        b b4;
        a = b4 = new b("TYPE_NONE", 0);
        int n3 = 1;
        b = b3 = new b("TYPE_AD", n3);
        int n4 = 2;
        c = b2 = new b("TYPE_SLATE", n4);
        Enum[] enumArray = new b[3];
        enumArray[0] = b4;
        enumArray[n3] = b3;
        enumArray[n4] = b2;
        d = enumArray;
        ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public b() {
        void var2_-1;
        void var1_-1;
    }

    public static b valueOf(String string2) {
        return Enum.valueOf(b.class, string2);
    }

    public static b[] values() {
        return (b[])d.clone();
    }
}

