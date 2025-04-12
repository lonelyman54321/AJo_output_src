/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbhd;
import com.google.android.gms.internal.ads.zzcje;
import com.google.android.gms.internal.ads.zzcjf;
import java.lang.ref.WeakReference;

public final class zzcjg {
    private final VersionInfoParcel zza;
    private final Context zzb;
    private final long zzc;
    private final WeakReference zzd;

    public /* synthetic */ zzcjg(zzcje zzcje2, zzcjf object) {
        long l2;
        this.zza = object = zzcje.zzc(zzcje2);
        object = zzcje.zzb(zzcje2);
        this.zzb = object;
        this.zzd = object = zzcje.zzg(zzcje2);
        this.zzc = l2 = zzcje.zza(zzcje2);
    }

    public final long zza() {
        return this.zzc;
    }

    public final Context zzb() {
        return this.zzb;
    }

    public final zzj zzc() {
        Context context = this.zzb;
        VersionInfoParcel versionInfoParcel = this.zza;
        zzj zzj2 = new zzj(context, versionInfoParcel);
        return zzj2;
    }

    public final zzbhd zzd() {
        Context context = this.zzb;
        zzbhd zzbhd2 = new zzbhd(context);
        return zzbhd2;
    }

    public final VersionInfoParcel zze() {
        return this.zza;
    }

    public final String zzf() {
        zzt zzt2 = zzu.zzp();
        Object object = this.zza;
        Context context = this.zzb;
        object = ((VersionInfoParcel)object).afmaVersion;
        return zzt2.zzc(context, (String)object);
    }

    public final WeakReference zzg() {
        return this.zzd;
    }
}

