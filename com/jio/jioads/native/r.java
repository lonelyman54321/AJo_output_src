/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 */
package com.jio.jioads.native;

import android.os.CountDownTimer;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.native.NativeAdController;
import com.jio.jioads.native.n;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;

public final class r
extends CountDownTimer {
    public final /* synthetic */ NativeAdController a;

    public r(NativeAdController nativeAdController, long l2) {
        this.a = nativeAdController;
        super(l2, 1000L);
    }

    public final void onFinish() {
        int n3;
        JioAdView$AdState jioAdView$AdState;
        NativeAdController nativeAdController = this.a;
        Object object = NativeAdController.access$getIJioAdView$p(nativeAdController).k0();
        if (object != (jioAdView$AdState = JioAdView$AdState.DESTROYED) && (n3 = (object = NativeAdController.access$getIJioAdView$p(nativeAdController)).W()) == 0) {
            object = NativeAdController.access$getJioNativeAdView$p(nativeAdController);
            if (object != null) {
                ((NativeAdViewRenderer)object).fireViewableImpressionTracker$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            }
            object = NativeAdController.access$getListener$p(nativeAdController);
            boolean bl2 = true;
            object = ((n)object).a;
            NativeAdController.access$setViewableImpressionFired$p((NativeAdController)object, bl2);
            nativeAdController.stopViewableImpressionTimer$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        }
    }

    public final void onTick(long l2) {
    }
}

