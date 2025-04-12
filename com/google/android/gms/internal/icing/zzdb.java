/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzbt;
import com.google.android.gms.internal.icing.zzdg;
import com.google.android.gms.internal.icing.zzdh;
import com.google.android.gms.internal.icing.zzel;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzdb
extends zzbt
implements RandomAccess,
zzdg,
zzel {
    private static final zzdb zza;
    private int[] zzb;
    private int zzc;

    static {
        zzdb zzdb2;
        int[] nArray = new int[]{};
        zza = zzdb2 = new zzdb(nArray, 0);
        zzdb2.zzb();
    }

    public zzdb() {
        int[] nArray = new int[10];
        this(nArray, 0);
    }

    private zzdb(int[] nArray, int n3) {
        this.zzb = nArray;
        this.zzc = n3;
    }

    private final void zzf(int n3) {
        int n4;
        if (n3 >= 0 && n3 < (n4 = this.zzc)) {
            return;
        }
        String string2 = this.zzg(n3);
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    private final String zzg(int n3) {
        int n4 = this.zzc;
        return C12.a(35, n3, n4, "Index:", ", Size:");
    }

    public final boolean addAll(Collection object) {
        this.zzc();
        zzdh.zza(object);
        int n3 = object instanceof zzdb;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (zzdb)object;
        n3 = ((zzdb)object).zzc;
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
            nArray = ((zzdb)object).zzb;
            int[] nArray2 = this.zzb;
            int n8 = this.zzc;
            int n10 = ((zzdb)object).zzc;
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
        int n3 = object instanceof zzdb;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (zzdb)object;
        n3 = this.zzc;
        int n4 = ((zzdb)object).zzc;
        if (n3 != n4) {
            return false;
        }
        object = ((zzdb)object).zzb;
        for (n3 = 0; n3 < (n4 = this.zzc); ++n3) {
            int[] nArray = this.zzb;
            n4 = nArray[n3];
            Object object2 = object[n3];
            if (n4 == object2) continue;
            return false;
        }
        return bl2;
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
        this.zzc();
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

    public final int zzd(int n3) {
        this.zzf(n3);
        return this.zzb[n3];
    }
}

