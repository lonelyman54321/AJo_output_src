/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfqq;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class zzfqr {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc;
    private zzfqq zzd;

    public zzfqr() {
        LinkedBlockingQueue<Runnable> linkedBlockingQueue;
        Object object = new ArrayDeque();
        this.zzc = object;
        this.zzd = null;
        this.zza = linkedBlockingQueue = new LinkedBlockingQueue<Runnable>();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.zzb = object = new ThreadPoolExecutor(1, 1, 1L, timeUnit, linkedBlockingQueue);
    }

    private final void zzc() {
        zzfqq zzfqq2;
        this.zzd = zzfqq2 = (zzfqq)((Object)this.zzc.poll());
        if (zzfqq2 != null) {
            ThreadPoolExecutor threadPoolExecutor = this.zzb;
            Object[] objectArray = new Object[]{};
            zzfqq2.executeOnExecutor(threadPoolExecutor, objectArray);
        }
    }

    public final void zza(zzfqq zzfqq2) {
        this.zzd = null;
        this.zzc();
    }

    public final void zzb(zzfqq zzfqq2) {
        zzfqq2.zzb(this);
        ArrayDeque arrayDeque = this.zzc;
        arrayDeque.add(zzfqq2);
        zzfqq2 = this.zzd;
        if (zzfqq2 == null) {
            this.zzc();
        }
    }
}

