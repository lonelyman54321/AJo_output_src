/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzl;
import com.google.android.gms.internal.ads.zzhbw;
import com.google.android.gms.internal.ads.zzhcb;
import com.google.android.gms.internal.ads.zzhdn;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzhbp
extends zzgzl
implements RandomAccess,
zzhbw,
zzhdn {
    private static final zzhbp zza;
    private int[] zzb;
    private int zzc;

    static {
        zzhbp zzhbp2;
        int[] nArray = new int[]{};
        zza = zzhbp2 = new zzhbp(nArray, 0, false);
    }

    public zzhbp() {
        int[] nArray = new int[10];
        this(nArray, 0, true);
    }

    private zzhbp(int[] nArray, int n3, boolean bl2) {
        super(bl2);
        this.zzb = nArray;
        this.zzc = n3;
    }

    public static zzhbp zzg() {
        return zza;
    }

    private final String zzj(int n3) {
        int n4 = this.zzc;
        return D70.b(n3, n4, "Index:", ", Size:");
    }

    private final void zzk(int n3) {
        int n4;
        if (n3 >= 0 && n3 < (n4 = this.zzc)) {
            return;
        }
        String string2 = this.zzj(n3);
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    public final /* synthetic */ void add(int n3, Object object) {
        int n4;
        object = (Integer)object;
        int n7 = (Integer)object;
        this.zzdJ();
        if (n3 >= 0 && n3 <= (n4 = this.zzc)) {
            int n8 = n3 + 1;
            int[] nArray = this.zzb;
            int n10 = nArray.length;
            int n14 = 1;
            if (n4 < n10) {
                System.arraycopy(nArray, n3, nArray, n8, n4 -= n3);
            } else {
                int n15 = 2;
                n4 = zy_2.a(n4, 3, n15, n14);
                int[] nArray2 = new int[n4];
                System.arraycopy(nArray, 0, nArray2, 0, n3);
                nArray = this.zzb;
                n10 = this.zzc - n3;
                System.arraycopy(nArray, n3, nArray2, n8, n10);
                this.zzb = nArray2;
            }
            this.zzb[n3] = n7;
            this.zzc = n3 = this.zzc + n14;
            this.modCount = n3 = this.modCount + n14;
            return;
        }
        String string2 = this.zzj(n3);
        object = new IndexOutOfBoundsException(string2);
        throw object;
    }

    public final boolean addAll(Collection object) {
        this.zzdJ();
        Object[] objectArray = zzhcb.zzd;
        object.getClass();
        int n3 = object instanceof zzhbp;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (zzhbp)object;
        n3 = ((zzhbp)object).zzc;
        if (n3 == 0) {
            return false;
        }
        int n4 = this.zzc;
        int n7 = (-1 >>> 1) - n4;
        if (n7 >= n3) {
            objectArray = this.zzb;
            n7 = objectArray.length;
            if ((n4 += n3) > n7) {
                objectArray = Arrays.copyOf((int[])objectArray, n4);
                this.zzb = objectArray;
            }
            objectArray = ((zzhbp)object).zzb;
            int[] nArray = this.zzb;
            int n8 = this.zzc;
            int n10 = ((zzhbp)object).zzc;
            System.arraycopy(objectArray, 0, nArray, n8, n10);
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
        int n3 = object instanceof zzhbp;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (zzhbp)object;
        n3 = this.zzc;
        int n4 = ((zzhbp)object).zzc;
        if (n3 != n4) {
            return false;
        }
        object = ((zzhbp)object).zzb;
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
        this.zzk(n3);
        return this.zzb[n3];
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
        n3 = this.zzc;
        for (int i3 = 0; i3 < n3; ++i3) {
            int[] nArray = this.zzb;
            int n8 = nArray[i3];
            if (n8 != n7) continue;
            return i3;
        }
        return n4;
    }

    public final void removeRange(int n3, int n4) {
        this.zzdJ();
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

    public final int size() {
        return this.zzc;
    }

    public final int zzd(int n3) {
        this.zzk(n3);
        return this.zzb[n3];
    }

    public final int zze(int n3, int n4) {
        this.zzdJ();
        this.zzk(n3);
        int[] nArray = this.zzb;
        int n7 = nArray[n3];
        nArray[n3] = n4;
        return n7;
    }

    public final zzhbw zzh(int n3) {
        int n4 = this.zzc;
        if (n3 >= n4) {
            int[] nArray = Arrays.copyOf(this.zzb, n3);
            int n7 = this.zzc;
            zzhbp zzhbp2 = new zzhbp(nArray, n7, true);
            return zzhbp2;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public final void zzi(int n3) {
        this.zzdJ();
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

