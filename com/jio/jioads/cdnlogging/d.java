/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.cdnlogging;

public final class d
extends Enum {
    public static final /* enum */ d a;
    public static final /* enum */ d b;
    public static final /* enum */ d c;
    public static final /* synthetic */ d[] d;

    static {
        d d2;
        d d5;
        d d7;
        a = d7 = new d("HIGH", 0);
        int n3 = 1;
        b = d5 = new d("MED", n3);
        int n4 = 2;
        c = d2 = new d("LOW", n4);
        Enum[] enumArray = new d[3];
        enumArray[0] = d7;
        enumArray[n3] = d5;
        enumArray[n4] = d2;
        d = enumArray;
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
        return (d[])d.clone();
    }
}

