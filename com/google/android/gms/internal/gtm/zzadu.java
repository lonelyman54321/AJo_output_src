/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzyj;
import java.util.Arrays;
import java.util.RandomAccess;

final class zzadu
extends zzyj
implements RandomAccess {
    private static final Object[] zza;
    private static final zzadu zzb;
    private Object[] zzc;
    private int zzd;

    static {
        zzadu zzadu2;
        Object[] objectArray = new Object[]{};
        zza = objectArray;
        zzb = zzadu2 = new zzadu(objectArray, 0, false);
    }

    public zzadu() {
        Object[] objectArray = zza;
        this(objectArray, 0, true);
    }

    private zzadu(Object[] objectArray, int n3, boolean bl2) {
        super(bl2);
        this.zzc = objectArray;
        this.zzd = n3;
    }

    public static zzadu zze() {
        return zzb;
    }

    private static int zzg(int n3) {
        return Math.max(n3 * 3 / 2 + 1, 10);
    }

    private final String zzh(int n3) {
        int n4 = this.zzd;
        return D70.b(n3, n4, "Index:", ", Size:");
    }

    private final void zzi(int n3) {
        int n4;
        if (n3 >= 0 && n3 < (n4 = this.zzd)) {
            return;
        }
        String string2 = this.zzh(n3);
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    public final void add(int n3, Object object) {
        int n4;
        this.zza();
        if (n3 >= 0 && n3 <= (n4 = this.zzd)) {
            int n7 = n3 + 1;
            Object[] objectArray = this.zzc;
            int n8 = objectArray.length;
            if (n4 < n8) {
                System.arraycopy(objectArray, n3, objectArray, n7, n4 -= n3);
            } else {
                n4 = zzadu.zzg(n8);
                Object[] objectArray2 = new Object[n4];
                System.arraycopy(this.zzc, 0, objectArray2, 0, n3);
                objectArray = this.zzc;
                n8 = this.zzd - n3;
                System.arraycopy(objectArray, n3, objectArray2, n7, n8);
                this.zzc = objectArray2;
            }
            this.zzc[n3] = object;
            this.zzd = n3 = this.zzd + 1;
            this.modCount = n3 = this.modCount + 1;
            return;
        }
        String string2 = this.zzh(n3);
        object = new IndexOutOfBoundsException(string2);
        throw object;
    }

    public final boolean add(Object object) {
        int n3;
        Object[] objectArray;
        this.zza();
        int n4 = this.zzd;
        Object[] objectArray2 = this.zzc;
        int n7 = objectArray2.length;
        if (n4 == n7) {
            n4 = zzadu.zzg(n7);
            objectArray2 = this.zzc;
            this.zzc = objectArray = Arrays.copyOf(objectArray2, n4);
        }
        objectArray = this.zzc;
        n7 = this.zzd;
        this.zzd = n3 = n7 + 1;
        objectArray[n7] = object;
        int n8 = this.modCount;
        n4 = 1;
        this.modCount = n8 += n4;
        return n4 != 0;
    }

    public final Object get(int n3) {
        this.zzi(n3);
        return this.zzc[n3];
    }

    public final Object remove(int n3) {
        this.zza();
        this.zzi(n3);
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
        this.zzi(n3);
        Object[] objectArray = this.zzc;
        Object object2 = objectArray[n3];
        objectArray[n3] = object;
        this.modCount = n3 = this.modCount + 1;
        return object2;
    }

    public final int size() {
        return this.zzd;
    }

    public final void zzf(int n3) {
        Object[] objectArray = this.zzc;
        int n4 = objectArray.length;
        if (n3 <= n4) {
            return;
        }
        if (n4 != 0) {
            while (n4 < n3) {
                n4 = zzadu.zzg(n4);
            }
            Object[] objectArray2 = Arrays.copyOf(this.zzc, n4);
            this.zzc = objectArray2;
            return;
        }
        Object[] objectArray3 = new Object[Math.max(n3, 10)];
        this.zzc = objectArray3;
    }
}

