/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfzr;
import com.google.android.gms.internal.ads.zzfzv;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

class zzfzs
extends AbstractCollection {
    final Object zza;
    Collection zzb;
    final zzfzs zzc;
    final Collection zzd;
    final /* synthetic */ zzfzv zze;

    public zzfzs(zzfzv object, Object object2, Collection collection, zzfzs zzfzs2) {
        this.zze = object;
        this.zza = object2;
        this.zzb = collection;
        this.zzc = zzfzs2;
        object = zzfzs2 == null ? null : zzfzs2.zzb;
        this.zzd = object;
    }

    public final boolean add(Object object) {
        this.zzb();
        Collection collection = this.zzb;
        boolean bl2 = collection.isEmpty();
        Object object2 = this.zzb;
        boolean bl3 = object2.add(object);
        if (bl3) {
            object2 = this.zze;
            int n3 = zzfzv.zzd((zzfzv)object2);
            int n4 = 1;
            zzfzv.zzn((zzfzv)object2, n3 += n4);
            if (bl2) {
                this.zza();
                return n4 != 0;
            }
        }
        return bl3;
    }

    public final boolean addAll(Collection collection) {
        int n3 = collection.isEmpty();
        if (n3 != 0) {
            return false;
        }
        n3 = this.size();
        Collection collection2 = this.zzb;
        boolean bl2 = collection2.addAll(collection);
        if (bl2) {
            collection2 = this.zzb;
            int n4 = collection2.size();
            zzfzv zzfzv2 = this.zze;
            int n7 = zzfzv.zzd(zzfzv2) + (n4 -= n3);
            zzfzv.zzn(zzfzv2, n7);
            if (n3 == 0) {
                this.zza();
                bl2 = true;
            }
        }
        return bl2;
    }

    public final void clear() {
        int n3 = this.size();
        if (n3 == 0) {
            return;
        }
        this.zzb.clear();
        zzfzv zzfzv2 = this.zze;
        int n4 = zzfzv.zzd(zzfzv2) - n3;
        zzfzv.zzn(zzfzv2, n4);
        this.zzc();
    }

    public final boolean contains(Object object) {
        this.zzb();
        return this.zzb.contains(object);
    }

    public final boolean containsAll(Collection collection) {
        this.zzb();
        return this.zzb.containsAll(collection);
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        this.zzb();
        return ((Object)this.zzb).equals(object);
    }

    public final int hashCode() {
        this.zzb();
        return ((Object)this.zzb).hashCode();
    }

    public final Iterator iterator() {
        this.zzb();
        zzfzr zzfzr2 = new zzfzr(this);
        return zzfzr2;
    }

    public final boolean remove(Object object) {
        this.zzb();
        Object object2 = this.zzb;
        boolean bl2 = object2.remove(object);
        if (bl2) {
            object2 = this.zze;
            int n3 = zzfzv.zzd((zzfzv)object2) + -1;
            zzfzv.zzn((zzfzv)object2, n3);
            this.zzc();
        }
        return bl2;
    }

    public final boolean removeAll(Collection collection) {
        int n3 = collection.isEmpty();
        if (n3 != 0) {
            return false;
        }
        n3 = this.size();
        Collection collection2 = this.zzb;
        boolean bl2 = collection2.removeAll(collection);
        if (bl2) {
            collection2 = this.zzb;
            int n4 = collection2.size();
            zzfzv zzfzv2 = this.zze;
            n4 -= n3;
            n3 = zzfzv.zzd(zzfzv2) + n4;
            zzfzv.zzn(zzfzv2, n3);
            this.zzc();
        }
        return bl2;
    }

    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int n3 = this.size();
        Collection collection2 = this.zzb;
        boolean bl2 = collection2.retainAll(collection);
        if (bl2) {
            collection2 = this.zzb;
            int n4 = collection2.size();
            zzfzv zzfzv2 = this.zze;
            n4 -= n3;
            n3 = zzfzv.zzd(zzfzv2) + n4;
            zzfzv.zzn(zzfzv2, n3);
            this.zzc();
        }
        return bl2;
    }

    public final int size() {
        this.zzb();
        return this.zzb.size();
    }

    public final String toString() {
        this.zzb();
        return this.zzb.toString();
    }

    public final void zza() {
        Object object = this.zzc;
        if (object != null) {
            ((zzfzs)object).zza();
            return;
        }
        object = this.zze;
        Object object2 = this.zza;
        object = zzfzv.zzi((zzfzv)object);
        Collection collection = this.zzb;
        object.put(object2, collection);
    }

    public final void zzb() {
        Object object = this.zzc;
        if (object != null) {
            ((zzfzs)object).zzb();
            object = this.zzc;
            Collection collection = this.zzd;
            object = ((zzfzs)object).zzb;
            if (object != collection) {
                object = new ConcurrentModificationException();
                throw object;
            }
        } else {
            object = this.zzb;
            boolean bl2 = object.isEmpty();
            if (bl2) {
                object = this.zze;
                Object object2 = this.zza;
                if ((object = (Collection)zzfzv.zzi((zzfzv)object).get(object2)) != null) {
                    this.zzb = object;
                }
            }
        }
    }

    public final void zzc() {
        Object object = this.zzc;
        if (object != null) {
            ((zzfzs)object).zzc();
            return;
        }
        object = this.zzb;
        boolean bl2 = object.isEmpty();
        if (bl2) {
            object = this.zze;
            Object object2 = this.zza;
            object = zzfzv.zzi((zzfzv)object);
            object.remove(object2);
        }
    }
}

