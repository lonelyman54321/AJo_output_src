/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzdz;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjs;

final class zzid
implements Runnable {
    private final /* synthetic */ zzjs zza;
    private final /* synthetic */ zzic zzb;

    public zzid(zzic zzic2, zzjs zzjs2) {
        this.zza = zzjs2;
        this.zzb = zzic2;
    }

    public final void run() {
        zzic zzic2 = this.zzb;
        Object object = this.zza;
        zzic.zza(zzic2, (zzjs)object);
        zzic2 = this.zzb;
        object = this.zza.zzg;
        zzic2.zza((zzdz)object);
    }
}

