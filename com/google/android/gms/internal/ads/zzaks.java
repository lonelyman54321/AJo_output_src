/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzakp;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzgd;

final class zzaks {
    public final zzakp zza;
    public final int zzb;
    public final long[] zzc;
    public final int[] zzd;
    public final int zze;
    public final long[] zzf;
    public final int[] zzg;
    public final long zzh;

    public zzaks(zzakp zzakp2, long[] lArray, int[] nArray, int n3, long[] lArray2, int[] nArray2, long l2) {
        int n4 = nArray.length;
        int n7 = lArray2.length;
        boolean bl2 = false;
        n4 = n4 == n7 ? 1 : 0;
        zzeq.zzd(n4 != 0);
        n4 = lArray.length;
        int n8 = n4 == n7 ? 1 : 0;
        zzeq.zzd(n8 != 0);
        n8 = nArray2.length;
        if (n8 == n7) {
            bl2 = true;
        }
        zzeq.zzd(bl2);
        this.zza = zzakp2;
        this.zzc = lArray;
        this.zzd = nArray;
        this.zze = n3;
        this.zzf = lArray2;
        this.zzg = nArray2;
        this.zzh = l2;
        this.zzb = n4;
        if (n8 > 0) {
            int n10 = nArray2[n8 += -1];
            int n14 = 0x20000000;
            nArray2[n8] = n10 |= n14;
        }
    }

    public final int zza(long l2) {
        long[] lArray = this.zzf;
        int n3 = 1;
        for (int i3 = zzgd.zzc(lArray, l2, n3 != 0, false); i3 >= 0; i3 += -1) {
            int[] nArray = this.zzg;
            int n4 = nArray[i3] & n3;
            if (n4 == 0) continue;
            return i3;
        }
        return -1;
    }

    public final int zzb(long l2) {
        Object[] objectArray;
        int n3;
        long[] lArray = this.zzf;
        int n4 = 1;
        for (int i3 = zzgd.zza(lArray, l2, n4 != 0, false); i3 < (n3 = (objectArray = this.zzf).length); ++i3) {
            objectArray = this.zzg;
            n3 = objectArray[i3] & n4;
            if (n3 == 0) continue;
            return i3;
        }
        return -1;
    }
}

