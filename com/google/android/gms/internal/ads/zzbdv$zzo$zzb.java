/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zzo$zzb$1;
import com.google.android.gms.internal.ads.zzbdv$zzo$zzb$zza;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;
import com.google.android.gms.internal.ads.zzhbu;

public final class zzbdv$zzo$zzb
extends Enum
implements zzhbs {
    public static final /* enum */ zzbdv$zzo$zzb zza;
    public static final /* enum */ zzbdv$zzo$zzb zzb;
    public static final /* enum */ zzbdv$zzo$zzb zzc;
    public static final int zzd = 0;
    public static final int zze = 1;
    public static final int zzf = 2;
    private static final zzhbt zzg;
    private static final /* synthetic */ zzbdv$zzo$zzb[] zzh;
    private final int zzi;

    static {
        Object object = new zzbdv$zzo$zzb("PLATFORM_UNSPECIFIED", 0, 0);
        zza = object;
        int n3 = 1;
        object = new zzbdv$zzo$zzb("IOS", n3, n3);
        zzb = object;
        n3 = 2;
        object = new zzbdv$zzo$zzb("ANDROID", n3, n3);
        zzc = object;
        zzh = zzbdv$zzo$zzb.zzf();
        zzg = object = new zzbdv$zzo$zzb$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzbdv$zzo$zzb() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzi = var3_2;
    }

    public static zzbdv$zzo$zzb[] values() {
        return (zzbdv$zzo$zzb[])zzh.clone();
    }

    public static zzbdv$zzo$zzb zzb(int n3) {
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

    public static zzbdv$zzo$zzb zzc(String string2) {
        return Enum.valueOf(zzbdv$zzo$zzb.class, string2);
    }

    public static zzhbt zzd() {
        return zzg;
    }

    public static zzhbu zze() {
        return zzbdv$zzo$zzb$zza.zza;
    }

    private static /* synthetic */ zzbdv$zzo$zzb[] zzf() {
        zzbdv$zzo$zzb zzbdv$zzo$zzb = zza;
        zzbdv$zzo$zzb = zzb;
        zzbdv$zzo$zzb = zzc;
        zzbdv$zzo$zzb[] zzbdv$zzo$zzbArray = new zzbdv$zzo$zzb[]{zzbdv$zzo$zzb, zzbdv$zzo$zzb, zzbdv$zzo$zzb};
        return zzbdv$zzo$zzbArray;
    }

    public final String toString() {
        return Integer.toString(this.zza());
    }

    public final int zza() {
        return this.zzi;
    }
}

