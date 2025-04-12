/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzf;
import com.google.android.gms.measurement.internal.zzju;
import com.google.android.gms.measurement.internal.zzme;
import java.util.concurrent.atomic.AtomicReference;

final class zzkx
implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zzju zzb;

    public zzkx(zzju zzju2, long l2) {
        this.zza = l2;
        this.zzb = zzju2;
    }

    public final void run() {
        zzf zzf2 = this.zzb;
        long l2 = this.zza;
        ((zzju)zzf2).zzb(l2);
        zzf2 = this.zzb.zzq();
        AtomicReference atomicReference = new AtomicReference();
        ((zzme)zzf2).zza(atomicReference);
    }
}

