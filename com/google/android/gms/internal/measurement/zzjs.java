/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzis;
import com.google.android.gms.internal.measurement.zzkj;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzly;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzjs
extends zzis
implements zzkm,
zzly,
RandomAccess {
    private static final double[] zza;
    private double[] zzb;
    private int zzc;

    static {
        double[] dArray = new double[]{};
        zza = dArray;
        new zzjs(dArray, 0, false);
    }

    public zzjs() {
        double[] dArray = zza;
        this(dArray, 0, true);
    }

    private zzjs(double[] dArray, int n3, boolean bl2) {
        super(bl2);
        this.zzb = dArray;
        this.zzc = n3;
    }

    private static int zzd(int n3) {
        return Math.max(n3 * 3 / 2 + 1, 10);
    }

    private final String zze(int n3) {
        int n4 = this.zzc;
        return D70.b(n3, n4, "Index:", ", Size:");
    }

    private final void zzf(int n3) {
        int n4;
        if (n3 >= 0 && n3 < (n4 = this.zzc)) {
            return;
        }
        String string2 = this.zze(n3);
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    public final /* synthetic */ void add(int n3, Object object) {
        int n4;
        object = (Double)object;
        double d2 = (Double)object;
        this.zza();
        if (n3 >= 0 && n3 <= (n4 = this.zzc)) {
            double[] dArray = this.zzb;
            int n7 = dArray.length;
            if (n4 < n7) {
                n7 = n3 + 1;
                System.arraycopy(dArray, n3, dArray, n7, n4 -= n3);
            } else {
                n4 = zzjs.zzd(dArray.length);
                object = new double[n4];
                System.arraycopy(this.zzb, 0, object, 0, n3);
                dArray = this.zzb;
                n7 = n3 + 1;
                int n8 = this.zzc - n3;
                System.arraycopy(dArray, n3, object, n7, n8);
                this.zzb = (double[])object;
            }
            this.zzb[n3] = d2;
            this.zzc = n3 = this.zzc + 1;
            this.modCount = n3 = this.modCount + 1;
            return;
        }
        String string2 = this.zze(n3);
        object = new IndexOutOfBoundsException(string2);
        throw object;
    }

    public final /* synthetic */ boolean add(Object object) {
        double d2 = (Double)object;
        this.zza(d2);
        return true;
    }

    public final boolean addAll(Collection object) {
        this.zza();
        zzkj.zza(object);
        int n3 = object instanceof zzjs;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (zzjs)object;
        n3 = ((zzjs)object).zzc;
        if (n3 == 0) {
            return false;
        }
        int n4 = this.zzc;
        int n7 = (-1 >>> 1) - n4;
        if (n7 >= n3) {
            double[] dArray = this.zzb;
            n7 = dArray.length;
            if ((n4 += n3) > n7) {
                this.zzb = dArray = Arrays.copyOf(dArray, n4);
            }
            dArray = ((zzjs)object).zzb;
            double[] dArray2 = this.zzb;
            int n8 = this.zzc;
            int n10 = ((zzjs)object).zzc;
            System.arraycopy(dArray, 0, dArray2, n8, n10);
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
        int n3 = object instanceof zzjs;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (zzjs)object;
        n3 = this.zzc;
        int n4 = ((zzjs)object).zzc;
        if (n3 != n4) {
            return false;
        }
        object = ((zzjs)object).zzb;
        for (n3 = 0; n3 < (n4 = this.zzc); ++n3) {
            Object object2;
            long l2;
            double[] dArray = this.zzb;
            double d2 = dArray[n3];
            long l3 = Double.doubleToLongBits(d2);
            long l4 = l3 - (l2 = Double.doubleToLongBits((double)(object2 = object[n3])));
            n4 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
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
        for (int i3 = 0; i3 < (n3 = this.zzc); ++i3) {
            double[] dArray = this.zzb;
            double d2 = dArray[i3];
            long l2 = Double.doubleToLongBits(d2);
            n4 *= 31;
            n3 = zzkj.zza(l2);
            n4 += n3;
        }
        return n4;
    }

    public final int indexOf(Object object) {
        int n3 = object instanceof Double;
        int n4 = -1;
        if (n3 == 0) {
            return n4;
        }
        object = (Double)object;
        double d2 = (Double)object;
        int n7 = this.size();
        for (n3 = 0; n3 < n7; ++n3) {
            double[] dArray = this.zzb;
            double d5 = dArray[n3];
            double d7 = d5 - d2;
            Object object2 = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
            if (object2 != false) continue;
            return n3;
        }
        return n4;
    }

    public final /* synthetic */ Object remove(int n3) {
        this.zza();
        this.zzf(n3);
        double[] dArray = this.zzb;
        double d2 = dArray[n3];
        int n4 = this.zzc;
        int n7 = n4 + -1;
        if (n3 < n7) {
            n7 = n3 + 1;
            n4 = n4 - n3 + -1;
            System.arraycopy(dArray, n7, dArray, n3, n4);
        }
        this.zzc = n3 = this.zzc + -1;
        this.modCount = n3 = this.modCount + 1;
        return d2;
    }

    public final void removeRange(int n3, int n4) {
        this.zza();
        if (n4 >= n3) {
            double[] dArray = this.zzb;
            int n7 = this.zzc - n4;
            System.arraycopy(dArray, n4, dArray, n3, n7);
            int n8 = this.zzc;
            this.zzc = n8 -= (n4 -= n3);
            this.modCount = n3 = this.modCount + 1;
            return;
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("toIndex < fromIndex");
        throw indexOutOfBoundsException;
    }

    public final /* synthetic */ Object set(int n3, Object object) {
        double d2 = (Double)object;
        this.zza();
        this.zzf(n3);
        object = this.zzb;
        Object object2 = object[n3];
        object[n3] = d2;
        return (double)object2;
    }

    public final int size() {
        return this.zzc;
    }

    public final /* synthetic */ zzkm zza(int n3) {
        int n4 = this.zzc;
        if (n3 >= n4) {
            Object object;
            double[] dArray;
            if (n3 == 0) {
                dArray = zza;
            } else {
                object = this.zzb;
                dArray = Arrays.copyOf(object, n3);
            }
            object = new zzjs;
            int n7 = this.zzc;
            object(dArray, n7, true);
            return object;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public final void zza(double d2) {
        double[] dArray;
        this.zza();
        int n3 = this.zzc;
        double[] dArray2 = this.zzb;
        int n4 = dArray2.length;
        if (n3 == n4) {
            n3 = zzjs.zzd(dArray2.length);
            dArray = new double[n3];
            dArray2 = this.zzb;
            n4 = this.zzc;
            System.arraycopy(dArray2, 0, dArray, 0, n4);
            this.zzb = dArray;
        }
        dArray = this.zzb;
        int n7 = this.zzc;
        this.zzc = n4 = n7 + 1;
        dArray[n7] = d2;
    }

    public final double zzb(int n3) {
        this.zzf(n3);
        return this.zzb[n3];
    }

    public final void zzc(int n3) {
        double[] dArray = this.zzb;
        int n4 = dArray.length;
        if (n3 <= n4) {
            return;
        }
        n4 = dArray.length;
        if (n4 == 0) {
            double[] dArray2 = new double[Math.max(n3, 10)];
            this.zzb = dArray2;
            return;
        }
        int n7 = dArray.length;
        while (n7 < n3) {
            n7 = zzjs.zzd(n7);
        }
        double[] dArray3 = Arrays.copyOf(this.zzb, n7);
        this.zzb = dArray3;
    }
}

