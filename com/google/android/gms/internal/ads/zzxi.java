/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

public final class zzxi {
    private final Random zza;
    private final int[] zzb;
    private final int[] zzc;

    public zzxi(int n3) {
        Random random = new Random();
        this(0, random);
    }

    private zzxi(int n3, Random random) {
        int[] nArray = new int[]{};
        this(nArray, random);
    }

    private zzxi(int[] nArray, Random object) {
        int n3;
        this.zzb = nArray;
        this.zza = object;
        object = new int[nArray.length];
        this.zzc = (int[])object;
        int n4 = 0;
        object = null;
        while (n4 < (n3 = nArray.length)) {
            int[] nArray2 = this.zzc;
            int n7 = nArray[n4];
            nArray2[n7] = n4++;
        }
    }

    public final int zza() {
        int[] nArray = this.zzb;
        int n3 = nArray.length;
        if (n3 > 0) {
            return nArray[0];
        }
        return -1;
    }

    public final int zzb() {
        int[] nArray = this.zzb;
        int n3 = nArray.length;
        int n4 = -1;
        if (n3 > 0) {
            return nArray[n3 += n4];
        }
        return n4;
    }

    public final int zzc() {
        return this.zzb.length;
    }

    public final int zzd(int n3) {
        int[] nArray = this.zzb;
        int n4 = nArray.length;
        if ((n3 = this.zzc[n3] + 1) < n4) {
            return nArray[n3];
        }
        return -1;
    }

    public final int zze(int n3) {
        int[] nArray = this.zzc;
        n3 = nArray[n3];
        int n4 = -1;
        if ((n3 += n4) >= 0) {
            return this.zzb[n3];
        }
        return n4;
    }

    public final zzxi zzf() {
        Random random = this.zza;
        long l2 = random.nextLong();
        Random random2 = new Random(l2);
        zzxi zzxi2 = new zzxi(0, random2);
        return zzxi2;
    }

    public final zzxi zzg(int n3, int n4) {
        int[] nArray;
        int n7;
        int n8;
        int n10;
        int n14;
        int[] nArray2;
        Random random;
        Object object = new int[n4];
        Object object2 = new int[n4];
        int n15 = 0;
        int n16 = 0;
        int[] nArray3 = null;
        while (n16 < n4) {
            random = this.zza;
            nArray2 = this.zzb;
            n14 = nArray2.length + 1;
            object[n16] = n10 = random.nextInt(n14);
            random = this.zza;
            n14 = n16 + 1;
            n10 = random.nextInt(n14);
            object2[n16] = n8 = object2[n10];
            object2[n10] = n16;
            n16 = n14;
        }
        Arrays.sort((int[])object);
        n16 = this.zzb.length + n4;
        nArray3 = new int[n16];
        n10 = 0;
        random = null;
        n14 = 0;
        nArray2 = null;
        while (n15 < (n7 = (nArray = this.zzb).length + n4)) {
            if (n10 < n4 && n14 == (n7 = object[n10])) {
                n8 = n10 + 1;
                nArray3[n15] = n10 = object2[n10];
                n10 = n8;
            } else {
                n7 = n14 + 1;
                nArray3[n15] = n14 = nArray[n14];
                if (n14 >= 0) {
                    nArray3[n15] = n14 += n4;
                }
                n14 = n7;
            }
            ++n15;
        }
        object = this.zza;
        object2 = new Random;
        long l2 = ((Random)object).nextLong();
        object2(l2);
        zzxi zzxi2 = new zzxi(nArray3, (Random)object2);
        return zzxi2;
    }

    public final zzxi zzh(int n3, int n4) {
        int[] nArray;
        int n7;
        n3 = this.zzb.length - n4;
        int[] nArray2 = new int[n3];
        zzxi zzxi2 = null;
        int n8 = 0;
        Random random = null;
        for (int i3 = 0; i3 < (n7 = (nArray = this.zzb).length); ++i3) {
            int n10 = nArray[i3];
            if (n10 >= 0 && n10 < n4) {
                ++n8;
                continue;
            }
            n7 = i3 - n8;
            if (n10 >= 0) {
                n10 -= n4;
            }
            nArray2[n7] = n10;
        }
        Random random2 = this.zza;
        long l2 = random2.nextLong();
        random = new Random(l2);
        zzxi2 = new zzxi(nArray2, random);
        return zzxi2;
    }
}

