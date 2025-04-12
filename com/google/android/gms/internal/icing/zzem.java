/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzdh;
import com.google.android.gms.internal.icing.zzdw;
import com.google.android.gms.internal.icing.zzep;
import com.google.android.gms.internal.icing.zzeq;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class zzem {
    private static final zzem zza;
    private final zzeq zzb;
    private final ConcurrentMap zzc;

    static {
        zzem zzem2;
        zza = zzem2 = new zzem();
    }

    private zzem() {
        Object object = new ConcurrentHashMap();
        this.zzc = object;
        this.zzb = object = new zzdw();
    }

    public static zzem zza() {
        return zza;
    }

    public final zzep zzb(Class object) {
        Object object2 = "messageType";
        zzdh.zzb(object, (String)object2);
        zzep zzep2 = (zzep)this.zzc.get(object);
        if (zzep2 == null) {
            zzep2 = this.zzb.zza((Class)object);
            zzdh.zzb(object, (String)object2);
            zzdh.zzb(zzep2, "schema");
            object2 = this.zzc;
            object = object2.putIfAbsent(object, zzep2);
            if (object != null) {
                return object;
            }
        }
        return zzep2;
    }
}

