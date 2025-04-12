/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.jio.jioads.native.renderer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAdView$MediaPlayBack;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.common.b;
import com.jio.jioads.common.c;
import com.jio.jioads.controller.f;
import com.jio.jioads.controller.m;
import com.jio.jioads.controller.o;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import com.jio.jioads.native.utils.a;
import com.jio.jioads.util.Utility;
import com.jio.jioads.videomodule.s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

public final class NativeAdViewRenderer$a
implements com.jio.jioads.videomodule.callback.a {
    public final /* synthetic */ b a;
    public final /* synthetic */ NativeAdViewRenderer b;
    public final /* synthetic */ com.jio.jioads.controller.a c;
    public final /* synthetic */ c d;

    public NativeAdViewRenderer$a(b b2, NativeAdViewRenderer nativeAdViewRenderer, com.jio.jioads.controller.a a2, c c2) {
        this.a = b2;
        this.b = nativeAdViewRenderer;
        this.c = a2;
        this.d = c2;
    }

    public final boolean canPrepareNextVideoAd(int n3) {
        return true;
    }

    public final int getBitRate() {
        int n3;
        Integer n4 = this.a.B();
        if (n4 != null) {
            n3 = n4;
        } else {
            n3 = 0;
            n4 = null;
        }
        return n3;
    }

    public final void onAdChange(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "adId");
    }

    public final void onAdClick() {
        ((V)this.c).a();
    }

    public final void onAdCollapsed() {
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.COLLAPSED;
        ((V)this.c).e(jioAdView$AdState);
    }

    public final void onAdComplete(String object, int n3, int n4, int n7, Integer object2) {
        Intrinsics.checkNotNullParameter(object, "adId");
        object = new StringBuilder();
        b b2 = this.a;
        j_0.n(b2, (StringBuilder)object, ": NativeAd onAdComplete called and getAdState is: ");
        Object object3 = b2.k0();
        ((StringBuilder)object).append(object3);
        object = ((StringBuilder)object).toString();
        object3 = "message";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object4 = JioAds$LogLevel.NONE;
        object4 = b2.k0();
        object2 = JioAdView$AdState.FAILED;
        if (object4 != object2) {
            int n8;
            object4 = JioAdView$AdState.CLOSED;
            object2 = (V)this.c;
            ((V)object2).e((JioAdView$AdState)((Object)object4));
            object4 = new StringBuilder();
            j_0.n(b2, (StringBuilder)object4, ": native ad currentPlayer : ");
            NativeAdViewRenderer nativeAdViewRenderer = this.b;
            int n10 = NativeAdViewRenderer.access$getCurrentPlayer$p(nativeAdViewRenderer);
            ((StringBuilder)object4).append(n10);
            Intrinsics.checkNotNullParameter(((StringBuilder)object4).toString(), (String)object3);
            ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object4 = NativeAdViewRenderer.access$isCarouselPreparedAfterVideoAd$p(nativeAdViewRenderer);
            Boolean bl2 = Boolean.TRUE;
            n7 = (int)(Intrinsics.areEqual(object4, bl2) ? 1 : 0);
            n10 = 1;
            if (n7 != 0) {
                NativeAdViewRenderer.access$clearVideoData(nativeAdViewRenderer);
                NativeAdViewRenderer.access$handleCarouselVisibility(nativeAdViewRenderer);
                object4 = b2.K();
                JioAdView$AD_TYPE jioAdView$AD_TYPE = JioAdView$AD_TYPE.CUSTOM_NATIVE;
                if (object4 == jioAdView$AD_TYPE) {
                    NativeAdViewRenderer.access$downloadAndDisplayAdIconForCustomNativeAd(nativeAdViewRenderer);
                    NativeAdViewRenderer.access$downloadFileCustomNative(nativeAdViewRenderer);
                }
            } else {
                n7 = NativeAdViewRenderer.access$getCurrentPlayer$p(nativeAdViewRenderer);
                if (n7 == n10 && (n7 = (int)(NativeAdViewRenderer.access$getNeedToloadVideoOnCompletePlayerOne$p(nativeAdViewRenderer) ? 1 : 0)) != 0) {
                    NativeAdViewRenderer.access$setNeedToloadVideoOnCompletePlayerOne$p(nativeAdViewRenderer, false);
                    NativeAdViewRenderer.f(nativeAdViewRenderer);
                } else {
                    n7 = NativeAdViewRenderer.access$getCurrentPlayer$p(nativeAdViewRenderer);
                    if (n7 == (n8 = 2) && (n7 = (int)(NativeAdViewRenderer.access$getNeedToloadVideoOnCompletePlayerTwo$p(nativeAdViewRenderer) ? 1 : 0)) != 0) {
                        NativeAdViewRenderer.access$setNeedToloadVideoOnCompletePlayerTwo$p(nativeAdViewRenderer, false);
                        NativeAdViewRenderer.f(nativeAdViewRenderer);
                    }
                }
            }
            object4 = m.a(b2, ": native HTML ad waitForComplete value is : ");
            n8 = (int)(nativeAdViewRenderer.getWaitForCompleteHTMLAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() ? 1 : 0);
            ((StringBuilder)object4).append(n8 != 0);
            object4 = ((StringBuilder)object4).toString();
            Intrinsics.checkNotNullParameter(object4, (String)object3);
            object3 = ((JioAds$Companion)object).getInstance();
            ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            n4 = (int)(nativeAdViewRenderer.getWaitForCompleteHTMLAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() ? 1 : 0);
            if (n4 != 0) {
                object3 = NativeAdViewRenderer.access$getJioNativeViewListener$p(nativeAdViewRenderer);
                if (object3 != null) {
                    object3.f();
                }
                nativeAdViewRenderer.setWaitForCompleteHTMLAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(false);
            }
            if ((object3 = b2.K()) == (object4 = JioAdView$AD_TYPE.INTERSTITIAL)) {
                ((V)object2).l();
                object3 = new StringBuilder();
                object2 = ": AdType INTERSTITIAL closeAfter for VIDEO NATIVE AD";
                j_0.i(b2, (StringBuilder)object3, (String)object2);
                ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                b2.o();
                object = nativeAdViewRenderer.getContainerView();
                n4 = 0;
                object3 = null;
                if (object != null) {
                    object2 = "NativeAdSkipElement";
                    object = (TextView)object.findViewWithTag(object2);
                } else {
                    object = null;
                }
                object2 = nativeAdViewRenderer.getContainerView();
                if (object2 != null) {
                    object3 = (TextView)object2.findViewWithTag("NativeAdSkipElementFocused");
                }
                if ((object2 = b2.K()) == object4) {
                    object4 = "Close";
                    if (object != null) {
                        object.setText((CharSequence)object4);
                    }
                    if (object3 != null) {
                        object3.setText((CharSequence)object4);
                    }
                    if ((object4 = b2.Y()) != null && (n7 = (int)(j_0.l((Context)object4) ? 1 : 0)) == n10 && object != null && object3 != null) {
                        object4 = "Close Ad";
                        object3.setText((CharSequence)object4);
                        object.setText((CharSequence)object4);
                    }
                }
                object = b2.V();
                NativeAdViewRenderer.access$closeAfter(nativeAdViewRenderer, (Integer)object);
            }
        }
    }

    public final void onAdExpand() {
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.EXPANDED;
        ((V)this.c).e(jioAdView$AdState);
    }

    public final void onAdLoaded(String object, int n3) {
        Intrinsics.checkNotNullParameter(object, "adId");
        object = JioAdView$AdState.STARTED;
        ((V)this.c).e((JioAdView$AdState)((Object)object));
        object = new StringBuilder();
        b b2 = this.a;
        j_0.i(b2, (StringBuilder)object, ": NativeAdViewRenderer onAdLoaded called ");
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object2 = JioAds$LogLevel.NONE;
        n3 = b2.W();
        int n4 = 1;
        NativeAdViewRenderer nativeAdViewRenderer = this.b;
        if (n3 == n4) {
            n3 = (int)(b2.l() ? 1 : 0);
            Object object3 = "";
            if (n3 != 0) {
                object2 = ((f)this.d).a;
                n3 = (int)(((o)object2).I ? 1 : 0);
                if (n3 != 0) {
                    object2 = new StringBuilder();
                    String string2 = ":  Callback onAdRefresh()";
                    j_0.i(b2, (StringBuilder)object2, string2);
                    ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = nativeAdViewRenderer.getJioVideoView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    if (object != null) {
                        object = NativeAdViewRenderer.access$getJioNativeViewListener$p(nativeAdViewRenderer);
                        if (object != null) {
                            object2 = nativeAdViewRenderer.getJioVideoView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            if (object2 != null && (object2 = ((s)object2).T()) != null) {
                                object3 = object2;
                            }
                            object.a((String)object3);
                        }
                    } else {
                        object = nativeAdViewRenderer.getJioVideoViewSecond$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        if (object != null && (object = NativeAdViewRenderer.access$getJioNativeViewListener$p(nativeAdViewRenderer)) != null) {
                            object2 = nativeAdViewRenderer.getJioVideoViewSecond$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            if (object2 != null && (object2 = ((s)object2).T()) != null) {
                                object3 = object2;
                            }
                            object.a((String)object3);
                        }
                    }
                    return;
                }
            }
            object2 = new StringBuilder();
            String string3 = ":  Callback onAdRender()";
            j_0.i(b2, (StringBuilder)object2, string3);
            object = ((JioAds$Companion)object).getInstance();
            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            boolean bl2 = nativeAdViewRenderer.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            if (!bl2) {
                b2.U();
            }
            if ((object = nativeAdViewRenderer.getJioVideoView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
                object = NativeAdViewRenderer.access$getJioNativeViewListener$p(nativeAdViewRenderer);
                if (object != null) {
                    object2 = nativeAdViewRenderer.getJioVideoView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    if (object2 != null && (object2 = ((s)object2).T()) != null) {
                        object3 = object2;
                    }
                    object.b((String)object3);
                }
            } else {
                object = nativeAdViewRenderer.getJioVideoViewSecond$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                if (object != null && (object = NativeAdViewRenderer.access$getJioNativeViewListener$p(nativeAdViewRenderer)) != null) {
                    object2 = nativeAdViewRenderer.getJioVideoViewSecond$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    if (object2 != null && (object2 = ((s)object2).T()) != null) {
                        object3 = object2;
                    }
                    object.b((String)object3);
                }
            }
        } else {
            object2 = new StringBuilder();
            String string4 = ": call handleAdRenderCallback from video listener";
            j_0.i(b2, (StringBuilder)object2, string4);
            ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            NativeAdViewRenderer.access$handleAdRenderCallback(nativeAdViewRenderer);
            boolean bl3 = false;
            object = null;
            nativeAdViewRenderer.a(false);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onAdPrepared(String object) {
        Exception exception2;
        Object object2;
        Object object3;
        block6: {
            Object object4;
            Object object5;
            int n3;
            Object object6;
            Object object7;
            block5: {
                object3 = this.b;
                Intrinsics.checkNotNullParameter(object, "adId");
                object = new StringBuilder();
                object2 = "message";
                object7 = this.a;
                j_0.i((b)object7, (StringBuilder)object, ": Native video is Prepared");
                object = JioAds.Companion;
                ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object6 = JioAds$LogLevel.NONE;
                n3 = 1;
                try {
                    NativeAdViewRenderer.access$setPreparedAd$p((NativeAdViewRenderer)object3, n3 != 0);
                    object5 = this.c;
                    object4 = JioAdView$AdState.PREPARED;
                    object5 = (V)object5;
                    ((V)object5).e((JioAdView$AdState)((Object)object4));
                    object5 = NativeAdViewRenderer.access$getJioNativeViewListener$p((NativeAdViewRenderer)object3);
                    if (object5 == null) break block5;
                    ((NativeAdViewRenderer)object3).getContainerView();
                    object5.b();
                }
                catch (Exception exception2) {
                    break block6;
                }
            }
            NativeAdViewRenderer.access$initVCEValue((NativeAdViewRenderer)object3);
            NativeAdViewRenderer.access$setNativeAdClickUrls((NativeAdViewRenderer)object3);
            object5 = new StringBuilder();
            object4 = object7.P();
            ((StringBuilder)object5).append((String)object4);
            object4 = ": value of isvideoLoadAdCalled value: ";
            ((StringBuilder)object5).append((String)object4);
            boolean bl2 = NativeAdViewRenderer.access$isVideoLoadAdCalled$p((NativeAdViewRenderer)object3);
            ((StringBuilder)object5).append(bl2);
            object5 = ((StringBuilder)object5).toString();
            Intrinsics.checkNotNullParameter(object5, (String)object2);
            object5 = ((JioAds$Companion)object).getInstance();
            ((JioAds)object5).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            int n4 = NativeAdViewRenderer.access$isVideoLoadAdCalled$p((NativeAdViewRenderer)object3);
            if (!n4) {
                object5 = new StringBuilder();
                object7 = object7.P();
                ((StringBuilder)object5).append((String)object7);
                object7 = ": onAdPrepared: showVideoAd() called from on ad prepared";
                ((StringBuilder)object5).append((String)object7);
                object7 = ((StringBuilder)object5).toString();
                Intrinsics.checkNotNullParameter(object7, (String)object2);
                object = ((JioAds$Companion)object).getInstance();
                ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                NativeAdViewRenderer.access$setVideoLoadAdCalled$p((NativeAdViewRenderer)object3, n3 != 0);
                NativeAdViewRenderer.access$showVideoAd((NativeAdViewRenderer)object3);
                return;
            }
            object5 = NativeAdViewRenderer.access$getJioNativeViewListener$p((NativeAdViewRenderer)object3);
            if (object5 != null && !(n4 = object5.g()) && (object5 = NativeAdViewRenderer.access$getNativeAdViewFromPublisher$p((NativeAdViewRenderer)object3)) != null) {
                object5 = Utility.INSTANCE;
                object4 = NativeAdViewRenderer.access$getNativeAdViewFromPublisher$p((NativeAdViewRenderer)object3);
                Intrinsics.checkNotNull(object4);
                int n7 = 5;
                n4 = (int)(((Utility)object5).checkVisibility((ViewGroup)object4, n7) ? 1 : 0);
                if (!n4) {
                    NativeAdViewRenderer.access$setVideoLoadAdCalled$p((NativeAdViewRenderer)object3, n3 != 0);
                    NativeAdViewRenderer.access$showVideoAd((NativeAdViewRenderer)object3);
                    return;
                }
            }
            if ((n4 = object7.l()) == 0) return;
            n4 = object7.W();
            if (n4 != n3) return;
            n3 = (int)(NativeAdViewRenderer.access$isNativeVideoReadyToShowAfter5sec$p((NativeAdViewRenderer)object3) ? 1 : 0);
            if (n3 == 0) return;
            object6 = new StringBuilder();
            object7 = object7.P();
            ((StringBuilder)object6).append((String)object7);
            object7 = ": onAdPrepared: isRefreshStarted on prepared";
            ((StringBuilder)object6).append((String)object7);
            object7 = ((StringBuilder)object6).toString();
            Intrinsics.checkNotNullParameter(object7, (String)object2);
            object = ((JioAds$Companion)object).getInstance();
            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = NativeAdViewRenderer.access$getJioNativeViewListener$p((NativeAdViewRenderer)object3);
            if (object == null) return;
            object.f();
            return;
        }
        object3 = new StringBuilder("Exception while render video to NativeContainer: ");
        object2 = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c((Utility)object2, exception2, (StringBuilder)object3);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }

    public final void onAdProgress(String string2, long l2, long l3) {
        long l4;
        Object object;
        Object object2 = string2;
        Intrinsics.checkNotNullParameter(string2, "adId");
        Object object3 = (V)this.c;
        ((V)object3).c(l3, string2, l2);
        int n3 = 1000;
        long l7 = n3;
        long l8 = l3 / l7;
        Object object4 = l8;
        object2 = this.b;
        NativeAdViewRenderer.access$setVideoDuration$p((NativeAdViewRenderer)object2, object4);
        int n4 = NativeAdViewRenderer.access$getRefreshRate$p((NativeAdViewRenderer)object2);
        String string3 = "-?\\d+";
        boolean bl2 = true;
        long l12 = 0L;
        b b2 = this.a;
        if (n4 != 0) {
            long l14;
            long l15;
            object4 = b2.K();
            if (object4 == (object = JioAdView$AD_TYPE.CONTENT_STREAM) || (object4 = b2.K()) == (object = JioAdView$AD_TYPE.CUSTOM_NATIVE) || (object4 = b2.K()) == (object = JioAdView$AD_TYPE.DYNAMIC_DISPLAY)) {
                n4 = NativeAdViewRenderer.access$getVideoRepeatCount$p((NativeAdViewRenderer)object2);
                l4 = n4;
                object4 = NativeAdViewRenderer.access$getVideoDuration$p((NativeAdViewRenderer)object2);
                l15 = object4 != null ? object4 : l12;
                l4 *= l15;
                l15 = l2 / l7 + l4;
                NativeAdViewRenderer.access$setTotalVideoPlayTime$p((NativeAdViewRenderer)object2, l15);
                object4 = NativeAdViewRenderer.access$getVideoDuration$p((NativeAdViewRenderer)object2);
                l4 = object4 != null ? object4 : l12;
                n4 = NativeAdViewRenderer.access$getRefreshRate$p((NativeAdViewRenderer)object2);
                l15 = n4;
                object4 = "message";
                Object object5 = l4 == l15 ? 0 : (l4 < l15 ? -1 : 1);
                if (object5 < 0) {
                    long l16;
                    boolean bl3;
                    boolean n10;
                    object = NativeAdViewRenderer.access$getMContext$p((NativeAdViewRenderer)object2);
                    Object object6 = b2.K();
                    boolean bl32 = NativeAdViewRenderer.access$isVootPackageWithNativeVideoAd((NativeAdViewRenderer)object2, (Context)object, (JioAdView$AD_TYPE)((Object)object6));
                    int bl4 = NativeAdViewRenderer.access$getRefreshRate$p((NativeAdViewRenderer)object2);
                    long l17 = bl4;
                    long l18 = NativeAdViewRenderer.access$getTotalVideoPlayTime$p((NativeAdViewRenderer)object2);
                    int n7 = NativeAdViewRenderer.access$getVIDEO_REFRESH_THRESHOLD$p((NativeAdViewRenderer)object2);
                    long l19 = (l17 -= l18) - (l18 = (long)n7);
                    Object object7 = l19 == 0L ? 0 : (l19 < 0L ? -1 : 1);
                    if (!(object7 > 0 || (n10 = b2.l()) || (object6 = NativeAdViewRenderer.access$getVideoDuration$p((NativeAdViewRenderer)object2)) == null || (bl3 = NativeAdViewRenderer.access$isLastIteration((NativeAdViewRenderer)object2, l17 = ((Long)object6).longValue())) != bl2 || bl32 || (bl32 = b2.l()))) {
                        object = m.a(b2, ": inside calling cacheAd() for Native Vast Video Refresh, ");
                        int n8 = NativeAdViewRenderer.access$getVIDEO_REFRESH_THRESHOLD$p((NativeAdViewRenderer)object2);
                        ((StringBuilder)object).append(n8);
                        object6 = " seconds before";
                        ((StringBuilder)object).append((String)object6);
                        object = ((StringBuilder)object).toString();
                        Intrinsics.checkNotNullParameter(object, (String)object4);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object4 = JioAds$LogLevel.NONE;
                        NativeAdViewRenderer.access$refreshNativeVideo((NativeAdViewRenderer)object2);
                    }
                    if ((n4 = (int)((l16 = (l4 = NativeAdViewRenderer.access$getTotalVideoPlayTime$p((NativeAdViewRenderer)object2)) - (l15 = (long)NativeAdViewRenderer.access$getRefreshRate$p((NativeAdViewRenderer)object2))) == 0L ? 0 : (l16 < 0L ? -1 : 1))) >= 0 && (n4 = (int)(NativeAdViewRenderer.access$isVootPackageWithNativeVideoAd((NativeAdViewRenderer)object2, (Context)(object4 = NativeAdViewRenderer.access$getMContext$p((NativeAdViewRenderer)object2)), (JioAdView$AD_TYPE)((Object)(object = b2.K()))) ? 1 : 0)) == 0 && (n4 = (int)(NativeAdViewRenderer.access$isLastIteration$p((NativeAdViewRenderer)object2) ? 1 : 0)) == 0) {
                        com.jio.jioads.audioplayer.b.a(b2, ": refreshing video as isLastIteration is false ");
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object4 = JioAds$LogLevel.NONE;
                        NativeAdViewRenderer.access$setLastIteration$p((NativeAdViewRenderer)object2, bl2);
                        NativeAdViewRenderer.f((NativeAdViewRenderer)object2);
                    }
                } else {
                    boolean bl5;
                    object = NativeAdViewRenderer.access$getVideoDuration$p((NativeAdViewRenderer)object2);
                    l4 = object != null ? (Long)object : l12;
                    l15 = NativeAdViewRenderer.access$getTotalVideoPlayTime$p((NativeAdViewRenderer)object2);
                    int n10 = NativeAdViewRenderer.access$getVIDEO_REFRESH_THRESHOLD$p((NativeAdViewRenderer)object2);
                    long l20 = (l4 -= l15) - (l15 = (long)n10);
                    object5 = l20 == 0L ? 0 : (l20 < 0L ? -1 : 1);
                    if (object5 < 0 && !(bl5 = b2.l())) {
                        object = new StringBuilder("inside Video duration is grater then refresh time so calling cacheAd() before ");
                        int n14 = NativeAdViewRenderer.access$getVIDEO_REFRESH_THRESHOLD$p((NativeAdViewRenderer)object2);
                        ((StringBuilder)object).append(n14);
                        String string4 = " seconds ";
                        ((StringBuilder)object).append(string4);
                        object = ((StringBuilder)object).toString();
                        Intrinsics.checkNotNullParameter(object, (String)object4);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object4 = JioAds$LogLevel.NONE;
                        n4 = (int)(b2.l() ? 1 : 0);
                        if (n4 == 0) {
                            NativeAdViewRenderer.access$refreshNativeVideo((NativeAdViewRenderer)object2);
                        }
                    }
                }
            }
            if ((n4 = (int)(((Regex)(object = new Regex(string3))).c((CharSequence)(object4 = ((NativeAdViewRenderer)object2).getTime())) ? 1 : 0)) != 0 && (object4 = ((NativeAdViewRenderer)object2).getTime()) != null && (n4 = ((String)object4).length()) != 0 && (n4 = (int)((l14 = (l4 = l2 / l7) - (l15 = (long)Integer.parseInt((String)(object4 = ((NativeAdViewRenderer)object2).getTime())))) == 0L ? 0 : (l14 < 0L ? -1 : 1))) >= 0) {
                NativeAdViewRenderer.access$setCtaButtonVisibility((NativeAdViewRenderer)object2, bl2);
            }
        }
        if ((object4 = b2.K()) == (object = JioAdView$AD_TYPE.INTERSTITIAL) && (n4 = (int)(((Regex)(object = new Regex(string3))).c((CharSequence)(object4 = ((NativeAdViewRenderer)object2).getTime())) ? 1 : 0)) != 0 && (object4 = ((NativeAdViewRenderer)object2).getTime()) != null && (n4 = ((String)object4).length()) != 0) {
            object4 = ((NativeAdViewRenderer)object2).getTime();
            l4 = Integer.parseInt((String)object4);
            long l21 = (l7 = l2 / l7) - l4;
            n4 = (int)(l21 == 0L ? 0 : (l21 < 0L ? -1 : 1));
            if (n4 >= 0) {
                NativeAdViewRenderer.access$setCtaButtonVisibility((NativeAdViewRenderer)object2, bl2);
            } else {
                n3 = (int)(l2 == l12 ? 0 : (l2 < l12 ? -1 : 1));
                if (n3 > 0) {
                    com.jio.jioads.audioplayer.b.a(b2, " : Click is disable}");
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object3 = JioAds$LogLevel.NONE;
                    object3 = ((NativeAdViewRenderer)object2).getMediaLayout$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    if (object3 != null) {
                        object3 = ((NativeAdViewRenderer)object2).getMediaLayout$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        RelativeLayout relativeLayout = null;
                        n4 = 0;
                        object4 = null;
                        if (object3 != null) {
                            object3 = object3.getChildAt(0);
                        } else {
                            n3 = 0;
                            object3 = null;
                        }
                        boolean bl4 = object3 instanceof ViewGroup;
                        if (bl4) {
                            object3 = (ViewGroup)object3;
                        } else {
                            n3 = 0;
                            object3 = null;
                        }
                        if (object3 != null) {
                            bl4 = (object3 = object3.getChildAt(0)) instanceof ViewGroup;
                            if (bl4) {
                                object3 = (ViewGroup)object3;
                            } else {
                                n3 = 0;
                                object3 = null;
                            }
                            if (object3 != null) {
                                object3 = ((ViewGroup)object3).getChildAt(0);
                            } else {
                                n3 = 0;
                                object3 = null;
                            }
                            if (object3 != null) {
                                ((View)object3).setClickable(false);
                            }
                        }
                        if ((object3 = ((NativeAdViewRenderer)object2).getMediaLayout$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
                            object3.setClickable(false);
                        }
                        object3 = ((NativeAdViewRenderer)object2).getJioVideoView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        if (object3 != null) {
                            relativeLayout = ((s)object3).c0();
                        }
                        if (relativeLayout != null) {
                            ((View)relativeLayout).setClickable(false);
                        }
                    }
                }
            }
        }
    }

    public final void onAdSkippable(String string2, int n3, int n4, int n7, Integer n8) {
        Intrinsics.checkNotNullParameter(string2, "adId");
        ((V)this.c).p();
    }

    public final void onAdSkipped(int n3, int n4, Integer object) {
        Object object2 = new StringBuilder();
        Object object3 = this.a;
        j_0.n(object3, object2, ": NativeAd onAdSkipped called and getAdState is: ");
        object = object3.k0();
        object2.append(object);
        Intrinsics.checkNotNullParameter(object2.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        object2 = this.b;
        object = NativeAdViewRenderer.access$isCarouselPreparedAfterVideoAd$p((NativeAdViewRenderer)object2);
        Boolean bl2 = Boolean.TRUE;
        boolean bl3 = Intrinsics.areEqual(object, bl2);
        if (bl3) {
            NativeAdViewRenderer.access$clearVideoData((NativeAdViewRenderer)object2);
            NativeAdViewRenderer.access$handleCarouselVisibility((NativeAdViewRenderer)object2);
            object3 = object3.K();
            object = JioAdView$AD_TYPE.CUSTOM_NATIVE;
            if (object3 == object) {
                NativeAdViewRenderer.access$downloadAndDisplayAdIconForCustomNativeAd((NativeAdViewRenderer)object2);
                NativeAdViewRenderer.access$downloadFileCustomNative((NativeAdViewRenderer)object2);
            }
        }
    }

    public final void onAdStarted(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "adId");
        ((V)this.c).m();
    }

    public final void onAllAdMediaProgress(long l2, long l3) {
    }

    public final void onFailedToLoad(JioAdError jioAdError, boolean bl2, d d2, String string2, String string3, String string4) {
        d d5 = com.jio.jioads.cdnlogging.d.a;
        Intrinsics.checkNotNullParameter(jioAdError, "jioAdError");
        Intrinsics.checkNotNullParameter((Object)d5, "errorSeverity");
        Intrinsics.checkNotNullParameter(string2, "methodName");
        Intrinsics.checkNotNullParameter(string3, "className");
        Intrinsics.checkNotNullParameter(string4, "errorDesc");
        String string5 = "InstreamVideo: ".concat(string3);
        com.jio.jioads.controller.a a2 = this.c;
        ((V)a2).d(jioAdError, false, d5, string2, string5, string4, null);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void onMediaPlaybackChange(com.jio.jioads.videomodule.b object) {
        void var1_16;
        block8: {
            NativeAdViewRenderer nativeAdViewRenderer;
            b b2;
            JioAdView$AD_TYPE jioAdView$AD_TYPE;
            block9: {
                Intrinsics.checkNotNullParameter(object, "type");
                int n3 = ((Enum)object).ordinal();
                jioAdView$AD_TYPE = null;
                b2 = this.a;
                nativeAdViewRenderer = this.b;
                if (n3 == 0) break block9;
                int n4 = 1;
                if (n3 != n4) {
                    int n7 = 2;
                    if (n3 != n7) {
                        int n8 = 3;
                        if (n3 != n8) {
                            NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
                            throw noWhenBranchMatchedException;
                        }
                        NativeAdViewRenderer.access$setVideoMute$p(nativeAdViewRenderer, false);
                        JioAdView$MediaPlayBack jioAdView$MediaPlayBack = JioAdView$MediaPlayBack.UNMUTE;
                        break block8;
                    } else {
                        NativeAdViewRenderer.access$setVideoMute$p(nativeAdViewRenderer, n4 != 0);
                        JioAdView$MediaPlayBack jioAdView$MediaPlayBack = JioAdView$MediaPlayBack.MUTE;
                    }
                    break block8;
                } else {
                    int n10;
                    s s7;
                    int n14;
                    s s8;
                    JioAdView$AD_TYPE jioAdView$AD_TYPE2 = b2.K();
                    if (jioAdView$AD_TYPE2 != (jioAdView$AD_TYPE = JioAdView$AD_TYPE.INTERSTITIAL) && ((s8 = nativeAdViewRenderer.getJioVideoView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null && (n14 = s8.j0) == n4 || (s7 = nativeAdViewRenderer.getJioVideoViewSecond$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null && (n10 = s7.j0) == n4)) {
                        NativeAdViewRenderer.access$initiateVideoAdAutoRefresh(nativeAdViewRenderer);
                    }
                    JioAdView$MediaPlayBack jioAdView$MediaPlayBack = JioAdView$MediaPlayBack.PAUSE;
                }
                break block8;
            }
            NativeAdViewRenderer.access$setAutoStartVideoAd$p(nativeAdViewRenderer, false);
            JioAdView$AD_TYPE jioAdView$AD_TYPE3 = b2.K();
            jioAdView$AD_TYPE = JioAdView$AD_TYPE.INTERSTITIAL;
            if (jioAdView$AD_TYPE3 != jioAdView$AD_TYPE) {
                a a2 = NativeAdViewRenderer.access$getRefreshHandler$p(nativeAdViewRenderer);
                if (a2 != null) {
                    long l2;
                    a2.a();
                    a2.h = l2 = 0L;
                }
                com.jio.jioads.audioplayer.b.a(b2, ": Refresh Timer cancel");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            }
            JioAdView$MediaPlayBack jioAdView$MediaPlayBack = JioAdView$MediaPlayBack.RESUME;
        }
        ((V)this.c).f((JioAdView$MediaPlayBack)var1_16);
    }

    public final void onMediaPrepareTimeOut(String string2, int n3) {
        Intrinsics.checkNotNullParameter(string2, "adId");
        Object object = JioAdError.Companion;
        Enum enum_ = JioAdError$JioAdErrorType.ERROR_TIMEOUT;
        JioAdError jioAdError = j_0.c((t_0)object, (JioAdError$JioAdErrorType)enum_, "Video Ad Timeout Error");
        d d2 = com.jio.jioads.cdnlogging.d.a;
        object = new StringBuilder("JioVideoView-Player failed to prepare because of timeout for ads ");
        enum_ = this.a.K();
        ((StringBuilder)object).append(enum_);
        String string3 = ((StringBuilder)object).toString();
        object = this.c;
        ((V)object).d(jioAdError, false, d2, string2, "JioVideoView-adFailedToLoad", string3, null);
    }

    public final void onPlayAgain(String object, int n3) {
        Intrinsics.checkNotNullParameter(object, "adId");
        object = new StringBuilder();
        j_0.i(this.a, (StringBuilder)object, ": NativeAdRender onPlayAgain called");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = 0L;
        NativeAdViewRenderer nativeAdViewRenderer = this.b;
        NativeAdViewRenderer.access$setVideoDuration$p(nativeAdViewRenderer, (Long)object);
        NativeAdViewRenderer.access$setVideoRepeatCount$p(nativeAdViewRenderer, n3);
    }

    public final void onPlayerError(int n3, String object) {
        boolean bl2;
        Object object2 = this.b;
        object = NativeAdViewRenderer.access$getJioAdParser$p((NativeAdViewRenderer)object2);
        if (object != null) {
            object = ((com.jio.jioads.native.parser.a)object).p;
        } else {
            bl2 = false;
            object = null;
        }
        b b2 = this.a;
        if (object != null && (bl2 = ((String)object).length())) {
            bl2 = b2.l();
            if (!bl2 && (bl2 = (boolean)NativeAdViewRenderer.access$isVideoLoadAdCalled$p((NativeAdViewRenderer)object2))) {
                com.jio.jioads.audioplayer.b.a(b2, ": inside onPlayerError() set variable because loadAd still not called");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                bl2 = true;
                NativeAdViewRenderer.access$setStartRefreshAsVideoFailedToPrepared$p((NativeAdViewRenderer)object2, bl2);
            } else {
                bl2 = ((NativeAdViewRenderer)object2).isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                if (bl2) {
                    com.jio.jioads.audioplayer.b.a(b2, ": inside onPlayerError() starting refresh handler as for video ad loadAD called.");
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                    object2 = NativeAdViewRenderer.access$getJioNativeViewListener$p((NativeAdViewRenderer)object2);
                    if (object2 != null) {
                        object2.d();
                    }
                }
            }
            return;
        }
        com.jio.jioads.audioplayer.b.a(b2, ": Giving Native ad Video Timeout Error");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = JioAdError$JioAdErrorType.ERROR_TIMEOUT;
        NativeAdViewRenderer.access$setNativeError((NativeAdViewRenderer)object2, "Video Ad Timeout Error", (JioAdError$JioAdErrorType)((Object)object));
    }

    public final void onStartPrepare(String object, int n3) {
        Intrinsics.checkNotNullParameter(object, "adId");
        object = new StringBuilder();
        j_0.i(this.a, (StringBuilder)object, ": Native Instream onStartPrepare");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void playAgainFromMediaPlayer(String object, int n3) {
        Exception exception2;
        Object object2;
        CharSequence charSequence;
        block11: {
            Object object3;
            Object object4;
            block9: {
                block10: {
                    Object object5;
                    int n4;
                    long l2;
                    long l3;
                    charSequence = "message";
                    object2 = this.a;
                    object4 = this.b;
                    object3 = "adId";
                    Intrinsics.checkNotNullParameter(object, (String)object3);
                    try {
                        object = new StringBuilder();
                        object3 = object2.P();
                        ((StringBuilder)object).append((String)object3);
                        object3 = ": Inside NativeAdRenderer playAgainFromMediaPlayer() called ";
                        ((StringBuilder)object).append((String)object3);
                        object = ((StringBuilder)object).toString();
                        Intrinsics.checkNotNullParameter(object, charSequence);
                        object = JioAds.Companion;
                        object3 = ((JioAds$Companion)object).getInstance();
                        ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object3 = JioAds$LogLevel.NONE;
                        object3 = object2.k0();
                        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.FAILED;
                        if (object3 == jioAdView$AdState) break block9;
                        int n7 = NativeAdViewRenderer.access$isExoPlayerEnabled((NativeAdViewRenderer)object4);
                        if (n7 == 0) {
                            n7 = NativeAdViewRenderer.access$getRefreshRate$p((NativeAdViewRenderer)object4);
                            l3 = n7;
                            l2 = NativeAdViewRenderer.access$getTotalVideoPlayTime$p((NativeAdViewRenderer)object4);
                            n4 = NativeAdViewRenderer.access$getVIDEO_REFRESH_THRESHOLD$p((NativeAdViewRenderer)object4);
                            long l4 = (l3 -= l2) - (l2 = (long)n4);
                            object5 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                            if (object5 >= 0) {
                                int n8 = NativeAdViewRenderer.access$getCurrentPlayer$p((NativeAdViewRenderer)object4);
                                if (n8 == (n3 = 1)) {
                                    object = ((NativeAdViewRenderer)object4).getJioVideoView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                    if (object == null) return;
                                    ((s)object).g();
                                    return;
                                }
                                n8 = NativeAdViewRenderer.access$getCurrentPlayer$p((NativeAdViewRenderer)object4);
                                if (n8 != (n3 = 2)) return;
                                object = ((NativeAdViewRenderer)object4).getJioVideoViewSecond$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                if (object == null) return;
                                ((s)object).g();
                                return;
                            }
                        }
                        if ((n7 = (int)(NativeAdViewRenderer.access$isLastIteration$p((NativeAdViewRenderer)object4) ? 1 : 0)) != 0 || (n7 = (int)(NativeAdViewRenderer.access$isExoPlayerEnabled((NativeAdViewRenderer)object4) ? 1 : 0)) != 0) break block10;
                        n7 = NativeAdViewRenderer.access$getRefreshRate$p((NativeAdViewRenderer)object4);
                        l3 = n7;
                        l2 = NativeAdViewRenderer.access$getTotalVideoPlayTime$p((NativeAdViewRenderer)object4);
                        l3 -= l2;
                    }
                    catch (Exception exception2) {
                        break block11;
                    }
                    n4 = NativeAdViewRenderer.access$getVIDEO_REFRESH_THRESHOLD$p((NativeAdViewRenderer)object4);
                    l2 = n4;
                    object5 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
                    if (object5 <= 0) {
                        object3 = new StringBuilder();
                        object2 = object2.P();
                        ((StringBuilder)object3).append((String)object2);
                        object2 = ": Inside playAgainFromMediaPlayer else calling loadVideoAdAfterRefresh()";
                        ((StringBuilder)object3).append((String)object2);
                        object2 = ((StringBuilder)object3).toString();
                        Intrinsics.checkNotNullParameter(object2, charSequence);
                        object = ((JioAds$Companion)object).getInstance();
                        ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        NativeAdViewRenderer.f((NativeAdViewRenderer)object4);
                        return;
                    }
                }
                object4 = new StringBuilder();
                object2 = object2.P();
                ((StringBuilder)object4).append((String)object2);
                object2 = ": Inside playAgainFromMediaPlayer else ";
                ((StringBuilder)object4).append((String)object2);
                object2 = ((StringBuilder)object4).toString();
                Intrinsics.checkNotNullParameter(object2, charSequence);
                object = ((JioAds$Companion)object).getInstance();
                ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                return;
            }
            object4 = new StringBuilder();
            object3 = object2.P();
            ((StringBuilder)object4).append((String)object3);
            object3 = ": Native Ad Current AdState is: ";
            ((StringBuilder)object4).append((String)object3);
            object2 = object2.k0();
            ((StringBuilder)object4).append(object2);
            object2 = ((StringBuilder)object4).toString();
            Intrinsics.checkNotNullParameter(object2, charSequence);
            object = ((JioAds$Companion)object).getInstance();
            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            return;
        }
        charSequence = new StringBuilder("Error while playAgain called for MediaPlayer: ");
        object2 = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c((Utility)object2, exception2, (StringBuilder)charSequence);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }
}

