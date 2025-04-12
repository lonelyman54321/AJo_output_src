/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;
import com.google.android.gms.internal.ads.zzhin;

public final class zzhip
extends Enum
implements zzhbs {
    public static final /* enum */ zzhip zza;
    public static final /* enum */ zzhip zzb;
    public static final /* enum */ zzhip zzc;
    public static final /* enum */ zzhip zzd;
    private static final zzhbt zze;
    private static final /* synthetic */ zzhip[] zzf;
    private final int zzg;

    static {
        zzhip zzhip2;
        zzhip zzhip3;
        zzhip zzhip4;
        Object object = new zzhip("AD_RESOURCE_UNKNOWN", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzhip4 = new zzhip("AD_RESOURCE_CREATIVE", n3, n3);
        int n4 = 2;
        zzc = zzhip3 = new zzhip("AD_RESOURCE_POST_CLICK", n4, n4);
        int n7 = 3;
        zzd = zzhip2 = new zzhip("AD_RESOURCE_AUTO_CLICK_DESTINATION", n7, n7);
        zzhip[] zzhipArray = new zzhip[4];
        zzhipArray[0] = object;
        zzhipArray[n3] = zzhip4;
        zzhipArray[n4] = zzhip3;
        zzhipArray[n7] = zzhip2;
        zzf = zzhipArray;
        zze = object = new zzhin();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzhip() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzg = var3_2;
    }

    public static zzhip[] values() {
        return (zzhip[])zzf.clone();
    }

    public static zzhip zzb(int n3) {
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

