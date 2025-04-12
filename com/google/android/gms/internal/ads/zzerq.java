/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzerp;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

public final class zzerq
implements zzexw {
    private final Executor zza;
    private final zzcby zzb;

    public zzerq(Executor executor, zzcby zzcby2) {
        this.zza = executor;
        this.zzb = zzcby2;
    }

    public final int zza() {
        return 10;
    }

    public final ListenableFuture zzb() {
        Object object = zzbep.zzcJ;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            return zzgft.zzh(null);
        }
        object = this.zzb.zzk();
        object2 = new zzerp();
        Executor executor = this.zza;
        return zzgft.zzm((ListenableFuture)object, (zzfxu)object2, executor);
    }
}

