/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzme;
import com.google.android.gms.measurement.internal.zzor;
import java.util.concurrent.atomic.AtomicReference;

final class zzmr
extends zzge {
    private final /* synthetic */ AtomicReference zza;

    public zzmr(zzme zzme2, AtomicReference atomicReference) {
        this.zza = atomicReference;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(zzor object) {
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

