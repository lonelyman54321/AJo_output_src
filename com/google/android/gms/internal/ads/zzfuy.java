/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfuw;
import com.google.android.gms.internal.ads.zzfux;

public final class zzfuy {
    public static final zzfuw zza;
    private static final zzfuy zzb;
    private static volatile zzfuy zzc;

    static {
        Object object = new zzfux();
        zza = object;
        zzb = object = new zzfuy();
        zzc = object;
    }

    public static zzfuy zza() {
        return zzc;
    }
}

