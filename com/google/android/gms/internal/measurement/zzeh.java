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

final class zzeh
extends zzed$zzb {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Bundle zze;
    private final /* synthetic */ zzed zzf;

    public zzeh(zzed zzed2, String string2, String string3, Bundle bundle) {
        this.zzc = string2;
        this.zzd = string3;
        this.zze = bundle;
        this.zzf = zzed2;
        super(zzed2);
    }

    public final void zza() {
        zzdl zzdl2 = (zzdl)Preconditions.checkNotNull(zzed.zza(this.zzf));
        String string2 = this.zzc;
        String string3 = this.zzd;
        Bundle bundle = this.zze;
        zzdl2.clearConditionalUserProperty(string2, string3, bundle);
    }
}

