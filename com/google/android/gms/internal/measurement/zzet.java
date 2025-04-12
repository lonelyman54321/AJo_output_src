/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdl;
import com.google.android.gms.internal.measurement.zzed;
import com.google.android.gms.internal.measurement.zzed$zzb;
import com.google.android.gms.internal.measurement.zzew;

final class zzet
extends zzed$zzb {
    private final /* synthetic */ Runnable zzc;
    private final /* synthetic */ zzed zzd;

    public zzet(zzed zzed2, Runnable runnable2) {
        this.zzc = runnable2;
        this.zzd = zzed2;
        super(zzed2);
    }

    public final void zza() {
        zzdl zzdl2 = (zzdl)Preconditions.checkNotNull(zzed.zza(this.zzd));
        Runnable runnable2 = this.zzc;
        zzew zzew2 = new zzew(this, runnable2);
        zzdl2.retrieveAndUploadBatches(zzew2);
    }
}

