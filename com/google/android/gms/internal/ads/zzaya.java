/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class zzaya
implements ThreadFactory {
    private final ThreadFactory zza;
    private final AtomicInteger zzb;

    public zzaya() {
        Object object = Executors.defaultThreadFactory();
        this.zza = object;
        this.zzb = object = new AtomicInteger(1);
    }

    public final Thread newThread(Runnable runnable2) {
        Object object = this.zzb;
        runnable2 = this.zza.newThread(runnable2);
        int n3 = ((AtomicInteger)object).getAndIncrement();
        StringBuilder stringBuilder = new StringBuilder("gads-");
        stringBuilder.append(n3);
        object = stringBuilder.toString();
        ((Thread)runnable2).setName((String)object);
        return runnable2;
    }
}

