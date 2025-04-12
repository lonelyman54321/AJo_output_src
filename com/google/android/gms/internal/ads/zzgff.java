/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgfg;
import com.google.android.gms.internal.ads.zzggc;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

abstract class zzgff
extends zzggc {
    private final Executor zza;
    final /* synthetic */ zzgfg zzb;

    public zzgff(zzgfg zzgfg2, Executor executor) {
        this.zzb = zzgfg2;
        executor.getClass();
        this.zza = executor;
    }

    public abstract void zzc(Object var1);

    public final void zzd(Throwable throwable) {
        zzgfg zzgfg2 = this.zzb;
        zzgfg.zzG(zzgfg2, null);
        boolean bl2 = throwable instanceof ExecutionException;
        if (bl2) {
            zzgfg2 = this.zzb;
            throwable = ((ExecutionException)throwable).getCause();
            zzgfg2.zzd(throwable);
            return;
        }
        bl2 = throwable instanceof CancellationException;
        if (bl2) {
            this.zzb.cancel(false);
            return;
        }
        this.zzb.zzd(throwable);
    }

    public final void zze(Object object) {
        zzgfg.zzG(this.zzb, null);
        this.zzc(object);
    }

    public final void zzf() {
        Executor executor;
        try {
            executor = this.zza;
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            this.zzb.zzd(rejectedExecutionException);
            return;
        }
        executor.execute(this);
    }

    public final boolean zzg() {
        return this.zzb.isDone();
    }
}

