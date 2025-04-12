/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzju;

public final class zzka
implements Runnable {
    private /* synthetic */ zzju zza;
    private /* synthetic */ Bundle zzb;

    public /* synthetic */ zzka(zzju zzju2, Bundle bundle) {
        this.zza = zzju2;
        this.zzb = bundle;
    }

    public final void run() {
        zzju zzju2 = this.zza;
        Bundle bundle = this.zzb;
        zzju.zza(zzju2, bundle);
    }
}

