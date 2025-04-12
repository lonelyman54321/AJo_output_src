/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfzg;
import com.google.android.gms.internal.ads.zzfzh;
import com.google.android.gms.internal.ads.zzfzv;
import com.google.android.gms.internal.ads.zzgay;
import com.google.android.gms.internal.ads.zzgbm;
import com.google.android.gms.internal.ads.zzgby;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class zzfzi
extends zzgby {
    final transient Map zza;
    final /* synthetic */ zzfzv zzb;

    public zzfzi(zzfzv zzfzv2, Map map2) {
        this.zzb = zzfzv2;
        this.zza = map2;
    }

    public final void clear() {
        Map map2 = this.zza;
        Object object = this.zzb;
        Map map3 = zzfzv.zzi((zzfzv)object);
        if (map2 == map3) {
            ((zzfzv)object).zzp();
            return;
        }
        object = new zzfzh(this);
        zzgbm.zzb((Iterator)object);
    }

    public final boolean containsKey(Object object) {
        boolean bl2;
        Map map2 = this.zza;
        map2.getClass();
        try {
            bl2 = map2.containsKey(object);
        }
        catch (ClassCastException | NullPointerException runtimeException) {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final boolean equals(Object object) {
        Map map2;
        boolean bl2;
        return this == object || (bl2 = ((Object)(map2 = this.zza)).equals(object));
        {
        }
    }

    public final int hashCode() {
        return ((Object)this.zza).hashCode();
    }

    public Set keySet() {
        return this.zzb.zzt();
    }

    public final int size() {
        return this.zza.size();
    }

    public final String toString() {
        return this.zza.toString();
    }

    public final Map.Entry zza(Map.Entry object) {
        Object k2 = object.getKey();
        object = (Collection)object.getValue();
        object = this.zzb.zzc(k2, (Collection)object);
        zzgay zzgay2 = new zzgay(k2, object);
        return zzgay2;
    }

    public final Set zzb() {
        zzfzg zzfzg2 = new zzfzg(this);
        return zzfzg2;
    }
}

