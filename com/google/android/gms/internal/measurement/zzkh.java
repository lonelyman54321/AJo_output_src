/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzis;
import com.google.android.gms.internal.measurement.zzkj;
import com.google.android.gms.internal.measurement.zzkk;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzly;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzkh
extends zzis
implements zzkk,
zzly,
RandomAccess {
    private static final int[] zza;
    private static final zzkh zzb;
    private int[] zzc;
    private int zzd;

    static {
        zzkh zzkh2;
        int[] nArray = new int[]{};
        zza = nArray;
        zzb = zzkh2 = new zzkh(nArray, 0, false);
    }

    public zzkh() {
        int[] nArray = zza;
        this(nArray, 0, true);
    }

    private zzkh(int[] nArray, int n3, boolean bl2) {
        super(bl2);
        this.zzc = nArray;
        this.zzd = n3;
    }

    public static zzkh zzd() {
        return zzb;
    }

    private static int zzf(int n3) {
        return Math.max(n3 * 3 / 2 + 1, 10);
    }

    private final String zzg(int n3) {
        int n4 = this.zzd;
        return D70.b(n3, n4, "Index:", ", Size:");
    }

    private final void zzh(int n3) {
        int n4;
        if (n3 >= 0 && n3 < (n4 = this.zzd)) {
            return;
        }
        String string2 = this.zzg(n3);
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    public final /* synthetic */ void add(int n3, Object object) {
        int n4;
        object = (Integer)object;
        int n7 = (Integer)object;
        this.zza();
        if (n3 >= 0 && n3 <= (n4 = this.zzd)) {
            int[] nArray = this.zzc;
            int n8 = nArray.length;
            if (n4 < n8) {
                n8 = n3 + 1;
                System.arraycopy(nArray, n3, nArray, n8, n4 -= n3);
            } else {
                n4 = zzkh.zzf(nArray.length);
                int[] nArray2 = new int[n4];
                System.arraycopy(this.zzc, 0, nArray2, 0, n3);
                nArray = this.zzc;
                n8 = n3 + 1;
                int n10 = this.zzd - n3;
                System.arraycopy(nArray, n3, nArray2, n8, n10);
                this.zzc = nArray2;
            }
            this.zzc[n3] = n7;
            this.zzd = n3 = this.zzd + 1;
            this.modCount = n3 = this.modCount + 1;
            return;
        }
        String string2 = this.zzg(n3);
        object = new IndexOutOfBoundsException(string2);
        throw object;
    }

    public final /* synthetic */ boolean add(Object object) {
        int n3 = (Integer)object;
        this.zzd(n3);
        return true;
    }

    public final boolean addAll(Collection object) {
        this.zza();
        zzkj.zza(object);
        int n3 = object instanceof zzkh;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (zzkh)object;
        n3 = ((zzkh)object).zzd;
        if (n3 == 0) {
            return false;
        }
        int n4 = this.zzd;
        int n7 = (-1 >>> 1) - n4;
        if (n7 >= n3) {
            int[] nArray = this.zzc;
            n7 = nArray.length;
            if ((n4 += n3) > n7) {
                this.zzc = nArray = Arrays.copyOf(nArray, n4);
            }
            nArray = ((zzkh)object).zzc;
            int[] nArray2 = this.zzc;
            int n8 = this.zzd;
            int n10 = ((zzkh)object).zzd;
            System.arraycopy(nArray, 0, nArray2, n8, n10);
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
        int n3 = object instanceof zzkh;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (zzkh)object;
        n3 = this.zzd;
        int n4 = ((zzkh)object).zzd;
        if (n3 != n4) {
            return false;
        }
        object = ((zzkh)object).zzc;
        for (n3 = 0; n3 < (n4 = this.zzd); ++n3) {
            int[] nArray = this.zzc;
            n4 = nArray[n3];
            Object object2 = object[n3];
            if (n4 == object2) continue;
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
            int[] nArray = this.zzc;
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
        n3 = this.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            int[] nArray = this.zzc;
            int n8 = nArray[i3];
            if (n8 != n7) continue;
            return i3;
        }
        return n4;
    }

    public final /* synthetic */ Object remove(int n3) {
        this.zza();
        this.zzh(n3);
        int[] nArray = this.zzc;
        int n4 = nArray[n3];
        int n7 = this.zzd;
        int n8 = n7 + -1;
        if (n3 < n8) {
            n8 = n3 + 1;
            n7 = n7 - n3 + -1;
            System.arraycopy(nArray, n8, nArray, n3, n7);
        }
        this.zzd = n3 = this.zzd + -1;
        this.modCount = n3 = this.modCount + 1;
        return n4;
    }

    public final void removeRange(int n3, int n4) {
        this.zza();
        if (n4 >= n3) {
            int[] nArray = this.zzc;
            int n7 = this.zzd - n4;
            System.arraycopy(nArray, n4, nArray, n3, n7);
            int n8 = this.zzd;
            this.zzd = n8 -= (n4 -= n3);
            this.modCount = n3 = this.modCount + 1;
            return;
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("toIndex < fromIndex");
        throw indexOutOfBoundsException;
    }

    public final /* synthetic */ Object set(int n3, Object object) {
        int n4 = (Integer)object;
        this.zza();
        this.zzh(n3);
        int[] nArray = this.zzc;
        int n7 = nArray[n3];
        nArray[n3] = n4;
        return n7;
    }

    public final int size() {
        return this.zzd;
    }

    public final /* synthetic */ zzkm zza(int n3) {
        return this.zzc(n3);
    }

    public final int zzb(int n3) {
        this.zzh(n3);
        return this.zzc[n3];
    }

    public final zzkk zzc(int n3) {
        int n4 = this.zzd;
        if (n3 >= n4) {
            Object object;
            int[] nArray;
            if (n3 == 0) {
                nArray = zza;
            } else {
                object = this.zzc;
                nArray = Arrays.copyOf(object, n3);
            }
            object = new zzkh;
            int n7 = this.zzd;
            object(nArray, n7, true);
            return object;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public final void zzd(int n3) {
        int[] nArray;
        this.zza();
        int n4 = this.zzd;
        int[] nArray2 = this.zzc;
        int n7 = nArray2.length;
        if (n4 == n7) {
            n4 = zzkh.zzf(nArray2.length);
            nArray = new int[n4];
            nArray2 = this.zzc;
            n7 = this.zzd;
            System.arraycopy(nArray2, 0, nArray, 0, n7);
            this.zzc = nArray;
        }
        nArray = this.zzc;
        int n8 = this.zzd;
        this.zzd = n7 = n8 + 1;
        nArray[n8] = n3;
    }

    public final void zze(int n3) {
        int[] nArray = this.zzc;
        int n4 = nArray.length;
        if (n3 <= n4) {
            return;
        }
        n4 = nArray.length;
        if (n4 == 0) {
            int[] nArray2 = new int[Math.max(n3, 10)];
            this.zzc = nArray2;
            return;
        }
        int n7 = nArray.length;
        while (n7 < n3) {
            n7 = zzkh.zzf(n7);
        }
        int[] nArray3 = Arrays.copyOf(this.zzc, n7);
        this.zzc = nArray3;
    }
}

