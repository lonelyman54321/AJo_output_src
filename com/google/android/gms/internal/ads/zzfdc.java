/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzepc;
import com.google.android.gms.internal.ads.zzfde;
import com.google.android.gms.internal.ads.zzfdf;

public final class zzfdc
implements Runnable {
    public final /* synthetic */ zzfde zza;
    public final /* synthetic */ zze zzb;

    public /* synthetic */ zzfdc(zzfde zzfde2, zze zze2) {
        this.zza = zzfde2;
        this.zzb = zze2;
    }

    public final void run() {
        zzepc zzepc2 = zzfdf.zzg(this.zza.zze);
        zze zze2 = this.zzb;
        zzepc2.zzdB(zze2);
    }
}

