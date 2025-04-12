/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzbt;
import com.google.android.gms.internal.icing.zzdf;
import com.google.android.gms.internal.icing.zzdh;
import com.google.android.gms.internal.icing.zzel;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzdt
extends zzbt
implements RandomAccess,
zzdf,
zzel {
    private static final zzdt zza;
    private long[] zzb;
    private int zzc;

    static {
        zzdt zzdt2;
        long[] lArray = new long[]{};
        zza = zzdt2 = new zzdt(lArray, 0);
        zzdt2.zzb();
    }

    public zzdt() {
        long[] lArray = new long[10];
        this(lArray, 0);
    }

    private zzdt(long[] lArray, int n3) {
        this.zzb = lArray;
        this.zzc = n3;
    }

    public static zzdt zzd() {
        return zza;
    }

    private final void zzg(int n3) {
        int n4;
        if (n3 >= 0 && n3 < (n4 = this.zzc)) {
            return;
        }
        String string2 = this.zzh(n3);
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    private final String zzh(int n3) {
        int n4 = this.zzc;
        return C12.a(35, n3, n4, "Index:", ", Size:");
    }

    public final boolean addAll(Collection object) {
        this.zzc();
        zzdh.zza(object);
        int n3 = object instanceof zzdt;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (zzdt)object;
        n3 = ((zzdt)object).zzc;
        if (n3 == 0) {
            return false;
        }
        int n4 = this.zzc;
        int n7 = (-1 >>> 1) - n4;
        if (n7 >= n3) {
            long[] lArray = this.zzb;
            n7 = lArray.length;
            if ((n4 += n3) > n7) {
                this.zzb = lArray = Arrays.copyOf(lArray, n4);
            }
            lArray = ((zzdt)object).zzb;
            long[] lArray2 = this.zzb;
            int n8 = this.zzc;
            int n10 = ((zzdt)object).zzc;
            System.arraycopy(lArray, 0, lArray2, n8, n10);
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
        int n3 = object instanceof zzdt;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (zzdt)object;
        n3 = this.zzc;
        int n4 = ((zzdt)object).zzc;
        if (n3 != n4) {
            return false;
        }
        object = ((zzdt)object).zzb;
        for (n3 = 0; n3 < (n4 = this.zzc); ++n3) {
            long[] lArray = this.zzb;
            long l2 = lArray[n3];
            Object object2 = object[n3];
            long l3 = l2 - object2;
            n4 = (int)(l3 == 0L ? 0 : (l3 < 0L ? -1 : 1));
            if (n4 == 0) continue;
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = 0; i3 < (n3 = this.zzc); ++i3) {
            n4 *= 31;
            long[] lArray = this.zzb;
            long l2 = lArray[i3];
            n3 = zzdh.zze(l2);
            n4 += n3;
        }
        return n4;
    }

    public final int indexOf(Object object) {
        int n3 = object instanceof Long;
        int n4 = -1;
        if (n3 == 0) {
            return n4;
        }
        object = (Long)object;
        long l2 = (Long)object;
        int n7 = this.zzc;
        for (n3 = 0; n3 < n7; ++n3) {
            long[] lArray = this.zzb;
            long l3 = lArray[n3];
            long l4 = l3 - l2;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 != false) continue;
            return n3;
        }
        return n4;
    }

    public final void removeRange(int n3, int n4) {
        this.zzc();
        if (n4 >= n3) {
            long[] lArray = this.zzb;
            int n7 = this.zzc - n4;
            System.arraycopy(lArray, n4, lArray, n3, n7);
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

    public final long zzf(int n3) {
        this.zzg(n3);
        return this.zzb[n3];
    }
}

