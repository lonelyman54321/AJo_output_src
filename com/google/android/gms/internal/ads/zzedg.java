/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzedq;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

public final class zzedg
implements Callable {
    public final /* synthetic */ zzedq zza;
    public final /* synthetic */ ListenableFuture zzb;
    public final /* synthetic */ ListenableFuture zzc;
    public final /* synthetic */ zzbxu zzd;
    public final /* synthetic */ zzfmc zze;

    public /* synthetic */ zzedg(zzedq zzedq2, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzbxu zzbxu2, zzfmc zzfmc2) {
        this.zza = zzedq2;
        this.zzb = listenableFuture;
        this.zzc = listenableFuture2;
        this.zzd = zzbxu2;
        this.zze = zzfmc2;
    }

    public final Object call() {
        zzedq zzedq2 = this.zza;
        ListenableFuture listenableFuture = this.zzb;
        ListenableFuture listenableFuture2 = this.zzc;
        zzbxu zzbxu2 = this.zzd;
        zzfmc zzfmc2 = this.zze;
        return zzedq2.zzj(listenableFuture, listenableFuture2, zzbxu2, zzfmc2);
    }
}

