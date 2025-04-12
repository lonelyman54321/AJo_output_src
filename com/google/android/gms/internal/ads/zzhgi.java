/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;
import com.google.android.gms.internal.ads.zzhgg;

public final class zzhgi
extends Enum
implements zzhbs {
    public static final /* enum */ zzhgi zza;
    public static final /* enum */ zzhgi zzb;
    public static final /* enum */ zzhgi zzc;
    public static final /* enum */ zzhgi zzd;
    private static final zzhbt zze;
    private static final /* synthetic */ zzhgi[] zzf;
    private final int zzg;

    static {
        zzhgi zzhgi2;
        zzhgi zzhgi3;
        zzhgi zzhgi4;
        Object object = new zzhgi("UNKNOWN_USER_POPULATION", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzhgi4 = new zzhgi("SAFE_BROWSING", n3, n3);
        int n4 = 2;
        zzc = zzhgi3 = new zzhgi("EXTENDED_REPORTING", n4, n4);
        int n7 = 3;
        zzd = zzhgi2 = new zzhgi("ENHANCED_PROTECTION", n7, n7);
        zzhgi[] zzhgiArray = new zzhgi[4];
        zzhgiArray[0] = object;
        zzhgiArray[n3] = zzhgi4;
        zzhgiArray[n4] = zzhgi3;
        zzhgiArray[n7] = zzhgi2;
        zzf = zzhgiArray;
        zze = object = new zzhgg();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzhgi() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzg = var3_2;
    }

    public static zzhgi[] values() {
        return (zzhgi[])zzf.clone();
    }

    public static zzhgi zzb(int n3) {
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

