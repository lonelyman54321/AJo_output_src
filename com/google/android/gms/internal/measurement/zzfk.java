/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdl;
import com.google.android.gms.internal.measurement.zzed;
import com.google.android.gms.internal.measurement.zzed$zzb;

final class zzfk
extends zzed$zzb {
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ zzed zzd;

    public zzfk(zzed zzed2, boolean bl2) {
        this.zzc = bl2;
        this.zzd = zzed2;
        super(zzed2);
    }

    public final void zza() {
        zzdl zzdl2 = (zzdl)Preconditions.checkNotNull(zzed.zza(this.zzd));
        boolean bl2 = this.zzc;
        zzdl2.setDataCollectionEnabled(bl2);
    }
}

