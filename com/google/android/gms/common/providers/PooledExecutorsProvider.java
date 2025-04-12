/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.providers;

import com.google.android.gms.common.providers.PooledExecutorsProvider$PooledExecutorFactory;
import com.google.android.gms.common.providers.zza;

public class PooledExecutorsProvider {
    private static PooledExecutorsProvider$PooledExecutorFactory zza;

    private PooledExecutorsProvider() {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static PooledExecutorsProvider$PooledExecutorFactory getInstance() {
        Class<PooledExecutorsProvider> clazz = PooledExecutorsProvider.class;
        synchronized (clazz) {
            try {
                PooledExecutorsProvider$PooledExecutorFactory pooledExecutorsProvider$PooledExecutorFactory = zza;
                if (pooledExecutorsProvider$PooledExecutorFactory != null) return zza;
                zza = pooledExecutorsProvider$PooledExecutorFactory = new zza();
                return zza;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

