/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzaeu;
import com.google.android.gms.internal.ads.zzahv;
import com.google.android.gms.internal.ads.zzaji;
import com.google.android.gms.internal.ads.zzgd;

final class zzajd
implements zzaji {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzajd(long[] lArray, long[] lArray2, long l2) {
        this.zza = lArray;
        this.zzb = lArray2;
        long l3 = -9223372036854775807L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 == false) {
            l4 = lArray2.length + -1;
            long l7 = lArray2[l4];
            l2 = zzgd.zzr(l7);
        }
        this.zzc = l2;
    }

    public static zzajd zzb(long l2, zzahv zzahv2, long l3) {
        long l4;
        int[] nArray = zzahv2.zzd;
        int n3 = nArray.length;
        int n4 = n3 + 1;
        long[] lArray = new long[n4];
        long[] lArray2 = new long[n4];
        lArray[0] = l2;
        lArray2[0] = l4 = 0L;
        for (int i3 = 1; i3 <= n3; ++i3) {
            int n7 = zzahv2.zzb;
            int[] nArray2 = zzahv2.zzd;
            int n8 = i3 + -1;
            int n10 = nArray2[n8];
            long l7 = n7 + n10;
            l2 += l7;
            n7 = zzahv2.zzc;
            nArray2 = zzahv2.zze;
            n10 = nArray2[n8];
            l7 = n7 += n10;
            lArray[i3] = l2;
            lArray2[i3] = l4 += l7;
        }
        zzajd zzajd2 = new zzajd(lArray, lArray2, l3);
        return zzajd2;
    }

    private static Pair zzf(long l2, long[] lArray, long[] lArray2) {
        double d2;
        int n3 = 1;
        int n4 = zzgd.zzc(lArray, l2, n3 != 0, n3 != 0);
        long l3 = lArray[n4];
        long l4 = lArray2[n4];
        if ((n4 += n3) == (n3 = lArray.length)) {
            Long l7 = l3;
            Long l8 = l4;
            return Pair.create((Object)l7, (Object)l8);
        }
        long l12 = lArray[n4];
        long l14 = lArray2[n4];
        n3 = (int)(l12 == l3 ? 0 : (l12 < l3 ? -1 : 1));
        if (n3 == 0) {
            d2 = 0.0;
        } else {
            d2 = l2;
            double d5 = l3;
            d2 -= d5;
            double d7 = l12 -= l3;
            d2 /= d7;
        }
        double d9 = l14 - l4;
        l14 = (long)(d2 * d9) + l4;
        Long l15 = l2;
        Long l16 = l14;
        return Pair.create((Object)l15, (Object)l16);
    }

    public final long zza() {
        return this.zzc;
    }

    public final int zzc() {
        return -2147483647;
    }

    public final long zzd() {
        return -1;
    }

    public final long zze(long l2) {
        long[] lArray = this.zza;
        long[] lArray2 = this.zzb;
        return zzgd.zzr((Long)zzajd.zzf((long)l2, (long[])lArray, (long[])lArray2).second);
    }

    public final zzaer zzg(long l2) {
        long l3 = this.zzc;
        l2 = Math.min(l2, l3);
        l2 = zzgd.zzu(Math.max(0L, l2));
        long[] lArray = this.zzb;
        long[] lArray2 = this.zza;
        Pair pair = zzajd.zzf(l2, lArray, lArray2);
        l3 = zzgd.zzr((Long)pair.first);
        l2 = (Long)pair.second;
        zzaeu zzaeu2 = new zzaeu(l3, l2);
        zzaer zzaer2 = new zzaer(zzaeu2, zzaeu2);
        return zzaer2;
    }

    public final boolean zzh() {
        return true;
    }
}

