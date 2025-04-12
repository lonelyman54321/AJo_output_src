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
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzbyo;
import com.google.android.gms.internal.ads.zzcjd;
import com.google.android.gms.internal.ads.zzcyt;
import com.google.android.gms.internal.ads.zzcyv;
import com.google.android.gms.internal.ads.zzdfa;
import com.google.android.gms.internal.ads.zzdfc;
import com.google.android.gms.internal.ads.zzdrl;
import com.google.android.gms.internal.ads.zzdrm;
import com.google.android.gms.internal.ads.zzdul;
import com.google.android.gms.internal.ads.zzdun;
import com.google.android.gms.internal.ads.zzdya;
import com.google.android.gms.internal.ads.zzepq;
import com.google.android.gms.internal.ads.zzepr;
import com.google.android.gms.internal.ads.zzeps;
import com.google.android.gms.internal.ads.zzfei;
import com.google.android.gms.internal.ads.zzfej;
import com.google.android.gms.internal.ads.zzfek;
import com.google.android.gms.internal.ads.zzfel;
import com.google.android.gms.internal.ads.zzffw;
import com.google.android.gms.internal.ads.zzffz;
import com.google.android.gms.internal.ads.zzfga;
import com.google.android.gms.internal.ads.zzfgd;
import com.google.android.gms.internal.ads.zzfgf;
import com.google.android.gms.internal.ads.zzfhg;
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
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

