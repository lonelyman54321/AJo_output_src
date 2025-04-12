/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzdd;

public final class zzde {
    private static volatile zzdb zza;

    static {
        zzdd zzdd2 = new zzdd(null);
        zza = zzdd2;
    }

    public static zzdb zza() {
        return zza;
    }
}

