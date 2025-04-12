/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzd$zza$1;
import com.google.android.gms.internal.ads.zzbdv$zzd$zza$zza;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;
import com.google.android.gms.internal.ads.zzhbu;

public final class zzbdv$zzd$zza
extends Enum
implements zzhbs {
    public static final /* enum */ zzbdv$zzd$zza zza;
    public static final /* enum */ zzbdv$zzd$zza zzb;
    public static final /* enum */ zzbdv$zzd$zza zzc;
    public static final /* enum */ zzbdv$zzd$zza zzd;
    public static final /* enum */ zzbdv$zzd$zza zze;
    public static final /* enum */ zzbdv$zzd$zza zzf;
    public static final /* enum */ zzbdv$zzd$zza zzg;
    public static final /* enum */ zzbdv$zzd$zza zzh;
    public static final /* enum */ zzbdv$zzd$zza zzi;
    public static final /* enum */ zzbdv$zzd$zza zzj;
    public static final /* enum */ zzbdv$zzd$zza zzk;
    public static final int zzl = 0;
    public static final int zzm = 1;
    public static final int zzn = 2;
    public static final int zzo = 3;
    public static final int zzp = 4;
    public static final int zzq = 5;
    public static final int zzr = 6;
    public static final int zzs = 7;
    public static final int zzt = 8;
    public static final int zzu = 9;
    public static final int zzv = 10;
    private static final zzhbt zzw;
    private static final /* synthetic */ zzbdv$zzd$zza[] zzx;
    private final int zzy;

    static {
        Object object = new zzbdv$zzd$zza("AD_FORMAT_TYPE_UNSPECIFIED", 0, 0);
        zza = object;
        int n3 = 1;
        object = new zzbdv$zzd$zza("BANNER", n3, n3);
        zzb = object;
        n3 = 2;
        object = new zzbdv$zzd$zza("INTERSTITIAL", n3, n3);
        zzc = object;
        n3 = 3;
        object = new zzbdv$zzd$zza("NATIVE_EXPRESS", n3, n3);
        zzd = object;
        n3 = 4;
        object = new zzbdv$zzd$zza("NATIVE_CONTENT", n3, n3);
        zze = object;
        n3 = 5;
        object = new zzbdv$zzd$zza("NATIVE_APP_INSTALL", n3, n3);
        zzf = object;
        n3 = 6;
        object = new zzbdv$zzd$zza("NATIVE_CUSTOM_TEMPLATE", n3, n3);
        zzg = object;
        n3 = 7;
        object = new zzbdv$zzd$zza("DFP_BANNER", n3, n3);
        zzh = object;
        n3 = 8;
        object = new zzbdv$zzd$zza("DFP_INTERSTITIAL", n3, n3);
        zzi = object;
        n3 = 9;
        object = new zzbdv$zzd$zza("REWARD_BASED_VIDEO_AD", n3, n3);
        zzj = object;
        n3 = 10;
        object = new zzbdv$zzd$zza("BANNER_SEARCH_ADS", n3, n3);
        zzk = object;
        zzx = zzbdv$zzd$zza.zzf();
        zzw = object = new zzbdv$zzd$zza$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzbdv$zzd$zza() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzy = var3_2;
    }

    public static zzbdv$zzd$zza[] values() {
        return (zzbdv$zzd$zza[])zzx.clone();
    }

    public static zzbdv$zzd$zza zzb(int n3) {
        switch (n3) {
            default: {
                return null;
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

    public static zzbdv$zzd$zza zzc(String string2) {
        return Enum.valueOf(zzbdv$zzd$zza.class, string2);
    }

    public static zzhbt zzd() {
        return zzw;
    }

    public static zzhbu zze() {
        return zzbdv$zzd$zza$zza.zza;
    }

    private static /* synthetic */ zzbdv$zzd$zza[] zzf() {
        zzbdv$zzd$zza zzbdv$zzd$zza = zza;
        zzbdv$zzd$zza = zzb;
        zzbdv$zzd$zza = zzc;
        zzbdv$zzd$zza = zzd;
        zzbdv$zzd$zza = zze;
        zzbdv$zzd$zza = zzf;
        zzbdv$zzd$zza = zzg;
        zzbdv$zzd$zza = zzh;
        zzbdv$zzd$zza = zzi;
        zzbdv$zzd$zza = zzj;
        zzbdv$zzd$zza = zzk;
        zzbdv$zzd$zza[] zzbdv$zzd$zzaArray = new zzbdv$zzd$zza[]{zzbdv$zzd$zza, zzbdv$zzd$zza, zzbdv$zzd$zza, zzbdv$zzd$zza, zzbdv$zzd$zza, zzbdv$zzd$zza, zzbdv$zzd$zza, zzbdv$zzd$zza, zzbdv$zzd$zza, zzbdv$zzd$zza, zzbdv$zzd$zza};
        return zzbdv$zzd$zzaArray;
    }

    public final String toString() {
        return Integer.toString(this.zza());
    }

    public final int zza() {
        return this.zzy;
    }
}

