/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgcx;
import com.google.android.gms.internal.ads.zzgdd;
import com.google.android.gms.internal.ads.zzgdi;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

final class zzgcy
extends zzgdd {
    final /* synthetic */ Set zza;
    final /* synthetic */ Set zzb;

    public zzgcy(Set set, Set set2) {
        this.zza = set;
        this.zzb = set2;
        super(null);
    }

    public final boolean contains(Object object) {
        boolean bl2;
        Set set = this.zza;
        boolean bl3 = set.contains(object);
        return bl3 && (bl2 = (set = this.zzb).contains(object));
    }

    public final boolean containsAll(Collection collection) {
        boolean bl2;
        Set set = this.zza;
        boolean bl3 = set.containsAll(collection);
        return bl3 && (bl2 = (set = this.zzb).containsAll(collection));
    }

    public final boolean isEmpty() {
        Set set = this.zzb;
        Set set2 = this.zza;
        return Collections.disjoint(set, set2);
    }

    public final /* synthetic */ Iterator iterator() {
        zzgcx zzgcx2 = new zzgcx(this);
        return zzgcx2;
    }

    public final int size() {
        boolean bl2;
        Iterator iterator = this.zza.iterator();
        int n3 = 0;
        while (bl2 = iterator.hasNext()) {
            Set set = this.zzb;
            Object e2 = iterator.next();
            bl2 = set.contains(e2);
            if (!bl2) continue;
            ++n3;
        }
        return n3;
    }

    public final zzgdi zza() {
        zzgcx zzgcx2 = new zzgcx(this);
        return zzgcx2;
    }
}

