/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbcp;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbfy;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzezr;
import com.google.android.gms.internal.ads.zzezs;
import com.google.android.gms.internal.ads.zzezu;
import com.google.android.gms.internal.ads.zzfvk;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.tasks.Tasks;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzezt
implements zzexw {
    private final zzcby zza;
    private final String zzb;
    private final ScheduledExecutorService zzc;
    private final zzgge zzd;
    private final zzbcp zze;

    public zzezt(String string2, zzbcp zzbcp2, zzcby zzcby2, ScheduledExecutorService scheduledExecutorService, zzgge zzgge2) {
        this.zzb = string2;
        this.zze = zzbcp2;
        this.zza = zzcby2;
        this.zzc = scheduledExecutorService;
        this.zzd = zzgge2;
    }

    public final int zza() {
        return 43;
    }

    public final ListenableFuture zzb() {
        Object object = zzbep.zzcK;
        object = (Boolean)zzba.zzc().zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        boolean bl3 = false;
        Object object2 = null;
        if (bl2) {
            object = zzbep.zzcP;
            Object object3 = zzba.zzc();
            object = (Boolean)((zzben)object3).zza((zzbeg)object);
            bl2 = (Boolean)object;
            if (bl2) {
                object = zzfvk.zza(Tasks.forResult(null), null);
                object2 = new zzezr();
                object3 = this.zzd;
                object = zzgft.zzn((ListenableFuture)object, (zzgfa)object2, (Executor)object3);
                object2 = (Boolean)zzbfy.zza.zze();
                bl3 = (Boolean)object2;
                if (bl3) {
                    object2 = (Long)zzbfy.zzb.zze();
                    long l2 = (Long)object2;
                    ScheduledExecutorService scheduledExecutorService = this.zzc;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    object = zzgft.zzo((ListenableFuture)object, l2, timeUnit, scheduledExecutorService);
                }
                object2 = new zzezs(this);
                object3 = this.zzd;
                return zzgft.zze((ListenableFuture)object, Exception.class, (zzfxu)object2, (Executor)object3);
            }
        }
        object = new zzezu(null, -1);
        return zzgft.zzh(object);
    }

    public final /* synthetic */ zzezu zzc(Exception object) {
        this.zza.zzw((Throwable)object, "AppSetIdInfoGmscoreSignal");
        object = new zzezu(null, -1);
        return object;
    }
}

