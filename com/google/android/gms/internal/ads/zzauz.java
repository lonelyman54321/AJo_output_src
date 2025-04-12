/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaux;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;

public final class zzauz
extends Enum
implements zzhbs {
    public static final /* enum */ zzauz zza;
    public static final /* enum */ zzauz zzb;
    public static final /* enum */ zzauz zzc;
    public static final /* enum */ zzauz zzd;
    public static final /* enum */ zzauz zze;
    public static final /* enum */ zzauz zzf;
    private static final zzhbt zzg;
    private static final /* synthetic */ zzauz[] zzh;
    private final int zzi;

    static {
        zzauz zzauz2;
        zzauz zzauz3;
        zzauz zzauz4;
        zzauz zzauz5;
        zzauz zzauz6;
        Object object = new zzauz("UNKNOWN_ENCRYPTION_METHOD", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzauz6 = new zzauz("BITSLICER", n3, n3);
        int n4 = 2;
        zzc = zzauz5 = new zzauz("TINK_HYBRID", n4, n4);
        int n7 = 3;
        zzd = zzauz4 = new zzauz("UNENCRYPTED", n7, n7);
        int n8 = 4;
        zze = zzauz3 = new zzauz("DG", n8, n8);
        int n10 = 5;
        zzf = zzauz2 = new zzauz("DG_XTEA", n10, n10);
        zzauz[] zzauzArray = new zzauz[6];
        zzauzArray[0] = object;
        zzauzArray[n3] = zzauz6;
        zzauzArray[n4] = zzauz5;
        zzauzArray[n7] = zzauz4;
        zzauzArray[n8] = zzauz3;
        zzauzArray[n10] = zzauz2;
        zzh = zzauzArray;
        zzg = object = new zzaux();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzauz() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzi = var3_2;
    }

    public static zzauz[] values() {
        return (zzauz[])zzh.clone();
    }

    public static zzauz zzb(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 != n4) {
                        n4 = 4;
                        if (n3 != n4) {
                            n4 = 5;
                            if (n3 != n4) {
                                return null;
                            }
                            return zzf;
                        }
                        return zze;
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
        return Integer.toString(this.zzi);
    }

    public final int zza() {
        return this.zzi;
    }
}

