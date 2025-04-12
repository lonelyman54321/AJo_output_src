/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzbp;
import com.google.android.gms.internal.gtm.zzcj;

final class zzbk
implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzbp zzb;

    public zzbk(zzbp zzbp2, int n3) {
        this.zza = n3;
        this.zzb = zzbp2;
    }

    public final void run() {
        long l2 = this.zza;
        zzcj zzcj2 = zzbp.zzb(this.zzb);
        zzcj2.zzY(l2 *= 1000L);
    }
}

