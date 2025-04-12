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
import com.google.android.gms.internal.ads.zzcjj;
import com.google.android.gms.internal.ads.zzcjv;
import com.google.android.gms.internal.ads.zzczc;
import com.google.android.gms.internal.ads.zzdce;
import com.google.android.gms.internal.ads.zzdcf;
import com.google.android.gms.internal.ads.zzebz;
import com.google.android.gms.internal.ads.zzeca;
import com.google.android.gms.internal.ads.zzecr;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzflt;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzecs
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

    public zzecs(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4, zzhlg zzhlg5, zzhlg zzhlg6, zzhlg zzhlg7, zzhlg zzhlg8, zzhlg zzhlg9, zzhlg zzhlg10) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
        this.zzd = zzhlg5;
        this.zze = zzhlg6;
        this.zzf = zzhlg7;
        this.zzg = zzhlg8;
        this.zzh = zzhlg9;
        this.zzi = zzhlg10;
    }

    public final zzecr zza() {
        Object object;
        zzdce zzdce2 = ((zzdcf)this.zza).zza();
        zzebz zzebz2 = ((zzeca)this.zzb).zza();
        Object object2 = object = this.zzc.zzb();
        object2 = (zzflt)object;
        zzfho zzfho2 = ((zzczc)this.zzd).zza();
        VersionInfoParcel versionInfoParcel = ((zzcjv)this.zze).zza();
        Object object3 = object = this.zzf.zzb();
        object3 = (zzfmq)object;
        Object object4 = object = this.zzg.zzb();
        object4 = (zzfmn)object;
        Context context = ((zzcjj)this.zzh).zza();
        zzgge zzgge2 = zzcci.zza;
        zzhkx.zzb(zzgge2);
        object = new zzecr(zzdce2, zzebz2, (zzflt)object2, zzfho2, versionInfoParcel, (zzfmq)object3, (zzfmn)object4, context, zzgge2);
        return object;
    }
}

