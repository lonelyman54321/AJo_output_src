/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzox;
import com.google.android.gms.internal.gtm.zzpy;

public final class zzpk {
    private final byte[] zza;
    private final long zzb;
    private final zzox zzc;
    private final zzpy zzd;

    public zzpk(zzox zzox2, byte[] byArray, zzpy zzpy2, long l2) {
        this.zzc = zzox2;
        this.zza = byArray;
        this.zzd = zzpy2;
        this.zzb = l2;
    }

    public final long zza() {
        return this.zzb;
    }

    public final zzox zzb() {
        return this.zzc;
    }

    public final zzpy zzc() {
        return this.zzd;
    }

    public final byte[] zzd() {
        return this.zza;
    }
}

