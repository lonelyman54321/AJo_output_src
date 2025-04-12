/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.ActivityOptions
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.os.CountDownTimer
 *  android.text.TextUtils
 *  android.util.Pair
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.webkit.WebView
 *  android.widget.RelativeLayout$LayoutParams
 *  org.json.JSONObject
 */
package com.jio.jioads.interstitial;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.jio.jioads.R$layout;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$AdPodVariant;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAdView$VideoAdType;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioAdsMetadata;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.adinterfaces.d_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.common.b;
import com.jio.jioads.common.c;
import com.jio.jioads.common.d;
import com.jio.jioads.common.l;
import com.jio.jioads.controller.f;
import com.jio.jioads.instream.audio.j;
import com.jio.jioads.instreamads.vastparser.n;
import com.jio.jioads.interstitial.G;
import com.jio.jioads.interstitial.InterstitialActivity;
import com.jio.jioads.interstitial.InterstitialAdController$a;
import com.jio.jioads.interstitial.InterstitialAdController$mediationListener$1;
import com.jio.jioads.interstitial.InterstitialViewUtility$Companion;
import com.jio.jioads.interstitial.L;
import com.jio.jioads.interstitial.i_0;
import com.jio.jioads.interstitial.j_0;
import com.jio.jioads.interstitial.k;
import com.jio.jioads.interstitial.k_0;
import com.jio.jioads.interstitial.m;
import com.jio.jioads.interstitial.m_0;
import com.jio.jioads.interstitial.o;
import com.jio.jioads.interstitial.x;
import com.jio.jioads.native.callbaks.a;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import com.jio.jioads.util.Utility;
import com.jio.jioads.utils.Constants$HeaderKeys;
import com.jio.jioads.videomodule.JioVideoViewState;
import com.jio.jioads.videomodule.h_0;
import com.jio.jioads.videomodule.renderer.e;
import com.jio.jioads.videomodule.s;
import com.jio.jioads.videomodule.w_0;
import com.jioads.mediation.JioAdMediationController;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

