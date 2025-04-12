/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzbt;
import com.google.android.gms.internal.icing.zzdd;
import com.google.android.gms.internal.icing.zzdh;
import com.google.android.gms.internal.icing.zzel;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzco
extends zzbt
implements RandomAccess,
zzdd,
zzel {
    private static final zzco zza;
    private double[] zzb;
    private int zzc;

    static {
        zzco zzco2;
        double[] dArray = new double[]{};
        zza = zzco2 = new zzco(dArray, 0);
        zzco2.zzb();
    }

    public zzco() {
        double[] dArray = new double[10];
        this(dArray, 0);
    }

    private zzco(double[] dArray, int n3) {
        this.zzb = dArray;
        this.zzc = n3;
    }

    public static zzco zzd() {
        return zza;
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
        int n3 = object instanceof zzco;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (zzco)object;
        n3 = ((zzco)object).zzc;
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
            dArray = ((zzco)object).zzb;
            double[] dArray2 = this.zzb;
            int n8 = this.zzc;
            int n10 = ((zzco)object).zzc;
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
        int n3 = object instanceof zzco;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (zzco)object;
        n3 = this.zzc;
        int n4 = ((zzco)object).zzc;
        if (n3 != n4) {
            return false;
        }
        object = ((zzco)object).zzb;
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

    public final int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = 0; i3 < (n3 = this.zzc); ++i3) {
            n4 *= 31;
            double[] dArray = this.zzb;
            double d2 = dArray[i3];
            long l2 = Double.doubleToLongBits(d2);
            n3 = zzdh.zze(l2);
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
        this.zzc();
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
}

