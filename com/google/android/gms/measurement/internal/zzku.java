/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzbb;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjh;
import com.google.android.gms.measurement.internal.zzju;

final class zzku
extends zzbb {
    private final /* synthetic */ zzju zza;

    public zzku(zzju zzju2, zzjh zzjh2) {
        this.zza = zzju2;
        super(zzjh2);
    }

    public final void zzb() {
        Object object = this.zza.zzu;
        boolean bl2 = ((zzic)object).zzaj();
        if (bl2) {
            object = zzju.zzb(this.zza);
            long l2 = 2000L;
            ((zzbb)object).zza(l2);
        }
    }
}

