/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfzd;
import com.google.android.gms.internal.ads.zzgcy;
import java.util.Iterator;
import java.util.Set;

final class zzgcx
extends zzfzd {
    final Iterator zza;
    final /* synthetic */ zzgcy zzb;

    public zzgcx(zzgcy object) {
        this.zzb = object;
        this.zza = object = ((zzgcy)object).zza.iterator();
    }

    public final Object zza() {
        Iterator iterator;
        boolean bl2;
        while (bl2 = (iterator = this.zza).hasNext()) {
            iterator = this.zza;
            Set set = this.zzb.zzb;
            boolean bl3 = set.contains(iterator = iterator.next());
            if (!bl3) continue;
            return iterator;
        }
        this.zzb();
        return null;
    }
}

