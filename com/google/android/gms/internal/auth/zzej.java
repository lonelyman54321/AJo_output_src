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

final class zzej
extends zzdq
implements RandomAccess,
zzey,
zzgd {
    private static final zzej zza;
    private double[] zzb;
    private int zzc;

    static {
        zzej zzej2;
        double[] dArray = new double[]{};
        zza = zzej2 = new zzej(dArray, 0);
        zzej2.zzb();
    }

    public zzej() {
        double[] dArray = new double[10];
        this(dArray, 0);
    }

    private zzej(double[] dArray, int n3) {
        this.zzb = dArray;
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
        object = (Double)object;
        double d2 = (Double)object;
        this.zza();
        if (n3 >= 0 && n3 <= (n4 = this.zzc)) {
            double[] dArray = this.zzb;
            int n7 = dArray.length;
            int n8 = 1;
            if (n4 < n7) {
                n7 = n3 + 1;
                System.arraycopy(dArray, n3, dArray, n7, n4 -= n3);
            } else {
                n4 = zy_2.a(n4, 3, 2, n8);
                object = new double[n4];
                System.arraycopy(dArray, 0, object, 0, n3);
                dArray = this.zzb;
                n7 = n3 + 1;
                int n10 = this.zzc - n3;
                System.arraycopy(dArray, n3, object, n7, n10);
                this.zzb = (double[])object;
            }
            this.zzb[n3] = d2;
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
        int n3 = object instanceof zzej;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (zzej)object;
        n3 = ((zzej)object).zzc;
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
            dArray = ((zzej)object).zzb;
            double[] dArray2 = this.zzb;
            int n8 = this.zzc;
            int n10 = ((zzej)object).zzc;
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
        int n3 = object instanceof zzej;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (zzej)object;
        n3 = this.zzc;
        int n4 = ((zzej)object).zzc;
        if (n3 != n4) {
            return false;
        }
        object = ((zzej)object).zzb;
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
        this.zzg(n3);
        return this.zzb[n3];
    }

    public final int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = 0; i3 < (n3 = this.zzc); ++i3) {
            n4 *= 31;
            double[] dArray = this.zzb;
            double d2 = dArray[i3];
            long l2 = Double.doubleToLongBits(d2);
            n3 = zzez.zzc(l2);
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
        int n7 = this.zzc;
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

    public final int size() {
        return this.zzc;
    }

    public final void zze(double d2) {
        this.zza();
        int n3 = this.zzc;
        double[] dArray = this.zzb;
        int n4 = dArray.length;
        if (n3 == n4) {
            int n7 = 1;
            n4 = zy_2.a(n3, 3, 2, n7);
            double[] dArray2 = new double[n4];
            System.arraycopy(dArray, 0, dArray2, 0, n3);
            this.zzb = dArray2;
        }
        double[] dArray3 = this.zzb;
        int n8 = this.zzc;
        this.zzc = n4 = n8 + 1;
        dArray3[n8] = d2;
    }
}

