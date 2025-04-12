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
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbfk;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzcjd;
import com.google.android.gms.internal.ads.zzcvx;
import com.google.android.gms.internal.ads.zzcyt;
import com.google.android.gms.internal.ads.zzcyv;
import com.google.android.gms.internal.ads.zzczl;
import com.google.android.gms.internal.ads.zzczo;
import com.google.android.gms.internal.ads.zzdab;
import com.google.android.gms.internal.ads.zzdaz;
import com.google.android.gms.internal.ads.zzdbw;
import com.google.android.gms.internal.ads.zzdcg;
import com.google.android.gms.internal.ads.zzdfa;
import com.google.android.gms.internal.ads.zzdfc;
import com.google.android.gms.internal.ads.zzdhi;
import com.google.android.gms.internal.ads.zzdjh;
import com.google.android.gms.internal.ads.zzdul;
import com.google.android.gms.internal.ads.zzdun;
import com.google.android.gms.internal.ads.zzdya;
import com.google.android.gms.internal.ads.zzenl;
import com.google.android.gms.internal.ads.zzepc;
import com.google.android.gms.internal.ads.zzepq;
import com.google.android.gms.internal.ads.zzepr;
import com.google.android.gms.internal.ads.zzeps;
import com.google.android.gms.internal.ads.zzfep;
import com.google.android.gms.internal.ads.zzfeq;
import com.google.android.gms.internal.ads.zzfev;
import com.google.android.gms.internal.ads.zzffw;
import com.google.android.gms.internal.ads.zzfhm;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfiq;
import com.google.android.gms.internal.ads.zzfmb;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmm;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzfmw;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

