/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zznr;
import com.google.android.gms.measurement.internal.zzou;

final class zznv
implements Runnable {
    private final /* synthetic */ zzou zza;
    private final /* synthetic */ Runnable zzb;

    public zznv(zznr zznr2, zzou zzou2, Runnable runnable2) {
        this.zza = zzou2;
        this.zzb = runnable2;
    }

    public final void run() {
        this.zza.zzs();
        zzou zzou2 = this.zza;
        Runnable runnable2 = this.zzb;
        zzou2.zza(runnable2);
        this.zza.zzx();
    }
}

