/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdl;
import com.google.android.gms.internal.measurement.zzdm;
import com.google.android.gms.internal.measurement.zzed;
import com.google.android.gms.internal.measurement.zzed$zzb;

final class zzez
extends zzed$zzb {
    private final /* synthetic */ zzdm zzc;
    private final /* synthetic */ zzed zzd;

    public zzez(zzed zzed2, zzdm zzdm2) {
        this.zzc = zzdm2;
        this.zzd = zzed2;
        super(zzed2);
    }

    public final void zza() {
        zzdl zzdl2 = (zzdl)Preconditions.checkNotNull(zzed.zza(this.zzd));
        zzdm zzdm2 = this.zzc;
        zzdl2.getCurrentScreenClass(zzdm2);
    }

    public final void zzb() {
        this.zzc.zza(null);
    }
}

