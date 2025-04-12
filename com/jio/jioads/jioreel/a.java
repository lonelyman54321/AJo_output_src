/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.jioreel;

public final class a
extends Enum {
    public static final /* synthetic */ a[] a;

    static {
        a a2 = new a("JIOREEL", 0);
        int n3 = 1;
        a a3 = new a("NOWTILUS", n3);
        Enum[] enumArray = new a[2];
        enumArray[0] = a2;
        enumArray[n3] = a3;
        a = enumArray;
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
        return (a[])a.clone();
    }
}

