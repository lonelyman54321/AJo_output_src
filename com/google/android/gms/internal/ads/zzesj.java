/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzesk;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzesj
implements zzexw {
    private final zzgge zza;
    private final zzfho zzb;

    public zzesj(zzgge zzgge2, zzfho zzfho2) {
        this.zza = zzgge2;
        this.zzb = zzfho2;
    }

    public final int zza() {
        return 58;
    }

    public final ListenableFuture zzb() {
        boolean bl2 = this.zzb.zzp;
        zzesk zzesk2 = new zzesk(bl2);
        return zzgft.zzh(zzesk2);
    }
}

