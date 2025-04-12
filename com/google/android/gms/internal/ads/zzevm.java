/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzevn;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzfgs;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzevm
implements zzexw {
    private final zzfgs zza;

    public zzevm(zzfgs zzfgs2) {
        this.zza = zzfgs2;
    }

    public final int zza() {
        return 25;
    }

    public final ListenableFuture zzb() {
        zzfgs zzfgs2 = this.zza;
        zzevn zzevn2 = new zzevn(zzfgs2);
        return zzgft.zzh(zzevn2);
    }
}

