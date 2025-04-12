/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzaee;
import com.google.android.gms.internal.ads.zzaef;
import com.google.android.gms.internal.ads.zzaeg;
import com.google.android.gms.internal.ads.zzaet;
import com.google.android.gms.internal.ads.zzald;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzgd;

final class zzakx
implements zzald {
    private final zzaeg zza;
    private final zzaef zzb;
    private long zzc;
    private long zzd;

    public zzakx(zzaeg zzaeg2, zzaef zzaef2) {
        long l2;
        this.zza = zzaeg2;
        this.zzb = zzaef2;
        this.zzc = l2 = (long)-1;
        this.zzd = l2;
    }

    public final void zza(long l2) {
        this.zzc = l2;
    }

    public final long zzd(zzadv zzadv2) {
        long l2 = this.zzd;
        long l3 = 0L;
        long l4 = -1;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object >= 0) {
            this.zzd = l4;
            return -(l2 += (long)2);
        }
        return l4;
    }

    public final zzaet zze() {
        zzaee zzaee2;
        boolean bl2;
        long l2 = this.zzc;
        long l3 = -1;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            bl2 = true;
        } else {
            bl2 = false;
            zzaee2 = null;
        }
        zzeq.zzf(bl2);
        long l7 = this.zzc;
        zzaeg zzaeg2 = this.zza;
        zzaee2 = new zzaee(zzaeg2, l7);
        return zzaee2;
    }

    public final void zzg(long l2) {
        long[] lArray = this.zzb.zza;
        boolean bl2 = true;
        int n3 = zzgd.zzc(lArray, l2, bl2, bl2);
        this.zzd = l2 = lArray[n3];
    }
}

