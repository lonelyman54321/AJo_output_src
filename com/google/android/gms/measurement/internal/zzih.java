/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzig;
import com.google.android.gms.measurement.internal.zzp;

public final class zzih
implements Runnable {
    private /* synthetic */ zzig zza;
    private /* synthetic */ zzp zzb;

    public /* synthetic */ zzih(zzig zzig2, zzp zzp2) {
        this.zza = zzig2;
        this.zzb = zzp2;
    }

    public final void run() {
        zzig zzig2 = this.zza;
        zzp zzp2 = this.zzb;
        zzig.zza(zzig2, zzp2);
    }
}

