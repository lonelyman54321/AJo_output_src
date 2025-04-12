/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzju;

final class zzlh
implements Runnable {
    private final /* synthetic */ Boolean zza;
    private final /* synthetic */ zzju zzb;

    public zzlh(zzju zzju2, Boolean bl2) {
        this.zza = bl2;
        this.zzb = zzju2;
    }

    public final void run() {
        zzju zzju2 = this.zzb;
        Boolean bl2 = this.zza;
        zzju.zza(zzju2, bl2, true);
    }
}

