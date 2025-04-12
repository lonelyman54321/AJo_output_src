/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgeh;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

final class zzggf
implements Executor {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzgeh zzb;

    public zzggf(Executor executor, zzgeh zzgeh2) {
        this.zza = executor;
        this.zzb = zzgeh2;
    }

    public final void execute(Runnable runnable2) {
        Executor executor;
        try {
            executor = this.zza;
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            this.zzb.zzd(rejectedExecutionException);
            return;
        }
        executor.execute(runnable2);
    }
}

