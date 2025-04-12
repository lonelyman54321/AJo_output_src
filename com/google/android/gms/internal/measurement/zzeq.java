/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdl;
import com.google.android.gms.internal.measurement.zzed;
import com.google.android.gms.internal.measurement.zzed$zzb;

final class zzeq
extends zzed$zzb {
    private final /* synthetic */ zzed zzc;

    public zzeq(zzed zzed2) {
        this.zzc = zzed2;
        super(zzed2);
    }

    public final void zza() {
        zzdl zzdl2 = (zzdl)Preconditions.checkNotNull(zzed.zza(this.zzc));
        long l2 = this.zza;
        zzdl2.resetAnalyticsData(l2);
    }
}

