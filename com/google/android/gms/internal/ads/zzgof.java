/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgoe;
import com.google.android.gms.internal.ads.zzgoh;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzgof {
    final Map zza;
    final Map zzb;

    private zzgof() {
        HashMap hashMap;
        this.zza = hashMap = new HashMap();
        this.zzb = hashMap = new HashMap();
    }

    public /* synthetic */ zzgof(zzgoe hashMap) {
        this.zza = hashMap = new HashMap();
        this.zzb = hashMap = new HashMap();
    }

    public final zzgof zza(Enum enum_, Object object) {
        this.zza.put(enum_, object);
        this.zzb.put(object, enum_);
        return this;
    }

    public final zzgoh zzb() {
        Map map2 = Collections.unmodifiableMap(this.zza);
        Map map3 = Collections.unmodifiableMap(this.zzb);
        zzgoh zzgoh2 = new zzgoh(map2, map3, null);
        return zzgoh2;
    }
}

