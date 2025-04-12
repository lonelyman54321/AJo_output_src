/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzbb;
import com.google.android.gms.measurement.internal.zzjh;
import com.google.android.gms.measurement.internal.zzoi;

final class zzol
extends zzbb {
    private final /* synthetic */ zzoi zza;

    public zzol(zzoi zzoi2, zzjh zzjh2) {
        this.zza = zzoi2;
        super(zzjh2);
    }

    public final void zzb() {
        this.zza.zzr();
        this.zza.zzj().zzq().zza("Starting upload from DelayedRunnable");
        this.zza.zzg.zzx();
    }
}

