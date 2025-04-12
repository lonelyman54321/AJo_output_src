/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.internal;

import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.common.zzg;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class zzj {
    static final ExecutorService zza;

    static {
        zzg.zza();
        NamedThreadFactory namedThreadFactory = new NamedThreadFactory("CallbackExecutor");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<Runnable>();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, (long)60, timeUnit, linkedBlockingQueue, namedThreadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        zza = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}

