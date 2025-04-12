/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 */
package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzdzz;
import com.google.android.gms.internal.ads.zzeaa;
import com.google.android.gms.internal.ads.zzeab;
import com.google.android.gms.internal.ads.zzeau;
import com.google.android.gms.internal.ads.zzebh;
import com.google.android.gms.internal.ads.zzebi;
import com.google.android.gms.internal.ads.zzedq;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgfk;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkj;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzeac {
    private final ScheduledExecutorService zza;
    private final zzgge zzb;
    private final zzgge zzc;
    private final zzeau zzd;
    private final zzhkj zze;

    public zzeac(ScheduledExecutorService scheduledExecutorService, zzgge zzgge2, zzgge zzgge3, zzeau zzeau2, zzhkj zzhkj2) {
        this.zza = scheduledExecutorService;
        this.zzb = zzgge2;
        this.zzc = zzgge3;
        this.zzd = zzeau2;
        this.zze = zzhkj2;
    }

    public final /* synthetic */ zzebi zza(zzbxu object) {
        object = this.zzd.zza((zzbxu)object);
        zzbeg zzbeg2 = zzbep.zzfF;
        long l2 = ((Integer)zzba.zzc().zza(zzbeg2)).intValue();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return (zzebi)object.get(l2, timeUnit);
    }

    public final /* synthetic */ ListenableFuture zzb(zzbxu object, int n3, Throwable object2) {
        ListenableFuture listenableFuture = ((zzedq)this.zze.zzb()).zzd((zzbxu)object, n3);
        object2 = new zzdzz((zzbxu)object);
        object = this.zzb;
        return zzgft.zzn(listenableFuture, (zzgfa)object2, (Executor)object);
    }

    public final ListenableFuture zzc(zzbxu object) {
        int n3;
        Object object2 = ((zzbxu)object).zzd;
        zzu.zzp();
        boolean bl2 = zzt.zzC((String)object2);
        if (bl2) {
            n3 = 1;
            object2 = new zzebh(n3);
            object2 = zzgft.zzg((Throwable)object2);
        } else {
            object2 = zzbep.zzhH;
            Object object3 = zzba.zzc();
            object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
            bl2 = (Boolean)object2;
            if (bl2) {
                object2 = this.zzc;
                object3 = new zzeaa(this, (zzbxu)object);
                object2 = object2.zzb((Callable)object3);
            } else {
                object2 = this.zzd.zza((zzbxu)object);
            }
        }
        n3 = Binder.getCallingUid();
        object2 = zzgfk.zzu((ListenableFuture)object2);
        Object object4 = zzbep.zzfF;
        long l2 = ((Integer)zzba.zzc().zza((zzbeg)object4)).intValue();
        ScheduledExecutorService scheduledExecutorService = this.zza;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        object2 = (zzgfk)zzgft.zzo((ListenableFuture)object2, l2, timeUnit, scheduledExecutorService);
        object4 = new zzeab(this, (zzbxu)object, n3);
        object = this.zzb;
        return zzgft.zzf((ListenableFuture)object2, Throwable.class, (zzgfa)object4, (Executor)object);
    }
}

