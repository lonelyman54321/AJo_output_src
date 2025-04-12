/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzkj;
import com.google.android.gms.internal.measurement.zzla;
import com.google.android.gms.internal.measurement.zzme;
import com.google.android.gms.internal.measurement.zzmh;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class zzma {
    private static final zzma zza;
    private final zzmh zzb;
    private final ConcurrentMap zzc;

    static {
        zzma zzma2;
        zza = zzma2 = new zzma();
    }

    private zzma() {
        Object object = new ConcurrentHashMap();
        this.zzc = object;
        this.zzb = object = new zzla();
    }

    public static zzma zza() {
        return zza;
    }

    public final zzme zza(Class object) {
        Object object2 = "messageType";
        zzkj.zza(object, (String)object2);
        Object object3 = (zzme)this.zzc.get(object);
        if (object3 == null) {
            object3 = this.zzb.zza((Class)object);
            zzkj.zza(object, (String)object2);
            zzkj.zza(object3, "schema");
            object2 = this.zzc;
            object = object2.putIfAbsent(object, object3);
            if (object != null) {
                object3 = object;
            }
        }
        return object3;
    }

    public final zzme zza(Object clazz) {
        clazz = clazz.getClass();
        return this.zza(clazz);
    }
}

