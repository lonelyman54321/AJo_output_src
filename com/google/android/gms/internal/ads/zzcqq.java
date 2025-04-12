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
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzbfs;
import com.google.android.gms.internal.ads.zzbfu;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcjj;
import com.google.android.gms.internal.ads.zzcqp;
import com.google.android.gms.internal.ads.zzcvg;
import com.google.android.gms.internal.ads.zzcvj;
import com.google.android.gms.internal.ads.zzcyn;
import com.google.android.gms.internal.ads.zzcyz;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfia;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzfoa;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhlg;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class zzcqq
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;
    private final zzhlg zzf;
    private final zzhlg zzg;
    private final zzhlg zzh;
    private final zzhlg zzi;
    private final zzhlg zzj;
    private final zzhlg zzk;
    private final zzhlg zzl;
    private final zzhlg zzm;
    private final zzhlg zzn;
    private final zzhlg zzo;

    public zzcqq(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4, zzhlg zzhlg5, zzhlg zzhlg6, zzhlg zzhlg7, zzhlg zzhlg8, zzhlg zzhlg9, zzhlg zzhlg10, zzhlg zzhlg11, zzhlg zzhlg12, zzhlg zzhlg13, zzhlg zzhlg14, zzhlg zzhlg15, zzhlg zzhlg16) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
        this.zzd = zzhlg5;
        this.zze = zzhlg6;
        this.zzf = zzhlg7;
        this.zzg = zzhlg8;
        this.zzh = zzhlg9;
        this.zzi = zzhlg10;
        this.zzj = zzhlg11;
        this.zzk = zzhlg12;
        this.zzl = zzhlg13;
        this.zzm = zzhlg14;
        this.zzn = zzhlg15;
        this.zzo = zzhlg16;
    }

    public final /* synthetic */ Object zzb() {
        Object object;
        Context context = ((zzcjj)this.zza).zza();
        zzgge zzgge2 = zzcci.zza;
        zzhkx.zzb(zzgge2);
        Object object2 = object = this.zzc.zzb();
        object2 = (Executor)object;
        Object object3 = object = this.zzd.zzb();
        object3 = (ScheduledExecutorService)object;
        zzfhf zzfhf2 = ((zzcvj)this.zze).zza();
        zzfgt zzfgt2 = ((zzcvg)this.zzf).zza();
        Object object4 = object = this.zzg.zzb();
        object4 = (zzfoa)object;
        Object object5 = object = this.zzh.zzb();
        object5 = (zzfia)object;
        Object object6 = object = this.zzi.zzb();
        object6 = (View)object;
        Object object7 = object = this.zzj.zzb();
        object7 = (zzchd)object;
        Object object8 = object = this.zzk.zzb();
        object8 = (zzaxd)object;
        Object object9 = object = this.zzl.zzb();
        object9 = (zzbfs)object;
        zzbfu zzbfu2 = new zzbfu();
        Object object10 = object = this.zzn.zzb();
        object10 = (zzfmn)object;
        zzcyn zzcyn2 = ((zzcyz)this.zzo).zza();
        object = new zzcqp(context, zzgge2, (Executor)object2, (ScheduledExecutorService)object3, zzfhf2, zzfgt2, (zzfoa)object4, (zzfia)object5, (View)object6, (zzchd)object7, (zzaxd)object8, (zzbfs)object9, zzbfu2, (zzfmn)object10, zzcyn2);
        return object;
    }
}

