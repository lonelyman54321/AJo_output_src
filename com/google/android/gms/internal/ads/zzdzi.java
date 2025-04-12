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
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzdze;
import com.google.android.gms.internal.ads.zzdzf;
import com.google.android.gms.internal.ads.zzdzg;
import com.google.android.gms.internal.ads.zzdzh;
import com.google.android.gms.internal.ads.zzeap;
import com.google.android.gms.internal.ads.zzebh;
import com.google.android.gms.internal.ads.zzebi;
import com.google.android.gms.internal.ads.zzedq;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkj;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class zzdzi {
    private final zzgge zza;
    private final zzgge zzb;
    private final zzeap zzc;
    private final zzhkj zzd;

    public zzdzi(zzgge zzgge2, zzgge zzgge3, zzeap zzeap2, zzhkj zzhkj2) {
        this.zza = zzgge2;
        this.zzb = zzgge3;
        this.zzc = zzeap2;
        this.zzd = zzhkj2;
    }

    public final /* synthetic */ zzebi zza(zzbxu object) {
        object = this.zzc.zza((zzbxu)object);
        zzbeg zzbeg2 = zzbep.zzfF;
        long l2 = ((Integer)zzba.zzc().zza(zzbeg2)).intValue();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return (zzebi)object.get(l2, timeUnit);
    }

    public final /* synthetic */ ListenableFuture zzb(zzbxu object, int n3, zzebh object2) {
        ListenableFuture listenableFuture = ((zzedq)this.zzd.zzb()).zzc((zzbxu)object, n3);
        object2 = new zzdze((zzbxu)object);
        object = this.zzb;
        return zzgft.zzn(listenableFuture, (zzgfa)object2, (Executor)object);
    }

    public final ListenableFuture zzc(zzbxu object) {
        Object object2;
        int n3;
        Object object3 = ((zzbxu)object).zzd;
        zzu.zzp();
        boolean bl2 = zzt.zzC((String)object3);
        if (bl2) {
            n3 = 1;
            object3 = new zzebh(n3);
            object3 = zzgft.zzg((Throwable)object3);
        } else {
            object3 = this.zza;
            Object object4 = new zzdzf(this, (zzbxu)object);
            object3 = object3.zzb((Callable)object4);
            object4 = new zzdzg();
            object2 = this.zzb;
            Class<ExecutionException> clazz = ExecutionException.class;
            object3 = zzgft.zzf((ListenableFuture)object3, clazz, (zzgfa)object4, (Executor)object2);
        }
        n3 = Binder.getCallingUid();
        object2 = new zzdzh(this, (zzbxu)object, n3);
        object = this.zzb;
        return zzgft.zzf((ListenableFuture)object3, zzebh.class, (zzgfa)object2, (Executor)object);
    }
}

