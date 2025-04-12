/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.interstitial;

import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.common.c;
import com.jio.jioads.controller.f;
import com.jio.jioads.interstitial.InterstitialAdController;
import com.jio.jioads.interstitial.o;
import com.jio.jioads.utils.Constants$AdTouchEvents;
import com.jio.jioads.utils.e;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from com.jio.jioads.interstitial.K
 */
public final class k_0
implements o {
    public final /* synthetic */ InterstitialAdController a;

    public k_0(InterstitialAdController interstitialAdController) {
        this.a = interstitialAdController;
    }

    public final void a(int n3, String object, String string2) {
        Intrinsics.checkNotNullParameter(object, "description");
        Intrinsics.checkNotNullParameter(string2, "failingUrl");
        Intrinsics.checkNotNullParameter("onReceivedError() InterstitialActivity", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object2 = JioAds$LogLevel.NONE;
        object2 = JioAdError.Companion;
        object = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
        string2 = "HTML ad failed to load";
        JioAdError jioAdError = j_0.c((t_0)object2, (JioAdError$JioAdErrorType)((Object)object), string2);
        object2 = this.a.getJioAdCallbacks();
        if (object2 != null) {
            d d2 = d.a;
            String string3 = k_0.class.getName();
            object = "getName(...)";
            Intrinsics.checkNotNullExpressionValue(string3, object);
            Object object3 = object2;
            object3 = (V)object2;
            String string4 = "initWebView";
            String string5 = "HTML Ad failed to load";
            ((V)object3).d(jioAdError, false, d2, string4, string3, string5, null);
        }
    }

    public final void a(String object) {
        Intrinsics.checkNotNullParameter(object, "url");
        Intrinsics.checkNotNullParameter("onPageStarted() InterstitialActivity", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }

    public final void b(Constants$AdTouchEvents object) {
        Intrinsics.checkNotNullParameter(object, "adTouchEvents");
        object = new StringBuilder();
        String string2 = this.a.getIJioAdView().P();
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(": Inside onAdTouch");
        Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }

    public final void b(String object) {
        Intrinsics.checkNotNullParameter(object, "url");
        Intrinsics.checkNotNullParameter("onPageFinished() InterstitialActivity", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }

    public final void onAdClick() {
        Intrinsics.checkNotNullParameter("onAdClick() InterstitialActivity", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object = JioAds$LogLevel.NONE;
        object = this.a;
        c c2 = ((InterstitialAdController)object).getIJioAdViewController();
        object = e.d(((InterstitialAdController)object).getHeaders());
        c2 = (f)c2;
        c2.getClass();
        Intrinsics.checkNotNullParameter(object, "campaignid");
        String string2 = "c";
        Intrinsics.checkNotNullParameter(string2, "type");
        ((f)c2).a.v((String)object, string2);
    }
}

