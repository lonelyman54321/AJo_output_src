/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzjf;
import com.google.android.gms.internal.vision.zzkb;
import com.google.android.gms.internal.vision.zzlc;
import com.google.android.gms.internal.vision.zzlf;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class zzky {
    private static final zzky zza;
    private final zzlf zzb;
    private final ConcurrentMap zzc;

    static {
        zzky zzky2;
        zza = zzky2 = new zzky();
    }

    private zzky() {
        Object object = new ConcurrentHashMap();
        this.zzc = object;
        this.zzb = object = new zzkb();
    }

    public static zzky zza() {
        return zza;
    }

    public final zzlc zza(Class object) {
        Object object2 = "messageType";
        zzjf.zza(object, (String)object2);
        Object object3 = (zzlc)this.zzc.get(object);
        if (object3 == null) {
            object3 = this.zzb.zza((Class)object);
            zzjf.zza(object, (String)object2);
            zzjf.zza(object3, "schema");
            object2 = this.zzc;
            object = object2.putIfAbsent(object, object3);
            if (object != null) {
                object3 = object;
            }
        }
        return object3;
    }

    public final zzlc zza(Object clazz) {
        clazz = clazz.getClass();
        return this.zza(clazz);
    }
}

