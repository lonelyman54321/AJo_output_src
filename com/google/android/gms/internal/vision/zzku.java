/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzks;
import com.google.android.gms.internal.vision.zzkv;
import java.lang.reflect.Constructor;

final class zzku {
    private static final zzks zza = zzku.zzc();
    private static final zzks zzb;

    static {
        zzkv zzkv2 = new zzkv();
        zzb = zzkv2;
    }

    public static zzks zza() {
        return zza;
    }

    public static zzks zzb() {
        return zzb;
    }

    private static zzks zzc() {
        Constructor constructor = "com.google.protobuf.NewInstanceSchemaFull";
        try {
            constructor = Class.forName((String)((Object)constructor));
        }
        catch (Exception exception) {
            return null;
        }
        constructor = ((Class)((Object)constructor)).getDeclaredConstructor(null);
        constructor = constructor.newInstance(null);
        return (zzks)((Object)constructor);
    }
}

