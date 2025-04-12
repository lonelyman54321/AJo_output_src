/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzou;
import com.google.android.gms.measurement.internal.zzpf;

final class zzow
implements Runnable {
    private final /* synthetic */ zzpf zza;
    private final /* synthetic */ zzou zzb;

    public zzow(zzou zzou2, zzpf zzpf2) {
        this.zza = zzpf2;
        this.zzb = zzou2;
    }

    public final void run() {
        zzou zzou2 = this.zzb;
        zzpf zzpf2 = this.zza;
        zzou.zza(zzou2, zzpf2);
        this.zzb.zzw();
    }
}

