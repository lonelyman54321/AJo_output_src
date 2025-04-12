/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Binder
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbpy;
import com.google.android.gms.internal.ads.zzbpz;
import com.google.android.gms.internal.ads.zzbqa;
import com.google.android.gms.internal.ads.zzbqe;
import com.google.android.gms.internal.ads.zzbqh;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzeay;
import com.google.android.gms.internal.ads.zzebh;
import com.google.android.gms.internal.ads.zzebj;
import com.google.android.gms.internal.ads.zzebk;
import com.google.android.gms.internal.ads.zzebl;
import com.google.android.gms.internal.ads.zzebm;
import com.google.android.gms.internal.ads.zzebn;
import com.google.android.gms.internal.ads.zzebo;
import com.google.android.gms.internal.ads.zzebp;
import com.google.android.gms.internal.ads.zzebq;
import com.google.android.gms.internal.ads.zzebr;
import com.google.android.gms.internal.ads.zzebs;
import com.google.android.gms.internal.ads.zzebt;
import com.google.android.gms.internal.ads.zzedq;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgfk;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkj;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class zzebu {
    private final zzgge zza;
    private final zzeay zzb;
    private final zzhkj zzc;
    private final zzfmq zzd;
    private final Context zze;
    private final VersionInfoParcel zzf;

    public zzebu(zzgge zzgge2, zzeay zzeay2, zzhkj zzhkj2, zzfmq zzfmq2, Context context, VersionInfoParcel versionInfoParcel) {
        this.zza = zzgge2;
        this.zzb = zzeay2;
        this.zzc = zzhkj2;
        this.zzd = zzfmq2;
        this.zze = context;
        this.zzf = versionInfoParcel;
    }

    private final ListenableFuture zzh(zzbxu object, zzebt object2, zzebt zzebt2, zzgfa zzgfa2) {
        zzgge zzgge2;
        Object object3 = ((zzbxu)object).zzd;
        zzu.zzp();
        boolean n3 = zzt.zzC((String)object3);
        if (n3) {
            int n4 = 1;
            object2 = new zzebh(n4);
            object2 = zzgft.zzg((Throwable)object2);
        } else {
            object2 = object2.zza((zzbxu)object);
            object3 = new zzebs();
            zzgge2 = this.zza;
            Class<ExecutionException> clazz = ExecutionException.class;
            object2 = zzgft.zzf((ListenableFuture)object2, clazz, (zzgfa)object3, zzgge2);
        }
        object2 = zzgfk.zzu((ListenableFuture)object2);
        object3 = new zzebq();
        zzgge2 = this.zza;
        object2 = zzgft.zzn((ListenableFuture)object2, (zzgfa)object3, zzgge2);
        object3 = this.zza;
        object2 = zzgft.zzn((ListenableFuture)object2, zzgfa2, (Executor)object3);
        object3 = new zzebr(this, zzebt2, (zzbxu)object, zzgfa2);
        object = this.zza;
        return zzgft.zzf((ListenableFuture)object2, zzebh.class, (zzgfa)object3, (Executor)object);
    }

    public final ListenableFuture zza(zzbxu zzbxu2) {
        zzebn zzebn2 = new zzebn(zzbxu2);
        Object object = this.zzb;
        Objects.requireNonNull(object);
        zzebo zzebo2 = new zzebo((zzeay)object);
        object = new zzebp(this);
        return this.zzh(zzbxu2, zzebo2, (zzebt)object, zzebn2);
    }

    public final ListenableFuture zzb(JSONObject object) {
        Object object2 = zzu.zzf();
        Object object3 = this.zze;
        Object object4 = this.zzf;
        zzfmq zzfmq2 = this.zzd;
        object2 = ((zzbpy)object2).zza((Context)object3, (VersionInfoParcel)object4, zzfmq2);
        object3 = zzbqe.zza;
        object4 = new zzebj();
        object2 = ((zzbqh)object2).zza("AFMA_getAdDictionary", (zzbqa)object3, (zzbpz)object4);
        object = zzgfk.zzu(zzgft.zzh(object));
        object3 = this.zza;
        return zzgft.zzn((ListenableFuture)object, (zzgfa)object2, (Executor)object3);
    }

    public final /* synthetic */ ListenableFuture zzc(zzebt zzebt2, zzbxu zzbxu2, zzgfa zzgfa2, zzebh object) {
        object = this.zza;
        return zzgft.zzn(zzebt2.zza(zzbxu2), zzgfa2, (Executor)object);
    }

    public final /* synthetic */ ListenableFuture zzd(zzbxu zzbxu2) {
        zzedq zzedq2 = (zzedq)this.zzc.zzb();
        int n3 = Binder.getCallingUid();
        return zzedq2.zzb(zzbxu2, n3);
    }

    public final /* synthetic */ ListenableFuture zze(zzbxu object) {
        zzeay zzeay2 = this.zzb;
        object = ((zzbxu)object).zzh;
        return zzeay2.zzd((String)object);
    }

    public final /* synthetic */ ListenableFuture zzf(zzbxu object) {
        zzedq zzedq2 = (zzedq)this.zzc.zzb();
        object = ((zzbxu)object).zzh;
        return zzedq2.zzi((String)object);
    }

    public final ListenableFuture zzg(zzbxu zzbxu2) {
        zzebk zzebk2 = new zzebk();
        zzebl zzebl2 = new zzebl(this);
        zzebm zzebm2 = new zzebm(this);
        return this.zzh(zzbxu2, zzebl2, zzebm2, zzebk2);
    }
}

