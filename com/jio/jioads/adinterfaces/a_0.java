/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.ViewGroup
 */
package com.jio.jioads.adinterfaces;

import android.content.Context;
import android.view.ViewGroup;
import com.jio.jioads.adinterfaces.JioAdListener;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$AdPodVariant;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAdView$ORIENTATION_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$VideoAdType;
import com.jio.jioads.adinterfaces.JioAdView$VideoPlayerViewType;
import com.jio.jioads.adinterfaces.JioAds$MediaType;
import com.jio.jioads.adinterfaces.JioAdsMetadata;
import com.jio.jioads.common.b;
import com.jio.jioads.controller.a;
import com.jio.jioads.controller.o;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from com.jio.jioads.adinterfaces.A
 */
public final class a_0
implements b {
    public boolean a;
    public boolean b;
    public final /* synthetic */ JioAdView c;

    public a_0(JioAdView jioAdView) {
        this.c = jioAdView;
    }

    public final ViewGroup A() {
        return this.c.getParentContainer$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public final Integer B() {
        return JioAdView.access$getVideoBitRate$p(this.c);
    }

    public final HashMap C() {
        return JioAdView.access$getMCustomInterstitialAdContainerMap$p(this.c);
    }

    public final boolean D() {
        return JioAdView.access$getShouldAllowOverlay$p(this.c);
    }

    public final JioAdView$VideoAdType E() {
        return JioAdView.access$getVideoContentType$p(this.c);
    }

    public final boolean F() {
        return JioAdView.access$isPreparedCallBackGiven$p(this.c);
    }

    public final String G() {
        return JioAdView.access$getIAdFormats$p(this.c);
    }

    public final JioAdView$ORIENTATION_TYPE H() {
        return JioAdView.access$getOrientationType$p(this.c);
    }

    public final Integer I() {
        return JioAdView.access$getCustomInStreamAdContainer$p(this.c);
    }

    public final Integer J() {
        return JioAdView.access$getRequestedMinAdDuration$p(this.c);
    }

    public final JioAdView$AD_TYPE K() {
        return this.c.getMAdType$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public final JioAdView$AdPodVariant L() {
        return JioAdView.access$getAdpodVariant$p(this.c);
    }

    public final JioAdListener M() {
        return this.c.getMAdListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public final boolean N() {
        return JioAdView.access$isGetAdsCalled$p(this.c);
    }

    public final Boolean O() {
        boolean bl2;
        JioAdView$AD_TYPE jioAdView$AD_TYPE;
        JioAdView$AD_TYPE jioAdView$AD_TYPE2 = this.c.getMAdType$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        if (jioAdView$AD_TYPE2 == (jioAdView$AD_TYPE = JioAdView$AD_TYPE.DYNAMIC_DISPLAY)) {
            bl2 = true;
        } else {
            bl2 = false;
            jioAdView$AD_TYPE2 = null;
        }
        return bl2;
    }

    public final String P() {
        String string2 = this.c.getMAdspotId$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        if (string2 == null) {
            string2 = "";
        }
        return string2;
    }

    public final int[] Q() {
        return this.c.getSdkDecidedDimensions$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public final JioAdsMetadata R() {
        return this.c.getJioAdsMetaData();
    }

    public final boolean S() {
        return JioAdView.access$isPublisherHandlingFocus$p(this.c);
    }

    public final Integer T() {
        return JioAdView.access$getCustomNativeAdContainer$p(this.c);
    }

    public final void U() {
        this.a = true;
    }

    public final Integer V() {
        return JioAdView.access$getCloseAfterSeconds$p(this.c);
    }

    public final int W() {
        return JioAdView.access$getMAdResponseType$p(this.c);
    }

    public final boolean X() {
        return this.c.isFromLoadCustomAd();
    }

    public final Context Y() {
        return JioAdView.access$getMContext$p(this.c);
    }

    public final void Z(int n3) {
        JioAdView.access$setMAdResponseType$p(this.c, n3);
    }

    public final List a() {
        return this.c.getDynamicDisplayAdSizes();
    }

    public final void a(String string2) {
        Intrinsics.checkNotNullParameter(string2, "nativeAdClickUrl");
        this.c.setCTAFallbackUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(string2);
    }

    public final void a(boolean bl2) {
        this.c.setPgmCampaignAvailable$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(bl2);
    }

    public final Object[] a0() {
        return JioAdView.access$getAudioCompanionContainerDetails$p(this.c);
    }

    public final void b(String string2) {
        Intrinsics.checkNotNullParameter(string2, "nativeUrl");
        this.c.setNativeAdClickUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(string2);
    }

    public final int[] b() {
        return JioAdView.access$getCustomImageSize$p(this.c);
    }

    public final Integer b0() {
        return JioAdView.access$getRequestedAdDuration$p(this.c);
    }

    public final void c(String string2) {
        Intrinsics.checkNotNullParameter(string2, "title");
        this.c.setTitleFromAdView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(string2);
    }

    public final boolean c() {
        return this.c.isPgmCampaignAvailable$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public final Integer c0() {
        return JioAdView.access$getCustomCarousalItemLayout$p(this.c);
    }

    public final String d() {
        return JioAdView.access$getSkipThumbnailUrl$p(this.c);
    }

    public final void d(String string2) {
        Intrinsics.checkNotNullParameter(string2, "ctaText");
        this.c.setCtaTextFormView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(string2);
    }

    public final JioAdView$VideoPlayerViewType d0() {
        return JioAdView.access$getVideoViewType$p(this.c);
    }

    public final void e(String string2) {
        Intrinsics.checkNotNullParameter(string2, "cTABrandPage");
        this.c.setCTABrandPage$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(string2);
    }

    public final boolean e() {
        return this.b;
    }

    public final void e0(int[] nArray) {
        Intrinsics.checkNotNullParameter(nArray, "array");
        this.c.setSdkDecidedDimensions$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(nArray);
    }

    public final int f() {
        return JioAdView.access$getRefreshRateValue$p(this.c);
    }

    public final boolean f0() {
        return JioAdView.access$isPublisherUsingCustomAd$p(this.c);
    }

    public final int g() {
        return JioAdView.access$getMediaTimeout$p(this.c);
    }

    public final boolean g0() {
        return JioAdView.access$getMLoadAdCalled$p(this.c);
    }

    public final void h(long l2) {
        this.c.a(l2, null);
    }

    public final a h0() {
        return JioAdView.access$getJioAdCallback$p(this.c);
    }

    public final int i() {
        return JioAdView.access$getMCustomNativeVideoLayout$p(this.c);
    }

    public final void i(boolean bl2) {
        this.c.setRefreshStarted(bl2);
    }

    public final boolean i0() {
        return JioAdView.access$getEnableSdkBackKeyControl$p(this.c);
    }

    public final void j(JioAdView$AdState jioAdView$AdState) {
        Intrinsics.checkNotNullParameter((Object)jioAdView$AdState, "adState");
        this.c.setMAdState$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(jioAdView$AdState);
    }

    public final int j0() {
        return JioAdView.access$getCustomClickEventKey$p(this.c);
    }

    public final int k() {
        return JioAdView.access$getPodTimeout$p(this.c);
    }

    public final JioAdView$AdState k0() {
        return this.c.getMAdState();
    }

    public final boolean l() {
        return this.c.isRefreshStarted();
    }

    public final ViewGroup l0() {
        return this.c.getCustomNativeContainer();
    }

    public final boolean m() {
        return this.a;
    }

    public final String m0() {
        return JioAdView.access$getDynamicDisplayMaxCustomSize$p(this.c);
    }

    public final JioAdView n() {
        return this.c;
    }

    public final Boolean n0() {
        return JioAdView.access$isExoEnabledFromPublisher$p(this.c);
    }

    public final void o() {
        this.b = true;
    }

    public final int o0() {
        return JioAdView.access$getWrapperLimit$p(this.c);
    }

    public final boolean p() {
        return this.c.isOnAdFailedCalled();
    }

    public final boolean p0() {
        return JioAdView.access$getMIsAdReqCalledByRefresh$p(this.c);
    }

    public final Integer q() {
        return JioAdView.access$getRequestedAdCount$p(this.c);
    }

    public final String q0() {
        return JioAdView.access$getPackageName$p(this.c);
    }

    public final JioAds$MediaType r() {
        return JioAdView.access$getMCacheMode$p(this.c);
    }

    public final int s() {
        return JioAdView.access$getCustomSkipEventKey$p(this.c);
    }

    public final void t() {
        JioAdView.access$setPreparedCallBackGiven$p(this.c, false);
    }

    public final boolean u() {
        return JioAdView.access$getShouldApplyCarouselItemAnimationOnFocus$p(this.c);
    }

    public final boolean v() {
        return this.c.isSystemApp();
    }

    public final int w() {
        return JioAdView.access$getRequestTimeout$p(this.c);
    }

    public final int x() {
        return this.c.getMediationIndexCounter();
    }

    public final Boolean y() {
        boolean bl2;
        JioAdView$AD_TYPE jioAdView$AD_TYPE;
        Object object = this.c;
        boolean bl3 = JioAdView.access$isVerticalAdEnabled$p(object);
        if (bl3 && (object = object.getMAdType$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) == (jioAdView$AD_TYPE = JioAdView$AD_TYPE.DYNAMIC_DISPLAY)) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final o z() {
        o o3 = JioAdView.access$getMJioAdViewController$p(this.c);
        Intrinsics.checkNotNull(o3);
        return o3;
    }
}

