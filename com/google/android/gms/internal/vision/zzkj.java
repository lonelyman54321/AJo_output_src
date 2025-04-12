/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzkg;
import com.google.android.gms.internal.vision.zzkh;
import java.lang.reflect.Constructor;

final class zzkj {
    private static final zzkh zza = zzkj.zzc();
    private static final zzkh zzb;

    static {
        zzkg zzkg2 = new zzkg();
        zzb = zzkg2;
    }

    public static zzkh zza() {
        return zza;
    }

    public static zzkh zzb() {
        return zzb;
    }

    private static zzkh zzc() {
        Constructor constructor = "com.google.protobuf.MapFieldSchemaFull";
        try {
            constructor = Class.forName((String)((Object)constructor));
        }
        catch (Exception exception) {
            return null;
        }
        constructor = ((Class)((Object)constructor)).getDeclaredConstructor(null);
        constructor = constructor.newInstance(null);
        return (zzkh)((Object)constructor);
    }
}

