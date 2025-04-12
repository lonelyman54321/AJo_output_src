/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzgm;
import com.google.android.gms.internal.gtm.zzhv;

final class zzge
implements Runnable {
    final /* synthetic */ zzgm zza;

    public zzge(zzgm zzgm2) {
        this.zza = zzgm2;
    }

    public final void run() {
        int n3;
        Object object = this.zza;
        int n4 = zzgm.zza((zzgm)object);
        if (n4 == (n3 = 2)) {
            object = zzgm.zzf(this.zza);
            ((zzhv)object).zze();
        }
    }
}

