/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzej;
import java.lang.reflect.Constructor;

final class zzek {
    private static final zzej zza;
    private static final zzej zzb;

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
            object = object2 = (zzej)object2;
        }
        catch (Exception exception) {}
        zza = object;
        object = new zzej();
        zzb = object;
    }

    public static zzej zza() {
        return zza;
    }

    public static zzej zzb() {
        return zzb;
    }
}

