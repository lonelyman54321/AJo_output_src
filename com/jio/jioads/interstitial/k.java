/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 */
package com.jio.jioads.interstitial;

import android.os.CountDownTimer;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.interstitial.InterstitialAdController;
import com.jio.jioads.interstitial.L;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;

public final class k
extends CountDownTimer {
    public final /* synthetic */ InterstitialAdController a;

    public k(InterstitialAdController interstitialAdController, long l2) {
        this.a = interstitialAdController;
        super(l2, 1000L);
    }

    public final void onFinish() {
        int n3;
        JioAdView$AdState jioAdView$AdState;
        InterstitialAdController interstitialAdController = this.a;
        Object object = interstitialAdController.getIJioAdView().k0();
        if (object != (jioAdView$AdState = JioAdView$AdState.DESTROYED) && (n3 = (object = interstitialAdController.getIJioAdView()).W()) == 0) {
            object = InterstitialAdController.access$getJioNativeAdView$p(interstitialAdController);
            if (object != null) {
                ((NativeAdViewRenderer)object).fireViewableImpressionTracker$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            }
            object = InterstitialAdController.access$getListener$p(interstitialAdController);
            boolean bl2 = true;
            object = ((L)object).a;
            InterstitialAdController.access$setViewableImpressionFired$p((InterstitialAdController)object, bl2);
            interstitialAdController.stopViewableImpressionTimer$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        }
    }

    public final void onTick(long l2) {
    }
}

