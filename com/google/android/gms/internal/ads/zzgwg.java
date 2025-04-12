/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgwf;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;

public final class zzgwg
extends Enum
implements zzhbs {
    public static final /* enum */ zzgwg zza;
    public static final /* enum */ zzgwg zzb;
    public static final /* enum */ zzgwg zzc;
    public static final /* enum */ zzgwg zzd;
    public static final /* enum */ zzgwg zze;
    public static final /* enum */ zzgwg zzf;
    private static final zzhbt zzg;
    private static final /* synthetic */ zzgwg[] zzh;
    private final int zzi;

    static {
        zzgwg zzgwg2;
        zzgwg zzgwg3;
        zzgwg zzgwg4;
        zzgwg zzgwg5;
        zzgwg zzgwg6;
        Object object = new zzgwg("UNKNOWN_KEYMATERIAL", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzgwg6 = new zzgwg("SYMMETRIC", n3, n3);
        int n4 = 2;
        zzc = zzgwg5 = new zzgwg("ASYMMETRIC_PRIVATE", n4, n4);
        int n7 = 3;
        zzd = zzgwg4 = new zzgwg("ASYMMETRIC_PUBLIC", n7, n7);
        int n8 = 4;
        zze = zzgwg3 = new zzgwg("REMOTE", n8, n8);
        int n10 = 5;
        zzf = zzgwg2 = new zzgwg("UNRECOGNIZED", n10, -1);
        zzgwg[] zzgwgArray = new zzgwg[6];
        zzgwgArray[0] = object;
        zzgwgArray[n3] = zzgwg6;
        zzgwgArray[n4] = zzgwg5;
        zzgwgArray[n7] = zzgwg4;
        zzgwgArray[n8] = zzgwg3;
        zzgwgArray[n10] = zzgwg2;
        zzh = zzgwgArray;
        zzg = object = new zzgwf();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzgwg() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzi = var3_2;
    }

    public static zzgwg[] values() {
        return (zzgwg[])zzh.clone();
    }

    public static zzgwg zzb(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 != n4) {
                        n4 = 4;
                        if (n3 != n4) {
                            return null;
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
        return Integer.toString(this.zza());
    }

    public final int zza() {
        Object object = zzf;
        if (this != object) {
            return this.zzi;
        }
        object = new IllegalArgumentException("Can't get the number of an unknown enum value.");
        throw object;
    }
}

