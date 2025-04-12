/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.wrapper;

public final class b
extends Enum {
    public static final /* enum */ b a;
    public static final /* enum */ b b;
    public static final /* enum */ b c;
    public static final /* enum */ b d;
    public static final /* enum */ b e;
    public static final /* synthetic */ b[] f;

    static {
        b b2;
        b b3;
        b b4;
        b b5;
        b b7;
        a = b7 = new b("EMPTY_AD_TAG_URI", 0);
        int n3 = 1;
        b = b5 = new b("REDIRECTION_LIMIT_REACHED", n3);
        int n4 = 2;
        c = b4 = new b("LOOP_IN_WRAPPER", n4);
        int n7 = 3;
        d = b3 = new b("ERROR_IN_RESPONSE", n7);
        int n8 = 4;
        e = b2 = new b("PARSING_ERROR", n8);
        Enum[] enumArray = new b[5];
        enumArray[0] = b7;
        enumArray[n3] = b5;
        enumArray[n4] = b4;
        enumArray[n7] = b3;
        enumArray[n8] = b2;
        f = enumArray;
        ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public b() {
        void var2_-1;
        void var1_-1;
    }

    public static b valueOf(String string2) {
        return Enum.valueOf(b.class, string2);
    }

    public static b[] values() {
        return (b[])f.clone();
    }
}

