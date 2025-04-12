/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;
import com.google.android.gms.internal.ads.zzhib;

public final class zzhid
extends Enum
implements zzhbs {
    public static final /* enum */ zzhid zza;
    public static final /* enum */ zzhid zzb;
    public static final /* enum */ zzhid zzc;
    public static final /* enum */ zzhid zzd;
    private static final zzhbt zze;
    private static final /* synthetic */ zzhid[] zzf;
    private final int zzg;

    static {
        zzhid zzhid2;
        zzhid zzhid3;
        zzhid zzhid4;
        Object object = new zzhid("UNSPECIFIED", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzhid4 = new zzhid("PHISHY_CLICK_EVENT", n3, n3);
        int n4 = 2;
        zzc = zzhid3 = new zzhid("PHISHY_KEY_EVENT", n4, n4);
        int n7 = 3;
        zzd = zzhid2 = new zzhid("PHISHY_PASTE_EVENT", n7, n7);
        zzhid[] zzhidArray = new zzhid[4];
        zzhidArray[0] = object;
        zzhidArray[n3] = zzhid4;
        zzhidArray[n4] = zzhid3;
        zzhidArray[n7] = zzhid2;
        zzf = zzhidArray;
        zze = object = new zzhib();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzhid() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzg = var3_2;
    }

    public static zzhid[] values() {
        return (zzhid[])zzf.clone();
    }

    public static zzhid zzb(int n3) {
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

