/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzdg;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class zzbt
extends AbstractList
implements zzdg {
    private boolean zza = true;

    public void add(int n3, Object object) {
        this.zzc();
        super.add(n3, object);
    }

    public boolean add(Object object) {
        this.zzc();
        return super.add(object);
    }

    public boolean addAll(int n3, Collection collection) {
        this.zzc();
        return super.addAll(n3, collection);
    }

    public boolean addAll(Collection collection) {
        this.zzc();
        return super.addAll(collection);
    }

    public void clear() {
        this.zzc();
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
        this.zzc();
        return super.remove(n3);
    }

    public final boolean remove(Object object) {
        this.zzc();
        int n3 = this.indexOf(object);
        int n4 = -1;
        if (n3 == n4) {
            return false;
        }
        this.remove(n3);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        this.zzc();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        this.zzc();
        return super.retainAll(collection);
    }

    public Object set(int n3, Object object) {
        this.zzc();
        return super.set(n3, object);
    }

    public final boolean zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zza = false;
    }

    public final void zzc() {
        boolean bl2 = this.zza;
        if (bl2) {
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }
}

