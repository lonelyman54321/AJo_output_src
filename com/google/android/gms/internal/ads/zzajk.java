/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaen;
import com.google.android.gms.internal.ads.zzfu;

final class zzajk {
    public final zzaen zza;
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public final int zze;
    public final long[] zzf;

    private zzajk(zzaen zzaen2, long l2, long l3, long[] lArray, int n3, int n4) {
        this.zza = zzaen2;
        this.zzb = l2;
        this.zzc = l3;
        this.zzf = lArray;
        this.zzd = n3;
        this.zze = n4;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static zzajk zza(zzaen zzaen2, zzfu object) {
        int n3;
        int n4;
        long[] lArray;
        long l2;
        int n7 = ((zzfu)object).zzg();
        int n8 = n7 & 1;
        int n10 = -1;
        n8 = n8 != 0 ? ((zzfu)object).zzp() : -1;
        int n14 = n7 & 2;
        long l3 = n14 != 0 ? ((zzfu)object).zzu() : (long)-1;
        long l4 = l3;
        n14 = n7 & 4;
        int n15 = 4;
        if (n14 == n15) {
            n14 = 100;
            long[] lArray2 = new long[n14];
            for (int i3 = 0; i3 < n14; ++i3) {
                int n16 = ((zzfu)object).zzm();
                lArray2[i3] = l2 = (long)n16;
            }
            lArray = lArray2;
        } else {
            n14 = 0;
            lArray = null;
        }
        if ((n7 &= 8) != 0) {
            ((zzfu)object).zzL(n15);
        }
        if ((n7 = ((zzfu)object).zzb()) >= (n14 = 24)) {
            n7 = 21;
            ((zzfu)object).zzL(n7);
            int n17 = ((zzfu)object).zzo();
            n10 = n17 >> 12;
            n4 = n17 &= 0xFFF;
            n3 = n10;
        } else {
            n3 = -1;
            n4 = -1;
        }
        l2 = n8;
        Object object2 = object;
        return new zzajk(zzaen2, l2, l4, lArray, n3, n4);
    }
}

