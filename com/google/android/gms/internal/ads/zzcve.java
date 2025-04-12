/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbgx;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcup;
import com.google.android.gms.internal.ads.zzcuy;
import com.google.android.gms.internal.ads.zzcuz;
import com.google.android.gms.internal.ads.zzcva;
import com.google.android.gms.internal.ads.zzcvb;
import com.google.android.gms.internal.ads.zzcvc;
import com.google.android.gms.internal.ads.zzcvd;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzcve {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final ListenableFuture zzc;
    private volatile boolean zzd = true;

    public zzcve(Executor executor, ScheduledExecutorService scheduledExecutorService, ListenableFuture listenableFuture) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = listenableFuture;
    }

    public static /* bridge */ /* synthetic */ void zzb(zzcve object, List object2, zzgfp zzgfp2) {
        boolean bl2;
        if (object2 != null && !(bl2 = object2.isEmpty())) {
            boolean bl3;
            bl2 = false;
            ListenableFuture listenableFuture = zzgft.zzh(null);
            object2 = object2.iterator();
            while (bl3 = object2.hasNext()) {
                Object object3 = (ListenableFuture)object2.next();
                zzgfa zzgfa2 = new zzcva(zzgfp2);
                Executor executor = ((zzcve)object).zza;
                Class<Throwable> clazz = Throwable.class;
                listenableFuture = zzgft.zzf(listenableFuture, clazz, zzgfa2, executor);
                zzgfa2 = new zzcvb((zzcve)object, zzgfp2, (ListenableFuture)object3);
                object3 = ((zzcve)object).zza;
                listenableFuture = zzgft.zzn(listenableFuture, zzgfa2, (Executor)object3);
            }
            object2 = new zzcvd((zzcve)object, zzgfp2);
            object = ((zzcve)object).zza;
            zzgft.zzr(listenableFuture, (zzgfp)object2, (Executor)object);
            return;
        }
        object = ((zzcve)object).zza;
        object2 = new zzcuz(zzgfp2);
        object.execute((Runnable)object2);
    }

    public static /* bridge */ /* synthetic */ void zzc(zzcve zzcve2) {
        zzgge zzgge2 = zzcci.zze;
        zzcuy zzcuy2 = new zzcuy(zzcve2);
        zzgge2.execute(zzcuy2);
    }

    public final /* synthetic */ ListenableFuture zza(zzgfp object, ListenableFuture listenableFuture, zzcup object2) {
        if (object2 != null) {
            object.zzb(object2);
        }
        long l2 = (Long)zzbgx.zzb.zze();
        object = this.zzb;
        object2 = TimeUnit.MILLISECONDS;
        return zzgft.zzo(listenableFuture, l2, (TimeUnit)((Object)object2), (ScheduledExecutorService)object);
    }

    public final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final void zze(zzgfp object) {
        zzcvc zzcvc2 = new zzcvc(this, (zzgfp)object);
        object = this.zza;
        zzgft.zzr(this.zzc, zzcvc2, (Executor)object);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}

