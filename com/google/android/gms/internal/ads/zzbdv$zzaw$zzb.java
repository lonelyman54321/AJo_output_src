/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzaw$zzb$1;
import com.google.android.gms.internal.ads.zzbdv$zzaw$zzb$zza;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;
import com.google.android.gms.internal.ads.zzhbu;

public final class zzbdv$zzaw$zzb
extends Enum
implements zzhbs {
    public static final /* enum */ zzbdv$zzaw$zzb zza;
    public static final /* enum */ zzbdv$zzaw$zzb zzb;
    public static final /* enum */ zzbdv$zzaw$zzb zzc;
    public static final /* enum */ zzbdv$zzaw$zzb zzd;
    public static final int zze = 0;
    public static final int zzf = 1;
    public static final int zzg = 2;
    public static final int zzh = 3;
    private static final zzhbt zzi;
    private static final /* synthetic */ zzbdv$zzaw$zzb[] zzj;
    private final int zzk;

    static {
        Object object = new zzbdv$zzaw$zzb("VIDEO_ERROR_CODE_UNSPECIFIED", 0, 0);
        zza = object;
        int n3 = 1;
        object = new zzbdv$zzaw$zzb("OPENGL_RENDERING_FAILED", n3, n3);
        zzb = object;
        n3 = 2;
        object = new zzbdv$zzaw$zzb("CACHE_LOAD_FAILED", n3, n3);
        zzc = object;
        n3 = 3;
        object = new zzbdv$zzaw$zzb("ANDROID_TARGET_API_TOO_LOW", n3, n3);
        zzd = object;
        zzj = zzbdv$zzaw$zzb.zzf();
        zzi = object = new zzbdv$zzaw$zzb$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzbdv$zzaw$zzb() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzk = var3_2;
    }

    public static zzbdv$zzaw$zzb[] values() {
        return (zzbdv$zzaw$zzb[])zzj.clone();
    }

    public static zzbdv$zzaw$zzb zzb(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 != n4) {
                        return null;
                    }
                    return zzd;
                }
                return zzc;
            }
            return zzb;
        }
        return zza;
    }

    public static zzbdv$zzaw$zzb zzc(String string2) {
        return Enum.valueOf(zzbdv$zzaw$zzb.class, string2);
    }

    public static zzhbt zzd() {
        return zzi;
    }

    public static zzhbu zze() {
        return zzbdv$zzaw$zzb$zza.zza;
    }

    private static /* synthetic */ zzbdv$zzaw$zzb[] zzf() {
        zzbdv$zzaw$zzb zzbdv$zzaw$zzb = zza;
        zzbdv$zzaw$zzb = zzb;
        zzbdv$zzaw$zzb = zzc;
        zzbdv$zzaw$zzb = zzd;
        zzbdv$zzaw$zzb[] zzbdv$zzaw$zzbArray = new zzbdv$zzaw$zzb[]{zzbdv$zzaw$zzb, zzbdv$zzaw$zzb, zzbdv$zzaw$zzb, zzbdv$zzaw$zzb};
        return zzbdv$zzaw$zzbArray;
    }

    public final String toString() {
        return Integer.toString(this.zza());
    }

    public final int zza() {
        return this.zzk;
    }
}

