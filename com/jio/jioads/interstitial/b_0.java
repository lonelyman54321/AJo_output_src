/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.interstitial;

import com.jio.jioads.common.g;
import com.jio.jioads.interstitial.InterstitialActivity;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import com.jio.jioads.videomodule.s;

/*
 * Renamed from com.jio.jioads.interstitial.B
 */
public final class b_0
implements g {
    public final /* synthetic */ InterstitialActivity a;

    public b_0(InterstitialActivity interstitialActivity) {
        this.a = interstitialActivity;
    }

    public final void a() {
        Object object = this.a;
        NativeAdViewRenderer nativeAdViewRenderer = InterstitialActivity.access$getNativeAdViewRenderer$p((InterstitialActivity)object);
        if (nativeAdViewRenderer != null) {
            nativeAdViewRenderer.resume$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        }
        if ((object = InterstitialActivity.access$getJioVideoView$p((InterstitialActivity)object)) != null) {
            boolean bl2 = true;
            ((s)object).O(bl2);
        }
    }

    public final void b() {
    }

    public final void c() {
        Object object = this.a;
        NativeAdViewRenderer nativeAdViewRenderer = InterstitialActivity.access$getNativeAdViewRenderer$p((InterstitialActivity)object);
        if (nativeAdViewRenderer != null) {
            nativeAdViewRenderer.pause$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        }
        if ((object = InterstitialActivity.access$getJioVideoView$p((InterstitialActivity)object)) != null) {
            boolean bl2 = true;
            ((s)object).K(bl2);
        }
    }
}

