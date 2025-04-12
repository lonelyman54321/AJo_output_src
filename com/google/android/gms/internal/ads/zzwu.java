/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbu;
import com.google.android.gms.internal.ads.zzha;
import com.google.android.gms.internal.ads.zzsl;
import com.google.android.gms.internal.ads.zzst;
import com.google.android.gms.internal.ads.zzwa;
import com.google.android.gms.internal.ads.zzwt;
import com.google.android.gms.internal.ads.zzww;
import com.google.android.gms.internal.ads.zzzz;

public final class zzwu
implements zzwa {
    private final zzha zzc;
    private int zzd;
    private final zzwt zze;
    private final zzzz zzf;
    private final zzsl zzg;

    public zzwu(zzha zzha2, zzwt zzwt2) {
        zzsl zzsl2 = new zzsl();
        zzzz zzzz2 = new zzzz(-1);
        this.zzc = zzha2;
        this.zze = zzwt2;
        this.zzg = zzsl2;
        this.zzf = zzzz2;
        this.zzd = 0x100000;
    }

    public final zzwu zza(int n3) {
        this.zzd = n3;
        return this;
    }

    public final zzww zzb(zzbu zzbu2) {
        zzbu2.zzd.getClass();
        zzha zzha2 = this.zzc;
        zzwt zzwt2 = this.zze;
        zzzz zzzz2 = this.zzf;
        zzst zzst2 = zzst.zza;
        int n3 = this.zzd;
        zzww zzww2 = new zzww(zzbu2, zzha2, zzwt2, zzst2, zzzz2, n3, null);
        return zzww2;
    }
}

