/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.util.Pair
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.widget.FrameLayout
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbfk;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzbgq;
import com.google.android.gms.internal.ads.zzcjd;
import com.google.android.gms.internal.ads.zzcsc;
import com.google.android.gms.internal.ads.zzctg;
import com.google.android.gms.internal.ads.zzcuh;
import com.google.android.gms.internal.ads.zzcvx;
import com.google.android.gms.internal.ads.zzcyt;
import com.google.android.gms.internal.ads.zzcyv;
import com.google.android.gms.internal.ads.zzczl;
import com.google.android.gms.internal.ads.zzczo;
import com.google.android.gms.internal.ads.zzdaf;
import com.google.android.gms.internal.ads.zzdaz;
import com.google.android.gms.internal.ads.zzdbw;
import com.google.android.gms.internal.ads.zzdca;
import com.google.android.gms.internal.ads.zzdcb;
import com.google.android.gms.internal.ads.zzdcg;
import com.google.android.gms.internal.ads.zzdeh;
import com.google.android.gms.internal.ads.zzdfa;
import com.google.android.gms.internal.ads.zzdfc;
import com.google.android.gms.internal.ads.zzdhi;
import com.google.android.gms.internal.ads.zzdjy;
import com.google.android.gms.internal.ads.zzdme;
import com.google.android.gms.internal.ads.zzdul;
import com.google.android.gms.internal.ads.zzdun;
import com.google.android.gms.internal.ads.zzdya;
import com.google.android.gms.internal.ads.zzenl;
import com.google.android.gms.internal.ads.zzepc;
import com.google.android.gms.internal.ads.zzepg;
import com.google.android.gms.internal.ads.zzepq;
import com.google.android.gms.internal.ads.zzepr;
import com.google.android.gms.internal.ads.zzeps;
import com.google.android.gms.internal.ads.zzfdb;
import com.google.android.gms.internal.ads.zzfde;
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