public final class zzfew
implements zzeps {
    private final Context zza;
    private final Executor zzb;
    private final zzcjd zzc;
    private final zzepc zzd;
    private final zzffw zze;
    private zzbfk zzf;
    private final zzfmq zzg;
    private final zzfhm zzh;
    private ListenableFuture zzi;

    public zzfew(Context object, Executor executor, zzcjd zzcjd2, zzepc zzepc2, zzffw zzffw2, zzfhm zzfhm2) {
        this.zza = object;
        this.zzb = executor;
        this.zzc = zzcjd2;
        this.zzd = zzepc2;
        this.zzh = zzfhm2;
        this.zze = zzffw2;
        object = zzcjd2.zzz();
        this.zzg = object;
    }

    public static /* bridge */ /* synthetic */ zzepc zzc(zzfew zzfew2) {
        return zzfew2.zzd;
    }

    public static /* bridge */ /* synthetic */ zzffw zzd(zzfew zzfew2) {
        return zzfew2.zze;
    }

    public static /* bridge */ /* synthetic */ zzfmq zze(zzfew zzfew2) {
        return zzfew2.zzg;
    }

    public static /* bridge */ /* synthetic */ Executor zzf(zzfew zzfew2) {
        return zzfew2.zzb;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzfew zzfew2, ListenableFuture listenableFuture) {
        zzfew2.zzi = null;
    }

    public final boolean zza() {
        boolean bl2;
        ListenableFuture listenableFuture = this.zzi;
        return listenableFuture != null && !(bl2 = listenableFuture.isDone());
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean zzb(zzl object, String object2, zzepq object3, zzepr zzepr2) {
        Object object4;
        boolean bl2 = true;
        Object object5 = null;
        if (object2 == null) {
            zzm.zzg("Ad unit ID should not be null for interstitial ad.");
            object = this.zzb;
            object2 = new zzfeq(this);
            object.execute((Runnable)object2);
            return false;
        }
        boolean bl3 = this.zza();
        if (bl3) {
            return false;
        }
        Object object6 = zzbep.zziU;
        Object object7 = zzba.zzc();
        object6 = (Boolean)((zzben)object7).zza((zzbeg)object6);
        bl3 = (Boolean)object6;
        if (bl3 && (bl3 = ((zzl)object).zzf)) {
            object6 = this.zzc.zzl();
            ((zzdya)object6).zzo(bl2);
        }
        object3 = ((zzfep)object3).zza;
        object7 = zzdul.zza.zza();
        long l2 = ((zzl)object).zzz;
        Long l3 = l2;
        object6 = new Pair(object7, (Object)l3);
        String string2 = zzdul.zzb.zza();
        long l4 = zzu.zzB().currentTimeMillis();
        Object object8 = l4;
        object7 = new Pair((Object)string2, object8);
        int n3 = 2;
        Pair[] pairArray = new Pair[n3];
        pairArray[0] = object6;
        pairArray[bl2] = object7;
        object5 = zzdun.zza(pairArray);
        object6 = this.zzh;
        ((zzfhm)object6).zzt((String)object2);
        ((zzfhm)object6).zzs((zzq)object3);
        ((zzfhm)object6).zzH((zzl)object);
        ((zzfhm)object6).zzA((Bundle)object5);
        object2 = this.zza;
        object3 = ((zzfhm)object6).zzJ();
        object5 = zzfmm.zza((zzfho)object3);
        object6 = zzfmw.zzc;
        zzfmc zzfmc2 = zzfmb.zzb((Context)object2, (zzfmu)object5, (zzfmw)object6, (zzl)object);
        object2 = zzbep.zzim;
        object5 = zzba.zzc();
        object2 = (Boolean)((zzben)object5).zza((zzbeg)object2);
        boolean bl4 = (Boolean)object2;
        if (bl4) {
            object2 = this.zzc.zzg();
            object5 = new zzcyt();
            object7 = this.zza;
            ((zzcyt)object5).zze((Context)object7);
            ((zzcyt)object5).zzi((zzfho)object3);
            object3 = ((zzcyt)object5).zzj();
            object2.zze((zzcyv)object3);
            object3 = new zzdfa();
            object5 = this.zzd;
            object7 = this.zzb;
            ((zzdfa)object3).zzj((zzdcg)object5, (Executor)object7);
            object5 = this.zzd;
            object7 = this.zzb;
            ((zzdfa)object3).zzk((AppEventListener)object5, (Executor)object7);
            object3 = ((zzdfa)object3).zzn();
            object2.zzd((zzdfc)object3);
            object5 = this.zzf;
            object3 = new zzenl((zzbfk)object5);
            object2.zzc((zzenl)object3);
            object2 = object2.zzf();
        } else {
            object2 = new zzdfa();
            object5 = this.zze;
            if (object5 != null) {
                object7 = this.zzb;
                ((zzdfa)object2).zze((zzczl)object5, (Executor)object7);
                object5 = this.zze;
                object7 = this.zzb;
                ((zzdfa)object2).zzf((zzdaz)object5, (Executor)object7);
                object5 = this.zze;
                object7 = this.zzb;
                ((zzdfa)object2).zzb((zzczo)object5, (Executor)object7);
            }
            object5 = this.zzc.zzg();
            object7 = new zzcyt();
            Context context = this.zza;
            ((zzcyt)object7).zze(context);
            ((zzcyt)object7).zzi((zzfho)object3);
            object3 = ((zzcyt)object7).zzj();
            object5.zze((zzcyv)object3);
            object3 = this.zzd;
            object7 = this.zzb;
            ((zzdfa)object2).zzj((zzdcg)object3, (Executor)object7);
            object3 = this.zzd;
            object7 = this.zzb;
            ((zzdfa)object2).zze((zzczl)object3, (Executor)object7);
            object3 = this.zzd;
            object7 = this.zzb;
            ((zzdfa)object2).zzf((zzdaz)object3, (Executor)object7);
            object3 = this.zzd;
            object7 = this.zzb;
            ((zzdfa)object2).zzb((zzczo)object3, (Executor)object7);
            object3 = this.zzd;
            object7 = this.zzb;
            ((zzdfa)object2).zza((zza)object3, (Executor)object7);
            object3 = this.zzd;
            object7 = this.zzb;
            ((zzdfa)object2).zzl((zzdhi)object3, (Executor)object7);
            object3 = this.zzd;
            object7 = this.zzb;
            ((zzdfa)object2).zzk((AppEventListener)object3, (Executor)object7);
            object3 = this.zzd;
            object7 = this.zzb;
            ((zzdfa)object2).zzi((zzdbw)object3, (Executor)object7);
            object3 = this.zzd;
            object7 = this.zzb;
            ((zzdfa)object2).zzc((zzdab)object3, (Executor)object7);
            object2 = ((zzdfa)object2).zzn();
            object5.zzd((zzdfc)object2);
            object3 = this.zzf;
            object2 = new zzenl((zzbfk)object3);
            object5.zzc((zzenl)object2);
            object2 = object5.zzf();
        }
        Object object9 = object2;
        object2 = (Boolean)zzbgd.zzc.zze();
        bl4 = (Boolean)object2;
        if (bl4) {
            object2 = ((zzdjh)object9).zzf();
            ((zzfmn)object2).zzd((zzfmw)object6);
            object3 = ((zzl)object).zzp;
            ((zzfmn)object2).zzb((String)object3);
            object = ((zzl)object).zzm;
            ((zzfmn)object2).zzg((Bundle)object);
            object4 = object2;
        } else {
            object = null;
            object4 = null;
        }
        object = ((zzdjh)object9).zza();
        object2 = ((zzcvx)object).zzj();
        this.zzi = object = ((zzcvx)object).zzi((ListenableFuture)object2);
        object7 = object2;
        zzfew zzfew2 = this;
        object8 = zzepr2;
        object2 = new zzfev(this, zzepr2, (zzfmn)object4, zzfmc2, (zzdjh)object9);
        object3 = this.zzb;
        zzgft.zzr((ListenableFuture)object, (zzgfp)object2, (Executor)object3);
        return bl2;
    }

    public final /* synthetic */ void zzh() {
        zzepc zzepc2 = this.zzd;
        zze zze2 = zzfiq.zzd(6, null, null);
        zzepc2.zzdB(zze2);
    }

    public final void zzi(zzbfk zzbfk2) {
        this.zzf = zzbfk2;
    }
}

