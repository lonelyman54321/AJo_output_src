/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzeqq;
import com.google.android.gms.internal.ads.zzeqr;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzequ
implements zzexw {
    private final ListenableFuture zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    public zzequ(ListenableFuture listenableFuture, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = listenableFuture;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    public final int zza() {
        return 6;
    }

    public final ListenableFuture zzb() {
        Object object = new zzeqq();
        Object object2 = this.zza;
        Object object3 = this.zzb;
        object = zzgft.zzn((ListenableFuture)object2, (zzgfa)object, (Executor)object3);
        object2 = zzbep.zzmv;
        object3 = (Integer)zzba.zzc().zza((zzbeg)object2);
        int n3 = (Integer)object3;
        if (n3 > 0) {
            object3 = zzba.zzc();
            object2 = (Integer)((zzben)object3).zza((zzbeg)object2);
            int n4 = (Integer)object2;
            long l2 = n4;
            ScheduledExecutorService scheduledExecutorService = this.zzc;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            object = zzgft.zzo((ListenableFuture)object, l2, timeUnit, scheduledExecutorService);
        }
        object2 = new zzeqr();
        object3 = this.zzb;
        return zzgft.zzf((ListenableFuture)object, Throwable.class, (zzgfa)object2, (Executor)object3);
    }
}

