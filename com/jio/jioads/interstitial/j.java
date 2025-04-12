/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.interstitial;

public final class j
extends Enum {
    public static final /* enum */ j a;
    public static final /* enum */ j b;
    public static final /* enum */ j c;
    public static final /* enum */ j d;
    public static final /* enum */ j e;
    public static final /* synthetic */ j[] f;

    static {
        j j3;
        j j5;
        j j7;
        j j8;
        j j10;
        a = j10 = new j("NATIVE", 0);
        int n3 = 1;
        b = j8 = new j("STATIC", n3);
        int n4 = 2;
        c = j7 = new j("VIDEO", n4);
        int n7 = 3;
        d = j5 = new j("COMPANION", n7);
        int n8 = 4;
        e = j3 = new j("AUDIO", n8);
        Enum[] enumArray = new j[5];
        enumArray[0] = j10;
        enumArray[n3] = j8;
        enumArray[n4] = j7;
        enumArray[n7] = j5;
        enumArray[n8] = j3;
        f = enumArray;
        ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public j() {
        void var2_-1;
        void var1_-1;
    }

    public static j valueOf(String string2) {
        return Enum.valueOf(j.class, string2);
    }

    public static j[] values() {
        return (j[])f.clone();
    }
}

