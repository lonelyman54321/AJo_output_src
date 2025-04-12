/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzgm;
import com.google.android.gms.tasks.OnFailureListener;

public final class zzgp
implements OnFailureListener {
    private /* synthetic */ zzgm zza;
    private /* synthetic */ long zzb;

    public /* synthetic */ zzgp(zzgm zzgm2, long l2) {
        this.zza = zzgm2;
        this.zzb = l2;
    }

    public final void onFailure(Exception exception) {
        zzgm zzgm2 = this.zza;
        long l2 = this.zzb;
        zzgm.zza(zzgm2, l2, exception);
    }
}

