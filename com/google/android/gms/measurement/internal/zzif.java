/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzig;
import com.google.android.gms.measurement.internal.zzp;

public final class zzif
implements Runnable {
    private /* synthetic */ zzig zza;
    private /* synthetic */ zzp zzb;
    private /* synthetic */ zzae zzc;

    public /* synthetic */ zzif(zzig zzig2, zzp zzp2, zzae zzae2) {
        this.zza = zzig2;
        this.zzb = zzp2;
        this.zzc = zzae2;
    }

    public final void run() {
        zzig zzig2 = this.zza;
        zzp zzp2 = this.zzb;
        zzae zzae2 = this.zzc;
        zzig.zza(zzig2, zzp2, zzae2);
    }
}

