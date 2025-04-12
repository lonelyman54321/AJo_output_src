/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzbp;
import com.google.android.gms.internal.gtm.zzcj;
import com.google.android.gms.internal.gtm.zzek;

final class zzbl
implements Runnable {
    final /* synthetic */ zzek zza;
    final /* synthetic */ zzbp zzb;

    public zzbl(zzbp zzbp2, zzek zzek2) {
        this.zza = zzek2;
        this.zzb = zzbp2;
    }

    public final void run() {
        zzcj zzcj2 = zzbp.zzb(this.zzb);
        zzek zzek2 = this.zza;
        zzcj2.zzj(zzek2);
    }
}

