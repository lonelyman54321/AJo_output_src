/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.common;

import com.google.android.gms.internal.common.zzaa;
import com.google.android.gms.internal.common.zzm;
import com.google.android.gms.internal.common.zzr;

abstract class zzz
extends zzm {
    final CharSequence zzb;
    final zzr zzc;
    final boolean zzd;
    int zze = 0;
    int zzf;

    public zzz(zzaa zzaa2, CharSequence charSequence) {
        boolean bl2;
        zzr zzr2;
        this.zzc = zzr2 = zzaa.zza(zzaa2);
        this.zzd = bl2 = zzaa.zzg(zzaa2);
        this.zzf = -1 >>> 1;
        this.zzb = charSequence;
    }

    public abstract int zzc(int var1);

    public abstract int zzd(int var1);
}