public final class InterstitialAdController
extends d {
    public Integer A;
    public Integer B;
    public Drawable C;
    public Drawable D;
    public Integer E;
    public final InterstitialAdController$a F;
    public final InterstitialAdController$mediationListener$1 G;
    public final L H;
    public CountDownTimer I;
    public long J;
    public n K;
    public ViewGroup a;
    public final com.jio.jioads.controller.a b;
    public final b c;
    public final c d;
    public Context e;
    public String f;
    public com.jio.jioads.instreamads.vastparser.model.m g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public CountDownTimer o;
    public boolean p;
    public boolean q;
    public NativeAdViewRenderer r;
    public String s;
    public HashMap t;
    public String u;
    public x v;
    public com.jio.jioads.native.parser.a w;
    public s x;
    public j y;
    public ViewGroup z;

    public InterstitialAdController(ViewGroup object, com.jio.jioads.controller.a object2, b b2, c c2) {
        int n3;
        Intrinsics.checkNotNullParameter(object2, "jioAdCallbacks");
        Intrinsics.checkNotNullParameter(b2, "iJioAdView");
        Intrinsics.checkNotNullParameter(c2, "iJioAdViewController");
        super((com.jio.jioads.controller.a)object2, b2, c2);
        this.a = object;
        this.b = object2;
        this.c = b2;
        this.d = c2;
        this.f = "video";
        this.i = n3 = -1;
        this.j = n3;
        this.k = n3;
        this.l = n3;
        this.m = n3;
        this.n = n3;
        object = "";
        this.s = object;
        object2 = new HashMap();
        this.t = object2;
        this.u = object;
        super(this);
        this.F = object;
        System.out.println((Object)"inside Interstitial");
        object = Utility.INSTANCE;
        object2 = b2.P();
        this.u = object = ((Utility)object).getCcbValue((String)object2);
        object = new StringBuilder("ccbString generated: ");
        object2 = this.u;
        ((StringBuilder)object).append((String)object2);
        com.jio.jioads.util.j.a(((StringBuilder)object).toString());
        this.G = object = new InterstitialAdController$mediationListener$1(this);
        this.H = object = new L(this);
    }

    public static final /* synthetic */ ViewGroup access$getContainer$p(InterstitialAdController interstitialAdController) {
        return interstitialAdController.z;
    }

    public static final int access$getDefaultVastLayout(InterstitialAdController interstitialAdController) {
        interstitialAdController.getClass();
        return R$layout.jio_vast_interstitial;
    }

    public static final int access$getDefaultVastLayoutForSTB(InterstitialAdController interstitialAdController) {
        interstitialAdController.getClass();
        return R$layout.jio_vast_interstitial_stb;
    }

    public static final int access$getDefaultVastLayoutLand(InterstitialAdController interstitialAdController) {
        interstitialAdController.getClass();
        return R$layout.jio_vast_interstitial_land;
    }

    public static final /* synthetic */ j access$getInStreamAudioRenderer$p(InterstitialAdController interstitialAdController) {
        return interstitialAdController.y;
    }

    public static final /* synthetic */ com.jio.jioads.native.parser.a access$getJioAdParser$p(InterstitialAdController interstitialAdController) {
        return interstitialAdController.w;
    }

    public static final /* synthetic */ NativeAdViewRenderer access$getJioNativeAdView$p(InterstitialAdController interstitialAdController) {
        return interstitialAdController.r;
    }

    public static final /* synthetic */ n access$getJioVastParsingHelper$p(InterstitialAdController interstitialAdController) {
        return interstitialAdController.K;
    }

    public static final /* synthetic */ s access$getJioVideoView$p(InterstitialAdController interstitialAdController) {
        return interstitialAdController.x;
    }

    public static final /* synthetic */ Drawable access$getLandScapeImage$p(InterstitialAdController interstitialAdController) {
        return interstitialAdController.D;
    }

    public static final /* synthetic */ L access$getListener$p(InterstitialAdController interstitialAdController) {
        return interstitialAdController.H;
    }

    public static final /* synthetic */ Drawable access$getPortraitImage$p(InterstitialAdController interstitialAdController) {
        return interstitialAdController.C;
    }

    public static final /* synthetic */ Integer access$getToInt$p(InterstitialAdController interstitialAdController) {
        return interstitialAdController.A;
    }

    public static final /* synthetic */ Integer access$getToInt1$p(InterstitialAdController interstitialAdController) {
        return interstitialAdController.B;
    }

    public static final /* synthetic */ int access$getVastLandscapeLayoutId$p(InterstitialAdController interstitialAdController) {
        return interstitialAdController.j;
    }

    public static final /* synthetic */ int access$getVastPortraitLayoutId$p(InterstitialAdController interstitialAdController) {
        return interstitialAdController.i;
    }

    public static final /* synthetic */ InterstitialAdController$a access$getVideoViewListener$p(InterstitialAdController interstitialAdController) {
        return interstitialAdController.F;
    }

    public static final void access$initConfiguration(InterstitialAdController object, s s7) {
        block16: {
            int n3;
            Object object2;
            block18: {
                block17: {
                    boolean bl2;
                    Enum enum_ = ((InterstitialAdController)object).c.k0();
                    if (enum_ == (object2 = JioAdView$AdState.DESTROYED)) break block16;
                    enum_ = ((InterstitialAdController)object).c.Y();
                    object2 = "<this>";
                    Intrinsics.checkNotNullParameter(s7, (String)object2);
                    Object object3 = s7.g0();
                    n3 = 1;
                    object3.u = n3;
                    Intrinsics.checkNotNullParameter(s7, (String)object2);
                    s7.g0().getClass();
                    Intrinsics.checkNotNullParameter(s7, (String)object2);
                    s7.g0().a = n3;
                    Intrinsics.checkNotNullParameter(s7, (String)object2);
                    object3 = s7.g0();
                    object3.getClass();
                    int n4 = com.jio.jioads.adinterfaces.j_0.l((Context)enum_) ^ n3;
                    Intrinsics.checkNotNullParameter(s7, (String)object2);
                    Object object4 = s7.g0();
                    object4.c = n4;
                    n4 = com.jio.jioads.adinterfaces.j_0.l((Context)enum_);
                    n4 = n4 != 0 ? com.jio.jioads.adinterfaces.j_0.r((Context)enum_) : 1;
                    Intrinsics.checkNotNullParameter(s7, (String)object2);
                    s7.g0().d = n4;
                    object3 = ((InterstitialAdController)object).c.L();
                    object4 = JioAdView$AdPodVariant.NONE;
                    if (object3 == object4) {
                        n4 = 1;
                    } else {
                        n4 = 0;
                        object3 = null;
                    }
                    Intrinsics.checkNotNullParameter(s7, (String)object2);
                    s7.g0().b = n4;
                    Intrinsics.checkNotNullParameter(s7, (String)object2);
                    s7.g0().getClass();
                    Intrinsics.checkNotNullParameter(s7, (String)object2);
                    object3 = s7.g0();
                    object3.e = false;
                    n4 = com.jio.jioads.adinterfaces.j_0.l((Context)enum_) ^ n3;
                    Intrinsics.checkNotNullParameter(s7, (String)object2);
                    s7.g0().f = n4;
                    n4 = com.jio.jioads.adinterfaces.j_0.r((Context)enum_);
                    Intrinsics.checkNotNullParameter(s7, (String)object2);
                    Object object5 = s7.g0();
                    ((com.jio.jioads.videomodule.config.a)object5).g = n4;
                    n4 = ((InterstitialAdController)object).i;
                    int n7 = -1;
                    if (n4 == n7 && (n4 = ((InterstitialAdController)object).j) == n7) {
                        n4 = 1;
                    } else {
                        n4 = 0;
                        object3 = null;
                    }
                    Intrinsics.checkNotNullParameter(s7, (String)object2);
                    object5 = s7.g0();
                    ((com.jio.jioads.videomodule.config.a)object5).h = n4;
                    Intrinsics.checkNotNullParameter(s7, (String)object2);
                    s7.g0().o = false;
                    object3 = ((InterstitialAdController)object).c.L();
                    if ((object3 == object4 || (object3 = ((InterstitialAdController)object).c.E()) == (object4 = JioAdView$VideoAdType.VOD)) && (object3 = ((InterstitialAdController)object).c.L()) != (object4 = JioAdView$AdPodVariant.INFINITE_AD_DURATION_WITH_LOOP)) {
                        n4 = 1;
                    } else {
                        n4 = 0;
                        object3 = null;
                    }
                    Intrinsics.checkNotNullParameter(s7, (String)object2);
                    s7.g0().j = n4;
                    object3 = ((InterstitialAdController)object).c.E();
                    object4 = JioAdView$VideoAdType.VOD;
                    if (object3 == object4) {
                        n4 = 1;
                    } else {
                        n4 = 0;
                        object3 = null;
                    }
                    Intrinsics.checkNotNullParameter(s7, (String)object2);
                    s7.g0().m = n4;
                    Intrinsics.checkNotNullParameter(s7, (String)object2);
                    object3 = s7.g0();
                    object3.k = n3;
                    n4 = 4;
                    object4 = n4;
                    object5 = "com.jio.media.stb.ondemand.patchwall";
                    boolean bl3 = com.jio.jioads.adinterfaces.j_0.m((Context)enum_, (String)object5, (Integer)object4);
                    String string2 = "com.yupptv.androidtv";
                    if (!bl3) {
                        object4 = n4;
                        com.jio.jioads.adinterfaces.j_0.m((Context)enum_, string2, (Integer)object4);
                    }
                    Intrinsics.checkNotNullParameter(s7, (String)object2);
                    s7.g0().getClass();
                    object4 = n4;
                    bl3 = com.jio.jioads.adinterfaces.j_0.m((Context)enum_, (String)object5, (Integer)object4);
                    if (!bl3 && !(bl2 = com.jio.jioads.adinterfaces.j_0.m((Context)enum_, string2, (Integer)(object3 = Integer.valueOf(n4))))) {
                        bl2 = false;
                        enum_ = null;
                    } else {
                        bl2 = true;
                    }
                    Intrinsics.checkNotNullParameter(s7, (String)object2);
                    s7.g0().i = bl2;
                    Intrinsics.checkNotNullParameter(s7, (String)object2);
                    s7.g0().l = n3;
                    Intrinsics.checkNotNullParameter(s7, (String)object2);
                    s7.g0().n = n3;
                    Intrinsics.checkNotNullParameter(s7, (String)object2);
                    s7.g0().p = n3;
                    enum_ = ((InterstitialAdController)object).c.L();
                    object3 = JioAdView$AdPodVariant.DEFAULT_ADPOD;
                    if (enum_ != object3 && (enum_ = ((InterstitialAdController)object).c.L()) != (object3 = JioAdView$AdPodVariant.INFINITE_AD_DURATION_WITH_LOOP)) {
                        bl2 = false;
                        enum_ = null;
                    } else {
                        bl2 = true;
                    }
                    Intrinsics.checkNotNullParameter(s7, (String)object2);
                    s7.g0().q = bl2;
                    enum_ = ((InterstitialAdController)object).c.L();
                    object3 = JioAdView$AdPodVariant.INFINITE_AD_DURATION_WITH_LOOP;
                    if (enum_ != object3) break block17;
                    object = ((f)((InterstitialAdController)object).d).a;
                    boolean bl4 = ((com.jio.jioads.controller.o)object).o;
                    if (bl4) break block18;
                }
                n3 = 0;
            }
            Intrinsics.checkNotNullParameter(s7, (String)object2);
            s7.g0().r = n3;
            Intrinsics.checkNotNullParameter(s7, (String)object2);
            s7.g0().s = false;
            Intrinsics.checkNotNullParameter(s7, (String)object2);
            object = s7.g0();
            object.getClass();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void access$initJioVideoViewIfNull(InterstitialAdController interstitialAdController, com.jio.jioads.instreamads.vastparser.model.m m2, Map object) {
        synchronized (interstitialAdController) {
            try {
                Object object3 = interstitialAdController.x;
                if (object3 == null) {
                    Object object2;
                    object3 = interstitialAdController.c;
                    if ((object3 = object3.k0()) != (object2 = JioAdView$AdState.DESTROYED)) {
                        object3 = interstitialAdController.c;
                        object3 = object3.Y();
                        try {
                            object2 = new j_0(interstitialAdController, (Context)object3, (Map)object, m2);
                            com.jio.jioads.util.s.d((Function0)object2);
                        }
                        catch (Exception exception) {
                            object3 = "Exception while creating JioVideoView ";
                            object = new StringBuilder((String)object3);
                            object3 = "<this>";
                            Intrinsics.checkNotNullParameter(exception, (String)object3);
                            object3 = yc0_2.b(exception);
                            ((StringBuilder)object).append((String)object3);
                            object = ((StringBuilder)object).toString();
                            object3 = "message";
                            Intrinsics.checkNotNullParameter(object, (String)object3);
                            object = JioAds.Companion;
                            object = ((JioAds$Companion)object).getInstance();
                            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            object = JioAds$LogLevel.NONE;
                            object = interstitialAdController.b;
                            object3 = JioAdView$AdState.FAILED;
                            object = (V)object;
                            ((V)object).e((JioAdView$AdState)((Object)object3));
                            object = JioAdError.Companion;
                            object3 = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
                            object.getClass();
                            JioAdError jioAdError = t_0.a((JioAdError$JioAdErrorType)((Object)object3));
                            object = interstitialAdController.b;
                            com.jio.jioads.cdnlogging.d d2 = com.jio.jioads.cdnlogging.d.a;
                            String string2 = exception.getMessage();
                            String string3 = String.valueOf(string2);
                            String string4 = "initJioVideoView";
                            String string5 = "InstreamVideo";
                            object2 = object;
                            object2 = (V)object;
                            ((V)object2).d(jioAdError, false, d2, string4, string5, string3, null);
                        }
                    }
                }
                return;
            }
            catch (Throwable throwable2) {}
            throw throwable2;
        }
    }

    public static final void access$initWebView(InterstitialAdController object) {
        Object object2;
        object.getClass();
        Object object3 = Utility.INSTANCE;
        boolean bl2 = ((Utility)object3).isWebViewEnabled();
        if (bl2 && (object3 = ((InterstitialAdController)object).c.k0()) != (object2 = JioAdView$AdState.DESTROYED)) {
            object3 = ((InterstitialAdController)object).c.Y();
            object2 = null;
            Object object4 = object3 != null ? new WebView((Context)object3) : null;
            int n3 = -1;
            Object object5 = new RelativeLayout.LayoutParams(n3, n3);
            if (object4 != null) {
                n3 = -16777216;
                object4.setBackgroundColor(n3);
            }
            if (object4 != null) {
                object4.setLayoutParams((ViewGroup.LayoutParams)object5);
            }
            if (object4 != null) {
                object5 = new k_0((InterstitialAdController)object);
                b b2 = ((InterstitialAdController)object).c;
                object2 = new x((Context)object3, (WebView)object4, (o)object5, b2);
            }
            ((InterstitialAdController)object).v = object2;
            if (object2 != null) {
                object3 = ((InterstitialAdController)object).s;
                object4 = "onclick";
                boolean bl3 = true;
                bl2 = StringsKt.F((CharSequence)object3, (CharSequence)object4, bl3);
                if (!bl2 && !(bl2 = StringsKt.F((CharSequence)(object3 = ((InterstitialAdController)object).s), (CharSequence)(object4 = "<a "), bl3))) {
                    bl3 = false;
                    object5 = null;
                }
                ((x)object2).f = bl3;
            }
            if ((object3 = ((InterstitialAdController)object).v) != null) {
                object = ((InterstitialAdController)object).s;
                ((x)object3).c((String)object);
            }
        }
    }

    public static final /* synthetic */ boolean access$isExoPlayerEnabled(InterstitialAdController interstitialAdController) {
        return interstitialAdController.a();
    }

    public static final /* synthetic */ boolean access$isOnAdRenderImpressionFired$p(InterstitialAdController interstitialAdController) {
        return interstitialAdController.p;
    }

    public static final /* synthetic */ boolean access$isVideoRender$p(InterstitialAdController interstitialAdController) {
        return interstitialAdController.h;
    }

    public static final /* synthetic */ boolean access$isViewableImpressionFired$p(InterstitialAdController interstitialAdController) {
        return interstitialAdController.q;
    }

    public static final void access$release(InterstitialAdController interstitialAdController) {
        s s7 = interstitialAdController.x;
        if (s7 != null) {
            s7.l();
        }
        s7 = null;
        interstitialAdController.x = null;
        Object object = interstitialAdController.K;
        if (object != null) {
            ((n)object).t();
        }
        interstitialAdController.K = null;
        interstitialAdController.t.clear();
        object = interstitialAdController.r;
        if (object != null) {
            ((NativeAdViewRenderer)object).onDestroy$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        }
        interstitialAdController.v = null;
        interstitialAdController.r = null;
    }

    public static final /* synthetic */ void access$setInStreamAudioRenderer$p(InterstitialAdController interstitialAdController, j j3) {
        interstitialAdController.y = j3;
    }

    public static final /* synthetic */ void access$setJioAdParser$p(InterstitialAdController interstitialAdController, com.jio.jioads.native.parser.a a2) {
        interstitialAdController.w = a2;
    }

    public static final /* synthetic */ void access$setJioVideoView$p(InterstitialAdController interstitialAdController, s s7) {
        interstitialAdController.x = s7;
    }

    public static final /* synthetic */ void access$setMFinalVastModel$p(InterstitialAdController interstitialAdController, com.jio.jioads.instreamads.vastparser.model.m m2) {
        interstitialAdController.g = m2;
    }

    public static final /* synthetic */ void access$setOnAdRenderImpressionFired$p(InterstitialAdController interstitialAdController, boolean bl2) {
        interstitialAdController.p = bl2;
    }

    public static final /* synthetic */ void access$setPreparedAd$p(InterstitialAdController interstitialAdController, boolean bl2) {
        interstitialAdController.getClass();
    }

    public static final /* synthetic */ void access$setVideoRender$p(InterstitialAdController interstitialAdController, boolean bl2) {
        interstitialAdController.h = bl2;
    }

    public static final /* synthetic */ void access$setViewableImpressionFired$p(InterstitialAdController interstitialAdController, boolean bl2) {
        interstitialAdController.q = bl2;
    }

    public static final /* synthetic */ void access$setViewableTime$p(InterstitialAdController interstitialAdController, long l2) {
        interstitialAdController.J = l2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final void access$startViewableTimerForImpressionFired(InterstitialAdController object) {
        long l2;
        StringBuilder stringBuilder;
        object.getClass();
        String string2 = "viewableImpression timer stared here  ";
        try {
            stringBuilder = new StringBuilder(string2);
            l2 = ((InterstitialAdController)object).J;
        }
        catch (Exception exception) {
            return;
        }
        stringBuilder.append(l2);
        String string3 = stringBuilder.toString();
        String string4 = "message";
        Intrinsics.checkNotNullParameter(string3, string4);
        JioAds$Companion jioAds$Companion = JioAds.Companion;
        JioAds jioAds = jioAds$Companion.getInstance();
        jioAds.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        long l3 = ((InterstitialAdController)object).J;
        k k2 = new k((InterstitialAdController)object, l3);
        CountDownTimer countDownTimer = k2.start();
        ((InterstitialAdController)object).I = countDownTimer;
        object = ((InterstitialAdController)object).H;
        object = ((L)object).a;
        ((InterstitialAdController)object).o = countDownTimer;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a() {
        Exception exception2;
        String string2;
        Object object;
        block4: {
            int n3;
            Object object2;
            block3: {
                object = "plr";
                string2 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
                object2 = ((f)this.d).a;
                boolean bl2 = ((com.jio.jioads.controller.o)object2).u;
                if (!bl2) return 0 != 0;
                object2 = this.c.n0();
                if (object2 != null) {
                    return (boolean)((Boolean)object2).booleanValue();
                }
                try {
                    object2 = this.t;
                    Object object3 = Constants$HeaderKeys.JIO_DATA;
                    String string3 = ((Constants$HeaderKeys)((Object)object3)).getKey();
                    Locale locale = Locale.ROOT;
                    string3 = string3.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(string3, string2);
                    bl2 = ((HashMap)object2).containsKey(string3);
                    if (!bl2) return 0 != 0;
                    object2 = this.t;
                    object3 = ((Constants$HeaderKeys)((Object)object3)).getKey();
                    object3 = ((String)object3).toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(object3, string2);
                    string2 = ((HashMap)object2).get(object3);
                    if (string2 != null) break block3;
                    string2 = "{}";
                }
                catch (Exception exception2) {
                    break block4;
                }
            }
            if ((n3 = (object2 = new JSONObject(string2)).has(object)) == 0) return 0 != 0;
            int n4 = object2.getInt(object);
            if (n4 != (n3 = 1)) return 0 != 0;
            return 1 != 0;
        }
        string2 = "Exception while getting PLAYER flag ";
        LO1.b(string2, exception2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        return 0 != 0;
    }

    public void forceCloseAd() {
        super.forceCloseAd();
        Object object = new StringBuilder();
        Object object2 = this.c;
        Object object3 = " : inside forceCloseAd()";
        com.jio.jioads.adinterfaces.j_0.i((b)object2, (StringBuilder)object, (String)object3);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = InterstitialActivity.Companion;
        object.getClass();
        boolean bl2 = InterstitialActivity.access$isActivityRunning$cp();
        if (bl2 && (object = this.e) != null) {
            object2 = "null cannot be cast to non-null type com.jio.jioads.interstitial.InterstitialActivity";
            Intrinsics.checkNotNull(object, (String)object2);
            object3 = object;
            object3 = (InterstitialActivity)object;
            int n3 = 7;
            InterstitialActivity.closeAd$default((InterstitialActivity)object3, null, null, null, n3, null);
            bl2 = false;
            object = null;
            this.e = null;
        }
    }

    public final ViewGroup getAdContainer() {
        return this.a;
    }

    public final String getAdData() {
        return this.s;
    }

    public final String getCcbString() {
        return this.u;
    }

    public final HashMap getHeaders() {
        return this.t;
    }

    public final b getIJioAdView() {
        return this.c;
    }

    public final c getIJioAdViewController() {
        return this.d;
    }

    public final String getInterstitialType() {
        return this.f;
    }

    public final com.jio.jioads.controller.a getJioAdCallbacks() {
        return this.b;
    }

    public Integer getVideoAdDuration() {
        Object object = this.x;
        if (object == null || (object = ((s)object).b0()) == null) {
            object = super.getVideoAdDuration();
        }
        return object;
    }

    public final x getWebViewHandler() {
        return this.v;
    }

    public void hideCTAButton() {
        super.hideCTAButton();
        Object object = this.x;
        if (object != null) {
            boolean bl2;
            Object object2 = ((s)object).h0();
            ((com.jio.jioads.videomodule.config.b)object2).f = bl2 = true;
            object2 = ((s)object).X;
            if (object2 != null && (object = ((s)object).e0) != null) {
                ((e)object).u();
            }
        }
    }

    public void hideControls() {
        JioVideoViewState jioVideoViewState;
        boolean bl2;
        Object object;
        super.hideControls();
        Object object2 = this.x;
        if (!(object2 == null || (object = ((s)object2).X) == null || (object = ((s)object2).e0) == null || (bl2 = Intrinsics.areEqual(object = ((s)object2).A, jioVideoViewState = com.jio.jioads.videomodule.x.a)) && (bl2 = Intrinsics.areEqual(object = ((s)object2).A, jioVideoViewState = w_0.a)) || (object2 = ((s)object2).e0) == null)) {
            ((e)object2).j = bl2 = true;
            ((e)object2).l(bl2);
        }
    }

    public void hidePlayButton() {
        super.hidePlayButton();
        Object object = this.x;
        if (object != null && (object = ((s)object).e0) != null) {
            boolean bl2;
            com.jio.jioads.videomodule.config.b b2 = ((e)object).g;
            b2.d = bl2 = true;
            object = ((e)object).d.q;
            if (object != null) {
                int n3 = 8;
                object.setVisibility(n3);
            }
        }
    }

    public void hideSkip() {
        String string2;
        super.hideSkip();
        Object object = this.x;
        if (object != null) {
            object = ((s)object).e0;
            if (object != null) {
                object = ((e)object).d;
                string2 = ((com.jio.jioads.videomodule.renderer.f)object).w;
                int n3 = 8;
                if (string2 != null) {
                    string2.setVisibility(n3);
                }
                string2 = ((com.jio.jioads.videomodule.renderer.f)object).A;
                if (string2 != null) {
                    string2.setVisibility(n3);
                }
                object = ((com.jio.jioads.videomodule.renderer.f)object).i;
                if (object != null) {
                    object.setVisibility(n3);
                }
            }
            object = Unit.a;
        } else {
            object = null;
        }
        if (object == null) {
            string2 = "message";
            Intrinsics.checkNotNullParameter("jioVideoView is null", string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
    }

    public boolean isMediaMuted() {
        boolean bl2;
        Object object = this.x;
        if (object != null) {
            object = ((s)object).B;
            h_0 h_02 = h_0.a;
            bl2 = Intrinsics.areEqual(object, h_02);
        } else {
            bl2 = super.isMediaMuted();
        }
        return bl2;
    }

    public boolean isMediaPlaying() {
        s s7 = this.x;
        boolean bl2 = s7 != null ? s7.c() : super.isMediaPlaying();
        return bl2;
    }

    public void muteVideoAd() {
        super.muteVideoAd();
        s s7 = this.x;
        if (s7 != null) {
            boolean bl2 = true;
            s7.F(bl2);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onAdDataUpdate(String string2, Map map2) {
        n n3;
        HashMap hashMap;
        int n4;
        int n7;
        Object object;
        int n8;
        Object object2;
        int n10;
        InterstitialAdController interstitialAdController = this;
        Object object3 = string2;
        Object object4 = map2;
        Object object5 = "Native ad rendition error";
        Object object6 = this.c.Y();
        int n14 = 0;
        Object var9_9 = null;
        if (object6 != null && (object6 = object6.getResources()) != null && (object6 = object6.getConfiguration()) != null) {
            n10 = ((Configuration)object6).orientation;
            object6 = n10;
        } else {
            n10 = 0;
            object6 = null;
        }
        interstitialAdController.E = object6;
        Object object7 = "message";
        Intrinsics.checkNotNullParameter("Interstitial onAdDataUpdate() Called", (String)object7);
        object6 = JioAds.Companion;
        ((JioAds$Companion)object6).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        int n15 = TextUtils.isEmpty((CharSequence)string2);
        if (n15 != 0) {
            object3 = new StringBuilder();
            com.jio.jioads.common.l.a(interstitialAdController.c, (StringBuilder)object3, ": No ads in inventory", (JioAds$Companion)object6);
            object3 = JioAdError.Companion;
            object6 = JioAdError$JioAdErrorType.ERROR_NOFILL;
            object4 = com.jio.jioads.adinterfaces.j_0.c((t_0)object3, (JioAdError$JioAdErrorType)((Object)object6), "No ads in inventory");
            object3 = interstitialAdController.b;
            com.jio.jioads.cdnlogging.d d2 = com.jio.jioads.cdnlogging.d.a;
            Object object8 = object3;
            ((V)object3).d((JioAdError)object4, false, d2, "onAdDataUpdate", "InterstitialAdController", "No ads in inventory", null);
            return;
        }
        object6 = interstitialAdController.c.C();
        n15 = 0;
        Object var12_31 = null;
        int n16 = 1;
        if (object6 != null) {
            int n17;
            object6 = object6.entrySet().iterator();
            while ((n17 = object6.hasNext()) != 0) {
                Map.Entry entry = (Map.Entry)object6.next();
                object2 = (Number)entry.getKey();
                n8 = ((Number)object2).intValue();
                Integer[] integerArray = (Integer[])entry.getValue();
                object = integerArray[0];
                n7 = (Integer)object;
                Integer n18 = integerArray[n16];
                n17 = n18;
                if (n8 != n16) {
                    n4 = 6;
                    if (n8 != n4) {
                        n4 = 12;
                        if (n8 != n4) continue;
                        interstitialAdController.m = n7;
                        interstitialAdController.n = n17;
                        continue;
                    }
                    interstitialAdController.k = n7;
                    interstitialAdController.l = n17;
                    continue;
                }
                interstitialAdController.i = n7;
                interstitialAdController.j = n17;
            }
        }
        if (object3 != null) {
            interstitialAdController.s = object3;
        }
        object6 = "null cannot be cast to non-null type java.util.HashMap<kotlin.String?, kotlin.String?>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String?, kotlin.String?> }";
        Intrinsics.checkNotNull(object4, (String)object6);
        Object object9 = object4;
        interstitialAdController.t = hashMap = (HashMap)object4;
        JioAdView$AdState jioAdView$AdState = interstitialAdController.c.k0();
        object2 = JioAdView$AdState.DESTROYED;
        if (jioAdView$AdState == object2) {
            return;
        }
        Context context = interstitialAdController.c.Y();
        n7 = map2.isEmpty() ^ n16;
        Object object10 = "";
        if (n7 != 0 && (n7 = (int)(((InterstitialViewUtility$Companion)(object = com.jio.jioads.interstitial.m.a)).isHtmlResponse((Map)object4) ? 1 : 0)) != 0) {
            JioAdView$AD_TYPE jioAdView$AD_TYPE;
            Integer n19;
            JioAdsMetadata jioAdsMetadata;
            String string3;
            Boolean bl2;
            String string4;
            Integer n20;
            String string5;
            void var9_11;
            object6 = new Object();
            ((com.jio.jioads.util.k)object6).p = context;
            object2 = interstitialAdController.c.P();
            ((com.jio.jioads.util.k)object6).q = object2;
            ((com.jio.jioads.util.k)object6).a = object3;
            object3 = interstitialAdController.u;
            ((com.jio.jioads.util.k)object6).b = object3;
            if (context != null) {
                Intrinsics.checkNotNullParameter(context, "context");
                object3 = "common_prefs";
                object2 = "advid";
                try {
                    object3 = com.jio.jioads.adinterfaces.j_0.d(context, (String)object3, 0, object10, (String)object2);
                    String string6 = "null cannot be cast to non-null type kotlin.String";
                    Intrinsics.checkNotNull(object3, string6);
                    Object object11 = object3 = (String)object3;
                }
                catch (Exception exception) {}
            }
            ((com.jio.jioads.util.k)object6).r = var9_11;
            object3 = Utility.INSTANCE;
            ((com.jio.jioads.util.k)object6).s = string5 = ((Utility)object3).getUidFromPreferences(context);
            ((com.jio.jioads.util.k)object6).l = n20 = Integer.valueOf(n16);
            ((com.jio.jioads.util.k)object6).d = string4 = (String)object4.get("cid");
            ((com.jio.jioads.util.k)object6).e = bl2 = Boolean.FALSE;
            ((com.jio.jioads.util.k)object6).w = string3 = interstitialAdController.c.q0();
            ((com.jio.jioads.util.k)object6).m = bl2;
            ((com.jio.jioads.util.k)object6).o = bl2;
            ((com.jio.jioads.util.k)object6).n = bl2;
            ((com.jio.jioads.util.k)object6).t = jioAdsMetadata = interstitialAdController.c.R();
            interstitialAdController.c.L();
            n14 = interstitialAdController.c.W();
            ((com.jio.jioads.util.k)object6).F = n19 = Integer.valueOf(n14);
            ((com.jio.jioads.util.k)object6).u = jioAdView$AD_TYPE = interstitialAdController.c.K();
            interstitialAdController.s = object3 = ((Utility)object3).replaceMacros((com.jio.jioads.util.k)object6);
            object6 = object4;
            object6 = (HashMap)object4;
            interstitialAdController.t = object6;
            object6 = interstitialAdController.b;
            JioAdView$AdState jioAdView$AdState2 = JioAdView$AdState.RECEIVED;
            ((V)object6).e(jioAdView$AdState2);
            ((V)interstitialAdController.b).o();
            object6 = interstitialAdController.d;
            String string7 = Constants$HeaderKeys.X_Jio_VIM.getKey();
            object6 = ((f)object6).a(string7);
            n10 = (int)(TextUtils.isEmpty((CharSequence)object6) ? 1 : 0);
            if (n10 == 0) {
                object6 = new m_0((String)object3, interstitialAdController);
                com.jio.jioads.util.s.d((Function0)object6);
                object3 = interstitialAdController.b;
                object6 = JioAdView$AdState.PREPARED;
                ((V)object3).e((JioAdView$AdState)((Object)object6));
                object3 = (V)interstitialAdController.b;
                ((V)object3).n();
                return;
            }
            object3 = interstitialAdController.b;
            object6 = JioAdView$AdState.PREPARED;
            ((V)object3).e((JioAdView$AdState)((Object)object6));
            object3 = (V)interstitialAdController.b;
            ((V)object3).n();
            return;
        }
        InterstitialViewUtility$Companion interstitialViewUtility$Companion = com.jio.jioads.interstitial.m.a;
        n16 = (int)(interstitialViewUtility$Companion.isNativeResponse$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((Map)object4) ? 1 : 0);
        if (n16 != 0) {
            String string8;
            block31: {
                String string9;
                String string10;
                String string11;
                com.jio.jioads.native.parser.a a2;
                void var14_66;
                if (object3 == null) {
                    String string12 = object10;
                } else {
                    Object object12 = object3;
                }
                Intrinsics.checkNotNullParameter("NativeAd: jsonParseResponse called ", (String)object7);
                object = JioAds.Companion;
                ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object3 = JioAds$LogLevel.NONE;
                object3 = new JSONObject((String)var14_66);
                interstitialAdController.w = a2 = new com.jio.jioads.native.parser.a();
                try {
                    void var12_47;
                    c c2;
                    c c3 = c2 = interstitialAdController.d;
                    f f5 = (f)c2;
                    com.jio.jioads.controller.o o3 = f5.a;
                    n16 = (int)(o3.O ? 1 : 0);
                    object2 = "result";
                    if (n16 != 0) {
                        object3 = object3.getJSONObject((String)object2);
                        Intrinsics.checkNotNull(object3);
                    } else {
                        f f6 = (f)c2;
                        com.jio.jioads.controller.o o6 = f6.a;
                        n15 = o6.o;
                        if (n15 == 0) {
                            object3 = object3.getJSONObject((String)object2);
                        }
                        Intrinsics.checkNotNull(object3);
                    }
                    n15 = object3.length();
                    if (n15 == 0) {
                        t_0 t_02 = JioAdError.Companion;
                        JioAdError$JioAdErrorType jioAdError$JioAdErrorType = JioAdError$JioAdErrorType.ERROR_NOFILL;
                        t_02.getClass();
                        JioAdError jioAdError = t_0.a(jioAdError$JioAdErrorType);
                        String string13 = "No Ad in Inventory";
                        jioAdError.setErrorDescription$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(string13);
                        com.jio.jioads.controller.a a3 = interstitialAdController.b;
                        com.jio.jioads.cdnlogging.d d5 = com.jio.jioads.cdnlogging.d.a;
                        string11 = "jsonParseResponse";
                        string10 = "InterstitialAdController";
                        String string14 = "Ad response string is empty from server";
                        object10 = a3;
                        object10 = (V)a3;
                        string9 = null;
                        ((V)object10).d(jioAdError, false, d5, string11, string10, string14, null);
                    }
                    com.jio.jioads.native.parser.a a4 = interstitialAdController.w;
                    string8 = "jioAdParser";
                    if (a4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string8);
                        n15 = 0;
                        Object var12_46 = null;
                    }
                    object2 = interstitialAdController.d;
                    object10 = "adid";
                    object2 = (f)object2;
                    object2 = ((f)object2).a((String)object10);
                    var12_47.b((String)object2, (JSONObject)object3);
                    object3 = interstitialAdController.b;
                    JioAdView$AdState jioAdView$AdState3 = JioAdView$AdState.RECEIVED;
                    object3 = (V)object3;
                    ((V)object3).e(jioAdView$AdState3);
                    object3 = interstitialAdController.b;
                    object3 = (V)object3;
                    ((V)object3).o();
                    object3 = interstitialAdController.c;
                    boolean bl3 = object3.X();
                    if (bl3) break block31;
                }
                catch (Exception exception) {
                    object3 = JioAdError.Companion;
                    object6 = JioAdError$JioAdErrorType.ERROR_PARSING;
                    object = com.jio.jioads.adinterfaces.j_0.c((t_0)object3, (JioAdError$JioAdErrorType)((Object)object6), (String)object5);
                    object3 = interstitialAdController.b;
                    com.jio.jioads.cdnlogging.d d7 = com.jio.jioads.cdnlogging.d.a;
                    object7 = object3;
                    object7 = (V)object3;
                    String string15 = "jsonParseResponse";
                    String string16 = "NativeAd";
                    n4 = 0;
                    object10 = null;
                    String string17 = "getting error on json parse";
                    Object var27_99 = null;
                    ((V)object7).d((JioAdError)object, false, d7, string15, string16, string17, null);
                    return;
                }
                Intrinsics.checkNotNull(object4, (String)object6);
                object3 = object4;
                interstitialAdController.t = object3 = (HashMap)object4;
                try {
                    void var9_22;
                    object6 = interstitialAdController.b;
                    object3 = interstitialAdController.w;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string8);
                    } else {
                        Object object13 = object3;
                    }
                    b b2 = interstitialAdController.c;
                    c c5 = interstitialAdController.d;
                    n8 = 0;
                    object2 = null;
                    object3 = object10;
                    object4 = map2;
                    object10 = new NativeAdViewRenderer((com.jio.jioads.controller.a)object6, (com.jio.jioads.native.parser.a)var9_22, b2, map2, c5, (String)var14_66, 0);
                    object3 = interstitialAdController.H;
                    ((NativeAdViewRenderer)object10).initNativeViewListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((a)object3);
                    interstitialAdController.r = object10;
                    object3 = new StringBuilder();
                    object6 = interstitialAdController.c;
                    object6 = object6.P();
                    ((StringBuilder)object3).append((String)object6);
                    object6 = ": NativeAd: initNativeAdView called prepare function";
                    ((StringBuilder)object3).append((String)object6);
                    object3 = ((StringBuilder)object3).toString();
                    Intrinsics.checkNotNullParameter(object3, (String)object7);
                    object3 = ((JioAds$Companion)object).getInstance();
                    ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object3 = interstitialAdController.r;
                    if (object3 == null) return;
                    ((NativeAdViewRenderer)object3).prepareViews$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    return;
                }
                catch (Exception exception) {
                    object3 = new StringBuilder("Exception while creating JioVideoView ");
                    object6 = Unit.a;
                    ((StringBuilder)object3).append(object6);
                    Intrinsics.checkNotNullParameter(((StringBuilder)object3).toString(), (String)object7);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object3 = JioAds$LogLevel.NONE;
                    object3 = JioAdError.Companion;
                    object6 = JioAdError$JioAdErrorType.ERROR_IN_LOAD_AD;
                    object = com.jio.jioads.adinterfaces.j_0.c((t_0)object3, (JioAdError$JioAdErrorType)((Object)object6), (String)object5);
                    object3 = interstitialAdController.b;
                    com.jio.jioads.cdnlogging.d d9 = com.jio.jioads.cdnlogging.d.a;
                    object7 = object3;
                    object7 = (V)object3;
                    string9 = "initNativeView";
                    String string18 = "NativeAd";
                    n4 = 0;
                    object10 = null;
                    string11 = "Exception while creating JioVideoView";
                    string10 = null;
                    ((V)object7).d((JioAdError)object, false, d9, string9, string18, string11, null);
                    return;
                }
            }
            object3 = interstitialAdController.b;
            object6 = interstitialAdController.w;
            if (object6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string8);
                n10 = 0;
                object6 = null;
            }
            c c6 = interstitialAdController.d;
            object3 = (V)object3;
            object3.getClass();
            Intrinsics.checkNotNullParameter(object6, "nativeAd");
            Intrinsics.checkNotNullParameter(c6, "iJioAdViewController");
            Intrinsics.checkNotNullParameter(object4, "headers");
            StringBuilder stringBuilder = new StringBuilder();
            String string19 = ((V)object3).b;
            object2 = " Callback prepareCustomAdData";
            d_0.a(stringBuilder, string19, (String)object2, (JioAds$Companion)object);
            object3 = ((V)object3).a;
            ((JioAdView)object3).prepareCustomAdData$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((com.jio.jioads.native.parser.a)object6, null, c6, (Map)object4);
            return;
        }
        n10 = (int)(interstitialViewUtility$Companion.isVastResponse$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((Map)object4) ? 1 : 0);
        if (n10 == 0) {
            object3 = interstitialAdController.b;
            object6 = JioAdView$AdState.FAILED;
            ((V)object3).e((JioAdView$AdState)((Object)object6));
            object3 = JioAdError.Companion;
            object6 = JioAdError$JioAdErrorType.ERROR_PARSING;
            String string20 = "Invalid HTML or headers";
            object4 = com.jio.jioads.adinterfaces.j_0.c((t_0)object3, (JioAdError$JioAdErrorType)((Object)object6), string20);
            object3 = interstitialAdController.b;
            com.jio.jioads.cdnlogging.d d12 = com.jio.jioads.cdnlogging.d.a;
            object5 = InterstitialAdController.class.getName();
            object6 = "getName(...)";
            Intrinsics.checkNotNullExpressionValue(object5, (String)object6);
            Object object14 = object3;
            V v4 = (V)object3;
            n16 = 0;
            Object var23_89 = null;
            object2 = "onAdDataUpdate";
            object7 = "HTML Ad failed to parse";
            n7 = 0;
            object = null;
            v4.d((JioAdError)object4, false, d12, (String)object2, (String)object5, (String)object7, null);
            return;
        }
        object6 = new StringBuilder();
        b b3 = interstitialAdController.c;
        String string21 = ": inside startVideoProcessing";
        com.jio.jioads.adinterfaces.j_0.i(b3, (StringBuilder)object6, string21);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object6 = JioAds$LogLevel.NONE;
        object6 = interstitialAdController.c.k0();
        if (object6 == object2) {
            return;
        }
        object6 = interstitialAdController.c.Y();
        n n21 = interstitialAdController.K;
        if (n21 != null) return;
        HashMap hashMap2 = interstitialAdController.t;
        b b4 = interstitialAdController.c;
        object2 = interstitialAdController.d;
        object5 = new i_0((Context)object6, interstitialAdController, (Map)object4);
        object6 = interstitialAdController.b;
        n n22 = n3;
        object4 = hashMap2;
        b b5 = b4;
        Object object15 = object2;
        object2 = object5;
        object5 = object6;
        interstitialAdController.K = n3 = new n((HashMap)object4, b5, (c)object15, (com.jio.jioads.instreamads.vastparser.listener.c)object2, (com.jio.jioads.controller.a)object6);
        n3.u((String)object3);
    }

    public void onCacheAd() {
    }

    public void onCacheMediationAd(JSONObject jSONObject, String object, Map object2) {
        object = new StringBuilder();
        Object object3 = this.c;
        String string2 = ": InterstitialAdController onCacheMediationAd() Called";
        com.jio.jioads.adinterfaces.j_0.i(object3, (StringBuilder)object, string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        if (object2 != null) {
            object2 = (HashMap)object2;
            this.t = object2;
        }
        string2 = this.a;
        com.jio.jioads.controller.a a2 = this.b;
        b b2 = this.c;
        c c2 = this.d;
        InterstitialAdController$mediationListener$1 interstitialAdController$mediationListener$1 = this.G;
        object3 = object;
        object = new JioAdMediationController((ViewGroup)string2, a2, b2, c2, interstitialAdController$mediationListener$1);
        object2 = this.s;
        object3 = this.t;
        ((JioAdMediationController)object).cacheMediationAd(jSONObject, (String)object2, (Map)object3);
    }

    public void onDestroy() {
        Object object = "message";
        Intrinsics.checkNotNullParameter("onDestroy ad", (String)object);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object2 = JioAds$LogLevel.NONE;
        object2 = this.x;
        if (object2 != null) {
            ((s)object2).l();
        }
        object2 = null;
        this.x = null;
        object = this.K;
        if (object != null) {
            ((n)object).t();
        }
        this.K = null;
        this.t.clear();
        object = this.r;
        if (object != null) {
            ((NativeAdViewRenderer)object).onDestroy$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        }
        this.v = null;
        this.r = null;
    }

    public View onShowAdView() {
        int n3;
        Object object = new StringBuilder();
        com.jio.jioads.adinterfaces.j_0.i(this.c, object, ": Interstitial onShowAdView() Called");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.c.k0();
        Object object2 = JioAdView$AdState.DESTROYED;
        if (object == object2) {
            return null;
        }
        object = this.c.Y();
        object2 = com.jio.jioads.interstitial.G.k;
        if (object2 == null) {
            object2 = new Object();
            com.jio.jioads.interstitial.G.k = object2;
        }
        Object object3 = this.c;
        object2.d = object3;
        object2.b = object3 = this.b;
        object2.c = object3 = this.d;
        object2.j = object3 = this.v;
        object2.g = object3 = this.g;
        object2.h = this;
        object3 = new Intent((Context)object, InterstitialActivity.class);
        Object object4 = this.f;
        Object object5 = "audio";
        boolean bl2 = true;
        boolean bl3 = kotlin.text.b.i((String)object4, (String)object5, bl2);
        String string2 = "adType";
        if (bl3) {
            object3.putExtra("isInterstitialAudioAd", bl2);
            object2.a = object4 = this.y;
            object3.putExtra(string2, (String)object5);
        } else {
            object4 = "video";
            object3.putExtra(string2, (String)object4);
        }
        object4 = this.s;
        object3.putExtra("data", (String)object4);
        object4 = this.E;
        object3.putExtra("cacheAdOrientation", (Serializable)object4);
        object4 = this.t;
        object3.putExtra("headers", (Serializable)object4);
        object4 = this.u;
        object3.putExtra("ccbString", (String)object4);
        object4 = com.jio.jioads.interstitial.m.a;
        object5 = this.t;
        boolean bl4 = ((InterstitialViewUtility$Companion)object4).isNativeResponse$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((Map)object5);
        String string3 = "customContainerLandscape";
        string2 = "customContainerPortrait";
        if (bl4) {
            object2.e = object4 = this.r;
            n3 = this.k;
            object3.putExtra(string2, n3);
            n3 = this.l;
            object3.putExtra(string3, n3);
        } else {
            object5 = this.t;
            bl3 = ((InterstitialViewUtility$Companion)object4).isVastResponse$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((Map)object5);
            if (bl3) {
                object2.f = object4 = this.x;
                object2.i = object4 = this.F;
                n3 = this.i;
                object3.putExtra(string2, n3);
                n3 = this.j;
                object3.putExtra(string3, n3);
            } else {
                n3 = this.m;
                object3.putExtra(string2, n3);
                n3 = this.n;
                object3.putExtra(string3, n3);
            }
        }
        object3.addFlags(0x10000000);
        object3.addFlags(131072);
        n3 = object instanceof Activity;
        if (n3 != 0) {
            object = (Activity)object;
            n3 = 0;
            object2 = new Bundle[]{};
            object2 = ActivityOptions.makeSceneTransitionAnimation((Activity)object, (Pair[])object2).toBundle();
            object.startActivity((Intent)object3, object2);
        } else if (object != null) {
            object.startActivity((Intent)object3);
        }
        return null;
    }

    public void pauseAd(boolean bl2) {
    }

    public void resumeAd(boolean bl2) {
    }

    public final void setAdContainer(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public final void setAdData(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.s = string2;
    }

    public final void setAliveInterstitialActivityContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object object = new StringBuilder();
        com.jio.jioads.adinterfaces.j_0.i(this.c, object, ": setting aliveInterstitialActivityContext");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        this.e = context;
    }

    public void setAudioCompanionContainer(ViewGroup object, int n3, int n4, Drawable drawable2, Drawable drawable3) {
        super.setAudioCompanionContainer((ViewGroup)object, n3, n4, drawable2, drawable3);
        Object object2 = new StringBuilder();
        String string2 = this.c.P();
        object2.append(string2);
        object2.append(": value of container setAudioCompanionContainer : ");
        object2.append(object);
        Intrinsics.checkNotNullParameter(object2.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        this.z = object;
        object = n3;
        this.A = object;
        object = n4;
        this.B = object;
        this.C = drawable2;
        this.D = drawable3;
    }

    public final void setCcbString(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.u = string2;
    }

    public final void setHeaders(HashMap hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<set-?>");
        this.t = hashMap;
    }

    public final void setInterstitialType(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.f = string2;
    }

    public void setParentContainer(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "adContainer");
        this.a = viewGroup;
    }

    public final void setWebViewHandler(x x5) {
        this.v = x5;
    }

    public void showCTAButton() {
        super.showCTAButton();
        Object object = this.x;
        if (object != null) {
            ((s)object).h0().f = false;
            com.jio.jioads.videomodule.player.o o3 = ((s)object).X;
            if (o3 != null && (object = ((s)object).e0) != null) {
                ((e)object).u();
            }
        }
    }

    public void showControls() {
        JioVideoViewState jioVideoViewState;
        boolean bl2;
        Object object;
        super.showControls();
        Object object2 = this.x;
        if (!(object2 == null || (object = ((s)object2).X) == null || (object = ((s)object2).e0) == null || (bl2 = Intrinsics.areEqual(object = ((s)object2).A, jioVideoViewState = com.jio.jioads.videomodule.x.a)) && (bl2 = Intrinsics.areEqual(object = ((s)object2).A, jioVideoViewState = w_0.a)) || (object2 = ((s)object2).e0) == null)) {
            object = null;
            ((e)object2).j = false;
            bl2 = true;
            ((e)object2).l(bl2);
        }
    }

    public void showPlayButton() {
        super.showPlayButton();
        Object object = this.x;
        if (object != null && (object = ((s)object).e0) != null) {
            com.jio.jioads.videomodule.config.b b2 = ((e)object).g;
            b2.d = false;
            object = ((e)object).d.q;
            if (object != null) {
                object.setVisibility(0);
            }
        }
    }

    public void showSkip() {
        super.showSkip();
        Object object = this.x;
        if (object != null) {
            ((s)object).m();
            object = Unit.a;
        } else {
            object = null;
        }
        if (object == null) {
            String string2 = "message";
            Intrinsics.checkNotNullParameter("jioVideoView is null", string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
    }

    public final void stopViewableImpressionTimer$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        Object object = this.H.a.o;
        if (object != null) {
            object = this.H.a.o;
            if (object != null) {
                object.cancel();
            }
            object = this.H.a;
            String string2 = null;
            ((InterstitialAdController)object).o = null;
            object = this.I;
            if (object != null) {
                object.cancel();
            }
            this.I = null;
            string2 = "message";
            Intrinsics.checkNotNullParameter("removing viewable timer", string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
    }

    public void unmuteVideoAd() {
        super.unmuteVideoAd();
        s s7 = this.x;
        if (s7 != null) {
            boolean bl2 = true;
            s7.Q(bl2);
        }
    }
}

