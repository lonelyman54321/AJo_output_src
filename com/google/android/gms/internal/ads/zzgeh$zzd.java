/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

final class zzgeh$zzd {
    static final zzgeh$zzd zza;
    zzgeh$zzd next;
    final Runnable zzb;
    final Executor zzc;

    static {
        zzgeh$zzd zzgeh$zzd;
        zza = zzgeh$zzd = new zzgeh$zzd();
    }

    public zzgeh$zzd() {
        this.zzb = null;
        this.zzc = null;
    }

    public zzgeh$zzd(Runnable runnable2, Executor executor) {
        this.zzb = runnable2;
        this.zzc = executor;
    }
}

