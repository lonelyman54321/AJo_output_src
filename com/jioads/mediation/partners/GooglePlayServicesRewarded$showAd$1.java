/*
 * Decompiled with CFR 0.152.
 */
package com.jioads.mediation.partners;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jioads.mediation.partners.GooglePlayServicesRewarded;
import kotlin.jvm.internal.Intrinsics;

public final class GooglePlayServicesRewarded$showAd$1
extends FullScreenContentCallback {
    public final /* synthetic */ GooglePlayServicesRewarded a;

    public GooglePlayServicesRewarded$showAd$1(GooglePlayServicesRewarded googlePlayServicesRewarded) {
        this.a = googlePlayServicesRewarded;
    }

    public final void onAdClicked() {
        super.onAdClicked();
        Object object = this.a;
        Object object2 = GooglePlayServicesRewarded.access$getMRewardedAdListener$p((GooglePlayServicesRewarded)object);
        if (object2 != null) {
            String string2 = "message";
            Intrinsics.checkNotNullParameter("GMA Mediation Rewarded adClicked", string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object = GooglePlayServicesRewarded.access$getMRewardedAdListener$p((GooglePlayServicesRewarded)object);
            if (object != null) {
                object.onAdClicked();
            }
        }
    }

    public final void onAdDismissedFullScreenContent() {
        GooglePlayServicesRewarded googlePlayServicesRewarded = this.a;
        GooglePlayServicesRewarded.access$setMGoogleRewardedVideoAd$p(googlePlayServicesRewarded, null);
        Object object = GooglePlayServicesRewarded.access$getMRewardedAdListener$p(googlePlayServicesRewarded);
        if (object != null) {
            String string2 = "message";
            Intrinsics.checkNotNullParameter("GMA Mediation Rewarded onAdClosed ", string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object = GooglePlayServicesRewarded.access$getMRewardedAdListener$p(googlePlayServicesRewarded);
            if (object != null) {
                boolean bl2 = googlePlayServicesRewarded.isVideoCompleted();
                boolean bl3 = googlePlayServicesRewarded.isEligibleForReward();
                object.onAdDismissed(bl2, bl3);
            }
        }
    }

    public final void onAdFailedToShowFullScreenContent(AdError object) {
        Intrinsics.checkNotNullParameter(object, "adError");
        object = this.a;
        Object object2 = GooglePlayServicesRewarded.access$getMRewardedAdListener$p((GooglePlayServicesRewarded)object);
        if (object2 != null) {
            String string2 = "message";
            Intrinsics.checkNotNullParameter("Ad failed to show fullscreen content.", string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object2 = null;
            GooglePlayServicesRewarded.access$setMGoogleRewardedVideoAd$p((GooglePlayServicesRewarded)object, null);
        }
    }

    public final void onAdImpression() {
        super.onAdImpression();
        Object object = this.a;
        Object object2 = GooglePlayServicesRewarded.access$getMRewardedAdListener$p((GooglePlayServicesRewarded)object);
        if (object2 != null) {
            String string2 = "message";
            Intrinsics.checkNotNullParameter("GMA Mediation Rewarded Impression Fired", string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object = GooglePlayServicesRewarded.access$getMRewardedAdListener$p((GooglePlayServicesRewarded)object);
            if (object != null) {
                object.logMediationImpression();
            }
        }
    }

    public final void onAdShowedFullScreenContent() {
        Object object = this.a;
        Object object2 = GooglePlayServicesRewarded.access$getMRewardedAdListener$p((GooglePlayServicesRewarded)object);
        if (object2 != null) {
            String string2 = "message";
            Intrinsics.checkNotNullParameter("GMA Mediation Rewarded Ad Rendered", string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object = GooglePlayServicesRewarded.access$getMRewardedAdListener$p((GooglePlayServicesRewarded)object);
            if (object != null) {
                object.onAdShown();
            }
        }
    }
}

