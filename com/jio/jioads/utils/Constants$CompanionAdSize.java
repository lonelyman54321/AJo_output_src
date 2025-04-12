/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.utils;

public final class Constants$CompanionAdSize
extends Enum {
    public static final /* enum */ Constants$CompanionAdSize SIZE_1024_768;
    public static final /* enum */ Constants$CompanionAdSize SIZE_1080_1920;
    public static final /* enum */ Constants$CompanionAdSize SIZE_1920_1080;
    public static final /* enum */ Constants$CompanionAdSize SIZE_240_260;
    public static final /* enum */ Constants$CompanionAdSize SIZE_300_250;
    public static final /* enum */ Constants$CompanionAdSize SIZE_320_184;
    public static final /* enum */ Constants$CompanionAdSize SIZE_320_480;
    public static final /* enum */ Constants$CompanionAdSize SIZE_320_50;
    public static final /* enum */ Constants$CompanionAdSize SIZE_480_320;
    public static final /* enum */ Constants$CompanionAdSize SIZE_768_1024;
    public static final /* synthetic */ Constants$CompanionAdSize[] b;
    public static final /* synthetic */ ga0_2 c;
    public final String a;

    static {
        Constants$CompanionAdSize constants$CompanionAdSize;
        Constants$CompanionAdSize constants$CompanionAdSize2;
        Constants$CompanionAdSize constants$CompanionAdSize3;
        Constants$CompanionAdSize constants$CompanionAdSize4;
        Constants$CompanionAdSize constants$CompanionAdSize5;
        Constants$CompanionAdSize constants$CompanionAdSize6;
        Constants$CompanionAdSize constants$CompanionAdSize7;
        Constants$CompanionAdSize constants$CompanionAdSize8;
        Constants$CompanionAdSize constants$CompanionAdSize9;
        Constants$CompanionAdSize constants$CompanionAdSize10;
        SIZE_320_50 = constants$CompanionAdSize10 = new Constants$CompanionAdSize(0, "SIZE_320_50", "320x50");
        int n3 = 1;
        SIZE_320_480 = constants$CompanionAdSize9 = new Constants$CompanionAdSize(n3, "SIZE_320_480", "320x480");
        int n4 = 2;
        SIZE_480_320 = constants$CompanionAdSize8 = new Constants$CompanionAdSize(n4, "SIZE_480_320", "480x320");
        SIZE_300_250 = constants$CompanionAdSize7 = new Constants$CompanionAdSize(3, "SIZE_300_250", "300x250");
        SIZE_240_260 = constants$CompanionAdSize6 = new Constants$CompanionAdSize(4, "SIZE_240_260", "240x260");
        SIZE_320_184 = constants$CompanionAdSize5 = new Constants$CompanionAdSize(5, "SIZE_320_184", "320x184");
        SIZE_1024_768 = constants$CompanionAdSize4 = new Constants$CompanionAdSize(6, "SIZE_1024_768", "1024x768");
        SIZE_768_1024 = constants$CompanionAdSize3 = new Constants$CompanionAdSize(7, "SIZE_768_1024", "768x1024");
        SIZE_1920_1080 = constants$CompanionAdSize2 = new Constants$CompanionAdSize(8, "SIZE_1920_1080", "1920x1080");
        int n7 = 9;
        SIZE_1080_1920 = constants$CompanionAdSize = new Constants$CompanionAdSize(n7, "SIZE_1080_1920", "1080x1920");
        Enum[] enumArray = new Constants$CompanionAdSize[10];
        enumArray[0] = constants$CompanionAdSize10;
        enumArray[n3] = constants$CompanionAdSize9;
        enumArray[n4] = constants$CompanionAdSize8;
        enumArray[3] = constants$CompanionAdSize7;
        enumArray[4] = constants$CompanionAdSize6;
        enumArray[5] = constants$CompanionAdSize5;
        enumArray[6] = constants$CompanionAdSize4;
        enumArray[7] = constants$CompanionAdSize3;
        enumArray[8] = constants$CompanionAdSize2;
        enumArray[n7] = constants$CompanionAdSize;
        b = enumArray;
        c = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public Constants$CompanionAdSize() {
        void var3_2;
        void var1_-1;
        void var2_-1;
        this.a = var3_2;
    }

    public static ga0_2 getEntries() {
        return c;
    }

    public static Constants$CompanionAdSize valueOf(String string2) {
        return Enum.valueOf(Constants$CompanionAdSize.class, string2);
    }

    public static Constants$CompanionAdSize[] values() {
        return (Constants$CompanionAdSize[])b.clone();
    }

    public final String getCompanionAdSize() {
        return this.a;
    }
}

