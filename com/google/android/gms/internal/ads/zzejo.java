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
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbls;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcio;
import com.google.android.gms.internal.ads.zzcvf;
import com.google.android.gms.internal.ads.zzdez;
import com.google.android.gms.internal.ads.zzdih;
import com.google.android.gms.internal.ads.zzdik;
import com.google.android.gms.internal.ads.zzdjh;
import com.google.android.gms.internal.ads.zzdjp;
import com.google.android.gms.internal.ads.zzdsc;
import com.google.android.gms.internal.ads.zzdsd;
import com.google.android.gms.internal.ads.zzdsh;
import com.google.android.gms.internal.ads.zzegk;
import com.google.android.gms.internal.ads.zzehl;
import com.google.android.gms.internal.ads.zzejj;
import com.google.android.gms.internal.ads.zzejk;
import com.google.android.gms.internal.ads.zzejl;
import com.google.android.gms.internal.ads.zzejm;
import com.google.android.gms.internal.ads.zzejn;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfgy;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

public final class zzejo
implements zzehl {
    private final Context zza;
    private final zzdsd zzb;
    private final zzdjh zzc;
    private final zzfho zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbls zzg;
    private final boolean zzh;
    private final zzegk zzi;

    public zzejo(Context object, VersionInfoParcel versionInfoParcel, zzfho zzfho2, Executor executor, zzdjh zzdjh2, zzdsd zzdsd2, zzbls zzbls2, zzegk zzegk2) {
        boolean bl2;
        this.zza = object;
        this.zzd = zzfho2;
        this.zzc = zzdjh2;
        this.zze = executor;
        this.zzf = versionInfoParcel;
        this.zzb = zzdsd2;
        this.zzg = zzbls2;
        object = zzbep.zziT;
        this.zzh = bl2 = ((Boolean)zzba.zzc().zza((zzbeg)object)).booleanValue();
        this.zzi = zzegk2;
    }

    public final ListenableFuture zza(zzfhf object, zzfgt object2) {
        Object object3 = new zzdsh();
        ListenableFuture listenableFuture = zzgft.zzh(null);
        zzejl zzejl2 = new zzejl(this, (zzfgt)object2, (zzfhf)object, (zzdsh)object3);
        object = this.zze;
        object = zzgft.zzn(listenableFuture, zzejl2, (Executor)object);
        object2 = new zzejm((zzdsh)object3);
        object3 = this.zze;
        object.addListener((Runnable)object2, (Executor)object3);
        return object;
    }

    public final boolean zzb(zzfhf object, zzfgt zzfgt2) {
        object = zzfgt2.zzt;
        return object != null && (object = ((zzfgy)object).zza) != null;
    }

    public final /* synthetic */ ListenableFuture zzc(zzfgt zzfgt2, zzfhf zzfhf2, zzdsh zzdsh2, Object object) {
        zzegk zzegk2;
        zzbls zzbls2;
        zzejo zzejo2 = this;
        Object object2 = zzfgt2;
        Object object3 = zzfhf2;
        Object object4 = zzfhf2.zzb.zzb;
        Object object5 = this.zzb;
        Object object6 = this.zzd.zze;
        zzchd zzchd2 = ((zzdsd)object5).zza((zzq)object6, zzfgt2, (zzfgw)object4);
        boolean bl2 = zzfgt2.zzX;
        zzchd2.zzac(bl2);
        object4 = this.zza;
        object5 = zzchd2;
        object5 = (View)zzchd2;
        object6 = zzdsh2;
        zzdsh2.zza((Context)object4, (View)object5);
        zzccn zzccn2 = new zzccn();
        zzcvf zzcvf2 = new zzcvf(zzfhf2, zzfgt2, null);
        zzfho zzfho2 = this.zzd;
        boolean bl3 = this.zzh;
        object4 = this.zza;
        Object object7 = this.zzg;
        object5 = this.zzf;
        Object object8 = this.zzi;
        object3 = zzbls2;
        object6 = zzccn2;
        zzegk zzegk3 = object8;
        object8 = zzfgt2;
        zzbls zzbls3 = object7;
        object7 = zzchd2;
        Object object9 = zzbls2;
        zzbls2 = zzbls3;
        object2 = zzegk2;
        zzegk2 = zzegk3;
        ((zzejn)object3)((Context)object4, (VersionInfoParcel)object5, zzccn2, zzfgt2, zzchd2, zzfho2, bl3, zzbls3, zzegk3);
        ((zzdik)object2)((zzdjp)object3, zzchd2);
        object3 = this.zzc.zze(zzcvf2, (zzdik)object2);
        zzccn2.zzc(object3);
        object4 = ((zzdih)object3).zzc();
        object5 = new zzejj(zzchd2);
        object6 = zzcci.zzf;
        ((zzdez)object4).zzo(object5, (Executor)object6);
        object4 = zzfgt2;
        object5 = zzfgt2.zzt.zza;
        object6 = zzbep.zzfc;
        object8 = zzba.zzc();
        object6 = (Boolean)((zzben)object8).zza((zzbeg)object6);
        boolean bl4 = object6.booleanValue();
        boolean bl5 = true;
        if (bl4 && (bl4 = (object6 = ((zzdih)object3).zzl()).zze(bl5))) {
            object6 = zzcio.zza(zzfgt2);
            object6 = new String[]{object6};
            object5 = zzcio.zzb((String)object5, object6);
        }
        object6 = ((zzdih)object3).zzi();
        boolean bl6 = zzejo2.zzh;
        object9 = bl6 ? zzejo2.zzg : null;
        object6.zzi(zzchd2, bl5, (zzbls)object9);
        ((zzdih)object3).zzi();
        object6 = ((zzfgt)object4).zzt.zzb;
        object5 = zzdsc.zzj(zzchd2, (String)object6, (String)object5);
        object6 = new zzejk(zzejo2, zzchd2, (zzfgt)object4, (zzdih)object3);
        object3 = zzejo2.zze;
        return zzgft.zzm((ListenableFuture)object5, (zzfxu)object6, (Executor)object3);
    }
}

