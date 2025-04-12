/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzffw;
import com.google.android.gms.internal.ads.zzfgd;
import com.google.android.gms.internal.ads.zzfgg;

public final class zzfgb
implements Runnable {
    public final /* synthetic */ zzfgd zza;
    public final /* synthetic */ zze zzb;

    public /* synthetic */ zzfgb(zzfgd zzfgd2, zze zze2) {
        this.zza = zzfgd2;
        this.zzb = zze2;
    }

    public final void run() {
        zzffw zzffw2 = zzfgg.zzf(this.zza.zze);
        zze zze2 = this.zzb;
        zzffw2.zzdB(zze2);
    }
}

