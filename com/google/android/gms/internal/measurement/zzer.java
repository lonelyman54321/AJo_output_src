/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdl;
import com.google.android.gms.internal.measurement.zzed;
import com.google.android.gms.internal.measurement.zzed$zzb;

final class zzer
extends zzed$zzb {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzed zzd;

    public zzer(zzed zzed2, String string2) {
        this.zzc = string2;
        this.zzd = zzed2;
        super(zzed2);
    }

    public final void zza() {
        zzdl zzdl2 = (zzdl)Preconditions.checkNotNull(zzed.zza(this.zzd));
        String string2 = this.zzc;
        long l2 = this.zzb;
        zzdl2.beginAdUnitExposure(string2, l2);
    }
}

