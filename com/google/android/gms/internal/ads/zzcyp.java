/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzcyo;
import com.google.android.gms.internal.ads.zzdeu;
import com.google.android.gms.internal.ads.zzexz;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzflb;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzfll;
import com.google.android.gms.internal.ads.zzfln;
import com.google.android.gms.internal.ads.zzflt;
import com.google.android.gms.internal.ads.zzhkj;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;

public final class zzcyp {
    private final zzflt zza;
    private final VersionInfoParcel zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzhkj zzg;
    private final String zzh;
    private final zzexz zzi;
    private final zzg zzj;
    private final zzfho zzk;
    private final zzdeu zzl;

    public zzcyp(zzflt zzflt2, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String string2, List list, PackageInfo packageInfo, zzhkj zzhkj2, zzg zzg2, String string3, zzexz zzexz2, zzfho zzfho2, zzdeu zzdeu2) {
        this.zza = zzflt2;
        this.zzb = versionInfoParcel;
        this.zzc = applicationInfo;
        this.zzd = string2;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzhkj2;
        this.zzh = string3;
        this.zzi = zzexz2;
        this.zzj = zzg2;
        this.zzk = zzfho2;
        this.zzl = zzdeu2;
    }

    public final /* synthetic */ zzbxu zza(ListenableFuture listenableFuture, Bundle bundle) {
        zzbxu zzbxu2;
        boolean bl2;
        zzcyp zzcyp2 = this;
        Object object = listenableFuture.get();
        Object object2 = object;
        object2 = (Bundle)object;
        object = ((ListenableFuture)this.zzg.zzb()).get();
        Object object3 = object;
        object3 = (String)object;
        object = zzbep.zzhq;
        object = (Boolean)zzba.zzc().zza((zzbeg)object);
        boolean bl3 = (Boolean)object;
        VersionInfoParcel versionInfoParcel = null;
        if (bl3 && (bl3 = (object = this.zzj).zzS())) {
            bl3 = true;
            bl2 = true;
        } else {
            bl2 = false;
        }
        String string2 = zzcyp2.zzh;
        PackageInfo packageInfo = zzcyp2.zzf;
        List list = zzcyp2.zze;
        String string3 = zzcyp2.zzd;
        ApplicationInfo applicationInfo = zzcyp2.zzc;
        versionInfoParcel = zzcyp2.zzb;
        boolean bl4 = zzcyp2.zzk.zzb();
        object = zzbxu2;
        zzbxu2 = new zzbxu((Bundle)object2, versionInfoParcel, applicationInfo, string3, list, packageInfo, (String)object3, string2, null, null, bl2, bl4, bundle);
        return zzbxu2;
    }

    public final ListenableFuture zzb(Bundle object) {
        this.zzl.zza();
        zzfln zzfln2 = zzfln.zza;
        Object object2 = new Bundle();
        object = this.zzi.zza(object2, (Bundle)object);
        object2 = this.zza;
        return zzfld.zzc((ListenableFuture)object, (Object)zzfln2, (zzfll)object2).zza();
    }

    public final ListenableFuture zzc() {
        Bundle bundle = new Bundle();
        Object object = zzbep.zzcd;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2 && (object = this.zzk.zzs) != null) {
            bundle.putAll((Bundle)object);
        }
        object = this.zzb(bundle);
        object2 = this.zza;
        Object object3 = zzfln.zzb;
        ListenableFuture listenableFuture = (ListenableFuture)this.zzg.zzb();
        ListenableFuture[] listenableFutureArray = new ListenableFuture[]{object, listenableFuture};
        object2 = ((zzfll)object2).zza(object3, listenableFutureArray);
        object3 = new zzcyo(this, (ListenableFuture)object, bundle);
        return ((zzflb)object2).zza((Callable)object3).zza();
    }
}

