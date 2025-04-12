/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzip;
import com.google.android.gms.internal.vision.zziq;
import java.lang.reflect.Constructor;

final class zzir {
    private static final zziq zza;
    private static final zziq zzb;

    static {
        zzip zzip2 = new zzip();
        zza = zzip2;
        zzb = zzir.zzc();
    }

    public static zziq zza() {
        return zza;
    }

    public static zziq zzb() {
        Object object = zzb;
        if (object != null) {
            return object;
        }
        object = new IllegalStateException("Protobuf runtime is not correctly loaded.");
        throw object;
    }

    private static zziq zzc() {
        Constructor constructor = "com.google.protobuf.ExtensionSchemaFull";
        try {
            constructor = Class.forName((String)((Object)constructor));
        }
        catch (Exception exception) {
            return null;
        }
        constructor = ((Class)((Object)constructor)).getDeclaredConstructor(null);
        constructor = constructor.newInstance(null);
        return (zziq)((Object)constructor);
    }
}

