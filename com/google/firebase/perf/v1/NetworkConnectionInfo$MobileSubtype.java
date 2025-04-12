/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.NetworkConnectionInfo$MobileSubtype$1;
import com.google.firebase.perf.v1.NetworkConnectionInfo$MobileSubtype$MobileSubtypeVerifier;
import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;

public final class NetworkConnectionInfo$MobileSubtype
extends Enum
implements Internal$EnumLite {
    private static final /* synthetic */ NetworkConnectionInfo$MobileSubtype[] $VALUES;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype CDMA;
    public static final int CDMA_VALUE = 4;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype COMBINED;
    public static final int COMBINED_VALUE = 100;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype EDGE;
    public static final int EDGE_VALUE = 2;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype EHRPD;
    public static final int EHRPD_VALUE = 14;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype EVDO_0;
    public static final int EVDO_0_VALUE = 5;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype EVDO_A;
    public static final int EVDO_A_VALUE = 6;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype EVDO_B;
    public static final int EVDO_B_VALUE = 12;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype GPRS;
    public static final int GPRS_VALUE = 1;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype GSM;
    public static final int GSM_VALUE = 16;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype HSDPA;
    public static final int HSDPA_VALUE = 8;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype HSPA;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype HSPAP;
    public static final int HSPAP_VALUE = 15;
    public static final int HSPA_VALUE = 10;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype HSUPA;
    public static final int HSUPA_VALUE = 9;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype IDEN;
    public static final int IDEN_VALUE = 11;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype IWLAN;
    public static final int IWLAN_VALUE = 18;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype LTE;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype LTE_CA;
    public static final int LTE_CA_VALUE = 19;
    public static final int LTE_VALUE = 13;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype RTT;
    public static final int RTT_VALUE = 7;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype TD_SCDMA;
    public static final int TD_SCDMA_VALUE = 17;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype UMTS;
    public static final int UMTS_VALUE = 3;
    public static final /* enum */ NetworkConnectionInfo$MobileSubtype UNKNOWN_MOBILE_SUBTYPE;
    public static final int UNKNOWN_MOBILE_SUBTYPE_VALUE;
    private static final Internal$EnumLiteMap internalValueMap;
    private final int value;

    private static /* synthetic */ NetworkConnectionInfo$MobileSubtype[] $values() {
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype = UNKNOWN_MOBILE_SUBTYPE;
        networkConnectionInfo$MobileSubtype = GPRS;
        networkConnectionInfo$MobileSubtype = EDGE;
        networkConnectionInfo$MobileSubtype = UMTS;
        networkConnectionInfo$MobileSubtype = CDMA;
        networkConnectionInfo$MobileSubtype = EVDO_0;
        networkConnectionInfo$MobileSubtype = EVDO_A;
        networkConnectionInfo$MobileSubtype = RTT;
        networkConnectionInfo$MobileSubtype = HSDPA;
        networkConnectionInfo$MobileSubtype = HSUPA;
        networkConnectionInfo$MobileSubtype = HSPA;
        networkConnectionInfo$MobileSubtype = IDEN;
        networkConnectionInfo$MobileSubtype = EVDO_B;
        networkConnectionInfo$MobileSubtype = LTE;
        networkConnectionInfo$MobileSubtype = EHRPD;
        networkConnectionInfo$MobileSubtype = HSPAP;
        networkConnectionInfo$MobileSubtype = GSM;
        networkConnectionInfo$MobileSubtype = TD_SCDMA;
        networkConnectionInfo$MobileSubtype = IWLAN;
        networkConnectionInfo$MobileSubtype = LTE_CA;
        networkConnectionInfo$MobileSubtype = COMBINED;
        NetworkConnectionInfo$MobileSubtype[] networkConnectionInfo$MobileSubtypeArray = new NetworkConnectionInfo$MobileSubtype[]{networkConnectionInfo$MobileSubtype, networkConnectionInfo$MobileSubtype, networkConnectionInfo$MobileSubtype, networkConnectionInfo$MobileSubtype, networkConnectionInfo$MobileSubtype, networkConnectionInfo$MobileSubtype, networkConnectionInfo$MobileSubtype, networkConnectionInfo$MobileSubtype, networkConnectionInfo$MobileSubtype, networkConnectionInfo$MobileSubtype, networkConnectionInfo$MobileSubtype, networkConnectionInfo$MobileSubtype, networkConnectionInfo$MobileSubtype, networkConnectionInfo$MobileSubtype, networkConnectionInfo$MobileSubtype, networkConnectionInfo$MobileSubtype, networkConnectionInfo$MobileSubtype, networkConnectionInfo$MobileSubtype, networkConnectionInfo$MobileSubtype, networkConnectionInfo$MobileSubtype, networkConnectionInfo$MobileSubtype};
        return networkConnectionInfo$MobileSubtypeArray;
    }

    static {
        Object object = new NetworkConnectionInfo$MobileSubtype("UNKNOWN_MOBILE_SUBTYPE", 0, 0);
        UNKNOWN_MOBILE_SUBTYPE = object;
        int n3 = 1;
        object = new NetworkConnectionInfo$MobileSubtype("GPRS", n3, n3);
        GPRS = object;
        n3 = 2;
        object = new NetworkConnectionInfo$MobileSubtype("EDGE", n3, n3);
        EDGE = object;
        n3 = 3;
        object = new NetworkConnectionInfo$MobileSubtype("UMTS", n3, n3);
        UMTS = object;
        n3 = 4;
        object = new NetworkConnectionInfo$MobileSubtype("CDMA", n3, n3);
        CDMA = object;
        n3 = 5;
        object = new NetworkConnectionInfo$MobileSubtype("EVDO_0", n3, n3);
        EVDO_0 = object;
        n3 = 6;
        object = new NetworkConnectionInfo$MobileSubtype("EVDO_A", n3, n3);
        EVDO_A = object;
        n3 = 7;
        object = new NetworkConnectionInfo$MobileSubtype("RTT", n3, n3);
        RTT = object;
        n3 = 8;
        object = new NetworkConnectionInfo$MobileSubtype("HSDPA", n3, n3);
        HSDPA = object;
        n3 = 9;
        object = new NetworkConnectionInfo$MobileSubtype("HSUPA", n3, n3);
        HSUPA = object;
        n3 = 10;
        object = new NetworkConnectionInfo$MobileSubtype("HSPA", n3, n3);
        HSPA = object;
        n3 = 11;
        object = new NetworkConnectionInfo$MobileSubtype("IDEN", n3, n3);
        IDEN = object;
        n3 = 12;
        object = new NetworkConnectionInfo$MobileSubtype("EVDO_B", n3, n3);
        EVDO_B = object;
        n3 = 13;
        object = new NetworkConnectionInfo$MobileSubtype("LTE", n3, n3);
        LTE = object;
        n3 = 14;
        object = new NetworkConnectionInfo$MobileSubtype("EHRPD", n3, n3);
        EHRPD = object;
        n3 = 15;
        object = new NetworkConnectionInfo$MobileSubtype("HSPAP", n3, n3);
        HSPAP = object;
        n3 = 16;
        object = new NetworkConnectionInfo$MobileSubtype("GSM", n3, n3);
        GSM = object;
        n3 = 17;
        object = new NetworkConnectionInfo$MobileSubtype("TD_SCDMA", n3, n3);
        TD_SCDMA = object;
        n3 = 18;
        object = new NetworkConnectionInfo$MobileSubtype("IWLAN", n3, n3);
        IWLAN = object;
        n3 = 19;
        object = new NetworkConnectionInfo$MobileSubtype("LTE_CA", n3, n3);
        LTE_CA = object;
        object = new NetworkConnectionInfo$MobileSubtype("COMBINED", 20, 100);
        COMBINED = object;
        $VALUES = NetworkConnectionInfo$MobileSubtype.$values();
        internalValueMap = object = new NetworkConnectionInfo$MobileSubtype$1();
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
        int n4 = 100;
        if (n3 != n4) {
            switch (n3) {
                default: {
                    return null;
                }
                case 19: {
                    return LTE_CA;
                }
                case 18: {
                    return IWLAN;
                }
                case 17: {
                    return TD_SCDMA;
                }
                case 16: {
                    return GSM;
                }
                case 15: {
                    return HSPAP;
                }
                case 14: {
                    return EHRPD;
                }
                case 13: {
                    return LTE;
                }
                case 12: {
                    return EVDO_B;
                }
                case 11: {
                    return IDEN;
                }
                case 10: {
                    return HSPA;
                }
                case 9: {
                    return HSUPA;
                }
                case 8: {
                    return HSDPA;
                }
                case 7: {
                    return RTT;
                }
                case 6: {
                    return EVDO_A;
                }
                case 5: {
                    return EVDO_0;
                }
                case 4: {
                    return CDMA;
                }
                case 3: {
                    return UMTS;
                }
                case 2: {
                    return EDGE;
                }
                case 1: {
                    return GPRS;
                }
                case 0: 
            }
            return UNKNOWN_MOBILE_SUBTYPE;
        }
        return COMBINED;
    }

    public static Internal$EnumLiteMap internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal$EnumVerifier internalGetVerifier() {
        return NetworkConnectionInfo$MobileSubtype$MobileSubtypeVerifier.INSTANCE;
    }

    public static NetworkConnectionInfo$MobileSubtype valueOf(int n3) {
        return NetworkConnectionInfo$MobileSubtype.forNumber(n3);
    }

    public static NetworkConnectionInfo$MobileSubtype valueOf(String string2) {
        return Enum.valueOf(NetworkConnectionInfo$MobileSubtype.class, string2);
    }

    public static NetworkConnectionInfo$MobileSubtype[] values() {
        return (NetworkConnectionInfo$MobileSubtype[])$VALUES.clone();
    }

    public final int getNumber() {
        return this.value;
    }
}