public final class zzfdf
implements zzeps {
    private final Context zza;
    private final Executor zzb;
    private final zzcjd zzc;
    private final zzepc zzd;
    private final zzepg zze;
    private final ViewGroup zzf;
    private zzbfk zzg;
    private final zzdca zzh;
    private final zzfmq zzi;
    private final zzdeh zzj;
    private final zzfhm zzk;
    private ListenableFuture zzl;

    public zzfdf(Context context, Executor object, zzq zzq2, zzcjd zzcjd2, zzepc zzepc2, zzepg zzepg2, zzfhm zzfhm2, zzdeh zzdeh2) {
        this.zza = context;
        this.zzb = object;
        this.zzc = zzcjd2;
        this.zzd = zzepc2;
        this.zze = zzepg2;
        this.zzk = zzfhm2;
        this.zzh = object = zzcjd2.zzf();
        this.zzi = object = zzcjd2.zzz();
        object = new FrameLayout(context);
        this.zzf = object;
        this.zzj = zzdeh2;
        zzfhm2.zzs(zzq2);
    }

    public static /* bridge */ /* synthetic */ ViewGroup zzc(zzfdf zzfdf2) {
        return zzfdf2.zzf;
    }

    public static /* bridge */ /* synthetic */ zzdca zze(zzfdf zzfdf2) {
        return zzfdf2.zzh;
    }

    public static /* bridge */ /* synthetic */ zzdeh zzf(zzfdf zzfdf2) {
        return zzfdf2.zzj;
    }

    public static /* bridge */ /* synthetic */ zzepc zzg(zzfdf zzfdf2) {
        return zzfdf2.zzd;
    }

    public static /* bridge */ /* synthetic */ zzepg zzh(zzfdf zzfdf2) {
        return zzfdf2.zze;
    }

    public static /* bridge */ /* synthetic */ zzfmq zzj(zzfdf zzfdf2) {
        return zzfdf2.zzi;
    }

    public static /* bridge */ /* synthetic */ Executor zzk(zzfdf zzfdf2) {
        return zzfdf2.zzb;
    }

    public static /* bridge */ /* synthetic */ void zzl(zzfdf zzfdf2, ListenableFuture listenableFuture) {
        zzfdf2.zzl = null;
    }

    public final boolean zza() {
        boolean bl2;
        ListenableFuture listenableFuture = this.zzl;
        return listenableFuture != null && !(bl2 = listenableFuture.isDone());
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean zzb(zzl object, String object2, zzepq zzepq2, zzepr object3) {
        Object object4;
        boolean bl2 = true;
        Object object5 = null;
        if (object2 == null) {
            zzm.zzg("Ad unit ID should not be null for banner ad.");
            object = this.zzb;
            object2 = new zzfdb(this);
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
        object6 = zzdun.zza(pairArray);
        object7 = this.zzk;
        ((zzfhm)object7).zzt((String)object2);
        ((zzfhm)object7).zzH((zzl)object);
        ((zzfhm)object7).zzA((Bundle)object6);
        object2 = this.zza;
        object6 = ((zzfhm)object7).zzJ();
        object7 = zzfmm.zza((zzfho)object6);
        zzfmw zzfmw2 = zzfmw.zzb;
        zzfmc zzfmc2 = zzfmb.zzb((Context)object2, (zzfmu)object7, zzfmw2, (zzl)object);
        object2 = (Boolean)zzbgq.zze.zze();
        int n4 = ((Boolean)object2).booleanValue();
        object7 = null;
        if (n4 != 0) {
            object2 = this.zzk.zzh();
            n4 = ((zzq)object2).zzk;
            if (n4 != 0) {
                object = this.zzd;
                if (object == null) return false;
                n4 = 7;
                object2 = zzfiq.zzd(n4, null, null);
                ((zzepc)object).zzdB((zze)object2);
                return false;
            }
        }
        object2 = zzbep.zzik;
        object5 = zzba.zzc();
        object2 = (Boolean)((zzben)object5).zza((zzbeg)object2);
        n4 = ((Boolean)object2).booleanValue();
        if (n4 != 0) {
            object2 = this.zzc.zze();
            object5 = new zzcyt();
            object8 = this.zza;
            ((zzcyt)object5).zze((Context)object8);
            ((zzcyt)object5).zzi((zzfho)object6);
            object5 = ((zzcyt)object5).zzj();
            object2.zzi((zzcyv)object5);
            object5 = new zzdfa();
            object6 = this.zzd;
            object8 = this.zzb;
            ((zzdfa)object5).zzj((zzdcg)object6, (Executor)object8);
            object6 = this.zzd;
            object8 = this.zzb;
            ((zzdfa)object5).zzk((AppEventListener)object6, (Executor)object8);
            object5 = ((zzdfa)object5).zzn();
            object2.zzf((zzdfc)object5);
            object6 = this.zzg;
            object5 = new zzenl((zzbfk)object6);
            object2.zze((zzenl)object5);
            object6 = zzdme.zza;
            object5 = new zzdjy((zzdme)object6, null);
            object2.zzd((zzdjy)object5);
            object5 = this.zzh;
            object6 = this.zzj;
            object8 = new zzcuh((zzdca)object5, (zzdeh)object6);
            object2.zzg((zzcuh)object8);
            object5 = this.zzf;
            object6 = new zzcsc((ViewGroup)object5);
            object2.zzc((zzcsc)object6);
            object2 = object2.zzk();
        } else {
            object2 = this.zzc.zze();
            object5 = new zzcyt();
            object8 = this.zza;
            ((zzcyt)object5).zze((Context)object8);
            ((zzcyt)object5).zzi((zzfho)object6);
            object5 = ((zzcyt)object5).zzj();
            object2.zzi((zzcyv)object5);
            object5 = new zzdfa();
            object6 = this.zzd;
            object8 = this.zzb;
            ((zzdfa)object5).zzj((zzdcg)object6, (Executor)object8);
            object6 = this.zzd;
            object8 = this.zzb;
            ((zzdfa)object5).zza((zza)object6, (Executor)object8);
            object6 = this.zze;
            object8 = this.zzb;
            ((zzdfa)object5).zza((zza)object6, (Executor)object8);
            object6 = this.zzd;
            object8 = this.zzb;
            ((zzdfa)object5).zzl((zzdhi)object6, (Executor)object8);
            object6 = this.zzd;
            object8 = this.zzb;
            ((zzdfa)object5).zzd((zzdaf)object6, (Executor)object8);
            object6 = this.zzd;
            object8 = this.zzb;
            ((zzdfa)object5).zze((zzczl)object6, (Executor)object8);
            object6 = this.zzd;
            object8 = this.zzb;
            ((zzdfa)object5).zzf((zzdaz)object6, (Executor)object8);
            object6 = this.zzd;
            object8 = this.zzb;
            ((zzdfa)object5).zzb((zzczo)object6, (Executor)object8);
            object6 = this.zzd;
            object8 = this.zzb;
            ((zzdfa)object5).zzk((AppEventListener)object6, (Executor)object8);
            object6 = this.zzd;
            object8 = this.zzb;
            ((zzdfa)object5).zzi((zzdbw)object6, (Executor)object8);
            object5 = ((zzdfa)object5).zzn();
            object2.zzf((zzdfc)object5);
            object6 = this.zzg;
            object5 = new zzenl((zzbfk)object6);
            object2.zze((zzenl)object5);
            object6 = zzdme.zza;
            object5 = new zzdjy((zzdme)object6, null);
            object2.zzd((zzdjy)object5);
            object5 = this.zzh;
            object6 = this.zzj;
            object8 = new zzcuh((zzdca)object5, (zzdeh)object6);
            object2.zzg((zzcuh)object8);
            object5 = this.zzf;
            object6 = new zzcsc((ViewGroup)object5);
            object2.zzc((zzcsc)object6);
            object2 = object2.zzk();
        }
        Object object9 = object2;
        object2 = (Boolean)zzbgd.zzc.zze();
        n4 = (int)(((Boolean)object2).booleanValue() ? 1 : 0);
        if (n4 != 0) {
            object2 = ((zzctg)object9).zzj();
            ((zzfmn)object2).zzd(zzfmw2);
            object5 = ((zzl)object).zzp;
            ((zzfmn)object2).zzb((String)object5);
            object = ((zzl)object).zzm;
            ((zzfmn)object2).zzg((Bundle)object);
            object4 = object2;
        } else {
            object4 = null;
        }
        object = ((zzctg)object9).zzd();
        object2 = ((zzcvx)object).zzj();
        this.zzl = object = ((zzcvx)object).zzi((ListenableFuture)object2);
        object8 = object2;
        object2 = new zzfde(this, (zzepr)object3, (zzfmn)object4, zzfmc2, (zzctg)object9);
        object3 = this.zzb;
        zzgft.zzr((ListenableFuture)object, (zzgfp)object2, (Executor)object3);
        return bl2;
    }

    public final ViewGroup zzd() {
        return this.zzf;
    }

    public final zzfhm zzi() {
        return this.zzk;
    }

    public final /* synthetic */ void zzm() {
        zzepc zzepc2 = this.zzd;
        zze zze2 = zzfiq.zzd(6, null, null);
        zzepc2.zzdB(zze2);
    }

    public final void zzn() {
        zzdeh zzdeh2 = this.zzj;
        zzdca zzdca2 = this.zzh;
        int n3 = zzdeh2.zzc();
        zzdca2.zzd(n3);
    }

    public final void zzo(zzbe zzbe2) {
        this.zze.zza(zzbe2);
    }

    public final void zzp(zzdcb zzdcb2) {
        Executor executor = this.zzb;
        this.zzh.zzo(zzdcb2, executor);
    }

    public final void zzq(zzbfk zzbfk2) {
        this.zzg = zzbfk2;
    }

    public final boolean zzr() {
        ViewParent viewParent = this.zzf.getParent();
        boolean bl2 = viewParent instanceof View;
        if (!bl2) {
            return false;
        }
        viewParent = (View)viewParent;
        zzu.zzp();
        Context context = viewParent.getContext();
        return zzt.zzW((View)viewParent, context);
    }
}

