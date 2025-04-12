/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzju;

public final class zzjz
implements Runnable {
    private /* synthetic */ zzju zza;
    private /* synthetic */ String zzb;

    public /* synthetic */ zzjz(zzju zzju2, String string2) {
        this.zza = zzju2;
        this.zzb = string2;
    }

    public final void run() {
        zzju zzju2 = this.zza;
        String string2 = this.zzb;
        zzju.zza(zzju2, string2);
    }
}

