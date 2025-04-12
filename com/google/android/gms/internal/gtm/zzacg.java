/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzack;
import com.google.android.gms.internal.gtm.zzaco;
import com.google.android.gms.internal.gtm.zzyj;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzacg
extends zzyj
implements RandomAccess,
zzack {
    private static final int[] zza;
    private static final zzacg zzb;
    private int[] zzc;
    private int zzd;

    static {
        zzacg zzacg2;
        int[] nArray = new int[]{};
        zza = nArray;
        zzb = zzacg2 = new zzacg(nArray, 0, false);
    }

    public zzacg() {
        int[] nArray = zza;
        this(nArray, 0, true);
    }

    private zzacg(int[] nArray, int n3, boolean bl2) {
        super(bl2);
        this.zzc = nArray;
        this.zzd = n3;
    }

    public static zzacg zzf() {
        return zzb;
    }

    private static int zzj(int n3) {
        return Math.max(n3 * 3 / 2 + 1, 10);
    }

    private final String zzk(int n3) {
        int n4 = this.zzd;
        return D70.b(n3, n4, "Index:", ", Size:");
    }

    private final void zzl(int n3) {
        int n4;
        if (n3 >= 0 && n3 < (n4 = this.zzd)) {
            return;
        }
        String string2 = this.zzk(n3);
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    public final /* synthetic */ void add(int n3, Object object) {
        int n4;
        object = (Integer)object;
        int n7 = (Integer)object;
        this.zza();
        if (n3 >= 0 && n3 <= (n4 = this.zzd)) {
            int n8 = n3 + 1;
            int[] nArray = this.zzc;
            int n10 = nArray.length;
            if (n4 < n10) {
                System.arraycopy(nArray, n3, nArray, n8, n4 -= n3);
            } else {
                n4 = zzacg.zzj(n10);
                int[] nArray2 = new int[n4];
                System.arraycopy(this.zzc, 0, nArray2, 0, n3);
                nArray = this.zzc;
                n10 = this.zzd - n3;
                System.arraycopy(nArray, n3, nArray2, n8, n10);
                this.zzc = nArray2;
            }
            this.zzc[n3] = n7;
            this.zzd = n3 = this.zzd + 1;
            this.modCount = n3 = this.modCount + 1;
            return;
        }
        String string2 = this.zzk(n3);
        object = new IndexOutOfBoundsException(string2);
        throw object;
    }

    public final boolean addAll(Collection object) {
        this.zza();
        Object[] objectArray = zzaco.zzb;
        object.getClass();
        int n3 = object instanceof zzacg;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (zzacg)object;
        n3 = ((zzacg)object).zzd;
        if (n3 == 0) {
            return false;
        }
        int n4 = this.zzd;
        int n7 = (-1 >>> 1) - n4;
        if (n7 >= n3) {
            objectArray = this.zzc;
            n7 = objectArray.length;
            if ((n4 += n3) > n7) {
                objectArray = Arrays.copyOf((int[])objectArray, n4);
                this.zzc = objectArray;
            }
            objectArray = ((zzacg)object).zzc;
            int[] nArray = this.zzc;
            int n8 = this.zzd;
            int n10 = ((zzacg)object).zzd;
            System.arraycopy(objectArray, 0, nArray, n8, n10);
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
        int n3 = object instanceof zzacg;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (zzacg)object;
        n3 = this.zzd;
        int n4 = ((zzacg)object).zzd;
        if (n3 != n4) {
            return false;
        }
        object = ((zzacg)object).zzc;
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
        this.zzl(n3);
        return this.zzc[n3];
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
        n3 = this.zzd;
        for (int i3 = 0; i3 < n3; ++i3) {
            int[] nArray = this.zzc;
            int n8 = nArray[i3];
            if (n8 != n7) continue;
            return i3;
        }
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

    public final int size() {
        return this.zzd;
    }

    public final int zze(int n3) {
        this.zzl(n3);
        return this.zzc[n3];
    }

    public final zzack zzg(int n3) {
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
            object = new zzacg;
            int n7 = this.zzd;
            object(nArray, n7, true);
            return object;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public final void zzh(int n3) {
        int n4;
        int[] nArray;
        this.zza();
        int n7 = this.zzd;
        int[] nArray2 = this.zzc;
        int n8 = nArray2.length;
        if (n7 == n8) {
            n7 = zzacg.zzj(n8);
            nArray = new int[n7];
            nArray2 = this.zzc;
            n4 = this.zzd;
            System.arraycopy(nArray2, 0, nArray, 0, n4);
            this.zzc = nArray;
        }
        nArray = this.zzc;
        n8 = this.zzd;
        this.zzd = n4 = n8 + 1;
        nArray[n8] = n3;
    }

    public final void zzi(int n3) {
        int[] nArray = this.zzc;
        int n4 = nArray.length;
        if (n3 <= n4) {
            return;
        }
        if (n4 != 0) {
            while (n4 < n3) {
                n4 = zzacg.zzj(n4);
            }
            int[] nArray2 = Arrays.copyOf(this.zzc, n4);
            this.zzc = nArray2;
            return;
        }
        int[] nArray3 = new int[Math.max(n3, 10)];
        this.zzc = nArray3;
    }
}

