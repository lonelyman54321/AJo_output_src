/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.providers;

import com.google.android.gms.common.providers.PooledExecutorsProvider$PooledExecutorFactory;
import com.google.android.gms.internal.common.zzg;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

final class zza
implements PooledExecutorsProvider$PooledExecutorFactory {
    public final ScheduledExecutorService newSingleThreadScheduledExecutor() {
        zzg.zza();
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }
}

