/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.JioAd;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$MediaPlayBack;
import com.jio.jioads.adinterfaces.JioAds;
import kotlin.jvm.internal.Intrinsics;

public abstract class JioAdListener {
    public void onAdChange(JioAdView jioAdView, int n3) {
        Intrinsics.checkNotNullParameter("Developer onAdChange", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public void onAdClicked(JioAdView jioAdView) {
        Intrinsics.checkNotNullParameter("Developer onAdClicked", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public void onAdClosed(JioAdView jioAdView, boolean bl2, boolean bl3) {
        Intrinsics.checkNotNullParameter("Developer onAdClosed", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public void onAdDataPrepared(JioAd jioAd, boolean bl2, JioAdView jioAdView) {
    }

    public abstract void onAdFailedToLoad(JioAdView var1, JioAdError var2);

    public void onAdMediaCollapse(JioAdView jioAdView) {
        Intrinsics.checkNotNullParameter("Developer onAdMediaCollapse", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public void onAdMediaEnd(JioAdView jioAdView) {
        Intrinsics.checkNotNullParameter("Developer onAdMediaEnd", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public void onAdMediaExpand(JioAdView jioAdView) {
        Intrinsics.checkNotNullParameter("Developer onAdMediaExpand", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public void onAdMediaProgress(long l2, long l3) {
        Intrinsics.checkNotNullParameter("Developer onAdMediaProgress", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public void onAdMediaStart(JioAdView jioAdView) {
        Intrinsics.checkNotNullParameter("Developer onAdMediaStart", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public abstract void onAdPrepared(JioAdView var1);

    public void onAdReceived(JioAdView jioAdView) {
        Intrinsics.checkNotNullParameter("Developer onAdReceived", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public void onAdRefresh(JioAdView jioAdView) {
        Intrinsics.checkNotNullParameter("Developer onAdRefresh", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public abstract void onAdRender(JioAdView var1);

    public void onAdSkippable(JioAdView jioAdView) {
        Intrinsics.checkNotNullParameter("Developer onAdSkippable", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public void onAllAdMediaProgress(long l2, long l3) {
        Intrinsics.checkNotNullParameter("Developer onAdMediaProgress", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public void onAllAdsExhausted() {
        Intrinsics.checkNotNullParameter("Developer onAllAdsExhausted", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public void onGestureDetection(boolean bl2) {
        Intrinsics.checkNotNullParameter("Developer onGestureDetection()", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public void onInterstitialAdPause(JioAdView jioAdView) {
        Intrinsics.checkNotNullParameter("Developer onInterstitialAdPause()", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public void onInterstitialAdResume(JioAdView jioAdView) {
        Intrinsics.checkNotNullParameter("Developer onInterstitialAdResume()", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public void onMediaPlaybackChange(JioAdView jioAdView, JioAdView$MediaPlayBack jioAdView$MediaPlayBack) {
        Intrinsics.checkNotNullParameter("Developer onMediaPlaybackChange", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public void onNextAdPrepared(JioAdView jioAdView) {
        Intrinsics.checkNotNullParameter("Developer onNextAdPrepared", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public void onSwipeDown(JioAdView jioAdView) {
        Intrinsics.checkNotNullParameter("Developer onSwipeDown", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public void onSwipeLeft(JioAdView jioAdView) {
        Intrinsics.checkNotNullParameter("Developer onSwipeLeft", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public void onSwipeRight(JioAdView jioAdView) {
        Intrinsics.checkNotNullParameter("Developer onSwipeRight", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public void onSwipeUp(JioAdView jioAdView) {
        Intrinsics.checkNotNullParameter("Developer onSwipeUp", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public void seeAllAdReceived(JioAdView jioAdView) {
        Intrinsics.checkNotNullParameter("Developer seeAllAdReceived()", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }
}

