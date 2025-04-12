/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfyg;
import com.google.android.gms.internal.ads.zzfzl;
import com.google.android.gms.internal.ads.zzfzv;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class zzfzk
implements Iterator {
    Map.Entry zza;
    final /* synthetic */ Iterator zzb;
    final /* synthetic */ zzfzl zzc;

    public zzfzk(zzfzl zzfzl2, Iterator iterator) {
        this.zzb = iterator;
        this.zzc = zzfzl2;
    }

    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    public final Object next() {
        Map.Entry entry;
        this.zza = entry = (Map.Entry)this.zzb.next();
        return entry.getKey();
    }

    public final void remove() {
        boolean bl2;
        Object object = this.zza;
        if (object != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        zzfyg.zzk(bl2, "no calls to next() since the last call to remove()");
        object = (Collection)this.zza.getValue();
        this.zzb.remove();
        zzfzv zzfzv2 = this.zzc.zza;
        int n3 = zzfzv.zzd(zzfzv2);
        int n4 = object.size();
        zzfzv.zzn(zzfzv2, n3 -= n4);
        object.clear();
        this.zza = null;
    }
}

