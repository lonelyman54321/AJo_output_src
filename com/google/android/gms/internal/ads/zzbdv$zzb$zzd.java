/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzb$zzd$1;
import com.google.android.gms.internal.ads.zzbdv$zzb$zzd$zza;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;
import com.google.android.gms.internal.ads.zzhbu;

public final class zzbdv$zzb$zzd
extends Enum
implements zzhbs {
    public static final /* enum */ zzbdv$zzb$zzd zza;
    public static final /* enum */ zzbdv$zzb$zzd zzb;
    public static final int zzc = 0;
    public static final int zzd = 1;
    private static final zzhbt zze;
    private static final /* synthetic */ zzbdv$zzb$zzd[] zzf;
    private final int zzg;

    static {
        Object object = new zzbdv$zzb$zzd("UNSPECIFIED", 0, 0);
        zza = object;
        int n3 = 1;
        object = new zzbdv$zzb$zzd("IN_MEMORY", n3, n3);
        zzb = object;
        zzf = zzbdv$zzb$zzd.zzf();
        zze = object = new zzbdv$zzb$zzd$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzbdv$zzb$zzd() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzg = var3_2;
    }

    public static zzbdv$zzb$zzd[] values() {
        return (zzbdv$zzb$zzd[])zzf.clone();
    }

    public static zzbdv$zzb$zzd zzb(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                return null;
            }
            return zzb;
        }
        return zza;
    }

    public static zzbdv$zzb$zzd zzc(String string2) {
        return Enum.valueOf(zzbdv$zzb$zzd.class, string2);
    }

    public static zzhbt zzd() {
        return zze;
    }

    public static zzhbu zze() {
        return zzbdv$zzb$zzd$zza.zza;
    }

    private static /* synthetic */ zzbdv$zzb$zzd[] zzf() {
        zzbdv$zzb$zzd zzbdv$zzb$zzd = zza;
        zzbdv$zzb$zzd = zzb;
        zzbdv$zzb$zzd[] zzbdv$zzb$zzdArray = new zzbdv$zzb$zzd[]{zzbdv$zzb$zzd, zzbdv$zzb$zzd};
        return zzbdv$zzb$zzdArray;
    }

    public final String toString() {
        return Integer.toString(this.zza());
    }

    public final int zza() {
        return this.zzg;
    }
}

