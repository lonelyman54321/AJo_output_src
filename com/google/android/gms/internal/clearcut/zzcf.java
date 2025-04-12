/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg;
import com.google.android.gms.internal.clearcut.zzcg$zzg;
import com.google.android.gms.internal.clearcut.zzdm;
import com.google.android.gms.internal.clearcut.zzdn;

final class zzcf
implements zzdn {
    private static final zzcf zzjo;

    static {
        zzcf zzcf2;
        zzjo = zzcf2 = new zzcf();
    }

    private zzcf() {
    }

    public static zzcf zzay() {
        return zzjo;
    }

    public final boolean zza(Class clazz) {
        return zzcg.class.isAssignableFrom(clazz);
    }

    public final zzdm zzb(Class object) {
        int n3;
        Class<zzcg> clazz = zzcg.class;
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
        clazz = zzcg.zzc(clazz);
        n4 = zzcg$zzg.zzkf;
        n3 = 0;
        Object var4_6 = null;
        clazz = ((zzcg)((Object)clazz)).zza(n4, null, null);
        return (zzdm)((Object)clazz);
    }
}

