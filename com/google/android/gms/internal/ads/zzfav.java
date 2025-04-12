/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbvk;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzfau;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzfav
implements zzexw {
    final ScheduledExecutorService zza;
    final Context zzb;
    final zzbvk zzc;

    public zzfav(zzbvk zzbvk2, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.zzc = zzbvk2;
        this.zza = scheduledExecutorService;
        this.zzb = context;
    }

    public final int zza() {
        return 49;
    }

    public final ListenableFuture zzb() {
        Object object = new Bundle();
        object = zzgft.zzh(object);
        Object object2 = zzbep.zzee;
        long l2 = (Long)zzba.zzc().zza((zzbeg)object2);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ScheduledExecutorService scheduledExecutorService = this.zza;
        object = zzgft.zzo((ListenableFuture)object, l2, timeUnit, scheduledExecutorService);
        object2 = new zzfau();
        zzgge zzgge2 = zzcci.zza;
        return zzgft.zzm((ListenableFuture)object, (zzfxu)object2, zzgge2);
    }
}

