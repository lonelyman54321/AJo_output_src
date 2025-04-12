/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzjb;
import com.google.android.gms.internal.vision.zzjb$zzg;
import com.google.android.gms.internal.vision.zzki;
import com.google.android.gms.internal.vision.zzkl;

final class zzjc
implements zzkl {
    private static final zzjc zza;

    static {
        zzjc zzjc2;
        zza = zzjc2 = new zzjc();
    }

    private zzjc() {
    }

    public static zzjc zza() {
        return zza;
    }

    public final boolean zza(Class clazz) {
        return zzjb.class.isAssignableFrom(clazz);
    }

    public final zzki zzb(Class object) {
        int n3;
        Class<zzjb> clazz = zzjb.class;
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
        clazz = zzjb.zza(clazz);
        n4 = zzjb$zzg.zzc;
        n3 = 0;
        Object var4_6 = null;
        clazz = ((zzjb)((Object)clazz)).zza(n4, null, null);
        return (zzki)((Object)clazz);
    }
}

