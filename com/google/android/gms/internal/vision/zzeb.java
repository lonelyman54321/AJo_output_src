/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzde;
import com.google.android.gms.internal.vision.zzee;
import com.google.android.gms.internal.vision.zzfa;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public abstract class zzeb
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

    public abstract boolean contains(Object var1);

    public /* synthetic */ Iterator iterator() {
        return this.zza();
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

    public final Object[] toArray() {
        Object[] objectArray = zza;
        return this.toArray(objectArray);
    }

    public final Object[] toArray(Object[] object) {
        zzde.zza(object);
        int n3 = this.size();
        int n4 = ((Object[])object).length;
        if (n4 < n3) {
            Object[] objectArray = this.zzb();
            if (objectArray != null) {
                n3 = this.zzc();
                int n7 = this.zzd();
                object = object.getClass();
                return Arrays.copyOfRange(objectArray, n3, n7, (Class<? extends T[]>)object);
            }
            object = (Object[])Array.newInstance(object.getClass().getComponentType(), n3);
        } else {
            n4 = ((Object[])object).length;
            if (n4 > n3) {
                n4 = 0;
                Object var4_5 = null;
                object[n3] = null;
            }
        }
        this.zza((Object[])object, 0);
        return object;
    }

    public int zza(Object[] objectArray, int n3) {
        boolean bl2;
        zzfa zzfa2 = (zzfa)this.iterator();
        while (bl2 = zzfa2.hasNext()) {
            Object e2 = zzfa2.next();
            int n4 = n3 + 1;
            objectArray[n3] = e2;
            n3 = n4;
        }
        return n3;
    }

    public abstract zzfa zza();

    public Object[] zzb() {
        return null;
    }

    public int zzc() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public int zzd() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public zzee zze() {
        boolean bl2 = this.isEmpty();
        if (bl2) {
            return zzee.zzg();
        }
        return zzee.zza(this.toArray());
    }

    public abstract boolean zzf();
}

