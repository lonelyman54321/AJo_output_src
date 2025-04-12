/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.utils;

public final class Constants$ResponseHeaderKeys
extends Enum {
    public static final /* enum */ Constants$ResponseHeaderKeys ACCEPT_ENCODING;
    public static final /* enum */ Constants$ResponseHeaderKeys Content_Type;
    public static final /* enum */ Constants$ResponseHeaderKeys JIO_DATA;
    public static final /* enum */ Constants$ResponseHeaderKeys Jio_ADS_MED;
    public static final /* synthetic */ Constants$ResponseHeaderKeys[] b;
    public static final /* synthetic */ ga0_2 c;
    public final String a;

    static {
        Constants$ResponseHeaderKeys constants$ResponseHeaderKeys;
        Constants$ResponseHeaderKeys constants$ResponseHeaderKeys2;
        Constants$ResponseHeaderKeys constants$ResponseHeaderKeys3;
        Constants$ResponseHeaderKeys constants$ResponseHeaderKeys4;
        ACCEPT_ENCODING = constants$ResponseHeaderKeys4 = new Constants$ResponseHeaderKeys(0, "ACCEPT_ENCODING", "accept-encoding");
        int n3 = 1;
        Content_Type = constants$ResponseHeaderKeys3 = new Constants$ResponseHeaderKeys(n3, "Content_Type", "Content-Type");
        int n4 = 2;
        Jio_ADS_MED = constants$ResponseHeaderKeys2 = new Constants$ResponseHeaderKeys(n4, "Jio_ADS_MED", "med");
        int n7 = 3;
        JIO_DATA = constants$ResponseHeaderKeys = new Constants$ResponseHeaderKeys(n7, "JIO_DATA", "X-Jio-Data");
        Enum[] enumArray = new Constants$ResponseHeaderKeys[4];
        enumArray[0] = constants$ResponseHeaderKeys4;
        enumArray[n3] = constants$ResponseHeaderKeys3;
        enumArray[n4] = constants$ResponseHeaderKeys2;
        enumArray[n7] = constants$ResponseHeaderKeys;
        b = enumArray;
        c = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public Constants$ResponseHeaderKeys() {
        void var3_2;
        void var1_-1;
        void var2_-1;
        this.a = var3_2;
    }

    public static ga0_2 getEntries() {
        return c;
    }

    public static Constants$ResponseHeaderKeys valueOf(String string2) {
        return Enum.valueOf(Constants$ResponseHeaderKeys.class, string2);
    }

    public static Constants$ResponseHeaderKeys[] values() {
        return (Constants$ResponseHeaderKeys[])b.clone();
    }

    public final String getResponseHeader() {
        return this.a;
    }
}

