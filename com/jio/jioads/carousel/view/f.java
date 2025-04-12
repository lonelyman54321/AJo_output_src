/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.carousel.view;

import com.jio.jioads.carousel.data.a;
import com.jio.jioads.carousel.view.i;
import com.jio.jioads.common.e;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import com.jio.jioads.native.renderer.NativeAdViewRenderer$prepareCarouselAd$callback$1$onItemClickSuccess$1;
import com.jio.jioads.native.renderer.t;
import kotlin.jvm.internal.Intrinsics;

public final class f
implements e {
    public final /* synthetic */ i a;
    public final /* synthetic */ a b;

    public f(i i3, a a2) {
        this.a = i3;
        this.b = a2;
    }

    public final void a() {
        Object object = this.a.f;
        object.getClass();
        Intrinsics.checkNotNullParameter(this.b, "item");
        object = ((t)object).a;
        NativeAdViewRenderer.access$adClicked((NativeAdViewRenderer)object);
        NativeAdViewRenderer$prepareCarouselAd$callback$1$onItemClickSuccess$1 nativeAdViewRenderer$prepareCarouselAd$callback$1$onItemClickSuccess$1 = new NativeAdViewRenderer$prepareCarouselAd$callback$1$onItemClickSuccess$1((NativeAdViewRenderer)object);
        nativeAdViewRenderer$prepareCarouselAd$callback$1$onItemClickSuccess$1.start();
    }

    public final void b() {
        this.a.f.a.handleNativeAdClick$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }
}

