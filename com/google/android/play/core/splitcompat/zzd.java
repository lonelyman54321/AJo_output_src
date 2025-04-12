/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitcompat;

import com.google.android.play.core.splitcompat.zzc;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class zzd {
    private static ThreadPoolExecutor zza;

    public static Executor zza() {
        ThreadPoolExecutor threadPoolExecutor = zza;
        if (threadPoolExecutor == null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<Runnable>();
            zzc zzc2 = new zzc();
            int n3 = 1;
            int n4 = 1;
            long l2 = 10;
            zza = threadPoolExecutor = new ThreadPoolExecutor(n3, n4, l2, timeUnit, linkedBlockingQueue, zzc2);
            boolean bl2 = true;
            threadPoolExecutor.allowCoreThreadTimeOut(bl2);
        }
        return zza;
    }
}

