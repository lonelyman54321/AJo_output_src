/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcj;
import com.google.android.gms.internal.clearcut.zzck;
import com.google.android.gms.internal.clearcut.zzgp;

public final class zzge$zzs$zzc
extends Enum
implements zzcj {
    private static final /* enum */ zzge$zzs$zzc zzbfz;
    private static final /* enum */ zzge$zzs$zzc zzbga;
    private static final /* enum */ zzge$zzs$zzc zzbgb;
    private static final /* enum */ zzge$zzs$zzc zzbgc;
    private static final /* enum */ zzge$zzs$zzc zzbgd;
    private static final /* enum */ zzge$zzs$zzc zzbge;
    private static final /* enum */ zzge$zzs$zzc zzbgf;
    private static final /* enum */ zzge$zzs$zzc zzbgg;
    private static final /* enum */ zzge$zzs$zzc zzbgh;
    private static final /* enum */ zzge$zzs$zzc zzbgi;
    private static final /* enum */ zzge$zzs$zzc zzbgj;
    private static final /* enum */ zzge$zzs$zzc zzbgk;
    private static final /* enum */ zzge$zzs$zzc zzbgl;
    private static final /* enum */ zzge$zzs$zzc zzbgm;
    private static final /* enum */ zzge$zzs$zzc zzbgn;
    private static final /* enum */ zzge$zzs$zzc zzbgo;
    private static final /* enum */ zzge$zzs$zzc zzbgp;
    private static final /* enum */ zzge$zzs$zzc zzbgq;
    private static final /* enum */ zzge$zzs$zzc zzbgr;
    private static final /* synthetic */ zzge$zzs$zzc[] zzbgs;
    private static final zzck zzbq;
    private final int value;

    static {
        zzge$zzs$zzc zzge$zzs$zzc;
        zzge$zzs$zzc zzge$zzs$zzc2;
        zzge$zzs$zzc zzge$zzs$zzc3;
        zzge$zzs$zzc zzge$zzs$zzc4;
        zzge$zzs$zzc zzge$zzs$zzc5;
        zzge$zzs$zzc zzge$zzs$zzc6;
        zzge$zzs$zzc zzge$zzs$zzc7;
        zzge$zzs$zzc zzge$zzs$zzc8;
        zzge$zzs$zzc zzge$zzs$zzc9;
        zzge$zzs$zzc zzge$zzs$zzc10;
        zzge$zzs$zzc zzge$zzs$zzc11;
        zzge$zzs$zzc zzge$zzs$zzc12;
        zzge$zzs$zzc zzge$zzs$zzc13;
        zzge$zzs$zzc zzge$zzs$zzc14;
        Object object = new zzge$zzs$zzc("NONE", 0, -1);
        zzbfz = object;
        int n3 = 1;
        zzbga = zzge$zzs$zzc14 = new zzge$zzs$zzc("MOBILE", n3, 0);
        int n4 = 2;
        zzbgb = zzge$zzs$zzc13 = new zzge$zzs$zzc("WIFI", n4, n3);
        int n7 = 3;
        zzbgc = zzge$zzs$zzc12 = new zzge$zzs$zzc("MOBILE_MMS", n7, n4);
        int n8 = 4;
        zzbgd = zzge$zzs$zzc11 = new zzge$zzs$zzc("MOBILE_SUPL", n8, n7);
        int n10 = 5;
        zzbge = zzge$zzs$zzc10 = new zzge$zzs$zzc("MOBILE_DUN", n10, n8);
        int n14 = 6;
        zzbgf = zzge$zzs$zzc9 = new zzge$zzs$zzc("MOBILE_HIPRI", n14, n10);
        n10 = 7;
        zzbgg = zzge$zzs$zzc8 = new zzge$zzs$zzc("WIMAX", n10, n14);
        n8 = 8;
        zzbgh = zzge$zzs$zzc7 = new zzge$zzs$zzc("BLUETOOTH", n8, n10);
        n7 = 9;
        zzbgi = zzge$zzs$zzc6 = new zzge$zzs$zzc("DUMMY", n7, n8);
        n4 = 10;
        zzbgj = zzge$zzs$zzc5 = new zzge$zzs$zzc("ETHERNET", n4, n7);
        n3 = 11;
        zzbgk = zzge$zzs$zzc4 = new zzge$zzs$zzc("MOBILE_FOTA", n3, n4);
        int n15 = 12;
        zzbgl = zzge$zzs$zzc3 = new zzge$zzs$zzc("MOBILE_IMS", n15, n3);
        zzge$zzs$zzc zzge$zzs$zzc15 = zzge$zzs$zzc3;
        n7 = 13;
        zzbgm = zzge$zzs$zzc2 = new zzge$zzs$zzc("MOBILE_CBS", n7, n15);
        zzge$zzs$zzc zzge$zzs$zzc16 = zzge$zzs$zzc2;
        n4 = 14;
        zzbgn = zzge$zzs$zzc = new zzge$zzs$zzc("WIFI_P2P", n4, n7);
        zzge$zzs$zzc zzge$zzs$zzc17 = zzge$zzs$zzc;
        n3 = 15;
        zzge$zzs$zzc[] zzge$zzs$zzcArray = new zzge$zzs$zzc("MOBILE_IA", n3, n4);
        zzbgo = zzge$zzs$zzcArray;
        zzge$zzs$zzc[] zzge$zzs$zzcArray2 = zzge$zzs$zzcArray;
        n15 = 16;
        zzbgp = zzge$zzs$zzc3 = new zzge$zzs$zzc("MOBILE_EMERGENCY", n15, n3);
        n7 = 17;
        zzbgq = zzge$zzs$zzc2 = new zzge$zzs$zzc("PROXY", n7, n15);
        n4 = 18;
        zzbgr = zzge$zzs$zzc = new zzge$zzs$zzc("VPN", n4, n7);
        zzge$zzs$zzcArray = new zzge$zzs$zzc[19];
        zzge$zzs$zzcArray[0] = object;
        zzge$zzs$zzcArray[1] = zzge$zzs$zzc14;
        zzge$zzs$zzcArray[2] = zzge$zzs$zzc13;
        zzge$zzs$zzcArray[3] = zzge$zzs$zzc12;
        zzge$zzs$zzcArray[4] = zzge$zzs$zzc11;
        zzge$zzs$zzcArray[5] = zzge$zzs$zzc10;
        zzge$zzs$zzcArray[6] = zzge$zzs$zzc9;
        zzge$zzs$zzcArray[7] = zzge$zzs$zzc8;
        zzge$zzs$zzcArray[8] = zzge$zzs$zzc7;
        zzge$zzs$zzcArray[9] = zzge$zzs$zzc6;
        zzge$zzs$zzcArray[10] = zzge$zzs$zzc5;
        zzge$zzs$zzcArray[11] = zzge$zzs$zzc4;
        zzge$zzs$zzcArray[12] = zzge$zzs$zzc15;
        zzge$zzs$zzcArray[13] = zzge$zzs$zzc16;
        zzge$zzs$zzcArray[14] = zzge$zzs$zzc17;
        zzge$zzs$zzcArray[15] = zzge$zzs$zzcArray2;
        zzge$zzs$zzcArray[16] = zzge$zzs$zzc3;
        zzge$zzs$zzcArray[n7] = zzge$zzs$zzc2;
        zzge$zzs$zzcArray[n4] = zzge$zzs$zzc;
        zzbgs = zzge$zzs$zzcArray;
        zzbq = object = new zzgp();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzge$zzs$zzc() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static zzge$zzs$zzc[] values() {
        return (zzge$zzs$zzc[])zzbgs.clone();
    }

    public static zzge$zzs$zzc zzba(int n3) {
        switch (n3) {
            default: {
                return null;
            }
            case 17: {
                return zzbgr;
            }
            case 16: {
                return zzbgq;
            }
            case 15: {
                return zzbgp;
            }
            case 14: {
                return zzbgo;
            }
            case 13: {
                return zzbgn;
            }
            case 12: {
                return zzbgm;
            }
            case 11: {
                return zzbgl;
            }
            case 10: {
                return zzbgk;
            }
            case 9: {
                return zzbgj;
            }
            case 8: {
                return zzbgi;
            }
            case 7: {
                return zzbgh;
            }
            case 6: {
                return zzbgg;
            }
            case 5: {
                return zzbgf;
            }
            case 4: {
                return zzbge;
            }
            case 3: {
                return zzbgd;
            }
            case 2: {
                return zzbgc;
            }
            case 1: {
                return zzbgb;
            }
            case 0: {
                return zzbga;
            }
            case -1: 
        }
        return zzbfz;
    }

    public static zzck zzd() {
        return zzbq;
    }

    public final int zzc() {
        return this.value;
    }
}

