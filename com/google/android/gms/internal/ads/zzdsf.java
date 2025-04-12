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
import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzbfs;
import com.google.android.gms.internal.ads.zzchq;
import com.google.android.gms.internal.ads.zzcjv;
import com.google.android.gms.internal.ads.zzdca;
import com.google.android.gms.internal.ads.zzdsd;
import com.google.android.gms.internal.ads.zzegk;
import com.google.android.gms.internal.ads.zzfhs;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzdsf
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

    public zzdsf(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4, zzhlg zzhlg5, zzhlg zzhlg6, zzhlg zzhlg7, zzhlg zzhlg8, zzhlg zzhlg9, zzhlg zzhlg10, zzhlg zzhlg11) {
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

    public final /* synthetic */ Object zzb() {
        zzdsd zzdsd2;
        Object object;
        zzchq zzchq2 = new zzchq();
        Object object2 = object = this.zzb.zzb();
        object2 = (Context)object;
        Object object3 = object = this.zzc.zzb();
        object3 = (zzaxd)object;
        Object object4 = object = this.zzd.zzb();
        object4 = (zzbfs)object;
        VersionInfoParcel versionInfoParcel = ((zzcjv)this.zze).zza();
        object = this.zzg;
        zza zza2 = com.google.android.gms.ads.internal.zza.zza();
        Object object5 = object = object.zzb();
        object5 = (zzbdm)object;
        Object object6 = object = this.zzh.zzb();
        object6 = (zzdca)object;
        Object object7 = object = this.zzi.zzb();
        object7 = (zzegk)object;
        Object object8 = object = this.zzj.zzb();
        object8 = (zzfhs)object;
        object = zzdsd2;
        zzdsd2 = new zzdsd(zzchq2, (Context)object2, (zzaxd)object3, (zzbfs)object4, versionInfoParcel, zza2, (zzbdm)object5, (zzdca)object6, (zzegk)object7, (zzfhs)object8);
        return zzdsd2;
    }
}

