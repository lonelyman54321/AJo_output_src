/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhcz;
import java.lang.reflect.Constructor;

final class zzhda {
    private static final zzhcz zza;
    private static final zzhcz zzb;

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
            object = object2 = (zzhcz)object2;
        }
        catch (Exception exception) {}
        zza = object;
        object = new zzhcz();
        zzb = object;
    }

    public static zzhcz zza() {
        return zza;
    }

    public static zzhcz zzb() {
        return zzb;
    }
}

