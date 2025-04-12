/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzepc;
import com.google.android.gms.internal.ads.zzfev;
import com.google.android.gms.internal.ads.zzfew;

public final class zzfer
implements Runnable {
    public final /* synthetic */ zzfev zza;
    public final /* synthetic */ zze zzb;

    public /* synthetic */ zzfer(zzfev zzfev2, zze zze2) {
        this.zza = zzfev2;
        this.zzb = zze2;
    }

    public final void run() {
        zzepc zzepc2 = zzfew.zzc(this.zza.zze);
        zze zze2 = this.zzb;
        zzepc2.zzdB(zze2);
    }
}

