/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzbb;
import com.google.android.gms.measurement.internal.zzjh;

final class zzba
implements Runnable {
    private final /* synthetic */ zzjh zza;
    private final /* synthetic */ zzbb zzb;

    public zzba(zzbb zzbb2, zzjh zzjh2) {
        this.zza = zzjh2;
        this.zzb = zzbb2;
    }

    public final void run() {
        Object object = this.zza;
        object.zzd();
        boolean bl2 = zzaf.zza();
        if (bl2) {
            this.zza.zzl().zzb(this);
            return;
        }
        object = this.zzb;
        bl2 = ((zzbb)object).zzc();
        zzbb zzbb2 = this.zzb;
        long l2 = 0L;
        zzbb.zza(zzbb2, l2);
        if (bl2) {
            object = this.zzb;
            ((zzbb)object).zzb();
        }
    }
}

