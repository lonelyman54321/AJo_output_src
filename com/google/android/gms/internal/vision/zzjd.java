/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzhj;
import com.google.android.gms.internal.vision.zzjf;
import com.google.android.gms.internal.vision.zzjl;
import com.google.android.gms.internal.vision.zzkw;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzjd
extends zzhj
implements zzjl,
zzkw,
RandomAccess {
    private static final zzjd zza;
    private int[] zzb;
    private int zzc;

    static {
        zzjd zzjd2;
        int[] nArray = new int[]{};
        zza = zzjd2 = new zzjd(nArray, 0);
        zzjd2.zzb();
    }

    public zzjd() {
        int[] nArray = new int[10];
        this(nArray, 0);
    }

    private zzjd(int[] nArray, int n3) {
        this.zzb = nArray;
        this.zzc = n3;
    }

    public static zzjd zzd() {
        return zza;
    }

    private final void zzd(int n3) {
        int n4;
        if (n3 >= 0 && n3 < (n4 = this.zzc)) {
            return;
        }
        String string2 = this.zze(n3);
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    private final String zze(int n3) {
        int n4 = this.zzc;
        return C12.a(35, n3, n4, "Index:", ", Size:");
    }

    public final /* synthetic */ void add(int n3, Object object) {
        int n4;
        object = (Integer)object;
        int n7 = (Integer)object;
        this.zzc();
        if (n3 >= 0 && n3 <= (n4 = this.zzc)) {
            int[] nArray = this.zzb;
            int n8 = nArray.length;
            int n10 = 1;
            if (n4 < n8) {
                n8 = n3 + 1;
                System.arraycopy(nArray, n3, nArray, n8, n4 -= n3);
            } else {
                n4 = zy_2.a(n4, 3, 2, n10);
                int[] nArray2 = new int[n4];
                System.arraycopy(nArray, 0, nArray2, 0, n3);
                nArray = this.zzb;
                n8 = n3 + 1;
                int n14 = this.zzc - n3;
                System.arraycopy(nArray, n3, nArray2, n8, n14);
                this.zzb = nArray2;
            }
            this.zzb[n3] = n7;
            this.zzc = n3 = this.zzc + n10;
            this.modCount = n3 = this.modCount + n10;
            return;
        }
        String string2 = this.zze(n3);
        object = new IndexOutOfBoundsException(string2);
        throw object;
    }

    public final /* synthetic */ boolean add(Object object) {
        int n3 = (Integer)object;
        this.zzc(n3);
        return true;
    }

    public final boolean addAll(Collection object) {
        this.zzc();
        zzjf.zza(object);
        int n3 = object instanceof zzjd;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (zzjd)object;
        n3 = ((zzjd)object).zzc;
        if (n3 == 0) {
            return false;
        }
        int n4 = this.zzc;
        int n7 = (-1 >>> 1) - n4;
        if (n7 >= n3) {
            int[] nArray = this.zzb;
            n7 = nArray.length;
            if ((n4 += n3) > n7) {
                this.zzb = nArray = Arrays.copyOf(nArray, n4);
            }
            nArray = ((zzjd)object).zzb;
            int[] nArray2 = this.zzb;
            int n8 = this.zzc;
            int n10 = ((zzjd)object).zzc;
            System.arraycopy(nArray, 0, nArray2, n8, n10);
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
        int n3 = object instanceof zzjd;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (zzjd)object;
        n3 = this.zzc;
        int n4 = ((zzjd)object).zzc;
        if (n3 != n4) {
            return false;
        }
        object = ((zzjd)object).zzb;
        for (n3 = 0; n3 < (n4 = this.zzc); ++n3) {
            int[] nArray = this.zzb;
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
        for (int i3 = 0; i3 < (n3 = this.zzc); ++i3) {
            n4 *= 31;
            int[] nArray = this.zzb;
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
            int[] nArray = this.zzb;
            int n8 = nArray[i3];
            if (n8 != n7) continue;
            return i3;
        }
        return n4;
    }

    public final /* synthetic */ Object remove(int n3) {
        this.zzc();
        this.zzd(n3);
        int[] nArray = this.zzb;
        int n4 = nArray[n3];
        int n7 = this.zzc;
        int n8 = n7 + -1;
        if (n3 < n8) {
            n8 = n3 + 1;
            n7 = n7 - n3 + -1;
            System.arraycopy(nArray, n8, nArray, n3, n7);
        }
        this.zzc = n3 = this.zzc + -1;
        this.modCount = n3 = this.modCount + 1;
        return n4;
    }

    public final void removeRange(int n3, int n4) {
        this.zzc();
        if (n4 >= n3) {
            int[] nArray = this.zzb;
            int n7 = this.zzc - n4;
            System.arraycopy(nArray, n4, nArray, n3, n7);
            int n8 = this.zzc;
            this.zzc = n8 -= (n4 -= n3);
            this.modCount = n3 = this.modCount + 1;
            return;
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("toIndex < fromIndex");
        throw indexOutOfBoundsException;
    }

    public final /* synthetic */ Object set(int n3, Object object) {
        int n4 = (Integer)object;
        this.zzc();
        this.zzd(n3);
        int[] nArray = this.zzb;
        int n7 = nArray[n3];
        nArray[n3] = n4;
        return n7;
    }

    public final int size() {
        return this.zzc;
    }

    public final /* synthetic */ zzjl zza(int n3) {
        int n4 = this.zzc;
        if (n3 >= n4) {
            int[] nArray = Arrays.copyOf(this.zzb, n3);
            int n7 = this.zzc;
            zzjd zzjd2 = new zzjd(nArray, n7);
            return zzjd2;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public final int zzb(int n3) {
        this.zzd(n3);
        return this.zzb[n3];
    }

    public final void zzc(int n3) {
        this.zzc();
        int n4 = this.zzc;
        int[] nArray = this.zzb;
        int n7 = nArray.length;
        if (n4 == n7) {
            int n8 = 1;
            n7 = zy_2.a(n4, 3, 2, n8);
            int[] nArray2 = new int[n7];
            System.arraycopy(nArray, 0, nArray2, 0, n4);
            this.zzb = nArray2;
        }
        int[] nArray3 = this.zzb;
        int n10 = this.zzc;
        this.zzc = n7 = n10 + 1;
        nArray3[n10] = n3;
    }
}

