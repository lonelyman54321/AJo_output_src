/*
 * Decompiled with CFR 0.152.
 */
package com.jioads.mediation.partners;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jioads.mediation.partners.GooglePlayServicesRewardedInterstitial;
import kotlin.jvm.internal.Intrinsics;

public final class GooglePlayServicesRewardedInterstitial$showAd$1
extends FullScreenContentCallback {
    public final /* synthetic */ GooglePlayServicesRewardedInterstitial a;

    public GooglePlayServicesRewardedInterstitial$showAd$1(GooglePlayServicesRewardedInterstitial googlePlayServicesRewardedInterstitial) {
        this.a = googlePlayServicesRewardedInterstitial;
    }

    public final void onAdClicked() {
        super.onAdClicked();
        Object object = this.a;
        Object object2 = GooglePlayServicesRewardedInterstitial.access$getMRewardedInterstitialAdListener$p((GooglePlayServicesRewardedInterstitial)object);
        if (object2 != null) {
            String string2 = "message";
            Intrinsics.checkNotNullParameter("GMA Mediation RewardedInterstitial adClicked", string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object = GooglePlayServicesRewardedInterstitial.access$getMRewardedInterstitialAdListener$p((GooglePlayServicesRewardedInterstitial)object);
            if (object != null) {
                object.onAdClicked();
            }
        }
    }

    public final void onAdDismissedFullScreenContent() {
        GooglePlayServicesRewardedInterstitial googlePlayServicesRewardedInterstitial = this.a;
        GooglePlayServicesRewardedInterstitial.access$setMGoogleRewardedInterstitialAd$p(googlePlayServicesRewardedInterstitial, null);
        Object object = GooglePlayServicesRewardedInterstitial.access$getMRewardedInterstitialAdListener$p(googlePlayServicesRewardedInterstitial);
        if (object != null) {
            String string2 = "message";
            Intrinsics.checkNotNullParameter("GMA Mediation RewardedInterstitial onAdClosed ", string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object = GooglePlayServicesRewardedInterstitial.access$getMRewardedInterstitialAdListener$p(googlePlayServicesRewardedInterstitial);
            if (object != null) {
                boolean bl2 = googlePlayServicesRewardedInterstitial.isVideoCompleted();
                boolean bl3 = googlePlayServicesRewardedInterstitial.isEligibleForReward();
                object.onAdDismissed(bl2, bl3);
            }
        }
    }

    public final void onAdFailedToShowFullScreenContent(AdError object) {
        Intrinsics.checkNotNullParameter(object, "adError");
        Intrinsics.checkNotNullParameter("Ad failed to show fullscreen content.", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        GooglePlayServicesRewardedInterstitial.access$setMGoogleRewardedInterstitialAd$p(this.a, null);
    }

    public final void onAdImpression() {
        super.onAdImpression();
        Object object = this.a;
        Object object2 = GooglePlayServicesRewardedInterstitial.access$getMRewardedInterstitialAdListener$p((GooglePlayServicesRewardedInterstitial)object);
        if (object2 != null) {
            String string2 = "message";
            Intrinsics.checkNotNullParameter("GMA Mediation RewardedInterstitial Impression Fired", string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object = GooglePlayServicesRewardedInterstitial.access$getMRewardedInterstitialAdListener$p((GooglePlayServicesRewardedInterstitial)object);
            if (object != null) {
                object.logMediationImpression();
            }
        }
    }

    public final void onAdShowedFullScreenContent() {
        Object object = this.a;
        Object object2 = GooglePlayServicesRewardedInterstitial.access$getMRewardedInterstitialAdListener$p((GooglePlayServicesRewardedInterstitial)object);
        if (object2 != null) {
            String string2 = "message";
            Intrinsics.checkNotNullParameter("GMA Mediation RewardedInterstitial Ad Rendered", string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object = GooglePlayServicesRewardedInterstitial.access$getMRewardedInterstitialAdListener$p((GooglePlayServicesRewardedInterstitial)object);
            if (object != null) {
                object.onAdShown();
            }
        }
    }
}

