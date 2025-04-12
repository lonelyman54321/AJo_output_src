/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfyg;
import com.google.android.gms.internal.ads.zzgea;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

final class zzgdz
extends AbstractList
implements RandomAccess,
Serializable {
    final int[] zza;
    final int zzb;
    final int zzc;

    public zzgdz(int[] nArray, int n3, int n4) {
        this.zza = nArray;
        this.zzb = n3;
        this.zzc = n4;
    }

    public final boolean contains(Object object) {
        int n3 = object instanceof Integer;
        if (n3 != 0) {
            int[] nArray = this.zza;
            object = (Integer)object;
            int n4 = (Integer)object;
            int n7 = this.zzb;
            int n8 = this.zzc;
            if ((n4 = zzgea.zza(nArray, n4, n7, n8)) != (n3 = -1)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n3 = object instanceof zzgdz;
        if (n3 != 0) {
            object = (zzgdz)object;
            n3 = this.zzc;
            int n4 = this.zzb;
            int n7 = ((zzgdz)object).zzc;
            int n8 = ((zzgdz)object).zzb;
            n3 -= n4;
            n4 = 0;
            if ((n7 -= n8) == n3) {
                for (n7 = 0; n7 < n3; ++n7) {
                    int[] nArray = this.zza;
                    int n10 = this.zzb + n7;
                    n8 = nArray[n10];
                    int[] nArray2 = ((zzgdz)object).zza;
                    int n14 = ((zzgdz)object).zzb + n7;
                    if (n8 == (n10 = nArray2[n14])) continue;
                    return false;
                }
                return bl2;
            }
            return false;
        }
        return super.equals(object);
    }

    public final int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = this.zzb; i3 < (n3 = this.zzc); ++i3) {
            n4 *= 31;
            int[] nArray = this.zza;
            n3 = nArray[i3];
            n4 += n3;
        }
        return n4;
    }

    public final int indexOf(Object object) {
        int n3 = object instanceof Integer;
        if (n3 != 0) {
            int[] nArray = this.zza;
            object = (Integer)object;
            int n4 = (Integer)object;
            int n7 = this.zzb;
            int n8 = this.zzc;
            if ((n4 = zzgea.zza(nArray, n4, n7, n8)) >= 0) {
                n3 = this.zzb;
                return n4 - n3;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final int lastIndexOf(Object object) {
        boolean bl2 = object instanceof Integer;
        int n3 = -1;
        if (bl2) {
            int n4;
            int n7;
            block4: {
                int[] nArray = this.zza;
                object = (Integer)object;
                n7 = (Integer)object;
                int n8 = this.zzb;
                for (n4 = this.zzc + n3; n4 >= n8; n4 += -1) {
                    int n10 = nArray[n4];
                    if (n10 != n7) {
                        continue;
                    }
                    break block4;
                }
                n4 = -1;
            }
            if (n4 >= 0) {
                n7 = this.zzb;
                return n4 - n7;
            }
        }
        return n3;
    }

    public final int size() {
        int n3 = this.zzc;
        int n4 = this.zzb;
        return n3 - n4;
    }

    public final List subList(int n3, int n4) {
        int n7 = this.zzc;
        int n8 = this.zzb;
        zzfyg.zzi(n3, n4, n7 -= n8);
        if (n3 == n4) {
            return Collections.emptyList();
        }
        int[] nArray = this.zza;
        n8 = this.zzb;
        n4 += n8;
        zzgdz zzgdz2 = new zzgdz(nArray, n8 += n3, n4);
        return zzgdz2;
    }

    public final String toString() {
        int n3 = this.zzc;
        int n4 = this.zzb;
        n3 -= n4;
        StringBuilder stringBuilder = new StringBuilder(n3 *= 5);
        stringBuilder.append('[');
        int[] nArray = this.zza;
        int n7 = this.zzb;
        n3 = nArray[n7];
        stringBuilder.append(n3);
        n3 = this.zzb;
        while (++n3 < (n7 = this.zzc)) {
            stringBuilder.append(", ");
            int[] nArray2 = this.zza;
            n7 = nArray2[n3];
            stringBuilder.append(n7);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

