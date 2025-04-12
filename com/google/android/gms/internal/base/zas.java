/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.base;

import com.google.android.gms.internal.base.zaq;
import com.google.android.gms.internal.base.zar;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class zas
implements zaq {
    private zas() {
    }

    public /* synthetic */ zas(zar zar2) {
    }

    public final ExecutorService zaa(ThreadFactory threadFactory, int n3) {
        n3 = 1;
        return this.zac(n3, threadFactory, n3);
    }

    public final ExecutorService zab(int n3, int n4) {
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        return this.zac(4, threadFactory, 2);
    }

    public final ExecutorService zac(int n3, ThreadFactory threadFactory, int n4) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<Runnable>();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(n3, n3, (long)60, timeUnit, linkedBlockingQueue, threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}

