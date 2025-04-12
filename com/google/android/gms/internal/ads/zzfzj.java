/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfzv;
import com.google.android.gms.internal.ads.zzgbk;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

class zzfzj
implements Iterator {
    final Iterator zza;
    Object zzb;
    Collection zzc;
    Iterator zzd;
    final /* synthetic */ zzfzv zze;

    public zzfzj(zzfzv object) {
        this.zze = object;
        this.zza = object = zzfzv.zzi((zzfzv)object).entrySet().iterator();
        this.zzb = null;
        this.zzc = null;
        this.zzd = object = zzgbk.zza;
    }

    public final boolean hasNext() {
        Iterator iterator = this.zza;
        boolean bl2 = iterator.hasNext();
        return bl2 || (bl2 = (iterator = this.zzd).hasNext());
        {
        }
    }

    public final Object next() {
        Iterator iterator = this.zzd;
        boolean bl2 = iterator.hasNext();
        if (!bl2) {
            iterator = (Map.Entry)this.zza.next();
            Object k2 = iterator.getKey();
            this.zzb = k2;
            iterator = (Collection)iterator.getValue();
            this.zzc = iterator;
            this.zzd = iterator = iterator.iterator();
        }
        return this.zzd.next();
    }

    public final void remove() {
        this.zzd.remove();
        Object object = this.zzc;
        Objects.requireNonNull(object);
        boolean bl2 = object.isEmpty();
        if (bl2) {
            object = this.zza;
            object.remove();
        }
        object = this.zze;
        int n3 = zzfzv.zzd((zzfzv)object) + -1;
        zzfzv.zzn((zzfzv)object, n3);
    }
}

