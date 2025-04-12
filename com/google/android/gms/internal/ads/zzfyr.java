/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfxl;
import com.google.android.gms.internal.ads.zzfxr;
import com.google.android.gms.internal.ads.zzfyt;

abstract class zzfyr
extends zzfxl {
    final CharSequence zzb;
    final zzfxr zzc;
    int zzd = 0;
    int zze;

    public zzfyr(zzfyt object, CharSequence charSequence) {
        this.zzc = object = zzfyt.zza((zzfyt)object);
        this.zze = -1 >>> 1;
        this.zzb = charSequence;
    }

    public abstract int zzc(int var1);

    public abstract int zzd(int var1);
}

