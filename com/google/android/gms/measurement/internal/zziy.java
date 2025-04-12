/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzig;
import com.google.android.gms.measurement.internal.zzou;
import com.google.android.gms.measurement.internal.zzp;

final class zziy
implements Runnable {
    private final /* synthetic */ zzp zza;
    private final /* synthetic */ zzig zzb;

    public zziy(zzig zzig2, zzp zzp2) {
        this.zza = zzp2;
        this.zzb = zzig2;
    }

    public final void run() {
        zzig.zza(this.zzb).zzs();
        zzou zzou2 = zzig.zza(this.zzb);
        zzp zzp2 = this.zza;
        zzou2.zzl().zzv();
        zzou2.zzt();
        Preconditions.checkNotEmpty(zzp2.zza);
        zzou2.zzg(zzp2);
        zzou2.zzf(zzp2);
    }
}

