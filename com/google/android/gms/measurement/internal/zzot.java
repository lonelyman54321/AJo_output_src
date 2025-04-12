/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzok;
import com.google.android.gms.measurement.internal.zzou;

abstract class zzot
extends zzok {
    private boolean zza;

    public zzot(zzou zzou2) {
        super(zzou2);
        this.zzg.zzv();
    }

    public final void zzam() {
        boolean bl2 = this.zzao();
        if (bl2) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Not initialized");
        throw illegalStateException;
    }

    public final void zzan() {
        boolean bl2 = this.zza;
        if (!bl2) {
            this.zzc();
            this.zzg.zzu();
            this.zza = true;
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Can't initialize twice");
        throw illegalStateException;
    }

    public final boolean zzao() {
        boolean bl2 = this.zza;
        return bl2;
    }

    public abstract boolean zzc();
}

