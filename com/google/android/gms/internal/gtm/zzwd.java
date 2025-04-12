/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzwe;
import com.google.android.gms.internal.gtm.zzwh;
import com.google.android.gms.internal.gtm.zzwi;
import java.lang.reflect.Constructor;

public final class zzwd {
    private static final String[] zza;
    private static final zzwh zzb;

    static {
        Object object;
        block8: {
            int n3;
            Object object2 = "com.google.common.flogger.util.JavaLangAccessStackGetter";
            zza = new String[]{"com.google.common.flogger.util.StackWalkerStackGetter", object2};
            for (int i3 = 0; i3 < (n3 = 2); ++i3) {
                Class<zzwh> clazz;
                object2 = zza[i3];
                object = null;
                try {
                    object2 = Class.forName((String)object2);
                    clazz = zzwh.class;
                }
                catch (Throwable throwable) {}
                object2 = ((Class)object2).asSubclass(clazz);
                object2 = ((Class)object2).getDeclaredConstructor(null);
                object2 = ((Constructor)object2).newInstance(null);
                object = object2 = (zzwh)object2;
                if (object == null) {
                    continue;
                }
                break block8;
            }
            object = new zzwi();
        }
        zzb = object;
    }

    public static StackTraceElement zza(Class clazz, int n3) {
        zzwe.zza(clazz, "target");
        return zzb.zza(clazz, 2);
    }
}

