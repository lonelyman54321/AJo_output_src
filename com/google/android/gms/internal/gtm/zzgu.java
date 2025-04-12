/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.internal.gtm.zzgp;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class zzgu
extends ThreadPoolExecutor {
    private final Context zza;

    public zzgu(Context context, int n3, int n4, long l2, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(1, 1, 0L, timeUnit, (BlockingQueue<Runnable>)blockingQueue, threadFactory);
        this.zza = context;
    }

    public final void afterExecute(Runnable runnable2, Throwable throwable) {
        if (throwable != null) {
            runnable2 = this.zza;
            String string2 = "Uncaught exception: ";
            zzgp.zzb(string2, throwable, (Context)runnable2);
        }
    }
}

