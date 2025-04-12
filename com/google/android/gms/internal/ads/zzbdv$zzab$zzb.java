/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzab$zzb$1;
import com.google.android.gms.internal.ads.zzbdv$zzab$zzb$zza;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;
import com.google.android.gms.internal.ads.zzhbu;

public final class zzbdv$zzab$zzb
extends Enum
implements zzhbs {
    public static final /* enum */ zzbdv$zzab$zzb zza;
    public static final /* enum */ zzbdv$zzab$zzb zzb;
    public static final /* enum */ zzbdv$zzab$zzb zzc;
    public static final /* enum */ zzbdv$zzab$zzb zzd;
    public static final int zze = 0;
    public static final int zzf = 1;
    public static final int zzg = 2;
    public static final int zzh = 4;
    private static final zzhbt zzi;
    private static final /* synthetic */ zzbdv$zzab$zzb[] zzj;
    private final int zzk;

    static {
        Object object = new zzbdv$zzab$zzb("CELLULAR_NETWORK_TYPE_UNSPECIFIED", 0, 0);
        zza = object;
        int n3 = 1;
        object = new zzbdv$zzab$zzb("TWO_G", n3, n3);
        zzb = object;
        n3 = 2;
        object = new zzbdv$zzab$zzb("THREE_G", n3, n3);
        zzc = object;
        object = new zzbdv$zzab$zzb("LTE", 3, 4);
        zzd = object;
        zzj = zzbdv$zzab$zzb.zzf();
        zzi = object = new zzbdv$zzab$zzb$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzbdv$zzab$zzb() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzk = var3_2;
    }

    public static zzbdv$zzab$zzb[] values() {
        return (zzbdv$zzab$zzb[])zzj.clone();
    }

    public static zzbdv$zzab$zzb zzb(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 4;
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

    public static zzbdv$zzab$zzb zzc(String string2) {
        return Enum.valueOf(zzbdv$zzab$zzb.class, string2);
    }

    public static zzhbt zzd() {
        return zzi;
    }

    public static zzhbu zze() {
        return zzbdv$zzab$zzb$zza.zza;
    }

    private static /* synthetic */ zzbdv$zzab$zzb[] zzf() {
        zzbdv$zzab$zzb zzbdv$zzab$zzb = zza;
        zzbdv$zzab$zzb = zzb;
        zzbdv$zzab$zzb = zzc;
        zzbdv$zzab$zzb = zzd;
        zzbdv$zzab$zzb[] zzbdv$zzab$zzbArray = new zzbdv$zzab$zzb[]{zzbdv$zzab$zzb, zzbdv$zzab$zzb, zzbdv$zzab$zzb, zzbdv$zzab$zzb};
        return zzbdv$zzab$zzbArray;
    }

    public final String toString() {
        return Integer.toString(this.zza());
    }

    public final int zza() {
        return this.zzk;
    }
}

