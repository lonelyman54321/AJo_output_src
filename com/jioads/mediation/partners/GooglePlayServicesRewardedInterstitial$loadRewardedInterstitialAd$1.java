/*
 * Decompiled with CFR 0.152.
 */
package com.jioads.mediation.partners;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.l_0;
import com.jioads.mediation.partners.GooglePlayServicesRewardedInterstitial;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class GooglePlayServicesRewardedInterstitial$loadRewardedInterstitialAd$1
extends RewardedInterstitialAdLoadCallback {
    public final /* synthetic */ GooglePlayServicesRewardedInterstitial a;

    public GooglePlayServicesRewardedInterstitial$loadRewardedInterstitialAd$1(GooglePlayServicesRewardedInterstitial googlePlayServicesRewardedInterstitial) {
        this.a = googlePlayServicesRewardedInterstitial;
    }

    public final void onAdFailedToLoad(LoadAdError object) {
        int n3 = 1;
        Intrinsics.checkNotNullParameter(object, "adError");
        Object object2 = new StringBuilder("GMA Mediation RewardedInterstitial ad failed to load.ErrorCode= ");
        ((StringBuilder)object2).append(object);
        ((StringBuilder)object2).append(".code");
        Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), "message");
        object2 = JioAds.Companion;
        ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object[] objectArray = JioAds$LogLevel.NONE;
        objectArray = this.a;
        Object object3 = null;
        GooglePlayServicesRewardedInterstitial.access$setMGoogleRewardedInterstitialAd$p((GooglePlayServicesRewardedInterstitial)objectArray, null);
        int n4 = object.getCode();
        if (n4 != 0) {
            if (n4 != n3) {
                int n7 = 2;
                if (n4 != n7) {
                    n7 = 3;
                    if (n4 != n7) {
                        object3 = GooglePlayServicesRewardedInterstitial.access$getMRewardedInterstitialAdListener$p((GooglePlayServicesRewardedInterstitial)objectArray);
                        if (object3 != null) {
                            String string2 = JioAdError$JioAdErrorType.ERROR_IN_MEDIATION.getErrorCode();
                            String string3 = "GooglePlayServicesRewardedInterstitial Unknown error";
                            object3.onAdFailed(string2, string3);
                        }
                    } else {
                        object3 = GooglePlayServicesRewardedInterstitial.access$getMRewardedInterstitialAdListener$p((GooglePlayServicesRewardedInterstitial)objectArray);
                        if (object3 != null) {
                            String string4 = JioAdError$JioAdErrorType.ERROR_NOFILL.getErrorCode();
                            String string5 = "GooglePlayServicesRewardedInterstitial ERROR_CODE_NO_FILL";
                            object3.onAdFailed(string4, string5);
                        }
                    }
                } else {
                    object3 = GooglePlayServicesRewardedInterstitial.access$getMRewardedInterstitialAdListener$p((GooglePlayServicesRewardedInterstitial)objectArray);
                    if (object3 != null) {
                        String string6 = JioAdError$JioAdErrorType.ERROR_NETWORK_ERROR.getErrorCode();
                        String string7 = "GooglePlayServicesRewardedInterstitial ERROR_CODE_NETWORK_ERROR";
                        object3.onAdFailed(string6, string7);
                    }
                }
            } else {
                object3 = GooglePlayServicesRewardedInterstitial.access$getMRewardedInterstitialAdListener$p((GooglePlayServicesRewardedInterstitial)objectArray);
                if (object3 != null) {
                    String string8 = JioAdError$JioAdErrorType.ERROR_INVALID_AD_REQUEST_PARAMETERS.getErrorCode();
                    String string9 = "GooglePlayServicesRewardedInterstitial ERROR_CODE_INVALID_REQUEST";
                    object3.onAdFailed(string8, string9);
                }
            }
        } else {
            object3 = GooglePlayServicesRewardedInterstitial.access$getMRewardedInterstitialAdListener$p((GooglePlayServicesRewardedInterstitial)objectArray);
            if (object3 != null) {
                String string10 = JioAdError$JioAdErrorType.ERROR_IN_MEDIATION.getErrorCode();
                String string11 = "GooglePlayServicesRewardedInterstitial ERROR_CODE_INTERNAL_ERROR";
                object3.onAdFailed(string10, string11);
            }
        }
        object3 = StringCompanionObject.INSTANCE;
        int n8 = object.getCode();
        object = GooglePlayServicesRewardedInterstitial.access$getErrorReason((GooglePlayServicesRewardedInterstitial)objectArray, n8);
        objectArray = new Object[n3];
        objectArray[0] = object;
        object = Arrays.copyOf(objectArray, n3);
        object = String.format("Admob-ad onAdFailedToLoad (%s)", object);
        Intrinsics.checkNotNullExpressionValue(object, "format(format, *args)");
        l_0.h(" GMA error msg: ", (String)object);
        ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public final void onAdLoaded(Object object) {
        object = (RewardedInterstitialAd)object;
        Intrinsics.checkNotNullParameter(object, "ad");
        GooglePlayServicesRewardedInterstitial googlePlayServicesRewardedInterstitial = this.a;
        GooglePlayServicesRewardedInterstitial.access$setMGoogleRewardedInterstitialAd$p(googlePlayServicesRewardedInterstitial, (RewardedInterstitialAd)object);
        object = GooglePlayServicesRewardedInterstitial.access$getMRewardedInterstitialAdListener$p(googlePlayServicesRewardedInterstitial);
        if (object != null) {
            String string2 = "message";
            Intrinsics.checkNotNullParameter("GMA mediation RewardedInterstitial VideoAd prepared", string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object = GooglePlayServicesRewardedInterstitial.access$getMRewardedInterstitialAdListener$p(googlePlayServicesRewardedInterstitial);
            if (object != null) {
                object.onAdLoaded();
            }
        }
    }
}

