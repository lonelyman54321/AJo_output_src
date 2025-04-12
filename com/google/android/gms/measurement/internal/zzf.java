/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzg;
import com.google.android.gms.measurement.internal.zzic;

abstract class zzf
extends zzg {
    private boolean zza;

    public zzf(zzic zzic2) {
        super(zzic2);
        this.zzu.zzac();
    }

    public final boolean zzaa() {
        boolean bl2 = this.zza;
        return bl2;
    }

    public abstract boolean zzab();

    public final void zzw() {
        boolean bl2 = this.zzaa();
        if (bl2) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Not initialized");
        throw illegalStateException;
    }

    public final void zzx() {
        boolean bl2 = this.zza;
        if (!bl2) {
            bl2 = this.zzab();
            if (!bl2) {
                zzic zzic2 = this.zzu;
                zzic2.zzab();
                this.zza = bl2 = true;
            }
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Can't initialize twice");
        throw illegalStateException;
    }

    public final void zzy() {
        boolean bl2 = this.zza;
        if (!bl2) {
            this.zzz();
            this.zzu.zzab();
            this.zza = true;
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Can't initialize twice");
        throw illegalStateException;
    }

    public void zzz() {
    }
}

