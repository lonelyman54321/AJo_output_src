/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzci;
import com.google.android.gms.internal.measurement.zzck;

public final class zzcf {
    private static volatile zzci zza;

    static {
        zzck zzck2 = new zzck();
        zza = zzck2;
    }

    public static zzci zza() {
        return zza;
    }
}

