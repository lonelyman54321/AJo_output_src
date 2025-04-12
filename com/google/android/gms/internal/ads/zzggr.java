/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgez;
import com.google.android.gms.internal.ads.zzggc;
import com.google.android.gms.internal.ads.zzggt;
import com.google.common.util.concurrent.ListenableFuture;

final class zzggr
extends zzggc {
    final /* synthetic */ zzggt zza;
    private final zzgez zzb;

    public zzggr(zzggt zzggt2, zzgez zzgez2) {
        this.zza = zzggt2;
        this.zzb = zzgez2;
    }

    public final String zzb() {
        return this.zzb.toString();
    }

    public final void zzd(Throwable throwable) {
        this.zza.zzd(throwable);
    }

    public final /* synthetic */ void zze(Object object) {
        zzggt zzggt2 = this.zza;
        object = (ListenableFuture)object;
        zzggt2.zzs((ListenableFuture)object);
    }

    public final boolean zzg() {
        return this.zza.isDone();
    }
}

