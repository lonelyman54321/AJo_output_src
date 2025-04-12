/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdl;
import com.google.android.gms.internal.measurement.zzdm;
import com.google.android.gms.internal.measurement.zzed;
import com.google.android.gms.internal.measurement.zzed$zzb;

final class zzek
extends zzed$zzb {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ zzdm zze;
    private final /* synthetic */ zzed zzf;

    public zzek(zzed zzed2, String string2, String string3, zzdm zzdm2) {
        this.zzc = string2;
        this.zzd = string3;
        this.zze = zzdm2;
        this.zzf = zzed2;
        super(zzed2);
    }

    public final void zza() {
        zzdl zzdl2 = (zzdl)Preconditions.checkNotNull(zzed.zza(this.zzf));
        String string2 = this.zzc;
        String string3 = this.zzd;
        zzdm zzdm2 = this.zze;
        zzdl2.getConditionalUserProperties(string2, string3, zzdm2);
    }

    public final void zzb() {
        this.zze.zza(null);
    }
}

