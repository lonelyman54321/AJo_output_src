/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzme;
import com.google.android.gms.measurement.internal.zzop;
import com.google.android.gms.measurement.internal.zzp;
import java.util.concurrent.atomic.AtomicReference;

public final class zzml
implements Runnable {
    private /* synthetic */ zzme zza;
    private /* synthetic */ AtomicReference zzb;
    private /* synthetic */ zzp zzc;
    private /* synthetic */ zzop zzd;

    public /* synthetic */ zzml(zzme zzme2, AtomicReference atomicReference, zzp zzp2, zzop zzop2) {
        this.zza = zzme2;
        this.zzb = atomicReference;
        this.zzc = zzp2;
        this.zzd = zzop2;
    }

    public final void run() {
        zzme zzme2 = this.zza;
        AtomicReference atomicReference = this.zzb;
        zzp zzp2 = this.zzc;
        zzop zzop2 = this.zzd;
        zzme.zza(zzme2, atomicReference, zzp2, zzop2);
    }
}

