/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzeu;
import com.google.android.gms.internal.auth.zzft;
import com.google.android.gms.internal.auth.zzfu;

final class zzer
implements zzfu {
    private static final zzer zza;

    static {
        zzer zzer2;
        zza = zzer2 = new zzer();
    }

    private zzer() {
    }

    public static zzer zza() {
        return zza;
    }

    public final zzft zzb(Class object) {
        Class<zzeu> clazz = zzeu.class;
        int n3 = clazz.isAssignableFrom((Class<?>)object);
        if (n3 != 0) {
            try {
                clazz = ((Class)object).asSubclass(clazz);
            }
            catch (Exception exception) {
                object = ((Class)object).getName();
                object = "Unable to get message info for ".concat((String)object);
                RuntimeException runtimeException = new RuntimeException((String)object, exception);
                throw runtimeException;
            }
            clazz = zzeu.zza(clazz);
            n3 = 3;
            clazz = ((zzeu)((Object)clazz)).zzi(n3, null, null);
            return (zzft)((Object)clazz);
        }
        object = ((Class)object).getName();
        object = "Unsupported message type: ".concat((String)object);
        clazz = new IllegalArgumentException((String)object);
        throw clazz;
    }

    public final boolean zzc(Class clazz) {
        return zzeu.class.isAssignableFrom(clazz);
    }
}

