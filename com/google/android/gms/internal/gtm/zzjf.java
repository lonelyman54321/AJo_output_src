/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzfx;
import com.google.android.gms.internal.gtm.zzje;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

final class zzjf {
    private static final ScheduledExecutorService zza;

    static {
        zzfx.zza();
        zzje zzje2 = new zzje();
        zza = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, zzje2));
    }

    public static /* bridge */ /* synthetic */ ScheduledExecutorService zza() {
        return zza;
    }
}

