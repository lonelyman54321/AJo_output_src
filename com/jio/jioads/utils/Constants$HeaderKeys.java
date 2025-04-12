/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.utils;

public final class Constants$HeaderKeys
extends Enum {
    public static final /* enum */ Constants$HeaderKeys ACCEPT_ENCODING;
    public static final /* enum */ Constants$HeaderKeys Content_Type;
    public static final /* enum */ Constants$HeaderKeys JIO_DATA;
    public static final /* enum */ Constants$HeaderKeys X_Jio_FC;
    public static final /* enum */ Constants$HeaderKeys X_Jio_IM;
    public static final /* enum */ Constants$HeaderKeys X_Jio_VIM;
    public static final /* synthetic */ Constants$HeaderKeys[] b;
    public static final /* synthetic */ ga0_2 c;
    public final String a;

    static {
        Constants$HeaderKeys constants$HeaderKeys;
        Constants$HeaderKeys constants$HeaderKeys2;
        Constants$HeaderKeys constants$HeaderKeys3;
        Constants$HeaderKeys constants$HeaderKeys4;
        Constants$HeaderKeys constants$HeaderKeys5;
        Constants$HeaderKeys constants$HeaderKeys6;
        ACCEPT_ENCODING = constants$HeaderKeys6 = new Constants$HeaderKeys(0, "ACCEPT_ENCODING", "accept-encoding");
        int n3 = 1;
        Content_Type = constants$HeaderKeys5 = new Constants$HeaderKeys(n3, "Content_Type", "Content-Type");
        int n4 = 2;
        JIO_DATA = constants$HeaderKeys4 = new Constants$HeaderKeys(n4, "JIO_DATA", "X-Jio-Data");
        int n7 = 3;
        X_Jio_FC = constants$HeaderKeys3 = new Constants$HeaderKeys(n7, "X_Jio_FC", "X-Jio-FC");
        int n8 = 4;
        X_Jio_VIM = constants$HeaderKeys2 = new Constants$HeaderKeys(n8, "X_Jio_VIM", "vim");
        int n10 = 5;
        X_Jio_IM = constants$HeaderKeys = new Constants$HeaderKeys(n10, "X_Jio_IM", "im");
        Enum[] enumArray = new Constants$HeaderKeys[6];
        enumArray[0] = constants$HeaderKeys6;
        enumArray[n3] = constants$HeaderKeys5;
        enumArray[n4] = constants$HeaderKeys4;
        enumArray[n7] = constants$HeaderKeys3;
        enumArray[n8] = constants$HeaderKeys2;
        enumArray[n10] = constants$HeaderKeys;
        b = enumArray;
        c = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public Constants$HeaderKeys() {
        void var3_2;
        void var1_-1;
        void var2_-1;
        this.a = var3_2;
    }

    public static ga0_2 getEntries() {
        return c;
    }

    public static Constants$HeaderKeys valueOf(String string2) {
        return Enum.valueOf(Constants$HeaderKeys.class, string2);
    }

    public static Constants$HeaderKeys[] values() {
        return (Constants$HeaderKeys[])b.clone();
    }

    public final String getKey() {
        return this.a;
    }
}

