/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.internal.ads.zzbwj;

public final class zzf
implements Runnable {
    public final /* synthetic */ BaseAdView zza;
    public final /* synthetic */ AdRequest zzb;

    public /* synthetic */ zzf(BaseAdView baseAdView, AdRequest adRequest) {
        this.zza = baseAdView;
        this.zzb = adRequest;
    }

    public final void run() {
        zzea zzea2;
        BaseAdView baseAdView = this.zza;
        Object object = this.zzb;
        try {
            zzea2 = baseAdView.zza;
        }
        catch (IllegalStateException illegalStateException) {
            zzbwj.zza(baseAdView.getContext()).zzh(illegalStateException, "BaseAdView.loadAd");
            return;
        }
        object = ((AdRequest)object).zza;
        zzea2.zzm((zzdx)object);
    }
}

