/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.ViewGroup
 */
package com.jio.jioads.native;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.K;
import com.jio.jioads.adinterfaces.L;
import com.jio.jioads.adinterfaces.N;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.controller.f;
import com.jio.jioads.interstitial.o;
import com.jio.jioads.native.NativeAdController;
import com.jio.jioads.native.l;
import com.jio.jioads.util.Utility;
import com.jio.jioads.utils.Constants$AdTouchEvents;
import com.jio.jioads.utils.e;
import kotlin.jvm.internal.Intrinsics;

public final class m
implements o {
    public final /* synthetic */ NativeAdController a;

    public m(NativeAdController nativeAdController) {
        this.a = nativeAdController;
    }

    public final void a(int n3, String object, String object2) {
        Intrinsics.checkNotNullParameter(object, "description");
        Intrinsics.checkNotNullParameter(object2, "failingUrl");
        object = new StringBuilder();
        object2 = this.a;
        String string2 = NativeAdController.access$getIJioAdView$p((NativeAdController)object2).P();
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(": onReceivedError() NativeAdController");
        Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        String string3 = hj0_0.a(n3, "Error from onReceivedError of WebView : ");
        object = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
        NativeAdController.access$setNativeControllerError((NativeAdController)object2, "initWebView", string3, (JioAdError$JioAdErrorType)((Object)object));
    }

    public final void a(String object) {
        Intrinsics.checkNotNullParameter(object, "url");
        object = new StringBuilder();
        String string2 = NativeAdController.access$getIJioAdView$p(this.a).P();
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(": Callback onPageStarted()");
        Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }

    public final void b(Constants$AdTouchEvents object) {
        Intrinsics.checkNotNullParameter(object, "adTouchEvents");
        Object object2 = l.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        n3 = object2[n3];
        int n4 = 1;
        Object object3 = this.a;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    n4 = 4;
                    if (n3 == n4) {
                        object = (V)NativeAdController.access$getJioAdCallback$p((NativeAdController)object3);
                        object.getClass();
                        object2 = new Handler;
                        object3 = Looper.getMainLooper();
                        object2((Looper)object3);
                        String string2 = ((V)object).b;
                        object = ((V)object).a;
                        object3 = new L((JioAdView)object, string2);
                        object2.post((Runnable)object3);
                    }
                } else {
                    object = (V)NativeAdController.access$getJioAdCallback$p((NativeAdController)object3);
                    object.getClass();
                    object2 = new Handler;
                    object3 = Looper.getMainLooper();
                    object2((Looper)object3);
                    String string3 = ((V)object).b;
                    object = ((V)object).a;
                    int n7 = 1;
                    object3 = new xT(n7, string3, object);
                    object2.post((Runnable)object3);
                }
            } else {
                object = (V)NativeAdController.access$getJioAdCallback$p((NativeAdController)object3);
                object.getClass();
                object2 = new Handler;
                object3 = Looper.getMainLooper();
                object2((Looper)object3);
                String string4 = ((V)object).b;
                object = ((V)object).a;
                object3 = new K((JioAdView)object, string4);
                object2.post((Runnable)object3);
            }
        } else {
            object = (V)NativeAdController.access$getJioAdCallback$p((NativeAdController)object3);
            object.getClass();
            object2 = new Handler;
            object3 = Looper.getMainLooper();
            object2((Looper)object3);
            String string5 = ((V)object).b;
            object = ((V)object).a;
            object3 = new N((JioAdView)object, string5);
            object2.post((Runnable)object3);
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void b(String var1_1) {
        block26: {
            block24: {
                block27: {
                    block25: {
                        Intrinsics.checkNotNullParameter(var1_1, "url");
                        var1_1 = new StringBuilder();
                        var2_2 = this.a;
                        var3_3 = NativeAdController.access$getIJioAdView$p(var2_2).P();
                        var1_1.append(var3_3);
                        var1_1.append(": Callback onPageFinished()");
                        var1_1 = var1_1.toString();
                        var3_3 = "message";
                        Intrinsics.checkNotNullParameter(var1_1, var3_3);
                        var1_1 = JioAds.Companion;
                        var1_1.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        var4_4 = 1;
                        NativeAdController.access$setWebPageFinishCalled$p(var2_2, (boolean)var4_4);
                        var5_5 = NativeAdController.access$getIJioAdView$p(var2_2);
                        var6_6 = var5_5.l();
                        var7_7 = null;
                        if (var6_6 == 0 || (var5_5 = NativeAdController.access$getJioNativeAdView$p(var2_2)) == null) break block24;
                        var5_5 = NativeAdController.access$getJioNativeAdView$p(var2_2);
                        if (var5_5 != null) {
                            var5_5.setWaitForCompleteHTMLAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((boolean)var4_4);
                        }
                        var5_5 = NativeAdController.access$getJioNativeAdView$p(var2_2);
                        if (var5_5 == null || (var6_6 = var5_5.isNativeDynamicLowerThen100$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != var4_4) break block25;
                        var1_1 = NativeAdController.access$getListener$p(var2_2);
                        var1_1.f();
                        break block26;
                    }
                    var5_5 = NativeAdController.access$getIJioAdView$p(var2_2);
                    var6_6 = var5_5.W();
                    var8_8 = "JSON";
                    var9_9 = 2;
                    if (var6_6 != var9_9 || (var6_6 = (int)Intrinsics.areEqual(var5_5 = NativeAdController.access$getMLastAdType$p(var2_2), var8_8)) == 0 || (var6_6 = (int)(var5_5 = NativeAdController.access$getIJioAdView$p(var2_2)).l()) == 0 || ((var5_5 = NativeAdController.access$getJioNativeAdView$p(var2_2)) == null || (var5_5 = var5_5.getJioVideoView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) == null || (var6_6 = (int)var5_5.c()) != 0) && ((var5_5 = NativeAdController.access$getJioNativeAdView$p(var2_2)) == null || (var5_5 = var5_5.getJioVideoViewSecond$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) == null || (var6_6 = (int)var5_5.c()) != 0)) break block27;
                    var5_5 = new StringBuilder();
                    var7_7 = NativeAdController.access$getIJioAdView$p(var2_2).P();
                    var5_5.append((String)var7_7);
                    var5_5.append(": Next AdType is HTML else ");
                    var7_7 = NativeAdController.access$getMLastAdType$p(var2_2);
                    var5_5.append((String)var7_7);
                    var5_5 = var5_5.toString();
                    Intrinsics.checkNotNullParameter(var5_5, var3_3);
                    var1_1.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var1_1 = NativeAdController.access$getListener$p(var2_2);
                    var1_1.f();
                    break block26;
                }
                var1_1 = NativeAdController.access$getIJioAdView$p(var2_2);
                var10_10 = var1_1.W();
                if (var10_10 != var9_9 || (var10_10 = (int)Intrinsics.areEqual(var1_1 = NativeAdController.access$getMLastAdType$p(var2_2), var8_8)) == 0 || (var10_10 = (int)(var1_1 = NativeAdController.access$getIJioAdView$p(var2_2)).l()) == 0 || (var1_1 = NativeAdController.access$getJioNativeAdView$p(var2_2)) == null || (var10_10 = (int)var1_1.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != 0) ** GOTO lbl-1000
                var1_1 = NativeAdController.access$getJioNativeAdView$p(var2_2);
                if (var1_1 != null) {
                    var1_1 = var1_1.getJioVideoView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                } else {
                    var10_10 = 0;
                    var1_1 = null;
                }
                if (var1_1 != null) ** GOTO lbl-1000
                var1_1 = NativeAdController.access$getJioNativeAdView$p(var2_2);
                if (var1_1 != null) {
                    var7_7 = var1_1.getJioVideoViewSecond$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                }
                if (var7_7 == null) {
                    var1_1 = NativeAdController.access$getListener$p(var2_2);
                    var1_1.f();
                } else if ((var1_1 = NativeAdController.access$getJioNativeAdView$p(var2_2)) != null && (var1_1 = var1_1.getJioVideoView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null && (var10_10 = (int)var1_1.c()) == 0 || (var1_1 = NativeAdController.access$getJioNativeAdView$p(var2_2)) != null && (var1_1 = var1_1.getJioVideoViewSecond$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null && (var10_10 = (int)var1_1.c()) == 0) {
                    var1_1 = NativeAdController.access$getListener$p(var2_2);
                    var1_1.f();
                }
                break block26;
            }
            var5_5 = NativeAdController.access$getIJioAdView$p(var2_2);
            var6_6 = var5_5.l();
            if (var6_6 == 0) ** GOTO lbl-1000
            var5_5 = NativeAdController.access$getJioNativeAdView$p(var2_2);
            if (var5_5 != null) {
                var5_5 = var5_5.getJioVideoView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            } else {
                var6_6 = 0;
                var5_5 = null;
            }
            if (var5_5 != null) ** GOTO lbl-1000
            var5_5 = NativeAdController.access$getJioNativeAdView$p(var2_2);
            if (var5_5 != null) {
                var5_5 = var5_5.getJioVideoViewSecond$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            } else {
                var6_6 = 0;
                var5_5 = null;
            }
            if (var5_5 == null) {
                var5_5 = new StringBuilder();
                var7_7 = NativeAdController.access$getIJioAdView$p(var2_2).P();
                var5_5.append((String)var7_7);
                var7_7 = ": HTML call onRefresh load ad";
                var5_5.append((String)var7_7);
                var5_5 = var5_5.toString();
                Intrinsics.checkNotNullParameter(var5_5, var3_3);
                var1_1.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var1_1 = NativeAdController.access$getListener$p(var2_2);
                var1_1.f();
            } else if ((var6_6 = (var5_5 = NativeAdController.access$getIJioAdView$p(var2_2)).l()) != 0) {
                var5_5 = NativeAdController.access$getJioNativeAdView$p(var2_2);
                if (var5_5 != null) {
                    var5_5 = var5_5.getJioVideoView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                } else {
                    var6_6 = 0;
                    var5_5 = null;
                }
                if (var5_5 == null) {
                    var5_5 = NativeAdController.access$getJioNativeAdView$p(var2_2);
                    if (var5_5 != null) {
                        var5_5 = var5_5.getJioVideoViewSecond$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    } else {
                        var6_6 = 0;
                        var5_5 = null;
                    }
                    if (var5_5 == null) {
                        var5_5 = NativeAdController.access$getJioNativeAdView$p(var2_2);
                        if (var5_5 != null) {
                            var7_7 = var5_5.getMediaLayout$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        }
                        if (var7_7 == null) {
                            var5_5 = new StringBuilder();
                            var7_7 = NativeAdController.access$getIJioAdView$p(var2_2).P();
                            var5_5.append((String)var7_7);
                            var7_7 = ": HTML call onRefresh load ad elase if";
                            var5_5.append((String)var7_7);
                            var5_5 = var5_5.toString();
                            Intrinsics.checkNotNullParameter(var5_5, var3_3);
                            var1_1.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            var1_1 = NativeAdController.access$getListener$p(var2_2);
                            var1_1.f();
                        }
                    }
                }
            }
        }
        var1_1 = NativeAdController.access$getAdContainer$p(var2_2);
        if (var1_1 != null && (var10_10 = NativeAdController.access$getWasWebImpressionFired$p(var2_2)) == 0) {
            var1_1 = Utility.INSTANCE;
            var3_3 = NativeAdController.access$getAdContainer$p(var2_2);
            Intrinsics.checkNotNull(var3_3);
            var6_6 = 5;
            var10_10 = (int)var1_1.checkVisibility((ViewGroup)var3_3, var6_6);
            if (var10_10 != 0 && (var10_10 = (int)(var1_1 = NativeAdController.access$getIJioAdView$p(var2_2)).l()) == 0) {
                NativeAdController.access$fireHTMLTracker(var2_2);
                NativeAdController.access$fireViewableImpression(var2_2);
                var1_1 = NativeAdController.access$getIJioAdViewController$p(var2_2);
                var3_3 = e.d(NativeAdController.access$getResponseHeaders(var2_2));
                var1_1 = (f)var1_1;
                var1_1.getClass();
                Intrinsics.checkNotNullParameter(var3_3, "campaignid");
                var5_5 = "i";
                var7_7 = "type";
                Intrinsics.checkNotNullParameter(var5_5, (String)var7_7);
                var1_1 = var1_1.a;
                var1_1.v(var3_3, (String)var5_5);
                NativeAdController.access$setWasWebImpressionFired$p(var2_2, (boolean)var4_4);
            }
        }
    }

    public final void onAdClick() {
        Object object = new StringBuilder();
        NativeAdController nativeAdController = this.a;
        String string2 = NativeAdController.access$getIJioAdView$p(nativeAdController).P();
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(": Callback onAdClick()");
        Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = NativeAdController.access$getIJioAdViewController$p(nativeAdController);
        string2 = e.d(NativeAdController.access$getResponseHeaders(nativeAdController));
        object = (f)object;
        object.getClass();
        Intrinsics.checkNotNullParameter(string2, "campaignid");
        String string3 = "c";
        Intrinsics.checkNotNullParameter(string3, "type");
        ((f)object).a.v(string2, string3);
        ((V)NativeAdController.access$getJioAdCallback$p(nativeAdController)).a();
    }
}

