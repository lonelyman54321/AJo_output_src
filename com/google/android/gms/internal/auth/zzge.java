/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzez;
import com.google.android.gms.internal.auth.zzfo;
import com.google.android.gms.internal.auth.zzgh;
import com.google.android.gms.internal.auth.zzgi;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class zzge {
    private static final zzge zza;
    private final zzgi zzb;
    private final ConcurrentMap zzc;

    static {
        zzge zzge2;
        zza = zzge2 = new zzge();
    }

    private zzge() {
        Object object = new ConcurrentHashMap();
        this.zzc = object;
        this.zzb = object = new zzfo();
    }

    public static zzge zza() {
        return zza;
    }

    public final zzgh zzb(Class object) {
        Object object2 = "messageType";
        zzez.zzf(object, (String)object2);
        zzgh zzgh2 = (zzgh)this.zzc.get(object);
        if (zzgh2 == null) {
            zzgh2 = this.zzb.zza((Class)object);
            zzez.zzf(object, (String)object2);
            zzez.zzf(zzgh2, "schema");
            object2 = this.zzc;
            object = object2.putIfAbsent(object, zzgh2);
            if (object != null) {
                return object;
            }
        }
        return zzgh2;
    }
}

