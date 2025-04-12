/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zza;

final class zze
implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zza zzb;

    public zze(zza zza2, long l2) {
        this.zza = l2;
        this.zzb = zza2;
    }

    public final void run() {
        zza zza2 = this.zzb;
        long l2 = this.zza;
        com.google.android.gms.measurement.internal.zza.zza(zza2, l2);
    }
}

