/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.ViewGroup
 */
package com.jio.jioads.interstitial;

import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.Q;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.controller.a;
import com.jio.jioads.controller.f;
import com.jio.jioads.interstitial.InterstitialAdController;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class L
implements com.jio.jioads.native.callbaks.a {
    public final /* synthetic */ InterstitialAdController a;

    public L(InterstitialAdController interstitialAdController) {
        this.a = interstitialAdController;
    }

    public final CountDownTimer a() {
        return InterstitialAdController.access$getMViewableImpressionTimer$p(this.a);
    }

    public final void a(String string2) {
    }

    public final void a(boolean bl2) {
        InterstitialAdController.access$setVideoRender$p(this.a, bl2);
    }

    public final void b() {
        InterstitialAdController interstitialAdController = this.a;
        a a2 = interstitialAdController.getJioAdCallbacks();
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.PREPARED;
        ((V)a2).e(jioAdView$AdState);
        ((V)interstitialAdController.getJioAdCallbacks()).n();
    }

    public final void b(String string2) {
        ((V)this.a.getJioAdCallbacks()).i(string2);
    }

    public final void b(String string2, String string3) {
        String string4 = "campaignid";
        Intrinsics.checkNotNullParameter(string2, string4);
        String string5 = "type";
        Intrinsics.checkNotNullParameter(string3, string5);
        f f5 = (f)this.a.getIJioAdViewController();
        f5.getClass();
        Intrinsics.checkNotNullParameter(string2, string4);
        Intrinsics.checkNotNullParameter(string3, string5);
        f5.a.v(string2, string3);
    }

    public final void c() {
        Object object = new StringBuilder();
        InterstitialAdController interstitialAdController = this.a;
        String string2 = interstitialAdController.getIJioAdView().P();
        object.append(string2);
        object.append(": inside startViewableTimer calling controller");
        Intrinsics.checkNotNullParameter(object.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        InterstitialAdController.access$startViewableTimerForImpressionFired(interstitialAdController);
    }

    public final void c(com.jio.jioads.native.parser.a object) {
        if (object != null) {
            Object object2 = this.a;
            InterstitialAdController.access$setJioAdParser$p((InterstitialAdController)object2, (com.jio.jioads.native.parser.a)object);
            object = InterstitialAdController.access$getJioNativeAdView$p((InterstitialAdController)object2);
            if (object != null) {
                com.jio.jioads.native.parser.a a2 = InterstitialAdController.access$getJioAdParser$p((InterstitialAdController)object2);
                if (a2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("jioAdParser");
                    a2 = null;
                }
                object2 = ((InterstitialAdController)object2).getHeaders();
                ((NativeAdViewRenderer)object).updateJioAdParser$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(a2, (Map)object2);
            }
        }
    }

    public final void d() {
    }

    public final void d(ViewGroup viewGroup) {
    }

    public final void e(boolean bl2) {
        InterstitialAdController.access$setViewableImpressionFired$p(this.a, bl2);
    }

    public final boolean e() {
        return InterstitialAdController.access$isOnAdRenderImpressionFired$p(this.a);
    }

    public final void f() {
        Object object = (V)this.a.getJioAdCallbacks();
        JioAdView jioAdView = ((V)object).a;
        jioAdView.loadAd();
        Object object2 = Looper.getMainLooper();
        Handler handler = new Handler(object2);
        object = ((V)object).b;
        object2 = new Q(jioAdView, (String)object);
        handler.post((Runnable)object2);
    }

    public final void f(JioAdError$JioAdErrorType object, String string2) {
        Intrinsics.checkNotNullParameter(object, "errorType");
        JioAdError jioAdError = j_0.c(JioAdError.Companion, object, string2);
        object = this.a.getJioAdCallbacks();
        d d2 = d.a;
        String string3 = String.valueOf(string2);
        ((V)object).d(jioAdError, false, d2, "onAttachFailed", "NativeAdController", string3, null);
    }

    public final boolean g() {
        return InterstitialAdController.access$isVideoRender$p(this.a);
    }

    public final void h(long l2) {
        InterstitialAdController.access$setViewableTime$p(this.a, l2);
    }

    public final void i(boolean bl2) {
        InterstitialAdController.access$setOnAdRenderImpressionFired$p(this.a, bl2);
    }

    public final boolean i() {
        return InterstitialAdController.access$isViewableImpressionFired$p(this.a);
    }

    public final void j(JioAdView$AdState jioAdView$AdState) {
        Intrinsics.checkNotNullParameter((Object)jioAdView$AdState, "started");
        ((V)this.a.getJioAdCallbacks()).e(jioAdView$AdState);
    }

    public final String n() {
        return "";
    }
}

