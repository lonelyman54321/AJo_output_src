/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgeh;

final class zzgeh$zzb {
    static final zzgeh$zzb zza;
    static final zzgeh$zzb zzb;
    final boolean zzc;
    final Throwable zzd;

    static {
        boolean bl2 = zzgeh.zzd;
        if (bl2) {
            zzb = null;
            zza = null;
        } else {
            zzgeh$zzb zzgeh$zzb;
            zzb = zzgeh$zzb = new zzgeh$zzb(false, null);
            zza = zzgeh$zzb = new zzgeh$zzb(true, null);
        }
    }

    public zzgeh$zzb(boolean bl2, Throwable throwable) {
        this.zzc = bl2;
        this.zzd = throwable;
    }
}

