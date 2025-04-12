/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzl;
import com.google.android.gms.internal.ads.zzhbr;
import com.google.android.gms.internal.ads.zzhcb;
import com.google.android.gms.internal.ads.zzhdn;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzhav
extends zzgzl
implements RandomAccess,
zzhbr,
zzhdn {
    private static final zzhav zza;
    private double[] zzb;
    private int zzc;

    static {
        zzhav zzhav2;
        double[] dArray = new double[]{};
        zza = zzhav2 = new zzhav(dArray, 0, false);
    }

    public zzhav() {
        double[] dArray = new double[10];
        this(dArray, 0, true);
    }

    private zzhav(double[] dArray, int n3, boolean bl2) {
        super(bl2);
        this.zzb = dArray;
        this.zzc = n3;
    }

    public static zzhav zze() {
        return zza;
    }

    private final String zzi(int n3) {
        int n4 = this.zzc;
        return D70.b(n3, n4, "Index:", ", Size:");
    }

    private final void zzj(int n3) {
        int n4;
        if (n3 >= 0 && n3 < (n4 = this.zzc)) {
            return;
        }
        String string2 = this.zzi(n3);
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    public final /* synthetic */ void add(int n3, Object object) {
        int n4;
        object = (Double)object;
        double d2 = (Double)object;
        this.zzdJ();
        if (n3 >= 0 && n3 <= (n4 = this.zzc)) {
            int n7 = n3 + 1;
            double[] dArray = this.zzb;
            int n8 = dArray.length;
            int n10 = 1;
            if (n4 < n8) {
                System.arraycopy(dArray, n3, dArray, n7, n4 -= n3);
            } else {
                int n14 = 2;
                n4 = zy_2.a(n4, 3, n14, n10);
                object = new double[n4];
                System.arraycopy(dArray, 0, object, 0, n3);
                dArray = this.zzb;
                n8 = this.zzc - n3;
                System.arraycopy(dArray, n3, object, n7, n8);
                this.zzb = (double[])object;
            }
            this.zzb[n3] = d2;
            this.zzc = n3 = this.zzc + n10;
            this.modCount = n3 = this.modCount + n10;
            return;
        }
        String string2 = this.zzi(n3);
        object = new IndexOutOfBoundsException(string2);
        throw object;
    }

    public final boolean addAll(Collection object) {
        this.zzdJ();
        Object[] objectArray = zzhcb.zzd;
        object.getClass();
        int n3 = object instanceof zzhav;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (zzhav)object;
        n3 = ((zzhav)object).zzc;
        if (n3 == 0) {
            return false;
        }
        int n4 = this.zzc;
        int n7 = (-1 >>> 1) - n4;
        if (n7 >= n3) {
            objectArray = this.zzb;
            n7 = objectArray.length;
            if ((n4 += n3) > n7) {
                objectArray = Arrays.copyOf((double[])objectArray, n4);
                this.zzb = objectArray;
            }
            objectArray = ((zzhav)object).zzb;
            double[] dArray = this.zzb;
            int n8 = this.zzc;
            int n10 = ((zzhav)object).zzc;
            System.arraycopy(objectArray, 0, dArray, n8, n10);
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
        int n3 = object instanceof zzhav;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (zzhav)object;
        n3 = this.zzc;
        int n4 = ((zzhav)object).zzc;
        if (n3 != n4) {
            return false;
        }
        object = ((zzhav)object).zzb;
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
        this.zzj(n3);
        return this.zzb[n3];
    }

    public final int hashCode() {
        int n3;
        int n4 = 1;
        int n7 = 1;
        for (int i3 = 0; i3 < (n3 = this.zzc); i3 += n4) {
            double[] dArray = this.zzb;
            double d2 = dArray[i3];
            long l2 = Double.doubleToLongBits(d2);
            n7 *= 31;
            int n8 = 32;
            long l3 = l2 >>> n8;
            int n10 = (int)(l2 ^= l3);
            n7 += n10;
        }
        return n7;
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
        this.zzdJ();
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

    public final double zzd(int n3) {
        this.zzj(n3);
        return this.zzb[n3];
    }

    public final zzhbr zzg(int n3) {
        int n4 = this.zzc;
        if (n3 >= n4) {
            double[] dArray = Arrays.copyOf(this.zzb, n3);
            int n7 = this.zzc;
            zzhav zzhav2 = new zzhav(dArray, n7, true);
            return zzhav2;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public final void zzh(double d2) {
        this.zzdJ();
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

