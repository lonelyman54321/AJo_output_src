/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadc;
import com.google.android.gms.internal.ads.zzadd;
import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzapq;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgb;
import com.google.android.gms.internal.ads.zzgd;

final class zzape
implements zzadd {
    private final zzgb zza;
    private final zzfu zzb;
    private final int zzc;

    public zzape(int n3, zzgb zzgb2, int n4) {
        zzfu zzfu2;
        this.zzc = n3;
        this.zza = zzgb2;
        this.zzb = zzfu2 = new zzfu();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final zzadc zza(zzadv zzadv2, long l2) {
        long l3;
        int n3;
        int n4;
        zzape zzape2 = this;
        long l4 = zzadv2.zzf();
        long l7 = zzadv2.zzd() - l4;
        l7 = Math.min(112800L, l7);
        int n7 = (int)l7;
        this.zzb.zzH(n7);
        Object object = this.zzb.zzM();
        zzadv zzadv3 = zzadv2;
        zzadv3 = (zzadi)zzadv2;
        ((zzadi)zzadv3).zzm((byte[])object, 0, n7, false);
        object = this.zzb;
        n7 = ((zzfu)object).zze();
        long l8 = -9223372036854775807L;
        long l12 = -1;
        long l14 = l8;
        long l15 = l12;
        while ((n4 = ((zzfu)object).zzb()) >= (n3 = 188)) {
            byte[] byArray = ((zzfu)object).zzM();
            n3 = ((zzfu)object).zzd();
            n4 = zzapq.zza(byArray, n3, n7);
            if ((n3 = n4 + 188) > n7) break;
            int n8 = zzape2.zzc;
            l12 = zzapq.zzb((zzfu)object, n4, n8);
            long l16 = l12 - l8;
            Object object2 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
            if (object2 != false) {
                zzgb zzgb2 = zzape2.zza;
                long l17 = (l12 = zzgb2.zzb(l12)) - l2;
                object2 = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
                if (object2 > 0) {
                    Object object3 = l14 == l8 ? 0 : (l14 < l8 ? -1 : 1);
                    if (object3 != false) return zzadc.zze(l4 += l15);
                    return zzadc.zzd(l12, l4);
                }
                l15 = n4;
                l14 = 100000L + l12;
                long l18 = l14 - l2;
                n4 = (int)(l18 == 0L ? 0 : (l18 < 0L ? -1 : 1));
                if (n4 > 0) {
                    return zzadc.zze(l4 += l15);
                }
                l14 = l12;
            }
            ((zzfu)object).zzK(n3);
            l12 = n3;
        }
        if ((l3 = l14 == l8 ? 0 : (l14 < l8 ? -1 : 1)) == false) return zzadc.zza;
        return zzadc.zzf(l14, l4 += l12);
    }

    public final void zzb() {
        byte[] byArray = zzgd.zzf;
        int cfr_ignored_0 = byArray.length;
        this.zzb.zzI(byArray, 0);
    }
}

