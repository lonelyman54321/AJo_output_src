/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzis;
import com.google.android.gms.internal.measurement.zzkj;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzkn;
import com.google.android.gms.internal.measurement.zzly;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzlb
extends zzis
implements zzkn,
zzly,
RandomAccess {
    private static final long[] zza;
    private static final zzlb zzb;
    private long[] zzc;
    private int zzd;

    static {
        zzlb zzlb2;
        long[] lArray = new long[]{};
        zza = lArray;
        zzb = zzlb2 = new zzlb(lArray, 0, false);
    }

    public zzlb() {
        long[] lArray = zza;
        this(lArray, 0, true);
    }

    private zzlb(long[] lArray, int n3, boolean bl2) {
        super(bl2);
        this.zzc = lArray;
        this.zzd = n3;
    }

    public static zzlb zzd() {
        return zzb;
    }

    private static int zze(int n3) {
        return Math.max(n3 * 3 / 2 + 1, 10);
    }

    private final String zzf(int n3) {
        int n4 = this.zzd;
        return D70.b(n3, n4, "Index:", ", Size:");
    }

    private final void zzg(int n3) {
        int n4;
        if (n3 >= 0 && n3 < (n4 = this.zzd)) {
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
        if (n3 >= 0 && n3 <= (n4 = this.zzd)) {
            long[] lArray = this.zzc;
            int n7 = lArray.length;
            if (n4 < n7) {
                n7 = n3 + 1;
                System.arraycopy(lArray, n3, lArray, n7, n4 -= n3);
            } else {
                n4 = zzlb.zze(lArray.length);
                object = new long[n4];
                System.arraycopy(this.zzc, 0, object, 0, n3);
                lArray = this.zzc;
                n7 = n3 + 1;
                int n8 = this.zzd - n3;
                System.arraycopy(lArray, n3, object, n7, n8);
                this.zzc = (long[])object;
            }
            this.zzc[n3] = l2;
            this.zzd = n3 = this.zzd + 1;
            this.modCount = n3 = this.modCount + 1;
            return;
        }
        String string2 = this.zzf(n3);
        object = new IndexOutOfBoundsException(string2);
        throw object;
    }

    public final /* synthetic */ boolean add(Object object) {
        long l2 = (Long)object;
        this.zza(l2);
        return true;
    }

    public final boolean addAll(Collection object) {
        this.zza();
        zzkj.zza(object);
        int n3 = object instanceof zzlb;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (zzlb)object;
        n3 = ((zzlb)object).zzd;
        if (n3 == 0) {
            return false;
        }
        int n4 = this.zzd;
        int n7 = (-1 >>> 1) - n4;
        if (n7 >= n3) {
            long[] lArray = this.zzc;
            n7 = lArray.length;
            if ((n4 += n3) > n7) {
                this.zzc = lArray = Arrays.copyOf(lArray, n4);
            }
            lArray = ((zzlb)object).zzc;
            long[] lArray2 = this.zzc;
            int n8 = this.zzd;
            int n10 = ((zzlb)object).zzd;
            System.arraycopy(lArray, 0, lArray2, n8, n10);
            this.zzd = n4;
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
        int n3 = object instanceof zzlb;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (zzlb)object;
        n3 = this.zzd;
        int n4 = ((zzlb)object).zzd;
        if (n3 != n4) {
            return false;
        }
        object = ((zzlb)object).zzc;
        for (n3 = 0; n3 < (n4 = this.zzd); ++n3) {
            long[] lArray = this.zzc;
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
        return this.zzb(n3);
    }

    public final int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = 0; i3 < (n3 = this.zzd); ++i3) {
            n4 *= 31;
            long[] lArray = this.zzc;
            long l2 = lArray[i3];
            n3 = zzkj.zza(l2);
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
        int n7 = this.size();
        for (n3 = 0; n3 < n7; ++n3) {
            long[] lArray = this.zzc;
            long l3 = lArray[n3];
            long l4 = l3 - l2;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 != false) continue;
            return n3;
        }
        return n4;
    }

    public final /* synthetic */ Object remove(int n3) {
        this.zza();
        this.zzg(n3);
        long[] lArray = this.zzc;
        long l2 = lArray[n3];
        int n4 = this.zzd;
        int n7 = n4 + -1;
        if (n3 < n7) {
            n7 = n3 + 1;
            n4 = n4 - n3 + -1;
            System.arraycopy(lArray, n7, lArray, n3, n4);
        }
        this.zzd = n3 = this.zzd + -1;
        this.modCount = n3 = this.modCount + 1;
        return l2;
    }

    public final void removeRange(int n3, int n4) {
        this.zza();
        if (n4 >= n3) {
            long[] lArray = this.zzc;
            int n7 = this.zzd - n4;
            System.arraycopy(lArray, n4, lArray, n3, n7);
            int n8 = this.zzd;
            this.zzd = n8 -= (n4 -= n3);
            this.modCount = n3 = this.modCount + 1;
            return;
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("toIndex < fromIndex");
        throw indexOutOfBoundsException;
    }

    public final /* synthetic */ Object set(int n3, Object object) {
        long l2 = (Long)object;
        this.zza();
        this.zzg(n3);
        object = this.zzc;
        Object object2 = object[n3];
        object[n3] = l2;
        return (long)object2;
    }

    public final int size() {
        return this.zzd;
    }

    public final /* synthetic */ zzkm zza(int n3) {
        return this.zzc(n3);
    }

    public final void zza(long l2) {
        long[] lArray;
        this.zza();
        int n3 = this.zzd;
        long[] lArray2 = this.zzc;
        int n4 = lArray2.length;
        if (n3 == n4) {
            n3 = zzlb.zze(lArray2.length);
            lArray = new long[n3];
            lArray2 = this.zzc;
            n4 = this.zzd;
            System.arraycopy(lArray2, 0, lArray, 0, n4);
            this.zzc = lArray;
        }
        lArray = this.zzc;
        int n7 = this.zzd;
        this.zzd = n4 = n7 + 1;
        lArray[n7] = l2;
    }

    public final long zzb(int n3) {
        this.zzg(n3);
        return this.zzc[n3];
    }

    public final zzkn zzc(int n3) {
        int n4 = this.zzd;
        if (n3 >= n4) {
            Object object;
            long[] lArray;
            if (n3 == 0) {
                lArray = zza;
            } else {
                object = this.zzc;
                lArray = Arrays.copyOf(object, n3);
            }
            object = new zzlb;
            int n7 = this.zzd;
            object(lArray, n7, true);
            return object;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public final void zzd(int n3) {
        long[] lArray = this.zzc;
        int n4 = lArray.length;
        if (n3 <= n4) {
            return;
        }
        n4 = lArray.length;
        if (n4 == 0) {
            long[] lArray2 = new long[Math.max(n3, 10)];
            this.zzc = lArray2;
            return;
        }
        int n7 = lArray.length;
        while (n7 < n3) {
            n7 = zzlb.zze(n7);
        }
        long[] lArray3 = Arrays.copyOf(this.zzc, n7);
        this.zzc = lArray3;
    }
}

