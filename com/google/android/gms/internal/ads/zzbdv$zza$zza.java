/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zza$zza$1;
import com.google.android.gms.internal.ads.zzbdv$zza$zza$zza;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;
import com.google.android.gms.internal.ads.zzhbu;

public final class zzbdv$zza$zza
extends Enum
implements zzhbs {
    public static final /* enum */ zzbdv$zza$zza zza;
    public static final /* enum */ zzbdv$zza$zza zzb;
    public static final /* enum */ zzbdv$zza$zza zzc;
    public static final /* enum */ zzbdv$zza$zza zzd;
    public static final /* enum */ zzbdv$zza$zza zze;
    public static final /* enum */ zzbdv$zza$zza zzf;
    public static final /* enum */ zzbdv$zza$zza zzg;
    public static final /* enum */ zzbdv$zza$zza zzh;
    public static final /* enum */ zzbdv$zza$zza zzi;
    public static final /* enum */ zzbdv$zza$zza zzj;
    public static final /* enum */ zzbdv$zza$zza zzk;
    public static final /* enum */ zzbdv$zza$zza zzl;
    public static final int zzm = 0;
    public static final int zzn = 1;
    public static final int zzo = 2;
    public static final int zzp = 3;
    public static final int zzq = 4;
    public static final int zzr = 5;
    public static final int zzs = 6;
    public static final int zzt = 7;
    public static final int zzu = 8;
    public static final int zzv = 9;
    public static final int zzw = 10;
    public static final int zzx = 11;
    private static final zzhbt zzy;
    private static final /* synthetic */ zzbdv$zza$zza[] zzz;
    private final int zzA;

    static {
        Object object = new zzbdv$zza$zza("AD_INITIATER_UNSPECIFIED", 0, 0);
        zza = object;
        int n3 = 1;
        object = new zzbdv$zza$zza("BANNER", n3, n3);
        zzb = object;
        n3 = 2;
        object = new zzbdv$zza$zza("DFP_BANNER", n3, n3);
        zzc = object;
        n3 = 3;
        object = new zzbdv$zza$zza("INTERSTITIAL", n3, n3);
        zzd = object;
        n3 = 4;
        object = new zzbdv$zza$zza("DFP_INTERSTITIAL", n3, n3);
        zze = object;
        n3 = 5;
        object = new zzbdv$zza$zza("NATIVE_EXPRESS", n3, n3);
        zzf = object;
        n3 = 6;
        object = new zzbdv$zza$zza("AD_LOADER", n3, n3);
        zzg = object;
        n3 = 7;
        object = new zzbdv$zza$zza("REWARD_BASED_VIDEO_AD", n3, n3);
        zzh = object;
        n3 = 8;
        object = new zzbdv$zza$zza("BANNER_SEARCH_ADS", n3, n3);
        zzi = object;
        n3 = 9;
        object = new zzbdv$zza$zza("GOOGLE_MOBILE_ADS_SDK_ADAPTER", n3, n3);
        zzj = object;
        n3 = 10;
        object = new zzbdv$zza$zza("APP_OPEN", n3, n3);
        zzk = object;
        n3 = 11;
        object = new zzbdv$zza$zza("REWARDED_INTERSTITIAL", n3, n3);
        zzl = object;
        zzz = zzbdv$zza$zza.zzf();
        zzy = object = new zzbdv$zza$zza$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzbdv$zza$zza() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzA = var3_2;
    }

    public static zzbdv$zza$zza[] values() {
        return (zzbdv$zza$zza[])zzz.clone();
    }

    public static zzbdv$zza$zza zzb(int n3) {
        switch (n3) {
            default: {
                return null;
            }
            case 11: {
                return zzl;
            }
            case 10: {
                return zzk;
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

    public static zzbdv$zza$zza zzc(String string2) {
        return Enum.valueOf(zzbdv$zza$zza.class, string2);
    }

    public static zzhbt zzd() {
        return zzy;
    }

    public static zzhbu zze() {
        return zzbdv$zza$zza$zza.zza;
    }

    private static /* synthetic */ zzbdv$zza$zza[] zzf() {
        zzbdv$zza$zza zzbdv$zza$zza = zza;
        zzbdv$zza$zza = zzb;
        zzbdv$zza$zza = zzc;
        zzbdv$zza$zza = zzd;
        zzbdv$zza$zza = zze;
        zzbdv$zza$zza = zzf;
        zzbdv$zza$zza = zzg;
        zzbdv$zza$zza = zzh;
        zzbdv$zza$zza = zzi;
        zzbdv$zza$zza = zzj;
        zzbdv$zza$zza = zzk;
        zzbdv$zza$zza = zzl;
        zzbdv$zza$zza[] zzbdv$zza$zzaArray = new zzbdv$zza$zza[]{zzbdv$zza$zza, zzbdv$zza$zza, zzbdv$zza$zza, zzbdv$zza$zza, zzbdv$zza$zza, zzbdv$zza$zza, zzbdv$zza$zza, zzbdv$zza$zza, zzbdv$zza$zza, zzbdv$zza$zza, zzbdv$zza$zza, zzbdv$zza$zza};
        return zzbdv$zza$zzaArray;
    }

    public final String toString() {
        return Integer.toString(this.zza());
    }

    public final int zza() {
        return this.zzA;
    }
}

