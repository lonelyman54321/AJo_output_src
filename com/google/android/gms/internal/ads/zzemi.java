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
import com.google.android.gms.internal.ads.zzbmg;
import com.google.android.gms.internal.ads.zzbmh;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcio;
import com.google.android.gms.internal.ads.zzcuq;
import com.google.android.gms.internal.ads.zzcvf;
import com.google.android.gms.internal.ads.zzdez;
import com.google.android.gms.internal.ads.zzdjp;
import com.google.android.gms.internal.ads.zzdri;
import com.google.android.gms.internal.ads.zzdrj;
import com.google.android.gms.internal.ads.zzdrm;
import com.google.android.gms.internal.ads.zzdsc;
import com.google.android.gms.internal.ads.zzdsd;
import com.google.android.gms.internal.ads.zzdsh;
import com.google.android.gms.internal.ads.zzegk;
import com.google.android.gms.internal.ads.zzehe;
import com.google.android.gms.internal.ads.zzehl;
import com.google.android.gms.internal.ads.zzemb;
import com.google.android.gms.internal.ads.zzemc;
import com.google.android.gms.internal.ads.zzemd;
import com.google.android.gms.internal.ads.zzeme;
import com.google.android.gms.internal.ads.zzemh;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfgy;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

public final class zzemi
implements zzehl {
    private final Context zza;
    private final zzdsd zzb;
    private final zzdrm zzc;
    private final zzfho zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbls zzg;
    private final boolean zzh;
    private final zzegk zzi;

    public zzemi(Context object, VersionInfoParcel versionInfoParcel, zzfho zzfho2, Executor executor, zzdrm zzdrm2, zzdsd zzdsd2, zzbls zzbls2, zzegk zzegk2) {
        boolean bl2;
        this.zza = object;
        this.zzd = zzfho2;
        this.zzc = zzdrm2;
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
        zzemb zzemb2 = new zzemb(this, (zzfgt)object2, (zzfhf)object, (zzdsh)object3);
        object = this.zze;
        object = zzgft.zzn(listenableFuture, zzemb2, (Executor)object);
        object2 = new zzemc((zzdsh)object3);
        object3 = this.zze;
        object.addListener((Runnable)object2, (Executor)object3);
        return object;
    }

    public final boolean zzb(zzfhf object, zzfgt zzfgt2) {
        object = zzfgt2.zzt;
        return object != null && (object = ((zzfgy)object).zza) != null;
    }

    public final /* synthetic */ ListenableFuture zzc(zzfgt zzfgt2, zzfhf zzfhf2, zzdsh object, Object object2) {
        zzdrj zzdrj2;
        zzbls zzbls2;
        zzemi zzemi2 = this;
        Object object3 = zzfhf2;
        Object object4 = zzfhf2.zzb.zzb;
        String[] stringArray = this.zzb;
        Object object5 = this.zzd.zze;
        zzchd zzchd2 = stringArray.zza((zzq)object5, zzfgt2, (zzfgw)object4);
        boolean bl2 = zzfgt2.zzX;
        zzchd2.zzac(bl2);
        object4 = this.zza;
        stringArray = zzchd2;
        stringArray = (View)zzchd2;
        object5 = object;
        ((zzdsh)object).zza((Context)object4, (View)stringArray);
        Object object6 = new zzccn();
        zzcvf zzcvf2 = new zzcvf(zzfhf2, zzfgt2, null);
        object4 = this.zza;
        stringArray = this.zzb;
        Object object7 = this.zzg;
        object5 = this.zzd;
        boolean bl3 = this.zzh;
        Object object8 = this.zzf;
        Object object9 = this.zzi;
        object3 = zzbls2;
        zzegk zzegk2 = object9;
        object9 = zzfgt2;
        zzccn zzccn2 = object6;
        zzbls zzbls3 = object7;
        object7 = zzchd2;
        zzbls2 = zzbls3;
        object = object6;
        object6 = zzdrj2;
        Object object10 = zzegk2;
        ((zzemh)object3)((Context)object4, (zzdsd)stringArray, (zzfho)object5, (VersionInfoParcel)object8, zzfgt2, zzccn2, zzchd2, zzbls3, bl3, zzegk2);
        zzdrj2 = new zzdrj((zzdjp)object3, zzchd2);
        object3 = this.zzc.zze(zzcvf2, zzdrj2);
        object4 = zzccn2;
        zzccn2.zzc(object3);
        object4 = ((zzdri)object3).zzg();
        zzbmh.zzb(zzchd2, (zzbmg)object4);
        object4 = ((zzcuq)object3).zzc();
        stringArray = new zzemd(zzchd2);
        object5 = zzcci.zzf;
        ((zzdez)object4).zzo(stringArray, (Executor)object5);
        object4 = ((zzdri)object3).zzl();
        boolean bl4 = this.zzh;
        object10 = bl4 ? this.zzg : null;
        bl4 = true;
        ((zzdsc)object4).zzi(zzchd2, bl4, (zzbls)object10);
        object4 = zzfgt2;
        object5 = zzfgt2.zzt.zza;
        object8 = zzbep.zzfc;
        object9 = zzba.zzc();
        object8 = (Boolean)((zzben)object9).zza((zzbeg)object8);
        boolean bl5 = (Boolean)object8;
        if (bl5 && (bl4 = ((zzehe)(object8 = ((zzdri)object3).zzm())).zze(bl4))) {
            stringArray = zzcio.zza(zzfgt2);
            stringArray = new String[]{stringArray};
            object5 = zzcio.zzb((String)object5, stringArray);
        }
        ((zzdri)object3).zzl();
        stringArray = ((zzfgt)object4).zzt.zzb;
        stringArray = zzdsc.zzj(zzchd2, (String)stringArray, (String)object5);
        object5 = new zzeme(zzemi2, zzchd2, (zzfgt)object4, (zzdri)object3);
        object3 = zzemi2.zze;
        return zzgft.zzm((ListenableFuture)stringArray, (zzfxu)object5, (Executor)object3);
    }
}

