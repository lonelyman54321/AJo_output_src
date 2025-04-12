/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzbt;
import java.util.Arrays;
import java.util.RandomAccess;

final class zzen
extends zzbt
implements RandomAccess {
    private static final zzen zza;
    private Object[] zzb;
    private int zzc;

    static {
        zzen zzen2;
        Object[] objectArray = new Object[]{};
        zza = zzen2 = new zzen(objectArray, 0);
        zzen2.zzb();
    }

    public zzen() {
        Object[] objectArray = new Object[10];
        this(objectArray, 0);
    }

    private zzen(Object[] objectArray, int n3) {
        this.zzb = objectArray;
        this.zzc = n3;
    }

    public static zzen zzd() {
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

    public final void add(int n3, Object object) {
        int n4;
        this.zzc();
        if (n3 >= 0 && n3 <= (n4 = this.zzc)) {
            Object[] objectArray = this.zzb;
            int n7 = objectArray.length;
            int n8 = 1;
            if (n4 < n7) {
                n7 = n3 + 1;
                System.arraycopy(objectArray, n3, objectArray, n7, n4 -= n3);
            } else {
                n4 = zy_2.a(n4, 3, 2, n8);
                Object[] objectArray2 = new Object[n4];
                System.arraycopy(objectArray, 0, objectArray2, 0, n3);
                objectArray = this.zzb;
                n7 = n3 + 1;
                int n10 = this.zzc - n3;
                System.arraycopy(objectArray, n3, objectArray2, n7, n10);
                this.zzb = objectArray2;
            }
            this.zzb[n3] = object;
            this.zzc = n3 = this.zzc + n8;
            this.modCount = n3 = this.modCount + n8;
            return;
        }
        String string2 = this.zzg(n3);
        object = new IndexOutOfBoundsException(string2);
        throw object;
    }

    public final boolean add(Object object) {
        int n3;
        Object[] objectArray;
        this.zzc();
        int n4 = this.zzc;
        Object[] objectArray2 = this.zzb;
        int n7 = objectArray2.length;
        int n8 = 1;
        if (n4 == n7) {
            n4 = n4 * 3 / 2 + n8;
            this.zzb = objectArray = Arrays.copyOf(objectArray2, n4);
        }
        objectArray = this.zzb;
        int n10 = this.zzc;
        this.zzc = n7 = n10 + 1;
        objectArray[n10] = object;
        this.modCount = n3 = this.modCount + n8;
        return n8 != 0;
    }

    public final Object get(int n3) {
        this.zzf(n3);
        return this.zzb[n3];
    }

    public final Object remove(int n3) {
        this.zzc();
        this.zzf(n3);
        Object[] objectArray = this.zzb;
        Object object = objectArray[n3];
        int n4 = this.zzc;
        int n7 = n4 + -1;
        if (n3 < n7) {
            n7 = n3 + 1;
            n4 = n4 - n3 + -1;
            System.arraycopy(objectArray, n7, objectArray, n3, n4);
        }
        this.zzc = n3 = this.zzc + -1;
        this.modCount = n3 = this.modCount + 1;
        return object;
    }

    public final Object set(int n3, Object object) {
        this.zzc();
        this.zzf(n3);
        Object[] objectArray = this.zzb;
        Object object2 = objectArray[n3];
        objectArray[n3] = object;
        this.modCount = n3 = this.modCount + 1;
        return object2;
    }

    public final int size() {
        return this.zzc;
    }
}

