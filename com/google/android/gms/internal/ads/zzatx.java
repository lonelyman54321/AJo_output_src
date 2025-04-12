/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzatv;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;

public final class zzatx
extends Enum
implements zzhbs {
    public static final /* enum */ zzatx zza;
    public static final /* enum */ zzatx zzb;
    public static final /* enum */ zzatx zzc;
    public static final /* enum */ zzatx zzd;
    public static final /* enum */ zzatx zze;
    public static final /* enum */ zzatx zzf;
    public static final /* enum */ zzatx zzg;
    public static final /* enum */ zzatx zzh;
    public static final /* enum */ zzatx zzi;
    public static final /* enum */ zzatx zzj;
    private static final zzhbt zzk;
    private static final /* synthetic */ zzatx[] zzl;
    private final int zzm;

    static {
        zzatx zzatx2;
        zzatx zzatx3;
        zzatx zzatx4;
        zzatx zzatx5;
        zzatx zzatx6;
        zzatx zzatx7;
        zzatx zzatx8;
        zzatx zzatx9;
        zzatx zzatx10;
        Object object = new zzatx("DEVICE_IDENTIFIER_NO_ID", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzatx10 = new zzatx("DEVICE_IDENTIFIER_APP_SPECIFIC_ID", n3, n3);
        int n4 = 2;
        zzc = zzatx9 = new zzatx("DEVICE_IDENTIFIER_GLOBAL_ID", n4, n4);
        int n7 = 3;
        zzd = zzatx8 = new zzatx("DEVICE_IDENTIFIER_ADVERTISER_ID", n7, n7);
        int n8 = 4;
        zze = zzatx7 = new zzatx("DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED", n8, n8);
        int n10 = 5;
        zzf = zzatx6 = new zzatx("DEVICE_IDENTIFIER_ANDROID_AD_ID", n10, n10);
        int n14 = 6;
        zzg = zzatx5 = new zzatx("DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID", n14, n14);
        n14 = 7;
        zzh = zzatx4 = new zzatx("DEVICE_IDENTIFIER_PER_APP_ID", n14, n14);
        n10 = 8;
        zzi = zzatx3 = new zzatx("DEVICE_IDENTIFIER_PER_APP_ID_V2", n10, n10);
        n8 = 9;
        zzj = zzatx2 = new zzatx("DEVICE_IDENTIFIER_CONNECTED_TV_IFA", n8, n8);
        zzatx[] zzatxArray = new zzatx[10];
        zzatxArray[0] = object;
        zzatxArray[n3] = zzatx10;
        zzatxArray[n4] = zzatx9;
        zzatxArray[n7] = zzatx8;
        zzatxArray[4] = zzatx7;
        zzatxArray[5] = zzatx6;
        zzatxArray[6] = zzatx5;
        zzatxArray[7] = zzatx4;
        zzatxArray[8] = zzatx3;
        zzatxArray[n8] = zzatx2;
        zzl = zzatxArray;
        zzk = object = new zzatv();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzatx() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzm = var3_2;
    }

    public static zzatx[] values() {
        return (zzatx[])zzl.clone();
    }

    public static zzatx zzb(int n3) {
        switch (n3) {
            default: {
                return null;
            }
            case 9: {
                return zzj;
            }
            case 8: {
                return zzi;
            }
            case 7: {
                return zzh;
            }
            case 6: {
                return zzg;
            }
            case 5: {
                return zzf;
            }
            case 4: {
                return zze;
            }
            case 3: {
                return zzd;
            }
            case 2: {
                return zzc;
            }
            case 1: {
                return zzb;
            }
            case 0: 
        }
        return zza;
    }

    public final String toString() {
        return Integer.toString(this.zzm);
    }

    public final int zza() {
        return this.zzm;
    }
}

