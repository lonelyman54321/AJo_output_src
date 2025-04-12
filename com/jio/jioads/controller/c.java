/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.controller;

public final class c
extends Enum {
    public static final /* enum */ c a;
    public static final /* enum */ c b;
    public static final /* synthetic */ c[] c;

    static {
        c c2;
        c c3;
        a = c3 = new c("RESUMED", 0);
        int n3 = 1;
        b = c2 = new c("PAUSED", n3);
        Enum[] enumArray = new c[2];
        enumArray[0] = c3;
        enumArray[n3] = c2;
        c = enumArray;
        ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public c() {
        void var2_-1;
        void var1_-1;
    }

    public static c valueOf(String string2) {
        return Enum.valueOf(c.class, string2);
    }

    public static c[] values() {
        return (c[])c.clone();
    }
}

