/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.jioreel.data;

public final class a
extends Enum {
    public static final /* enum */ a a;
    public static final /* enum */ a b;
    public static final /* synthetic */ a[] c;

    static {
        a a2;
        a a3;
        a = a3 = new a("START", 0);
        int n3 = 1;
        b = a2 = new a("END", n3);
        Enum[] enumArray = new a[2];
        enumArray[0] = a3;
        enumArray[n3] = a2;
        c = enumArray;
        ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public a() {
        void var2_-1;
        void var1_-1;
    }

    public static a valueOf(String string2) {
        return Enum.valueOf(a.class, string2);
    }

    public static a[] values() {
        return (a[])c.clone();
    }
}

