/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.common;

import com.google.android.gms.internal.common.zzd;
import com.google.android.gms.internal.common.zze;

public final class zzg {
    private static final zzd zza;
    private static volatile zzd zzb;

    static {
        zze zze2 = new zze(null);
        zza = zze2;
        zzb = zze2;
    }

    public static zzd zza() {
        return zzb;
    }
}

