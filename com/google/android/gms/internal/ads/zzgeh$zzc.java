/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgeh$zzc$1;

final class zzgeh$zzc {
    static final zzgeh$zzc zza;
    final Throwable zzb;

    static {
        zzgeh$zzc zzgeh$zzc;
        zzgeh$zzc$1 zzgeh$zzc$1 = new zzgeh$zzc$1("Failure occurred while trying to finish a future.");
        zza = zzgeh$zzc = new zzgeh$zzc(zzgeh$zzc$1);
    }

    public zzgeh$zzc(Throwable throwable) {
        throwable.getClass();
        this.zzb = throwable;
    }
}

