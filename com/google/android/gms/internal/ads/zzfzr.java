/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfzs;
import com.google.android.gms.internal.ads.zzfzv;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

class zzfzr
implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzfzs zzc;

    public zzfzr(zzfzs iterator) {
        this.zzc = iterator;
        iterator = ((zzfzs)((Object)iterator)).zzb;
        this.zzb = iterator;
        boolean bl2 = iterator instanceof List;
        iterator = bl2 ? ((List)((Object)iterator)).listIterator() : iterator.iterator();
        this.zza = iterator;
    }

    public zzfzr(zzfzs collection, Iterator iterator) {
        this.zzc = collection;
        collection = collection.zzb;
        this.zzb = collection;
        this.zza = iterator;
    }

    public final boolean hasNext() {
        this.zza();
        return this.zza.hasNext();
    }

    public final Object next() {
        this.zza();
        return this.zza.next();
    }

    public final void remove() {
        this.zza.remove();
        zzfzv zzfzv2 = this.zzc.zze;
        int n3 = zzfzv.zzd(zzfzv2) + -1;
        zzfzv.zzn(zzfzv2, n3);
        this.zzc.zzc();
    }

    public final void zza() {
        this.zzc.zzb();
        Object object = this.zzc.zzb;
        Collection collection = this.zzb;
        if (object == collection) {
            return;
        }
        object = new ConcurrentModificationException();
        throw object;
    }
}

