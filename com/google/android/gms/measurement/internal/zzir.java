/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzig;
import com.google.android.gms.measurement.internal.zzou;

final class zzir
implements Runnable {
    private final /* synthetic */ zzag zza;
    private final /* synthetic */ zzig zzb;

    public zzir(zzig zzig2, zzag zzag2) {
        this.zza = zzag2;
        this.zzb = zzig2;
    }

    public final void run() {
        zzig.zza(this.zzb).zzs();
        Object object = this.zza.zzc.zza();
        if (object == null) {
            object = zzig.zza(this.zzb);
            zzag zzag2 = this.zza;
            ((zzou)object).zza(zzag2);
            return;
        }
        object = zzig.zza(this.zzb);
        zzag zzag3 = this.zza;
        ((zzou)object).zzb(zzag3);
    }
}

