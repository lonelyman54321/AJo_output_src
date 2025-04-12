/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzbfs;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzchq;
import com.google.android.gms.internal.ads.zzcix;
import com.google.android.gms.internal.ads.zzdca;
import com.google.android.gms.internal.ads.zzdrs;
import com.google.android.gms.internal.ads.zzegk;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfhs;

public final class zzdsd {
    private final zzchq zza;
    private final Context zzb;
    private final zzaxd zzc;
    private final zzbfs zzd;
    private final VersionInfoParcel zze;
    private final zza zzf;
    private final zzbdm zzg;
    private final zzdca zzh;
    private final zzegk zzi;
    private final zzfhs zzj;

    public zzdsd(zzchq zzchq2, Context context, zzaxd zzaxd2, zzbfs zzbfs2, VersionInfoParcel versionInfoParcel, zza zza2, zzbdm zzbdm2, zzdca zzdca2, zzegk zzegk2, zzfhs zzfhs2) {
        this.zza = zzchq2;
        this.zzb = context;
        this.zzc = zzaxd2;
        this.zzd = zzbfs2;
        this.zze = versionInfoParcel;
        this.zzf = zza2;
        this.zzg = zzbdm2;
        this.zzh = zzdca2;
        this.zzi = zzegk2;
        this.zzj = zzfhs2;
    }

    public static /* bridge */ /* synthetic */ zzdca zzb(zzdsd zzdsd2) {
        return zzdsd2.zzh;
    }

    public final zzchd zza(zzq zzq2, zzfgt zzfgt2, zzfgw zzfgw2) {
        zzcix zzcix2 = zzcix.zzc(zzq2);
        zzq zzq3 = zzq2;
        String string2 = zzq2.zza;
        zzdrs zzdrs2 = new zzdrs(this);
        zzegk zzegk2 = this.zzi;
        Object object = this.zzj;
        zza zza2 = this.zzf;
        zzbdm zzbdm2 = this.zzg;
        zzaxd zzaxd2 = this.zzc;
        zzbfs zzbfs2 = this.zzd;
        VersionInfoParcel versionInfoParcel = this.zze;
        zzq3 = this.zzb;
        zzfhs zzfhs2 = object;
        object = zzfgw2;
        return zzchq.zza((Context)zzq3, zzcix2, string2, false, false, zzaxd2, zzbfs2, versionInfoParcel, null, zzdrs2, zza2, zzbdm2, zzfgt2, zzfgw2, zzegk2, zzfhs2);
    }
}

