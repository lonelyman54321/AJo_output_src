/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.jioads.mediation.partners;

import android.view.View;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jioads.mediation.partners.GooglePlayServicesBanner;
import kotlin.jvm.internal.Intrinsics;

final class GooglePlayServicesBanner$AdViewListener
extends AdListener {
    public final /* synthetic */ GooglePlayServicesBanner a;

    public GooglePlayServicesBanner$AdViewListener(GooglePlayServicesBanner googlePlayServicesBanner) {
        this.a = googlePlayServicesBanner;
    }

    public final void onAdClicked() {
        super.onAdClicked();
        Object object = this.a;
        Object object2 = GooglePlayServicesBanner.access$getMBannerListener$p((GooglePlayServicesBanner)object);
        if (object2 != null) {
            String string2 = "message";
            Intrinsics.checkNotNullParameter("GMA Mediation Banner adClicked", string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object = GooglePlayServicesBanner.access$getMBannerListener$p((GooglePlayServicesBanner)object);
            if (object != null) {
                object.onAdClicked();
            }
        }
    }

    public final void onAdClosed() {
        Intrinsics.checkNotNullParameter("GMA Mediation Banner onAdClosed ", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public final void onAdFailedToLoad(LoadAdError object) {
        Intrinsics.checkNotNullParameter(object, "adError");
        Object object2 = new StringBuilder("GMA mediation Banner ad failed to load.ErrorCode= ");
        object2.append(object);
        object2.append(".code");
        object2 = object2.toString();
        String string2 = "message";
        Intrinsics.checkNotNullParameter(object2, string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        int n3 = ((AdError)object).getCode();
        object2 = this.a;
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 != n4) {
                        object = GooglePlayServicesBanner.access$getMBannerListener$p((GooglePlayServicesBanner)object2);
                        if (object != null) {
                            object2 = JioAdError$JioAdErrorType.ERROR_IN_MEDIATION.getErrorCode();
                            string2 = "GooglePlayServicesBanner Unknown error";
                            object.onAdFailed((String)object2, string2);
                        }
                    } else {
                        object = GooglePlayServicesBanner.access$getMBannerListener$p((GooglePlayServicesBanner)object2);
                        if (object != null) {
                            object2 = JioAdError$JioAdErrorType.ERROR_NOFILL.getErrorCode();
                            string2 = "GooglePlayServicesBanner ERROR_CODE_NO_FILL";
                            object.onAdFailed((String)object2, string2);
                        }
                    }
                } else {
                    object = GooglePlayServicesBanner.access$getMBannerListener$p((GooglePlayServicesBanner)object2);
                    if (object != null) {
                        object2 = JioAdError$JioAdErrorType.ERROR_NETWORK_ERROR.getErrorCode();
                        string2 = "GooglePlayServicesBanner ERROR_CODE_NETWORK_ERROR";
                        object.onAdFailed((String)object2, string2);
                    }
                }
            } else {
                object = GooglePlayServicesBanner.access$getMBannerListener$p((GooglePlayServicesBanner)object2);
                if (object != null) {
                    object2 = JioAdError$JioAdErrorType.ERROR_INVALID_AD_REQUEST_PARAMETERS.getErrorCode();
                    string2 = "GooglePlayServicesBanner ERROR_CODE_INVALID_REQUEST";
                    object.onAdFailed((String)object2, string2);
                }
            }
        } else {
            object = GooglePlayServicesBanner.access$getMBannerListener$p((GooglePlayServicesBanner)object2);
            if (object != null) {
                object2 = JioAdError$JioAdErrorType.ERROR_IN_MEDIATION.getErrorCode();
                string2 = "GooglePlayServicesBanner ERROR_CODE_INTERNAL_ERROR";
                object.onAdFailed((String)object2, string2);
            }
        }
    }

    public final void onAdImpression() {
        super.onAdImpression();
        Object object = this.a;
        Object object2 = GooglePlayServicesBanner.access$getMBannerListener$p((GooglePlayServicesBanner)object);
        if (object2 != null) {
            String string2 = "message";
            Intrinsics.checkNotNullParameter("GMA mediation Banner Impression Fired", string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object = GooglePlayServicesBanner.access$getMBannerListener$p((GooglePlayServicesBanner)object);
            if (object != null) {
                object.logMediationImpression();
            }
        }
    }

    public final void onAdLoaded() {
        Object object = this.a;
        boolean bl2 = GooglePlayServicesBanner.access$isFirstAd$p(object);
        if (!bl2) {
            bl2 = true;
            GooglePlayServicesBanner.access$setFirstAd$p(object, bl2);
            Object object2 = GooglePlayServicesBanner.access$getMBannerListener$p(object);
            if (object2 != null) {
                String string2 = "message";
                Intrinsics.checkNotNullParameter("GMA Mediation Banner Ad Prepared", string2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
                object2 = GooglePlayServicesBanner.access$getMBannerListener$p(object);
                if (object2 != null) {
                    object = GooglePlayServicesBanner.access$getMGoogleAdView$p(object);
                    object2.onBannerAdLoaded((View)object);
                }
            }
        }
    }

    public final void onAdOpened() {
        Object object = GooglePlayServicesBanner.access$getMBannerListener$p(this.a);
        if (object != null) {
            String string2 = "message";
            Intrinsics.checkNotNullParameter("GMA Mediation Banner Ad Opened", string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
    }
}

