/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzin;
import com.google.android.gms.internal.ads.zzlj;
import com.google.android.gms.internal.ads.zzxf;

final class zzxm
implements zzxf {
    private final zzxf zza;
    private final long zzb;

    public zzxm(zzxf zzxf2, long l2) {
        this.zza = zzxf2;
        this.zzb = l2;
    }

    public final int zza(zzlj zzlj2, zzin zzin2, int n3) {
        zzxf zzxf2 = this.zza;
        int n4 = zzxf2.zza(zzlj2, zzin2, n3);
        if (n4 == (n3 = -4)) {
            long l2 = zzin2.zze;
            long l3 = this.zzb;
            zzin2.zze = l2 += l3;
            return n3;
        }
        return n4;
    }

    public final int zzb(long l2) {
        long l3 = this.zzb;
        zzxf zzxf2 = this.zza;
        return zzxf2.zzb(l2 -= l3);
    }

    public final zzxf zzc() {
        return this.zza;
    }

    public final void zzd() {
        this.zza.zzd();
    }

    public final boolean zze() {
        return this.zza.zze();
    }
}

