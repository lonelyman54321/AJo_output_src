/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.util.Pair
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcjd;
import com.google.android.gms.internal.ads.zzcsc;
import com.google.android.gms.internal.ads.zzcve;
import com.google.android.gms.internal.ads.zzcvx;
import com.google.android.gms.internal.ads.zzcyt;
import com.google.android.gms.internal.ads.zzcyv;
import com.google.android.gms.internal.ads.zzczo;
import com.google.android.gms.internal.ads.zzdfa;
import com.google.android.gms.internal.ads.zzdfc;
import com.google.android.gms.internal.ads.zzdjy;
import com.google.android.gms.internal.ads.zzdkd;
import com.google.android.gms.internal.ads.zzdul;
import com.google.android.gms.internal.ads.zzdun;
import com.google.android.gms.internal.ads.zzdya;
import com.google.android.gms.internal.ads.zzepc;
import com.google.android.gms.internal.ads.zzepp;
import com.google.android.gms.internal.ads.zzepq;
import com.google.android.gms.internal.ads.zzepr;
import com.google.android.gms.internal.ads.zzeps;
import com.google.android.gms.internal.ads.zzept;
import com.google.android.gms.internal.ads.zzepu;
import com.google.android.gms.internal.ads.zzepv;
import com.google.android.gms.internal.ads.zzepy;
import com.google.android.gms.internal.ads.zzfhm;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfil;
import com.google.android.gms.internal.ads.zzfiq;
import com.google.android.gms.internal.ads.zzfmb;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmm;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzfmw;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class zzepz
implements zzeps {
    private final zzfhm zza;
    private final zzcjd zzb;
    private final Context zzc;
    private final zzepp zzd;
    private final zzfmq zze;
    private zzcve zzf;

    public zzepz(zzcjd object, Context context, zzepp zzepp2, zzfhm zzfhm2) {
        this.zzb = object;
        this.zzc = context;
        this.zzd = zzepp2;
        this.zza = zzfhm2;
        this.zze = object = ((zzcjd)object).zzz();
        object = zzepp2.zzd();
        zzfhm2.zzv((zzepc)object);
    }

    public static /* bridge */ /* synthetic */ zzcjd zzc(zzepz zzepz2) {
        return zzepz2.zzb;
    }

    public static /* bridge */ /* synthetic */ zzepp zzd(zzepz zzepz2) {
        return zzepz2.zzd;
    }

    public static /* bridge */ /* synthetic */ zzfmq zze(zzepz zzepz2) {
        return zzepz2.zze;
    }

    public final boolean zza() {
        boolean bl2;
        zzcve zzcve2 = this.zzf;
        return zzcve2 != null && (bl2 = zzcve2.zzf());
    }

    public final boolean zzb(zzl object, String object2, zzepq object3, zzepr zzepr2) {
        Object object4;
        boolean bl2;
        boolean bl22 = true;
        zzu.zzp();
        Object object5 = this.zzc;
        boolean bl3 = zzt.zzH((Context)object5);
        Object object6 = null;
        if (bl3 && (object5 = ((zzl)object).zzs) == null) {
            zzm.zzg("Failed to load the ad because app ID is missing.");
            object = this.zzb.zzB();
            object2 = new zzepu(this);
            object.execute((Runnable)object2);
            return false;
        }
        if (object2 == null) {
            zzm.zzg("Ad unit ID should not be null for NativeAdLoader.");
            object = this.zzb.zzB();
            object2 = new zzepv(this);
            object.execute((Runnable)object2);
            return false;
        }
        object2 = this.zzc;
        bl3 = ((zzl)object).zzf;
        zzfil.zza((Context)object2, bl3);
        object2 = zzbep.zziU;
        object5 = zzba.zzc();
        object2 = (Boolean)((zzben)object5).zza((zzbeg)object2);
        boolean n3 = (Boolean)object2;
        if (n3 && (bl2 = ((zzl)object).zzf)) {
            object2 = this.zzb.zzl();
            ((zzdya)object2).zzo(bl22);
        }
        int n4 = ((zzept)object3).zza;
        object5 = zzdul.zza.zza();
        long l2 = ((zzl)object).zzz;
        Object object7 = l2;
        object3 = new Pair(object5, object7);
        object7 = zzdul.zzb.zza();
        long l3 = zzu.zzB().currentTimeMillis();
        Object object8 = l3;
        object5 = new Pair(object7, object8);
        int n7 = 2;
        object7 = new Pair[n7];
        object7[0] = object3;
        object7[bl22] = object5;
        object3 = zzdun.zza((Pair[])object7);
        object5 = this.zza;
        ((zzfhm)object5).zzH((zzl)object);
        ((zzfhm)object5).zzA((Bundle)object3);
        ((zzfhm)object5).zzC(n4);
        object2 = this.zzc;
        object3 = ((zzfhm)object5).zzJ();
        object5 = zzfmm.zza((zzfho)object3);
        object6 = zzfmw.zzg;
        zzfmc zzfmc2 = zzfmb.zzb((Context)object2, (zzfmu)object5, (zzfmw)object6, (zzl)object);
        object2 = ((zzfho)object3).zzn;
        if (object2 != null) {
            object5 = this.zzd.zzd();
            ((zzepc)object5).zzm((zzcb)object2);
        }
        object2 = this.zzb.zzh();
        object5 = new zzcyt();
        object7 = this.zzc;
        ((zzcyt)object5).zze((Context)object7);
        ((zzcyt)object5).zzi((zzfho)object3);
        object3 = ((zzcyt)object5).zzj();
        object2.zzf((zzcyv)object3);
        object3 = new zzdfa();
        object5 = this.zzd;
        object7 = this.zzb;
        object5 = ((zzepp)object5).zzd();
        object7 = ((zzcjd)object7).zzB();
        ((zzdfa)object3).zzk((AppEventListener)object5, (Executor)object7);
        object3 = ((zzdfa)object3).zzn();
        object2.zze((zzdfc)object3);
        object3 = this.zzd.zzc();
        object2.zzd((zzdjy)object3);
        bl3 = false;
        object5 = null;
        object3 = new zzcsc(null);
        object2.zzc((zzcsc)object3);
        zzdkd zzdkd2 = object2.zzg();
        object2 = (Boolean)zzbgd.zzc.zze();
        boolean bl4 = (Boolean)object2;
        if (bl4) {
            object2 = zzdkd2.zzf();
            ((zzfmn)object2).zzd((zzfmw)object6);
            object3 = ((zzl)object).zzp;
            ((zzfmn)object2).zzb((String)object3);
            object = ((zzl)object).zzm;
            ((zzfmn)object2).zzg((Bundle)object);
            object4 = object2;
        } else {
            object4 = null;
        }
        this.zzb.zzy().zzc((int)(bl22 ? 1 : 0));
        object2 = zzcci.zza;
        zzhkx.zzb(object2);
        object3 = this.zzb.zzC();
        object5 = zzdkd2.zza();
        object6 = ((zzcvx)object5).zzj();
        object5 = ((zzcvx)object5).zzi((ListenableFuture)object6);
        this.zzf = object = new zzcve((Executor)object2, (ScheduledExecutorService)object3, (ListenableFuture)object5);
        object7 = object2;
        object8 = this;
        object2 = new zzepy(this, zzepr2, (zzfmn)object4, zzfmc2, zzdkd2);
        ((zzcve)object).zze((zzgfp)object2);
        return bl22;
    }

    public final /* synthetic */ void zzf() {
        zzczo zzczo2 = this.zzd.zza();
        zze zze2 = zzfiq.zzd(4, null, null);
        zzczo2.zzdB(zze2);
    }

    public final /* synthetic */ void zzg() {
        zzczo zzczo2 = this.zzd.zza();
        zze zze2 = zzfiq.zzd(6, null, null);
        zzczo2.zzdB(zze2);
    }
}

