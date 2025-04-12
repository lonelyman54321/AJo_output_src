/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfzk;
import com.google.android.gms.internal.ads.zzfzv;
import com.google.android.gms.internal.ads.zzgbm;
import com.google.android.gms.internal.ads.zzgbw;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class zzfzl
extends zzgbw {
    final /* synthetic */ zzfzv zza;

    public zzfzl(zzfzv zzfzv2, Map map2) {
        this.zza = zzfzv2;
        super(map2);
    }

    public final void clear() {
        zzgbm.zzb(this.iterator());
    }

    public final boolean containsAll(Collection collection) {
        return this.zzd.keySet().containsAll(collection);
    }

    public final boolean equals(Object object) {
        Set set;
        boolean bl2;
        return this == object || (bl2 = ((Object)(set = this.zzd.keySet())).equals(object));
        {
        }
    }

    public final int hashCode() {
        return ((Object)this.zzd.keySet()).hashCode();
    }

    public final Iterator iterator() {
        Iterator iterator = this.zzd.entrySet().iterator();
        zzfzk zzfzk2 = new zzfzk(this, iterator);
        return zzfzk2;
    }

    public final boolean remove(Object object) {
        Map map2 = this.zzd;
        if ((object = (Collection)map2.remove(object)) != null) {
            int n3 = object.size();
            object.clear();
            object = this.zza;
            int n4 = zzfzv.zzd((zzfzv)object) - n3;
            zzfzv.zzn((zzfzv)object, n4);
            if (n3 > 0) {
                return true;
            }
        }
        return false;
    }
}

