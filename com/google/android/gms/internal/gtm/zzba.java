/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.zzj;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzba
extends zzj {
    private final List zza;
    private final List zzb;
    private final Map zzc;

    public zzba() {
        Cloneable cloneable;
        this.zza = cloneable = new Cloneable();
        this.zzb = cloneable = new Cloneable();
        this.zzc = cloneable;
    }

    public final String toString() {
        String string2;
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        Object object = this.zza;
        boolean bl2 = object.isEmpty();
        if (!bl2) {
            object = this.zza;
            string2 = "products";
            hashMap.put(string2, object);
        }
        if (!(bl2 = (object = this.zzb).isEmpty())) {
            object = this.zzb;
            string2 = "promotions";
            hashMap.put(string2, object);
        }
        if (!(bl2 = (object = this.zzc).isEmpty())) {
            object = this.zzc;
            string2 = "impressions";
            hashMap.put(string2, object);
        }
        hashMap.put("productAction", null);
        return zzj.zza(hashMap);
    }

    public final List zzd() {
        return Collections.unmodifiableList(this.zza);
    }

    public final List zze() {
        return Collections.unmodifiableList(this.zzb);
    }

    public final Map zzf() {
        return this.zzc;
    }
}

