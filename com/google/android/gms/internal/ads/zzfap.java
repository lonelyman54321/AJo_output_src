/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdy;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzfao;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

public final class zzfap
implements zzexw {
    final zzgge zza;
    final List zzb;
    final zzbdy zzc;

    public zzfap(zzbdy zzbdy2, zzgge zzgge2, List list) {
        this.zzc = zzbdy2;
        this.zza = zzgge2;
        this.zzb = list;
    }

    public final int zza() {
        return 48;
    }

    public final ListenableFuture zzb() {
        zzfao zzfao2 = new zzfao(this);
        return this.zza.zzb(zzfao2);
    }
}

