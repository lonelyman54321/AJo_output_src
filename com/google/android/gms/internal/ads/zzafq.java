/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzaeu;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzgd;
import java.util.Arrays;

final class zzafq {
    protected final zzafa zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long[] zzk;
    private int[] zzl;

    public zzafq(int n3, int n4, long l2, int n7, zzafa zzafa2) {
        int n8 = 1;
        int n10 = 2;
        if (n4 != n8) {
            n4 = 2;
        }
        this.zzd = l2;
        this.zze = n7;
        this.zza = zzafa2;
        int n14 = n4 == n10 ? 1667497984 : 1651965952;
        this.zzb = n14 = zzafq.zzi(n3, n14);
        if (n4 == n10) {
            n4 = 1650720768;
            n3 = zzafq.zzi(n3, n4);
        } else {
            n3 = -1;
        }
        this.zzc = n3;
        n3 = 512;
        long[] lArray = new long[n3];
        this.zzk = lArray;
        int[] nArray = new int[n3];
        this.zzl = nArray;
    }

    private static int zzi(int n3, int n4) {
        int n7 = n3 / 10;
        n3 = n3 % 10 + 48 << 8;
        return n3 | (n7 += 48) | n4;
    }

    private final long zzj(int n3) {
        int n4 = this.zze;
        long l2 = this.zzd;
        long l3 = n3;
        l2 *= l3;
        l3 = n4;
        return l2 / l3;
    }

    private final zzaeu zzk(int n3) {
        long l2 = this.zzl[n3];
        long l3 = this.zzj(1);
        long l4 = this.zzk[n3];
        zzaeu zzaeu2 = new zzaeu(l2 *= l3, l4);
        return zzaeu2;
    }

    public final zzaer zza(long l2) {
        int[] nArray = this.zzl;
        Object object = this.zzl;
        int n3 = 1;
        long l3 = this.zzj(n3);
        int n4 = (int)(l2 /= l3);
        int n7 = zzgd.zzb(object, n4, n3 != 0, n3 != 0);
        int n8 = nArray[n7];
        if (n8 == n4) {
            object = this.zzk(n7);
            zzaer zzaer2 = new zzaer((zzaeu)object, (zzaeu)object);
            return zzaer2;
        }
        zzaeu zzaeu2 = this.zzk(n7);
        Object object2 = this.zzk;
        if ((n7 += n3) < (n3 = ((long[])object2).length)) {
            object2 = new zzaer;
            object = this.zzk(n7);
            object2(zzaeu2, (zzaeu)object);
            return object2;
        }
        object = new zzaer;
        object(zzaeu2, zzaeu2);
        return object;
    }

    public final void zzb(long l2) {
        int n3;
        Object[] objectArray;
        int n4 = this.zzj;
        int[] nArray = this.zzl;
        int n7 = nArray.length;
        if (n4 == n7) {
            objectArray = this.zzk;
            n7 = objectArray.length * 3 / 2;
            this.zzk = objectArray = Arrays.copyOf(objectArray, n7);
            objectArray = this.zzl;
            n7 = objectArray.length * 3 / 2;
            objectArray = Arrays.copyOf((int[])objectArray, n7);
            this.zzl = (int[])objectArray;
        }
        objectArray = this.zzk;
        n7 = this.zzj;
        objectArray[n7] = l2;
        int[] nArray2 = this.zzl;
        nArray2[n7] = n3 = this.zzi;
        this.zzj = ++n7;
    }

    public final void zzc() {
        Object[] objectArray = this.zzk;
        int n3 = this.zzj;
        this.zzk = objectArray = Arrays.copyOf(objectArray, n3);
        objectArray = this.zzl;
        n3 = this.zzj;
        objectArray = Arrays.copyOf((int[])objectArray, n3);
        this.zzl = (int[])objectArray;
    }

    public final void zzd() {
        int n3;
        this.zzi = n3 = this.zzi + 1;
    }

    public final void zze(int n3) {
        this.zzf = n3;
        this.zzg = n3;
    }

    public final void zzf(long l2) {
        int n3 = this.zzj;
        if (n3 == 0) {
            this.zzh = 0;
            return;
        }
        long[] lArray = this.zzk;
        boolean bl2 = true;
        int n4 = zzgd.zzc(lArray, l2, bl2, bl2);
        this.zzh = n4 = this.zzl[n4];
    }

    public final boolean zzg(int n3) {
        int n4 = this.zzb;
        return n4 == n3 || (n4 = this.zzc) == n3;
        {
        }
    }

    /*
     * WARNING - void declaration
     */
    public final boolean zzh(zzadv zzadv2) {
        void var2_6;
        int n3;
        int bl2 = this.zzg;
        Object object = this.zza;
        int n4 = object.zzf(zzadv2, bl2, false);
        this.zzg = n3 = bl2 - n4;
        n4 = 1;
        if (n3 == 0) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
        }
        if (var2_6 != false) {
            int n7 = this.zzf;
            if (n7 > 0) {
                zzafa zzafa2 = this.zza;
                n7 = this.zzh;
                long l2 = this.zzj(n7);
                object = this.zzl;
                int n8 = this.zzh;
                n7 = Arrays.binarySearch((int[])object, n8);
                n8 = n7 >= 0 ? 1 : 0;
                int n10 = this.zzf;
                zzafa2.zzs(l2, n8, n10, 0, null);
            }
            this.zzh = n7 = this.zzh + n4;
        }
        return (boolean)var2_6;
    }
}

