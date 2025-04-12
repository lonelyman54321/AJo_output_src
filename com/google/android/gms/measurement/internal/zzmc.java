/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzlw;
import com.google.android.gms.measurement.internal.zzlz;

final class zzmc
implements Runnable {
    private final /* synthetic */ zzlw zza;
    private final /* synthetic */ long zzb;
    private final /* synthetic */ zzlz zzc;

    public zzmc(zzlz zzlz2, zzlw zzlw2, long l2) {
        this.zza = zzlw2;
        this.zzb = l2;
        this.zzc = zzlz2;
    }

    public final void run() {
        zzlz zzlz2 = this.zzc;
        zzlw zzlw2 = this.zza;
        long l2 = this.zzb;
        zzlz.zza(zzlz2, zzlw2, false, l2);
        zzlz2 = this.zzc;
        zzlz2.zza = null;
        zzlz2.zzq().zza((zzlw)null);
    }
}

