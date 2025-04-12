/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.zzj;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class zzax
extends zzj {
    private final Map zza;

    public zzax() {
        HashMap hashMap;
        this.zza = hashMap = new HashMap(4);
    }

    public final String toString() {
        boolean bl2;
        HashMap hashMap = new HashMap();
        Iterator iterator = this.zza.entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            String string2 = String.valueOf(entry.getKey());
            entry = entry.getValue();
            String string3 = "metric";
            string2 = string3.concat(string2);
            hashMap.put(string2, entry);
        }
        return zzj.zza(hashMap);
    }

    public final Map zzd() {
        return Collections.unmodifiableMap(this.zza);
    }
}

