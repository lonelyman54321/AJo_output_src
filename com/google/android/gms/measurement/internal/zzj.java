/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzdr;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

public final class zzj
implements Runnable {
    private /* synthetic */ AppMeasurementDynamiteService zza;
    private /* synthetic */ zzdr zzb;

    public /* synthetic */ zzj(AppMeasurementDynamiteService appMeasurementDynamiteService, zzdr zzdr2) {
        this.zza = appMeasurementDynamiteService;
        this.zzb = zzdr2;
    }

    public final void run() {
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.zza;
        zzdr zzdr2 = this.zzb;
        AppMeasurementDynamiteService.$r8$lambda$W3cgi1t5N0SU6fYxM9Fsh5qQfPc(appMeasurementDynamiteService, zzdr2);
    }
}

