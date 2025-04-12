/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzav;
import com.google.android.gms.internal.clearcut.zzci;
import com.google.android.gms.internal.clearcut.zzcn;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzdc
extends zzav
implements zzcn,
RandomAccess {
    private static final zzdc zzlw;
    private int size;
    private long[] zzlx;

    static {
        zzdc zzdc2;
        zzlw = zzdc2 = new zzdc();
        zzdc2.zzv();
    }

    public zzdc() {
        long[] lArray = new long[10];
        this(lArray, 0);
    }

    private zzdc(long[] lArray, int n3) {
        this.zzlx = lArray;
        this.size = n3;
    }

    public static zzdc zzbx() {
        return zzlw;
    }

    private final void zzg(int n3) {
        int n4;
        if (n3 >= 0 && n3 < (n4 = this.size)) {
            return;
        }
        String string2 = this.zzh(n3);
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    private final String zzh(int n3) {
        int n4 = this.size;
        return C12.a(35, n3, n4, "Index:", ", Size:");
    }

    private final void zzk(int n3, long l2) {
        int n4;
        this.zzw();
        if (n3 >= 0 && n3 <= (n4 = this.size)) {
            long[] lArray = this.zzlx;
            int n7 = lArray.length;
            int n8 = 1;
            if (n4 < n7) {
                n7 = n3 + 1;
                System.arraycopy(lArray, n3, lArray, n7, n4 -= n3);
            } else {
                n4 = zy_2.a(n4, 3, 2, n8);
                long[] lArray2 = new long[n4];
                System.arraycopy(lArray, 0, lArray2, 0, n3);
                lArray = this.zzlx;
                n7 = n3 + 1;
                int n10 = this.size - n3;
                System.arraycopy(lArray, n3, lArray2, n7, n10);
                this.zzlx = lArray2;
            }
            this.zzlx[n3] = l2;
            this.size = n3 = this.size + n8;
            this.modCount = n3 = this.modCount + n8;
            return;
        }
        String string2 = this.zzh(n3);
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    public final /* synthetic */ void add(int n3, Object object) {
        long l2 = (Long)object;
        this.zzk(n3, l2);
    }

    public final boolean addAll(Collection object) {
        this.zzw();
        zzci.checkNotNull(object);
        int n3 = object instanceof zzdc;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (zzdc)object;
        n3 = ((zzdc)object).size;
        if (n3 == 0) {
            return false;
        }
        int n4 = this.size;
        int n7 = (-1 >>> 1) - n4;
        if (n7 >= n3) {
            long[] lArray = this.zzlx;
            n7 = lArray.length;
            if ((n4 += n3) > n7) {
                this.zzlx = lArray = Arrays.copyOf(lArray, n4);
            }
            lArray = ((zzdc)object).zzlx;
            long[] lArray2 = this.zzlx;
            int n8 = this.size;
            int n10 = ((zzdc)object).size;
            System.arraycopy(lArray, 0, lArray2, n8, n10);
            this.size = n4;
            n10 = this.modCount;
            n3 = 1;
            this.modCount = n10 += n3;
            return n3 != 0;
        }
        object = new OutOfMemoryError();
        throw object;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof zzdc;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (zzdc)object;
        n3 = this.size;
        int n4 = ((zzdc)object).size;
        if (n3 != n4) {
            return false;
        }
        object = ((zzdc)object).zzlx;
        for (n3 = 0; n3 < (n4 = this.size); ++n3) {
            long[] lArray = this.zzlx;
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
        return this.getLong(n3);
    }

    public final long getLong(int n3) {
        this.zzg(n3);
        return this.zzlx[n3];
    }

    public final int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = 0; i3 < (n3 = this.size); ++i3) {
            n4 *= 31;
            long[] lArray = this.zzlx;
            long l2 = lArray[i3];
            n3 = zzci.zzl(l2);
            n4 += n3;
        }
        return n4;
    }

    public final /* synthetic */ Object remove(int n3) {
        this.zzw();
        this.zzg(n3);
        long[] lArray = this.zzlx;
        long l2 = lArray[n3];
        int n4 = this.size;
        int n7 = n4 + -1;
        if (n3 < n7) {
            n7 = n3 + 1;
            System.arraycopy(lArray, n7, lArray, n3, n4 -= n3);
        }
        this.size = n3 = this.size + -1;
        this.modCount = n3 = this.modCount + 1;
        return l2;
    }

    public final boolean remove(Object object) {
        int n3;
        this.zzw();
        int n4 = 0;
        for (int i3 = 0; i3 < (n3 = this.size); ++i3) {
            long l2 = this.zzlx[i3];
            Long l3 = l2;
            n3 = (int)(object.equals(l3) ? 1 : 0);
            if (n3 == 0) continue;
            object = this.zzlx;
            n4 = i3 + 1;
            n3 = this.size - i3;
            System.arraycopy(object, n4, object, i3, n3);
            int n7 = this.size;
            n4 = 1;
            this.size = n7 -= n4;
            this.modCount = n7 = this.modCount + n4;
            return n4 != 0;
        }
        return false;
    }

    public final void removeRange(int n3, int n4) {
        this.zzw();
        if (n4 >= n3) {
            long[] lArray = this.zzlx;
            int n7 = this.size - n4;
            System.arraycopy(lArray, n4, lArray, n3, n7);
            int n8 = this.size;
            this.size = n8 -= (n4 -= n3);
            this.modCount = n3 = this.modCount + 1;
            return;
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("toIndex < fromIndex");
        throw indexOutOfBoundsException;
    }

    public final /* synthetic */ Object set(int n3, Object object) {
        long l2 = (Long)object;
        this.zzw();
        this.zzg(n3);
        object = this.zzlx;
        Object object2 = object[n3];
        object[n3] = l2;
        return (long)object2;
    }

    public final int size() {
        return this.size;
    }

    public final /* synthetic */ zzcn zzi(int n3) {
        int n4 = this.size;
        if (n3 >= n4) {
            long[] lArray = Arrays.copyOf(this.zzlx, n3);
            int n7 = this.size;
            zzdc zzdc2 = new zzdc(lArray, n7);
            return zzdc2;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public final void zzm(long l2) {
        int n3 = this.size;
        this.zzk(n3, l2);
    }
}

