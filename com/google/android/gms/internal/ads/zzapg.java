/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzaeq;
import com.google.android.gms.internal.ads.zzapq;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgb;
import com.google.android.gms.internal.ads.zzgd;

final class zzapg {
    private final zzgb zza;
    private final zzfu zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private long zzf;
    private long zzg;
    private long zzh;

    public zzapg(int n3) {
        long l2;
        Object object = new zzgb(0L);
        this.zza = object;
        this.zzf = l2 = -9223372036854775807L;
        this.zzg = l2;
        this.zzh = l2;
        this.zzb = object = new zzfu();
    }

    private final int zze(zzadv zzadv2) {
        byte[] byArray = zzgd.zzf;
        int cfr_ignored_0 = byArray.length;
        this.zzb.zzI(byArray, 0);
        this.zzc = true;
        zzadv2.zzj();
        return 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int zza(zzadv object, zzaeq object2, int n3) {
        long l2;
        int n4 = 0;
        if (n3 <= 0) {
            this.zze((zzadv)object);
            return 0;
        }
        boolean bl2 = this.zze;
        byte by2 = 71;
        long l3 = 112800L;
        long l4 = -9223372036854775807L;
        int n7 = 1;
        if (!bl2) {
            long l7 = object.zzd();
            int n8 = (int)Math.min(l3, l7);
            l3 = n8;
            l7 -= l3;
            l3 = object.zzf();
            long l8 = l3 - l7;
            Object object3 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object3 != false) {
                ((zzaeq)object2).zza = l7;
                return 1;
            }
            this.zzb.zzH(n8);
            object.zzj();
            object2 = this.zzb.zzM();
            ((zzadi)object).zzm((byte[])object2, 0, n8, false);
            object = this.zzb;
            int n10 = ((zzfu)object).zzd();
            int n14 = ((zzfu)object).zze();
            block1: for (int i3 = n14 + -188; i3 >= n10; i3 += -1) {
                int n15;
                byte[] byArray = ((zzfu)object).zzM();
                int n16 = 0;
                for (int i8 = -4; i8 <= (n15 = 4); ++i8) {
                    n15 = i8 * 188 + i3;
                    if (n15 < n10 || n15 >= n14 || (n15 = byArray[n15]) != by2) {
                        n16 = 0;
                        continue;
                    }
                    n15 = 5;
                    if ((n16 += n7) != n15) continue;
                    l7 = zzapq.zzb((zzfu)object, i3, n3);
                    long l12 = l7 - l4;
                    Object object4 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                    if (object4 == false) continue block1;
                    l4 = l7;
                    break block1;
                }
            }
            this.zzg = l4;
            this.zze = n7;
            return n4;
        }
        long l14 = this.zzg;
        long l15 = l14 - l4;
        Object object5 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
        if (object5 == false) {
            this.zze((zzadv)object);
            return 0;
        }
        boolean bl3 = this.zzd;
        if (!bl3) {
            l14 = object.zzd();
            int n17 = (int)Math.min(l3, l14);
            l3 = object.zzf();
            long l16 = l3 - (l14 = 0L);
            Object object6 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
            if (object6 != false) {
                ((zzaeq)object2).zza = l14;
                return 1;
            }
            this.zzb.zzH(n17);
            object.zzj();
            object2 = this.zzb.zzM();
            ((zzadi)object).zzm((byte[])object2, 0, n17, false);
            object = this.zzb;
            int n18 = ((zzfu)object).zze();
            for (int i10 = ((zzfu)object).zzd(); i10 < n18; ++i10) {
                long l17;
                long l18;
                byte[] byArray = ((zzfu)object).zzM();
                byte by4 = byArray[i10];
                if (by4 != by2 || (l18 = (l17 = (l3 = zzapq.zzb((zzfu)object, i10, n3)) - l4) == 0L ? 0 : (l17 < 0L ? -1 : 1)) == false) continue;
                l4 = l3;
                break;
            }
            this.zzf = l4;
            this.zzd = n7;
            return n4;
        }
        long l19 = this.zzf;
        long l20 = l19 - l4;
        Object object7 = l20 == 0L ? 0 : (l20 < 0L ? -1 : 1);
        if (object7 == false) {
            this.zze((zzadv)object);
            return 0;
        }
        zzgb zzgb2 = this.zza;
        l19 = zzgb2.zzb(l19);
        long l21 = this.zzg;
        this.zzh = l2 = zzgb2.zzc(l21) - l19;
        this.zze((zzadv)object);
        return 0;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzgb zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}

