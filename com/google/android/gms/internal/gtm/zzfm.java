/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzfn;
import com.google.android.gms.internal.gtm.zzfo;

public final class zzfm {
    private static volatile zzfn zza;

    static {
        zzfo zzfo2 = new zzfo();
        zza = zzfo2;
    }

    public static zzfn zza() {
        return zza;
    }
}

