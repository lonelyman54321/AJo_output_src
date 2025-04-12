/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdl;
import com.google.android.gms.internal.measurement.zzed;
import com.google.android.gms.internal.measurement.zzed$zzb;

final class zzes
extends zzed$zzb {
    private final /* synthetic */ long zzc;
    private final /* synthetic */ zzed zzd;

    public zzes(zzed zzed2, long l2) {
        this.zzc = l2;
        this.zzd = zzed2;
        super(zzed2);
    }

    public final void zza() {
        zzdl zzdl2 = (zzdl)Preconditions.checkNotNull(zzed.zza(this.zzd));
        long l2 = this.zzc;
        zzdl2.setSessionTimeoutDuration(l2);
    }
}

