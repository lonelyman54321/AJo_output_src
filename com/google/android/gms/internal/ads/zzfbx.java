/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzfby;
import com.google.android.gms.internal.ads.zzfcb;
import com.google.android.gms.internal.ads.zzfcr;

public final class zzfbx
implements Runnable {
    public final /* synthetic */ zzfby zza;
    public final /* synthetic */ zze zzb;

    public /* synthetic */ zzfbx(zzfby zzfby2, zze zze2) {
        this.zza = zzfby2;
        this.zzb = zze2;
    }

    public final void run() {
        zzfcr zzfcr2 = zzfcb.zzf(this.zza.zze);
        zze zze2 = this.zzb;
        zzfcr2.zzdB(zze2);
    }
}

