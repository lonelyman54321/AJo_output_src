/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdl;
import com.google.android.gms.internal.measurement.zzdm;
import com.google.android.gms.internal.measurement.zzed;
import com.google.android.gms.internal.measurement.zzed$zzb;

final class zzfg
extends zzed$zzb {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzdm zzd;
    private final /* synthetic */ zzed zze;

    public zzfg(zzed zzed2, String string2, zzdm zzdm2) {
        this.zzc = string2;
        this.zzd = zzdm2;
        this.zze = zzed2;
        super(zzed2);
    }

    public final void zza() {
        zzdl zzdl2 = (zzdl)Preconditions.checkNotNull(zzed.zza(this.zze));
        String string2 = this.zzc;
        zzdm zzdm2 = this.zzd;
        zzdl2.getMaxUserProperties(string2, zzdm2);
    }

    public final void zzb() {
        this.zzd.zza(null);
    }
}

