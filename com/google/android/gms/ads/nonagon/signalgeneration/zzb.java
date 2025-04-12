/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.nonagon.signalgeneration.zze;

public final class zzb
implements Runnable {
    public final /* synthetic */ zze zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ boolean zzc;

    public /* synthetic */ zzb(zze zze2, boolean bl2, boolean bl3) {
        this.zza = zze2;
        this.zzb = bl2;
        this.zzc = bl3;
    }

    public final void run() {
        zze zze2 = this.zza;
        boolean bl2 = this.zzb;
        boolean bl3 = this.zzc;
        zze2.zzd(bl2, bl3);
    }
}

