/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzbq;
import com.google.android.gms.internal.gtm.zzbu;

public abstract class zzbr
extends zzbq {
    private boolean zza;

    public zzbr(zzbu zzbu2) {
        super(zzbu2);
    }

    public final void zzV() {
        boolean bl2 = this.zzX();
        if (bl2) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Not initialized");
        throw illegalStateException;
    }

    public final void zzW() {
        this.zzd();
        this.zza = true;
    }

    public final boolean zzX() {
        boolean bl2 = this.zza;
        return bl2;
    }

    public abstract void zzd();
}

