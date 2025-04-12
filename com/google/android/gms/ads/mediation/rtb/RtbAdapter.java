/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.mediation.rtb;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;

public abstract class RtbAdapter
extends Adapter {
    public abstract void collectSignals(RtbSignalData var1, SignalCallbacks var2);

    public void loadRtbAppOpenAd(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback) {
        this.loadAppOpenAd(mediationAppOpenAdConfiguration, mediationAdLoadCallback);
    }

    public void loadRtbBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback) {
        this.loadBannerAd(mediationBannerAdConfiguration, mediationAdLoadCallback);
    }

    public void loadRtbInterscrollerAd(MediationBannerAdConfiguration object, MediationAdLoadCallback mediationAdLoadCallback) {
        object = this.getClass();
        object = ((Class)object).getSimpleName().concat(" does not support interscroller ads.");
        AdError adError = new AdError(7, (String)object, "com.google.android.gms.ads");
        mediationAdLoadCallback.onFailure(adError);
    }

    public void loadRtbInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback) {
        this.loadInterstitialAd(mediationInterstitialAdConfiguration, mediationAdLoadCallback);
    }

    public void loadRtbNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback) {
        this.loadNativeAd(mediationNativeAdConfiguration, mediationAdLoadCallback);
    }

    public void loadRtbNativeAdMapper(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback) {
        this.loadNativeAdMapper(mediationNativeAdConfiguration, mediationAdLoadCallback);
    }

    public void loadRtbRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback) {
        this.loadRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
    }

    public void loadRtbRewardedInterstitialAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback) {
        this.loadRewardedInterstitialAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
    }
}

