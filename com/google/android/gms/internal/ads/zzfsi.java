/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfsg;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;

public final class zzfsi
extends Enum
implements zzhbs {
    public static final /* enum */ zzfsi zza;
    public static final /* enum */ zzfsi zzb;
    private static final zzhbt zzc;
    private static final /* synthetic */ zzfsi[] zzd;
    private final int zze;

    static {
        zzfsi zzfsi2;
        Object object = new zzfsi("EVENT_TYPE_UNKNOWN", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzfsi2 = new zzfsi("BLOCKED_IMPRESSION", n3, n3);
        zzfsi[] zzfsiArray = new zzfsi[2];
        zzfsiArray[0] = object;
        zzfsiArray[n3] = zzfsi2;
        zzd = zzfsiArray;
        zzc = object = new zzfsg();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzfsi() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zze = var3_2;
    }

    public static zzfsi[] values() {
        return (zzfsi[])zzd.clone();
    }

    public static zzfsi zzb(int n3) {
        if (n3 != 0) {
            int n4 = 1;
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

