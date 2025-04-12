/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.stats;

import com.google.android.gms.internal.stats.zze;
import com.google.android.gms.internal.stats.zzg;

public final class zzh {
    private static final zze zza;
    private static volatile zze zzb;

    static {
        zzg zzg2 = new zzg(null);
        zza = zzg2;
        zzb = zzg2;
    }

    public static zze zza() {
        return zzb;
    }
}

