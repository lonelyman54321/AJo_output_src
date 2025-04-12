/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdl;
import com.google.android.gms.internal.measurement.zzed;
import com.google.android.gms.internal.measurement.zzed$zzb;
import com.google.android.gms.internal.measurement.zzed$zzd;

final class zzfo
extends zzed$zzb {
    private final /* synthetic */ zzed$zzd zzc;
    private final /* synthetic */ zzed zzd;

    public zzfo(zzed zzed2, zzed$zzd zzed$zzd) {
        this.zzc = zzed$zzd;
        this.zzd = zzed2;
        super(zzed2);
    }

    public final void zza() {
        zzdl zzdl2 = (zzdl)Preconditions.checkNotNull(zzed.zza(this.zzd));
        zzed$zzd zzed$zzd = this.zzc;
        zzdl2.unregisterOnMeasurementEventListener(zzed$zzd);
    }
}

