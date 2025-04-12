/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcbp;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzezw;
import com.google.android.gms.internal.ads.zzezx;
import com.google.android.gms.internal.ads.zzezy;
import com.google.android.gms.internal.ads.zzfaa;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzgez;
import com.google.android.gms.internal.ads.zzgfk;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzggk;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzezz
implements zzexw {
    private final Context zza;
    private final zzcby zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private final String zze;
    private final zzcbp zzf;

    public zzezz(zzcbp zzcbp2, int n3, Context context, zzcby zzcby2, ScheduledExecutorService scheduledExecutorService, Executor executor, String string2) {
        this.zzf = zzcbp2;
        this.zza = context;
        this.zzb = zzcby2;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
        this.zze = string2;
    }

    public final int zza() {
        return 44;
    }

    public final ListenableFuture zzb() {
        Object object = new zzezw(this);
        Object object2 = this.zzd;
        object = zzgfk.zzu(zzgft.zzk((zzgez)object, (Executor)object2));
        object2 = new zzezx();
        Executor executor = this.zzd;
        object = zzgft.zzm((ListenableFuture)object, (zzfxu)object2, executor);
        object2 = zzbep.zzaW;
        long l2 = (Long)zzba.zzc().zza((zzbeg)object2);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ScheduledExecutorService scheduledExecutorService = this.zzc;
        object = (zzgfk)zzgft.zzo((ListenableFuture)object, l2, timeUnit, scheduledExecutorService);
        object2 = new zzezy(this);
        executor = zzggk.zzb();
        return zzgft.zze((ListenableFuture)object, Exception.class, (zzfxu)object2, executor);
    }

    public final /* synthetic */ zzfaa zzc(Exception exception) {
        this.zzb.zzw(exception, "AttestationTokenSignal");
        return null;
    }
}

