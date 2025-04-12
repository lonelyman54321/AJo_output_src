/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.RemoteException
 */
package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import java.util.List;

public abstract class Adapter
implements MediationExtrasReceiver {
    public abstract VersionInfo getSDKVersionInfo();

    public abstract VersionInfo getVersionInfo();

    public abstract void initialize(Context var1, InitializationCompleteCallback var2, List var3);

    public void loadAppOpenAd(MediationAppOpenAdConfiguration object, MediationAdLoadCallback mediationAdLoadCallback) {
        object = this.getClass();
        object = ((Class)object).getSimpleName().concat(" does not support app open ads.");
        AdError adError = new AdError(7, (String)object, "com.google.android.gms.ads");
        mediationAdLoadCallback.onFailure(adError);
    }

    public void loadBannerAd(MediationBannerAdConfiguration object, MediationAdLoadCallback mediationAdLoadCallback) {
        object = this.getClass();
        object = ((Class)object).getSimpleName().concat(" does not support banner ads.");
        AdError adError = new AdError(7, (String)object, "com.google.android.gms.ads");
        mediationAdLoadCallback.onFailure(adError);
    }

    public void loadInterscrollerAd(MediationBannerAdConfiguration object, MediationAdLoadCallback mediationAdLoadCallback) {
        object = this.getClass();
        object = ((Class)object).getSimpleName().concat(" does not support interscroller ads.");
        AdError adError = new AdError(7, (String)object, "com.google.android.gms.ads");
        mediationAdLoadCallback.onFailure(adError);
    }

    public void loadInterstitialAd(MediationInterstitialAdConfiguration object, MediationAdLoadCallback mediationAdLoadCallback) {
        object = this.getClass();
        object = ((Class)object).getSimpleName().concat(" does not support interstitial ads.");
        AdError adError = new AdError(7, (String)object, "com.google.android.gms.ads");
        mediationAdLoadCallback.onFailure(adError);
    }

    public void loadNativeAd(MediationNativeAdConfiguration object, MediationAdLoadCallback mediationAdLoadCallback) {
        object = this.getClass();
        object = ((Class)object).getSimpleName().concat(" does not support native ads.");
        AdError adError = new AdError(7, (String)object, "com.google.android.gms.ads");
        mediationAdLoadCallback.onFailure(adError);
    }

    public void loadNativeAdMapper(MediationNativeAdConfiguration object, MediationAdLoadCallback mediationAdLoadCallback) {
        object = new RemoteException("Method is not found");
        throw object;
    }

    public void loadRewardedAd(MediationRewardedAdConfiguration object, MediationAdLoadCallback mediationAdLoadCallback) {
        object = this.getClass();
        object = ((Class)object).getSimpleName().concat(" does not support rewarded ads.");
        AdError adError = new AdError(7, (String)object, "com.google.android.gms.ads");
        mediationAdLoadCallback.onFailure(adError);
    }

    public void loadRewardedInterstitialAd(MediationRewardedAdConfiguration object, MediationAdLoadCallback mediationAdLoadCallback) {
        object = this.getClass();
        object = ((Class)object).getSimpleName().concat(" does not support rewarded interstitial ads.");
        AdError adError = new AdError(7, (String)object, "com.google.android.gms.ads");
        mediationAdLoadCallback.onFailure(adError);
    }
}

