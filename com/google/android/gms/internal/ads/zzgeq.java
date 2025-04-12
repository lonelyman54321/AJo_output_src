/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzges;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzgeq
implements Runnable {
    public final /* synthetic */ zzges zza;
    public final /* synthetic */ ListenableFuture zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzgeq(zzges zzges2, ListenableFuture listenableFuture, int n3) {
        this.zza = zzges2;
        this.zzb = listenableFuture;
        this.zzc = n3;
    }

    public final void run() {
        zzges zzges2 = this.zza;
        ListenableFuture listenableFuture = this.zzb;
        int n3 = this.zzc;
        zzges2.zzw(listenableFuture, n3);
    }
}

