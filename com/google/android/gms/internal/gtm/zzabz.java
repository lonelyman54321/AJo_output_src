/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzadi;
import com.google.android.gms.internal.gtm.zzadj;

final class zzabz
implements zzadj {
    private static final zzabz zza;

    static {
        zzabz zzabz2;
        zza = zzabz2 = new zzabz();
    }

    private zzabz() {
    }

    public static zzabz zza() {
        return zza;
    }

    public final zzadi zzb(Class object) {
        Class<zzacf> clazz = zzacf.class;
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
            clazz = zzacf.zzad(clazz);
            n3 = 3;
            clazz = ((zzacf)((Object)clazz)).zzb(n3, null, null);
            return (zzadi)((Object)clazz);
        }
        object = ((Class)object).getName();
        object = "Unsupported message type: ".concat((String)object);
        clazz = new IllegalArgumentException((String)object);
        throw clazz;
    }

    public final boolean zzc(Class clazz) {
        return zzacf.class.isAssignableFrom(clazz);
    }
}

