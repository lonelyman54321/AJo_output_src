/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzme;
import com.google.android.gms.measurement.internal.zzp;
import java.util.concurrent.atomic.AtomicReference;

public final class zzmi
implements Runnable {
    private /* synthetic */ zzme zza;
    private /* synthetic */ AtomicReference zzb;
    private /* synthetic */ zzp zzc;
    private /* synthetic */ Bundle zzd;

    public /* synthetic */ zzmi(zzme zzme2, AtomicReference atomicReference, zzp zzp2, Bundle bundle) {
        this.zza = zzme2;
        this.zzb = atomicReference;
        this.zzc = zzp2;
        this.zzd = bundle;
    }

    public final void run() {
        zzme zzme2 = this.zza;
        AtomicReference atomicReference = this.zzb;
        zzp zzp2 = this.zzc;
        Bundle bundle = this.zzd;
        zzme.zza(zzme2, atomicReference, zzp2, bundle);
    }
}

