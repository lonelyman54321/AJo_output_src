/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.ads.zzbeh;
import com.google.android.gms.internal.ads.zzbei;
import com.google.android.gms.internal.ads.zzben;

public final class zzba {
    private static final zzba zza;
    private final zzbeh zzb;
    private final zzbei zzc;
    private final zzben zzd;

    static {
        zzba zzba2;
        zza = zzba2 = new zzba();
    }

    public zzba() {
        zzbeh zzbeh2 = new zzbeh();
        zzbei zzbei2 = new zzbei();
        zzben zzben2 = new zzben();
        this.zzb = zzbeh2;
        this.zzc = zzbei2;
        this.zzd = zzben2;
    }

    public static zzbeh zza() {
        return zzba.zza.zzb;
    }

    public static zzbei zzb() {
        return zzba.zza.zzc;
    }

    public static zzben zzc() {
        return zzba.zza.zzd;
    }
}

