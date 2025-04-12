/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzftw;
import com.google.android.gms.internal.ads.zzftx;

public final class zzftu {
    private static volatile zzftw zza;

    static {
        zzftx zzftx2 = new zzftx();
        zza = zzftx2;
    }

    public static zzftw zza() {
        return zza;
    }
}

