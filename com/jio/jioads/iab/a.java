/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.iab;

public final class a
extends Enum {
    public static final /* enum */ a a;
    public static final /* enum */ a b;
    public static final /* enum */ a c;
    public static final /* enum */ a d;
    public static final /* enum */ a e;
    public static final /* enum */ a f;
    public static final /* enum */ a g;
    public static final /* enum */ a h;
    public static final /* enum */ a i;
    public static final /* enum */ a j;
    public static final /* enum */ a k;
    public static final /* enum */ a l;
    public static final /* enum */ a m;
    public static final /* enum */ a n;
    public static final /* enum */ a o;
    public static final /* synthetic */ a[] p;

    static {
        a a2;
        a a3;
        a a4;
        a a5;
        a a7;
        a a9;
        a a10;
        a a11;
        a a12;
        a a13;
        a a14;
        a a15;
        a a16;
        a a17;
        a a18;
        a = a18 = new a("START", 0);
        b = a17 = new a("FIRST_QUARTILE", 1);
        c = a16 = new a("MID_POINT", 2);
        d = a15 = new a("THIRD_QUARTILE", 3);
        e = a14 = new a("COMPLETE", 4);
        f = a13 = new a("PAUSE", 5);
        g = a12 = new a("RESUME", 6);
        h = a11 = new a("SKIPPED", 7);
        i = a10 = new a("FULL_SCREEN", 8);
        j = a9 = new a("NORMAL_SCREEN", 9);
        k = a7 = new a("COLLAPSED", 10);
        l = a5 = new a("EXPANDED", 11);
        m = a4 = new a("UNMUTE", 12);
        n = a3 = new a("MUTE", 13);
        int n3 = 14;
        o = a2 = new a("CLICK", n3);
        Enum[] enumArray = new a[15];
        enumArray[0] = a18;
        enumArray[1] = a17;
        enumArray[2] = a16;
        enumArray[3] = a15;
        enumArray[4] = a14;
        enumArray[5] = a13;
        enumArray[6] = a12;
        enumArray[7] = a11;
        enumArray[8] = a10;
        enumArray[9] = a9;
        enumArray[10] = a7;
        enumArray[11] = a5;
        enumArray[12] = a4;
        enumArray[13] = a3;
        enumArray[n3] = a2;
        p = enumArray;
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
        return (a[])p.clone();
    }
}