public final class zzfgg
implements zzeps {
    private final Context zza;
    private final Executor zzb;
    private final zzcjd zzc;
    private final zzffw zzd;
    private final zzfek zze;
    private final zzfhg zzf;
    private final zzfmq zzg;
    private final zzfhm zzh;
    private ListenableFuture zzi;

    public zzfgg(Context object, Executor executor, zzcjd zzcjd2, zzfek zzfek2, zzffw zzffw2, zzfhm zzfhm2, zzfhg zzfhg2) {
        this.zza = object;
        this.zzb = executor;
        this.zzc = zzcjd2;
        this.zze = zzfek2;
        this.zzd = zzffw2;
        this.zzh = zzfhm2;
        this.zzf = zzfhg2;
        object = zzcjd2.zzz();
        this.zzg = object;
    }

    public static /* synthetic */ zzdrl zzc(zzfgg zzfgg2, zzfei zzfei2) {
        return zzfgg2.zzk(zzfei2);
    }

    public static /* bridge */ /* synthetic */ zzdrl zzd(zzfgg zzfgg2, zzfei zzfei2) {
        return zzfgg2.zzk(zzfei2);
    }

    public static /* bridge */ /* synthetic */ zzfek zze(zzfgg zzfgg2) {
        return zzfgg2.zze;
    }

    public static /* bridge */ /* synthetic */ zzffw zzf(zzfgg zzfgg2) {
        return zzfgg2.zzd;
    }

    public static /* bridge */ /* synthetic */ zzfmq zzg(zzfgg zzfgg2) {
        return zzfgg2.zzg;
    }

    public static /* bridge */ /* synthetic */ Executor zzh(zzfgg zzfgg2) {
        return zzfgg2.zzb;
    }

    private final zzdrl zzk(zzfei object) {
        object = (zzfgf)object;
        zzdrl zzdrl2 = this.zzc.zzi();
        zzcyt zzcyt2 = new zzcyt();
        Context context = this.zza;
        zzcyt2.zze(context);
        object = ((zzfgf)object).zza;
        zzcyt2.zzi((zzfho)object);
        object = this.zzf;
        zzcyt2.zzh((zzfhg)object);
        object = zzcyt2.zzj();
        zzdrl2.zzd((zzcyv)object);
        object = new zzdfa();
        object = ((zzdfa)object).zzn();
        zzdrl2.zzc((zzdfc)object);
        return zzdrl2;
    }

    public final boolean zza() {
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean zzb(zzl object, String object2, zzepq object3, zzepr object4) {
        Object object5;
        Object object6;
        boolean bl2;
        int n3 = 1;
        Object object7 = new zzbyo((zzl)object, (String)object2);
        object = ((zzbyo)object7).zzb;
        object2 = null;
        if (object == null) {
            zzm.zzg("Ad unit ID should not be null for rewarded video ad.");
            object = this.zzb;
            object3 = new zzffz(this);
            object.execute((Runnable)object3);
            return 0 != 0;
        }
        object = this.zzi;
        if (object != null && !(bl2 = object.isDone())) {
            return 0 != 0;
        }
        object = (Boolean)zzbgd.zzc.zze();
        bl2 = (Boolean)object;
        if (bl2 && (object6 = (object = this.zze).zzd()) != null) {
            object = ((zzdrm)object.zzd()).zzh();
            object6 = zzfmw.zzd;
            ((zzfmn)object).zzd((zzfmw)object6);
            object6 = ((zzbyo)object7).zza.zzp;
            ((zzfmn)object).zzb((String)object6);
            object6 = ((zzbyo)object7).zza.zzm;
            ((zzfmn)object).zzg((Bundle)object6);
            object5 = object;
        } else {
            object5 = null;
        }
        object = this.zza;
        boolean bl3 = ((zzbyo)object7).zza.zzf;
        zzfil.zza((Context)object, bl3);
        object = zzbep.zziU;
        object6 = zzba.zzc();
        object = (Boolean)((zzben)object6).zza((zzbeg)object);
        bl2 = (Boolean)object;
        if (bl2) {
            object = ((zzbyo)object7).zza;
            bl2 = ((zzl)object).zzf;
            if (bl2) {
                object = this.zzc.zzl();
                ((zzdya)object).zzo(n3 != 0);
            }
        }
        object6 = zzdul.zza.zza();
        long l2 = ((zzbyo)object7).zza.zzz;
        Long l3 = l2;
        object = new Pair(object6, (Object)l3);
        String string2 = zzdul.zzb.zza();
        long l4 = zzu.zzB().currentTimeMillis();
        Object object8 = l4;
        object6 = new Pair((Object)string2, object8);
        int n4 = 2;
        Pair[] pairArray = new Pair[n4];
        pairArray[0] = object;
        pairArray[n3] = object6;
        object = zzdun.zza(pairArray);
        object2 = this.zzh;
        object6 = ((zzbyo)object7).zzb;
        ((zzfhm)object2).zzt((String)object6);
        object6 = zzq.zzd();
        ((zzfhm)object2).zzs((zzq)object6);
        object6 = ((zzbyo)object7).zza;
        ((zzfhm)object2).zzH((zzl)object6);
        ((zzfhm)object2).zzA((Bundle)object);
        object = this.zza;
        object2 = ((zzfhm)object2).zzJ();
        object6 = zzfmm.zza((zzfho)object2);
        object7 = ((zzbyo)object7).zza;
        zzfmw zzfmw2 = zzfmw.zzd;
        zzfmc zzfmc2 = zzfmb.zzb((Context)object, (zzfmu)object6, zzfmw2, (zzl)object7);
        zzfgf zzfgf2 = new zzfgf(null);
        zzfgf2.zza = object2;
        object = this.zze;
        object2 = new zzfel(zzfgf2, null);
        object7 = new zzfga(this);
        this.zzi = object = object.zzc((zzfel)object2, (zzfej)object7, null);
        Object object9 = object2;
        object8 = this;
        object2 = new zzfgd(this, (zzepr)object4, (zzfmn)object5, zzfmc2, zzfgf2);
        object4 = this.zzb;
        zzgft.zzr((ListenableFuture)object, (zzgfp)object2, (Executor)object4);
        return n3 != 0;
    }

    public final /* synthetic */ void zzi() {
        zzffw zzffw2 = this.zzd;
        zze zze2 = zzfiq.zzd(6, null, null);
        zzffw2.zzdB(zze2);
    }

    public final void zzj(int n3) {
        this.zzh.zzp().zza(n3);
    }
}

