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
import com.google.android.gms.internal.ads.zzdvc;
import com.google.android.gms.internal.ads.zzefz;
import com.google.android.gms.internal.ads.zzegk;
import com.google.android.gms.internal.ads.zzfhs;
import com.google.android.gms.internal.ads.zzfoe;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class zzdqp
implements Callable {
    private final zza zza;
    private final zzchq zzb;
    private final Context zzc;
    private final zzdvc zzd;
    private final zzefz zze;
    private final Executor zzf;
    private final zzaxd zzg;
    private final VersionInfoParcel zzh;
    private final zzfoe zzi;
    private final zzegk zzj;
    private final zzfhs zzk;

    public zzdqp(Context context, Executor executor, zzaxd zzaxd2, VersionInfoParcel versionInfoParcel, zza zza2, zzchq zzchq2, zzefz zzefz2, zzfoe zzfoe2, zzdvc zzdvc2, zzegk zzegk2, zzfhs zzfhs2) {
        this.zzc = context;
        this.zzf = executor;
        this.zzg = zzaxd2;
        this.zzh = versionInfoParcel;
        this.zza = zza2;
        this.zzb = zzchq2;
        this.zze = zzefz2;
        this.zzi = zzfoe2;
        this.zzd = zzdvc2;
        this.zzj = zzegk2;
        this.zzk = zzfhs2;
    }

    public static /* bridge */ /* synthetic */ Context zza(zzdqp zzdqp2) {
        return zzdqp2.zzc;
    }

    public static /* bridge */ /* synthetic */ zzaxd zzb(zzdqp zzdqp2) {
        return zzdqp2.zzg;
    }

    public static /* bridge */ /* synthetic */ zza zzc(zzdqp zzdqp2) {
        return zzdqp2.zza;
    }

    public static /* bridge */ /* synthetic */ VersionInfoParcel zzd(zzdqp zzdqp2) {
        return zzdqp2.zzh;
    }

    public static /* bridge */ /* synthetic */ zzchq zze(zzdqp zzdqp2) {
        return zzdqp2.zzb;
    }

    public static /* bridge */ /* synthetic */ zzdvc zzf(zzdqp zzdqp2) {
        return zzdqp2.zzd;
    }

    public static /* bridge */ /* synthetic */ zzefz zzg(zzdqp zzdqp2) {
        return zzdqp2.zze;
    }

    public static /* bridge */ /* synthetic */ zzegk zzh(zzdqp zzdqp2) {
        return zzdqp2.zzj;
    }

    public static /* bridge */ /* synthetic */ zzfhs zzi(zzdqp zzdqp2) {
        return zzdqp2.zzk;
    }

    public static /* bridge */ /* synthetic */ zzfoe zzj(zzdqp zzdqp2) {
        return zzdqp2.zzi;
    }

    public static /* bridge */ /* synthetic */ Executor zzk(zzdqp zzdqp2) {
        return zzdqp2.zzf;
    }
}

