/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdl;
import com.google.android.gms.internal.measurement.zzdm;
import com.google.android.gms.internal.measurement.zzed;
import com.google.android.gms.internal.measurement.zzed$zzb;

final class zzfd
extends zzed$zzb {
    private final /* synthetic */ Bundle zzc;
    private final /* synthetic */ zzdm zzd;
    private final /* synthetic */ zzed zze;

    public zzfd(zzed zzed2, Bundle bundle, zzdm zzdm2) {
        this.zzc = bundle;
        this.zzd = zzdm2;
        this.zze = zzed2;
        super(zzed2);
    }

    public final void zza() {
        zzdl zzdl2 = (zzdl)Preconditions.checkNotNull(zzed.zza(this.zze));
        Bundle bundle = this.zzc;
        zzdm zzdm2 = this.zzd;
        long l2 = this.zza;
        zzdl2.performAction(bundle, zzdm2, l2);
    }

    public final void zzb() {
        this.zzd.zza(null);
    }
}

