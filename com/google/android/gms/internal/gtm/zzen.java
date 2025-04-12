/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.Logger;
import com.google.android.gms.internal.gtm.zzbq;
import com.google.android.gms.internal.gtm.zzct;
import com.google.android.gms.internal.gtm.zzeh;
import com.google.android.gms.internal.gtm.zzeo;

public final class zzen {
    private static volatile Logger zza;

    static {
        zzct zzct2 = new zzct();
        zza = zzct2;
    }

    public static Logger zza() {
        return zza;
    }

    public static void zzb(String string2, Object object) {
        zzeo zzeo2 = zzeo.zza();
        if (zzeo2 != null) {
            zzeo2.zzJ(string2, object);
        } else {
            boolean bl2 = zzen.zzf(3);
            if (bl2) {
                if (object != null) {
                    object = (String)object;
                }
                object = (String)zzeh.zzb.zzb();
            }
        }
        object = zza;
        if (object != null) {
            object.error(string2);
        }
    }

    public static void zzc(Logger logger) {
        zza = logger;
    }

    public static void zzd(String string2) {
        Object object = zzeo.zza();
        if (object != null) {
            ((zzbq)object).zzN(string2);
        } else {
            object = null;
            boolean bl2 = zzen.zzf(0);
            if (bl2) {
                object = (String)zzeh.zzb.zzb();
            }
        }
        object = zza;
        if (object != null) {
            object.verbose(string2);
        }
    }

    public static void zze(String string2) {
        Object object = zzeo.zza();
        if (object != null) {
            ((zzbq)object).zzQ(string2);
        } else {
            boolean bl2 = zzen.zzf(2);
            if (bl2) {
                object = (String)zzeh.zzb.zzb();
            }
        }
        object = zza;
        if (object != null) {
            object.warn(string2);
        }
    }

    public static boolean zzf(int n3) {
        int n4;
        Logger logger = zza;
        return logger != null && (n4 = (logger = zza).getLogLevel()) <= n3;
    }
}

