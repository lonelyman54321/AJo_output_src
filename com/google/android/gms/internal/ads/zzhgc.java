/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;
import com.google.android.gms.internal.ads.zzhga;

public final class zzhgc
extends Enum
implements zzhbs {
    public static final /* enum */ zzhgc zza;
    public static final /* enum */ zzhgc zzb;
    public static final /* enum */ zzhgc zzc;
    public static final /* enum */ zzhgc zzd;
    private static final zzhbt zze;
    private static final /* synthetic */ zzhgc[] zzf;
    private final int zzg;

    static {
        zzhgc zzhgc2;
        zzhgc zzhgc3;
        zzhgc zzhgc4;
        Object object = new zzhgc("UNKNOWN", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzhgc4 = new zzhgc("UNAVAILABLE", n3, n3);
        int n4 = 2;
        zzc = zzhgc3 = new zzhgc("NOT_MANAGED", n4, n4);
        int n7 = 3;
        zzd = zzhgc2 = new zzhgc("ENTERPRISE_MANAGED", n7, n7);
        zzhgc[] zzhgcArray = new zzhgc[4];
        zzhgcArray[0] = object;
        zzhgcArray[n3] = zzhgc4;
        zzhgcArray[n4] = zzhgc3;
        zzhgcArray[n7] = zzhgc2;
        zzf = zzhgcArray;
        zze = object = new zzhga();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzhgc() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzg = var3_2;
    }

    public static zzhgc[] values() {
        return (zzhgc[])zzf.clone();
    }

    public static zzhgc zzb(int n3) {
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

    public final String toString() {
        return Integer.toString(this.zzg);
    }

    public final int zza() {
        return this.zzg;
    }
}

