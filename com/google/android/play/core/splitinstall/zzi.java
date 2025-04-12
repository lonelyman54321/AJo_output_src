/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall;

import com.google.android.play.core.splitinstall.zzk;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzi {
    private final Map zza;

    public zzi() {
        HashMap hashMap;
        this.zza = hashMap = new HashMap();
    }

    public final zzi zza(String string2, String string3, String string4) {
        Map map2 = this.zza;
        boolean bl2 = map2.containsKey(string3);
        if (!bl2) {
            map2 = this.zza;
            HashMap hashMap = new HashMap();
            map2.put(string3, hashMap);
        }
        ((Map)this.zza.get(string3)).put(string2, string4);
        return this;
    }

    public final zzk zzb() {
        boolean bl2;
        Map map2 = new Map();
        Object object = this.zza.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Map map3 = object.next();
            String string2 = (String)map3.getKey();
            map3 = (Map)map3.getValue();
            HashMap hashMap = new HashMap(map3);
            map3 = Collections.unmodifiableMap(hashMap);
            ((HashMap)map2).put(string2, map3);
        }
        map2 = Collections.unmodifiableMap(map2);
        object = new zzk(map2, null);
        return object;
    }
}

