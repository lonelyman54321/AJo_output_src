/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgx;
import com.google.android.gms.internal.measurement.zzgy;

public final class zzgv {
    private static zzgy zza;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzgy zza() {
        Class<zzgv> clazz = zzgv.class;
        synchronized (clazz) {
            try {
                zzgy zzgy2 = zza;
                if (zzgy2 != null) return zza;
                zzgy2 = new zzgx();
                zzgv.zza(zzgy2);
                return zza;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void zza(zzgy object) {
        Class<zzgv> clazz = zzgv.class;
        synchronized (clazz) {
            Throwable throwable2;
            block4: {
                Object object2;
                try {
                    object2 = zza;
                    if (object2 == null) {
                        zza = object;
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object2 = "init() already called";
                object = new IllegalStateException((String)object2);
                throw object;
            }
            throw throwable2;
        }
    }
}

