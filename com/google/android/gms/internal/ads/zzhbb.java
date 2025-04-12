/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhaz;
import com.google.android.gms.internal.ads.zzhba;
import java.lang.reflect.Constructor;

final class zzhbb {
    private static final zzhaz zza;
    private static final zzhaz zzb;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object = new zzhba();
        zza = object;
        object = null;
        Object object2 = "com.google.protobuf.ExtensionSchemaFull";
        try {
            object2 = Class.forName((String)object2);
            object2 = ((Class)object2).getDeclaredConstructor(null);
            object2 = ((Constructor)object2).newInstance(null);
            object = object2 = (zzhaz)object2;
        }
        catch (Exception exception) {}
        zzb = object;
    }

    public static zzhaz zza() {
        Object object = zzb;
        if (object != null) {
            return object;
        }
        object = new IllegalStateException("Protobuf runtime is not correctly loaded.");
        throw object;
    }

    public static zzhaz zzb() {
        return zza;
    }
}

