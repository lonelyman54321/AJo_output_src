/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzbp;
import com.google.android.gms.internal.gtm.zzcj;
import com.google.android.gms.internal.gtm.zzcy;

final class zzbn
implements Runnable {
    final /* synthetic */ zzcy zza;
    final /* synthetic */ zzbp zzb;

    public zzbn(zzbp zzbp2, zzcy zzcy2) {
        this.zza = zzcy2;
        this.zzb = zzbp2;
    }

    public final void run() {
        zzcj zzcj2 = zzbp.zzb(this.zzb);
        zzcy zzcy2 = this.zza;
        zzcj2.zzf(zzcy2);
    }
}

