/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.internal.gtm.zzgu;
import com.google.android.gms.internal.gtm.zzjc;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

final class zzjd {
    private static volatile ExecutorService zza;

    private zzjd() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ExecutorService zza(Context context) {
        Object object = zza;
        if (object != null) return zza;
        object = zzjd.class;
        synchronized (object) {
            try {
                ExecutorService executorService = zza;
                if (executorService != null) return zza;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
                zzjc zzjc2 = new zzjc();
                int n3 = 1;
                int n4 = 1;
                long l2 = 0L;
                zza = executorService = new zzgu(context, n3, n4, l2, timeUnit, linkedBlockingQueue, zzjc2);
                return zza;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

