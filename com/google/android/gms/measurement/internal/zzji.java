/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjf;

abstract class zzji
extends zzjf {
    private boolean zza;

    public zzji(zzic zzic2) {
        super(zzic2);
        this.zzu.zzac();
    }

    public void zzab() {
    }

    public final void zzad() {
        boolean bl2 = this.zzag();
        if (bl2) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Not initialized");
        throw illegalStateException;
    }

    public final void zzae() {
        boolean bl2 = this.zza;
        if (!bl2) {
            bl2 = this.zzh();
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

    public final void zzaf() {
        boolean bl2 = this.zza;
        if (!bl2) {
            this.zzab();
            this.zzu.zzab();
            this.zza = true;
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Can't initialize twice");
        throw illegalStateException;
    }

    public final boolean zzag() {
        boolean bl2 = this.zza;
        return bl2;
    }

    public abstract boolean zzh();
}

