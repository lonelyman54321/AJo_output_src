/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzcp {
    static final zzcp zza;
    private static volatile boolean zzb = false;
    private static volatile zzcp zzc;
    private final Map zzd;

    static {
        zzcp zzcp2;
        zza = zzcp2 = new zzcp(true);
    }

    public zzcp() {
        HashMap hashMap;
        this.zzd = hashMap = new HashMap();
    }

    public zzcp(boolean bl2) {
        Map map2;
        this.zzd = map2 = Collections.emptyMap();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzcp zza() {
        zzcp zzcp2 = zzc;
        if (zzcp2 != null) return zzcp2;
        Class<zzcp> clazz = zzcp.class;
        synchronized (clazz) {
            try {
                zzcp2 = zzc;
                if (zzcp2 != null) return zzcp2;
                zzc = zzcp2 = zza;
                return zzcp2;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

