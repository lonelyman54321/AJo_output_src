/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdb;
import com.google.android.gms.internal.ads.zzhdc;

final class zzhbh
implements zzhdc {
    private static final zzhbh zza;

    static {
        zzhbh zzhbh2;
        zza = zzhbh2 = new zzhbh();
    }

    private zzhbh() {
    }

    public static zzhbh zza() {
        return zza;
    }

    public final zzhdb zzb(Class object) {
        Class<zzhbo> clazz = zzhbo.class;
        boolean bl2 = clazz.isAssignableFrom((Class<?>)object);
        if (bl2) {
            try {
                clazz = ((Class)object).asSubclass(clazz);
            }
            catch (Exception exception) {
                object = ((Class)object).getName();
                object = "Unable to get message info for ".concat((String)object);
                RuntimeException runtimeException = new RuntimeException((String)object, exception);
                throw runtimeException;
            }
            clazz = zzhbo.zzbh(clazz);
            clazz = ((zzhbo)((Object)clazz)).zzbN();
            return (zzhdb)((Object)clazz);
        }
        object = ((Class)object).getName();
        object = "Unsupported message type: ".concat((String)object);
        clazz = new IllegalArgumentException((String)object);
        throw clazz;
    }

    public final boolean zzc(Class clazz) {
        return zzhbo.class.isAssignableFrom(clazz);
    }
}

