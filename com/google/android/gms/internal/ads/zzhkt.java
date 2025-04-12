/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhkl;
import com.google.android.gms.internal.ads.zzhkm;
import com.google.android.gms.internal.ads.zzhkq;
import com.google.android.gms.internal.ads.zzhkr;
import com.google.android.gms.internal.ads.zzhks;
import com.google.android.gms.internal.ads.zzhky;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class zzhkt
extends zzhkl {
    private static final zzhky zza = zzhkq.zza(Collections.emptyMap());

    public /* synthetic */ zzhkt(Map map2, zzhkr zzhkr2) {
        super(map2);
    }

    public static zzhks zzc(int n3) {
        zzhks zzhks2 = new zzhks(n3, null);
        return zzhks2;
    }

    public final Map zzd() {
        boolean bl2;
        int n3 = this.zza().size();
        LinkedHashMap linkedHashMap = zzhkm.zzb(n3);
        Iterator iterator = this.zza().entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = iterator.next();
            Object k2 = object.getKey();
            object = ((zzhky)object.getValue()).zzb();
            linkedHashMap.put(k2, object);
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }
}

