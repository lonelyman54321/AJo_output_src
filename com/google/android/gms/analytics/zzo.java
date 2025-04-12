/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.analytics;

import com.google.android.gms.analytics.zzp;
import com.google.android.gms.analytics.zzq;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class zzo
implements ThreadFactory {
    private static final AtomicInteger zza;

    static {
        AtomicInteger atomicInteger;
        zza = atomicInteger = new AtomicInteger();
    }

    private zzo() {
        throw null;
    }

    public /* synthetic */ zzo(zzq zzq2) {
    }

    public final Thread newThread(Runnable runnable2) {
        String string2 = hj0_0.a(zza.incrementAndGet(), "measurement-");
        zzp zzp2 = new zzp(runnable2, string2);
        return zzp2;
    }
}

