/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzade;
import com.google.android.gms.internal.ads.zzaeg;
import com.google.android.gms.internal.ads.zzafv;
import com.google.android.gms.internal.ads.zzafx;
import java.util.Objects;

final class zzafy
extends zzade {
    public zzafy(zzaeg zzaeg2, int n3, long l2, long l3) {
        long l4;
        long l7;
        long l8;
        Object object = zzaeg2;
        Objects.requireNonNull(zzaeg2);
        zzafv zzafv2 = new zzafv(zzaeg2);
        zzafx zzafx2 = new zzafx(zzaeg2, n3, null);
        long l12 = zzaeg2.zza();
        long l14 = zzaeg2.zzj;
        int n4 = zzaeg2.zzd;
        if (n4 > 0) {
            int n7 = zzaeg2.zzc;
            l8 = n7;
            long l15 = ((long)n4 + l8) / (long)2;
            l8 = 1L;
            l7 = l15 += l8;
        } else {
            n4 = zzaeg2.zza;
            int n8 = zzaeg2.zzb;
            l8 = 4096L;
            if (n4 == n8 && n4 > 0) {
                l8 = n4;
            }
            n4 = ((zzaeg)object).zzg;
            long l16 = n4;
            int n10 = ((zzaeg)object).zzh;
            l4 = n10;
            l8 = l8 * l16 * l4 / (long)8;
            l16 = 64;
            l7 = l8 += l16;
        }
        int n14 = ((zzaeg)object).zzc;
        int n15 = Math.max(6, n14);
        object = this;
        l8 = l2;
        l4 = l3;
        super(zzafv2, zzafx2, l12, 0L, l14, l2, l3, l7, n15);
    }
}

