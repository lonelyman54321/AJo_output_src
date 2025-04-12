/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzgb;
import java.lang.reflect.Constructor;

final class zzgc {
    private static final zzgb zza;
    private static final zzgb zzb;

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
            object = object2 = (zzgb)object2;
        }
        catch (Exception exception) {}
        zza = object;
        object = new zzgb();
        zzb = object;
    }

    public static zzgb zza() {
        return zza;
    }

    public static zzgb zzb() {
        return zzb;
    }
}

