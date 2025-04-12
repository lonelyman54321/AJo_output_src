/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaef;
import com.google.android.gms.internal.ads.zzaeg;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzaet;
import com.google.android.gms.internal.ads.zzaeu;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzgd;

public final class zzaee
implements zzaet {
    private final zzaeg zza;
    private final long zzb;

    public zzaee(zzaeg zzaeg2, long l2) {
        this.zza = zzaeg2;
        this.zzb = l2;
    }

    private final zzaeu zzb(long l2, long l3) {
        int n3 = this.zza.zze;
        l2 *= 1000000L;
        long l4 = n3;
        long l7 = this.zzb + l3;
        zzaeu zzaeu2 = new zzaeu(l2 /= l4, l7);
        return zzaeu2;
    }

    public final long zza() {
        return this.zza.zza();
    }

    public final zzaer zzg(long l2) {
        int n3;
        zzeq.zzb(this.zza.zzk);
        zzaeg zzaeg2 = this.zza;
        Object object = zzaeg2.zzk;
        long[] lArray = ((zzaef)object).zza;
        object = ((zzaef)object).zzb;
        long l3 = zzaeg2.zzb(l2);
        zzaeg2 = null;
        int n4 = 1;
        int n7 = zzgd.zzc(lArray, l3, n4 != 0, false);
        l3 = 0L;
        int n8 = -1;
        long l4 = n7 == n8 ? l3 : lArray[n7];
        if (n7 != n8) {
            l3 = (long)object[n7];
        }
        zzaeu zzaeu2 = this.zzb(l4, l3);
        l4 = zzaeu2.zzb;
        long l7 = l4 == l2 ? 0 : (l4 < l2 ? -1 : 1);
        if (l7 != false && n7 != (n3 = lArray.length + n8)) {
            l2 = lArray[n7 += n4];
            Object object2 = object[n7];
            zzaeu zzaeu3 = this.zzb(l2, (long)object2);
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

