/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class zzfkf
implements ThreadFactory {
    private final AtomicInteger zza;

    public zzfkf() {
        AtomicInteger atomicInteger;
        this.zza = atomicInteger = new AtomicInteger(1);
    }

    public final Thread newThread(Runnable runnable2) {
        Object object = this.zza;
        object = hj0_0.a(((AtomicInteger)object).getAndIncrement(), "AdWorker(NG) #");
        Thread thread2 = new Thread(runnable2, (String)object);
        return thread2;
    }
}

