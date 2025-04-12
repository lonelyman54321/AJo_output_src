/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfrz;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;

public final class zzfsb
extends Enum
implements zzhbs {
    public static final /* enum */ zzfsb zza;
    public static final /* enum */ zzfsb zzb;
    private static final zzhbt zzc;
    private static final /* synthetic */ zzfsb[] zzd;
    private final int zze;

    static {
        zzfsb zzfsb2;
        int n3 = 1;
        Object object = new zzfsb("BLOCKED_REASON_UNKNOWN", 0, n3);
        zza = object;
        int n4 = 2;
        zzb = zzfsb2 = new zzfsb("BLOCKED_REASON_BACKGROUND", n3, n4);
        zzfsb[] zzfsbArray = new zzfsb[n4];
        zzfsbArray[0] = object;
        zzfsbArray[n3] = zzfsb2;
        zzd = zzfsbArray;
        zzc = object = new zzfrz();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzfsb() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zze = var3_2;
    }

    public static zzfsb[] values() {
        return (zzfsb[])zzd.clone();
    }

    public static zzfsb zzb(int n3) {
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                return null;
            }
            return zzb;
        }
        return zza;
    }

    public final String toString() {
        return Integer.toString(this.zze);
    }

    public final int zza() {
        return this.zze;
    }
}

