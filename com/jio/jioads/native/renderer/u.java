/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.native.renderer;

import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioAds$MediaType;
import com.jio.jioads.controller.f;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class u
extends Lambda
implements Function0 {
    public final /* synthetic */ NativeAdViewRenderer c;

    public u(NativeAdViewRenderer nativeAdViewRenderer) {
        this.c = nativeAdViewRenderer;
        super(0);
    }

    public final Object invoke() {
        int n3;
        Object object;
        NativeAdViewRenderer nativeAdViewRenderer = this.c;
        Object object2 = NativeAdViewRenderer.access$getJioNativeViewListener$p(nativeAdViewRenderer);
        boolean bl2 = false;
        Object object3 = null;
        if (object2 != null) {
            object2.i(false);
        }
        if ((object2 = NativeAdViewRenderer.access$getJioNativeViewListener$p(nativeAdViewRenderer)) != null) {
            object2.e(false);
        }
        NativeAdViewRenderer.access$setImpressionProcessed$p(nativeAdViewRenderer, false);
        int n4 = NativeAdViewRenderer.access$isCarouselAd(nativeAdViewRenderer);
        int n7 = 1;
        if (n4 != 0 && ((object2 = nativeAdViewRenderer.getIJioAdView().K()) == (object = JioAdView$AD_TYPE.CUSTOM_NATIVE) || (object2 = nativeAdViewRenderer.getIJioAdView().K()) == (object = JioAdView$AD_TYPE.DYNAMIC_DISPLAY)) && (n4 = NativeAdViewRenderer.access$getMCarouselItemLayoutLayout$p(nativeAdViewRenderer)) != (n3 = -1)) {
            bl2 = true;
        }
        nativeAdViewRenderer.setShouldShowCarousel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(bl2);
        object2 = new StringBuilder();
        object3 = nativeAdViewRenderer.getIJioAdView().P();
        ((StringBuilder)object2).append((String)object3);
        ((StringBuilder)object2).append(": shouldShowCarousel ");
        bl2 = nativeAdViewRenderer.getShouldShowCarousel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        ((StringBuilder)object2).append(bl2);
        object2 = ((StringBuilder)object2).toString();
        object3 = "message";
        Intrinsics.checkNotNullParameter(object2, object3);
        object2 = JioAds.Companion;
        ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = nativeAdViewRenderer.getIJioAdView().K();
        Object object4 = JioAdView$AD_TYPE.DYNAMIC_DISPLAY;
        if (object == object4 && (n3 = (object = nativeAdViewRenderer.getIJioAdView()).W()) == 0) {
            object = NativeAdViewRenderer.access$getJioNativeViewListener$p(nativeAdViewRenderer);
            if (object != null) {
                object = object.n();
            } else {
                n3 = 0;
                object = null;
            }
            object4 = "VAST";
            n3 = (int)(Intrinsics.areEqual(object, object4) ? 1 : 0);
            if (n3 != 0) {
                NativeAdViewRenderer.access$clearAllViews(nativeAdViewRenderer);
            }
        }
        if ((n3 = (int)(nativeAdViewRenderer.getShouldShowCarousel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() ? 1 : 0)) != 0) {
            NativeAdViewRenderer.access$clearCarousalView(nativeAdViewRenderer);
        }
        object = new StringBuilder();
        object4 = nativeAdViewRenderer.getIJioAdView().P();
        ((StringBuilder)object).append((String)object4);
        ((StringBuilder)object).append(": Inside prepareViews Checking media cache value: ");
        object4 = ((f)NativeAdViewRenderer.access$getIJioAdViewController$p((NativeAdViewRenderer)nativeAdViewRenderer)).a.G;
        ((StringBuilder)object).append(object4);
        object = ((StringBuilder)object).toString();
        Intrinsics.checkNotNullParameter(object, object3);
        ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = ((f)NativeAdViewRenderer.access$getIJioAdViewController$p((NativeAdViewRenderer)nativeAdViewRenderer)).a.G;
        object3 = JioAds$MediaType.NONE;
        if (object2 != object3 && (n4 = (object2 = nativeAdViewRenderer.getIJioAdView()).W()) != n7) {
            NativeAdViewRenderer.access$cacheAndPrepareAdIfMediaCachingTrue(nativeAdViewRenderer);
        } else {
            NativeAdViewRenderer.access$cacheAndPrepareAd(nativeAdViewRenderer);
        }
        return Unit.a;
    }
}

