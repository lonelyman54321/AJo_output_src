/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzfr;
import java.lang.reflect.Constructor;

final class zzfs {
    private static final zzfr zza;
    private static final zzfr zzb;

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
            object = object2 = (zzfr)object2;
        }
        catch (Exception exception) {}
        zza = object;
        object = new zzfr();
        zzb = object;
    }

    public static zzfr zza() {
        return zza;
    }

    public static zzfr zzb() {
        return zzb;
    }
}

