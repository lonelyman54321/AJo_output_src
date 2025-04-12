/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.metrics.LogSessionId
 */
package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

final class zzpi {
    public static final zzpi zza;
    public final LogSessionId zzb;

    static {
        zzpi zzpi2;
        LogSessionId logSessionId = sF0.a();
        zza = zzpi2 = new zzpi(logSessionId);
    }

    public zzpi(LogSessionId logSessionId) {
        this.zzb = logSessionId;
    }
}

