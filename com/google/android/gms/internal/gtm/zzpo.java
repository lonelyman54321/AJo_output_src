/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzpa;
import com.google.android.gms.internal.gtm.zzpq;

final class zzpo
implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzpa zzc;
    final /* synthetic */ zzpq zzd;

    public zzpo(zzpq zzpq2, String string2, String string3, zzpa zzpa2) {
        this.zza = string2;
        this.zzb = string3;
        this.zzc = zzpa2;
        this.zzd = zzpq2;
    }

    public final void run() {
        zzpq zzpq2 = this.zzd;
        String string2 = this.zza;
        String string3 = this.zzb;
        zzpa zzpa2 = this.zzc;
        zzpq2.zzd(string2, string3, zzpa2);
    }
}

