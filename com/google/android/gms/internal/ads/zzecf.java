/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbwv;
import com.google.android.gms.internal.ads.zzebh;
import com.google.android.gms.internal.ads.zzecb;
import com.google.android.gms.internal.ads.zzecc;
import com.google.android.gms.internal.ads.zzecd;
import com.google.android.gms.internal.ads.zzece;
import com.google.android.gms.internal.ads.zzecx;
import com.google.android.gms.internal.ads.zzgez;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgfk;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public final class zzecf {
    private final zzgge zza;
    private final zzgge zzb;
    private final zzecx zzc;

    public zzecf(zzgge zzgge2, zzgge zzgge3, zzecx zzecx2) {
        this.zza = zzgge2;
        this.zzb = zzgge3;
        this.zzc = zzecx2;
    }

    public final /* synthetic */ ListenableFuture zza(zzbwv zzbwv2) {
        zzbeg zzbeg2 = zzbep.zzlC;
        long l2 = (Long)zzba.zzc().zza(zzbeg2);
        return this.zzc.zza(zzbwv2, l2);
    }

    public final ListenableFuture zzb(zzbwv object) {
        Object object2;
        Object object3 = ((zzbwv)object).zzb;
        zzu.zzp();
        boolean n3 = zzt.zzC((String)object3);
        if (n3) {
            int n4 = 1;
            object2 = "Ads signal service force local";
            object = new zzebh(n4, (String)object2);
            object = zzgft.zzg((Throwable)object);
        } else {
            object3 = new zzecb(this, (zzbwv)object);
            object = this.zza;
            object = zzgft.zzk((zzgez)object3, (Executor)object);
            object3 = new zzecc();
            object2 = this.zzb;
            Class<ExecutionException> clazz = ExecutionException.class;
            object = zzgft.zzf((ListenableFuture)object, clazz, (zzgfa)object3, (Executor)object2);
        }
        object = zzgfk.zzu((ListenableFuture)object);
        object3 = new zzecd();
        object2 = this.zzb;
        object = zzgft.zzf((ListenableFuture)object, zzebh.class, (zzgfa)object3, (Executor)object2);
        object3 = new zzece();
        object2 = this.zzb;
        return zzgft.zzn((ListenableFuture)object, (zzgfa)object3, (Executor)object2);
    }
}

