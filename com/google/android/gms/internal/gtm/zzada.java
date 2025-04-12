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

final class zzada
extends zzyj
implements RandomAccess,
zzacn {
    private static final long[] zza;
    private long[] zzb;
    private int zzc;

    static {
        long[] lArray = new long[]{};
        zza = lArray;
        new zzada(lArray, 0, false);
    }

    public zzada() {
        long[] lArray = zza;
        this(lArray, 0, true);
    }

    private zzada(long[] lArray, int n3, boolean bl2) {
        super(bl2);
        this.zzb = lArray;
        this.zzc = n3;
    }

    private static int zzh(int n3) {
        return Math.max(n3 * 3 / 2 + 1, 10);
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
        object = (Long)object;
        long l2 = (Long)object;
        this.zza();
        if (n3 >= 0 && n3 <= (n4 = this.zzc)) {
            int n7 = n3 + 1;
            long[] lArray = this.zzb;
            int n8 = lArray.length;
            if (n4 < n8) {
                System.arraycopy(lArray, n3, lArray, n7, n4 -= n3);
            } else {
                n4 = zzada.zzh(n8);
                object = new long[n4];
                System.arraycopy(this.zzb, 0, object, 0, n3);
                lArray = this.zzb;
                n8 = this.zzc - n3;
                System.arraycopy(lArray, n3, object, n7, n8);
                this.zzb = (long[])object;
            }
            this.zzb[n3] = l2;
            this.zzc = n3 = this.zzc + 1;
            this.modCount = n3 = this.modCount + 1;
            return;
        }
        String string2 = this.zzi(n3);
        object = new IndexOutOfBoundsException(string2);
        throw object;
    }

    public final boolean addAll(Collection object) {
        this.zza();
        Object[] objectArray = zzaco.zzb;
        object.getClass();
        int n3 = object instanceof zzada;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (zzada)object;
        n3 = ((zzada)object).zzc;
        if (n3 == 0) {
            return false;
        }
        int n4 = this.zzc;
        int n7 = (-1 >>> 1) - n4;
        if (n7 >= n3) {
            objectArray = this.zzb;
            n7 = objectArray.length;
            if ((n4 += n3) > n7) {
                objectArray = Arrays.copyOf((long[])objectArray, n4);
                this.zzb = objectArray;
            }
            objectArray = ((zzada)object).zzb;
            long[] lArray = this.zzb;
            int n8 = this.zzc;
            int n10 = ((zzada)object).zzc;
            System.arraycopy(objectArray, 0, lArray, n8, n10);
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
        int n3 = object instanceof zzada;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (zzada)object;
        n3 = this.zzc;
        int n4 = ((zzada)object).zzc;
        if (n3 != n4) {
            return false;
        }
        object = ((zzada)object).zzb;
        for (n3 = 0; n3 < (n4 = this.zzc); ++n3) {
            long[] lArray = this.zzb;
            long l2 = lArray[n3];
            Object object2 = object[n3];
            long l3 = l2 - object2;
            n4 = (int)(l3 == 0L ? 0 : (l3 < 0L ? -1 : 1));
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
            n7 *= 31;
            long l2 = this.zzb[i3];
            n3 = 32;
            long l3 = l2 >>> n3;
            long l4 = l2 ^ l3;
            int n8 = (int)l4;
            n7 += n8;
        }
        return n7;
    }

    public final int indexOf(Object object) {
        int n3 = object instanceof Long;
        int n4 = -1;
        if (n3 == 0) {
            return n4;
        }
        object = (Long)object;
        long l2 = (Long)object;
        int n7 = this.zzc;
        for (n3 = 0; n3 < n7; ++n3) {
            long[] lArray = this.zzb;
            long l3 = lArray[n3];
            long l4 = l3 - l2;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 != false) continue;
            return n3;
        }
        return n4;
    }

    public final void removeRange(int n3, int n4) {
        this.zza();
        if (n4 >= n3) {
            long[] lArray = this.zzb;
            int n7 = this.zzc - n4;
            System.arraycopy(lArray, n4, lArray, n3, n7);
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

    public final long zze(int n3) {
        this.zzj(n3);
        return this.zzb[n3];
    }

    public final void zzf(long l2) {
        int n3;
        long[] lArray;
        this.zza();
        int n4 = this.zzc;
        long[] lArray2 = this.zzb;
        int n7 = lArray2.length;
        if (n4 == n7) {
            n4 = zzada.zzh(n7);
            lArray = new long[n4];
            lArray2 = this.zzb;
            n3 = this.zzc;
            System.arraycopy(lArray2, 0, lArray, 0, n3);
            this.zzb = lArray;
        }
        lArray = this.zzb;
        n7 = this.zzc;
        this.zzc = n3 = n7 + 1;
        lArray[n7] = l2;
    }

    public final void zzg(int n3) {
        long[] lArray = this.zzb;
        int n4 = lArray.length;
        if (n3 <= n4) {
            return;
        }
        if (n4 != 0) {
            while (n4 < n3) {
                n4 = zzada.zzh(n4);
            }
            long[] lArray2 = Arrays.copyOf(this.zzb, n4);
            this.zzb = lArray2;
            return;
        }
        long[] lArray3 = new long[Math.max(n3, 10)];
        this.zzb = lArray3;
    }
}

