/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzip;
import com.google.android.gms.internal.gtm.zzix;
import java.util.concurrent.ExecutorService;

final class zzio
implements Runnable {
    final /* synthetic */ zzip zza;

    public zzio(zzip zzip2) {
        this.zza = zzip2;
    }

    public final void run() {
        int n3;
        Object object = this.zza.zza;
        int n4 = zzix.zza((zzix)object);
        if (n4 == (n3 = 1) || (n4 = zzix.zza((zzix)object)) == (n3 = 2)) {
            boolean bl2;
            n4 = 4;
            zzix.zzl((zzix)object, n4);
            object = "Container load timed out after 5000ms.";
            zzhi.zza((String)object);
            while (!(bl2 = (object = zzix.zzi(this.zza.zza)).isEmpty())) {
                object = this.zza.zza;
                ExecutorService executorService = zzix.zzj((zzix)object);
                object = (Runnable)zzix.zzi((zzix)object).remove();
                executorService.execute((Runnable)object);
            }
        }
    }
}

