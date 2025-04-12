/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzju;

final class zzkz
implements Runnable {
    private final /* synthetic */ Bundle zza;
    private final /* synthetic */ zzju zzb;

    public zzkz(zzju zzju2, Bundle bundle) {
        this.zza = bundle;
        this.zzb = zzju2;
    }

    public final void run() {
        zzju zzju2 = this.zzb;
        Bundle bundle = this.zza;
        zzju.zzb(zzju2, bundle);
    }
}

