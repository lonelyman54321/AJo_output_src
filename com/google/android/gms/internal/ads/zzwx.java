/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzzo;
import com.google.android.gms.internal.ads.zzzp;

final class zzwx
implements zzzp {
    public long zza;
    public long zzb;
    public zzzo zzc;
    public zzwx zzd;

    public zzwx(long l2, int n3) {
        this.zze(l2, 65536);
    }

    public final int zza(long l2) {
        long l3 = this.zza;
        int cfr_ignored_0 = this.zzc.zzb;
        return (int)(l2 -= l3);
    }

    public final zzwx zzb() {
        this.zzc = null;
        zzwx zzwx2 = this.zzd;
        this.zzd = null;
        return zzwx2;
    }

    public final zzzo zzc() {
        zzzo zzzo2 = this.zzc;
        zzzo2.getClass();
        return zzzo2;
    }

    public final zzzp zzd() {
        zzzo zzzo2;
        zzwx zzwx2 = this.zzd;
        if (zzwx2 != null && (zzzo2 = zzwx2.zzc) != null) {
            return zzwx2;
        }
        return null;
    }

    public final void zze(long l2, int n3) {
        zzzo zzzo2 = this.zzc;
        if (zzzo2 == null) {
            n3 = 1;
        } else {
            n3 = 0;
            zzzo2 = null;
        }
        zzeq.zzf(n3 != 0);
        this.zza = l2;
        this.zzb = l2 += 65536L;
    }
}

