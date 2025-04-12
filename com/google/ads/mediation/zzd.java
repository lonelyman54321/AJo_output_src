/*
 * Decompiled with CFR 0.152.
 */
package com.google.ads.mediation;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

final class zzd
extends FullScreenContentCallback {
    final AbstractAdViewAdapter zza;
    final MediationInterstitialListener zzb;

    public zzd(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.zza = abstractAdViewAdapter;
        this.zzb = mediationInterstitialListener;
    }

    public final void onAdDismissedFullScreenContent() {
        MediationInterstitialListener mediationInterstitialListener = this.zzb;
        AbstractAdViewAdapter abstractAdViewAdapter = this.zza;
        mediationInterstitialListener.onAdClosed(abstractAdViewAdapter);
    }

    public final void onAdShowedFullScreenContent() {
        MediationInterstitialListener mediationInterstitialListener = this.zzb;
        AbstractAdViewAdapter abstractAdViewAdapter = this.zza;
        mediationInterstitialListener.onAdOpened(abstractAdViewAdapter);
    }
}

