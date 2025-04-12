/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfyg;
import com.google.android.gms.internal.ads.zzfyh;
import com.google.android.gms.internal.ads.zzgab;
import com.google.android.gms.internal.ads.zzgbi;
import com.google.android.gms.internal.ads.zzgbj;
import com.google.android.gms.internal.ads.zzgbm;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class zzgaa
extends AbstractCollection {
    final Collection zza;
    final zzfyh zzb;

    public zzgaa(Collection collection, zzfyh zzfyh2) {
        this.zza = collection;
        this.zzb = zzfyh2;
    }

    public final boolean add(Object object) {
        zzfyg.zze(this.zzb.zza(object));
        return this.zza.add(object);
    }

    public final boolean addAll(Collection collection) {
        boolean bl2;
        Iterator iterator = collection.iterator();
        while (bl2 = iterator.hasNext()) {
            Object e2 = iterator.next();
            zzfyh zzfyh2 = this.zzb;
            bl2 = zzfyh2.zza(e2);
            zzfyg.zze(bl2);
        }
        return this.zza.addAll(collection);
    }

    public final void clear() {
        Collection collection = this.zza;
        zzfyh zzfyh2 = this.zzb;
        zzgbi.zzb(collection, zzfyh2);
    }

    public final boolean contains(Object object) {
        Collection collection = this.zza;
        boolean bl2 = zzgab.zza(collection, object);
        if (bl2) {
            return this.zzb.zza(object);
        }
        return false;
    }

    public final boolean containsAll(Collection object) {
        boolean bl2;
        block1: {
            boolean bl3;
            object = object.iterator();
            while (bl3 = object.hasNext()) {
                Object e2 = object.next();
                bl3 = this.contains(e2);
                if (bl3) continue;
                bl2 = false;
                object = null;
                break block1;
            }
            bl2 = true;
        }
        return bl2;
    }

    public final boolean isEmpty() {
        boolean bl2;
        zzfyh zzfyh2 = this.zzb;
        Iterator iterator = this.zza.iterator();
        zzfyg.zzc(zzfyh2, "predicate");
        int n3 = 0;
        while (bl2 = iterator.hasNext()) {
            Object t3 = iterator.next();
            bl2 = zzfyh2.zza(t3);
            if (bl2) {
                int n4 = -1;
                if (n3 == n4) break;
                return false;
            }
            ++n3;
        }
        return true;
    }

    public final Iterator iterator() {
        Iterator iterator = this.zza.iterator();
        iterator.getClass();
        zzfyh zzfyh2 = this.zzb;
        zzfyh2.getClass();
        zzgbj zzgbj2 = new zzgbj(iterator, zzfyh2);
        return zzgbj2;
    }

    public final boolean remove(Object object) {
        Collection collection;
        boolean bl2;
        boolean bl3 = this.contains(object);
        return bl3 && (bl2 = (collection = this.zza).remove(object));
    }

    public final boolean removeAll(Collection collection) {
        boolean bl2;
        Iterator iterator = this.zza.iterator();
        boolean bl3 = false;
        while (bl2 = iterator.hasNext()) {
            zzfyh zzfyh2 = this.zzb;
            Object e2 = iterator.next();
            boolean bl4 = zzfyh2.zza(e2);
            if (!bl4 || !(bl2 = collection.contains(e2))) continue;
            iterator.remove();
            bl3 = true;
        }
        return bl3;
    }

    public final boolean retainAll(Collection collection) {
        boolean bl2;
        Iterator iterator = this.zza.iterator();
        boolean bl3 = false;
        while (bl2 = iterator.hasNext()) {
            zzfyh zzfyh2 = this.zzb;
            Object e2 = iterator.next();
            boolean bl4 = zzfyh2.zza(e2);
            if (!bl4 || (bl2 = collection.contains(e2))) continue;
            iterator.remove();
            bl3 = true;
        }
        return bl3;
    }

    public final int size() {
        boolean bl2;
        Iterator iterator = this.zza.iterator();
        int n3 = 0;
        while (bl2 = iterator.hasNext()) {
            zzfyh zzfyh2 = this.zzb;
            Object e2 = iterator.next();
            bl2 = zzfyh2.zza(e2);
            if (!bl2) continue;
            ++n3;
        }
        return n3;
    }

    public final Object[] toArray() {
        Iterator iterator = this.iterator();
        ArrayList arrayList = new ArrayList();
        zzgbm.zzc(arrayList, iterator);
        return arrayList.toArray();
    }

    public final Object[] toArray(Object[] objectArray) {
        Iterator iterator = this.iterator();
        ArrayList arrayList = new ArrayList();
        zzgbm.zzc(arrayList, iterator);
        return arrayList.toArray(objectArray);
    }
}

