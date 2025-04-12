/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdl;
import com.google.android.gms.internal.measurement.zzdm;
import com.google.android.gms.internal.measurement.zzed;
import com.google.android.gms.internal.measurement.zzed$zzb;

final class zzfc
extends zzed$zzb {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ boolean zze;
    private final /* synthetic */ zzdm zzf;
    private final /* synthetic */ zzed zzg;

    public zzfc(zzed zzed2, String string2, String string3, boolean bl2, zzdm zzdm2) {
        this.zzc = string2;
        this.zzd = string3;
        this.zze = bl2;
        this.zzf = zzdm2;
        this.zzg = zzed2;
        super(zzed2);
    }

    public final void zza() {
        zzdl zzdl2 = (zzdl)Preconditions.checkNotNull(zzed.zza(this.zzg));
        String string2 = this.zzc;
        String string3 = this.zzd;
        boolean bl2 = this.zze;
        zzdm zzdm2 = this.zzf;
        zzdl2.getUserProperties(string2, string3, bl2, zzdm2);
    }

    public final void zzb() {
        this.zzf.zza(null);
    }
}

