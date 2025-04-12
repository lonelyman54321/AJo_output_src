/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzbps;
import com.google.android.gms.internal.ads.zzbpt;

public final class zzbpd
implements Runnable {
    public final /* synthetic */ zzbpt zza;
    public final /* synthetic */ zzbps zzb;

    public /* synthetic */ zzbpd(zzbpt zzbpt2, zzaxd zzaxd2, zzbps zzbps2) {
        this.zza = zzbpt2;
        this.zzb = zzbps2;
    }

    public final void run() {
        zzbpt zzbpt2 = this.zza;
        zzbps zzbps2 = this.zzb;
        zzbpt2.zzj(null, zzbps2);
    }
}

