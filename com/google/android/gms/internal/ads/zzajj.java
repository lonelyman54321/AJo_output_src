/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaen;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzaeu;
import com.google.android.gms.internal.ads.zzaji;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgd;
import java.math.RoundingMode;

final class zzajj
implements zzaji {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzajj(long[] lArray, long[] lArray2, long l2, long l3, int n3) {
        this.zza = lArray;
        this.zzb = lArray2;
        this.zzc = l2;
        this.zzd = l3;
        this.zze = n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static zzajj zzb(long l2, long l3, zzaen zzaen2, zzfu zzfu2) {
        zzajj zzajj2;
        Object object;
        long l4;
        long l7;
        long l8;
        long l12 = l2;
        Object object2 = zzaen2;
        Object object3 = zzfu2;
        zzfu2.zzL(10);
        int n3 = zzfu2.zzg();
        if (n3 <= 0) return null;
        int n4 = zzaen2.zzd;
        int n7 = 32000;
        n7 = n4 >= n7 ? 1152 : 576;
        long l14 = n7;
        long l15 = 1000000L;
        long l16 = l14 * l15;
        long l17 = n4;
        long l18 = n3;
        RoundingMode roundingMode = RoundingMode.FLOOR;
        long l19 = zzgd.zzt(l18, l16, l17, roundingMode);
        n7 = zzfu2.zzq();
        int n8 = zzfu2.zzq();
        int n10 = zzfu2.zzq();
        ((zzfu)object3).zzL(2);
        int n14 = ((zzaen)object2).zzc;
        l18 = n14;
        l18 = l3 + l18;
        long[] lArray = new long[n7];
        long[] lArray2 = new long[n7];
        l17 = l3;
        for (int i3 = 0; i3 < n7; ++i3) {
            int n15;
            l8 = (long)i3 * l19;
            l7 = l19;
            l19 = n7;
            lArray[i3] = l8 /= l19;
            lArray2[i3] = l8 = Math.max(l17, l18);
            l4 = 1;
            if (n10 != l4) {
                l4 = 2;
                if (n10 != l4) {
                    n15 = 3;
                    if (n10 != n15) {
                        n15 = 4;
                        if (n10 != n15) {
                            return null;
                        }
                        n15 = zzfu2.zzp();
                    } else {
                        n15 = zzfu2.zzo();
                    }
                } else {
                    n15 = zzfu2.zzq();
                }
            } else {
                l4 = 2;
                n15 = zzfu2.zzm();
            }
            l19 = n8;
            l8 = (long)n15 * l19;
            l17 += l8;
            object2 = zzaen2;
            object3 = zzfu2;
            l19 = l7;
        }
        l7 = l19;
        l8 = -1;
        long l20 = l12 - l8;
        n3 = (int)(l20 == 0L ? 0 : (l20 < 0L ? -1 : 1));
        if (n3 != 0 && (l4 = l12 == l17 ? 0 : (l12 < l17 ? -1 : 1)) != false) {
            object2 = "VBRI data size mismatch: ";
            object3 = ", ";
            object = D70.c(l12, (String)object2, (String)object3);
            ((StringBuilder)object).append(l17);
            object = ((StringBuilder)object).toString();
            String string2 = "VbriSeeker";
            zzfk.zzf(string2, (String)object);
        }
        object = zzaen2;
        n8 = zzaen2.zzf;
        object = zzajj2;
        long[] lArray3 = lArray;
        object2 = lArray2;
        return new zzajj(lArray, lArray2, l7, l17, n8);
    }

    public final long zza() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zze;
    }

    public final long zzd() {
        return this.zzd;
    }

    public final long zze(long l2) {
        long[] lArray = this.zzb;
        long[] lArray2 = this.zza;
        boolean bl2 = true;
        int n3 = zzgd.zzc(lArray, l2, bl2, bl2);
        return lArray2[n3];
    }

    public final zzaer zzg(long l2) {
        Object object;
        int n3;
        long[] lArray = this.zza;
        int n4 = 1;
        int n7 = zzgd.zzc(lArray, l2, n4 != 0, n4 != 0);
        long l3 = lArray[n7];
        lArray = this.zzb;
        long l4 = lArray[n7];
        zzaeu zzaeu2 = new zzaeu(l3, l4);
        l3 = zzaeu2.zzb;
        long l7 = l3 - l2;
        Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object2 < 0 && n7 != (n3 = ((Object)(object = (Object)this.zza)).length + -1)) {
            Object object3 = object[n7 += n4];
            l3 = this.zzb[n7];
            zzaeu zzaeu3 = new zzaeu((long)object3, l3);
            object = new zzaer(zzaeu2, zzaeu3);
            return object;
        }
        object = new zzaer(zzaeu2, zzaeu2);
        return object;
    }

    public final boolean zzh() {
        return true;
    }
}

