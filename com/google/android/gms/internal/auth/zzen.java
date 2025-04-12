/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzel;
import com.google.android.gms.internal.auth.zzem;
import java.lang.reflect.Constructor;

final class zzen {
    private static final zzel zza;
    private static final zzel zzb;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object = new zzem();
        zza = object;
        object = null;
        Object object2 = "com.google.protobuf.ExtensionSchemaFull";
        try {
            object2 = Class.forName((String)object2);
            object2 = ((Class)object2).getDeclaredConstructor(null);
            object2 = ((Constructor)object2).newInstance(null);
            object = object2 = (zzel)object2;
        }
        catch (Exception exception) {}
        zzb = object;
    }

    public static zzel zza() {
        Object object = zzb;
        if (object != null) {
            return object;
        }
        object = new IllegalStateException("Protobuf runtime is not correctly loaded.");
        throw object;
    }

    public static zzel zzb() {
        return zza;
    }
}

