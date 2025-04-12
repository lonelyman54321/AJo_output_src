/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzdz;
import java.lang.reflect.Constructor;

final class zzea {
    private static final zzdz zza;
    private static final zzdz zzb;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object = null;
        Object object2 = "com.google.protobuf.MapFieldSchemaFull";
        try {
            object2 = Class.forName((String)object2);
            object2 = ((Class)object2).getDeclaredConstructor(null);
            object2 = ((Constructor)object2).newInstance(null);
            object = object2 = (zzdz)object2;
        }
        catch (Exception exception) {}
        zza = object;
        object = new zzdz();
        zzb = object;
    }

    public static zzdz zza() {
        return zza;
    }

    public static zzdz zzb() {
        return zzb;
    }
}

