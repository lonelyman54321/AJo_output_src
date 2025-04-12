/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzfu;
import com.google.android.gms.internal.gtm.zzfv;

public final class zzfx {
    private static final zzfu zza;
    private static volatile zzfu zzb;

    static {
        zzfv zzfv2 = new zzfv(null);
        zza = zzfv2;
        zzb = zzfv2;
    }

    public static zzfu zza() {
        return zzb;
    }
}

