/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzavn;
import java.lang.constant.Constable;
import java.util.HashMap;

public final class zzaxv
extends zzavn {
    public Long zza;
    public Boolean zzb;
    public Boolean zzc;

    public zzaxv() {
    }

    public zzaxv(String object) {
        object = zzavn.zza((String)object);
        if (object != null) {
            Constable constable = 0;
            constable = (Long)((HashMap)object).get(constable);
            this.zza = constable;
            constable = 1;
            constable = (Boolean)((HashMap)object).get(constable);
            this.zzb = constable;
            int n3 = 2;
            constable = n3;
            this.zzc = object = (Boolean)((HashMap)object).get(constable);
        }
    }

    public final HashMap zzb() {
        HashMap<Integer, Long> hashMap = new HashMap<Integer, Long>();
        Integer n3 = 0;
        Constable constable = this.zza;
        hashMap.put(n3, (Long)constable);
        n3 = 1;
        constable = this.zzb;
        hashMap.put(n3, (Long)constable);
        n3 = 2;
        constable = this.zzc;
        hashMap.put(n3, (Long)constable);
        return hashMap;
    }
}

