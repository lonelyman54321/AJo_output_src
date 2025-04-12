/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzdq;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzme;

final class zzm
implements Runnable {
    private final /* synthetic */ zzdq zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ AppMeasurementDynamiteService zzd;

    public zzm(AppMeasurementDynamiteService appMeasurementDynamiteService, zzdq zzdq2, String string2, String string3) {
        this.zza = zzdq2;
        this.zzb = string2;
        this.zzc = string3;
        this.zzd = appMeasurementDynamiteService;
    }

    public final void run() {
        zzme zzme2 = this.zzd.zza.zzt();
        zzdq zzdq2 = this.zza;
        String string2 = this.zzb;
        String string3 = this.zzc;
        zzme2.zza(zzdq2, string2, string3);
    }
}

