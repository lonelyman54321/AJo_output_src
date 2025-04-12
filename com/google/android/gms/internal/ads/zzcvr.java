/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcvx;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

public final class zzcvr
implements Callable {
    public final /* synthetic */ zzcvx zza;
    public final /* synthetic */ ListenableFuture zzb;
    public final /* synthetic */ ListenableFuture zzc;
    public final /* synthetic */ ListenableFuture zzd;

    public /* synthetic */ zzcvr(zzcvx zzcvx2, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3) {
        this.zza = zzcvx2;
        this.zzb = listenableFuture;
        this.zzc = listenableFuture2;
        this.zzd = listenableFuture3;
    }

    public final Object call() {
        zzcvx zzcvx2 = this.zza;
        ListenableFuture listenableFuture = this.zzb;
        ListenableFuture listenableFuture2 = this.zzc;
        ListenableFuture listenableFuture3 = this.zzd;
        return zzcvx2.zzg(listenableFuture, listenableFuture2, listenableFuture3);
    }
}

