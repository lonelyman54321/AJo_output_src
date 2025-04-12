/*
 * Decompiled with CFR 0.152.
 */
package com.jioads.mediation.partners;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jioads.mediation.partners.GooglePlayServicesInterstitial;
import com.jioads.mediation.partners.JioMediationListener;
import kotlin.jvm.internal.Intrinsics;

public final class GooglePlayServicesInterstitial$showAd$1
extends FullScreenContentCallback {
    public final /* synthetic */ GooglePlayServicesInterstitial a;

    public GooglePlayServicesInterstitial$showAd$1(GooglePlayServicesInterstitial googlePlayServicesInterstitial) {
        this.a = googlePlayServicesInterstitial;
    }

    public final void onAdClicked() {
        super.onAdClicked();
        Intrinsics.checkNotNullParameter("GMA Mediation Interstitial Ad Clicked", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object = JioAds$LogLevel.NONE;
        object = this.a;
        JioMediationListener jioMediationListener = GooglePlayServicesInterstitial.access$getMInterstitialListener$p((GooglePlayServicesInterstitial)object);
        if (jioMediationListener != null && (object = GooglePlayServicesInterstitial.access$getMInterstitialListener$p((GooglePlayServicesInterstitial)object)) != null) {
            object.onAdClicked();
        }
    }

    public final void onAdDismissedFullScreenContent() {
        Intrinsics.checkNotNullParameter("GMA Mediation Interstitial onAdClosed ", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object = JioAds$LogLevel.NONE;
        GooglePlayServicesInterstitial googlePlayServicesInterstitial = this.a;
        GooglePlayServicesInterstitial.access$setMGoogleInterstitialAd$p(googlePlayServicesInterstitial, null);
        object = GooglePlayServicesInterstitial.access$getMInterstitialListener$p(googlePlayServicesInterstitial);
        if (object != null && (object = GooglePlayServicesInterstitial.access$getMInterstitialListener$p(googlePlayServicesInterstitial)) != null) {
            googlePlayServicesInterstitial = null;
            object.onAdDismissed(false, false);
        }
    }

    public final void onAdFailedToShowFullScreenContent(AdError object) {
        Intrinsics.checkNotNullParameter(object, "adError");
        Intrinsics.checkNotNullParameter("Ad failed to show fullscreen content.", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.a;
        JioMediationListener jioMediationListener = GooglePlayServicesInterstitial.access$getMInterstitialListener$p((GooglePlayServicesInterstitial)object);
        if (jioMediationListener != null) {
            jioMediationListener = null;
            GooglePlayServicesInterstitial.access$setMGoogleInterstitialAd$p((GooglePlayServicesInterstitial)object, null);
        }
    }

    public final void onAdImpression() {
        super.onAdImpression();
        Intrinsics.checkNotNullParameter("GMA Mediation Interstitial Impression Fired", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object = JioAds$LogLevel.NONE;
        object = this.a;
        JioMediationListener jioMediationListener = GooglePlayServicesInterstitial.access$getMInterstitialListener$p((GooglePlayServicesInterstitial)object);
        if (jioMediationListener != null && (object = GooglePlayServicesInterstitial.access$getMInterstitialListener$p((GooglePlayServicesInterstitial)object)) != null) {
            object.logMediationImpression();
        }
    }

    public final void onAdShowedFullScreenContent() {
        Intrinsics.checkNotNullParameter("GMA Mediation Interstitial Ad Rendered", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object = JioAds$LogLevel.NONE;
        object = this.a;
        JioMediationListener jioMediationListener = GooglePlayServicesInterstitial.access$getMInterstitialListener$p((GooglePlayServicesInterstitial)object);
        if (jioMediationListener != null && (object = GooglePlayServicesInterstitial.access$getMInterstitialListener$p((GooglePlayServicesInterstitial)object)) != null) {
            object.onAdShown();
        }
    }
}

