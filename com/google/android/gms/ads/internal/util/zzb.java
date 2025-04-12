/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal.util;

import com.google.android.gms.ads.internal.util.zza;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;

public abstract class zzb {
    private final Runnable zza;
    private volatile Thread zzb;

    public zzb() {
        zza zza2 = new zza(this);
        this.zza = zza2;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzb zzb2, Thread thread2) {
        zzb2.zzb = thread2;
    }

    public abstract void zza();

    public ListenableFuture zzb() {
        zzgge zzgge2 = zzcci.zza;
        Runnable runnable2 = this.zza;
        return zzgge2.zza(runnable2);
    }
}

