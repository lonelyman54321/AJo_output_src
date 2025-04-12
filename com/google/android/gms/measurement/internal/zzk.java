/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzdq;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzme;

final class zzk
implements Runnable {
    private final /* synthetic */ zzdq zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ boolean zzd;
    private final /* synthetic */ AppMeasurementDynamiteService zze;

    public zzk(AppMeasurementDynamiteService appMeasurementDynamiteService, zzdq zzdq2, String string2, String string3, boolean bl2) {
        this.zza = zzdq2;
        this.zzb = string2;
        this.zzc = string3;
        this.zzd = bl2;
        this.zze = appMeasurementDynamiteService;
    }

    public final void run() {
        zzme zzme2 = this.zze.zza.zzt();
        zzdq zzdq2 = this.zza;
        String string2 = this.zzb;
        String string3 = this.zzc;
        boolean bl2 = this.zzd;
        zzme2.zza(zzdq2, string2, string3, bl2);
    }
}

