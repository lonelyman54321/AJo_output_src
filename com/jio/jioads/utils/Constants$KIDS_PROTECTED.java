/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.utils;

public final class Constants$KIDS_PROTECTED
extends Enum {
    public static final /* enum */ Constants$KIDS_PROTECTED NO;
    public static final /* enum */ Constants$KIDS_PROTECTED YES;
    public static final /* synthetic */ Constants$KIDS_PROTECTED[] b;
    public static final /* synthetic */ ga0_2 c;
    public final String a;

    static {
        Constants$KIDS_PROTECTED constants$KIDS_PROTECTED;
        Constants$KIDS_PROTECTED constants$KIDS_PROTECTED2;
        YES = constants$KIDS_PROTECTED2 = new Constants$KIDS_PROTECTED(0, "YES", "1");
        int n3 = 1;
        NO = constants$KIDS_PROTECTED = new Constants$KIDS_PROTECTED(n3, "NO", "0");
        Enum[] enumArray = new Constants$KIDS_PROTECTED[2];
        enumArray[0] = constants$KIDS_PROTECTED2;
        enumArray[n3] = constants$KIDS_PROTECTED;
        b = enumArray;
        c = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public Constants$KIDS_PROTECTED() {
        void var3_2;
        void var1_-1;
        void var2_-1;
        this.a = var3_2;
    }

    public static ga0_2 getEntries() {
        return c;
    }

    public static Constants$KIDS_PROTECTED valueOf(String string2) {
        return Enum.valueOf(Constants$KIDS_PROTECTED.class, string2);
    }

    public static Constants$KIDS_PROTECTED[] values() {
        return (Constants$KIDS_PROTECTED[])b.clone();
    }

    public final String getValue() {
        return this.a;
    }
}

