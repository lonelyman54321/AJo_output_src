/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzig;
import com.google.android.gms.measurement.internal.zzou;
import com.google.android.gms.measurement.internal.zzp;
import com.google.android.gms.measurement.internal.zzpm;

final class zzje
implements Runnable {
    private final /* synthetic */ zzpm zza;
    private final /* synthetic */ zzp zzb;
    private final /* synthetic */ zzig zzc;

    public zzje(zzig zzig2, zzpm zzpm2, zzp zzp2) {
        this.zza = zzpm2;
        this.zzb = zzp2;
        this.zzc = zzig2;
    }

    public final void run() {
        zzig.zza(this.zzc).zzs();
        Object object = this.zza.zza();
        if (object == null) {
            object = zzig.zza(this.zzc);
            String string2 = this.zza.zza;
            zzp zzp2 = this.zzb;
            ((zzou)object).zza(string2, zzp2);
            return;
        }
        object = zzig.zza(this.zzc);
        zzpm zzpm2 = this.zza;
        zzp zzp3 = this.zzb;
        ((zzou)object).zza(zzpm2, zzp3);
    }
}

