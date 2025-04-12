/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdl;
import com.google.android.gms.internal.measurement.zzed;
import com.google.android.gms.internal.measurement.zzed$zzb;

final class zzel
extends zzed$zzb {
    private final /* synthetic */ Boolean zzc;
    private final /* synthetic */ zzed zzd;

    public zzel(zzed zzed2, Boolean bl2) {
        this.zzc = bl2;
        this.zzd = zzed2;
        super(zzed2);
    }

    public final void zza() {
        Object object = this.zzc;
        if (object != null) {
            object = (zzdl)Preconditions.checkNotNull(zzed.zza(this.zzd));
            boolean bl2 = this.zzc;
            long l2 = this.zza;
            object.setMeasurementEnabled(bl2, l2);
            return;
        }
        object = (zzdl)Preconditions.checkNotNull(zzed.zza(this.zzd));
        long l3 = this.zza;
        object.clearMeasurementEnabled(l3);
    }
}

