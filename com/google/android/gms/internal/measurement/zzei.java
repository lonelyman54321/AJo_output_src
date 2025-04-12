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
import com.google.android.gms.internal.measurement.zzed;
import com.google.android.gms.internal.measurement.zzed$zzb;

final class zzei
extends zzed$zzb {
    private final /* synthetic */ Bundle zzc;
    private final /* synthetic */ zzed zzd;

    public zzei(zzed zzed2, Bundle bundle) {
        this.zzc = bundle;
        this.zzd = zzed2;
        super(zzed2);
    }

    public final void zza() {
        zzdl zzdl2 = (zzdl)Preconditions.checkNotNull(zzed.zza(this.zzd));
        Bundle bundle = this.zzc;
        long l2 = this.zza;
        zzdl2.setConditionalUserProperty(bundle, l2);
    }
}

