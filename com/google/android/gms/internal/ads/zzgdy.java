/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfyg;
import java.io.Serializable;
import java.util.Arrays;

public final class zzgdy
implements Serializable {
    private static final zzgdy zza;
    private final int[] zzb;
    private final int zzc;

    static {
        zzgdy zzgdy2;
        int[] nArray = new int[]{};
        zza = zzgdy2 = new zzgdy(nArray, 0, 0);
    }

    private zzgdy(int[] nArray, int n3, int n4) {
        this.zzb = nArray;
        this.zzc = n4;
    }

    public static zzgdy zzb(int[] nArray) {
        int n3 = nArray.length;
        nArray = Arrays.copyOf(nArray, n3);
        n3 = nArray.length;
        zzgdy zzgdy2 = new zzgdy(nArray, 0, n3);
        return zzgdy2;
    }

    public static zzgdy zzc() {
        return zza;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n3 = object instanceof zzgdy;
        if (n3 == 0) {
            return false;
        }
        object = (zzgdy)object;
        n3 = this.zzc;
        int n4 = ((zzgdy)object).zzc;
        if (n3 == n4) {
            for (n3 = 0; n3 < (n4 = this.zzc); ++n3) {
                int n7;
                n4 = this.zza(n3);
                if (n4 == (n7 = ((zzgdy)object).zza(n3))) continue;
                return false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = 0; i3 < (n3 = this.zzc); ++i3) {
            n4 *= 31;
            int[] nArray = this.zzb;
            n3 = nArray[i3];
            n4 += n3;
        }
        return n4;
    }

    public final String toString() {
        int n3 = this.zzc;
        if (n3 != 0) {
            StringBuilder stringBuilder = new StringBuilder(n3 *= 5);
            stringBuilder.append('[');
            int[] nArray = this.zzb;
            int n4 = 0;
            int[] nArray2 = null;
            n3 = nArray[0];
            stringBuilder.append(n3);
            for (n3 = 1; n3 < (n4 = this.zzc); ++n3) {
                stringBuilder.append(", ");
                nArray2 = this.zzb;
                n4 = nArray2[n3];
                stringBuilder.append(n4);
            }
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
        return "[]";
    }

    public final int zza(int n3) {
        int n4 = this.zzc;
        zzfyg.zza(n3, n4, "index");
        return this.zzb[n3];
    }
}

