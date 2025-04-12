/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentCallbacks2
 *  android.content.res.Configuration
 */
package com.google.android.gms.internal.gtm;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.google.android.gms.internal.gtm.zziq;
import com.google.android.gms.internal.gtm.zzix;
import java.util.concurrent.ExecutorService;

final class zzir
implements ComponentCallbacks2 {
    final /* synthetic */ zzix zza;

    public zzir(zzix zzix2) {
        this.zza = zzix2;
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int n3) {
        int n4 = 20;
        if (n3 == n4) {
            ExecutorService executorService = zzix.zzj(this.zza);
            zziq zziq2 = new zziq(this);
            executorService.execute(zziq2);
        }
    }
}

