/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzchq;
import com.google.android.gms.internal.ads.zzcjj;
import com.google.android.gms.internal.ads.zzcjv;
import com.google.android.gms.internal.ads.zzdqp;
import com.google.android.gms.internal.ads.zzdvc;
import com.google.android.gms.internal.ads.zzefz;
import com.google.android.gms.internal.ads.zzegk;
import com.google.android.gms.internal.ads.zzfhs;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;
import java.util.concurrent.Executor;

public final class zzdqu
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

    public zzdqu(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4, zzhlg zzhlg5, zzhlg zzhlg6, zzhlg zzhlg7, zzhlg zzhlg8, zzhlg zzhlg9, zzhlg zzhlg10, zzhlg zzhlg11, zzhlg zzhlg12) {
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
    }

    public final /* synthetic */ Object zzb() {
        Object object;
        Context context = ((zzcjj)this.zza).zza();
        Object object2 = object = this.zzb.zzb();
        object2 = (Executor)object;
        Object object3 = object = this.zzc.zzb();
        object3 = (zzaxd)object;
        VersionInfoParcel versionInfoParcel = ((zzcjv)this.zzd).zza();
        zza zza2 = com.google.android.gms.ads.internal.zza.zza();
        zzchq zzchq2 = new zzchq();
        Object object4 = object = this.zzg.zzb();
        object4 = (zzefz)((Object)object);
        Object object5 = object = this.zzh.zzb();
        object5 = (zzfoe)object;
        Object object6 = object = this.zzi.zzb();
        object6 = (zzdvc)object;
        Object object7 = object = this.zzj.zzb();
        object7 = (zzegk)object;
        Object object8 = object = this.zzk.zzb();
        object8 = (zzfhs)object;
        object = new zzdqp(context, (Executor)object2, (zzaxd)object3, versionInfoParcel, zza2, zzchq2, (zzefz)((Object)object4), (zzfoe)object5, (zzdvc)object6, (zzegk)object7, (zzfhs)object8);
        return object;
    }
}

