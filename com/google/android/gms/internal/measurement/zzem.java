/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdl;
import com.google.android.gms.internal.measurement.zzeb;
import com.google.android.gms.internal.measurement.zzed;
import com.google.android.gms.internal.measurement.zzed$zzb;

final class zzem
extends zzed$zzb {
    private final /* synthetic */ zzeb zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ zzed zzf;

    public zzem(zzed zzed2, zzeb zzeb2, String string2, String string3) {
        this.zzc = zzeb2;
        this.zzd = string2;
        this.zze = string3;
        this.zzf = zzed2;
        super(zzed2);
    }

    public final void zza() {
        Object object;
        Object object2 = object = Preconditions.checkNotNull(zzed.zza(this.zzf));
        object2 = (zzdl)object;
        zzeb zzeb2 = this.zzc;
        String string2 = this.zzd;
        String string3 = this.zze;
        long l2 = this.zza;
        object2.setCurrentScreenByScionActivityInfo(zzeb2, string2, string3, l2);
    }
}

