/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.videomodule;

public final class d
extends Enum {
    public static final /* enum */ d a;
    public static final /* enum */ d b;
    public static final /* enum */ d c;
    public static final /* enum */ d d;
    public static final /* enum */ d e;
    public static final /* synthetic */ d[] f;

    static {
        d d2;
        d d5;
        d d7;
        d d9;
        d d12;
        a = d12 = new d("NONE", 0);
        int n3 = 1;
        b = d9 = new d("START", n3);
        int n4 = 2;
        c = d7 = new d("FIRST", n4);
        int n7 = 3;
        d = d5 = new d("MID", n7);
        int n8 = 4;
        e = d2 = new d("THIRD", n8);
        int n10 = 5;
        d d13 = new d("COMPLETE", n10);
        Enum[] enumArray = new d[6];
        enumArray[0] = d12;
        enumArray[n3] = d9;
        enumArray[n4] = d7;
        enumArray[n7] = d5;
        enumArray[n8] = d2;
        enumArray[n10] = d13;
        f = enumArray;
        ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public d() {
        void var2_-1;
        void var1_-1;
    }

    public static d valueOf(String string2) {
        return Enum.valueOf(d.class, string2);
    }

    public static d[] values() {
        return (d[])f.clone();
    }
}

