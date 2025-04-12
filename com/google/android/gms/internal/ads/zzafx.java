/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadc;
import com.google.android.gms.internal.ads.zzadd;
import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzady;
import com.google.android.gms.internal.ads.zzaeb;
import com.google.android.gms.internal.ads.zzaec;
import com.google.android.gms.internal.ads.zzaeg;
import com.google.android.gms.internal.ads.zzafw;
import com.google.android.gms.internal.ads.zzfu;

final class zzafx
implements zzadd {
    private final zzaeg zza;
    private final int zzb;
    private final zzaeb zzc;

    public /* synthetic */ zzafx(zzaeg object, int n3, zzafw zzafw2) {
        this.zza = object;
        this.zzb = n3;
        this.zzc = object = new zzaeb();
    }

    private final long zzc(zzadv zzadv2) {
        long l2;
        long l3;
        int n3;
        long l4;
        long l7;
        long l8;
        zzafx zzafx2 = this;
        zzadv zzadv3 = zzadv2;
        while (true) {
            int n4;
            l8 = zzadv2.zze();
            l7 = zzadv2.zzd();
            l4 = -6;
            long l12 = l8 - (l7 += l4);
            Object object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object >= 0) break;
            zzaeg zzaeg2 = zzafx2.zza;
            n3 = zzafx2.zzb;
            zzaeb zzaeb2 = zzafx2.zzc;
            long l14 = zzadv2.zze();
            int n7 = 2;
            byte[] byArray = new byte[n7];
            zzadv zzadv4 = zzadv3;
            zzadv4 = (zzadi)zzadv3;
            ((zzadi)zzadv4).zzm(byArray, 0, n7, false);
            int n8 = byArray[0] & 0xFF;
            int n10 = 1;
            int n14 = byArray[n10] & 0xFF;
            n8 = n8 << 8 | n14;
            if (n8 != n3) {
                zzadv2.zzj();
                l8 = zzadv2.zzf();
                n4 = (int)(l14 -= l8);
                ((zzadi)zzadv4).zzl(n4, false);
            } else {
                zzfu zzfu2 = new zzfu(16);
                byte[] byArray2 = zzfu2.zzM();
                System.arraycopy(byArray, 0, byArray2, 0, n7);
                byArray = zzfu2.zzM();
                n14 = 14;
                n7 = zzady.zza(zzadv3, byArray, n7, n14);
                zzfu2.zzJ(n7);
                zzadv2.zzj();
                long l15 = zzadv2.zzf();
                n7 = (int)(l14 -= l15);
                ((zzadi)zzadv4).zzl(n7, false);
                n4 = (int)(zzaec.zzc(zzfu2, zzaeg2, n3, zzaeb2) ? 1 : 0);
                if (n4 != 0) break;
            }
            ((zzadi)zzadv4).zzl(n10, false);
        }
        if ((l3 = (l2 = (l8 = zzadv2.zze()) - (l7 = zzadv2.zzd() + l4)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) >= 0) {
            l8 = zzadv2.zzd();
            l7 = zzadv2.zze();
            zzadv3 = (zzadi)zzadv3;
            n3 = (int)(l8 -= l7);
            ((zzadi)zzadv3).zzl(n3, false);
            return zzafx2.zza.zzj;
        }
        return zzafx2.zzc.zza;
    }

    public final zzadc zza(zzadv zzadv2, long l2) {
        Object object;
        zzaeg zzaeg2 = this.zza;
        int n3 = zzaeg2.zzc;
        long l3 = zzadv2.zzf();
        long l4 = this.zzc(zzadv2);
        long l7 = zzadv2.zze();
        int n4 = 6;
        n3 = Math.max(n4, n3);
        zzadv zzadv3 = zzadv2;
        zzadv3 = (zzadi)zzadv2;
        ((zzadi)zzadv3).zzl(n3, false);
        n3 = (int)(l4 == l2 ? 0 : (l4 < l2 ? -1 : 1));
        long l8 = this.zzc(zzadv2);
        long l12 = zzadv2.zze();
        if (n3 <= 0 && (object = l8 == l2 ? 0 : (l8 < l2 ? -1 : 1)) > 0) {
            return zzadc.zze(l7);
        }
        object = l8 == l2 ? 0 : (l8 < l2 ? -1 : 1);
        if (object <= 0) {
            return zzadc.zzf(l8, l12);
        }
        return zzadc.zzd(l4, l3);
    }

    public final /* synthetic */ void zzb() {
    }
}

