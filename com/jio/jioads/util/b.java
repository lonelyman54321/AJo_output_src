/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.util;

public final class b
extends Enum {
    public static final /* enum */ b b;
    public static final /* synthetic */ b[] c;
    public final String a;

    static {
        b b2;
        b = b2 = new b(0, "DELIVERY_STREAMING", "streaming");
        int n3 = 1;
        b b3 = new b(n3, "DELIVERY_PROGRESSIVE", "progressive");
        Enum[] enumArray = new b[2];
        enumArray[0] = b2;
        enumArray[n3] = b3;
        c = enumArray;
        ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public b() {
        void var3_2;
        void var1_-1;
        void var2_-1;
        this.a = var3_2;
    }

    public static b valueOf(String string2) {
        return Enum.valueOf(b.class, string2);
    }

    public static b[] values() {
        return (b[])c.clone();
    }

    public final String a() {
        return this.a;
    }
}

