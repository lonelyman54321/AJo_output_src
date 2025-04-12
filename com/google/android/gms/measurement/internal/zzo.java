/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzdq;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzpn;

final class zzo
implements Runnable {
    private final /* synthetic */ zzdq zza;
    private final /* synthetic */ AppMeasurementDynamiteService zzb;

    public zzo(AppMeasurementDynamiteService appMeasurementDynamiteService, zzdq zzdq2) {
        this.zza = zzdq2;
        this.zzb = appMeasurementDynamiteService;
    }

    public final void run() {
        zzpn zzpn2 = this.zzb.zza.zzv();
        zzdq zzdq2 = this.zza;
        boolean bl2 = this.zzb.zza.zzad();
        zzpn2.zza(zzdq2, bl2);
    }
}

