/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.admanager;

import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdView;

public final class zzb
implements Runnable {
    public final /* synthetic */ AdManagerAdView zza;
    public final /* synthetic */ AdManagerAdRequest zzb;

    public /* synthetic */ zzb(AdManagerAdView adManagerAdView, AdManagerAdRequest adManagerAdRequest) {
        this.zza = adManagerAdView;
        this.zzb = adManagerAdRequest;
    }

    public final void run() {
        AdManagerAdView adManagerAdView = this.zza;
        AdManagerAdRequest adManagerAdRequest = this.zzb;
        adManagerAdView.zza(adManagerAdRequest);
    }
}

