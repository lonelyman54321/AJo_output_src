/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzcz;
import java.net.URL;
import java.net.URLConnection;

public abstract class zzda {
    private static zzda zza;

    static {
        zzcz zzcz2 = new zzcz(null);
        zza = zzcz2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzda zza() {
        Class<zzda> clazz = zzda.class;
        synchronized (clazz) {
            return zza;
        }
    }

    public abstract URLConnection zza(URL var1, String var2);
}

