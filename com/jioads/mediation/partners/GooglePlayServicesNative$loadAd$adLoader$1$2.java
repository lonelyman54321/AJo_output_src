/*
 * Decompiled with CFR 0.152.
 */
package com.jioads.mediation.partners;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jioads.mediation.partners.GooglePlayServicesNative;
import com.jioads.mediation.partners.JioMediationListener;
import kotlin.jvm.internal.Intrinsics;

public final class GooglePlayServicesNative$loadAd$adLoader$1$2
extends AdListener {
    public final /* synthetic */ JioMediationListener a;
    public final /* synthetic */ GooglePlayServicesNative b;

    public GooglePlayServicesNative$loadAd$adLoader$1$2(JioMediationListener jioMediationListener, GooglePlayServicesNative googlePlayServicesNative) {
        this.a = jioMediationListener;
        this.b = googlePlayServicesNative;
    }

    public final void onAdClicked() {
        String string2 = "message";
        Intrinsics.checkNotNullParameter("GMA Mediation Native Ad Clicked", string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object = JioAds$LogLevel.NONE;
        object = this.a;
        if (object != null) {
            object.onAdClicked();
        }
    }

    public final void onAdClosed() {
        JioMediationListener jioMediationListener = this.a;
        if (jioMediationListener != null) {
            String string2 = "message";
            Intrinsics.checkNotNullParameter("GMA Mediation Native onAdClosed ", string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            jioMediationListener.onAdDismissed(false, false);
        }
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        Intrinsics.checkNotNullParameter(loadAdError, "loadAdError");
        super.onAdFailedToLoad(loadAdError);
        Object object = new StringBuilder("Admob onAdFailedToLoad: ");
        int n3 = loadAdError.getCode();
        ((StringBuilder)object).append(n3);
        object = ((StringBuilder)object).toString();
        String string2 = "message";
        Intrinsics.checkNotNullParameter(object, string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.a;
        if (object != null) {
            object = this.b;
            int n4 = loadAdError.getCode();
            ((GooglePlayServicesNative)object).handleErrorCode(n4);
        }
    }

    public final void onAdImpression() {
        super.onAdImpression();
        JioMediationListener jioMediationListener = this.a;
        if (jioMediationListener != null) {
            String string2 = "message";
            Intrinsics.checkNotNullParameter("GMA Mediation Native Impression Fired", string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            jioMediationListener.logMediationImpression();
        }
    }

    public final void onAdOpened() {
    }
}

