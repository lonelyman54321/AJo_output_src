/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzdq;
import com.google.android.gms.internal.auth.zzey;
import com.google.android.gms.internal.auth.zzez;
import com.google.android.gms.internal.auth.zzgd;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzev
extends zzdq
implements RandomAccess,
zzey,
zzgd {
    private static final zzev zza;
    private int[] zzb;
    private int zzc;

    static {
        zzev zzev2;
        int[] nArray = new int[]{};
        zza = zzev2 = new zzev(nArray, 0);
        zzev2.zzb();
    }

    public zzev() {
        int[] nArray = new int[10];
        this(nArray, 0);
    }

    private zzev(int[] nArray, int n3) {
        this.zzb = nArray;
        this.zzc = n3;
    }

    private final String zzf(int n3) {
        int n4 = this.zzc;
        return D70.b(n3, n4, "Index:", ", Size:");
    }

    private final void zzg(int n3) {
        int n4;
        if (n3 >= 0 && n3 < (n4 = this.zzc)) {
            return;
        }
        String string2 = this.zzf(n3);
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    public final /* synthetic */ void add(int n3, Object object) {
        int n4;
        object = (Integer)object;
        int n7 = (Integer)object;
        this.zza();
        if (n3 >= 0 && n3 <= (n4 = this.zzc)) {
            int[] nArray = this.zzb;
            int n8 = nArray.length;
            int n10 = 1;
            if (n4 < n8) {
                n8 = n3 + 1;
                System.arraycopy(nArray, n3, nArray, n8, n4 -= n3);
            } else {
                n4 = zy_2.a(n4, 3, 2, n10);
                int[] nArray2 = new int[n4];
                System.arraycopy(nArray, 0, nArray2, 0, n3);
                nArray = this.zzb;
                n8 = n3 + 1;
                int n14 = this.zzc - n3;
                System.arraycopy(nArray, n3, nArray2, n8, n14);
                this.zzb = nArray2;
            }
            this.zzb[n3] = n7;
            this.zzc = n3 = this.zzc + n10;
            this.modCount = n3 = this.modCount + n10;
            return;
        }
        String string2 = this.zzf(n3);
        object = new IndexOutOfBoundsException(string2);
        throw object;
    }

    public final boolean addAll(Collection object) {
        this.zza();
        zzez.zze(object);
        int n3 = object instanceof zzev;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (zzev)object;
        n3 = ((zzev)object).zzc;
        if (n3 == 0) {
            return false;
        }
        int n4 = this.zzc;
        int n7 = (-1 >>> 1) - n4;
        if (n7 >= n3) {
            int[] nArray = this.zzb;
            n7 = nArray.length;
            if ((n4 += n3) > n7) {
                this.zzb = nArray = Arrays.copyOf(nArray, n4);
            }
            nArray = ((zzev)object).zzb;
            int[] nArray2 = this.zzb;
            int n8 = this.zzc;
            int n10 = ((zzev)object).zzc;
            System.arraycopy(nArray, 0, nArray2, n8, n10);
            this.zzc = n4;
            n10 = this.modCount;
            n3 = 1;
            this.modCount = n10 += n3;
            return n3 != 0;
        }
        object = new OutOfMemoryError();
        throw object;
    }

    public final boolean contains(Object object) {
        int n3;
        int n4 = this.indexOf(object);
        return n4 != (n3 = -1);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof zzev;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (zzev)object;
        n3 = this.zzc;
        int n4 = ((zzev)object).zzc;
        if (n3 != n4) {
            return false;
        }
        object = ((zzev)object).zzb;
        for (n3 = 0; n3 < (n4 = this.zzc); ++n3) {
            int[] nArray = this.zzb;
            n4 = nArray[n3];
            Object object2 = object[n3];
            if (n4 == object2) continue;
            return false;
        }
        return bl2;
    }

    public final /* synthetic */ Object get(int n3) {
        this.zzg(n3);
        return this.zzb[n3];
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

    public final int indexOf(Object object) {
        int n3 = object instanceof Integer;
        int n4 = -1;
        if (n3 == 0) {
            return n4;
        }
        object = (Integer)object;
        int n7 = (Integer)object;
        n3 = this.zzc;
        for (int i3 = 0; i3 < n3; ++i3) {
            int[] nArray = this.zzb;
            int n8 = nArray[i3];
            if (n8 != n7) continue;
            return i3;
        }
        return n4;
    }

    public final void removeRange(int n3, int n4) {
        this.zza();
        if (n4 >= n3) {
            int[] nArray = this.zzb;
            int n7 = this.zzc - n4;
            System.arraycopy(nArray, n4, nArray, n3, n7);
            int n8 = this.zzc;
            this.zzc = n8 -= (n4 -= n3);
            this.modCount = n3 = this.modCount + 1;
            return;
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("toIndex < fromIndex");
        throw indexOutOfBoundsException;
    }

    public final int size() {
        return this.zzc;
    }

    public final void zze(int n3) {
        this.zza();
        int n4 = this.zzc;
        int[] nArray = this.zzb;
        int n7 = nArray.length;
        if (n4 == n7) {
            int n8 = 1;
            n7 = zy_2.a(n4, 3, 2, n8);
            int[] nArray2 = new int[n7];
            System.arraycopy(nArray, 0, nArray2, 0, n4);
            this.zzb = nArray2;
        }
        int[] nArray3 = this.zzb;
        int n10 = this.zzc;
        this.zzc = n7 = n10 + 1;
        nArray3[n10] = n3;
    }
}

