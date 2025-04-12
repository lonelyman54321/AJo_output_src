/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzgj;
import com.google.android.gms.internal.gtm.zzgm;
import java.util.concurrent.ExecutorService;

final class zzgf
implements Runnable {
    final /* synthetic */ zzgm zza;

    public zzgf(zzgm zzgm2) {
        this.zza = zzgm2;
    }

    public final void run() {
        zzgm zzgm2 = this.zza;
        ExecutorService executorService = zzgm.zzm(zzgm2);
        zzgj zzgj2 = new zzgj(zzgm2, null);
        executorService.execute(zzgj2);
    }
}

