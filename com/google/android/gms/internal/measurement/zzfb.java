/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdl;
import com.google.android.gms.internal.measurement.zzed;
import com.google.android.gms.internal.measurement.zzed$zza;
import com.google.android.gms.internal.measurement.zzed$zzb;

final class zzfb
extends zzed$zzb {
    private final /* synthetic */ zzed$zza zzc;
    private final /* synthetic */ zzed zzd;

    public zzfb(zzed zzed2, zzed$zza zzed$zza) {
        this.zzc = zzed$zza;
        this.zzd = zzed2;
        super(zzed2);
    }

    public final void zza() {
        zzdl zzdl2 = (zzdl)Preconditions.checkNotNull(zzed.zza(this.zzd));
        zzed$zza zzed$zza = this.zzc;
        zzdl2.setEventInterceptor(zzed$zza);
    }
}

