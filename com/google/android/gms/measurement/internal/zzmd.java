/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zza;
import com.google.android.gms.measurement.internal.zzlz;

final class zzmd
implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zzlz zzb;

    public zzmd(zzlz zzlz2, long l2) {
        this.zza = l2;
        this.zzb = zzlz2;
    }

    public final void run() {
        zza zza2 = this.zzb.zzc();
        long l2 = this.zza;
        zza2.zza(l2);
        this.zzb.zza = null;
    }
}

