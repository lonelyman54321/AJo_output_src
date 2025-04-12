/*
 * Decompiled with CFR 0.152.
 */
package com.google.ads.mediation;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

final class zzc
extends InterstitialAdLoadCallback {
    final AbstractAdViewAdapter zza;
    final MediationInterstitialListener zzb;

    public zzc(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.zza = abstractAdViewAdapter;
        this.zzb = mediationInterstitialListener;
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        MediationInterstitialListener mediationInterstitialListener = this.zzb;
        AbstractAdViewAdapter abstractAdViewAdapter = this.zza;
        mediationInterstitialListener.onAdFailedToLoad((MediationInterstitialAdapter)abstractAdViewAdapter, loadAdError);
    }
}

