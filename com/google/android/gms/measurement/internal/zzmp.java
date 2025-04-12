/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zzme;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

final class zzmp
extends zzgd {
    private final /* synthetic */ AtomicReference zza;

    public zzmp(zzme zzme2, AtomicReference atomicReference) {
        this.zza = atomicReference;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(List object) {
        AtomicReference atomicReference = this.zza;
        synchronized (atomicReference) {
            AtomicReference atomicReference2 = this.zza;
            atomicReference2.set(object);
            object = this.zza;
            object.notifyAll();
            return;
        }
    }
}

