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

final class zzbq
extends zzav
implements zzcn,
RandomAccess {
    private static final zzbq zzgj;
    private int size;
    private double[] zzgk;

    static {
        zzbq zzbq2;
        zzgj = zzbq2 = new zzbq();
        zzbq2.zzv();
    }

    public zzbq() {
        double[] dArray = new double[10];
        this(dArray, 0);
    }

    private zzbq(double[] dArray, int n3) {
        this.zzgk = dArray;
        this.size = n3;
    }

    private final void zzc(int n3, double d2) {
        int n4;
        this.zzw();
        if (n3 >= 0 && n3 <= (n4 = this.size)) {
            double[] dArray = this.zzgk;
            int n7 = dArray.length;
            int n8 = 1;
            if (n4 < n7) {
                n7 = n3 + 1;
                System.arraycopy(dArray, n3, dArray, n7, n4 -= n3);
            } else {
                n4 = zy_2.a(n4, 3, 2, n8);
                double[] dArray2 = new double[n4];
                System.arraycopy(dArray, 0, dArray2, 0, n3);
                dArray = this.zzgk;
                n7 = n3 + 1;
                int n10 = this.size - n3;
                System.arraycopy(dArray, n3, dArray2, n7, n10);
                this.zzgk = dArray2;
            }
            this.zzgk[n3] = d2;
            this.size = n3 = this.size + n8;
            this.modCount = n3 = this.modCount + n8;
            return;
        }
        String string2 = this.zzh(n3);
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
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

    public final /* synthetic */ void add(int n3, Object object) {
        double d2 = (Double)object;
        this.zzc(n3, d2);
    }

    public final boolean addAll(Collection object) {
        this.zzw();
        zzci.checkNotNull(object);
        int n3 = object instanceof zzbq;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (zzbq)object;
        n3 = ((zzbq)object).size;
        if (n3 == 0) {
            return false;
        }
        int n4 = this.size;
        int n7 = (-1 >>> 1) - n4;
        if (n7 >= n3) {
            double[] dArray = this.zzgk;
            n7 = dArray.length;
            if ((n4 += n3) > n7) {
                this.zzgk = dArray = Arrays.copyOf(dArray, n4);
            }
            dArray = ((zzbq)object).zzgk;
            double[] dArray2 = this.zzgk;
            int n8 = this.size;
            int n10 = ((zzbq)object).size;
            System.arraycopy(dArray, 0, dArray2, n8, n10);
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
        int n3 = object instanceof zzbq;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (zzbq)object;
        n3 = this.size;
        int n4 = ((zzbq)object).size;
        if (n3 != n4) {
            return false;
        }
        object = ((zzbq)object).zzgk;
        for (n3 = 0; n3 < (n4 = this.size); ++n3) {
            double[] dArray = this.zzgk;
            double d2 = dArray[n3];
            Object object2 = object[n3];
            double d5 = d2 - object2;
            n4 = (int)(d5 == 0.0 ? 0 : (d5 > 0.0 ? 1 : -1));
            if (n4 == 0) continue;
            return false;
        }
        return bl2;
    }

    public final /* synthetic */ Object get(int n3) {
        this.zzg(n3);
        return this.zzgk[n3];
    }

    public final int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = 0; i3 < (n3 = this.size); ++i3) {
            double[] dArray = this.zzgk;
            double d2 = dArray[i3];
            long l2 = Double.doubleToLongBits(d2);
            n4 *= 31;
            n3 = zzci.zzl(l2);
            n4 += n3;
        }
        return n4;
    }

    public final /* synthetic */ Object remove(int n3) {
        this.zzw();
        this.zzg(n3);
        double[] dArray = this.zzgk;
        double d2 = dArray[n3];
        int n4 = this.size;
        int n7 = n4 + -1;
        if (n3 < n7) {
            n7 = n3 + 1;
            System.arraycopy(dArray, n7, dArray, n3, n4 -= n3);
        }
        this.size = n3 = this.size + -1;
        this.modCount = n3 = this.modCount + 1;
        return d2;
    }

    public final boolean remove(Object object) {
        int n3;
        this.zzw();
        int n4 = 0;
        for (int i3 = 0; i3 < (n3 = this.size); ++i3) {
            double d2 = this.zzgk[i3];
            Double d5 = d2;
            n3 = (int)(object.equals(d5) ? 1 : 0);
            if (n3 == 0) continue;
            object = this.zzgk;
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
            double[] dArray = this.zzgk;
            int n7 = this.size - n4;
            System.arraycopy(dArray, n4, dArray, n3, n7);
            int n8 = this.size;
            this.size = n8 -= (n4 -= n3);
            this.modCount = n3 = this.modCount + 1;
            return;
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("toIndex < fromIndex");
        throw indexOutOfBoundsException;
    }

    public final /* synthetic */ Object set(int n3, Object object) {
        double d2 = (Double)object;
        this.zzw();
        this.zzg(n3);
        object = this.zzgk;
        Object object2 = object[n3];
        object[n3] = d2;
        return (double)object2;
    }

    public final int size() {
        return this.size;
    }

    public final void zzc(double d2) {
        int n3 = this.size;
        this.zzc(n3, d2);
    }

    public final /* synthetic */ zzcn zzi(int n3) {
        int n4 = this.size;
        if (n3 >= n4) {
            double[] dArray = Arrays.copyOf(this.zzgk, n3);
            int n7 = this.size;
            zzbq zzbq2 = new zzbq(dArray, n7);
            return zzbq2;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }
}

