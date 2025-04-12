/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzfbp;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzfbq
implements zzexw {
    private final zzgge zza;

    public zzfbq(zzgge zzgge2) {
        this.zza = zzgge2;
    }

    public final int zza() {
        return 51;
    }

    public final ListenableFuture zzb() {
        zzfbp zzfbp2 = new zzfbp();
        return this.zza.zzb(zzfbp2);
    }
}

