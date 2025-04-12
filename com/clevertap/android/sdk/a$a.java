/*
 * Decompiled with CFR 0.152.
 */
package com.clevertap.android.sdk;

public final class a$a
extends Enum {
    private static final /* synthetic */ a$a[] $VALUES;
    public static final /* enum */ a$a DEBUG;
    public static final /* enum */ a$a INFO;
    public static final /* enum */ a$a OFF;
    public static final /* enum */ a$a VERBOSE;
    private final int value;

    private static /* synthetic */ a$a[] $values() {
        a$a a$a = OFF;
        a$a = INFO;
        a$a = DEBUG;
        a$a = VERBOSE;
        a$a[] a$aArray = new a$a[]{a$a, a$a, a$a, a$a};
        return a$aArray;
    }

    static {
        a$a a$a;
        OFF = a$a = new a$a("OFF", 0, -1);
        INFO = a$a = new a$a("INFO", 1, 0);
        int n3 = 2;
        DEBUG = a$a = new a$a("DEBUG", n3, n3);
        n3 = 3;
        VERBOSE = a$a = new a$a("VERBOSE", n3, n3);
        $VALUES = a$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private a$a() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static a$a valueOf(String string2) {
        return Enum.valueOf(a$a.class, string2);
    }

    public static a$a[] values() {
        return (a$a[])$VALUES.clone();
    }

    public int intValue() {
        return this.value;
    }
}

