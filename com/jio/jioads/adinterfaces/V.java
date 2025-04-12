/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
package com.jio.jioads.adinterfaces;

import android.os.Handler;
import android.os.Looper;
import com.jio.jioads.adinterfaces.F;
import com.jio.jioads.adinterfaces.G;
import com.jio.jioads.adinterfaces.H;
import com.jio.jioads.adinterfaces.I;
import com.jio.jioads.adinterfaces.J;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdListener;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAdView$MediaPlayBack;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.M;
import com.jio.jioads.adinterfaces.O;
import com.jio.jioads.adinterfaces.S;
import com.jio.jioads.adinterfaces.T;
import com.jio.jioads.adinterfaces.U;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.controller.a;
import com.jio.jioads.controller.o;
import kotlin.jvm.internal.Intrinsics;

public final class V
implements a {
    public final /* synthetic */ JioAdView a;
    public final /* synthetic */ String b;

    public V(JioAdView jioAdView, String string2) {
        this.a = jioAdView;
        this.b = string2;
    }

    public final void a() {
        Object object = Looper.getMainLooper();
        Handler handler = new Handler(object);
        String string2 = this.b;
        JioAdView jioAdView = this.a;
        object = new S(jioAdView, string2);
        handler.post((Runnable)object);
    }

    public final void b(long l2, long l3) {
        Object object = Looper.getMainLooper();
        Handler handler = new Handler(object);
        JioAdView jioAdView = this.a;
        object = new F(jioAdView, l2, l3);
        handler.post((Runnable)object);
    }

    public final void c(long l2, String string2, long l3) {
        Intrinsics.checkNotNullParameter(string2, "adId");
        Object object = Looper.getMainLooper();
        string2 = new Handler(object);
        JioAdView jioAdView = this.a;
        object = new M(jioAdView, l2, l3);
        string2.post((Runnable)object);
    }

    public final void d(JioAdError jioAdError, boolean bl2, d d2, String string2, String string3, String string4, Integer n3) {
        Intrinsics.checkNotNullParameter(jioAdError, "jioAdError");
        Intrinsics.checkNotNullParameter((Object)d2, "errorSeverity");
        Intrinsics.checkNotNullParameter(string2, "methodName");
        Intrinsics.checkNotNullParameter(string3, "className");
        Intrinsics.checkNotNullParameter(string4, "errorLoggingDescription");
        this.a.adFailedToLoad$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(jioAdError, bl2, d2, string2, string3, string4, n3);
    }

    public final void e(JioAdView$AdState jioAdView$AdState) {
        Intrinsics.checkNotNullParameter((Object)jioAdView$AdState, "currentAdState");
        Object object = new StringBuilder();
        String string2 = this.b;
        j_0.k(object, string2, " Callback onAdStateChange");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        this.a.setMAdState$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(jioAdView$AdState);
    }

    public final void f(JioAdView$MediaPlayBack jioAdView$MediaPlayBack) {
        Intrinsics.checkNotNullParameter((Object)jioAdView$MediaPlayBack, "playbackChange");
        Object object = Looper.getMainLooper();
        Handler handler = new Handler(object);
        JioAdView jioAdView = this.a;
        String string2 = this.b;
        object = new I(jioAdView, string2, jioAdView$MediaPlayBack);
        handler.post((Runnable)object);
    }

    public final void g(String object) {
        Intrinsics.checkNotNullParameter(object, "adId_");
        JioAdView jioAdView = this.a;
        Object object2 = JioAdView.access$getMJioAdViewController$p(jioAdView);
        if (object2 != null) {
            object2.O((String)object);
        }
        object = new StringBuilder();
        String string2 = this.b;
        j_0.k((StringBuilder)object, string2, " Callback onAdRefresh");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = jioAdView.getMAdState();
        object2 = JioAdView$AdState.DESTROYED;
        if (object == object2) {
            return;
        }
        object = jioAdView.getMAdListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        if (object != null) {
            ((JioAdListener)object).onAdRefresh(jioAdView);
        }
    }

    public final void h(boolean bl2, boolean bl3) {
        Object object = Looper.getMainLooper();
        Handler handler = new Handler(object);
        JioAdView jioAdView = this.a;
        object = new O(jioAdView, bl2, bl3);
        handler.post((Runnable)object);
    }

    public final void i(String string2) {
        Object object = Looper.getMainLooper();
        Handler handler = new Handler(object);
        JioAdView jioAdView = this.a;
        object = new G(jioAdView, string2);
        handler.post((Runnable)object);
    }

    public final void j() {
        Object object = Looper.getMainLooper();
        Handler handler = new Handler(object);
        String string2 = this.b;
        JioAdView jioAdView = this.a;
        object = new SD0(1, string2, jioAdView);
        handler.post((Runnable)object);
    }

    public final void k() {
        Object object = Looper.getMainLooper();
        Handler handler = new Handler(object);
        String string2 = this.b;
        JioAdView jioAdView = this.a;
        object = new T(jioAdView, string2);
        handler.post((Runnable)object);
    }

    public final void l() {
        Object object = Looper.getMainLooper();
        Handler handler = new Handler(object);
        JioAdView jioAdView = this.a;
        object = new U(jioAdView);
        handler.post((Runnable)object);
    }

    public final void m() {
        Object object = Looper.getMainLooper();
        Handler handler = new Handler(object);
        JioAdView jioAdView = this.a;
        object = new se1_1(jioAdView, 1);
        handler.post((Runnable)object);
    }

    public final void n() {
        boolean bl2;
        Object object = new StringBuilder();
        JioAdView jioAdView = this.a;
        Object object2 = jioAdView.getMAdspotId$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(": Value an isRequestForNextAd:: ");
        object2 = JioAdView.access$getMJioAdViewController$p(jioAdView);
        if (object2 != null) {
            bl2 = ((o)object2).I;
            object2 = bl2;
        } else {
            bl2 = false;
            object2 = null;
        }
        ((StringBuilder)object).append(object2);
        Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), "message");
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        bl2 = JioAdView.access$isPreparedCallBackGiven$p(jioAdView);
        boolean bl3 = true;
        if (bl2 && !(bl2 = jioAdView.isFromLoadCustomAd())) {
            object2 = JioAdView.access$getMJioAdViewController$p(jioAdView);
            if (object2 != null && (bl2 = ((o)object2).D) == bl3) {
                object2 = new StringBuilder();
                String string2 = ": loadAdCalled For PGM";
                j_0.h(jioAdView, (StringBuilder)object2, string2);
                ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAdView.access$getMJioAdViewController$p(jioAdView);
                if (object != null) {
                    ((o)object).c();
                }
            } else {
                boolean bl4;
                object = JioAdView.access$getMJioAdViewController$p(jioAdView);
                if (object != null && (bl4 = ((o)object).E) == bl3 && (object = JioAdView.access$getMJioAdViewController$p(jioAdView)) != null && !(bl4 = ((o)object).D) && (object = JioAdView.access$getMJioAdViewController$p(jioAdView)) != null && (bl4 = ((o)object).I) == bl3 && (object = JioAdView.access$getMJioAdViewController$p(jioAdView)) != null) {
                    ((o)object).c();
                }
            }
        } else {
            object2 = new StringBuilder();
            String string3 = ": Callback onAdPrepared()";
            j_0.h(jioAdView, (StringBuilder)object2, string3);
            ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAdView.access$setPreparedCallBackGiven$p(jioAdView, bl3);
            object2 = Looper.getMainLooper();
            object = new Handler((Looper)object2);
            object2 = new H(jioAdView);
            object.post((Runnable)object2);
        }
    }

    public final void o() {
        Object object = Looper.getMainLooper();
        Handler handler = new Handler(object);
        String string2 = this.b;
        JioAdView jioAdView = this.a;
        object = new zn_0(2, string2, jioAdView);
        handler.post((Runnable)object);
    }

    public final void p() {
        Object object = Looper.getMainLooper();
        Handler handler = new Handler(object);
        JioAdView jioAdView = this.a;
        object = new J(jioAdView);
        handler.post((Runnable)object);
    }
}

