/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzbt;
import com.google.android.gms.internal.icing.zzdc;
import com.google.android.gms.internal.icing.zzdh;
import com.google.android.gms.internal.icing.zzel;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzbv
extends zzbt
implements RandomAccess,
zzdc,
zzel {
    private static final zzbv zza;
    private boolean[] zzb;
    private int zzc;

    static {
        zzbv zzbv2;
        boolean[] blArray = new boolean[]{};
        zza = zzbv2 = new zzbv(blArray, 0);
        zzbv2.zzb();
    }

    public zzbv() {
        boolean[] blArray = new boolean[10];
        this(blArray, 0);
    }

    private zzbv(boolean[] blArray, int n3) {
        this.zzb = blArray;
        this.zzc = n3;
    }

    public static zzbv zzd() {
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
        int n3 = object instanceof zzbv;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (zzbv)object;
        n3 = ((zzbv)object).zzc;
        if (n3 == 0) {
            return false;
        }
        int n4 = this.zzc;
        int n7 = (-1 >>> 1) - n4;
        if (n7 >= n3) {
            boolean[] blArray = this.zzb;
            n7 = blArray.length;
            if ((n4 += n3) > n7) {
                this.zzb = blArray = Arrays.copyOf(blArray, n4);
            }
            blArray = ((zzbv)object).zzb;
            boolean[] blArray2 = this.zzb;
            int n8 = this.zzc;
            int n10 = ((zzbv)object).zzc;
            System.arraycopy(blArray, 0, blArray2, n8, n10);
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
        int n3 = object instanceof zzbv;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (zzbv)object;
        n3 = this.zzc;
        int n4 = ((zzbv)object).zzc;
        if (n3 != n4) {
            return false;
        }
        object = ((zzbv)object).zzb;
        for (n3 = 0; n3 < (n4 = this.zzc); ++n3) {
            boolean[] blArray = this.zzb;
            n4 = blArray[n3];
            Object object2 = object[n3];
            if (n4 == object2) continue;
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = 0; i3 < (n3 = this.zzc); ++i3) {
            n4 *= 31;
            boolean[] blArray = this.zzb;
            n3 = zzdh.zzf(blArray[i3]);
            n4 += n3;
        }
        return n4;
    }

    public final int indexOf(Object object) {
        int n3 = object instanceof Boolean;
        int n4 = -1;
        if (n3 == 0) {
            return n4;
        }
        object = (Boolean)object;
        boolean bl2 = (Boolean)object;
        n3 = this.zzc;
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean[] blArray = this.zzb;
            boolean bl3 = blArray[i3];
            if (bl3 != bl2) continue;
            return i3;
        }
        return n4;
    }

    public final void removeRange(int n3, int n4) {
        this.zzc();
        if (n4 >= n3) {
            boolean[] blArray = this.zzb;
            int n7 = this.zzc - n4;
            System.arraycopy(blArray, n4, blArray, n3, n7);
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

