/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzed;

abstract class zzed$zzb
implements Runnable {
    final long zza;
    final long zzb;
    private final boolean zzc;
    private final /* synthetic */ zzed zzd;

    public zzed$zzb(zzed zzed2) {
        this(zzed2, true);
    }

    public zzed$zzb(zzed zzed2, boolean bl2) {
        long l2;
        this.zzd = zzed2;
        this.zza = l2 = zzed2.zza.currentTimeMillis();
        this.zzb = l2 = zzed2.zza.elapsedRealtime();
        this.zzc = bl2;
    }

    public void run() {
        zzed zzed2 = this.zzd;
        boolean bl2 = zzed.zzc(zzed2);
        if (bl2) {
            this.zzb();
            return;
        }
        try {
            this.zza();
            return;
        }
        catch (Exception exception) {
            zzed zzed3 = this.zzd;
            boolean bl3 = this.zzc;
            zzed.zza(zzed3, exception, false, bl3);
            this.zzb();
            return;
        }
    }

    public abstract void zza();

    public void zzb() {
    }
}

