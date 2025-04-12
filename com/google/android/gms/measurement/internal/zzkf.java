/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzju;

public final class zzkf
implements Runnable {
    private /* synthetic */ zzju zza;
    private /* synthetic */ Bundle zzb;
    private /* synthetic */ long zzc;

    public /* synthetic */ zzkf(zzju zzju2, Bundle bundle, long l2) {
        this.zza = zzju2;
        this.zzb = bundle;
        this.zzc = l2;
    }

    public final void run() {
        zzju zzju2 = this.zza;
        Bundle bundle = this.zzb;
        long l2 = this.zzc;
        zzju.zza(zzju2, bundle, l2);
    }
}

