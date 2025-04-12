/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.analytics;

import com.google.android.gms.analytics.zzm;
import com.google.android.gms.analytics.zzo;
import com.google.android.gms.analytics.zzr;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class zzn
extends ThreadPoolExecutor {
    final /* synthetic */ zzr zza;

    public zzn(zzr object) {
        this.zza = object;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<Runnable>();
        super(1, 1, 1L, timeUnit, linkedBlockingQueue);
        object = new zzo(null);
        this.setThreadFactory((ThreadFactory)object);
        this.allowCoreThreadTimeOut(true);
    }

    public final RunnableFuture newTaskFor(Runnable runnable2, Object object) {
        zzm zzm2 = new zzm(this, runnable2, object);
        return zzm2;
    }
}

