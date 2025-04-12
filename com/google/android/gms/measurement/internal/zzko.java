/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzhf;
import com.google.android.gms.measurement.internal.zzju;

final class zzko
implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zzju zzb;

    public zzko(zzju zzju2, long l2) {
        this.zza = l2;
        this.zzb = zzju2;
    }

    public final void run() {
        Object object = this.zzb.zzk().zzf;
        long l2 = this.zza;
        ((zzhf)object).zza(l2);
        object = this.zzb.zzj().zzc();
        Long l3 = this.zza;
        ((zzgq)object).zza("Session timeout duration set", l3);
    }
}

