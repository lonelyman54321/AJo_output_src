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

final class zzfl
extends zzdq
implements RandomAccess,
zzey,
zzgd {
    private static final zzfl zza;
    private long[] zzb;
    private int zzc;

    static {
        zzfl zzfl2;
        long[] lArray = new long[]{};
        zza = zzfl2 = new zzfl(lArray, 0);
        zzfl2.zzb();
    }

    public zzfl() {
        long[] lArray = new long[10];
        this(lArray, 0);
    }

    private zzfl(long[] lArray, int n3) {
        this.zzb = lArray;
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
        object = (Long)object;
        long l2 = (Long)object;
        this.zza();
        if (n3 >= 0 && n3 <= (n4 = this.zzc)) {
            long[] lArray = this.zzb;
            int n7 = lArray.length;
            int n8 = 1;
            if (n4 < n7) {
                n7 = n3 + 1;
                System.arraycopy(lArray, n3, lArray, n7, n4 -= n3);
            } else {
                n4 = zy_2.a(n4, 3, 2, n8);
                object = new long[n4];
                System.arraycopy(lArray, 0, object, 0, n3);
                lArray = this.zzb;
                n7 = n3 + 1;
                int n10 = this.zzc - n3;
                System.arraycopy(lArray, n3, object, n7, n10);
                this.zzb = (long[])object;
            }
            this.zzb[n3] = l2;
            this.zzc = n3 = this.zzc + n8;
            this.modCount = n3 = this.modCount + n8;
            return;
        }
        String string2 = this.zzf(n3);
        object = new IndexOutOfBoundsException(string2);
        throw object;
    }

    public final boolean addAll(Collection object) {
        this.zza();
        zzez.zze(object);
        int n3 = object instanceof zzfl;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (zzfl)object;
        n3 = ((zzfl)object).zzc;
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
            lArray = ((zzfl)object).zzb;
            long[] lArray2 = this.zzb;
            int n8 = this.zzc;
            int n10 = ((zzfl)object).zzc;
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
        int n3 = object instanceof zzfl;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (zzfl)object;
        n3 = this.zzc;
        int n4 = ((zzfl)object).zzc;
        if (n3 != n4) {
            return false;
        }
        object = ((zzfl)object).zzb;
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

    public final /* synthetic */ Object get(int n3) {
        this.zzg(n3);
        return this.zzb[n3];
    }

    public final int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = 0; i3 < (n3 = this.zzc); ++i3) {
            n4 *= 31;
            long[] lArray = this.zzb;
            long l2 = lArray[i3];
            n3 = zzez.zzc(l2);
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
        this.zza();
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

    public final void zze(long l2) {
        this.zza();
        int n3 = this.zzc;
        long[] lArray = this.zzb;
        int n4 = lArray.length;
        if (n3 == n4) {
            int n7 = 1;
            n4 = zy_2.a(n3, 3, 2, n7);
            long[] lArray2 = new long[n4];
            System.arraycopy(lArray, 0, lArray2, 0, n3);
            this.zzb = lArray2;
        }
        long[] lArray3 = this.zzb;
        int n8 = this.zzc;
        this.zzc = n4 = n8 + 1;
        lArray3[n8] = l2;
    }
}

