/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zzf;
import com.google.android.gms.internal.measurement.zzlk;
import com.google.android.gms.internal.measurement.zzln;

final class zzke
implements zzln {
    private static final zzke zza;

    static {
        zzke zzke2;
        zza = zzke2 = new zzke();
    }

    private zzke() {
    }

    public static zzke zza() {
        return zza;
    }

    public final zzlk zza(Class object) {
        Class<zzkg> clazz = zzkg.class;
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
            clazz = zzkg.zza(clazz);
            n3 = zzkg$zzf.zzc;
            clazz = ((zzkg)((Object)clazz)).zza(n3, null, null);
            return (zzlk)((Object)clazz);
        }
        object = ((Class)object).getName();
        object = "Unsupported message type: ".concat((String)object);
        clazz = new IllegalArgumentException((String)object);
        throw clazz;
    }

    public final boolean zzb(Class clazz) {
        return zzkg.class.isAssignableFrom(clazz);
    }
}

