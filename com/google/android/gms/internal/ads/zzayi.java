/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzavn;
import java.util.HashMap;

public final class zzayi
extends zzavn {
    public Long zza;
    public Long zzb;
    public Long zzc;
    public Long zzd;
    public Long zze;

    public zzayi() {
    }

    public zzayi(String object) {
        object = zzavn.zza((String)object);
        if (object != null) {
            Number number = 0;
            number = (Long)((HashMap)object).get(number);
            this.zza = number;
            number = 1;
            number = (Long)((HashMap)object).get(number);
            this.zzb = number;
            number = 2;
            number = (Long)((HashMap)object).get(number);
            this.zzc = number;
            number = 3;
            number = (Long)((HashMap)object).get(number);
            this.zzd = number;
            int n3 = 4;
            number = n3;
            this.zze = object = (Long)((HashMap)object).get(number);
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
        n3 = 2;
        l2 = this.zzc;
        hashMap.put(n3, l2);
        n3 = 3;
        l2 = this.zzd;
        hashMap.put(n3, l2);
        n3 = 4;
        l2 = this.zze;
        hashMap.put(n3, l2);
        return hashMap;
    }
}

