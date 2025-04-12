/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.utils;

public final class Constants$DynamicDisplaySize
extends Enum {
    public static final /* enum */ Constants$DynamicDisplaySize SIZE_160x600;
    public static final /* enum */ Constants$DynamicDisplaySize SIZE_300x250;
    public static final /* enum */ Constants$DynamicDisplaySize SIZE_300x50;
    public static final /* enum */ Constants$DynamicDisplaySize SIZE_300x600;
    public static final /* enum */ Constants$DynamicDisplaySize SIZE_320x100;
    public static final /* enum */ Constants$DynamicDisplaySize SIZE_320x50;
    public static final /* enum */ Constants$DynamicDisplaySize SIZE_728x90;
    public static final /* enum */ Constants$DynamicDisplaySize SIZE_970x250;
    public static final /* enum */ Constants$DynamicDisplaySize SIZE_970x90;
    public static final /* synthetic */ Constants$DynamicDisplaySize[] b;
    public static final /* synthetic */ ga0_2 c;
    public final String a;

    static {
        Constants$DynamicDisplaySize constants$DynamicDisplaySize;
        Constants$DynamicDisplaySize constants$DynamicDisplaySize2;
        Constants$DynamicDisplaySize constants$DynamicDisplaySize3;
        Constants$DynamicDisplaySize constants$DynamicDisplaySize4;
        Constants$DynamicDisplaySize constants$DynamicDisplaySize5;
        Constants$DynamicDisplaySize constants$DynamicDisplaySize6;
        Constants$DynamicDisplaySize constants$DynamicDisplaySize7;
        Constants$DynamicDisplaySize constants$DynamicDisplaySize8;
        Constants$DynamicDisplaySize constants$DynamicDisplaySize9;
        SIZE_160x600 = constants$DynamicDisplaySize9 = new Constants$DynamicDisplaySize(0, "SIZE_160x600", "160x600");
        int n3 = 1;
        SIZE_300x50 = constants$DynamicDisplaySize8 = new Constants$DynamicDisplaySize(n3, "SIZE_300x50", "300x50");
        int n4 = 2;
        SIZE_300x250 = constants$DynamicDisplaySize7 = new Constants$DynamicDisplaySize(n4, "SIZE_300x250", "300x250");
        int n7 = 3;
        SIZE_300x600 = constants$DynamicDisplaySize6 = new Constants$DynamicDisplaySize(n7, "SIZE_300x600", "300x600");
        SIZE_320x50 = constants$DynamicDisplaySize5 = new Constants$DynamicDisplaySize(4, "SIZE_320x50", "320x50");
        SIZE_320x100 = constants$DynamicDisplaySize4 = new Constants$DynamicDisplaySize(5, "SIZE_320x100", "320x100");
        SIZE_728x90 = constants$DynamicDisplaySize3 = new Constants$DynamicDisplaySize(6, "SIZE_728x90", "728x90");
        SIZE_970x90 = constants$DynamicDisplaySize2 = new Constants$DynamicDisplaySize(7, "SIZE_970x90", "970x90");
        int n8 = 8;
        SIZE_970x250 = constants$DynamicDisplaySize = new Constants$DynamicDisplaySize(n8, "SIZE_970x250", "970x250");
        Enum[] enumArray = new Constants$DynamicDisplaySize[9];
        enumArray[0] = constants$DynamicDisplaySize9;
        enumArray[n3] = constants$DynamicDisplaySize8;
        enumArray[n4] = constants$DynamicDisplaySize7;
        enumArray[n7] = constants$DynamicDisplaySize6;
        enumArray[4] = constants$DynamicDisplaySize5;
        enumArray[5] = constants$DynamicDisplaySize4;
        enumArray[6] = constants$DynamicDisplaySize3;
        enumArray[7] = constants$DynamicDisplaySize2;
        enumArray[n8] = constants$DynamicDisplaySize;
        b = enumArray;
        c = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public Constants$DynamicDisplaySize() {
        void var3_2;
        void var1_-1;
        void var2_-1;
        this.a = var3_2;
    }

    public static ga0_2 getEntries() {
        return c;
    }

    public static Constants$DynamicDisplaySize valueOf(String string2) {
        return Enum.valueOf(Constants$DynamicDisplaySize.class, string2);
    }

    public static Constants$DynamicDisplaySize[] values() {
        return (Constants$DynamicDisplaySize[])b.clone();
    }

    public final String getDynamicSize() {
        return this.a;
    }
}

