/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 *  android.view.ViewGroup
 */
package com.jio.jioads.native;

import android.os.CountDownTimer;
import android.view.ViewGroup;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.common.b;
import com.jio.jioads.controller.f;
import com.jio.jioads.native.NativeAdController;
import com.jio.jioads.native.callbaks.a;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import com.jio.jioads.native.t;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

public final class n
implements a {
    public final /* synthetic */ NativeAdController a;

    public n(NativeAdController nativeAdController) {
        this.a = nativeAdController;
    }

    public final CountDownTimer a() {
        return NativeAdController.access$getMViewableImpressionTimer$p(this.a);
    }

    public final void a(String string2) {
        Object object = new StringBuilder();
        NativeAdController nativeAdController = this.a;
        String string3 = NativeAdController.access$getIJioAdView$p(nativeAdController).P();
        object.append(string3);
        object.append(": Callback OnAdRefresh()");
        Intrinsics.checkNotNullParameter(object.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        ((V)NativeAdController.access$getJioAdCallback$p(nativeAdController)).g(string2);
    }

    public final void a(boolean bl2) {
        NativeAdController.access$setVideoRender$p(this.a, bl2);
    }

    public final void b() {
        Enum enum_;
        NativeAdController nativeAdController = this.a;
        Object object = NativeAdController.access$getIJioAdView$p(nativeAdController).K();
        if (object == (enum_ = JioAdView$AD_TYPE.INTERSTITIAL)) {
            int n3;
            int n4;
            object = NativeAdController.access$getJioAdParser$p(nativeAdController);
            if (object != null) {
                object = ((com.jio.jioads.native.parser.a)object).p;
            } else {
                n4 = 0;
                object = null;
            }
            if ((object == null || (n4 = ((String)object).length()) == 0) && (object = NativeAdController.access$getJioNativeAdView$p(nativeAdController)) != null && (n4 = (int)(((NativeAdViewRenderer)object).isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() ? 1 : 0)) == (n3 = 1)) {
                return;
            }
        }
        object = NativeAdController.access$getIJioAdView$p(nativeAdController);
        enum_ = JioAdView$AdState.PREPARED;
        object.j((JioAdView$AdState)enum_);
        ((V)NativeAdController.access$getJioAdCallback$p(nativeAdController)).n();
    }

    public final void b(String string2) {
        NativeAdController nativeAdController = this.a;
        b b2 = NativeAdController.access$getIJioAdView$p(nativeAdController);
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.STARTED;
        b2.j(jioAdView$AdState);
        ((V)NativeAdController.access$getJioAdCallback$p(nativeAdController)).i(string2);
    }

    public final void b(String string2, String string3) {
        String string4 = "campaignid";
        Intrinsics.checkNotNullParameter(string2, string4);
        String string5 = "type";
        Intrinsics.checkNotNullParameter(string3, string5);
        f f5 = (f)NativeAdController.access$getIJioAdViewController$p(this.a);
        f5.getClass();
        Intrinsics.checkNotNullParameter(string2, string4);
        Intrinsics.checkNotNullParameter(string3, string5);
        f5.a.v(string2, string3);
    }

    public final void c() {
        Object object = new StringBuilder();
        NativeAdController nativeAdController = this.a;
        String string2 = NativeAdController.access$getIJioAdView$p(nativeAdController).P();
        object.append(string2);
        object.append(": inside startViewableTimer calling controller");
        Intrinsics.checkNotNullParameter(object.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        NativeAdController.access$startViewableTimerForImpressionFired(nativeAdController);
    }

    public final void c(com.jio.jioads.native.parser.a object) {
        if (object != null) {
            NativeAdController nativeAdController = this.a;
            NativeAdController.access$setJioAdParser$p(nativeAdController, (com.jio.jioads.native.parser.a)object);
            object = NativeAdController.access$getJioNativeAdView$p(nativeAdController);
            if (object != null) {
                com.jio.jioads.native.parser.a a2 = NativeAdController.access$getJioAdParser$p(nativeAdController);
                Intrinsics.checkNotNull(a2);
                HashMap hashMap = NativeAdController.access$getHtmlHeaders$p(nativeAdController);
                boolean bl2 = hashMap.isEmpty();
                if (bl2) {
                    hashMap = NativeAdController.access$getResponseHeaders(nativeAdController);
                }
                ((NativeAdViewRenderer)object).updateJioAdParser$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(a2, hashMap);
            }
        }
    }

    public final void d() {
        Object object = this.a;
        t t3 = NativeAdController.access$getRefreshTimeHandler$p((NativeAdController)object);
        if (t3 != null) {
            t3.c();
        }
        if ((object = NativeAdController.access$getRefreshTimeHandler$p((NativeAdController)object)) != null) {
            ((t)object).d();
        }
    }

    public final void d(ViewGroup object) {
        Object object2 = this.a;
        if ((object = (Object)((NativeAdController)object2).setDisplayAdSizeToJioAdController$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((ViewGroup)object)) != null) {
            object2 = NativeAdController.access$getIJioAdView$p((NativeAdController)object2);
            object2.e0((int[])object);
        }
    }

    public final void e(boolean bl2) {
        NativeAdController.access$setViewableImpressionFired$p(this.a, bl2);
    }

    public final boolean e() {
        return NativeAdController.access$isOnAdRenderImpressionFired$p(this.a);
    }

    public final void f() {
        f f5 = (f)NativeAdController.access$getIJioAdViewController$p(this.a);
        Object object = new StringBuilder();
        j_0.i(f5.a.a, object, ": called loadAd() as refresh ad started");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        f5.a.c();
    }

    public final void f(JioAdError$JioAdErrorType jioAdError$JioAdErrorType, String string2) {
        Intrinsics.checkNotNullParameter((Object)jioAdError$JioAdErrorType, "errorType");
        NativeAdController nativeAdController = this.a;
        Object object = NativeAdController.access$getIJioAdView$p(nativeAdController).k0();
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.DESTROYED;
        if (object != jioAdView$AdState) {
            object = NativeAdController.access$getJioAdCallback$p(nativeAdController);
            jioAdView$AdState = JioAdView$AdState.FAILED;
            object = (V)object;
            ((V)object).e(jioAdView$AdState);
        }
        string2 = String.valueOf(string2);
        NativeAdController.access$setNativeControllerError(nativeAdController, "showNativeOrDynamicAd:onAttachFailed", string2, jioAdError$JioAdErrorType);
    }

    public final boolean g() {
        return NativeAdController.access$isVideoRender$p(this.a);
    }

    public final void h(long l2) {
        NativeAdController.access$setViewableTime$p(this.a, l2);
    }

    public final void i(boolean bl2) {
        NativeAdController.access$setOnAdRenderImpressionFired$p(this.a, bl2);
    }

    public final boolean i() {
        return NativeAdController.access$isViewableImpressionFired$p(this.a);
    }

    public final void j(JioAdView$AdState jioAdView$AdState) {
        Intrinsics.checkNotNullParameter((Object)jioAdView$AdState, "started");
        ((V)NativeAdController.access$getJioAdCallback$p(this.a)).e(jioAdView$AdState);
    }

    public final String n() {
        return NativeAdController.access$getMLastAdType$p(this.a);
    }
}

