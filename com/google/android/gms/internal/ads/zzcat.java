/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcau;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class zzcat
implements ThreadFactory {
    private final AtomicInteger zza;

    public zzcat(zzcau object) {
        this.zza = object = new AtomicInteger(1);
    }

    public final Thread newThread(Runnable runnable2) {
        Object object = this.zza;
        object = hj0_0.a(((AtomicInteger)object).getAndIncrement(), "AdWorker(SCION_TASK_EXECUTOR) #");
        Thread thread2 = new Thread(runnable2, (String)object);
        return thread2;
    }
}

