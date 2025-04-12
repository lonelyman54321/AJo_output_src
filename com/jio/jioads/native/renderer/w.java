/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.native.renderer;

import android.content.Context;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.common.b;
import com.jio.jioads.common.c;
import com.jio.jioads.controller.f;
import com.jio.jioads.instreamads.vastparser.model.k;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.instreamads.vastparser.model.n;
import com.jio.jioads.native.parser.a;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import com.jio.jioads.native.renderer.v;
import com.jio.jioads.util.j;
import com.jio.jioads.videomodule.s;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;

public final class w
implements com.jio.jioads.instreamads.vastparser.listener.c {
    public final /* synthetic */ NativeAdViewRenderer a;
    public final /* synthetic */ Ref$IntRef b;

    public w(NativeAdViewRenderer nativeAdViewRenderer, Ref$IntRef ref$IntRef) {
        this.a = nativeAdViewRenderer;
        this.b = ref$IntRef;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void a(m m2) {
        boolean bl2;
        JioAdView$AD_TYPE jioAdView$AD_TYPE;
        boolean bl3;
        w w4 = this;
        m m3 = m2;
        Object object = new StringBuilder();
        NativeAdViewRenderer nativeAdViewRenderer = this.a;
        Object object2 = nativeAdViewRenderer.getIJioAdView().P();
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(": Inside onResponseReceived: ");
        ((StringBuilder)object).append(m2);
        ((StringBuilder)object).append(" : iJioAdView.isRefreshStarted() ");
        boolean bl4 = nativeAdViewRenderer.getIJioAdView().l();
        ((StringBuilder)object).append(bl4);
        j.a(((StringBuilder)object).toString());
        object = nativeAdViewRenderer.getIJioAdView().k0();
        object2 = JioAdView$AdState.DESTROYED;
        if (object == object2) {
            return;
        }
        object = nativeAdViewRenderer.getIJioAdView().Y();
        if (object == null) {
            return;
        }
        String string2 = null;
        if (m2 != null) {
            void var7_10;
            object2 = nativeAdViewRenderer.getIJioAdView().B();
            if (object2 != null) {
                int n3 = (Integer)object2;
            } else {
                boolean bl5 = false;
                object2 = null;
            }
            v v4 = new v(nativeAdViewRenderer);
            object = m3.e((Context)object, (int)var7_10, v4);
        } else {
            boolean bl6 = false;
            object = null;
        }
        if (m3 != null) {
            object2 = m3.b;
        } else {
            boolean bl7 = false;
            object2 = null;
        }
        NativeAdViewRenderer.access$setVerticalDisplayAdSize$p(nativeAdViewRenderer, (String)object2);
        boolean bl8 = true;
        if (m3 != null && object != null && !(bl3 = object.isEmpty())) {
            s s7;
            if ((object = (k)CollectionsKt.firstOrNull((List)object)) == null || (object = ((k)object).c) == null) {
                object = (f)NativeAdViewRenderer.access$getIJioAdViewController$p(nativeAdViewRenderer);
                object2 = "adid";
                object = ((f)object).a((String)object2);
            }
            Object object3 = object;
            object = nativeAdViewRenderer.getJioVideoView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = w4.b;
            if (object == null) {
                s s8;
                object = new StringBuilder();
                int n4 = nativeAdViewRenderer.getIJioAdView().W();
                ((StringBuilder)object).append(n4);
                ((StringBuilder)object).append(": jioVideoView init here");
                j.a(((StringBuilder)object).toString());
                HashMap hashMap = NativeAdViewRenderer.access$getHeaders(nativeAdViewRenderer);
                int n7 = ((Ref$IntRef)object2).element;
                boolean bl9 = NativeAdViewRenderer.access$isExoPlayerEnabled(nativeAdViewRenderer);
                b b2 = nativeAdViewRenderer.getIJioAdView();
                c c2 = NativeAdViewRenderer.access$getIJioAdViewController$p(nativeAdViewRenderer);
                object = s8;
                object2 = hashMap;
                m m4 = m2;
                s8 = new s((HashMap)object2, m2, n7, bl9, b2, c2, null);
                s8.z = object = NativeAdViewRenderer.access$getJioVideoViewListener$p(nativeAdViewRenderer);
                object = m3.a;
                if (object != null) {
                    string2 = ((n)object).j((String)object3);
                }
                int n8 = j_0.a(string2);
                object2 = new StringBuilder();
                String string3 = nativeAdViewRenderer.getIJioAdView().P();
                ((StringBuilder)object2).append(string3);
                ((StringBuilder)object2).append(": Value of currentVideoDuration for firstPlayer: ");
                ((StringBuilder)object2).append(n8);
                String string4 = ", RefreshRate: ";
                ((StringBuilder)object2).append(string4);
                n4 = NativeAdViewRenderer.access$getRefreshRate$p(nativeAdViewRenderer);
                ((StringBuilder)object2).append(n4);
                object2 = ((StringBuilder)object2).toString();
                j.a((String)object2);
                int n10 = NativeAdViewRenderer.access$getRefreshRate$p(nativeAdViewRenderer);
                if (n8 >= n10) {
                    NativeAdViewRenderer.access$setNeedToloadVideoOnCompletePlayerOne$p(nativeAdViewRenderer, bl8);
                    NativeAdViewRenderer.access$setVideoInLoop$p(nativeAdViewRenderer, false);
                } else {
                    NativeAdViewRenderer.access$setNeedToloadVideoOnCompletePlayerOne$p(nativeAdViewRenderer, false);
                    NativeAdViewRenderer.access$setVideoInLoop$p(nativeAdViewRenderer, bl8);
                }
                NativeAdViewRenderer.access$initConfiguration(nativeAdViewRenderer, s8);
                NativeAdViewRenderer.access$storeVideoImpressionUrls(nativeAdViewRenderer, m3, (String)object3);
                NativeAdViewRenderer.access$storeNativeViewableImpression(nativeAdViewRenderer, m3, (String)object3);
                nativeAdViewRenderer.setJioVideoView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(s8);
                object = nativeAdViewRenderer.getJioVideoView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                if (object == null) return;
                ((s)object).h();
                return;
            }
            object = new StringBuilder();
            int n14 = nativeAdViewRenderer.getIJioAdView().W();
            ((StringBuilder)object).append(n14);
            ((StringBuilder)object).append(": jioVideoViewSecond second object init here");
            j.a(((StringBuilder)object).toString());
            HashMap hashMap = NativeAdViewRenderer.access$getHeaders(nativeAdViewRenderer);
            int n15 = ((Ref$IntRef)object2).element;
            boolean bl10 = NativeAdViewRenderer.access$isExoPlayerEnabled(nativeAdViewRenderer);
            b b3 = nativeAdViewRenderer.getIJioAdView();
            c c3 = NativeAdViewRenderer.access$getIJioAdViewController$p(nativeAdViewRenderer);
            object = s7;
            object2 = hashMap;
            m m7 = m2;
            s7 = new s((HashMap)object2, m2, n15, bl10, b3, c3, null);
            s7.z = object = NativeAdViewRenderer.access$getJioVideoViewListener$p(nativeAdViewRenderer);
            object = m3.a;
            if (object != null) {
                string2 = ((n)object).j((String)object3);
            }
            int n16 = j_0.a(string2);
            object2 = new StringBuilder();
            String string5 = nativeAdViewRenderer.getIJioAdView().P();
            ((StringBuilder)object2).append(string5);
            ((StringBuilder)object2).append(": Value of currentVideoDuration for secondPlayer: ");
            ((StringBuilder)object2).append(n16);
            j.a(((StringBuilder)object2).toString());
            object2 = new StringBuilder();
            String string6 = nativeAdViewRenderer.getIJioAdView().P();
            ((StringBuilder)object2).append(string6);
            String string7 = ": Value of refreshRate for secondPlayer: ";
            ((StringBuilder)object2).append(string7);
            n14 = NativeAdViewRenderer.access$getRefreshRate$p(nativeAdViewRenderer);
            ((StringBuilder)object2).append(n14);
            object2 = ((StringBuilder)object2).toString();
            j.a((String)object2);
            int n17 = NativeAdViewRenderer.access$getRefreshRate$p(nativeAdViewRenderer);
            if (n16 >= n17) {
                NativeAdViewRenderer.access$setNeedToloadVideoOnCompletePlayerTwo$p(nativeAdViewRenderer, bl8);
                NativeAdViewRenderer.access$setVideoInLoop$p(nativeAdViewRenderer, false);
            } else {
                NativeAdViewRenderer.access$setVideoInLoop$p(nativeAdViewRenderer, bl8);
                NativeAdViewRenderer.access$setNeedToloadVideoOnCompletePlayerTwo$p(nativeAdViewRenderer, false);
            }
            NativeAdViewRenderer.access$initConfiguration(nativeAdViewRenderer, s7);
            NativeAdViewRenderer.access$storeVideoImpressionUrls(nativeAdViewRenderer, m3, (String)object3);
            NativeAdViewRenderer.access$storeNativeViewableImpression(nativeAdViewRenderer, m3, (String)object3);
            nativeAdViewRenderer.setJioVideoViewSecond$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(s7);
            object = nativeAdViewRenderer.getJioVideoViewSecond$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            if (object == null) return;
            ((s)object).h();
            return;
        }
        object = nativeAdViewRenderer.getIJioAdView();
        boolean bl11 = object.W();
        object2 = ": NativeAd: setJioAdError() ERROR: ";
        String string8 = "No ads in inventory";
        String string9 = "onError : finalAdUrlList is empty No ads in inventory, methodName: prepredNativeVideoAd, className: NativeAdViewRenderer.";
        if (bl11 == bl8 && (object = nativeAdViewRenderer.getIJioAdView().K()) == (jioAdView$AD_TYPE = JioAdView$AD_TYPE.DYNAMIC_DISPLAY)) {
            j.b(string9);
            object = JioAdError.Companion;
            JioAdError$JioAdErrorType jioAdError$JioAdErrorType = JioAdError$JioAdErrorType.ERROR_NOFILL;
            object = j_0.c((t_0)object, jioAdError$JioAdErrorType, string8);
            StringBuilder stringBuilder = new StringBuilder();
            String string10 = nativeAdViewRenderer.getIJioAdView().P();
            stringBuilder.append(string10);
            stringBuilder.append((String)object2);
            object2 = ((JioAdError)object).getErrorDescription();
            stringBuilder.append((String)object2);
            j.b(stringBuilder.toString());
            object2 = nativeAdViewRenderer.getIJioAdView();
            JioAdView$AdState jioAdView$AdState = JioAdView$AdState.FAILED;
            object2.j(jioAdView$AdState);
            object2 = NativeAdViewRenderer.access$getJioNativeViewListener$p(nativeAdViewRenderer);
            if (object2 != null) {
                object = ((JioAdError)object).getErrorDescription();
                object2.f(jioAdError$JioAdErrorType, (String)object);
            }
            nativeAdViewRenderer.clearAllData$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            return;
        }
        object = NativeAdViewRenderer.access$getJioAdParser$p(nativeAdViewRenderer);
        if (object != null) {
            string2 = ((a)object).p;
        }
        if (string2 != null) {
            int n18 = string2.length();
            if (n18 != 0) return;
        }
        if (!(bl2 = nativeAdViewRenderer.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease())) return;
        boolean bl12 = NativeAdViewRenderer.access$isPreparedAd$p(nativeAdViewRenderer);
        if (bl12) return;
        j.b(string9);
        object = JioAdError.Companion;
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType = JioAdError$JioAdErrorType.ERROR_NOFILL;
        object = j_0.c((t_0)object, jioAdError$JioAdErrorType, string8);
        StringBuilder stringBuilder = new StringBuilder();
        String string11 = nativeAdViewRenderer.getIJioAdView().P();
        stringBuilder.append(string11);
        stringBuilder.append((String)object2);
        object2 = ((JioAdError)object).getErrorDescription();
        stringBuilder.append((String)object2);
        j.b(stringBuilder.toString());
        object2 = nativeAdViewRenderer.getIJioAdView();
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.FAILED;
        object2.j(jioAdView$AdState);
        object2 = NativeAdViewRenderer.access$getJioNativeViewListener$p(nativeAdViewRenderer);
        if (object2 != null) {
            object = ((JioAdError)object).getErrorDescription();
            object2.f(jioAdError$JioAdErrorType, (String)object);
        }
        nativeAdViewRenderer.clearAllData$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public final void b(JioAdError jioAdError, d d2, String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(jioAdError, "jioAdError");
        Intrinsics.checkNotNullParameter((Object)d2, "errorSeverity");
        Intrinsics.checkNotNullParameter(string2, "methodName");
        Intrinsics.checkNotNullParameter(string3, "className");
        Intrinsics.checkNotNullParameter(string4, "errorDesc");
        Object object = new StringBuilder("onError ");
        Object object2 = jioAdError.getErrorDescription();
        object.append((String)object2);
        object.append(", methodName: ");
        object.append(string2);
        object.append(", className: ");
        object.append(string3);
        object.append(", errorDesc: ");
        object.append(string4);
        Intrinsics.checkNotNullParameter(object.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = NativeAdViewRenderer.access$getJioAdCallback$p(this.a);
        object2 = object;
        ((V)object).d(jioAdError, false, d2, string2, string3, string4, null);
    }
}

