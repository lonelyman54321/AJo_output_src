/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzcq;
import com.google.android.gms.internal.icing.zzcr;
import java.lang.reflect.Constructor;

final class zzcs {
    private static final zzcq zza;
    private static final zzcq zzb;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object = new zzcr();
        zza = object;
        object = null;
        Object object2 = "com.google.protobuf.ExtensionSchemaFull";
        try {
            object2 = Class.forName((String)object2);
            object2 = ((Class)object2).getDeclaredConstructor(null);
            object2 = ((Constructor)object2).newInstance(null);
            object = object2 = (zzcq)object2;
        }
        catch (Exception exception) {}
        zzb = object;
    }

    public static zzcq zza() {
        return zza;
    }

    public static zzcq zzb() {
        Object object = zzb;
        if (object != null) {
            return object;
        }
        object = new IllegalStateException("Protobuf runtime is not correctly loaded.");
        throw object;
    }
}

