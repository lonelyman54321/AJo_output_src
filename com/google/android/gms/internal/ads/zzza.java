/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzde;

abstract class zzza {
    public final int zza;
    public final zzde zzb;
    public final int zzc;
    public final zzan zzd;

    public zzza(int n3, zzde zzde2, int n4) {
        zzan zzan2;
        this.zza = n3;
        this.zzb = zzde2;
        this.zzc = n4;
        this.zzd = zzan2 = zzde2.zzb(n4);
    }

    public abstract int zzb();

    public abstract boolean zzc(zzza var1);
}

