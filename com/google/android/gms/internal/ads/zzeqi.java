/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzeqj;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzeqi
implements zzexw {
    private final Clock zza;
    private final zzfho zzb;

    public zzeqi(Clock clock, zzfho zzfho2) {
        this.zza = clock;
        this.zzb = zzfho2;
    }

    public final int zza() {
        return 4;
    }

    public final ListenableFuture zzb() {
        Clock clock = this.zza;
        zzfho zzfho2 = this.zzb;
        long l2 = clock.currentTimeMillis();
        zzeqj zzeqj2 = new zzeqj(zzfho2, l2);
        return zzgft.zzh(zzeqj2);
    }
}

