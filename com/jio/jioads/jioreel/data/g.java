/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.jioreel.data;

public final class g
extends Enum {
    public static final /* enum */ g a;
    public static final /* enum */ g b;
    public static final /* synthetic */ g[] c;

    static {
        g g3;
        g g5;
        a = g5 = new g("HLS", 0);
        int n3 = 1;
        b = g3 = new g("DASH", n3);
        Enum[] enumArray = new g[2];
        enumArray[0] = g5;
        enumArray[n3] = g3;
        c = enumArray;
        ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public g() {
        void var2_-1;
        void var1_-1;
    }

    public static g valueOf(String string2) {
        return Enum.valueOf(g.class, string2);
    }

    public static g[] values() {
        return (g[])c.clone();
    }
}

