/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzpa;
import com.google.android.gms.internal.gtm.zzpq;

final class zzpn
implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ zzpa zzb;
    final /* synthetic */ zzpq zzc;

    public zzpn(zzpq zzpq2, String string2, zzpa zzpa2) {
        this.zza = string2;
        this.zzb = zzpa2;
        this.zzc = zzpq2;
    }

    public final void run() {
        zzpq zzpq2 = this.zzc;
        String string2 = this.zza;
        zzpa zzpa2 = this.zzb;
        zzpq2.zzf(string2, zzpa2);
    }
}

