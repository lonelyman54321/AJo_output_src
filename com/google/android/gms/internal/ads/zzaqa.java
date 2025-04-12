/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzaet;
import com.google.android.gms.internal.ads.zzaeu;
import com.google.android.gms.internal.ads.zzapx;
import com.google.android.gms.internal.ads.zzgd;
import java.math.RoundingMode;

final class zzaqa
implements zzaet {
    private final zzapx zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzaqa(zzapx zzapx2, int n3, long l2, long l3) {
        this.zza = zzapx2;
        this.zzb = n3;
        this.zzc = l2;
        long l4 = zzapx2.zzd;
        this.zzd = l3 = (l3 - l2) / l4;
        this.zze = l4 = this.zzb(l3);
    }

    private final long zzb(long l2) {
        long l3 = this.zza.zzc;
        RoundingMode roundingMode = RoundingMode.FLOOR;
        long l4 = this.zzb;
        return zzgd.zzt(l2 * l4, 1000000L, l3, roundingMode);
    }

    public final long zza() {
        return this.zze;
    }

    public final zzaer zzg(long l2) {
        long l3;
        int n3 = this.zzb;
        long l4 = n3;
        long l7 = this.zzd;
        long l8 = (long)this.zza.zzc * l2;
        l4 = -1;
        l7 += l4;
        l7 = Math.min(l8 /= (l4 *= 1000000L), l7);
        l7 = Math.max(0L, l7);
        int n4 = this.zza.zzd;
        l8 = (long)n4 * l7;
        long l12 = this.zzb(l7);
        long l14 = this.zzc + l8;
        zzaeu zzaeu2 = new zzaeu(l12, l14);
        Object object = l12 == l2 ? 0 : (l12 < l2 ? -1 : 1);
        if (object < 0 && (n3 = (int)((l3 = l7 - (l2 = this.zzd + l4)) == 0L ? 0 : (l3 < 0L ? -1 : 1))) != 0) {
            l2 = this.zzc;
            zzapx zzapx2 = this.zza;
            long l15 = this.zzb(++l7);
            l4 = zzapx2.zzd;
            l7 = l7 * l4 + l2;
            zzaeu zzaeu3 = new zzaeu(l15, l7);
            zzaer zzaer2 = new zzaer(zzaeu2, zzaeu3);
            return zzaer2;
        }
        zzaer zzaer3 = new zzaer(zzaeu2, zzaeu2);
        return zzaer3;
    }

    public final boolean zzh() {
        return true;
    }
}

