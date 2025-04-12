/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;
import com.google.android.gms.internal.ads.zzhiu;

public final class zzhiw
extends Enum
implements zzhbs {
    public static final /* enum */ zzhiw zza;
    public static final /* enum */ zzhiw zzb;
    public static final /* enum */ zzhiw zzc;
    public static final /* enum */ zzhiw zzd;
    public static final /* enum */ zzhiw zze;
    public static final /* enum */ zzhiw zzf;
    public static final /* enum */ zzhiw zzg;
    public static final /* enum */ zzhiw zzh;
    public static final /* enum */ zzhiw zzi;
    private static final zzhbt zzj;
    private static final /* synthetic */ zzhiw[] zzk;
    private final int zzl;

    static {
        zzhiw zzhiw2;
        zzhiw zzhiw3;
        zzhiw zzhiw4;
        zzhiw zzhiw5;
        zzhiw zzhiw6;
        zzhiw zzhiw7;
        zzhiw zzhiw8;
        zzhiw zzhiw9;
        Object object = new zzhiw("SAFE_BROWSING_URL_API_TYPE_UNSPECIFIED", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzhiw9 = new zzhiw("PVER3_NATIVE", n3, n3);
        int n4 = 2;
        zzc = zzhiw8 = new zzhiw("PVER4_NATIVE", n4, n4);
        int n7 = 3;
        zzd = zzhiw7 = new zzhiw("ANDROID_SAFETYNET", n7, n7);
        int n8 = 4;
        zze = zzhiw6 = new zzhiw("FLYWHEEL", n8, n8);
        int n10 = 5;
        zzf = zzhiw5 = new zzhiw("REAL_TIME", n10, n10);
        int n14 = 6;
        zzg = zzhiw4 = new zzhiw("PVER5_NATIVE_REAL_TIME", n14, n14);
        n14 = 7;
        zzh = zzhiw3 = new zzhiw("ANDROID_SAFEBROWSING_REAL_TIME", n14, n14);
        n10 = 8;
        zzi = zzhiw2 = new zzhiw("ANDROID_SAFEBROWSING", n10, n10);
        zzhiw[] zzhiwArray = new zzhiw[9];
        zzhiwArray[0] = object;
        zzhiwArray[n3] = zzhiw9;
        zzhiwArray[n4] = zzhiw8;
        zzhiwArray[n7] = zzhiw7;
        zzhiwArray[n8] = zzhiw6;
        zzhiwArray[5] = zzhiw5;
        zzhiwArray[6] = zzhiw4;
        zzhiwArray[7] = zzhiw3;
        zzhiwArray[n10] = zzhiw2;
        zzk = zzhiwArray;
        zzj = object = new zzhiu();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzhiw() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzl = var3_2;
    }

    public static zzhiw[] values() {
        return (zzhiw[])zzk.clone();
    }

    public static zzhiw zzb(int n3) {
        switch (n3) {
            default: {
                return null;
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
        return Integer.toString(this.zzl);
    }

    public final int zza() {
        return this.zzl;
    }
}

