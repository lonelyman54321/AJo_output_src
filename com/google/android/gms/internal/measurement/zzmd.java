/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzis;
import com.google.android.gms.internal.measurement.zzkm;
import java.util.Arrays;
import java.util.RandomAccess;

final class zzmd
extends zzis
implements RandomAccess {
    private static final Object[] zza;
    private static final zzmd zzb;
    private Object[] zzc;
    private int zzd;

    static {
        zzmd zzmd2;
        Object[] objectArray = new Object[]{};
        zza = objectArray;
        zzb = zzmd2 = new zzmd(objectArray, 0, false);
    }

    public zzmd() {
        Object[] objectArray = zza;
        this(objectArray, 0, true);
    }

    private zzmd(Object[] objectArray, int n3, boolean bl2) {
        super(bl2);
        this.zzc = objectArray;
        this.zzd = n3;
    }

    private static int zzc(int n3) {
        return Math.max(n3 * 3 / 2 + 1, 10);
    }

    public static zzmd zzd() {
        return zzb;
    }

    private final String zzd(int n3) {
        int n4 = this.zzd;
        return D70.b(n3, n4, "Index:", ", Size:");
    }

    private final void zze(int n3) {
        int n4;
        if (n3 >= 0 && n3 < (n4 = this.zzd)) {
            return;
        }
        String string2 = this.zzd(n3);
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    public final void add(int n3, Object object) {
        int n4;
        this.zza();
        if (n3 >= 0 && n3 <= (n4 = this.zzd)) {
            Object[] objectArray = this.zzc;
            int n7 = objectArray.length;
            if (n4 < n7) {
                n7 = n3 + 1;
                System.arraycopy(objectArray, n3, objectArray, n7, n4 -= n3);
            } else {
                n4 = zzmd.zzc(objectArray.length);
                Object[] objectArray2 = new Object[n4];
                System.arraycopy(this.zzc, 0, objectArray2, 0, n3);
                objectArray = this.zzc;
                n7 = n3 + 1;
                int n8 = this.zzd - n3;
                System.arraycopy(objectArray, n3, objectArray2, n7, n8);
                this.zzc = objectArray2;
            }
            this.zzc[n3] = object;
            this.zzd = n3 = this.zzd + 1;
            this.modCount = n3 = this.modCount + 1;
            return;
        }
        String string2 = this.zzd(n3);
        object = new IndexOutOfBoundsException(string2);
        throw object;
    }

    public final boolean add(Object object) {
        Object[] objectArray;
        this.zza();
        int n3 = this.zzd;
        Object[] objectArray2 = this.zzc;
        int n4 = objectArray2.length;
        if (n3 == n4) {
            n3 = zzmd.zzc(objectArray2.length);
            objectArray2 = this.zzc;
            this.zzc = objectArray = Arrays.copyOf(objectArray2, n3);
        }
        objectArray = this.zzc;
        int n7 = this.zzd;
        this.zzd = n4 = n7 + 1;
        objectArray[n7] = object;
        int n8 = this.modCount;
        n3 = 1;
        this.modCount = n8 += n3;
        return n3 != 0;
    }

    public final Object get(int n3) {
        this.zze(n3);
        return this.zzc[n3];
    }

    public final Object remove(int n3) {
        this.zza();
        this.zze(n3);
        Object[] objectArray = this.zzc;
        Object object = objectArray[n3];
        int n4 = this.zzd;
        int n7 = n4 + -1;
        if (n3 < n7) {
            n7 = n3 + 1;
            n4 = n4 - n3 + -1;
            System.arraycopy(objectArray, n7, objectArray, n3, n4);
        }
        this.zzd = n3 = this.zzd + -1;
        this.modCount = n3 = this.modCount + 1;
        return object;
    }

    public final Object set(int n3, Object object) {
        this.zza();
        this.zze(n3);
        Object[] objectArray = this.zzc;
        Object object2 = objectArray[n3];
        objectArray[n3] = object;
        this.modCount = n3 = this.modCount + 1;
        return object2;
    }

    public final int size() {
        return this.zzd;
    }

    public final /* synthetic */ zzkm zza(int n3) {
        int n4 = this.zzd;
        if (n3 >= n4) {
            Object object;
            Object[] objectArray;
            if (n3 == 0) {
                objectArray = zza;
            } else {
                object = this.zzc;
                objectArray = Arrays.copyOf(object, n3);
            }
            int n7 = this.zzd;
            object = new zzmd(objectArray, n7, true);
            return object;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public final void zzb(int n3) {
        Object[] objectArray = this.zzc;
        int n4 = objectArray.length;
        if (n3 <= n4) {
            return;
        }
        n4 = objectArray.length;
        if (n4 == 0) {
            Object[] objectArray2 = new Object[Math.max(n3, 10)];
            this.zzc = objectArray2;
            return;
        }
        int n7 = objectArray.length;
        while (n7 < n3) {
            n7 = zzmd.zzc(n7);
        }
        Object[] objectArray3 = Arrays.copyOf(this.zzc, n7);
        this.zzc = objectArray3;
    }
}

