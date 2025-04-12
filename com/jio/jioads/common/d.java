/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.view.ViewGroup
 *  org.json.JSONObject
 */
package com.jio.jioads.common;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.jio.jioads.adinterfaces.JioAdView$AdDetails;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.common.b;
import com.jio.jioads.common.c;
import com.jio.jioads.controller.a;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public abstract class d {
    public d(a a2, b b2, c c2) {
        Intrinsics.checkNotNullParameter(a2, "jioAdCallback");
        Intrinsics.checkNotNullParameter(b2, "iJioAdView");
        Intrinsics.checkNotNullParameter(c2, "iJioAdViewController");
    }

    public static /* synthetic */ void pauseAd$default(d object, boolean bl2, int n3, Object object2) {
        if (object2 == null) {
            if ((n3 &= 1) != 0) {
                bl2 = false;
            }
            ((d)object).pauseAd(bl2);
            return;
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pauseAd");
        throw object;
    }

    public static /* synthetic */ void resumeAd$default(d object, boolean bl2, int n3, Object object2) {
        if (object2 == null) {
            if ((n3 &= 1) != 0) {
                bl2 = false;
            }
            ((d)object).resumeAd(bl2);
            return;
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeAd");
        throw object;
    }

    public void callPlayAgainFromPublisher() {
    }

    public void closeAd() {
        Intrinsics.checkNotNullParameter("closing ad", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public void collapseAd() {
        Intrinsics.checkNotNullParameter("collapse ad", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public void continueWithPromoBackSelection() {
    }

    public void expandAd() {
        Intrinsics.checkNotNullParameter("expanding ad", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public void forceCloseAd() {
        Intrinsics.checkNotNullParameter("forceCloseAd interstitial ad", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public Integer getAudioCurrentPosition() {
        Intrinsics.checkNotNullParameter("getting audio ad current position", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        return -1;
    }

    public String getCtaText() {
        return null;
    }

    public JioAdView$AdDetails getCurrentAdDetails() {
        return null;
    }

    public String getCurrentCampaignId() {
        return "";
    }

    public int getCurrentPosition() {
        return 0;
    }

    public ViewGroup getCustomNativeContainer() {
        return null;
    }

    public String getInstreamVideoCTAClickUrl() {
        return "";
    }

    public int getTrackNumber() {
        return 0;
    }

    public Integer getVideoAdDuration() {
        Intrinsics.checkNotNullParameter("getting video ad duration", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        return -1;
    }

    public Integer getVideoCurrentPosition() {
        Intrinsics.checkNotNullParameter("getting video ad current position", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        return -1;
    }

    public void handleClick() {
    }

    public void hideCTAButton() {
    }

    public void hideControls() {
        Intrinsics.checkNotNullParameter("hiding controls", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public void hidePlayButton() {
        Intrinsics.checkNotNullParameter("hiding play button", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public void hideSkip() {
        Intrinsics.checkNotNullParameter("hiding skip", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public final boolean isAdClickable() {
        Intrinsics.checkNotNullParameter("isAdClickable", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        return false;
    }

    public boolean isMediaMuted() {
        Intrinsics.checkNotNullParameter("checking if media muted", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        return false;
    }

    public boolean isMediaPlaying() {
        Intrinsics.checkNotNullParameter("checking if media playing", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        return false;
    }

    public void muteVideoAd() {
        Intrinsics.checkNotNullParameter("muting video ad", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public void notifyAdContainerSizeChange() {
    }

    public abstract void onAdDataUpdate(String var1, Map var2);

    public abstract void onCacheAd();

    public abstract void onCacheMediationAd(JSONObject var1, String var2, Map var3);

    public abstract void onDestroy();

    public void onHandleNoFillPgm() {
    }

    public abstract View onShowAdView();

    public abstract void pauseAd(boolean var1);

    public void prepareNextVideoAd() {
    }

    public boolean resetPodIfValid() {
        return false;
    }

    public abstract void resumeAd(boolean var1);

    public void setAudioCompanionContainer(ViewGroup viewGroup, int n3, int n4, Drawable drawable2, Drawable drawable3) {
    }

    public abstract void setParentContainer(ViewGroup var1);

    public void showCTAButton() {
        Intrinsics.checkNotNullParameter("showing cta button", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public void showControls() {
        Intrinsics.checkNotNullParameter("showing controls", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public void showPlayButton() {
        Intrinsics.checkNotNullParameter("showing play button", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public void showSkip() {
        Intrinsics.checkNotNullParameter("showing skip", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public void unmuteVideoAd() {
        Intrinsics.checkNotNullParameter("unmuting video ad", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }
}

