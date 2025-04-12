/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

final class zzggd {
    private final String zza;
    private volatile Logger zzb;

    public zzggd(Class object) {
        this.zza = object = ((Class)object).getName();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Logger zza() {
        Object object = this.zzb;
        if (object != null) {
            return object;
        }
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    object = this.zzb;
                    if (object != null) {
                        return object;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                object = this.zza;
                this.zzb = object = Logger.getLogger((String)object);
                return object;
            }
            throw throwable2;
        }
    }
}

