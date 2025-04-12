/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzczo;
import com.google.android.gms.internal.ads.zzepy;
import com.google.android.gms.internal.ads.zzepz;

public final class zzepx
implements Runnable {
    public final /* synthetic */ zzepy zza;
    public final /* synthetic */ zze zzb;

    public /* synthetic */ zzepx(zzepy zzepy2, zze zze2) {
        this.zza = zzepy2;
        this.zzb = zze2;
    }

    public final void run() {
        zzczo zzczo2 = zzepz.zzd(this.zza.zze).zza();
        zze zze2 = this.zzb;
        zzczo2.zzdB(zze2);
    }
}

