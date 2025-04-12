/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacn;
import com.google.android.gms.internal.gtm.zzaco;
import com.google.android.gms.internal.gtm.zzyj;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzyo
extends zzyj
implements RandomAccess,
zzacn {
    private static final boolean[] zza;
    private boolean[] zzb;
    private int zzc;

    static {
        boolean[] blArray = new boolean[]{};
        zza = blArray;
        new zzyo(blArray, 0, false);
    }

    public zzyo() {
        boolean[] blArray = zza;
        this(blArray, 0, true);
    }

    private zzyo(boolean[] blArray, int n3, boolean bl2) {
        super(bl2);
        this.zzb = blArray;
        this.zzc = n3;
    }

    private static int zzg(int n3) {
        return Math.max(n3 * 3 / 2 + 1, 10);
    }

    private final String zzh(int n3) {
        int n4 = this.zzc;
        return D70.b(n3, n4, "Index:", ", Size:");
    }

    private final void zzi(int n3) {
        int n4;
        if (n3 >= 0 && n3 < (n4 = this.zzc)) {
            return;
        }
        String string2 = this.zzh(n3);
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    public final /* synthetic */ void add(int n3, Object object) {
        int n4;
        object = (Boolean)object;
        boolean bl2 = (Boolean)object;
        this.zza();
        if (n3 >= 0 && n3 <= (n4 = this.zzc)) {
            int n7 = n3 + 1;
            boolean[] blArray = this.zzb;
            int n8 = blArray.length;
            if (n4 < n8) {
                System.arraycopy(blArray, n3, blArray, n7, n4 -= n3);
            } else {
                n4 = zzyo.zzg(n8);
                boolean[] blArray2 = new boolean[n4];
                System.arraycopy(this.zzb, 0, blArray2, 0, n3);
                blArray = this.zzb;
                n8 = this.zzc - n3;
                System.arraycopy(blArray, n3, blArray2, n7, n8);
                this.zzb = blArray2;
            }
            this.zzb[n3] = bl2;
            this.zzc = n3 = this.zzc + 1;
            this.modCount = n3 = this.modCount + 1;
            return;
        }
        String string2 = this.zzh(n3);
        object = new IndexOutOfBoundsException(string2);
        throw object;
    }

    public final boolean addAll(Collection object) {
        this.zza();
        Object[] objectArray = zzaco.zzb;
        object.getClass();
        int n3 = object instanceof zzyo;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (zzyo)object;
        n3 = ((zzyo)object).zzc;
        if (n3 == 0) {
            return false;
        }
        int n4 = this.zzc;
        int n7 = (-1 >>> 1) - n4;
        if (n7 >= n3) {
            objectArray = this.zzb;
            n7 = objectArray.length;
            if ((n4 += n3) > n7) {
                objectArray = Arrays.copyOf((boolean[])objectArray, n4);
                this.zzb = (boolean[])objectArray;
            }
            objectArray = ((zzyo)object).zzb;
            boolean[] blArray = this.zzb;
            int n8 = this.zzc;
            int n10 = ((zzyo)object).zzc;
            System.arraycopy(objectArray, 0, blArray, n8, n10);
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
        int n3 = object instanceof zzyo;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (zzyo)object;
        n3 = this.zzc;
        int n4 = ((zzyo)object).zzc;
        if (n3 != n4) {
            return false;
        }
        object = ((zzyo)object).zzb;
        for (n3 = 0; n3 < (n4 = this.zzc); ++n3) {
            boolean[] blArray = this.zzb;
            n4 = blArray[n3];
            Object object2 = object[n3];
            if (n4 == object2) continue;
            return false;
        }
        return bl2;
    }

    public final /* synthetic */ Object get(int n3) {
        this.zzi(n3);
        return this.zzb[n3];
    }

    public final int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = 0; i3 < (n3 = this.zzc); ++i3) {
            n4 *= 31;
            boolean[] blArray = this.zzb;
            n3 = zzaco.zza(blArray[i3]);
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
        this.zza();
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

    public final void zze(boolean bl2) {
        int n3;
        boolean[] blArray;
        this.zza();
        int n4 = this.zzc;
        boolean[] blArray2 = this.zzb;
        int n7 = blArray2.length;
        if (n4 == n7) {
            n4 = zzyo.zzg(n7);
            blArray = new boolean[n4];
            blArray2 = this.zzb;
            n3 = this.zzc;
            System.arraycopy(blArray2, 0, blArray, 0, n3);
            this.zzb = blArray;
        }
        blArray = this.zzb;
        n7 = this.zzc;
        this.zzc = n3 = n7 + 1;
        blArray[n7] = bl2;
    }

    public final boolean zzf(int n3) {
        this.zzi(n3);
        return this.zzb[n3];
    }
}

