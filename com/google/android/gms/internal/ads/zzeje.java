/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzcsf;
import com.google.android.gms.internal.ads.zzejf;
import com.google.android.gms.internal.ads.zzfil;
import com.google.android.gms.internal.ads.zzgfp;

final class zzeje
implements zzgfp {
    final /* synthetic */ zzejf zza;

    public zzeje(zzejf zzejf2) {
        this.zza = zzejf2;
    }

    public final void zza(Throwable throwable) {
        zze zze2 = zzejf.zzd(this.zza).zzd().zza(throwable);
        zzejf.zze(this.zza).zzdB(zze2);
        zzfil.zzb(zze2.zza, throwable, "DelayedBannerAd.onFailure");
    }

    public final /* synthetic */ void zzb(Object object) {
        ((zzcsf)object).zzj();
    }
}

