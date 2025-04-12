/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
package com.google.android.gms.internal.measurement;

import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdl;
import com.google.android.gms.internal.measurement.zzed;
import com.google.android.gms.internal.measurement.zzed$zzb;

final class zzfm
extends zzed$zzb {
    private final /* synthetic */ Intent zzc;
    private final /* synthetic */ zzed zzd;

    public zzfm(zzed zzed2, Intent intent) {
        this.zzc = intent;
        this.zzd = zzed2;
        super(zzed2);
    }

    public final void zza() {
        zzdl zzdl2 = (zzdl)Preconditions.checkNotNull(zzed.zza(this.zzd));
        Intent intent = this.zzc;
        zzdl2.setSgtmDebugInfo(intent);
    }
}

