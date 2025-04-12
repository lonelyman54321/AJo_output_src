/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgeh;
import com.google.android.gms.internal.ads.zzgfh;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzggf;
import com.google.android.gms.internal.ads.zzggg;
import com.google.android.gms.internal.ads.zzggj;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public final class zzggk {
    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static zzgge zza(ExecutorService executorService) {
        void var2_3;
        boolean bl2 = executorService instanceof zzgge;
        if (bl2) {
            return (zzgge)executorService;
        }
        bl2 = executorService instanceof ScheduledExecutorService;
        if (bl2) {
            executorService = (ScheduledExecutorService)executorService;
            zzggj zzggj2 = new zzggj((ScheduledExecutorService)executorService);
            return var2_3;
        }
        zzggg zzggg2 = new zzggg(executorService);
        return var2_3;
    }

    public static Executor zzb() {
        return zzgfh.zza;
    }

    public static Executor zzc(Executor executor, zzgeh zzgeh2) {
        executor.getClass();
        Executor executor2 = zzgfh.zza;
        if (executor == executor2) {
            return executor;
        }
        executor2 = new zzggf(executor, zzgeh2);
        return executor2;
    }
}

