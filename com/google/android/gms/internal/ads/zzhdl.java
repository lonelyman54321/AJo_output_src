/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhdk;
import java.lang.reflect.Constructor;

final class zzhdl {
    private static final zzhdk zza;
    private static final zzhdk zzb;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object = null;
        Object object2 = "com.google.protobuf.NewInstanceSchemaFull";
        try {
            object2 = Class.forName((String)object2);
            object2 = ((Class)object2).getDeclaredConstructor(null);
            object2 = ((Constructor)object2).newInstance(null);
            object = object2 = (zzhdk)object2;
        }
        catch (Exception exception) {}
        zza = object;
        object = new zzhdk();
        zzb = object;
    }

    public static zzhdk zza() {
        return zza;
    }

    public static zzhdk zzb() {
        return zzb;
    }
}

