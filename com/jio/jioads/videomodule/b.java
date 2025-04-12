/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.videomodule;

public final class b
extends Enum {
    public static final /* enum */ b a;
    public static final /* enum */ b b;
    public static final /* enum */ b c;
    public static final /* enum */ b d;
    public static final /* synthetic */ b[] e;

    static {
        b b2;
        b b3;
        b b4;
        b b5;
        a = b5 = new b("RESUME", 0);
        int n3 = 1;
        b = b4 = new b("PAUSE", n3);
        int n4 = 2;
        c = b3 = new b("MUTE", n4);
        int n7 = 3;
        d = b2 = new b("UN_MUTE", n7);
        Enum[] enumArray = new b[4];
        enumArray[0] = b5;
        enumArray[n3] = b4;
        enumArray[n4] = b3;
        enumArray[n7] = b2;
        e = enumArray;
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
        return (b[])e.clone();
    }
}

