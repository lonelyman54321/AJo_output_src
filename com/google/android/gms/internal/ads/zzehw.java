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
import com.google.android.gms.internal.ads.zzcrq;
import com.google.android.gms.internal.ads.zzcrr;
import com.google.android.gms.internal.ads.zzcrt;
import com.google.android.gms.internal.ads.zzcuq;
import com.google.android.gms.internal.ads.zzcvf;
import com.google.android.gms.internal.ads.zzdez;
import com.google.android.gms.internal.ads.zzdik;
import com.google.android.gms.internal.ads.zzdjp;
import com.google.android.gms.internal.ads.zzdsc;
import com.google.android.gms.internal.ads.zzdsd;
import com.google.android.gms.internal.ads.zzdsh;
import com.google.android.gms.internal.ads.zzegk;
import com.google.android.gms.internal.ads.zzehl;
import com.google.android.gms.internal.ads.zzehs;
import com.google.android.gms.internal.ads.zzeht;
import com.google.android.gms.internal.ads.zzehu;
import com.google.android.gms.internal.ads.zzehv;
import com.google.android.gms.internal.ads.zzehy;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfgy;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

public final class zzehw
implements zzehl {
    private final zzcrt zza;
    private final Context zzb;
    private final zzdsd zzc;
    private final zzfho zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbls zzg;
    private final boolean zzh;
    private final zzegk zzi;

    public zzehw(zzcrt object, Context context, Executor executor, zzdsd zzdsd2, zzfho zzfho2, VersionInfoParcel versionInfoParcel, zzbls zzbls2, zzegk zzegk2) {
        boolean bl2;
        this.zzb = context;
        this.zza = object;
        this.zze = executor;
        this.zzc = zzdsd2;
        this.zzd = zzfho2;
        this.zzf = versionInfoParcel;
        this.zzg = zzbls2;
        object = zzbep.zziT;
        this.zzh = bl2 = ((Boolean)zzba.zzc().zza((zzbeg)object)).booleanValue();
        this.zzi = zzegk2;
    }

    public final ListenableFuture zza(zzfhf object, zzfgt object2) {
        Object object3 = new zzdsh();
        ListenableFuture listenableFuture = zzgft.zzh(null);
        zzehs zzehs2 = new zzehs(this, (zzfgt)object2, (zzfhf)object, (zzdsh)object3);
        object = this.zze;
        object = zzgft.zzn(listenableFuture, zzehs2, (Executor)object);
        object2 = new zzeht((zzdsh)object3);
        object3 = this.zze;
        object.addListener((Runnable)object2, (Executor)object3);
        return object;
    }

    public final boolean zzb(zzfhf object, zzfgt zzfgt2) {
        object = zzfgt2.zzt;
        return object != null && (object = ((zzfgy)object).zza) != null;
    }

    public final /* synthetic */ ListenableFuture zzc(zzfgt zzfgt2, zzfhf zzfhf2, zzdsh zzdsh2, Object object) {
        boolean bl2;
        zzegk zzegk2;
        zzehw zzehw2 = this;
        zzfgt zzfgt3 = zzfgt2;
        Object object2 = zzfhf2;
        Object object3 = zzfhf2.zzb.zzb;
        String[] stringArray = this.zzc;
        Object object4 = this.zzd.zze;
        zzchd zzchd2 = stringArray.zza((zzq)object4, zzfgt2, (zzfgw)object3);
        int n3 = zzfgt2.zzX;
        zzchd2.zzac(n3 != 0);
        object3 = this.zzb;
        stringArray = zzchd2;
        stringArray = (View)zzchd2;
        object4 = zzdsh2;
        zzdsh2.zza((Context)object3, (View)stringArray);
        zzccn zzccn2 = new zzccn();
        zzcvf zzcvf2 = new zzcvf(zzfhf2, zzfgt2, null);
        zzfho zzfho2 = this.zzd;
        boolean bl3 = this.zzh;
        zzbls zzbls2 = this.zzg;
        object3 = this.zzf;
        Object object5 = this.zzi;
        object2 = zzegk2;
        stringArray = zzccn2;
        object4 = zzfgt2;
        zzegk zzegk3 = object5;
        object5 = zzchd2;
        Object object6 = zzegk2;
        zzegk2 = zzegk3;
        ((zzehy)object2)((VersionInfoParcel)object3, zzccn2, zzfgt2, zzchd2, zzfho2, bl3, zzbls2, zzegk3);
        zzdik zzdik2 = new zzdik((zzdjp)object2, zzchd2);
        n3 = zzfgt2.zzab;
        object2 = new zzcrr(n3);
        object2 = this.zza.zza(zzcvf2, zzdik2, (zzcrr)object2);
        object3 = ((zzcrq)object2).zzh();
        boolean bl4 = this.zzh;
        object6 = bl4 ? this.zzg : null;
        ((zzdsc)object3).zzi(zzchd2, false, (zzbls)object6);
        zzccn2.zzc(object2);
        object3 = ((zzcuq)object2).zzc();
        stringArray = new zzehu(zzchd2);
        object4 = zzcci.zzf;
        ((zzdez)object3).zzo(stringArray, (Executor)object4);
        object3 = zzfgt3.zzt.zza;
        stringArray = zzbep.zzfc;
        object4 = zzba.zzc();
        stringArray = (Boolean)((zzben)object4).zza((zzbeg)stringArray);
        bl4 = stringArray.booleanValue();
        if (bl4 && (bl4 = (stringArray = ((zzcrq)object2).zzi()).zze(bl2 = true))) {
            stringArray = zzcio.zza(zzfgt2);
            stringArray = new String[]{stringArray};
            object3 = zzcio.zzb((String)object3, stringArray);
        }
        ((zzcrq)object2).zzh();
        stringArray = zzfgt3.zzt.zzb;
        object3 = zzdsc.zzj(zzchd2, (String)stringArray, (String)object3);
        stringArray = new zzehv(zzehw2, zzchd2, zzfgt3, (zzcrq)object2);
        object2 = zzehw2.zze;
        return zzgft.zzm((ListenableFuture)object3, (zzfxu)stringArray, (Executor)object2);
    }
}

