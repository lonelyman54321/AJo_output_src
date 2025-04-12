/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzata;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;

public final class zzatc
extends Enum
implements zzhbs {
    public static final /* enum */ zzatc zza;
    public static final /* enum */ zzatc zzb;
    public static final /* enum */ zzatc zzc;
    private static final zzhbt zzd;
    private static final /* synthetic */ zzatc[] zze;
    private final int zzf;

    static {
        zzatc zzatc2;
        zzatc zzatc3;
        Object object = new zzatc("UNKNOWN", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzatc3 = new zzatc("ENABLED", n3, n3);
        int n4 = 2;
        zzc = zzatc2 = new zzatc("DISABLED", n4, n4);
        zzatc[] zzatcArray = new zzatc[3];
        zzatcArray[0] = object;
        zzatcArray[n3] = zzatc3;
        zzatcArray[n4] = zzatc2;
        zze = zzatcArray;
        zzd = object = new zzata();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzatc() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzf = var3_2;
    }

    public static zzatc[] values() {
        return (zzatc[])zze.clone();
    }

    public static zzatc zzb(int n3) {
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

    public final String toString() {
        return Integer.toString(this.zzf);
    }

    public final int zza() {
        return this.zzf;
    }
}

