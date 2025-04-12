/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzavd;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;

public final class zzavf
extends Enum
implements zzhbs {
    public static final /* enum */ zzavf zza;
    public static final /* enum */ zzavf zzb;
    public static final /* enum */ zzavf zzc;
    public static final /* enum */ zzavf zzd;
    private static final zzhbt zze;
    private static final /* synthetic */ zzavf[] zzf;
    private final int zzg;

    static {
        zzavf zzavf2;
        zzavf zzavf3;
        zzavf zzavf4;
        Object object = new zzavf("UNKNOWN_PROTO", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzavf4 = new zzavf("AFMA_SIGNALS", n3, n3);
        int n4 = 2;
        zzc = zzavf3 = new zzavf("UNITY_SIGNALS", n4, n4);
        int n7 = 3;
        zzd = zzavf2 = new zzavf("PARTNER_SIGNALS", n7, n7);
        zzavf[] zzavfArray = new zzavf[4];
        zzavfArray[0] = object;
        zzavfArray[n3] = zzavf4;
        zzavfArray[n4] = zzavf3;
        zzavfArray[n7] = zzavf2;
        zzf = zzavfArray;
        zze = object = new zzavd();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzavf() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzg = var3_2;
    }

    public static zzavf[] values() {
        return (zzavf[])zzf.clone();
    }

    public static zzavf zzb(int n3) {
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

