/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 */
package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcjh;
import com.google.android.gms.internal.ads.zzcjv;
import com.google.android.gms.internal.ads.zzcyp;
import com.google.android.gms.internal.ads.zzczc;
import com.google.android.gms.internal.ads.zzdeu;
import com.google.android.gms.internal.ads.zzdzq;
import com.google.android.gms.internal.ads.zzdzv;
import com.google.android.gms.internal.ads.zzexz;
import com.google.android.gms.internal.ads.zzeya;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzflt;
import com.google.android.gms.internal.ads.zzhkj;
import com.google.android.gms.internal.ads.zzhko;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhla;
import com.google.android.gms.internal.ads.zzhlg;
import java.util.List;

public final class zzcyq
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

    public zzcyq(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4, zzhlg zzhlg5, zzhlg zzhlg6, zzhlg zzhlg7, zzhlg zzhlg8, zzhlg zzhlg9, zzhlg zzhlg10, zzhlg zzhlg11, zzhlg zzhlg12, zzhlg zzhlg13) {
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
    }

    public final zzcyp zza() {
        Object object;
        Object object2 = object = this.zza.zzb();
        object2 = (zzflt)object;
        VersionInfoParcel versionInfoParcel = ((zzcjv)this.zzb).zza();
        ApplicationInfo applicationInfo = ((zzdzq)this.zzc).zza();
        String string2 = ((zzdzv)this.zzd).zza();
        object = zzbep.zza;
        List list = zzba.zza().zza();
        Object object3 = object = this.zzf.zzb();
        object3 = (PackageInfo)object;
        zzhkj zzhkj2 = zzhko.zza(zzhla.zza(this.zzg));
        zzg zzg2 = ((zzcjh)this.zzh).zza();
        Object object4 = object = this.zzi.zzb();
        object4 = (String)object;
        zzexz zzexz2 = ((zzeya)this.zzj).zza();
        zzfho zzfho2 = ((zzczc)this.zzk).zza();
        Object object5 = object = this.zzl.zzb();
        object5 = (zzdeu)object;
        object = new zzcyp((zzflt)object2, versionInfoParcel, applicationInfo, string2, list, (PackageInfo)object3, zzhkj2, zzg2, (String)object4, zzexz2, zzfho2, (zzdeu)object5);
        return object;
    }
}

