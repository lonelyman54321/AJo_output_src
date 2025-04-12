/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzju;
import com.google.android.gms.measurement.internal.zzme;
import java.util.concurrent.atomic.AtomicReference;

final class zzkv
implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ boolean zzb;
    private final /* synthetic */ zzju zzc;

    public zzkv(zzju zzju2, AtomicReference atomicReference, boolean bl2) {
        this.zza = atomicReference;
        this.zzb = bl2;
        this.zzc = zzju2;
    }

    public final void run() {
        zzme zzme2 = this.zzc.zzq();
        AtomicReference atomicReference = this.zza;
        boolean bl2 = this.zzb;
        zzme2.zza(atomicReference, bl2);
    }
}

