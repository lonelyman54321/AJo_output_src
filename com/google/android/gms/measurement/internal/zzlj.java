/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzjj;
import com.google.android.gms.measurement.internal.zzju;

final class zzlj
implements Runnable {
    private final /* synthetic */ zzjj zza;
    private final /* synthetic */ long zzb;
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ zzju zzd;

    public zzlj(zzju zzju2, zzjj zzjj2, long l2, boolean bl2) {
        this.zza = zzjj2;
        this.zzb = l2;
        this.zzc = bl2;
        this.zzd = zzju2;
    }

    public final void run() {
        zzju zzju2 = this.zzd;
        zzjj zzjj2 = this.zza;
        zzju2.zza(zzjj2);
        zzju zzju3 = this.zzd;
        zzjj zzjj3 = this.zza;
        long l2 = this.zzb;
        boolean bl2 = this.zzc;
        zzju.zza(zzju3, zzjj3, l2, true, bl2);
    }
}

