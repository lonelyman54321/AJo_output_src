/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzju;
import java.util.concurrent.atomic.AtomicReference;

public final class zzjy
implements Runnable {
    private /* synthetic */ zzju zza;
    private /* synthetic */ AtomicReference zzb;

    public /* synthetic */ zzjy(zzju zzju2, AtomicReference atomicReference) {
        this.zza = zzju2;
        this.zzb = atomicReference;
    }

    public final void run() {
        zzju zzju2 = this.zza;
        AtomicReference atomicReference = this.zzb;
        zzju.zza(zzju2, atomicReference);
    }
}

