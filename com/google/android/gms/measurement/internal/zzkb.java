/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzju;
import java.util.List;

public final class zzkb
implements Runnable {
    private /* synthetic */ zzju zza;
    private /* synthetic */ List zzb;

    public /* synthetic */ zzkb(zzju zzju2, List list) {
        this.zza = zzju2;
        this.zzb = list;
    }

    public final void run() {
        zzju zzju2 = this.zza;
        List list = this.zzb;
        zzju.zza(zzju2, list);
    }
}

