/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;

public final class NetworkConnectionInfo$MobileSubtype
extends Enum {
    private static final /* synthetic */ NetworkConnectionInfo$MobileSubtype[] $VALUES;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype CDMA;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype COMBINED;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype EDGE;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype EHRPD;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype EVDO_0;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype EVDO_A;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype EVDO_B;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype GPRS;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype GSM;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype HSDPA;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype HSPA;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype HSPAP;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype HSUPA;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype IDEN;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype IWLAN;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype LTE;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype LTE_CA;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype RTT;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype TD_SCDMA;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype UMTS;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype UNKNOWN_MOBILE_SUBTYPE;
    private static final SparseArray valueMap;
    private final int value;

    static {
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype;
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype2;
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype3;
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype4;
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype5;
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype6;
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype7;
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype8;
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype9;
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype10;
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype11;
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype12;
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype13;
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype14;
        Object object = new NetworkConnectionInfo$MobileSubtype("UNKNOWN_MOBILE_SUBTYPE", 0, 0);
        UNKNOWN_MOBILE_SUBTYPE = object;
        int n3 = 1;
        GPRS = networkConnectionInfo$MobileSubtype14 = new NetworkConnectionInfo$MobileSubtype("GPRS", n3, n3);
        int n4 = 2;
        EDGE = networkConnectionInfo$MobileSubtype13 = new NetworkConnectionInfo$MobileSubtype("EDGE", n4, n4);
        int n7 = 3;
        UMTS = networkConnectionInfo$MobileSubtype12 = new NetworkConnectionInfo$MobileSubtype("UMTS", n7, n7);
        int n8 = 4;
        CDMA = networkConnectionInfo$MobileSubtype11 = new NetworkConnectionInfo$MobileSubtype("CDMA", n8, n8);
        int n10 = 5;
        EVDO_0 = networkConnectionInfo$MobileSubtype10 = new NetworkConnectionInfo$MobileSubtype("EVDO_0", n10, n10);
        int n14 = 6;
        EVDO_A = networkConnectionInfo$MobileSubtype9 = new NetworkConnectionInfo$MobileSubtype("EVDO_A", n14, n14);
        n14 = 7;
        RTT = networkConnectionInfo$MobileSubtype8 = new NetworkConnectionInfo$MobileSubtype("RTT", n14, n14);
        n10 = 8;
        HSDPA = networkConnectionInfo$MobileSubtype7 = new NetworkConnectionInfo$MobileSubtype("HSDPA", n10, n10);
        n8 = 9;
        HSUPA = networkConnectionInfo$MobileSubtype6 = new NetworkConnectionInfo$MobileSubtype("HSUPA", n8, n8);
        n7 = 10;
        HSPA = networkConnectionInfo$MobileSubtype5 = new NetworkConnectionInfo$MobileSubtype("HSPA", n7, n7);
        n4 = 11;
        IDEN = networkConnectionInfo$MobileSubtype4 = new NetworkConnectionInfo$MobileSubtype("IDEN", n4, n4);
        n3 = 12;
        EVDO_B = networkConnectionInfo$MobileSubtype3 = new NetworkConnectionInfo$MobileSubtype("EVDO_B", n3, n3);
        int n15 = 13;
        NetworkConnectionInfo$MobileSubtype[] networkConnectionInfo$MobileSubtypeArray = new NetworkConnectionInfo$MobileSubtype("LTE", n15, n15);
        LTE = networkConnectionInfo$MobileSubtypeArray;
        NetworkConnectionInfo$MobileSubtype[] networkConnectionInfo$MobileSubtypeArray2 = networkConnectionInfo$MobileSubtypeArray;
        n4 = 14;
        EHRPD = networkConnectionInfo$MobileSubtype2 = new NetworkConnectionInfo$MobileSubtype("EHRPD", n4, n4);
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype15 = networkConnectionInfo$MobileSubtype2;
        n3 = 15;
        HSPAP = networkConnectionInfo$MobileSubtype = new NetworkConnectionInfo$MobileSubtype("HSPAP", n3, n3);
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype16 = networkConnectionInfo$MobileSubtype;
        n15 = 16;
        networkConnectionInfo$MobileSubtypeArray = new NetworkConnectionInfo$MobileSubtype("GSM", n15, n15);
        GSM = networkConnectionInfo$MobileSubtypeArray;
        NetworkConnectionInfo$MobileSubtype[] networkConnectionInfo$MobileSubtypeArray3 = networkConnectionInfo$MobileSubtypeArray;
        n4 = 17;
        TD_SCDMA = networkConnectionInfo$MobileSubtype2 = new NetworkConnectionInfo$MobileSubtype("TD_SCDMA", n4, n4);
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype17 = networkConnectionInfo$MobileSubtype2;
        n3 = 18;
        IWLAN = networkConnectionInfo$MobileSubtype = new NetworkConnectionInfo$MobileSubtype("IWLAN", n3, n3);
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype18 = networkConnectionInfo$MobileSubtype;
        n15 = 19;
        networkConnectionInfo$MobileSubtypeArray = new NetworkConnectionInfo$MobileSubtype("LTE_CA", n15, n15);
        LTE_CA = networkConnectionInfo$MobileSubtypeArray;
        n15 = 20;
        NetworkConnectionInfo$MobileSubtype[] networkConnectionInfo$MobileSubtypeArray4 = networkConnectionInfo$MobileSubtypeArray;
        COMBINED = networkConnectionInfo$MobileSubtype2 = new NetworkConnectionInfo$MobileSubtype("COMBINED", n15, 100);
        networkConnectionInfo$MobileSubtypeArray = new NetworkConnectionInfo$MobileSubtype[21];
        networkConnectionInfo$MobileSubtypeArray[0] = object;
        networkConnectionInfo$MobileSubtypeArray[1] = networkConnectionInfo$MobileSubtype14;
        networkConnectionInfo$MobileSubtypeArray[2] = networkConnectionInfo$MobileSubtype13;
        networkConnectionInfo$MobileSubtypeArray[3] = networkConnectionInfo$MobileSubtype12;
        networkConnectionInfo$MobileSubtypeArray[4] = networkConnectionInfo$MobileSubtype11;
        networkConnectionInfo$MobileSubtypeArray[5] = networkConnectionInfo$MobileSubtype10;
        networkConnectionInfo$MobileSubtypeArray[6] = networkConnectionInfo$MobileSubtype9;
        networkConnectionInfo$MobileSubtypeArray[7] = networkConnectionInfo$MobileSubtype8;
        networkConnectionInfo$MobileSubtypeArray[8] = networkConnectionInfo$MobileSubtype7;
        networkConnectionInfo$MobileSubtypeArray[9] = networkConnectionInfo$MobileSubtype6;
        networkConnectionInfo$MobileSubtypeArray[10] = networkConnectionInfo$MobileSubtype5;
        networkConnectionInfo$MobileSubtypeArray[11] = networkConnectionInfo$MobileSubtype4;
        networkConnectionInfo$MobileSubtypeArray[12] = networkConnectionInfo$MobileSubtype3;
        networkConnectionInfo$MobileSubtypeArray[13] = networkConnectionInfo$MobileSubtypeArray2;
        networkConnectionInfo$MobileSubtypeArray[14] = networkConnectionInfo$MobileSubtype15;
        networkConnectionInfo$MobileSubtypeArray[15] = networkConnectionInfo$MobileSubtype16;
        networkConnectionInfo$MobileSubtypeArray[16] = networkConnectionInfo$MobileSubtypeArray3;
        networkConnectionInfo$MobileSubtypeArray[17] = networkConnectionInfo$MobileSubtype17;
        networkConnectionInfo$MobileSubtypeArray[18] = networkConnectionInfo$MobileSubtype;
        networkConnectionInfo$MobileSubtypeArray[19] = networkConnectionInfo$MobileSubtypeArray4;
        networkConnectionInfo$MobileSubtypeArray[n15] = networkConnectionInfo$MobileSubtype2;
        $VALUES = networkConnectionInfo$MobileSubtypeArray;
        networkConnectionInfo$MobileSubtype = new SparseArray();
        valueMap = networkConnectionInfo$MobileSubtype;
        networkConnectionInfo$MobileSubtype.put(0, object);
        networkConnectionInfo$MobileSubtype.put(1, (Object)networkConnectionInfo$MobileSubtype14);
        networkConnectionInfo$MobileSubtype.put(2, (Object)networkConnectionInfo$MobileSubtype13);
        networkConnectionInfo$MobileSubtype.put(3, (Object)networkConnectionInfo$MobileSubtype12);
        networkConnectionInfo$MobileSubtype.put(4, (Object)networkConnectionInfo$MobileSubtype11);
        networkConnectionInfo$MobileSubtype.put(5, (Object)networkConnectionInfo$MobileSubtype10);
        networkConnectionInfo$MobileSubtype.put(6, (Object)networkConnectionInfo$MobileSubtype9);
        networkConnectionInfo$MobileSubtype.put(7, (Object)networkConnectionInfo$MobileSubtype8);
        networkConnectionInfo$MobileSubtype.put(8, (Object)networkConnectionInfo$MobileSubtype7);
        networkConnectionInfo$MobileSubtype.put(9, (Object)networkConnectionInfo$MobileSubtype6);
        networkConnectionInfo$MobileSubtype.put(10, (Object)networkConnectionInfo$MobileSubtype5);
        networkConnectionInfo$MobileSubtype.put(11, (Object)networkConnectionInfo$MobileSubtype4);
        object = networkConnectionInfo$MobileSubtype3;
        networkConnectionInfo$MobileSubtype.put(12, (Object)networkConnectionInfo$MobileSubtype3);
        object = networkConnectionInfo$MobileSubtypeArray2;
        networkConnectionInfo$MobileSubtype.put(13, networkConnectionInfo$MobileSubtypeArray2);
        object = networkConnectionInfo$MobileSubtype15;
        networkConnectionInfo$MobileSubtype.put(14, (Object)networkConnectionInfo$MobileSubtype15);
        object = networkConnectionInfo$MobileSubtype16;
        networkConnectionInfo$MobileSubtype.put(15, (Object)networkConnectionInfo$MobileSubtype16);
        object = networkConnectionInfo$MobileSubtypeArray3;
        networkConnectionInfo$MobileSubtype.put(16, networkConnectionInfo$MobileSubtypeArray3);
        object = networkConnectionInfo$MobileSubtype17;
        networkConnectionInfo$MobileSubtype.put(17, (Object)networkConnectionInfo$MobileSubtype17);
        object = networkConnectionInfo$MobileSubtype18;
        networkConnectionInfo$MobileSubtype.put(18, (Object)networkConnectionInfo$MobileSubtype18);
        object = networkConnectionInfo$MobileSubtypeArray4;
        networkConnectionInfo$MobileSubtype.put(19, networkConnectionInfo$MobileSubtypeArray4);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private NetworkConnectionInfo$MobileSubtype() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static NetworkConnectionInfo$MobileSubtype forNumber(int n3) {
        return (NetworkConnectionInfo$MobileSubtype)((Object)valueMap.get(n3));
    }

    public static NetworkConnectionInfo$MobileSubtype valueOf(String string2) {
        return Enum.valueOf(NetworkConnectionInfo$MobileSubtype.class, string2);
    }

    public static NetworkConnectionInfo$MobileSubtype[] values() {
        return (NetworkConnectionInfo$MobileSubtype[])$VALUES.clone();
    }

    public int getValue() {
        return this.value;
    }
}

