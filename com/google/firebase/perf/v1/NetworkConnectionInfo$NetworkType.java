/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.NetworkConnectionInfo$NetworkType$1;
import com.google.firebase.perf.v1.NetworkConnectionInfo$NetworkType$NetworkTypeVerifier;
import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;

public final class NetworkConnectionInfo$NetworkType
extends Enum
implements Internal$EnumLite {
    private static final /* synthetic */ NetworkConnectionInfo$NetworkType[] $VALUES;
    public static final /* enum */ NetworkConnectionInfo$NetworkType BLUETOOTH;
    public static final int BLUETOOTH_VALUE = 7;
    public static final /* enum */ NetworkConnectionInfo$NetworkType DUMMY;
    public static final int DUMMY_VALUE = 8;
    public static final /* enum */ NetworkConnectionInfo$NetworkType ETHERNET;
    public static final int ETHERNET_VALUE = 9;
    public static final /* enum */ NetworkConnectionInfo$NetworkType MOBILE;
    public static final /* enum */ NetworkConnectionInfo$NetworkType MOBILE_CBS;
    public static final int MOBILE_CBS_VALUE = 12;
    public static final /* enum */ NetworkConnectionInfo$NetworkType MOBILE_DUN;
    public static final int MOBILE_DUN_VALUE = 4;
    public static final /* enum */ NetworkConnectionInfo$NetworkType MOBILE_EMERGENCY;
    public static final int MOBILE_EMERGENCY_VALUE = 15;
    public static final /* enum */ NetworkConnectionInfo$NetworkType MOBILE_FOTA;
    public static final int MOBILE_FOTA_VALUE = 10;
    public static final /* enum */ NetworkConnectionInfo$NetworkType MOBILE_HIPRI;
    public static final int MOBILE_HIPRI_VALUE = 5;
    public static final /* enum */ NetworkConnectionInfo$NetworkType MOBILE_IA;
    public static final int MOBILE_IA_VALUE = 14;
    public static final /* enum */ NetworkConnectionInfo$NetworkType MOBILE_IMS;
    public static final int MOBILE_IMS_VALUE = 11;
    public static final /* enum */ NetworkConnectionInfo$NetworkType MOBILE_MMS;
    public static final int MOBILE_MMS_VALUE = 2;
    public static final /* enum */ NetworkConnectionInfo$NetworkType MOBILE_SUPL;
    public static final int MOBILE_SUPL_VALUE = 3;
    public static final int MOBILE_VALUE = 0;
    public static final /* enum */ NetworkConnectionInfo$NetworkType NONE;
    public static final int NONE_VALUE = 255;
    public static final /* enum */ NetworkConnectionInfo$NetworkType PROXY;
    public static final int PROXY_VALUE = 16;
    public static final /* enum */ NetworkConnectionInfo$NetworkType VPN;
    public static final int VPN_VALUE = 17;
    public static final /* enum */ NetworkConnectionInfo$NetworkType WIFI;
    public static final /* enum */ NetworkConnectionInfo$NetworkType WIFI_P2P;
    public static final int WIFI_P2P_VALUE = 13;
    public static final int WIFI_VALUE = 1;
    public static final /* enum */ NetworkConnectionInfo$NetworkType WIMAX;
    public static final int WIMAX_VALUE = 6;
    private static final Internal$EnumLiteMap internalValueMap;
    private final int value;

    private static /* synthetic */ NetworkConnectionInfo$NetworkType[] $values() {
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType = NONE;
        networkConnectionInfo$NetworkType = MOBILE;
        networkConnectionInfo$NetworkType = WIFI;
        networkConnectionInfo$NetworkType = MOBILE_MMS;
        networkConnectionInfo$NetworkType = MOBILE_SUPL;
        networkConnectionInfo$NetworkType = MOBILE_DUN;
        networkConnectionInfo$NetworkType = MOBILE_HIPRI;
        networkConnectionInfo$NetworkType = WIMAX;
        networkConnectionInfo$NetworkType = BLUETOOTH;
        networkConnectionInfo$NetworkType = DUMMY;
        networkConnectionInfo$NetworkType = ETHERNET;
        networkConnectionInfo$NetworkType = MOBILE_FOTA;
        networkConnectionInfo$NetworkType = MOBILE_IMS;
        networkConnectionInfo$NetworkType = MOBILE_CBS;
        networkConnectionInfo$NetworkType = WIFI_P2P;
        networkConnectionInfo$NetworkType = MOBILE_IA;
        networkConnectionInfo$NetworkType = MOBILE_EMERGENCY;
        networkConnectionInfo$NetworkType = PROXY;
        networkConnectionInfo$NetworkType = VPN;
        NetworkConnectionInfo$NetworkType[] networkConnectionInfo$NetworkTypeArray = new NetworkConnectionInfo$NetworkType[]{networkConnectionInfo$NetworkType, networkConnectionInfo$NetworkType, networkConnectionInfo$NetworkType, networkConnectionInfo$NetworkType, networkConnectionInfo$NetworkType, networkConnectionInfo$NetworkType, networkConnectionInfo$NetworkType, networkConnectionInfo$NetworkType, networkConnectionInfo$NetworkType, networkConnectionInfo$NetworkType, networkConnectionInfo$NetworkType, networkConnectionInfo$NetworkType, networkConnectionInfo$NetworkType, networkConnectionInfo$NetworkType, networkConnectionInfo$NetworkType, networkConnectionInfo$NetworkType, networkConnectionInfo$NetworkType, networkConnectionInfo$NetworkType, networkConnectionInfo$NetworkType};
        return networkConnectionInfo$NetworkTypeArray;
    }

    static {
        Object object = new NetworkConnectionInfo$NetworkType("NONE", 0, -1);
        NONE = object;
        int n3 = 1;
        object = new NetworkConnectionInfo$NetworkType("MOBILE", n3, 0);
        MOBILE = object;
        int n4 = 2;
        object = new NetworkConnectionInfo$NetworkType("WIFI", n4, n3);
        WIFI = object;
        n3 = 3;
        object = new NetworkConnectionInfo$NetworkType("MOBILE_MMS", n3, n4);
        MOBILE_MMS = object;
        n4 = 4;
        object = new NetworkConnectionInfo$NetworkType("MOBILE_SUPL", n4, n3);
        MOBILE_SUPL = object;
        n3 = 5;
        object = new NetworkConnectionInfo$NetworkType("MOBILE_DUN", n3, n4);
        MOBILE_DUN = object;
        n4 = 6;
        object = new NetworkConnectionInfo$NetworkType("MOBILE_HIPRI", n4, n3);
        MOBILE_HIPRI = object;
        n3 = 7;
        object = new NetworkConnectionInfo$NetworkType("WIMAX", n3, n4);
        WIMAX = object;
        n4 = 8;
        object = new NetworkConnectionInfo$NetworkType("BLUETOOTH", n4, n3);
        BLUETOOTH = object;
        n3 = 9;
        object = new NetworkConnectionInfo$NetworkType("DUMMY", n3, n4);
        DUMMY = object;
        n4 = 10;
        object = new NetworkConnectionInfo$NetworkType("ETHERNET", n4, n3);
        ETHERNET = object;
        n3 = 11;
        object = new NetworkConnectionInfo$NetworkType("MOBILE_FOTA", n3, n4);
        MOBILE_FOTA = object;
        n4 = 12;
        object = new NetworkConnectionInfo$NetworkType("MOBILE_IMS", n4, n3);
        MOBILE_IMS = object;
        n3 = 13;
        object = new NetworkConnectionInfo$NetworkType("MOBILE_CBS", n3, n4);
        MOBILE_CBS = object;
        n4 = 14;
        object = new NetworkConnectionInfo$NetworkType("WIFI_P2P", n4, n3);
        WIFI_P2P = object;
        n3 = 15;
        object = new NetworkConnectionInfo$NetworkType("MOBILE_IA", n3, n4);
        MOBILE_IA = object;
        n4 = 16;
        object = new NetworkConnectionInfo$NetworkType("MOBILE_EMERGENCY", n4, n3);
        MOBILE_EMERGENCY = object;
        n3 = 17;
        object = new NetworkConnectionInfo$NetworkType("PROXY", n3, n4);
        PROXY = object;
        object = new NetworkConnectionInfo$NetworkType("VPN", 18, n3);
        VPN = object;
        $VALUES = NetworkConnectionInfo$NetworkType.$values();
        internalValueMap = object = new NetworkConnectionInfo$NetworkType$1();
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
        switch (n3) {
            default: {
                return null;
            }
            case 17: {
                return VPN;
            }
            case 16: {
                return PROXY;
            }
            case 15: {
                return MOBILE_EMERGENCY;
            }
            case 14: {
                return MOBILE_IA;
            }
            case 13: {
                return WIFI_P2P;
            }
            case 12: {
                return MOBILE_CBS;
            }
            case 11: {
                return MOBILE_IMS;
            }
            case 10: {
                return MOBILE_FOTA;
            }
            case 9: {
                return ETHERNET;
            }
            case 8: {
                return DUMMY;
            }
            case 7: {
                return BLUETOOTH;
            }
            case 6: {
                return WIMAX;
            }
            case 5: {
                return MOBILE_HIPRI;
            }
            case 4: {
                return MOBILE_DUN;
            }
            case 3: {
                return MOBILE_SUPL;
            }
            case 2: {
                return MOBILE_MMS;
            }
            case 1: {
                return WIFI;
            }
            case 0: {
                return MOBILE;
            }
            case -1: 
        }
        return NONE;
    }

    public static Internal$EnumLiteMap internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal$EnumVerifier internalGetVerifier() {
        return NetworkConnectionInfo$NetworkType$NetworkTypeVerifier.INSTANCE;
    }

    public static NetworkConnectionInfo$NetworkType valueOf(int n3) {
        return NetworkConnectionInfo$NetworkType.forNumber(n3);
    }

    public static NetworkConnectionInfo$NetworkType valueOf(String string2) {
        return Enum.valueOf(NetworkConnectionInfo$NetworkType.class, string2);
    }

    public static NetworkConnectionInfo$NetworkType[] values() {
        return (NetworkConnectionInfo$NetworkType[])$VALUES.clone();
    }

    public final int getNumber() {
        return this.value;
    }
}

