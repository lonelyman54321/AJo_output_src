/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzdq;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzme;

final class zzi
implements Runnable {
    private final /* synthetic */ zzdq zza;
    private final /* synthetic */ AppMeasurementDynamiteService zzb;

    public zzi(AppMeasurementDynamiteService appMeasurementDynamiteService, zzdq zzdq2) {
        this.zza = zzdq2;
        this.zzb = appMeasurementDynamiteService;
    }

    public final void run() {
        zzme zzme2 = this.zzb.zza.zzt();
        zzdq zzdq2 = this.zza;
        zzme2.zza(zzdq2);
    }
}

