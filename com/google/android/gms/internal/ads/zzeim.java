/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzau;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcif;
import com.google.android.gms.internal.ads.zzcio;
import com.google.android.gms.internal.ads.zzcsg;
import com.google.android.gms.internal.ads.zzcsm;
import com.google.android.gms.internal.ads.zzctg;
import com.google.android.gms.internal.ads.zzcub;
import com.google.android.gms.internal.ads.zzcuq;
import com.google.android.gms.internal.ads.zzcvf;
import com.google.android.gms.internal.ads.zzdez;
import com.google.android.gms.internal.ads.zzdsc;
import com.google.android.gms.internal.ads.zzdsd;
import com.google.android.gms.internal.ads.zzdsg;
import com.google.android.gms.internal.ads.zzehe;
import com.google.android.gms.internal.ads.zzehl;
import com.google.android.gms.internal.ads.zzeig;
import com.google.android.gms.internal.ads.zzeih;
import com.google.android.gms.internal.ads.zzeii;
import com.google.android.gms.internal.ads.zzeij;
import com.google.android.gms.internal.ads.zzeik;
import com.google.android.gms.internal.ads.zzeil;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgu;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfgy;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfhu;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;

public final class zzeim
implements zzehl {
    private final zzctg zza;
    private final Context zzb;
    private final zzdsd zzc;
    private final zzfho zzd;
    private final Executor zze;
    private final zzfxu zzf;

    public zzeim(zzctg zzctg2, Context context, Executor executor, zzdsd zzdsd2, zzfho zzfho2, zzfxu zzfxu2) {
        this.zzb = context;
        this.zza = zzctg2;
        this.zze = executor;
        this.zzc = zzdsd2;
        this.zzd = zzfho2;
        this.zzf = zzfxu2;
    }

    public final ListenableFuture zza(zzfhf object, zzfgt zzfgt2) {
        ListenableFuture listenableFuture = zzgft.zzh(null);
        zzeil zzeil2 = new zzeil(this, (zzfhf)object, zzfgt2);
        object = this.zze;
        return zzgft.zzn(listenableFuture, zzeil2, (Executor)object);
    }

    public final boolean zzb(zzfhf object, zzfgt zzfgt2) {
        object = zzfgt2.zzt;
        return object != null && (object = ((zzfgy)object).zza) != null;
    }

    public final /* synthetic */ ListenableFuture zzc(zzfhf object, zzfgt object2, Object object3) {
        boolean bl2;
        Object object4;
        Object object5;
        object3 = this.zzb;
        Object object6 = ((zzfgt)object2).zzv;
        object3 = zzfhu.zza((Context)object3, (List)object6);
        object6 = ((zzfhf)object).zzb.zzb;
        object6 = this.zzc.zza((zzq)object3, (zzfgt)object2, (zzfgw)object6);
        boolean bl3 = ((zzfgt)object2).zzX;
        object6.zzac(bl3);
        Object object7 = zzbep.zzhU;
        Object object8 = zzba.zzc();
        object7 = (Boolean)((zzben)object8).zza((zzbeg)object7);
        bl3 = (Boolean)object7;
        if (bl3 && (bl3 = ((zzfgt)object2).zzah)) {
            object7 = this.zzb;
            object8 = object6;
            object8 = (View)object6;
            object7 = zzcub.zza((Context)object7, (View)object8, (zzfgt)object2);
        } else {
            object7 = this.zzb;
            object8 = this.zzf;
            object8 = (zzau)object8.apply(object2);
            object5 = object6;
            object5 = (View)object6;
            object7 = object4 = new zzdsg((Context)object7, (View)object5, (zzau)object8);
        }
        object8 = this.zza;
        object5 = null;
        object4 = new zzcvf((zzfhf)object, (zzfgt)object2, null);
        zzeig zzeig2 = new zzeig((zzchd)object6);
        object3 = zzfhu.zzb((zzq)object3);
        object = new zzcsm((View)object7, (zzchd)object6, zzeig2, (zzfgu)object3);
        object = ((zzctg)object8).zza((zzcvf)object4, (zzcsm)object);
        ((zzcsg)object).zzh().zzi((zzchd)object6, false, null);
        object3 = ((zzcuq)object).zzc();
        object7 = new zzeih((zzchd)object6);
        object8 = zzcci.zzf;
        ((zzdez)object3).zzo(object7, (Executor)object8);
        object3 = ((zzfgt)object2).zzt.zza;
        object7 = zzbep.zzfc;
        object4 = zzba.zzc();
        object7 = (Boolean)((zzben)object4).zza((zzbeg)object7);
        bl3 = (Boolean)object7;
        if (bl3 && (bl3 = ((zzehe)(object7 = ((zzcsg)object).zzi())).zze(bl2 = true))) {
            object7 = zzcio.zza((zzfgt)object2);
            object7 = new String[]{object7};
            object3 = zzcio.zzb((String)object3, (String[])object7);
        }
        ((zzcsg)object).zzh();
        object7 = ((zzfgt)object2).zzt.zzb;
        object3 = zzdsc.zzj((zzchd)object6, (String)object7, (String)object3);
        boolean bl4 = ((zzfgt)object2).zzN;
        if (bl4) {
            object2 = new zzeii((zzchd)object6);
            object7 = this.zze;
            object3.addListener((Runnable)object2, (Executor)object7);
        }
        object2 = new zzeij(this, (zzchd)object6);
        object6 = this.zze;
        object3.addListener((Runnable)object2, (Executor)object6);
        object2 = new zzeik((zzcsg)object);
        return zzgft.zzm((ListenableFuture)object3, (zzfxu)object2, (Executor)object8);
    }

    public final /* synthetic */ void zzd(zzchd zzchd2) {
        zzchd2.zzab();
        Object object = zzchd2.zzq();
        Object object2 = this.zzd.zza;
        if (object2 != null && object != null) {
            ((zzcif)object).zzs((zzfk)object2);
        }
        object = zzbep.zzbj;
        object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2 && !(bl2 = zzchd2.isAttachedToWindow())) {
            zzchd2.onPause();
            bl2 = true;
            zzchd2.zzav(bl2);
        }
    }
}

