/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcl;
import com.google.android.gms.internal.ads.zzdz;
import com.google.android.gms.internal.ads.zzec;
import com.google.android.gms.internal.ads.zzsh;

public final class zzrn {
    private final zzdz[] zza;
    private final zzsh zzb;
    private final zzec zzc;

    public zzrn(zzdz ... zzdzArray) {
        zzsh zzsh2 = new zzsh();
        zzec zzec2 = new zzec();
        zzdz[] zzdzArray2 = new zzdz[2];
        this.zza = zzdzArray2;
        System.arraycopy(zzdzArray, 0, zzdzArray2, 0, 0);
        this.zzb = zzsh2;
        this.zzc = zzec2;
        zzdzArray2[0] = zzsh2;
        zzdzArray2[1] = zzec2;
    }

    public final long zza(long l2) {
        return this.zzc.zzi(l2);
    }

    public final long zzb() {
        return this.zzb.zzo();
    }

    public final zzcl zzc(zzcl zzcl2) {
        zzec zzec2 = this.zzc;
        float f5 = zzcl2.zzc;
        zzec2.zzk(f5);
        zzec2 = this.zzc;
        f5 = zzcl2.zzd;
        zzec2.zzj(f5);
        return zzcl2;
    }

    public final boolean zzd(boolean bl2) {
        this.zzb.zzp(bl2);
        return bl2;
    }

    public final zzdz[] zze() {
        return this.zza;
    }
}

