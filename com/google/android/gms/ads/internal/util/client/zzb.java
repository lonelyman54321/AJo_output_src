/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal.util.client;

import com.google.android.gms.ads.internal.util.client.zza;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class zzb {
    public static final ThreadPoolExecutor zza;
    public static final ExecutorService zzb;

    static {
        ThreadPoolExecutor threadPoolExecutor;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue<Runnable> synchronousQueue = new SynchronousQueue<Runnable>();
        zza zza2 = new zza("ClientDefault");
        Object object = threadPoolExecutor;
        zza = threadPoolExecutor = new ThreadPoolExecutor(2, -1 >>> 1, (long)10, timeUnit, synchronousQueue, zza2);
        object = new zza("ClientSingle");
        zzb = Executors.newSingleThreadExecutor((ThreadFactory)object);
    }
}

