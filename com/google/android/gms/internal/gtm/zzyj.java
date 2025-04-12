/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacn;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class zzyj
extends AbstractList
implements zzacn {
    private boolean zza;

    public zzyj(boolean bl2) {
        this.zza = bl2;
    }

    public void add(int n3, Object object) {
        this.zza();
        super.add(n3, object);
    }

    public boolean add(Object object) {
        this.zza();
        return super.add(object);
    }

    public final boolean addAll(int n3, Collection collection) {
        this.zza();
        return super.addAll(n3, collection);
    }

    public boolean addAll(Collection collection) {
        this.zza();
        return super.addAll(collection);
    }

    public final void clear() {
        this.zza();
        super.clear();
    }

    public boolean equals(Object object) {
        int n3;
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n4 = object instanceof List;
        if (n4 == 0) {
            return false;
        }
        n4 = object instanceof RandomAccess;
        if (n4 == 0) {
            return super.equals(object);
        }
        object = (List)object;
        n4 = this.size();
        if (n4 == (n3 = object.size())) {
            for (n3 = 0; n3 < n4; ++n3) {
                Object e2;
                Object e5 = this.get(n3);
                boolean bl3 = e5.equals(e2 = object.get(n3));
                if (bl3) continue;
                return false;
            }
            return bl2;
        }
        return false;
    }

    public int hashCode() {
        int n3 = this.size();
        int n4 = 1;
        for (int i3 = 0; i3 < n3; ++i3) {
            n4 *= 31;
            Object e2 = this.get(i3);
            int n7 = e2.hashCode();
            n4 += n7;
        }
        return n4;
    }

    public Object remove(int n3) {
        this.zza();
        return super.remove(n3);
    }

    public final boolean remove(Object object) {
        this.zza();
        int n3 = this.indexOf(object);
        int n4 = -1;
        if (n3 == n4) {
            return false;
        }
        this.remove(n3);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        this.zza();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        this.zza();
        return super.retainAll(collection);
    }

    public Object set(int n3, Object object) {
        this.zza();
        return super.set(n3, object);
    }

    public final void zza() {
        boolean bl2 = this.zza;
        if (bl2) {
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final void zzb() {
        boolean bl2 = this.zza;
        if (bl2) {
            bl2 = false;
            this.zza = false;
        }
    }

    public final boolean zzc() {
        return this.zza;
    }
}

