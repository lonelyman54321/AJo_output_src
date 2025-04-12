/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaen;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzaeu;
import com.google.android.gms.internal.ads.zzaji;
import com.google.android.gms.internal.ads.zzajk;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzgd;

final class zzajl
implements zzaji {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final int zzd;
    private final long zze;
    private final long zzf;
    private final long[] zzg;

    private zzajl(long l2, int n3, long l3, int n4, long l4, long[] lArray) {
        this.zza = l2;
        this.zzb = n3;
        this.zzc = l3;
        this.zzd = n4;
        this.zze = l4;
        this.zzg = lArray;
        long l7 = -1;
        long l8 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
        if (l8 != false) {
            l7 = l2 + l4;
        }
        this.zzf = l7;
    }

    public static zzajl zzb(long l2, zzajk zzajk2, long l3) {
        long l4 = l2;
        Object object = zzajk2;
        long l7 = zzajk2.zzb;
        long l8 = -1;
        long l12 = l7 - l8;
        Object object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object2 == false) {
            l7 = l8;
        }
        Object object3 = ((zzajk)object).zza;
        int n3 = ((zzaen)object3).zzg;
        long l14 = n3;
        l7 = l7 * l14 + l8;
        object2 = ((zzaen)object3).zzd;
        long l15 = zzgd.zzs(l7, (int)object2);
        l7 = ((zzajk)object).zzc;
        long l16 = l7 - l8;
        object2 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
        if (object2 != false && (object3 = (Object)((zzajk)object).zzf) != null) {
            Object object4;
            Object object5;
            long l17;
            long l18;
            object2 = l4 == l8 ? 0 : (l4 < l8 ? -1 : 1);
            if (object2 != false && (l18 = (l17 = l4 - (l7 = l3 + l7)) == 0L ? 0 : (l17 < 0L ? -1 : 1)) != false) {
                String string2 = "XING data size mismatch: ";
                String string3 = ", ";
                object5 = D70.c(l4, string2, string3);
                ((StringBuilder)object5).append(l7);
                object5 = ((StringBuilder)object5).toString();
                object4 = "XingSeeker";
                zzfk.zzf((String)object4, (String)object5);
            }
            object5 = ((zzajk)object).zza;
            l7 = ((zzajk)object).zzc;
            object4 = ((zzajk)object).zzf;
            int n4 = ((zzaen)object5).zzc;
            int n7 = ((zzaen)object5).zzf;
            object = new zzajl(l3, n4, l15, n7, l7, (long[])object4);
            return object;
        }
        zzaen zzaen2 = ((zzajk)object).zza;
        int n8 = zzaen2.zzc;
        int n10 = zzaen2.zzf;
        zzajl zzajl2 = new zzajl(l3, n8, l15, n10, -1, null);
        return zzajl2;
    }

    private final long zzf(int n3) {
        long l2 = this.zzc;
        long l3 = n3;
        return l2 * l3 / (long)100;
    }

    public final long zza() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final long zzd() {
        return this.zzf;
    }

    public final long zze(long l2) {
        int n3 = this.zzh();
        if (n3 != 0) {
            long l3 = this.zza;
            n3 = this.zzb;
            long l4 = (l2 -= l3) - (l3 = (long)n3);
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object > 0) {
                double d2;
                long[] lArray = this.zzg;
                zzeq.zzb(lArray);
                double d5 = l2;
                long l7 = this.zze;
                double d7 = 256.0;
                d5 *= d7;
                double d9 = l7;
                l7 = (long)(d5 /= d9);
                boolean bl2 = true;
                int n4 = zzgd.zzc(lArray, l7, bl2, bl2);
                long l8 = this.zzf(n4);
                long l12 = lArray[n4];
                int n7 = n4 + 1;
                long l14 = this.zzf(n7);
                int n8 = 99;
                if (n4 == n8) {
                    l3 = 256L;
                    d2 = 1.265E-321;
                } else {
                    long l15;
                    l3 = l15 = lArray[n7];
                }
                n7 = (int)(l12 == l3 ? 0 : (l12 < l3 ? -1 : 1));
                if (n7 == 0) {
                    l2 = 0L;
                    d5 = 0.0;
                } else {
                    double d12 = l12;
                    d5 -= d12;
                    d2 = l3 -= l12;
                    d5 /= d2;
                }
                d2 = l14 - l8;
                return Math.round(d5 * d2) + l8;
            }
        }
        return 0L;
    }

    public final zzaer zzg(long l2) {
        int n3 = this.zzh();
        long l3 = 0L;
        if (n3 == 0) {
            l2 = this.zza;
            n3 = this.zzb;
            long l4 = n3;
            zzaeu zzaeu2 = new zzaeu(l3, l2 += l4);
            zzaer zzaer2 = new zzaer(zzaeu2, zzaeu2);
            return zzaer2;
        }
        long l7 = this.zzc;
        l2 = Math.min(l2, l7);
        l2 = Math.max(l3, l2);
        double d2 = l2;
        long l8 = this.zzc;
        long l12 = 4636737291354636288L;
        double d5 = 100.0;
        d2 *= d5;
        double d7 = l8;
        d2 /= d7;
        l8 = 0L;
        d7 = 0.0;
        long l14 = 0x4070000000000000L;
        double d9 = 256.0;
        Object object = d2 == d7 ? 0 : (d2 < d7 ? -1 : 1);
        if (object > 0) {
            Object object2 = d2 == d5 ? 0 : (d2 > d5 ? 1 : -1);
            if (object2 >= 0) {
                l8 = l14;
                d7 = d9;
            } else {
                double d12;
                object2 = (int)d2;
                long[] lArray = this.zzg;
                zzeq.zzb(lArray);
                l12 = lArray[object2];
                d5 = l12;
                object = 99;
                if (object2 == object) {
                    long l15 = l14;
                    d12 = d9;
                } else {
                    object = object2 + true;
                    long l16 = lArray[object];
                    d12 = l16;
                }
                d7 = object2;
                d12 = (d12 - d5) * (d2 -= d7);
                d7 = d12 + d5;
            }
        }
        long l17 = this.zze;
        int n4 = this.zzb;
        double d13 = l17;
        l8 = Math.round((d7 /= d9) * d13);
        l17 += (long)-1;
        l17 = Math.min(l8, l17);
        l17 = Math.max((long)n4, l17);
        l8 = this.zza + l17;
        zzaeu zzaeu3 = new zzaeu(l2, l8);
        zzaer zzaer3 = new zzaer(zzaeu3, zzaeu3);
        return zzaer3;
    }

    public final boolean zzh() {
        long[] lArray = this.zzg;
        return lArray != null;
    }
}

