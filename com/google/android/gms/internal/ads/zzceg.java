/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.internal.ads.zzcds;
import com.google.android.gms.internal.ads.zzfuv;

final class zzceg
implements Runnable {
    private final zzcds zza;
    private boolean zzb = false;

    public zzceg(zzcds zzcds2) {
        this.zza = zzcds2;
    }

    private final void zzc() {
        zzfuv zzfuv2 = zzt.zza;
        zzfuv2.removeCallbacks(this);
        zzfuv2.postDelayed(this, 250L);
    }

    public final void run() {
        boolean bl2 = this.zzb;
        if (!bl2) {
            zzcds zzcds2 = this.zza;
            zzcds2.zzt();
            this.zzc();
        }
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzt();
    }

    public final void zzb() {
        this.zzb = false;
        this.zzc();
    }
}

