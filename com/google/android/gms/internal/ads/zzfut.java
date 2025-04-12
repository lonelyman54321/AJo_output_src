/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfur;
import com.google.android.gms.internal.ads.zzfus;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class zzfut
implements zzfur {
    private zzfut() {
        throw null;
    }

    public /* synthetic */ zzfut(zzfus zzfus2) {
    }

    public final ExecutorService zza(int n3) {
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        return this.zzc(1, threadFactory, 2);
    }

    public final ExecutorService zzb(ThreadFactory threadFactory, int n3) {
        n3 = 1;
        return this.zzc(n3, threadFactory, n3);
    }

    public final ExecutorService zzc(int n3, ThreadFactory threadFactory, int n4) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<Runnable>();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(n3, n3, (long)60, timeUnit, linkedBlockingQueue, threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}

