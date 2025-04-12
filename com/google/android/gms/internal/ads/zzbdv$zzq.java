/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzq$1;
import com.google.android.gms.internal.ads.zzbdv$zzq$zza;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;
import com.google.android.gms.internal.ads.zzhbu;

public final class zzbdv$zzq
extends Enum
implements zzhbs {
    public static final /* enum */ zzbdv$zzq zza;
    public static final /* enum */ zzbdv$zzq zzb;
    public static final /* enum */ zzbdv$zzq zzc;
    public static final int zzd = 0;
    public static final int zze = 1;
    public static final int zzf = 1000;
    private static final zzhbt zzg;
    private static final /* synthetic */ zzbdv$zzq[] zzh;
    private final int zzi;

    static {
        Object object = new zzbdv$zzq("ENUM_FALSE", 0, 0);
        zza = object;
        int n3 = 1;
        object = new zzbdv$zzq("ENUM_TRUE", n3, n3);
        zzb = object;
        object = new zzbdv$zzq("ENUM_UNKNOWN", 2, 1000);
        zzc = object;
        zzh = zzbdv$zzq.zzf();
        zzg = object = new zzbdv$zzq$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzbdv$zzq() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzi = var3_2;
    }

    public static zzbdv$zzq[] values() {
        return (zzbdv$zzq[])zzh.clone();
    }

    public static zzbdv$zzq zzb(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 1000;
                if (n3 != n4) {
                    return null;
                }
                return zzc;
            }
            return zzb;
        }
        return zza;
    }

    public static zzbdv$zzq zzc(String string2) {
        return Enum.valueOf(zzbdv$zzq.class, string2);
    }

    public static zzhbt zzd() {
        return zzg;
    }

    public static zzhbu zze() {
        return zzbdv$zzq$zza.zza;
    }

    private static /* synthetic */ zzbdv$zzq[] zzf() {
        zzbdv$zzq zzbdv$zzq = zza;
        zzbdv$zzq = zzb;
        zzbdv$zzq = zzc;
        zzbdv$zzq[] zzbdv$zzqArray = new zzbdv$zzq[]{zzbdv$zzq, zzbdv$zzq, zzbdv$zzq};
        return zzbdv$zzqArray;
    }

    public final String toString() {
        return Integer.toString(this.zza());
    }

    public final int zza() {
        return this.zzi;
    }
}

