/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzio;
import com.google.android.gms.internal.gtm.zzix;
import java.util.concurrent.ExecutorService;

final class zzip
implements Runnable {
    final /* synthetic */ zzix zza;

    public zzip(zzix zzix2) {
        this.zza = zzix2;
    }

    public final void run() {
        ExecutorService executorService = zzix.zzj(this.zza);
        zzio zzio2 = new zzio(this);
        executorService.execute(zzio2);
    }
}

