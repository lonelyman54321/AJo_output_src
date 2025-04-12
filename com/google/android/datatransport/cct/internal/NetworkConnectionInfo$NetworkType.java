/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;

public final class NetworkConnectionInfo$NetworkType
extends Enum {
    private static final /* synthetic */ NetworkConnectionInfo$NetworkType[] $VALUES;
    public static final /* enum */ NetworkConnectionInfo$NetworkType BLUETOOTH;
    public static final /* enum */ NetworkConnectionInfo$NetworkType DUMMY;
    public static final /* enum */ NetworkConnectionInfo$NetworkType ETHERNET;
    public static final /* enum */ NetworkConnectionInfo$NetworkType MOBILE;
    public static final /* enum */ NetworkConnectionInfo$NetworkType MOBILE_CBS;
    public static final /* enum */ NetworkConnectionInfo$NetworkType MOBILE_DUN;
    public static final /* enum */ NetworkConnectionInfo$NetworkType MOBILE_EMERGENCY;
    public static final /* enum */ NetworkConnectionInfo$NetworkType MOBILE_FOTA;
    public static final /* enum */ NetworkConnectionInfo$NetworkType MOBILE_HIPRI;
    public static final /* enum */ NetworkConnectionInfo$NetworkType MOBILE_IA;
    public static final /* enum */ NetworkConnectionInfo$NetworkType MOBILE_IMS;
    public static final /* enum */ NetworkConnectionInfo$NetworkType MOBILE_MMS;
    public static final /* enum */ NetworkConnectionInfo$NetworkType MOBILE_SUPL;
    public static final /* enum */ NetworkConnectionInfo$NetworkType NONE;
    public static final /* enum */ NetworkConnectionInfo$NetworkType PROXY;
    public static final /* enum */ NetworkConnectionInfo$NetworkType VPN;
    public static final /* enum */ NetworkConnectionInfo$NetworkType WIFI;
    public static final /* enum */ NetworkConnectionInfo$NetworkType WIFI_P2P;
    public static final /* enum */ NetworkConnectionInfo$NetworkType WIMAX;
    private static final SparseArray valueMap;
    private final int value;

    static {
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType;
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType2;
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType3;
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType4;
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType5;
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType6;
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType7;
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType8;
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType9;
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType10;
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType11;
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType12;
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType13;
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType14;
        Object object = new NetworkConnectionInfo$NetworkType("MOBILE", 0, 0);
        MOBILE = object;
        int n3 = 1;
        WIFI = networkConnectionInfo$NetworkType14 = new NetworkConnectionInfo$NetworkType("WIFI", n3, n3);
        int n4 = 2;
        MOBILE_MMS = networkConnectionInfo$NetworkType13 = new NetworkConnectionInfo$NetworkType("MOBILE_MMS", n4, n4);
        int n7 = 3;
        MOBILE_SUPL = networkConnectionInfo$NetworkType12 = new NetworkConnectionInfo$NetworkType("MOBILE_SUPL", n7, n7);
        int n8 = 4;
        MOBILE_DUN = networkConnectionInfo$NetworkType11 = new NetworkConnectionInfo$NetworkType("MOBILE_DUN", n8, n8);
        int n10 = 5;
        MOBILE_HIPRI = networkConnectionInfo$NetworkType10 = new NetworkConnectionInfo$NetworkType("MOBILE_HIPRI", n10, n10);
        int n14 = 6;
        WIMAX = networkConnectionInfo$NetworkType9 = new NetworkConnectionInfo$NetworkType("WIMAX", n14, n14);
        n14 = 7;
        BLUETOOTH = networkConnectionInfo$NetworkType8 = new NetworkConnectionInfo$NetworkType("BLUETOOTH", n14, n14);
        n10 = 8;
        DUMMY = networkConnectionInfo$NetworkType7 = new NetworkConnectionInfo$NetworkType("DUMMY", n10, n10);
        n8 = 9;
        ETHERNET = networkConnectionInfo$NetworkType6 = new NetworkConnectionInfo$NetworkType("ETHERNET", n8, n8);
        n7 = 10;
        MOBILE_FOTA = networkConnectionInfo$NetworkType5 = new NetworkConnectionInfo$NetworkType("MOBILE_FOTA", n7, n7);
        n4 = 11;
        MOBILE_IMS = networkConnectionInfo$NetworkType4 = new NetworkConnectionInfo$NetworkType("MOBILE_IMS", n4, n4);
        n3 = 12;
        MOBILE_CBS = networkConnectionInfo$NetworkType3 = new NetworkConnectionInfo$NetworkType("MOBILE_CBS", n3, n3);
        int n15 = 13;
        NetworkConnectionInfo$NetworkType[] networkConnectionInfo$NetworkTypeArray = new NetworkConnectionInfo$NetworkType("WIFI_P2P", n15, n15);
        WIFI_P2P = networkConnectionInfo$NetworkTypeArray;
        NetworkConnectionInfo$NetworkType[] networkConnectionInfo$NetworkTypeArray2 = networkConnectionInfo$NetworkTypeArray;
        n4 = 14;
        MOBILE_IA = networkConnectionInfo$NetworkType2 = new NetworkConnectionInfo$NetworkType("MOBILE_IA", n4, n4);
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType15 = networkConnectionInfo$NetworkType2;
        n3 = 15;
        MOBILE_EMERGENCY = networkConnectionInfo$NetworkType = new NetworkConnectionInfo$NetworkType("MOBILE_EMERGENCY", n3, n3);
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType16 = networkConnectionInfo$NetworkType;
        n15 = 16;
        networkConnectionInfo$NetworkTypeArray = new NetworkConnectionInfo$NetworkType("PROXY", n15, n15);
        PROXY = networkConnectionInfo$NetworkTypeArray;
        NetworkConnectionInfo$NetworkType[] networkConnectionInfo$NetworkTypeArray3 = networkConnectionInfo$NetworkTypeArray;
        n4 = 17;
        VPN = networkConnectionInfo$NetworkType2 = new NetworkConnectionInfo$NetworkType("VPN", n4, n4);
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType17 = networkConnectionInfo$NetworkType2;
        n3 = 18;
        n7 = -1;
        NONE = networkConnectionInfo$NetworkType = new NetworkConnectionInfo$NetworkType("NONE", n3, n7);
        networkConnectionInfo$NetworkTypeArray = new NetworkConnectionInfo$NetworkType[19];
        networkConnectionInfo$NetworkTypeArray[0] = object;
        networkConnectionInfo$NetworkTypeArray[1] = networkConnectionInfo$NetworkType14;
        networkConnectionInfo$NetworkTypeArray[2] = networkConnectionInfo$NetworkType13;
        networkConnectionInfo$NetworkTypeArray[3] = networkConnectionInfo$NetworkType12;
        networkConnectionInfo$NetworkTypeArray[4] = networkConnectionInfo$NetworkType11;
        networkConnectionInfo$NetworkTypeArray[5] = networkConnectionInfo$NetworkType10;
        networkConnectionInfo$NetworkTypeArray[6] = networkConnectionInfo$NetworkType9;
        networkConnectionInfo$NetworkTypeArray[7] = networkConnectionInfo$NetworkType8;
        networkConnectionInfo$NetworkTypeArray[8] = networkConnectionInfo$NetworkType7;
        networkConnectionInfo$NetworkTypeArray[9] = networkConnectionInfo$NetworkType6;
        networkConnectionInfo$NetworkTypeArray[10] = networkConnectionInfo$NetworkType5;
        networkConnectionInfo$NetworkTypeArray[11] = networkConnectionInfo$NetworkType4;
        networkConnectionInfo$NetworkTypeArray[12] = networkConnectionInfo$NetworkType3;
        networkConnectionInfo$NetworkTypeArray[13] = networkConnectionInfo$NetworkTypeArray2;
        networkConnectionInfo$NetworkTypeArray[14] = networkConnectionInfo$NetworkType15;
        networkConnectionInfo$NetworkTypeArray[15] = networkConnectionInfo$NetworkType16;
        networkConnectionInfo$NetworkTypeArray[16] = networkConnectionInfo$NetworkTypeArray3;
        networkConnectionInfo$NetworkTypeArray[17] = networkConnectionInfo$NetworkType2;
        networkConnectionInfo$NetworkTypeArray[n3] = networkConnectionInfo$NetworkType;
        $VALUES = networkConnectionInfo$NetworkTypeArray;
        networkConnectionInfo$NetworkType2 = new SparseArray();
        valueMap = networkConnectionInfo$NetworkType2;
        networkConnectionInfo$NetworkType2.put(0, object);
        networkConnectionInfo$NetworkType2.put(1, (Object)networkConnectionInfo$NetworkType14);
        networkConnectionInfo$NetworkType2.put(2, (Object)networkConnectionInfo$NetworkType13);
        networkConnectionInfo$NetworkType2.put(3, (Object)networkConnectionInfo$NetworkType12);
        networkConnectionInfo$NetworkType2.put(4, (Object)networkConnectionInfo$NetworkType11);
        networkConnectionInfo$NetworkType2.put(5, (Object)networkConnectionInfo$NetworkType10);
        networkConnectionInfo$NetworkType2.put(6, (Object)networkConnectionInfo$NetworkType9);
        networkConnectionInfo$NetworkType2.put(7, (Object)networkConnectionInfo$NetworkType8);
        networkConnectionInfo$NetworkType2.put(8, (Object)networkConnectionInfo$NetworkType7);
        networkConnectionInfo$NetworkType2.put(9, (Object)networkConnectionInfo$NetworkType6);
        networkConnectionInfo$NetworkType2.put(10, (Object)networkConnectionInfo$NetworkType5);
        networkConnectionInfo$NetworkType2.put(11, (Object)networkConnectionInfo$NetworkType4);
        object = networkConnectionInfo$NetworkType3;
        networkConnectionInfo$NetworkType2.put(12, (Object)networkConnectionInfo$NetworkType3);
        object = networkConnectionInfo$NetworkTypeArray2;
        networkConnectionInfo$NetworkType2.put(13, networkConnectionInfo$NetworkTypeArray2);
        object = networkConnectionInfo$NetworkType15;
        networkConnectionInfo$NetworkType2.put(14, (Object)networkConnectionInfo$NetworkType15);
        object = networkConnectionInfo$NetworkType16;
        networkConnectionInfo$NetworkType2.put(15, (Object)networkConnectionInfo$NetworkType16);
        object = networkConnectionInfo$NetworkTypeArray3;
        networkConnectionInfo$NetworkType2.put(16, networkConnectionInfo$NetworkTypeArray3);
        object = networkConnectionInfo$NetworkType17;
        networkConnectionInfo$NetworkType2.put(17, (Object)networkConnectionInfo$NetworkType17);
        networkConnectionInfo$NetworkType2.put(n7, (Object)networkConnectionInfo$NetworkType);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private NetworkConnectionInfo$NetworkType() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static NetworkConnectionInfo$NetworkType forNumber(int n3) {
        return (NetworkConnectionInfo$NetworkType)((Object)valueMap.get(n3));
    }

    public static NetworkConnectionInfo$NetworkType valueOf(String string2) {
        return Enum.valueOf(NetworkConnectionInfo$NetworkType.class, string2);
    }

    public static NetworkConnectionInfo$NetworkType[] values() {
        return (NetworkConnectionInfo$NetworkType[])$VALUES.clone();
    }

    public int getValue() {
        return this.value;
    }
}

