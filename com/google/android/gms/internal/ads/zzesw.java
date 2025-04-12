/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzesv;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzesw
implements zzexw {
    private final zzgge zza;

    public zzesw(zzgge zzgge2) {
        this.zza = zzgge2;
    }

    public final int zza() {
        return 55;
    }

    public final ListenableFuture zzb() {
        zzesv zzesv2 = new zzesv(this);
        return this.zza.zzb(zzesv2);
    }
}

