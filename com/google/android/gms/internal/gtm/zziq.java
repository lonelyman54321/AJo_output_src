/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzir;
import com.google.android.gms.internal.gtm.zzix;

final class zziq
implements Runnable {
    final /* synthetic */ zzir zza;

    public zziq(zzir zzir2) {
        this.zza = zzir2;
    }

    public final void run() {
        zzhi.zzd("App's UI deactivated. Dispatching hits.");
        zzix.zzg(this.zza.zza).zza();
    }
}

