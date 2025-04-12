/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzda;
import com.google.android.gms.internal.icing.zzeb;
import com.google.android.gms.internal.icing.zzec;

final class zzcw
implements zzec {
    private static final zzcw zza;

    static {
        zzcw zzcw2;
        zza = zzcw2 = new zzcw();
    }

    private zzcw() {
    }

    public static zzcw zza() {
        return zza;
    }

    public final boolean zzb(Class clazz) {
        return zzda.class.isAssignableFrom(clazz);
    }

    public final zzeb zzc(Class object) {
        int n3;
        Class<zzda> clazz = zzda.class;
        int n4 = clazz.isAssignableFrom((Class<?>)object);
        if (n4 == 0) {
            object = ((Class)object).getName();
            n4 = ((String)object).length();
            String string2 = "Unsupported message type: ";
            object = n4 != 0 ? string2.concat((String)object) : new String(string2);
            clazz = new IllegalArgumentException((String)object);
            throw clazz;
        }
        try {
            clazz = ((Class)object).asSubclass(clazz);
        }
        catch (Exception exception) {
            object = ((Class)object).getName();
            n3 = ((String)object).length();
            String string3 = "Unable to get message info for ";
            object = n3 != 0 ? string3.concat((String)object) : new String(string3);
            RuntimeException runtimeException = new RuntimeException((String)object, exception);
            throw runtimeException;
        }
        clazz = zzda.zzp(clazz);
        n4 = 3;
        n3 = 0;
        Object var4_6 = null;
        clazz = ((zzda)((Object)clazz)).zzf(n4, null, null);
        return (zzeb)((Object)clazz);
    }
}

