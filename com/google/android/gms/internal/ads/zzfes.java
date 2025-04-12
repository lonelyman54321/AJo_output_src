/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzfev;
import com.google.android.gms.internal.ads.zzfew;
import com.google.android.gms.internal.ads.zzffw;

public final class zzfes
implements Runnable {
    public final /* synthetic */ zzfev zza;
    public final /* synthetic */ zze zzb;

    public /* synthetic */ zzfes(zzfev zzfev2, zze zze2) {
        this.zza = zzfev2;
        this.zzb = zze2;
    }

    public final void run() {
        zzffw zzffw2 = zzfew.zzd(this.zza.zze);
        zze zze2 = this.zzb;
        zzffw2.zzdB(zze2);
    }
}

