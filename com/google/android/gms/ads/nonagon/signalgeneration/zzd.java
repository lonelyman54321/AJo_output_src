/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.nonagon.signalgeneration.zze;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.concurrent.Callable;

public final class zzd
implements Callable {
    public final /* synthetic */ zze zza;
    public final /* synthetic */ AdRequest zzb;
    public final /* synthetic */ zzf zzc;

    public /* synthetic */ zzd(zze zze2, AdRequest adRequest, zzf zzf2) {
        this.zza = zze2;
        this.zzb = adRequest;
        this.zzc = zzf2;
    }

    public final Object call() {
        zze zze2 = this.zza;
        AdRequest adRequest = this.zzb;
        zzf zzf2 = this.zzc;
        return zze2.zza(adRequest, zzf2);
    }
}

