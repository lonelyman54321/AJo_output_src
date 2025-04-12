/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zzri;
import com.google.android.gms.tagmanager.zzdj;
import com.google.android.gms.tagmanager.zzem;
import com.google.android.gms.tagmanager.zzep;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class zzek
implements zzem {
    final /* synthetic */ Map zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ Map zzc;
    final /* synthetic */ Map zzd;

    public zzek(zzep zzep2, Map map2, Map map3, Map map4, Map map5) {
        this.zza = map2;
        this.zzb = map3;
        this.zzc = map4;
        this.zzd = map5;
    }

    public final void zza(zzri object, Set collection, Set set, zzdj object2) {
        object2 = (List)this.zza.get(object);
        List cfr_ignored_0 = (List)this.zzb.get(object);
        if (object2 != null) {
            collection.addAll(object2);
        }
        collection = (List)this.zzc.get(object);
        object2 = this.zzd;
        object = (List)object2.get(object);
        if (collection != null) {
            set.addAll(collection);
        }
    }
}

