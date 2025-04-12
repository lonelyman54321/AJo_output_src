/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgvs;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;

public final class zzgvt
extends Enum
implements zzhbs {
    public static final /* enum */ zzgvt zza;
    public static final /* enum */ zzgvt zzb;
    public static final /* enum */ zzgvt zzc;
    public static final /* enum */ zzgvt zzd;
    public static final /* enum */ zzgvt zze;
    public static final /* enum */ zzgvt zzf;
    public static final /* enum */ zzgvt zzg;
    private static final zzhbt zzh;
    private static final /* synthetic */ zzgvt[] zzi;
    private final int zzj;

    static {
        zzgvt zzgvt2;
        zzgvt zzgvt3;
        zzgvt zzgvt4;
        zzgvt zzgvt5;
        zzgvt zzgvt6;
        zzgvt zzgvt7;
        Object object = new zzgvt("UNKNOWN_HASH", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzgvt7 = new zzgvt("SHA1", n3, n3);
        int n4 = 2;
        zzc = zzgvt6 = new zzgvt("SHA384", n4, n4);
        int n7 = 3;
        zzd = zzgvt5 = new zzgvt("SHA256", n7, n7);
        int n8 = 4;
        zze = zzgvt4 = new zzgvt("SHA512", n8, n8);
        int n10 = 5;
        zzf = zzgvt3 = new zzgvt("SHA224", n10, n10);
        int n14 = 6;
        zzg = zzgvt2 = new zzgvt("UNRECOGNIZED", n14, -1);
        zzgvt[] zzgvtArray = new zzgvt[7];
        zzgvtArray[0] = object;
        zzgvtArray[n3] = zzgvt7;
        zzgvtArray[n4] = zzgvt6;
        zzgvtArray[n7] = zzgvt5;
        zzgvtArray[n8] = zzgvt4;
        zzgvtArray[n10] = zzgvt3;
        zzgvtArray[n14] = zzgvt2;
        zzi = zzgvtArray;
        zzh = object = new zzgvs();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzgvt() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzj = var3_2;
    }

    public static zzgvt[] values() {
        return (zzgvt[])zzi.clone();
    }

    public static zzgvt zzb(int n3) {
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
        return Integer.toString(this.zza());
    }

    public final int zza() {
        Object object = zzg;
        if (this != object) {
            return this.zzj;
        }
        object = new IllegalArgumentException("Can't get the number of an unknown enum value.");
        throw object;
    }
}

