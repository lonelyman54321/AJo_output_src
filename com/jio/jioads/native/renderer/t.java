/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.native.renderer;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioAds$MediaType;
import com.jio.jioads.controller.f;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import kotlin.jvm.internal.Intrinsics;

public final class t {
    public final /* synthetic */ NativeAdViewRenderer a;

    public t(NativeAdViewRenderer nativeAdViewRenderer) {
        this.a = nativeAdViewRenderer;
    }

    public final void a() {
        int n3;
        Object object = new StringBuilder();
        NativeAdViewRenderer nativeAdViewRenderer = this.a;
        Object object2 = nativeAdViewRenderer.getIJioAdView().P();
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(" failed to load images of carousel cards images");
        Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        int n4 = 0;
        nativeAdViewRenderer.setShouldShowCarousel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(false);
        object = ((f)NativeAdViewRenderer.access$getIJioAdViewController$p((NativeAdViewRenderer)nativeAdViewRenderer)).a.G;
        object2 = JioAds$MediaType.NONE;
        if (object != object2 && (n4 = (object = nativeAdViewRenderer.getIJioAdView()).W()) != (n3 = 1)) {
            NativeAdViewRenderer.access$cacheAndPrepareAdIfMediaCachingTrue(nativeAdViewRenderer);
        } else {
            NativeAdViewRenderer.access$cacheAndPrepareAd(nativeAdViewRenderer);
        }
    }
}

