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
import com.google.android.gms.internal.ads.zzbwz;
import com.google.android.gms.internal.ads.zzebh;
import com.google.android.gms.internal.ads.zzebw;
import com.google.android.gms.internal.ads.zzebx;
import com.google.android.gms.internal.ads.zzeby;
import com.google.android.gms.internal.ads.zzecu;
import com.google.android.gms.internal.ads.zzeea;
import com.google.android.gms.internal.ads.zzgez;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkj;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public final class zzebz {
    private final zzgge zza;
    private final zzgge zzb;
    private final zzecu zzc;
    private final zzhkj zzd;

    public zzebz(zzgge zzgge2, zzgge zzgge3, zzecu zzecu2, zzhkj zzhkj2) {
        this.zza = zzgge2;
        this.zzb = zzgge3;
        this.zzc = zzecu2;
        this.zzd = zzhkj2;
    }

    public final /* synthetic */ ListenableFuture zza(zzbwz zzbwz2) {
        zzbeg zzbeg2 = zzbep.zzlD;
        long l2 = (Long)zzba.zzc().zza(zzbeg2);
        return this.zzc.zza(zzbwz2, l2);
    }

    public final /* synthetic */ ListenableFuture zzb(zzbwz zzbwz2, int n3, zzebh zzebh2) {
        return ((zzeea)this.zzd.zzb()).zzb(zzbwz2, n3);
    }

    public final ListenableFuture zzc(zzbwz object) {
        Object object2;
        int n3;
        Object object3 = ((zzbwz)object).zzf;
        zzu.zzp();
        boolean bl2 = zzt.zzC((String)object3);
        if (bl2) {
            n3 = 1;
            object2 = "Ads service proxy force local";
            object3 = new zzebh(n3, (String)object2);
            object3 = zzgft.zzg((Throwable)object3);
        } else {
            object3 = new zzebw(this, (zzbwz)object);
            Object object4 = this.zza;
            object3 = zzgft.zzk((zzgez)object3, (Executor)object4);
            object4 = new zzebx();
            object2 = this.zzb;
            Class<ExecutionException> clazz = ExecutionException.class;
            object3 = zzgft.zzf((ListenableFuture)object3, clazz, (zzgfa)object4, (Executor)object2);
        }
        n3 = Binder.getCallingUid();
        object2 = new zzeby(this, (zzbwz)object, n3);
        object = this.zzb;
        return zzgft.zzf((ListenableFuture)object3, zzebh.class, (zzgfa)object2, (Executor)object);
    }
}

