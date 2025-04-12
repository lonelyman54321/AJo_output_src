/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzcp;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

final class zzcq
implements Executor {
    private final AtomicInteger zza;
    private final ThreadPoolExecutor zzb;
    private WeakReference zzc;

    public zzcq(String object) {
        boolean bl2 = true;
        this.zza = object = new AtomicInteger((int)(bl2 ? 1 : 0));
        object = new WeakReference(null);
        this.zzc = object;
        zzcp zzcp2 = new zzcp(this, "Google consent worker");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<Runnable>();
        this.zzb = object = new ThreadPoolExecutor(1, 1, (long)30, timeUnit, linkedBlockingQueue, zzcp2);
        ((ThreadPoolExecutor)object).allowCoreThreadTimeOut(bl2);
    }

    public final void execute(Runnable runnable2) {
        Object t3;
        Thread thread2 = Thread.currentThread();
        if (thread2 == (t3 = this.zzc.get())) {
            runnable2.run();
            return;
        }
        this.zzb.execute(runnable2);
    }

    public final /* synthetic */ Thread zza(String weakReference, Runnable runnable2) {
        weakReference = this.zza;
        weakReference = hj0_0.a(((AtomicInteger)((Object)weakReference)).getAndIncrement(), "Google consent worker #");
        Thread thread2 = new Thread(runnable2, (String)((Object)weakReference));
        this.zzc = weakReference = new WeakReference<Thread>(thread2);
        return thread2;
    }
}

