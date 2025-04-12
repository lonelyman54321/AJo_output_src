/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.common.util.concurrent.ListenableFuture;

final class zzbzz
implements zzgfp {
    final /* synthetic */ ListenableFuture zza;

    public zzbzz(zzcaa zzcaa2, ListenableFuture listenableFuture) {
        this.zza = listenableFuture;
    }

    public final void zza(Throwable object) {
        object = zzcaa.zzc();
        ListenableFuture listenableFuture = this.zza;
        object.remove(listenableFuture);
    }
}

