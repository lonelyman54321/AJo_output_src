/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgwi;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;

public final class zzgwj
extends Enum
implements zzhbs {
    public static final /* enum */ zzgwj zza;
    public static final /* enum */ zzgwj zzb;
    public static final /* enum */ zzgwj zzc;
    public static final /* enum */ zzgwj zzd;
    public static final /* enum */ zzgwj zze;
    private static final zzhbt zzf;
    private static final /* synthetic */ zzgwj[] zzg;
    private final int zzh;

    static {
        zzgwj zzgwj2;
        zzgwj zzgwj3;
        zzgwj zzgwj4;
        zzgwj zzgwj5;
        Object object = new zzgwj("UNKNOWN_STATUS", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzgwj5 = new zzgwj("ENABLED", n3, n3);
        int n4 = 2;
        zzc = zzgwj4 = new zzgwj("DISABLED", n4, n4);
        int n7 = 3;
        zzd = zzgwj3 = new zzgwj("DESTROYED", n7, n7);
        int n8 = 4;
        zze = zzgwj2 = new zzgwj("UNRECOGNIZED", n8, -1);
        zzgwj[] zzgwjArray = new zzgwj[5];
        zzgwjArray[0] = object;
        zzgwjArray[n3] = zzgwj5;
        zzgwjArray[n4] = zzgwj4;
        zzgwjArray[n7] = zzgwj3;
        zzgwjArray[n8] = zzgwj2;
        zzg = zzgwjArray;
        zzf = object = new zzgwi();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzgwj() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzh = var3_2;
    }

    public static zzgwj[] values() {
        return (zzgwj[])zzg.clone();
    }

    public static zzgwj zzb(int n3) {
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
        return Integer.toString(this.zza());
    }

    public final int zza() {
        Object object = zze;
        if (this != object) {
            return this.zzh;
        }
        object = new IllegalArgumentException("Can't get the number of an unknown enum value.");
        throw object;
    }
}

