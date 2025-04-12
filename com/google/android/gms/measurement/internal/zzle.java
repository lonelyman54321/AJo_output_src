/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzgg;
import com.google.android.gms.measurement.internal.zzju;
import java.util.concurrent.atomic.AtomicReference;

final class zzle
implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ zzju zzb;

    public zzle(zzju zzju2, AtomicReference atomicReference) {
        this.zza = atomicReference;
        this.zzb = zzju2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        AtomicReference atomicReference = this.zza;
        synchronized (atomicReference) {
            AtomicReference atomicReference2;
            try {
                atomicReference2 = this.zza;
                Object object = this.zzb;
                object = ((zzju)object).zze();
                Object object2 = this.zzb;
                object2 = ((zzju)object2).zzg();
                object2 = ((zzgg)object2).zzaf();
                zzfx zzfx2 = zzbn.zzay;
                double d2 = ((zzai)object).zza((String)object2, zzfx2);
                object = d2;
                atomicReference2.set(object);
            }
            catch (Throwable throwable) {
                AtomicReference atomicReference3 = this.zza;
                atomicReference3.notify();
                throw throwable;
            }
            try {
                atomicReference2 = this.zza;
                atomicReference2.notify();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

