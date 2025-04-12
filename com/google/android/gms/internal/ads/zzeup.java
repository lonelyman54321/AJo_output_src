/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeuo;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzeup
implements zzexw {
    private final zzgge zza;

    public zzeup(zzgge zzgge2) {
        this.zza = zzgge2;
    }

    public final int zza() {
        return 20;
    }

    public final ListenableFuture zzb() {
        zzeuo zzeuo2 = new zzeuo();
        return this.zza.zzb(zzeuo2);
    }
}

