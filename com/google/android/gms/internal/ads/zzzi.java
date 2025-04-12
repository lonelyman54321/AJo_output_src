/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzde;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzxr;
import java.util.Arrays;

public final class zzzi {
    private final String[] zza;
    private final int[] zzb;
    private final zzxr[] zzc;
    private final int[] zzd;
    private final int[][][] zze;
    private final zzxr zzf;

    public zzzi(String[] stringArray, int[] nArray, zzxr[] zzxrArray, int[] nArray2, int[][][] nArray3, zzxr zzxr2) {
        this.zza = stringArray;
        this.zzb = nArray;
        this.zzc = zzxrArray;
        this.zze = nArray3;
        this.zzd = nArray2;
        this.zzf = zzxr2;
    }

    public final int zza(int n3, int n4, boolean n7) {
        Object object;
        int n8;
        int n10;
        Object object2 = this.zzc[n3].zzb(n4);
        n7 = ((zzde)object2).zzb;
        Object object3 = new int[n7];
        int n14 = 0;
        int n15 = 0;
        int[] nArray = null;
        for (n10 = 0; n10 < n7; ++n10) {
            int[] nArray2 = this.zze[n3][n4];
            n8 = nArray2[n10] & 7;
            object = 4;
            if (n8 != object) continue;
            n8 = n15 + 1;
            object3[n15] = n10;
            n15 = n8;
        }
        object2 = Arrays.copyOf(object3, n15);
        object3 = null;
        n10 = 0;
        n15 = 0;
        nArray = null;
        n8 = 16;
        while (n14 < (object = ((Object)object2).length)) {
            object = object2[n14];
            zzde zzde2 = this.zzc[n3].zzb(n4);
            String string2 = zzde2.zzb((int)object).zzn;
            int n16 = n15 + 1;
            if (n15 == 0) {
                object3 = string2;
            } else {
                n15 = zzgd.zzG(object3, string2) ^ 1;
                n10 |= n15;
            }
            nArray = this.zze[n3][n4];
            n15 = nArray[n14] & 0x18;
            n8 = Math.min(n8, n15);
            ++n14;
            n15 = n16;
        }
        if (n10 != 0) {
            n3 = this.zzd[n3];
            return Math.min(n8, n3);
        }
        return n8;
    }

    public final int zzb(int n3, int n4, int n7) {
        return this.zze[n3][n4][n7];
    }

    public final int zzc(int n3) {
        return this.zzb[n3];
    }

    public final zzxr zzd(int n3) {
        return this.zzc[n3];
    }

    public final zzxr zze() {
        return this.zzf;
    }
}

