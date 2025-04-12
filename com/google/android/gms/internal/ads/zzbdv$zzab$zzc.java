/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzab$zzc$1;
import com.google.android.gms.internal.ads.zzbdv$zzab$zzc$zza;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;
import com.google.android.gms.internal.ads.zzhbu;

public final class zzbdv$zzab$zzc
extends Enum
implements zzhbs {
    public static final /* enum */ zzbdv$zzab$zzc zza;
    public static final /* enum */ zzbdv$zzab$zzc zzb;
    public static final /* enum */ zzbdv$zzab$zzc zzc;
    public static final int zzd = 0;
    public static final int zze = 1;
    public static final int zzf = 2;
    private static final zzhbt zzg;
    private static final /* synthetic */ zzbdv$zzab$zzc[] zzh;
    private final int zzi;

    static {
        Object object = new zzbdv$zzab$zzc("NETWORKTYPE_UNSPECIFIED", 0, 0);
        zza = object;
        int n3 = 1;
        object = new zzbdv$zzab$zzc("CELL", n3, n3);
        zzb = object;
        n3 = 2;
        object = new zzbdv$zzab$zzc("WIFI", n3, n3);
        zzc = object;
        zzh = zzbdv$zzab$zzc.zzf();
        zzg = object = new zzbdv$zzab$zzc$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzbdv$zzab$zzc() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzi = var3_2;
    }

    public static zzbdv$zzab$zzc[] values() {
        return (zzbdv$zzab$zzc[])zzh.clone();
    }

    public static zzbdv$zzab$zzc zzb(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    return null;
                }
                return zzc;
            }
            return zzb;
        }
        return zza;
    }

    public static zzbdv$zzab$zzc zzc(String string2) {
        return Enum.valueOf(zzbdv$zzab$zzc.class, string2);
    }

    public static zzhbt zzd() {
        return zzg;
    }

    public static zzhbu zze() {
        return zzbdv$zzab$zzc$zza.zza;
    }

    private static /* synthetic */ zzbdv$zzab$zzc[] zzf() {
        zzbdv$zzab$zzc zzbdv$zzab$zzc = zza;
        zzbdv$zzab$zzc = zzb;
        zzbdv$zzab$zzc = zzc;
        zzbdv$zzab$zzc[] zzbdv$zzab$zzcArray = new zzbdv$zzab$zzc[]{zzbdv$zzab$zzc, zzbdv$zzab$zzc, zzbdv$zzab$zzc};
        return zzbdv$zzab$zzcArray;
    }

    public final String toString() {
        return Integer.toString(this.zza());
    }

    public final int zza() {
        return this.zzi;
    }
}

