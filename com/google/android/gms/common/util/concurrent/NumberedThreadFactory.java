/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.zza;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class NumberedThreadFactory
implements ThreadFactory {
    private final String zza;
    private final AtomicInteger zzb;
    private final ThreadFactory zzc;

    public NumberedThreadFactory(String string2) {
        Object object = new AtomicInteger();
        this.zzb = object;
        this.zzc = object = Executors.defaultThreadFactory();
        Preconditions.checkNotNull(string2, "Name must not be null");
        this.zza = string2;
    }

    public final Thread newThread(Runnable runnable2) {
        Object object = new zza(runnable2, 0);
        runnable2 = this.zzc.newThread((Runnable)object);
        int n3 = this.zzb.getAndIncrement();
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.zza;
        stringBuilder.append(string2);
        stringBuilder.append("[");
        stringBuilder.append(n3);
        stringBuilder.append("]");
        object = stringBuilder.toString();
        ((Thread)runnable2).setName((String)object);
        return runnable2;
    }
}

