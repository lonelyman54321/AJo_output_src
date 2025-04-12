/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zza;

final class zzc
implements Runnable {
    private final /* synthetic */ String zza;
    private final /* synthetic */ long zzb;
    private final /* synthetic */ zza zzc;

    public zzc(zza zza2, String string2, long l2) {
        this.zza = string2;
        this.zzb = l2;
        this.zzc = zza2;
    }

    public final void run() {
        zza zza2 = this.zzc;
        String string2 = this.zza;
        long l2 = this.zzb;
        com.google.android.gms.measurement.internal.zza.zza(zza2, string2, l2);
    }
}

