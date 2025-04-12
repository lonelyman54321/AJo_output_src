/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService$zza;
import com.google.android.gms.measurement.internal.zzju;

final class zzn
implements Runnable {
    private final /* synthetic */ AppMeasurementDynamiteService$zza zza;
    private final /* synthetic */ AppMeasurementDynamiteService zzb;

    public zzn(AppMeasurementDynamiteService appMeasurementDynamiteService, AppMeasurementDynamiteService$zza zza2) {
        this.zza = zza2;
        this.zzb = appMeasurementDynamiteService;
    }

    public final void run() {
        zzju zzju2 = this.zzb.zza.zzp();
        AppMeasurementDynamiteService$zza appMeasurementDynamiteService$zza = this.zza;
        zzju2.zza(appMeasurementDynamiteService$zza);
    }
}

