/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzavn;
import java.util.HashMap;

public final class zzaxk
extends zzavn {
    public long zza;
    public long zzb;

    public zzaxk() {
        long l2;
        this.zza = l2 = (long)-1;
        this.zzb = l2;
    }

    public zzaxk(String object) {
        long l2;
        this.zza = l2 = (long)-1;
        this.zzb = l2;
        object = zzavn.zza((String)object);
        if (object != null) {
            Integer n3 = 0;
            this.zza = l2 = ((Long)((HashMap)object).get(n3)).longValue();
            int n4 = 1;
            n3 = n4;
            object = (Long)((HashMap)object).get(n3);
            this.zzb = l2 = ((Long)object).longValue();
        }
    }

    public final HashMap zzb() {
        HashMap<Integer, Long> hashMap = new HashMap<Integer, Long>();
        Integer n3 = 0;
        Long l2 = this.zza;
        hashMap.put(n3, l2);
        n3 = 1;
        l2 = this.zzb;
        hashMap.put(n3, l2);
        return hashMap;
    }
}

