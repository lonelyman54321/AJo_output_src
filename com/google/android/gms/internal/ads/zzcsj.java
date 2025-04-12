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
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcsi;
import com.google.android.gms.internal.ads.zzcso;
import com.google.android.gms.internal.ads.zzcsp;
import com.google.android.gms.internal.ads.zzcsq;
import com.google.android.gms.internal.ads.zzctb;
import com.google.android.gms.internal.ads.zzcun;
import com.google.android.gms.internal.ads.zzcuo;
import com.google.android.gms.internal.ads.zzcwz;
import com.google.android.gms.internal.ads.zzdhk;
import com.google.android.gms.internal.ads.zzdkb;
import com.google.android.gms.internal.ads.zzdme;
import com.google.android.gms.internal.ads.zzfgu;
import com.google.android.gms.internal.ads.zzhkj;
import com.google.android.gms.internal.ads.zzhko;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhla;
import com.google.android.gms.internal.ads.zzhlg;
import java.util.concurrent.Executor;

public final class zzcsj
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

    public zzcsj(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4, zzhlg zzhlg5, zzhlg zzhlg6, zzhlg zzhlg7, zzhlg zzhlg8, zzhlg zzhlg9, zzhlg zzhlg10, zzhlg zzhlg11) {
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
    }

    public static zzcsi zzc(zzcuo zzcuo2, Context context, zzfgu zzfgu2, View view, zzchd zzchd2, zzcun zzcun2, zzdme zzdme2, zzdhk zzdhk2, zzhkj zzhkj2, Executor executor) {
        zzcsi zzcsi2 = new zzcsi(zzcuo2, context, zzfgu2, view, zzchd2, zzcun2, zzdme2, zzdhk2, zzhkj2, executor);
        return zzcsi2;
    }

    public final zzcsi zza() {
        Object object;
        zzcuo zzcuo2 = ((zzcwz)this.zza).zza();
        Object object2 = object = this.zzb.zzb();
        object2 = (Context)object;
        zzfgu zzfgu2 = ((zzcsp)this.zzc).zza();
        View view = ((zzcso)this.zzd).zza();
        zzchd zzchd2 = ((zzctb)this.zze).zza();
        zzcun zzcun2 = ((zzcsq)this.zzf).zza();
        zzdme zzdme2 = ((zzdkb)this.zzg).zza();
        Object object3 = object = this.zzh.zzb();
        object3 = (zzdhk)object;
        zzhkj zzhkj2 = zzhko.zza(zzhla.zza(this.zzi));
        Object object4 = object = this.zzj.zzb();
        object4 = (Executor)object;
        object = new zzcsi(zzcuo2, (Context)object2, zzfgu2, view, zzchd2, zzcun2, zzdme2, (zzdhk)object3, zzhkj2, (Executor)object4);
        return object;
    }
}

