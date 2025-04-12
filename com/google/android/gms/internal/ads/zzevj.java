/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzevi;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzevj
implements zzexw {
    private final zzgge zza;

    public zzevj(zzgge zzgge2) {
        this.zza = zzgge2;
    }

    public final int zza() {
        return 24;
    }

    public final ListenableFuture zzb() {
        zzevi zzevi2 = new zzevi();
        return this.zza.zzb(zzevi2);
    }
}

