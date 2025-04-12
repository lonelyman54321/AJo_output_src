/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjw;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzlo;

public abstract class zzkg$zzb
extends zzkg
implements zzlo {
    protected zzjw zzc;

    public zzkg$zzb() {
        zzjw zzjw2;
        this.zzc = zzjw2 = zzjw.zzb();
    }

    public final zzjw zza() {
        zzjw zzjw2 = this.zzc;
        boolean bl2 = zzjw2.zzf();
        if (bl2) {
            this.zzc = zzjw2 = (zzjw)this.zzc.clone();
        }
        return this.zzc;
    }
}

