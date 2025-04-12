/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.jioreel.data;

public final class e
extends Enum {
    public static final /* enum */ e a;
    public static final /* enum */ e b;
    public static final /* synthetic */ e[] c;

    static {
        e e2;
        e e5;
        a = e5 = new e("SESSION_URL", 0);
        int n3 = 1;
        b = e2 = new e("DIRECT_PLAYBACK", n3);
        Enum[] enumArray = new e[2];
        enumArray[0] = e5;
        enumArray[n3] = e2;
        c = enumArray;
        ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public e() {
        void var2_-1;
        void var1_-1;
    }

    public static e valueOf(String string2) {
        return Enum.valueOf(e.class, string2);
    }

    public static e[] values() {
        return (e[])c.clone();
    }
}

