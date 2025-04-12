/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal.util.client;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class zza
implements ThreadFactory {
    final /* synthetic */ String zza;
    private final AtomicInteger zzb;

    public zza(String object) {
        this.zza = object;
        this.zzb = object = new AtomicInteger(1);
    }

    public final Thread newThread(Runnable runnable2) {
        Object object = this.zzb;
        int n3 = ((AtomicInteger)object).getAndIncrement();
        StringBuilder stringBuilder = new StringBuilder("AdWorker(");
        String string2 = this.zza;
        stringBuilder.append(string2);
        stringBuilder.append(") #");
        stringBuilder.append(n3);
        object = stringBuilder.toString();
        Thread thread2 = new Thread(runnable2, (String)object);
        return thread2;
    }
}

