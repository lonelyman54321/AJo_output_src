/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgas;
import com.google.android.gms.internal.ads.zzgde;
import com.google.android.gms.internal.ads.zzhl;
import com.google.android.gms.internal.ads.zzhm;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class zzhn
extends zzgas {
    private final Map zza;

    public zzhn(Map map2) {
        this.zza = map2;
    }

    public final boolean containsKey(Object object) {
        boolean bl2;
        return object != null && (bl2 = super.containsKey(object));
    }

    public final boolean containsValue(Object object) {
        return this.zzd(object);
    }

    public final Set entrySet() {
        Set set = this.zza.entrySet();
        zzhl zzhl2 = new zzhl();
        return zzgde.zzc(set, zzhl2);
    }

    public final boolean equals(Object object) {
        boolean bl2;
        return object != null && (bl2 = this.zze(object));
    }

    public final /* synthetic */ Object get(Object object) {
        if (object == null) {
            return null;
        }
        return (List)this.zza.get(object);
    }

    public final int hashCode() {
        return this.zzc();
    }

    public final boolean isEmpty() {
        Map map2 = this.zza;
        int n3 = map2.isEmpty();
        int n4 = 1;
        if (n3 == 0) {
            n3 = super.size();
            if (n3 == n4) {
                map2 = null;
                n3 = (int)(super.containsKey(null) ? 1 : 0);
                if (n3 == 0) {
                    return false;
                }
            } else {
                n4 = 0;
            }
        }
        return n4 != 0;
    }

    public final Set keySet() {
        Set set = this.zza.keySet();
        zzhm zzhm2 = new zzhm();
        return zzgde.zzc(set, zzhm2);
    }

    public final int size() {
        int n3 = super.size();
        int n4 = super.containsKey(null);
        return n3 - n4;
    }

    public final /* synthetic */ Object zza() {
        return this.zza;
    }

    public final Map zzb() {
        return this.zza;
    }
}

