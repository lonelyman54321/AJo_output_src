/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdl;
import com.google.android.gms.internal.measurement.zzdm;
import com.google.android.gms.internal.measurement.zzed;
import com.google.android.gms.internal.measurement.zzed$zzb;

final class zzfh
extends zzed$zzb {
    private final /* synthetic */ zzdm zzc;
    private final /* synthetic */ int zzd;
    private final /* synthetic */ zzed zze;

    public zzfh(zzed zzed2, zzdm zzdm2, int n3) {
        this.zzc = zzdm2;
        this.zzd = n3;
        this.zze = zzed2;
        super(zzed2);
    }

    public final void zza() {
        zzdl zzdl2 = (zzdl)Preconditions.checkNotNull(zzed.zza(this.zze));
        zzdm zzdm2 = this.zzc;
        int n3 = this.zzd;
        zzdl2.getTestFlag(zzdm2, n3);
    }

    public final void zzb() {
        this.zzc.zza(null);
    }
}

