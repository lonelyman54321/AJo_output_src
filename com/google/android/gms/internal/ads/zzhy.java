/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzhy {
    private final Map zza;
    private Map zzb;

    public zzhy() {
        HashMap hashMap;
        this.zza = hashMap = new HashMap();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Map zza() {
        synchronized (this) {
            try {
                Map map2 = this.zzb;
                if (map2 != null) return this.zzb;
                map2 = this.zza;
                HashMap hashMap = new HashMap(map2);
                this.zzb = map2 = Collections.unmodifiableMap(hashMap);
                return this.zzb;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

