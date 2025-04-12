/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzig;
import com.google.android.gms.measurement.internal.zzou;
import com.google.android.gms.measurement.internal.zzp;

final class zzis
implements Runnable {
    private final /* synthetic */ zzag zza;
    private final /* synthetic */ zzp zzb;
    private final /* synthetic */ zzig zzc;

    public zzis(zzig zzig2, zzag zzag2, zzp zzp2) {
        this.zza = zzag2;
        this.zzb = zzp2;
        this.zzc = zzig2;
    }

    public final void run() {
        zzig.zza(this.zzc).zzs();
        Object object = this.zza.zzc.zza();
        if (object == null) {
            object = zzig.zza(this.zzc);
            zzag zzag2 = this.zza;
            zzp zzp2 = this.zzb;
            ((zzou)object).zza(zzag2, zzp2);
            return;
        }
        object = zzig.zza(this.zzc);
        zzag zzag3 = this.zza;
        zzp zzp3 = this.zzb;
        ((zzou)object).zzb(zzag3, zzp3);
    }
}

