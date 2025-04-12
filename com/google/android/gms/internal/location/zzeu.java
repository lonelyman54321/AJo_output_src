/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.internal.location.zzex;
import com.google.android.gms.internal.location.zzez;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;

public abstract class zzeu
extends AbstractCollection
implements Serializable {
    private static final Object[] zza = new Object[0];

    public final boolean add(Object object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final boolean addAll(Collection object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final void clear() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final boolean remove(Object object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final boolean removeAll(Collection object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final boolean retainAll(Collection object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final Spliterator spliterator() {
        return nk3_1.a(this);
    }

    public final Object[] toArray() {
        Object[] objectArray = zza;
        return this.toArray(objectArray);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object[] toArray(Object[] object) {
        void var1_6;
        object.getClass();
        int n3 = this.size();
        int n4 = ((Object)object).length;
        if (n4 < n3) {
            void var1_3;
            Object[] objectArray = this.zzb();
            if (objectArray != null) {
                n3 = this.zzc();
                n4 = this.zzd();
                Class<?> clazz = object.getClass();
                return Arrays.copyOfRange(objectArray, n3, n4, clazz);
            }
            if (n4 != 0) {
                T[] TArray = Arrays.copyOf(object, 0);
            }
            T[] TArray = Arrays.copyOf(var1_3, n3);
        } else if (n4 > n3) {
            n4 = 0;
            object[n3] = null;
        }
        this.zzg((Object[])var1_6, 0);
        return var1_6;
    }

    public abstract zzez zza();

    public Object[] zzb() {
        throw null;
    }

    public int zzc() {
        throw null;
    }

    public int zzd() {
        throw null;
    }

    public zzex zze() {
        throw null;
    }

    public abstract boolean zzf();

    public int zzg(Object[] objectArray, int n3) {
        throw null;
    }
}

