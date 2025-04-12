/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcjd;
import com.google.android.gms.internal.ads.zzcjj;
import com.google.android.gms.internal.ads.zzcjv;
import com.google.android.gms.internal.ads.zzczc;
import com.google.android.gms.internal.ads.zzdux;
import com.google.android.gms.internal.ads.zzeam;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzean
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;
    private final zzhlg zzf;
    private final zzhlg zzg;
    private final zzhlg zzh;

    public zzean(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4, zzhlg zzhlg5, zzhlg zzhlg6, zzhlg zzhlg7, zzhlg zzhlg8, zzhlg zzhlg9) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
        this.zzd = zzhlg5;
        this.zze = zzhlg6;
        this.zzf = zzhlg7;
        this.zzg = zzhlg8;
        this.zzh = zzhlg9;
    }

    public final zzeam zza() {
        Object object;
        Object object2 = object = this.zza.zzb();
        object2 = (zzcjd)object;
        Context context = ((zzcjj)this.zzb).zza();
        VersionInfoParcel versionInfoParcel = ((zzcjv)this.zzc).zza();
        zzfho zzfho2 = ((zzczc)this.zzd).zza();
        zzgge zzgge2 = zzcci.zza;
        zzhkx.zzb(zzgge2);
        Object object3 = object = this.zzf.zzb();
        object3 = (String)object;
        Object object4 = object = this.zzg.zzb();
        object4 = (zzfmn)object;
        Object object5 = object = this.zzh.zzb();
        object5 = (zzdux)object;
        object = new zzeam((zzcjd)object2, context, versionInfoParcel, zzfho2, zzgge2, (String)object3, (zzfmn)object4, (zzdux)object5);
        return object;
    }
}

