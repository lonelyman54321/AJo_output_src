/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgfh;
import com.google.android.gms.internal.ads.zzgfj;
import com.google.android.gms.internal.ads.zzggn;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class zzggq
extends zzgfj {
    private ListenableFuture zza;
    private ScheduledFuture zzb;

    private zzggq(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
    }

    public static /* bridge */ /* synthetic */ ListenableFuture zze(zzggq zzggq2) {
        return zzggq2.zza;
    }

    public static ListenableFuture zzf(ListenableFuture listenableFuture, long l2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzggq zzggq2 = new zzggq(listenableFuture);
        zzggn zzggn2 = new zzggn(zzggq2);
        Object object = scheduledExecutorService.schedule(zzggn2, l2, timeUnit);
        zzggq2.zzb = object;
        object = zzgfh.zza;
        listenableFuture.addListener(zzggn2, (Executor)object);
        return zzggq2;
    }

    public static /* bridge */ /* synthetic */ ScheduledFuture zzv(zzggq zzggq2) {
        return zzggq2.zzb;
    }

    public static /* bridge */ /* synthetic */ void zzw(zzggq zzggq2, ScheduledFuture scheduledFuture) {
        zzggq2.zzb = null;
    }

    public final String zza() {
        Object object = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (object != null) {
            long l2;
            long l3;
            long l4;
            long l7;
            object = object.toString();
            Object object2 = "inputFuture=[";
            CharSequence charSequence = "]";
            object = cP.a(object2, (String)object, (String)charSequence);
            if (scheduledFuture != null && (l7 = (l4 = (l3 = scheduledFuture.getDelay((TimeUnit)((Object)(object2 = TimeUnit.MILLISECONDS)))) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) > 0) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)object);
                ((StringBuilder)charSequence).append(", remaining delay=[");
                ((StringBuilder)charSequence).append(l3);
                ((StringBuilder)charSequence).append(" ms]");
                object = ((StringBuilder)charSequence).toString();
            }
            return object;
        }
        return null;
    }

    public final void zzb() {
        Future future = this.zza;
        this.zzr(future);
        future = this.zzb;
        if (future != null) {
            future.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}

