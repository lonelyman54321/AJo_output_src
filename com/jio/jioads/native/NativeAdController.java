/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.CountDownTimer
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.ViewGroup
 *  android.webkit.WebView
 *  org.json.JSONObject
 */
package com.jio.jioads.native;

import android.content.Context;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$AdDetails;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.common.l;
import com.jio.jioads.controller.f;
import com.jio.jioads.instreamads.vastparser.listener.c;
import com.jio.jioads.interstitial.x;
import com.jio.jioads.native.NativeAdController$mediationListener$1;
import com.jio.jioads.native.i;
import com.jio.jioads.native.j;
import com.jio.jioads.native.k;
import com.jio.jioads.native.n;
import com.jio.jioads.native.o;
import com.jio.jioads.native.p;
import com.jio.jioads.native.q;
import com.jio.jioads.native.r;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import com.jio.jioads.native.t;
import com.jio.jioads.native.utils.a;
import com.jio.jioads.native.utils.b;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.s;
import com.jio.jioads.utils.Constants$DynamicDisplaySize;
import com.jio.jioads.utils.Constants$HeaderKeys;
import com.jio.jioads.utils.e;
import com.jioads.mediation.JioAdMediationController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

public final class NativeAdController
extends com.jio.jioads.common.d {
    public ViewGroup a;
    public final com.jio.jioads.controller.a b;
    public final com.jio.jioads.common.b c;
    public final com.jio.jioads.common.c d;
    public CountDownTimer e;
    public long f;
    public t g;
    public final rq1_2 h;
    public NativeAdViewRenderer i;
    public com.jio.jioads.instreamads.vastparser.n j;
    public com.jio.jioads.native.parser.a k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public String p;
    public boolean q;
    public WebView r;
    public String s;
    public String t;
    public HashMap u;
    public x v;
    public JioAdMediationController w;
    public final n x;
    public final NativeAdController$mediationListener$1 y;
    public CountDownTimer z;

    public NativeAdController(ViewGroup object, com.jio.jioads.controller.a object2, com.jio.jioads.common.b b2, com.jio.jioads.common.c c2) {
        Intrinsics.checkNotNullParameter(object2, "jioAdCallback");
        Intrinsics.checkNotNullParameter(b2, "iJioAdView");
        String string2 = "iJioAdViewController";
        Intrinsics.checkNotNullParameter(c2, string2);
        super((com.jio.jioads.controller.a)object2, b2, c2);
        this.a = object;
        this.b = object2;
        this.c = b2;
        this.d = c2;
        object = yr1_2.b(com.jio.jioads.native.p.c);
        this.h = object;
        this.p = "JSON";
        object = "";
        this.s = object;
        this.t = object;
        super();
        this.u = object;
        super();
        object2 = ": NativeAdController inside init()";
        com.jio.jioads.jioreel.tracker.model.b.a(b2, (StringBuilder)object, (String)object2);
        object = this.i;
        if (object != null) {
            ((NativeAdViewRenderer)object).onDestroy$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        }
        this.i = null;
        object = Utility.INSTANCE;
        object2 = b2.P();
        this.s = object = ((Utility)object).getCcbValue((String)object2);
        this.x = object = new n(this);
        this.y = object = new NativeAdController$mediationListener$1(this);
    }

    public static final /* synthetic */ void access$fireHTMLTracker(NativeAdController nativeAdController) {
        nativeAdController.b();
    }

    public static final void access$fireViewableImpression(NativeAdController nativeAdController) {
        Object object = nativeAdController.d;
        Object object2 = Constants$HeaderKeys.X_Jio_VIM.getKey();
        boolean bl2 = TextUtils.isEmpty((CharSequence)(object = ((f)object).a((String)object2)));
        if (!bl2) {
            object2 = new j(nativeAdController, (String)object);
            object2.start();
        }
    }

    public static final /* synthetic */ ViewGroup access$getAdContainer$p(NativeAdController nativeAdController) {
        return nativeAdController.a;
    }

    public static final /* synthetic */ String access$getHtmlAdResponse$p(NativeAdController nativeAdController) {
        return nativeAdController.t;
    }

    public static final /* synthetic */ HashMap access$getHtmlHeaders$p(NativeAdController nativeAdController) {
        return nativeAdController.u;
    }

    public static final /* synthetic */ com.jio.jioads.common.b access$getIJioAdView$p(NativeAdController nativeAdController) {
        return nativeAdController.c;
    }

    public static final /* synthetic */ com.jio.jioads.common.c access$getIJioAdViewController$p(NativeAdController nativeAdController) {
        return nativeAdController.d;
    }

    public static final /* synthetic */ com.jio.jioads.controller.a access$getJioAdCallback$p(NativeAdController nativeAdController) {
        return nativeAdController.b;
    }

    public static final /* synthetic */ com.jio.jioads.native.parser.a access$getJioAdParser$p(NativeAdController nativeAdController) {
        return nativeAdController.k;
    }

    public static final /* synthetic */ NativeAdViewRenderer access$getJioNativeAdView$p(NativeAdController nativeAdController) {
        return nativeAdController.i;
    }

    public static final /* synthetic */ n access$getListener$p(NativeAdController nativeAdController) {
        return nativeAdController.x;
    }

    public static final /* synthetic */ String access$getMLastAdType$p(NativeAdController nativeAdController) {
        return nativeAdController.p;
    }

    public static final /* synthetic */ t access$getRefreshTimeHandler$p(NativeAdController nativeAdController) {
        return nativeAdController.g;
    }

    public static final /* synthetic */ HashMap access$getResponseHeaders(NativeAdController nativeAdController) {
        return nativeAdController.e();
    }

    public static final /* synthetic */ boolean access$getWasWebImpressionFired$p(NativeAdController nativeAdController) {
        return nativeAdController.l;
    }

    public static final /* synthetic */ WebView access$getWebView$p(NativeAdController nativeAdController) {
        return nativeAdController.r;
    }

    public static final /* synthetic */ x access$getWebViewHandler$p(NativeAdController nativeAdController) {
        return nativeAdController.v;
    }

    public static final /* synthetic */ boolean access$isOnAdRenderImpressionFired$p(NativeAdController nativeAdController) {
        return nativeAdController.m;
    }

    public static final /* synthetic */ boolean access$isVideoRender$p(NativeAdController nativeAdController) {
        return nativeAdController.n;
    }

    public static final /* synthetic */ boolean access$isViewableImpressionFired$p(NativeAdController nativeAdController) {
        return nativeAdController.o;
    }

    public static final /* synthetic */ void access$setJioAdParser$p(NativeAdController nativeAdController, com.jio.jioads.native.parser.a a2) {
        nativeAdController.k = a2;
    }

    public static final /* synthetic */ void access$setNativeControllerError(NativeAdController nativeAdController, String string2, String string3, JioAdError$JioAdErrorType jioAdError$JioAdErrorType) {
        nativeAdController.a(string2, string3, jioAdError$JioAdErrorType);
    }

    public static final /* synthetic */ void access$setOnAdRenderImpressionFired$p(NativeAdController nativeAdController, boolean bl2) {
        nativeAdController.m = bl2;
    }

    public static final /* synthetic */ void access$setVideoRender$p(NativeAdController nativeAdController, boolean bl2) {
        nativeAdController.n = bl2;
    }

    public static final /* synthetic */ void access$setViewableImpressionFired$p(NativeAdController nativeAdController, boolean bl2) {
        nativeAdController.o = bl2;
    }

    public static final /* synthetic */ void access$setViewableTime$p(NativeAdController nativeAdController, long l2) {
        nativeAdController.f = l2;
    }

    public static final /* synthetic */ void access$setWasWebImpressionFired$p(NativeAdController nativeAdController, boolean bl2) {
        nativeAdController.l = bl2;
    }

    public static final /* synthetic */ void access$setWebPageFinishCalled$p(NativeAdController nativeAdController, boolean bl2) {
        nativeAdController.q = bl2;
    }

    public static final /* synthetic */ void access$setWebView$p(NativeAdController nativeAdController, WebView webView) {
        nativeAdController.r = webView;
    }

    public static final /* synthetic */ void access$setWebViewHandler$p(NativeAdController nativeAdController, x x5) {
        nativeAdController.v = x5;
    }

    public static final void access$startViewableTimerForImpressionFired(NativeAdController object) {
        Object object2 = "message";
        object.getClass();
        Object object3 = "viewableImpression timer stared here  ";
        Object object4 = new StringBuilder((String)object3);
        long l2 = ((NativeAdController)object).f;
        object4.append(l2);
        object3 = object4.toString();
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        object2 = JioAds.Companion;
        object2 = ((JioAds$Companion)object2).getInstance();
        ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        long l3 = ((NativeAdController)object).f;
        object4 = new r((NativeAdController)object, l3);
        object2 = object4.start();
        ((NativeAdController)object).z = object2;
        object3 = ((NativeAdController)object).x;
        object3 = ((n)object3).a;
        try {
            ((NativeAdController)object3).e = (CountDownTimer)object2;
        }
        catch (Exception exception) {
            object3 = new StringBuilder();
            object = ((NativeAdController)object).c;
            object4 = ": Exception start ViewableTimer For ImpressionFired: ";
            j_0.n((com.jio.jioads.common.b)object, (StringBuilder)object3, (String)object4);
            com.jio.jioads.jioreel.tracker.model.b.c(Utility.INSTANCE, exception, (StringBuilder)object3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
    }

    public final void a() {
        Object object;
        Object object2 = this.c.K();
        if (object2 != (object = JioAdView$AD_TYPE.INTERSTITIAL)) {
            object2 = new StringBuilder();
            object = this.c;
            Object object3 = ": Initialize Refresh Handler";
            j_0.i((com.jio.jioads.common.b)object, (StringBuilder)object2, (String)object3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object2 = this.g;
            if (object2 == null) {
                object = this.c;
                object3 = this.b;
                com.jio.jioads.common.c c2 = this.d;
                HashMap hashMap = this.e();
                this.g = object2 = new t((com.jio.jioads.common.b)object, (com.jio.jioads.controller.a)object3, c2, hashMap);
            }
            if ((object2 = this.g) != null) {
                ((t)object2).b();
            }
        }
    }

    public final void a(String string2, String string3, JioAdError$JioAdErrorType object) {
        JioAdError jioAdError = j_0.c(JioAdError.Companion, object, string3);
        object = this.b;
        d d2 = com.jio.jioads.cdnlogging.d.a;
        ((V)object).d(jioAdError, false, d2, string2, "NativeAdController", string3, null);
    }

    public final void a(String object, Map object2) {
        boolean bl2;
        int n3 = 1;
        Object object3 = new StringBuilder();
        j_0.n(this.c, object3, ": handleNonJsonResponse called ");
        Object object4 = this.i;
        object3.append(object4);
        object3 = object3.toString();
        object4 = "message";
        Intrinsics.checkNotNullParameter(object3, (String)object4);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object3 = JioAds$LogLevel.NONE;
        object3 = new Object();
        Object object5 = this.c.k0();
        Object object6 = JioAdView$AdState.DESTROYED;
        if (object5 == object6) {
            bl2 = false;
            object3 = null;
        } else {
            Object object7;
            object5 = this.c.Y();
            ((com.jio.jioads.util.k)object3).p = object5;
            object6 = this.c.P();
            ((com.jio.jioads.util.k)object3).q = object6;
            ((com.jio.jioads.util.k)object3).a = object;
            object = Utility.INSTANCE;
            object6 = this.c.P();
            object6 = ((Utility)object).getCcbValue((String)object6);
            ((com.jio.jioads.util.k)object3).b = object6;
            int n4 = 0;
            object6 = null;
            if (object5 != null) {
                Intrinsics.checkNotNullParameter(object5, "context");
                object7 = "common_prefs";
                String string2 = "advid";
                String string3 = "";
                try {
                    object7 = j_0.d((Context)object5, (String)object7, 0, string3, string2);
                    string2 = "null cannot be cast to non-null type kotlin.String";
                }
                catch (Exception exception) {}
                Intrinsics.checkNotNull(object7, string2);
                object7 = (String)object7;
            }
            object7 = null;
            ((com.jio.jioads.util.k)object3).r = object7;
            object5 = ((Utility)object).getUidFromPreferences((Context)object5);
            ((com.jio.jioads.util.k)object3).s = object5;
            object5 = n3;
            ((com.jio.jioads.util.k)object3).l = object5;
            object5 = (String)object2.get("cid");
            ((com.jio.jioads.util.k)object3).d = object5;
            object5 = Boolean.FALSE;
            ((com.jio.jioads.util.k)object3).e = object5;
            ((com.jio.jioads.util.k)object3).w = object7 = this.c.q0();
            ((com.jio.jioads.util.k)object3).m = object5;
            ((com.jio.jioads.util.k)object3).o = object5;
            ((com.jio.jioads.util.k)object3).n = object5;
            object5 = this.c.R();
            ((com.jio.jioads.util.k)object3).t = object5;
            this.c.L();
            int n7 = this.c.W();
            object5 = n7;
            ((com.jio.jioads.util.k)object3).F = object5;
            object5 = this.c.K();
            ((com.jio.jioads.util.k)object3).u = object5;
            object5 = this.c.m0();
            ((com.jio.jioads.util.k)object3).H = object5;
            object5 = this.c.Q();
            if (object5 != null) {
                n7 = ((JioAdView$AdState)object5).length;
                if (n7 == 0) {
                    n4 = 1;
                }
                if ((n7 = n4 ^ 1) == n3) {
                    object5 = this.c.Q();
                    ((com.jio.jioads.util.k)object3).G = (int[])object5;
                }
            }
            object = ((Utility)object).replaceMacros((com.jio.jioads.util.k)object3);
            object5 = "null cannot be cast to non-null type java.util.HashMap<kotlin.String?, kotlin.String?>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String?, kotlin.String?> }";
            Intrinsics.checkNotNull(object2, (String)object5);
            object2 = (HashMap)object2;
            object3 = new Pair(object, object2);
        }
        if (object3 != null) {
            boolean bl3;
            object = (String)((Pair)object3).a;
            this.t = object;
            this.u = object = (HashMap)((Pair)object3).b;
            object = new StringBuilder();
            j_0.n(this.c, (StringBuilder)object, ": inside initWebView in native ad controller ");
            object2 = this.r;
            ((StringBuilder)object).append(object2);
            Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), (String)object4);
            object = JioAds.Companion;
            ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object2 = this.c.k0();
            object3 = JioAdView$AdState.DESTROYED;
            if (object2 != object3) {
                object2 = this.r;
                if (object2 != null) {
                    object2 = new StringBuilder();
                    object3 = this.c;
                    object4 = ": onShowAdView clear web-view";
                    com.jio.jioads.common.l.a((com.jio.jioads.common.b)object3, (StringBuilder)object2, (String)object4, (JioAds$Companion)object);
                    object = this.a;
                    if (object != null) {
                        object2 = this.r;
                        object.removeView((View)object2);
                    }
                    if ((object = this.r) != null) {
                        object2 = object.getParent();
                        bl2 = object2 instanceof ViewGroup;
                        object2 = bl2 ? (ViewGroup)object2 : null;
                        if (object2 != null) {
                            object2.removeView((View)object);
                        }
                        object.clearHistory();
                        object.clearCache(n3 != 0);
                        object2 = "about:blank";
                        object.loadUrl((String)object2);
                        object.destroy();
                    }
                    this.r = null;
                    object = this.i;
                    if (object != null) {
                        ((NativeAdViewRenderer)object).setViewUpdate$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(n3 != 0);
                    }
                }
                if ((bl3 = ((Utility)(object = Utility.INSTANCE)).isWebViewEnabled()) && (object = this.c.Y()) != null) {
                    object2 = new fl2(n3, this, object);
                    com.jio.jioads.util.s.d((Function0)object2);
                }
            }
            if (!(bl3 = (object = this.c).l())) {
                ((V)this.b).o();
                object = this.c;
                object2 = JioAdView$AdState.PREPARED;
                object.j((JioAdView$AdState)((Object)object2));
                object = (V)this.b;
                ((V)object).n();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        Exception exception2;
        Object object;
        Object object2;
        Object object3;
        block7: {
            boolean bl2;
            Object object4;
            Object object5 = "message";
            object3 = "\"";
            object2 = "fre=";
            try {
                object = this.d;
                object4 = Constants$HeaderKeys.X_Jio_IM;
                object4 = ((Constants$HeaderKeys)((Object)object4)).getKey();
                object = (f)object;
                object = ((f)object).a((String)object4);
                object4 = this.c;
                object4 = object4.k0();
                JioAdView$AdState jioAdView$AdState = JioAdView$AdState.DESTROYED;
                if (object4 == jioAdView$AdState) {
                    return;
                }
            }
            catch (Exception exception2) {
                break block7;
            }
            object4 = this.c;
            object4 = object4.Y();
            char c2 = '\"';
            if (object4 != null) {
                Object object6 = com.jio.jioads.util.i.a;
                object6 = this.d;
                boolean bl3 = com.jio.jioads.util.i.l((com.jio.jioads.common.c)object6);
                if (bl3) {
                    object6 = "frt";
                    StringBuilder stringBuilder = new StringBuilder((String)object2);
                    object2 = this.d;
                    object2 = (f)object2;
                    object2 = ((f)object2).j();
                    stringBuilder.append(object2);
                    object2 = "&frt";
                    stringBuilder.append((String)object2);
                    object2 = stringBuilder.toString();
                    stringBuilder = new StringBuilder((String)object3);
                    stringBuilder.append((String)object2);
                    stringBuilder.append(c2);
                    object3 = stringBuilder.toString();
                    object2 = null;
                    object3 = kotlin.text.b.n((String)object, (String)object6, (String)object3, false);
                    object3 = ((String)object3).toString();
                    if (object3 == null) {
                        object3 = "";
                    }
                    object2 = this.c;
                    object2 = object2.P();
                    object = this.d;
                    object = com.jio.jioads.util.i.b((Context)object4, (String)object3, (String)object2, (com.jio.jioads.common.c)object);
                }
            }
            if (bl2 = TextUtils.isEmpty((CharSequence)object)) return;
            object3 = new StringBuilder();
            object2 = this.c;
            object2 = object2.P();
            ((StringBuilder)object3).append((String)object2);
            object2 = ": Impression fired successfully: ";
            ((StringBuilder)object3).append((String)object2);
            ((StringBuilder)object3).append((String)object);
            object3 = ((StringBuilder)object3).toString();
            Intrinsics.checkNotNullParameter(object3, (String)object5);
            object3 = JioAds.Companion;
            object2 = ((JioAds$Companion)object3).getInstance();
            ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object2 = new StringBuilder();
            object4 = this.c;
            object4 = object4.P();
            ((StringBuilder)object2).append((String)object4);
            object4 = ": webViewHandler value : ";
            ((StringBuilder)object2).append((String)object4);
            object4 = this.v;
            ((StringBuilder)object2).append(object4);
            ((StringBuilder)object2).append(c2);
            object2 = ((StringBuilder)object2).toString();
            Intrinsics.checkNotNullParameter(object2, (String)object5);
            object5 = ((JioAds$Companion)object3).getInstance();
            ((JioAds)object5).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object5 = this.v;
            if (object5 == null) return;
            ((x)object5).b((String)object);
            return;
        }
        object3 = new StringBuilder();
        object2 = this.c;
        object = ": Impression not fired for Native HTML ad form fireHTMLTracker(): ";
        j_0.n((com.jio.jioads.common.b)object2, (StringBuilder)object3, (String)object);
        object2 = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c((Utility)object2, exception2, (StringBuilder)object3);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(String var1_1, Map var2_4) {
        block23: {
            block24: {
                block25: {
                    block22: {
                        block21: {
                            var3_5 = new StringBuilder();
                            var4_6 /* !! */  = this.c;
                            var5_7 = ": inside handleJsonResponse()";
                            com.jio.jioads.jioreel.tracker.model.b.a((com.jio.jioads.common.b)var4_6 /* !! */ , (StringBuilder)var3_5, (String)var5_7);
                            try {
                                var3_5 = new JSONObject((String)var1_1 /* !! */ );
                                this.k = var4_6 /* !! */  = new com.jio.jioads.native.parser.a();
                                var5_7 = var4_6 /* !! */  = this.d;
                                var5_7 = (f)var4_6 /* !! */ ;
                                var5_7 = var5_7.a;
                                var6_8 = var5_7.O;
                                var7_9 /* !! */  = "result";
                                if (!var6_8) break block21;
                                if ((var3_5 = var3_5.optJSONObject(var7_9 /* !! */ )) == null) {
                                    var3_5 = new JSONObject();
                                }
                                break block22;
                            }
                            catch (Exception var1_2) {
                                break block23;
                            }
                        }
                        var4_6 /* !! */  = (f)var4_6 /* !! */ ;
                        var4_6 /* !! */  = var4_6 /* !! */ .a;
                        var8_10 = (int)var4_6 /* !! */ .o;
                        if (var8_10 == 0 && (var8_10 = (int)var3_5.isNull(var7_9 /* !! */ )) == 0 && (var3_5 = var3_5.optJSONObject(var7_9 /* !! */ )) == null) {
                            var3_5 = new JSONObject();
                        }
                    }
                    if ((var8_10 = var3_5.length()) == 0) {
                        var1_1 /* !! */  = JioAdError.Companion;
                        var2_4 /* !! */  = JioAdError$JioAdErrorType.ERROR_NOFILL;
                        var1_1 /* !! */ .getClass();
                        var4_6 /* !! */  = t_0.a((JioAdError$JioAdErrorType)var2_4 /* !! */ );
                        var1_1 /* !! */  = "No Ad in Inventory";
                        var4_6 /* !! */ .setErrorDescription$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)var1_1 /* !! */ );
                        var1_1 /* !! */  = this.b;
                        var7_9 /* !! */  = com.jio.jioads.cdnlogging.d.a;
                        var9_11 = "handleJsonResponse";
                        var10_13 = "NativeAdController";
                        var11_15 = "Ad response string is empty from server";
                        var3_5 = var1_1 /* !! */ ;
                        var3_5 = (V)var1_1 /* !! */ ;
                        var12_17 = null;
                        var6_8 = true;
                        var3_5.d((JioAdError)var4_6 /* !! */ , var6_8, (d)var7_9 /* !! */ , var9_11, var10_13, var11_15, null);
                        return;
                    }
                    var4_6 /* !! */  = this.k;
                    if (var4_6 /* !! */  != null) {
                        var5_7 = this.d;
                        var7_9 /* !! */  = "adid";
                        var5_7 = (f)var5_7;
                        var5_7 = var5_7.a(var7_9 /* !! */ );
                        var4_6 /* !! */ .b((String)var5_7, (JSONObject)var3_5);
                    }
                    if (!(var13_19 = (var3_5 = this.c).l())) {
                        var3_5 = new StringBuilder();
                        var4_6 /* !! */  = this.c;
                        var4_6 /* !! */  = var4_6 /* !! */ .P();
                        var3_5.append((String)var4_6 /* !! */ );
                        var4_6 /* !! */  = ": NativeAdController sent callback for onAdReceived for JSON response";
                        var3_5.append((String)var4_6 /* !! */ );
                        var3_5 = var3_5.toString();
                        com.jio.jioads.util.j.a((String)var3_5);
                        var4_6 /* !! */  = var3_5 = this.d;
                        var4_6 /* !! */  = (f)var3_5;
                        var4_6 /* !! */  = var4_6 /* !! */ .a;
                        var8_10 = (int)var4_6 /* !! */ .D;
                        var5_7 = ": Callback onAdReceived()";
                        if (var8_10 == 0) {
                            var3_5 = (f)var3_5;
                            var3_5 = var3_5.a;
                            var13_19 = var3_5.A;
                            if (!var13_19) {
                                var3_5 = new StringBuilder();
                                var4_6 /* !! */  = this.c;
                                var4_6 /* !! */  = var4_6 /* !! */ .P();
                                var3_5.append((String)var4_6 /* !! */ );
                                var3_5.append((String)var5_7);
                                var3_5 = var3_5.toString();
                                com.jio.jioads.util.j.a((String)var3_5);
                                var3_5 = this.c;
                                var4_6 /* !! */  = JioAdView$AdState.RECEIVED;
                                var3_5.j((JioAdView$AdState)var4_6 /* !! */ );
                                var3_5 = this.b;
                                var3_5 = (V)var3_5;
                                var3_5.o();
                            }
                        }
                        var3_5 = this.d;
                        var3_5 = (f)var3_5;
                        var3_5 = var3_5.a;
                        var13_19 = var3_5.A;
                        if (var13_19) {
                            var3_5 = new StringBuilder();
                            var4_6 /* !! */  = this.c;
                            var4_6 /* !! */  = var4_6 /* !! */ .P();
                            var3_5.append((String)var4_6 /* !! */ );
                            var4_6 /* !! */  = ":  Mediation NativeAd so giving onAdPrepared()";
                            var3_5.append((String)var4_6 /* !! */ );
                            var3_5 = var3_5.toString();
                            com.jio.jioads.util.j.a((String)var3_5);
                            var3_5 = this.d;
                            var3_5 = (f)var3_5;
                            var3_5 = var3_5.a;
                            var13_19 = var3_5.o;
                            if (var13_19) {
                                var3_5 = new StringBuilder();
                                var4_6 /* !! */  = this.c;
                                var4_6 /* !! */  = var4_6 /* !! */ .P();
                                var3_5.append((String)var4_6 /* !! */ );
                                var3_5.append((String)var5_7);
                                var3_5 = var3_5.toString();
                                com.jio.jioads.util.j.a((String)var3_5);
                                var3_5 = this.c;
                                var4_6 /* !! */  = JioAdView$AdState.RECEIVED;
                                var3_5.j((JioAdView$AdState)var4_6 /* !! */ );
                                var3_5 = this.b;
                                var3_5 = (V)var3_5;
                                var3_5.o();
                            }
                            var3_5 = new StringBuilder();
                            var4_6 /* !! */  = this.c;
                            var4_6 /* !! */  = var4_6 /* !! */ .P();
                            var3_5.append((String)var4_6 /* !! */ );
                            var4_6 /* !! */  = ": Callback onAdPrepared()";
                            var3_5.append((String)var4_6 /* !! */ );
                            var3_5 = var3_5.toString();
                            com.jio.jioads.util.j.a((String)var3_5);
                            var3_5 = this.c;
                            var4_6 /* !! */  = JioAdView$AdState.PREPARED;
                            var3_5.j((JioAdView$AdState)var4_6 /* !! */ );
                            var3_5 = this.b;
                            var3_5 = (V)var3_5;
                            var3_5.n();
                        }
                    } else {
                        var3_5 = this.d;
                        var3_5 = (f)var3_5;
                        var3_5 = var3_5.a;
                        var13_19 = var3_5.A;
                        if (var13_19) {
                            var3_5 = new StringBuilder();
                            var4_6 /* !! */  = this.c;
                            var4_6 /* !! */  = var4_6 /* !! */ .P();
                            var3_5.append((String)var4_6 /* !! */ );
                            var4_6 /* !! */  = ": callLoadAdAtRefreshTime  onAdRefresh() of NativeMediationAd";
                            var3_5.append((String)var4_6 /* !! */ );
                            var3_5 = var3_5.toString();
                            com.jio.jioads.util.j.a((String)var3_5);
                            var3_5 = this.x;
                            var3_5.f();
                        }
                    }
                    var3_5 = ((f)this.d).a;
                    var13_19 = var3_5.A;
                    if (var13_19 != false) return;
                    var3_5 = this.c;
                    var13_19 = var3_5.X();
                    var8_10 = 0;
                    var4_6 /* !! */  = null;
                    if (!var13_19) {
                        var3_5 = new StringBuilder();
                        var5_7 = this.c;
                        var7_9 /* !! */  = ": Initialize Native ad view renderer class";
                        com.jio.jioads.jioreel.tracker.model.b.a((com.jio.jioads.common.b)var5_7, (StringBuilder)var3_5, var7_9 /* !! */ );
                        var3_5 = this.w;
                        if (var3_5 != null) {
                            var3_5.onDestroy();
                            this.w = null;
                        }
                        this.c((String)var1_1 /* !! */ , (Map)var2_4 /* !! */ );
                        return;
                    }
                    var3_5 = new StringBuilder();
                    var5_7 = this.c;
                    var7_9 /* !! */  = ": Give ad prepared callback for Load custom ad";
                    com.jio.jioads.jioreel.tracker.model.b.a((com.jio.jioads.common.b)var5_7, (StringBuilder)var3_5, var7_9 /* !! */ );
                    var3_5 = this.k;
                    if (var3_5 == null) break block24;
                    var7_9 /* !! */  = new HashMap(var2_4 /* !! */ );
                    var5_7 = new k(this, (com.jio.jioads.native.parser.a)var3_5, (Map)var2_4 /* !! */ );
                    var2_4 /* !! */  = this.c;
                    var14_20 = var2_4 /* !! */ .W();
                    var3_5 = "</vast>";
                    var9_12 = "<vast";
                    var15_21 = true;
                    if (var14_20 != var15_21 || (var2_4 /* !! */  = this.c.K()) != (var11_16 /* !! */  = JioAdView$AD_TYPE.INSTREAM_VIDEO) && (var2_4 /* !! */  = this.c.K()) != (var11_16 /* !! */  = JioAdView$AD_TYPE.INTERSTITIAL) && (var2_4 /* !! */  = this.c.K()) != (var11_16 /* !! */  = JioAdView$AD_TYPE.DYNAMIC_DISPLAY) && (var2_4 /* !! */  = this.c.K()) != (var11_16 /* !! */  = JioAdView$AD_TYPE.INSTREAM_AUDIO)) break block25;
                    if (var1_1 /* !! */  == null || !(var14_20 = var1_1 /* !! */ .length())) ** GOTO lbl-1000
                    var14_20 = false;
                    var2_4 /* !! */  = null;
                    var16_22 = StringsKt.F((CharSequence)var1_1 /* !! */ , (CharSequence)var9_12, false);
                    if (!var16_22 && (!(var16_22 = StringsKt.F((CharSequence)var1_1 /* !! */ , (CharSequence)(var9_12 = "<VAST"), false)) || !(var13_19 = StringsKt.F((CharSequence)var1_1 /* !! */ , (CharSequence)var3_5, false)) && !(var17_23 = StringsKt.F((CharSequence)var1_1 /* !! */ , (CharSequence)(var3_5 = "</VAST>"), false)))) ** GOTO lbl-1000
                    ** GOTO lbl-1000
                }
                var1_1 /* !! */  = this.c.K();
                if (var1_1 /* !! */  != (var2_4 /* !! */  = JioAdView$AD_TYPE.INFEED) && (var17_24 = (var1_1 /* !! */  = this.c).W()) == 0) {
                    var1_1 /* !! */  = this.k;
                    if (var1_1 /* !! */  != null) {
                        var1_1 /* !! */  = var1_1 /* !! */ .H;
                    } else {
                        var17_24 = 0;
                        var1_1 /* !! */  = null;
                    }
                    ** if (var1_1 /* !! */  == null || !(var14_20 = var1_1 /* !! */ .length()) || !(var14_20 = StringsKt.F((CharSequence)var1_1 /* !! */ , (CharSequence)var9_12, (boolean)var15_21)) || (var17_24 = (int)StringsKt.F((CharSequence)var1_1 /* !! */ , (CharSequence)var3_5, (boolean)var15_21)) == 0) goto lbl-1000
                }
                ** GOTO lbl-1000
lbl-1000:
                // 2 sources

                {
                    var9_12 = this.c;
                    var10_14 = this.d;
                    var11_16 /* !! */  = new i((k)var5_7);
                    var12_18 = this.b;
                    var5_7 = var1_1 /* !! */ ;
                    this.j = var1_1 /* !! */  = new com.jio.jioads.instreamads.vastparser.n((HashMap)var7_9 /* !! */ , (com.jio.jioads.common.b)var9_12, var10_14, (c)var11_16 /* !! */ , var12_18);
                    var2_4 /* !! */  = this.k;
                    if (var2_4 /* !! */  == null || (var2_4 /* !! */  = var2_4 /* !! */ .H) == null) {
                        var2_4 /* !! */  = "";
                    }
                    var1_1 /* !! */ .u((String)var2_4 /* !! */ );
                    ** GOTO lbl219
                }
lbl-1000:
                // 4 sources

                {
                    var5_7.invoke(null);
                }
lbl219:
                // 2 sources

                var4_6 /* !! */  = Unit.a;
            }
            if (var4_6 /* !! */  != null) return;
            var1_1 /* !! */  = new StringBuilder();
            var2_4 /* !! */  = this.c;
            var3_5 = ": jioAdParser is null. Cannot proceed with onAdCustomDataReady.";
            com.jio.jioads.jioreel.tracker.model.b.a((com.jio.jioads.common.b)var2_4 /* !! */ , (StringBuilder)var1_1 /* !! */ , (String)var3_5);
            return;
        }
        var2_4 /* !! */  = new StringBuilder();
        j_0.n(this.c, (StringBuilder)var2_4 /* !! */ , ": Getting exception while json parse: ");
        com.jio.jioads.jioreel.tracker.model.b.c(Utility.INSTANCE, var1_2, (StringBuilder)var2_4 /* !! */ );
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var1_3 = JioAds$LogLevel.NONE;
        var1_3 = JioAdError$JioAdErrorType.ERROR_PARSING;
        this.a("jsonParseResponse", "Error on json parsing", (JioAdError$JioAdErrorType)var1_3);
    }

    public final String c() {
        int n3;
        Object object = this.c.m0();
        if (object != null && (n3 = ((String)object).length()) != 0) {
            object = String.valueOf(this.c.m0());
            String[] stringArray = new String[]{"x"};
            object = StringsKt.a0((CharSequence)object, stringArray, false, 0, 6);
            stringArray = new String[]{};
            return object.toArray(stringArray)[1];
        }
        object = new StringBuilder();
        j_0.i(this.c, (StringBuilder)object, ": Maximum Custom Size is not passed");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        return "";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(String string2, Map map2) {
        Exception exception2;
        NativeAdController nativeAdController;
        block13: {
            NativeAdViewRenderer nativeAdViewRenderer;
            int n3;
            Map map3;
            Object object;
            Object object2;
            JioAds$Companion jioAds$Companion;
            Object object3;
            String string3;
            String string4;
            int n4;
            Object object4;
            Object object5;
            block9: {
                block10: {
                    block12: {
                        block11: {
                            nativeAdController = this;
                            object5 = map2;
                            try {
                                object4 = this.c;
                                n4 = object4.l();
                                string4 = "message";
                                if (n4 == 0 || (object4 = this.i) == null) {
                                    string3 = string2;
                                    object4 = new StringBuilder();
                                    object3 = nativeAdController.c;
                                    object3 = object3.P();
                                    ((StringBuilder)object4).append((String)object3);
                                    object3 = ": inside initNativeAdView() creating variable for NativeAdViewRenderer ";
                                    ((StringBuilder)object4).append((String)object3);
                                    object4 = ((StringBuilder)object4).toString();
                                    Intrinsics.checkNotNullParameter(object4, string4);
                                    jioAds$Companion = JioAds.Companion;
                                    object4 = jioAds$Companion.getInstance();
                                    ((JioAds)object4).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                    object4 = JioAds$LogLevel.NONE;
                                    object4 = nativeAdController.g;
                                    if (object4 != null) break block9;
                                    break block10;
                                }
                                object4 = new StringBuilder();
                                Object object6 = this.c;
                                object6 = object6.P();
                                ((StringBuilder)object4).append((String)object6);
                                object6 = ": inside  refresh started: ";
                                ((StringBuilder)object4).append((String)object6);
                                object6 = this.c;
                                boolean bl2 = object6.l();
                                ((StringBuilder)object4).append(bl2);
                                object4 = ((StringBuilder)object4).toString();
                                Intrinsics.checkNotNullParameter(object4, string4);
                                object4 = JioAds.Companion;
                                object6 = ((JioAds$Companion)object4).getInstance();
                                ((JioAds)object6).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                object6 = JioAds$LogLevel.NONE;
                                object6 = new StringBuilder();
                                Object object7 = this.c;
                                object7 = object7.P();
                                ((StringBuilder)object6).append((String)object7);
                                object7 = ": inside  prepare called after refresh: ";
                                ((StringBuilder)object6).append((String)object7);
                                object7 = this.i;
                                ((StringBuilder)object6).append(object7);
                                object6 = ((StringBuilder)object6).toString();
                                Intrinsics.checkNotNullParameter(object6, string4);
                                object4 = ((JioAds$Companion)object4).getInstance();
                                ((JioAds)object4).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                object4 = this.c;
                                n4 = object4.W();
                                if (n4 != 0) break block11;
                                object4 = this.k;
                                if (object4 != null && (object6 = this.i) != null) {
                                    Intrinsics.checkNotNull(object4);
                                    ((NativeAdViewRenderer)object6).updateJioAdParser$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((com.jio.jioads.native.parser.a)object4, map2);
                                }
                                break block12;
                            }
                            catch (Exception exception2) {
                                break block13;
                            }
                        }
                        object4 = this.i;
                        if (object4 != null) {
                            String string5 = string2;
                            ((NativeAdViewRenderer)object4).updateJioAdParserVast$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(map2, string2);
                        }
                    }
                    if ((object5 = nativeAdController.i) == null) return;
                    ((NativeAdViewRenderer)object5).prepareViews$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    return;
                }
                object3 = nativeAdController.c;
                object2 = nativeAdController.b;
                object = nativeAdController.d;
                map3 = this.e();
                nativeAdController.g = object4 = new t((com.jio.jioads.common.b)object3, (com.jio.jioads.controller.a)object2, (com.jio.jioads.common.c)object, map3);
            }
            object3 = nativeAdController.b;
            object2 = nativeAdController.k;
            object = nativeAdController.c;
            com.jio.jioads.common.c c2 = nativeAdController.d;
            object4 = nativeAdController.g;
            if (object4 != null) {
                n3 = n4 = ((t)object4).a();
            } else {
                n4 = 0;
                object4 = null;
                n3 = 0;
                Object var18_34 = null;
            }
            object4 = nativeAdViewRenderer;
            map3 = map2;
            string3 = string2;
            nativeAdViewRenderer = new NativeAdViewRenderer((com.jio.jioads.controller.a)object3, (com.jio.jioads.native.parser.a)object2, (com.jio.jioads.common.b)object, map2, c2, string2, n3);
            object5 = nativeAdController.x;
            nativeAdViewRenderer.initNativeViewListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((com.jio.jioads.native.callbaks.a)object5);
            nativeAdController.i = nativeAdViewRenderer;
            object5 = new StringBuilder();
            object4 = nativeAdController.c;
            object4 = object4.P();
            ((StringBuilder)object5).append((String)object4);
            object4 = ": calling prepareViews() from NativeAdController";
            ((StringBuilder)object5).append((String)object4);
            object5 = ((StringBuilder)object5).toString();
            Intrinsics.checkNotNullParameter(object5, string4);
            object5 = jioAds$Companion.getInstance();
            ((JioAds)object5).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object5 = nativeAdController.i;
            if (object5 == null) return;
            ((NativeAdViewRenderer)object5).prepareViews$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            return;
        }
        Object object = new StringBuilder();
        j_0.n(nativeAdController.c, (StringBuilder)object, ": Exception while creating JioNativeView ");
        Utility utility = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c(utility, exception2, (StringBuilder)object);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
        nativeAdController.a("initNativeAdView", "Exception while creating JioNativeView", (JioAdError$JioAdErrorType)((Object)object));
        Object object8 = nativeAdController.c.k0();
        Object object9 = JioAdView$AdState.DESTROYED;
        if (object8 != object9) {
            object8 = nativeAdController.c.Y();
        } else {
            boolean bl3 = false;
            object8 = null;
        }
        JioAdView$AdState jioAdView$AdState = object8;
        String string6 = nativeAdController.c.P();
        d d2 = com.jio.jioads.cdnlogging.d.a;
        String string7 = ((JioAdError$JioAdErrorType)((Object)object)).getErrorTitle();
        object9 = "exception:";
        object8 = new StringBuilder((String)object9);
        String string8 = com.jio.jioads.instream.audio.a.a(exception2, (StringBuilder)object8);
        com.jio.jioads.cdnlogging.a a2 = ((f)nativeAdController.d).a.T();
        String string9 = nativeAdController.c.q0();
        String string10 = ((JioAdError$JioAdErrorType)((Object)object)).getErrorCode();
        com.jio.jioads.controller.o o3 = ((f)nativeAdController.d).a;
        boolean bl4 = o3.a();
        Boolean bl5 = bl4;
        String string11 = "initNativeAdView";
        utility.logError((Context)jioAdView$AdState, string6, d2, string7, string8, a2, string11, bl5, string9, string10, false);
    }

    public void callPlayAgainFromPublisher() {
        Object object = this.i;
        if (object != null) {
            boolean bl2 = true;
            ((NativeAdViewRenderer)object).playAgainFromPublisher$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(bl2);
        } else {
            object = new StringBuilder();
            com.jio.jioads.common.b b2 = this.c;
            String string2 = ": Native ad not render Properly";
            j_0.i(b2, (StringBuilder)object, string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
    }

    public final String d() {
        int n3;
        Object object = this.c.m0();
        if (object != null && (n3 = ((String)object).length()) != 0) {
            object = String.valueOf(this.c.m0());
            String[] stringArray = new String[]{"x"};
            object = StringsKt.a0((CharSequence)object, stringArray, false, 0, 6);
            stringArray = new String[]{};
            return object.toArray(stringArray)[0];
        }
        object = new StringBuilder();
        j_0.i(this.c, (StringBuilder)object, ": Maximum Custom Size is not passed");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        return "";
    }

    public final HashMap e() {
        return (HashMap)this.h.getValue();
    }

    public final String f() {
        Object object;
        boolean bl2;
        Object object2;
        Object object3;
        Object object4;
        Boolean bl3;
        block11: {
            block10: {
                boolean bl4;
                bl3 = Boolean.FALSE;
                object4 = this.k;
                object3 = null;
                object4 = object4 != null ? ((com.jio.jioads.native.parser.a)object4).p : null;
                object2 = this.i;
                bl2 = false;
                object = null;
                if (object2 != null) {
                    bl4 = ((NativeAdViewRenderer)object2).isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                } else {
                    bl4 = false;
                    object2 = null;
                }
                if (bl4) break block10;
                object2 = this.i;
                if (object2 != null) {
                    bl4 = ((NativeAdViewRenderer)object2).getShouldShowCarousel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                } else {
                    bl4 = false;
                    object2 = null;
                }
                if (!bl4) break block11;
            }
            bl2 = true;
        }
        object2 = bl2;
        object = this.c;
        if (object != null) {
            object = object.a();
        } else {
            bl2 = false;
            object = null;
        }
        Object object5 = this.k;
        String string2 = object5 != null ? ((com.jio.jioads.native.parser.a)object5).o : null;
        String string3 = object5 != null ? ((com.jio.jioads.native.parser.a)object5).b : null;
        String string4 = object5 != null ? ((com.jio.jioads.native.parser.a)object5).l : null;
        if (object5 != null) {
            object3 = ((com.jio.jioads.native.parser.a)object5).f;
        }
        String string5 = object3;
        String string6 = this.c.m0();
        object3 = object2;
        object2 = object;
        object = string2;
        object5 = string3;
        string2 = string4;
        string3 = string5;
        string4 = string6;
        return com.jio.jioads.native.utils.b.a(bl3, (String)object4, (Boolean)object3, (List)object2, (String)object, (String)object5, string2, string5, string6);
    }

    public JioAdView$AdDetails getCurrentAdDetails() {
        String string2;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        int n3;
        Object object7;
        int n4;
        Object object8;
        NativeAdController nativeAdController = this;
        int n7 = 1;
        ArrayList arrayList = this.i;
        Object object9 = null;
        arrayList = arrayList != null ? ((NativeAdViewRenderer)((Object)arrayList)).nativeAdClickTrackersUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() : null;
        Object object10 = nativeAdController.c.b();
        int n8 = 0;
        Object object11 = null;
        if (object10 != null) {
            object8 = new StringBuilder();
            char c2 = object10[0];
            object8.append((int)c2);
            c2 = 'x';
            object8.append(c2);
            n4 = object10[n7];
            object8.append(n4);
            object10 = object8.toString();
            object7 = object10;
        } else {
            object7 = null;
        }
        n4 = this.getTrackNumber();
        int n10 = n4 + 1;
        object10 = (Object)nativeAdController.c.k0();
        object8 = JioAdView$AdState.DESTROYED;
        if (object10 == object8) {
            return null;
        }
        object10 = nativeAdController.c.Y();
        if (arrayList != null && (n3 = arrayList.isEmpty()) == 0) {
            n3 = arrayList.size();
            object6 = new String[n3];
            while (n8 < n3) {
                boolean bl2;
                object5 = new Object();
                ((com.jio.jioads.util.k)object5).p = (Context)object10;
                object4 = (String)arrayList.get(n8);
                ((com.jio.jioads.util.k)object5).a = object4;
                object4 = nativeAdController.c.P();
                ((com.jio.jioads.util.k)object5).q = object4;
                object4 = nativeAdController.s;
                ((com.jio.jioads.util.k)object5).b = object4;
                ((com.jio.jioads.util.k)object5).c = null;
                ((com.jio.jioads.util.k)object5).v = null;
                object4 = n10;
                ((com.jio.jioads.util.k)object5).l = object4;
                object4 = nativeAdController.i;
                if (object4 != null) {
                    bl2 = ((NativeAdViewRenderer)object4).isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object4 = bl2;
                } else {
                    object4 = Boolean.FALSE;
                }
                ((com.jio.jioads.util.k)object5).m = object4;
                ((com.jio.jioads.util.k)object5).n = object4 = Boolean.FALSE;
                object3 = nativeAdController.d;
                object2 = this.e();
                object = nativeAdController.k;
                string2 = object != null ? ((com.jio.jioads.native.parser.a)object).e : null;
                object = object != null ? ((com.jio.jioads.native.parser.a)object).d : null;
                ((com.jio.jioads.util.k)object5).d = object3 = com.jio.jioads.controller.o.o(((f)object3).a, string2, (String)object, (Map)object2);
                ((com.jio.jioads.util.k)object5).e = object3 = Boolean.TRUE;
                ((com.jio.jioads.util.k)object5).f = null;
                ((com.jio.jioads.util.k)object5).o = object4;
                ((com.jio.jioads.util.k)object5).g = object4 = "";
                ((com.jio.jioads.util.k)object5).x = object4;
                ((com.jio.jioads.util.k)object5).h = object4;
                if (object10 != null) {
                    object3 = Utility.INSTANCE;
                    object4 = ((Utility)object3).getCbValue((Context)object10, (String)object4);
                } else {
                    bl2 = false;
                    object4 = null;
                }
                ((com.jio.jioads.util.k)object5).i = object4;
                ((com.jio.jioads.util.k)object5).j = null;
                ((com.jio.jioads.util.k)object5).k = null;
                object4 = Unit.a;
                object4 = Utility.INSTANCE;
                object6[n8] = object5 = ((Utility)object4).replaceMacros((com.jio.jioads.util.k)object5);
                n8 += n7;
            }
            object4 = object6;
        } else {
            boolean bl3 = false;
            object4 = null;
        }
        Object object12 = nativeAdController.k;
        if (object12 != null) {
            object12 = ((com.jio.jioads.native.parser.a)object12).d;
        } else {
            n7 = 0;
            object12 = null;
        }
        if (object12 != null && (n7 = ((String)object12).length()) != 0) {
            object12 = nativeAdController.k;
            if (object12 != null) {
                object12 = ((com.jio.jioads.native.parser.a)object12).e;
            } else {
                n7 = 0;
                object12 = null;
            }
            if (object12 != null && (n7 = ((String)object12).length()) != 0) {
                object10 = nativeAdController.k;
                if (object10 != null) {
                    object10 = ((com.jio.jioads.native.parser.a)object10).d;
                    object11 = object10;
                } else {
                    n8 = 0;
                    object11 = null;
                }
                Intrinsics.checkNotNull(object11);
                object10 = nativeAdController.k;
                if (object10 != null) {
                    object10 = ((com.jio.jioads.native.parser.a)object10).e;
                    object8 = object10;
                } else {
                    n3 = 0;
                    object8 = null;
                }
                Intrinsics.checkNotNull(object8);
                object6 = nativeAdController.c.P();
                object10 = nativeAdController.i;
                object5 = object10 != null ? (object10 = ((NativeAdViewRenderer)object10).getClickUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) : null;
                object10 = nativeAdController.i;
                object3 = object10 != null && (object10 = ((NativeAdViewRenderer)object10).getCTAFallbackUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null ? (object10 = ((Object)StringsKt.m0((CharSequence)object10)).toString()) : null;
                object10 = nativeAdController.i;
                object2 = object10 != null && (object10 = ((NativeAdViewRenderer)object10).getNativeAdClickUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null ? (object10 = ((Object)StringsKt.m0((CharSequence)object10)).toString()) : null;
                object10 = nativeAdController.i;
                if (object10 != null && (object10 = ((NativeAdViewRenderer)object10).getBrandUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
                    object9 = ((Object)StringsKt.m0((CharSequence)object10)).toString();
                }
                object = object9;
                string2 = nativeAdController.s;
                object10 = object12;
                object9 = object12 = new JioAdView$AdDetails((String)object11, (String)object8, (String)object6, (String)object5, (String[])object4, (String)object3, (String)object2, (String)object9, (String)object7, n10, string2, arrayList);
            }
        }
        return object9;
    }

    public ViewGroup getCustomNativeContainer() {
        Object object = ((f)this.d).a;
        boolean bl2 = ((com.jio.jioads.controller.o)object).A;
        if (bl2 && (object = this.w) != null) {
            return ((JioAdMediationController)object).getCustomNativeContainer();
        }
        object = this.i;
        if (object != null) {
            object = ((NativeAdViewRenderer)object).getContainerView();
        } else {
            bl2 = false;
            object = null;
        }
        return object;
    }

    public void handleClick() {
        NativeAdViewRenderer nativeAdViewRenderer = this.i;
        if (nativeAdViewRenderer != null) {
            nativeAdViewRenderer.handleNativeAdClick$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        }
    }

    public void muteVideoAd() {
        super.muteVideoAd();
        NativeAdViewRenderer nativeAdViewRenderer = this.i;
        if (nativeAdViewRenderer != null) {
            boolean bl2 = true;
            nativeAdViewRenderer.mute(bl2);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onAdDataUpdate(String var1_1, Map var2_2) {
        block23: {
            var3_3 = this;
            var4_4 = var2_2;
            var5_7 = 2;
            var6_8 = null;
            var7_9 = 1;
            var8_10 /* !! */  = "message";
            var9_11 = "onAdDataUpdate";
            var10_12 = null;
            try {
                var11_13 = TextUtils.isEmpty((CharSequence)var1_1);
                if (var11_13 != '\u0000') {
                    var4_4 = new StringBuilder();
                    var12_14 /* !! */  = this.c;
                    var12_14 /* !! */  = var12_14 /* !! */ .P();
                    var4_4.append((String)var12_14 /* !! */ );
                    var12_14 /* !! */  = ": No ads in inventory";
                    var4_4.append((String)var12_14 /* !! */ );
                    var4_4 = var4_4.toString();
                    Intrinsics.checkNotNullParameter(var4_4, (String)var8_10 /* !! */ );
                    var4_4 = JioAds.Companion;
                    var4_4 = var4_4.getInstance();
                    var4_4.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var4_4 = JioAds$LogLevel.NONE;
                    var4_4 = JioAdError.Companion;
                    var12_14 /* !! */  = JioAdError$JioAdErrorType.ERROR_NOFILL;
                    var4_4.getClass();
                    var13_18 = t_0.a((JioAdError$JioAdErrorType)var12_14 /* !! */ );
                    var4_4 = "No ads in inventory";
                    var13_18.setErrorDescription$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)var4_4);
                    var4_4 = this.b;
                    var14_20 = com.jio.jioads.cdnlogging.d.a;
                    var15_22 = "onAdDataUpdate";
                    var16_24 = "NativeAdController";
                    var17_26 = "No ads in inventory";
                    var18_28 = var4_4;
                    var18_28 = (V)var4_4;
                    var19_30 = null;
                    var20_32 = true;
                    var18_28.d(var13_18, var20_32, var14_20, var15_22, var16_24, var17_26, null);
                    return;
                }
            }
            catch (Exception var4_5) {
                break block23;
            }
            if (var1_1 == null) {
                return;
            }
            if (var2_2 == null) {
                return;
            }
            var8_10 /* !! */  = new StringBuilder();
            var18_29 /* !! */  = this.c;
            var18_29 /* !! */  = var18_29 /* !! */ .P();
            var8_10 /* !! */ .append((String)var18_29 /* !! */ );
            var18_29 /* !! */  = ": OnAdDataUpdate called in NativeController";
            var8_10 /* !! */ .append((String)var18_29 /* !! */ );
            var8_10 /* !! */  = var8_10 /* !! */ .toString();
            com.jio.jioads.util.j.a((String)var8_10 /* !! */ );
            var8_10 /* !! */  = new StringBuilder();
            var18_29 /* !! */  = this.c;
            var18_29 /* !! */  = var18_29 /* !! */ .P();
            var8_10 /* !! */ .append((String)var18_29 /* !! */ );
            var18_29 /* !! */  = ": Requested AdType = ";
            var8_10 /* !! */ .append((String)var18_29 /* !! */ );
            var18_29 /* !! */  = this.c;
            var18_29 /* !! */  = var18_29 /* !! */ .K();
            var8_10 /* !! */ .append(var18_29 /* !! */ );
            var18_29 /* !! */  = " Value of ResponseType: ";
            var8_10 /* !! */ .append((String)var18_29 /* !! */ );
            var18_29 /* !! */  = this.c;
            var11_13 = var18_29 /* !! */ .W();
            var8_10 /* !! */ .append((int)var11_13);
            var11_13 = ' ';
            var8_10 /* !! */ .append(var11_13);
            var8_10 /* !! */  = var8_10 /* !! */ .toString();
            com.jio.jioads.util.j.a((String)var8_10 /* !! */ );
            var8_10 /* !! */  = this.i;
            if (var8_10 /* !! */  != null) {
                var8_10 /* !! */ .setBooleanVariableValue();
            }
            if ((var21_35 = kotlin.text.b.k(var1_1) ^ var7_9) != var7_9 || (var21_35 = var2_2.isEmpty() ^ var7_9) != var7_9) ** GOTO lbl243
            {
                var8_10 /* !! */  = this.e();
                var8_10 /* !! */ .clear();
                var8_10 /* !! */  = this.e();
                var8_10 /* !! */ .putAll(var4_4);
                var8_10 /* !! */  = var3_3.c;
                var8_10 /* !! */  = var8_10 /* !! */ .K();
                var18_29 /* !! */  = JioAdView$AD_TYPE.DYNAMIC_DISPLAY;
                if (var8_10 /* !! */  != var18_29 /* !! */ ) ** GOTO lbl173
            }
            {
                block24: {
                    block25: {
                        var8_10 /* !! */  = var3_3.c;
                        if ((var8_10 /* !! */  = var8_10 /* !! */ .A()) == null) break block24;
                        var13_19 = var3_3.c;
                        var23_36 = Intrinsics.areEqual(var13_19 = var13_19.y(), var22_34 = Boolean.TRUE);
                        if (var23_36 == '\u0000') break block25;
                        var8_10 /* !! */  = var3_3.c;
                        if ((var8_10 /* !! */  = var8_10 /* !! */ .m0()) != null && (var21_35 = var8_10 /* !! */ .length()) > 0) {
                            var8_10 /* !! */  = var3_3.c;
                            if ((var8_10 /* !! */  = var8_10 /* !! */ .m0()) != null) {
                                var13_19 = "x";
                                var13_19 = new String[]{var13_19};
                                var20_33 = 6;
                                var8_10 /* !! */  = StringsKt.a0((CharSequence)var8_10 /* !! */ , (String[])var13_19, false, 0, var20_33);
                            } else {
                                var21_35 = 0;
                                var8_10 /* !! */  = null;
                            }
                            if (var8_10 /* !! */  != null) {
                                var13_19 = var8_10 /* !! */ .get(0);
                                var13_19 = (String)var13_19;
                                var13_19 = var13_19.toString();
                                var23_36 = Integer.parseInt((String)var13_19);
                                var8_10 /* !! */  = var8_10 /* !! */ .get(var7_9);
                                var8_10 /* !! */  = (String)var8_10 /* !! */ ;
                                var8_10 /* !! */  = var8_10 /* !! */ .toString();
                                var21_35 = Integer.parseInt((String)var8_10 /* !! */ );
                                var22_34 = var3_3.c;
                                var14_21 = new int[]{var23_36, var21_35};
                                var22_34.e0((int[])var14_21);
                                var22_34 = new StringBuilder();
                                var14_21 = var3_3.c;
                                var14_21 = var14_21.P();
                                var22_34.append((String)var14_21);
                                var14_21 = ": onAdDataUpdate: Vertical Ad so considering Device ";
                                var22_34.append((String)var14_21);
                                var22_34.append((int)var23_36);
                                var23_36 = ':';
                                var22_34.append(var23_36);
                                var22_34.append(var21_35);
                                var8_10 /* !! */  = var22_34.toString();
                                com.jio.jioads.util.j.a((String)var8_10 /* !! */ );
                            }
                            break block24;
                        } else {
                            var8_10 /* !! */  = new StringBuilder();
                            var13_19 = var3_3.c;
                            var13_19 = var13_19.P();
                            var8_10 /* !! */ .append((String)var13_19);
                            var13_19 = ": onAdDataUpdate: Vertical Ad so considering Device width and Height";
                            var8_10 /* !! */ .append((String)var13_19);
                            var8_10 /* !! */  = var8_10 /* !! */ .toString();
                            com.jio.jioads.util.j.a((String)var8_10 /* !! */ );
                            var8_10 /* !! */  = Utility.INSTANCE;
                            var13_19 = var3_3.c;
                            var13_19 = var13_19.Y();
                            var8_10 /* !! */  = var8_10 /* !! */ .getScreenHeightAndWidth((Context)var13_19);
                            var13_19 = tp_2.A(var8_10 /* !! */ );
                            var13_19 = (String)var13_19;
                            var23_36 = Integer.parseInt((String)var13_19);
                            var8_10 /* !! */  = tp_2.E(var7_9, var8_10 /* !! */ );
                            var8_10 /* !! */  = (String)var8_10 /* !! */ ;
                            var21_35 = Integer.parseInt((String)var8_10 /* !! */ );
                            var22_34 = var3_3.c;
                            var8_10 /* !! */  = new int[]{var23_36, var21_35};
                            var22_34.e0((int[])var8_10 /* !! */ );
                        }
                        break block24;
                    }
                    var13_19 = var3_3.setDisplayAdSizeToJioAdController$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((ViewGroup)var8_10 /* !! */ );
                    if (var13_19 != null && (var8_10 /* !! */  = (Object[])var3_3.setDisplayAdSizeToJioAdController$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((ViewGroup)var8_10 /* !! */ )) != null) {
                        var13_19 = var3_3.c;
                        var13_19.e0((int[])var8_10 /* !! */ );
                    }
                }
                if ((var21_35 = (var8_10 /* !! */  = var3_3.c).W()) == 0) {
                    var21_35 = 5;
                    var8_10 /* !! */  = new JioAdView$AD_TYPE[var21_35];
                    var8_10 /* !! */ [0] = var13_19 = JioAdView$AD_TYPE.CUSTOM_NATIVE;
                    var8_10 /* !! */ [var7_9] = var13_19 = JioAdView$AD_TYPE.CONTENT_STREAM;
                    var8_10 /* !! */ [var5_7] = var13_19 = JioAdView$AD_TYPE.INFEED;
                    var13_19 = JioAdView$AD_TYPE.INTERSTITIAL;
                    var20_33 = 3;
                    var8_10 /* !! */ [var20_33] = var13_19;
                    var23_36 = '\u0004';
                    var8_10 /* !! */ [var23_36] = var18_29 /* !! */ ;
                    var8_10 /* !! */  = p03_0.f(var8_10 /* !! */ );
                    var13_19 = var3_3.c;
                    var21_35 = (int)CollectionsKt.F((Iterable)var8_10 /* !! */ , var13_19 = var13_19.K());
                    if (var21_35 != 0) {
                        var12_16 /* !! */  = new StringBuilder();
                        var6_8 = var3_3.c;
                        var6_8 = var6_8.P();
                        var12_16 /* !! */ .append((String)var6_8);
                        var6_8 = ": Response Type = JSON ";
                        var12_16 /* !! */ .append((String)var6_8);
                        var12_16 /* !! */  = var12_16 /* !! */ .toString();
                        com.jio.jioads.util.j.a((String)var12_16 /* !! */ );
                        this.b(var1_1, var2_2);
                        return;
                    }
                }
                if ((var21_35 = (var8_10 /* !! */  = var3_3.c).W()) != var5_7) ** GOTO lbl220
                var12_15 = var3_3.c;
                if ((var12_15 = var12_15.K()) == (var8_10 /* !! */  = JioAdView$AD_TYPE.INTERSTITIAL)) ** GOTO lbl-1000
            }
            {
                var12_15 = var3_3.c;
                if ((var12_15 = var12_15.K()) != var18_29 /* !! */ ) ** GOTO lbl220
            }
lbl-1000:
            // 2 sources

            {
                var3_3.l = false;
                var3_3.q = false;
                var12_15 = new StringBuilder();
                var6_8 = var3_3.c;
                var6_8 = var6_8.P();
                var12_15.append((String)var6_8);
                var6_8 = ": Response Type = HTML";
                var12_15.append((String)var6_8);
                var12_15 = var12_15.toString();
                com.jio.jioads.util.j.a((String)var12_15);
                this.a(var1_1, var2_2);
                return;
lbl220:
                // 2 sources

                if ((var5_7 = (var12_15 = var3_3.c).W()) != var7_9) ** GOTO lbl239
                var12_15 = var3_3.c;
                if ((var12_15 = var12_15.K()) == (var6_8 = JioAdView$AD_TYPE.INSTREAM_VIDEO)) ** GOTO lbl-1000
            }
            {
                var12_15 = var3_3.c;
                if ((var12_15 = var12_15.K()) == (var6_8 = JioAdView$AD_TYPE.INTERSTITIAL)) ** GOTO lbl-1000
            }
            {
                var12_15 = var3_3.c;
                if ((var12_15 = var12_15.K()) != var18_29 /* !! */ ) ** GOTO lbl239
            }
lbl-1000:
            // 3 sources

            {
                var12_15 = new StringBuilder();
                var6_8 = var3_3.c;
                var6_8 = var6_8.P();
                var12_15.append((String)var6_8);
                var6_8 = ": Response Type = VAST";
                var12_15.append((String)var6_8);
                var12_15 = var12_15.toString();
                com.jio.jioads.util.j.a((String)var12_15);
                this.c(var1_1, var2_2);
                return;
lbl239:
                // 2 sources

                var4_4 = "Error in loading:Invalid Ad Type";
                var12_15 = JioAdError$JioAdErrorType.ERROR_MISMATCH_AD_TYPE;
                var3_3.a(var9_11, (String)var4_4, (JioAdError$JioAdErrorType)var12_15);
                return;
lbl243:
                // 1 sources

                var4_4 = "Response is null or empty";
                var12_17 = JioAdError$JioAdErrorType.ERROR_PARSING;
                var3_3.a(var9_11, (String)var4_4, var12_17);
                return;
            }
        }
        var12_15 = new StringBuilder();
        j_0.n(var3_3.c, (StringBuilder)var12_15, ": Exception in onAdDataUpdate NativeAdController: ");
        var18_29 /* !! */  = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c((Utility)var18_29 /* !! */ , var4_5, (StringBuilder)var12_15);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var12_15 = JioAds$LogLevel.NONE;
        var12_15 = JioAdError$JioAdErrorType.ERROR_PARSING;
        var3_3.a(var9_11, "Exception in Native Ad onAdDataUpdate", (JioAdError$JioAdErrorType)var12_15);
        var6_8 = var3_3.c.k0();
        var24_37 /* !! */  = JioAdView$AdState.DESTROYED;
        if (var6_8 != var24_37 /* !! */ ) {
            var6_8 = var3_3.c;
            var10_12 = var6_8.Y();
        }
        var13_19 = var10_12;
        var22_34 = var3_3.c.P();
        var14_21 = com.jio.jioads.cdnlogging.d.a;
        var15_23 = var12_15.getErrorTitle();
        var24_37 /* !! */  = "exception:";
        var6_8 = new StringBuilder((String)var24_37 /* !! */ );
        var16_25 = com.jio.jioads.instream.audio.a.a(var4_5, (StringBuilder)var6_8);
        var17_27 = ((f)var3_3.d).a.T();
        var25_38 = var3_3.c.q0();
        var26_39 = var12_15.getErrorCode();
        var4_6 = ((f)var3_3.d).a;
        var27_40 = var4_6.a();
        var28_41 = var27_40;
        var19_31 = "onAdDataUpdate";
        var18_29 /* !! */ .logError(var10_12, (String)var22_34, (d)var14_21, var15_23, var16_25, var17_27, var19_31, var28_41, var25_38, var26_39, false);
    }

    public void onCacheAd() {
        Object object = new StringBuilder();
        j_0.i(this.c, object, ": NativeAdController onCacheAd() called");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }

    public void onCacheMediationAd(JSONObject jSONObject, String string2, Map object) {
        Object object2 = new StringBuilder();
        Object object3 = this.c;
        String string3 = ": NativeAdController onCacheMediationAd() called";
        j_0.i((com.jio.jioads.common.b)object3, (StringBuilder)object2, string3);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        if (object != null) {
            this.e().clear();
            object2 = this.e();
            ((HashMap)object2).putAll(object);
        }
        string3 = this.a;
        com.jio.jioads.controller.a a2 = this.b;
        com.jio.jioads.common.b b2 = this.c;
        com.jio.jioads.common.c c2 = this.d;
        NativeAdController$mediationListener$1 nativeAdController$mediationListener$1 = this.y;
        object3 = object;
        this.w = object = new JioAdMediationController((ViewGroup)string3, a2, b2, c2, nativeAdController$mediationListener$1);
        object2 = this.e();
        ((JioAdMediationController)object).cacheMediationAd(jSONObject, string2, (Map)object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onDestroy() {
        Exception exception2;
        Object object;
        Object object2;
        Object object3;
        block9: {
            long l2;
            Object object4;
            block6: {
                block7: {
                    block8: {
                        object4 = "";
                        object3 = new StringBuilder();
                        object2 = this.c;
                        object = ": Native ad onDestroy called";
                        j_0.i((com.jio.jioads.common.b)object2, (StringBuilder)object3, (String)object);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object3 = JioAds$LogLevel.NONE;
                        try {
                            object3 = this.g;
                            object2 = null;
                            if (object3 == null || (object = ((t)object3).f) == null) break block6;
                            ((a)object).a();
                            object = ((t)object3).f;
                            if (object == null) break block7;
                            Timer timer = ((a)object).e;
                            if (timer == null) break block8;
                            timer.cancel();
                        }
                        catch (Exception exception2) {
                            break block9;
                        }
                    }
                    ((a)object).a = null;
                    ((a)object).e = null;
                    ((a)object).b = null;
                }
                ((t)object3).f = null;
            }
            if ((object3 = this.j) != null) {
                ((com.jio.jioads.instreamads.vastparser.n)object3).t();
            }
            this.j = null;
            object3 = this.w;
            if (object3 != null) {
                ((JioAdMediationController)object3).onDestroy();
                this.w = null;
            }
            object3 = null;
            this.l = false;
            this.q = false;
            object = this.e;
            if (object != null) {
                object.cancel();
            }
            this.e = null;
            object = this.i;
            if (object != null) {
                ((NativeAdViewRenderer)object).onDestroy$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            }
            this.i = null;
            this.m = false;
            this.o = false;
            this.f = l2 = 0L;
            this.s = object4;
            this.t = object4;
            object4 = this.u;
            ((HashMap)object4).clear();
            object4 = this.v;
            if (object4 == null) return;
            this.v = null;
            return;
        }
        object3 = new StringBuilder();
        object2 = this.c;
        object = ": Exception while destroying NativeAdController: ";
        j_0.n((com.jio.jioads.common.b)object2, (StringBuilder)object3, (String)object);
        object2 = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c((Utility)object2, exception2, (StringBuilder)object3);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }

    /*
     * Enabled aggressive block sorting
     */
    public View onShowAdView() {
        block64: {
            Object object;
            Object object2;
            Object object3;
            block56: {
                Object object4;
                block58: {
                    boolean bl2;
                    Object object5;
                    String string2;
                    boolean bl3;
                    block60: {
                        block61: {
                            block62: {
                                int n3;
                                boolean bl4;
                                block63: {
                                    boolean bl5;
                                    String string3;
                                    String string4;
                                    Object object6;
                                    boolean bl6;
                                    block59: {
                                        block57: {
                                            object3 = new StringBuilder();
                                            com.jio.jioads.jioreel.tracker.model.b.a(this.c, (StringBuilder)object3, ": Inside NativeAdController onShowAdView()");
                                            object3 = this.p;
                                            object2 = "HTML";
                                            bl3 = Intrinsics.areEqual(object3, object2);
                                            string2 = "VAST";
                                            object5 = "JSON";
                                            bl6 = 2 != 0;
                                            object4 = null;
                                            bl2 = true;
                                            if (bl3 && (bl3 = (object3 = this.c).W()) == bl6 || (bl3 = (boolean)Intrinsics.areEqual(object3 = this.p, object2)) && !(bl3 = (object3 = this.c).W()) || (bl3 = (boolean)Intrinsics.areEqual(object3 = this.p, object2)) && (bl3 = (object3 = this.c).W()) == bl2) {
                                                object3 = new StringBuilder();
                                                object = this.c;
                                                object6 = ": onShowAdView clear web-view ";
                                                j_0.n((com.jio.jioads.common.b)object, (StringBuilder)object3, (String)object6);
                                                object = this.p;
                                                ((StringBuilder)object3).append((String)object);
                                                com.jio.jioads.util.j.a(((StringBuilder)object3).toString());
                                                object3 = new o(this);
                                                com.jio.jioads.util.s.d((Function0)object3);
                                            } else {
                                                object3 = this.c;
                                                bl3 = object3.W();
                                                if (bl3 == bl2) {
                                                    object3 = this.a;
                                                    if (object3 != null) {
                                                        object3.removeAllViews();
                                                    }
                                                } else {
                                                    object3 = this.c;
                                                    bl3 = object3.W();
                                                    if (bl3 == bl6 && (bl3 = (boolean)Intrinsics.areEqual(object3 = this.p, object5))) {
                                                        object3 = this.i;
                                                        if (object3 != null) {
                                                            object3 = new StringBuilder();
                                                            object = this.c;
                                                            object6 = ": HTML ad loading and jioNativeAdView is not null so clear all data in Type JSON ";
                                                            com.jio.jioads.jioreel.tracker.model.b.a((com.jio.jioads.common.b)object, (StringBuilder)object3, (String)object6);
                                                            object3 = this.i;
                                                            if (object3 != null) {
                                                                ((NativeAdViewRenderer)object3).clearAllData$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                            }
                                                            this.i = null;
                                                        }
                                                        if ((object3 = this.a) != null) {
                                                            object3.removeAllViews();
                                                        }
                                                    } else {
                                                        object3 = this.c;
                                                        bl3 = object3.W();
                                                        if (bl3 == bl6 && (bl3 = (boolean)Intrinsics.areEqual(object3 = this.p, string2))) {
                                                            object3 = this.i;
                                                            if (object3 != null) {
                                                                object3 = new StringBuilder();
                                                                object = this.c;
                                                                object6 = ": HTML ad loading and jioNativeAdView is not null so clear all data type VAST";
                                                                com.jio.jioads.jioreel.tracker.model.b.a((com.jio.jioads.common.b)object, (StringBuilder)object3, (String)object6);
                                                                object3 = this.i;
                                                                if (object3 != null) {
                                                                    ((NativeAdViewRenderer)object3).clearAllData$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                }
                                                                this.i = null;
                                                            }
                                                            if ((object3 = this.a) != null) {
                                                                object3.removeAllViews();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            this.a();
                                            object3 = this.a;
                                            object = "onShowAdView";
                                            if (object3 == null) break block56;
                                            object3 = new StringBuilder();
                                            j_0.n(this.c, (StringBuilder)object3, ": Check response type value: ");
                                            object6 = this.c;
                                            int n4 = object6.W();
                                            ((StringBuilder)object3).append(n4);
                                            com.jio.jioads.util.j.a(((StringBuilder)object3).toString());
                                            object3 = ((f)this.d).a;
                                            n4 = (int)(((com.jio.jioads.controller.o)object3).A ? 1 : 0);
                                            bl4 = false;
                                            string4 = "";
                                            if (n4 == 0 || (object3 = ((com.jio.jioads.controller.o)object3).H) == null) break block57;
                                            object3 = this.a;
                                            if (object3 != null) {
                                                object3.removeAllViews();
                                            }
                                            if ((object3 = this.w) != null) {
                                                com.jio.jioads.common.d.pauseAd$default((com.jio.jioads.common.d)object3, false, (int)(bl2 ? 1 : 0), null);
                                            }
                                            if ((object3 = this.a) != null) {
                                                object2 = ((f)this.d).a.H;
                                                object3.addView((View)object2);
                                            }
                                            if ((object3 = this.g) != null) {
                                                object3 = ((t)object3).f;
                                                if (object3 != null) {
                                                    bl4 = ((a)object3).f;
                                                }
                                                if (!bl4) {
                                                    this.a();
                                                }
                                            }
                                            if ((object3 = this.g) != null) {
                                                ((t)object3).d();
                                            }
                                            if (bl3 = (boolean)(object3 = this.c).l()) {
                                                object3 = new StringBuilder();
                                                object2 = this.c;
                                                String string5 = ": Giving onAdRefresh callback for dynamic display ad mediation ad";
                                                j_0.i((com.jio.jioads.common.b)object2, (StringBuilder)object3, string5);
                                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                object3 = JioAds$LogLevel.NONE;
                                                object3 = this.x;
                                                ((n)object3).a(string4);
                                            } else {
                                                object3 = new StringBuilder();
                                                object2 = this.c;
                                                String string6 = ": Giving onAdRender callback for dynamic display ad mediation ad";
                                                j_0.i((com.jio.jioads.common.b)object2, (StringBuilder)object3, string6);
                                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                object3 = JioAds$LogLevel.NONE;
                                                object3 = this.x;
                                                ((n)object3).b(string4);
                                            }
                                            object4 = Unit.a;
                                            break block58;
                                        }
                                        object3 = this.c;
                                        bl3 = object3.W();
                                        object6 = " ";
                                        if (bl3) break block59;
                                        object3 = new StringBuilder((String)object6);
                                        object2 = this.c;
                                        String string7 = ": Native onShowAdView: response-type JSON";
                                        com.jio.jioads.jioreel.tracker.model.b.a((com.jio.jioads.common.b)object2, (StringBuilder)object3, string7);
                                        object3 = this.a;
                                        if (object3 != null) {
                                            object3.removeAllViews();
                                        }
                                        object3 = ((f)this.d).a;
                                        bl3 = ((com.jio.jioads.controller.o)object3).A;
                                        if (bl3) {
                                            object3 = new StringBuilder((String)object6);
                                            object2 = this.c;
                                            String string8 = ": onShowAdView mediation call: ";
                                            j_0.n((com.jio.jioads.common.b)object2, (StringBuilder)object3, string8);
                                            object2 = this.a;
                                            ((StringBuilder)object3).append(object2);
                                            com.jio.jioads.util.j.a(((StringBuilder)object3).toString());
                                            object3 = this.a;
                                            if (object3 != null && (object2 = this.w) != null) {
                                                Intrinsics.checkNotNull(object3);
                                                ((JioAdMediationController)object2).setParentContainer((ViewGroup)object3);
                                            }
                                            if ((object3 = this.w) != null) {
                                                object4 = ((JioAdMediationController)object3).onShowAdView();
                                            }
                                            break block58;
                                        } else {
                                            object3 = this.i;
                                            if (object3 == null) {
                                                object3 = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
                                                this.a((String)object, "JioNativeAdView object is null", (JioAdError$JioAdErrorType)((Object)object3));
                                                return null;
                                            }
                                            object2 = this.a;
                                            if (object2 != null) {
                                                Intrinsics.checkNotNull(object2);
                                                ((NativeAdViewRenderer)object3).loadNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((ViewGroup)object2, bl2);
                                            } else {
                                                object3 = new StringBuilder();
                                                object2 = this.c;
                                                String string9 = ": adContainer is null inside onShowAdView() type Json";
                                                com.jio.jioads.jioreel.tracker.model.b.a((com.jio.jioads.common.b)object2, (StringBuilder)object3, string9);
                                            }
                                            this.p = object5;
                                            object4 = Unit.a;
                                        }
                                        break block58;
                                    }
                                    object3 = this.c;
                                    bl3 = object3.W();
                                    if (bl3 != bl6) break block60;
                                    object3 = new StringBuilder((String)object6);
                                    com.jio.jioads.common.b b2 = this.c;
                                    object5 = ": Native onShowAdView: response-type HTML";
                                    com.jio.jioads.jioreel.tracker.model.b.a(b2, (StringBuilder)object3, (String)object5);
                                    object3 = this.c.K();
                                    JioAdView$AD_TYPE jioAdView$AD_TYPE = JioAdView$AD_TYPE.DYNAMIC_DISPLAY;
                                    if (object3 != jioAdView$AD_TYPE || !(bl3 = StringsKt.F((CharSequence)(object3 = this.t), string3 = "html", bl2))) break block61;
                                    object3 = new StringBuilder();
                                    com.jio.jioads.common.b b3 = this.c;
                                    object5 = ": setWebView adContainer value is : ";
                                    j_0.n(b3, (StringBuilder)object3, (String)object5);
                                    ViewGroup viewGroup = this.a;
                                    ((StringBuilder)object3).append(viewGroup);
                                    com.jio.jioads.util.j.a(((StringBuilder)object3).toString());
                                    object3 = this.a;
                                    if (object3 == null) break block62;
                                    object3 = new StringBuilder();
                                    com.jio.jioads.common.b b4 = this.c;
                                    object5 = ": webView value is COUNT: ";
                                    j_0.n(b4, (StringBuilder)object3, (String)object5);
                                    ViewGroup viewGroup2 = this.a;
                                    if (viewGroup2 != null) {
                                        n3 = viewGroup2.getChildCount();
                                        object4 = n3;
                                    }
                                    ((StringBuilder)object3).append(object4);
                                    com.jio.jioads.util.j.a(((StringBuilder)object3).toString());
                                    object3 = new q(this);
                                    com.jio.jioads.util.s.d((Function0)object3);
                                    object3 = this.c;
                                    bl3 = object3.l();
                                    if (bl3) {
                                        object3 = new StringBuilder();
                                        com.jio.jioads.common.b b5 = this.c;
                                        object5 = ": Giving onAdRefresh callback for dynamic display ad";
                                        com.jio.jioads.jioreel.tracker.model.b.a(b5, (StringBuilder)object3, (String)object5);
                                        object3 = this.x;
                                        ((n)object3).a(string4);
                                    } else {
                                        object3 = new StringBuilder();
                                        com.jio.jioads.common.b b7 = this.c;
                                        object5 = ": Giving onAdRender callback for dynamic display ad";
                                        com.jio.jioads.jioreel.tracker.model.b.a(b7, (StringBuilder)object3, (String)object5);
                                        object3 = this.x;
                                        ((n)object3).b(string4);
                                    }
                                    object3 = new StringBuilder();
                                    com.jio.jioads.common.b b10 = this.c;
                                    object5 = ": Value in adContainer is: ";
                                    j_0.n(b10, (StringBuilder)object3, (String)object5);
                                    ViewGroup viewGroup3 = this.a;
                                    ((StringBuilder)object3).append(viewGroup3);
                                    String string10 = " and wasWebImpressionFired is ";
                                    ((StringBuilder)object3).append(string10);
                                    n3 = (int)(this.l ? 1 : 0);
                                    ((StringBuilder)object3).append(n3 != 0);
                                    ((StringBuilder)object3).append(' ');
                                    com.jio.jioads.util.j.a(((StringBuilder)object3).toString());
                                    object3 = this.a;
                                    n3 = 5;
                                    if (object3 != null) {
                                        object3 = new StringBuilder();
                                        j_0.n(this.c, (StringBuilder)object3, ": Value in checkVisibility is: ");
                                        object5 = Utility.INSTANCE;
                                        ViewGroup viewGroup4 = this.a;
                                        Intrinsics.checkNotNull(viewGroup4);
                                        bl5 = ((Utility)object5).checkVisibility(viewGroup4, n3);
                                        ((StringBuilder)object3).append(bl5);
                                        object3 = ((StringBuilder)object3).toString();
                                        com.jio.jioads.util.j.a((String)object3);
                                    }
                                    if ((object3 = this.a) == null || (bl5 = this.l)) break block63;
                                    object5 = Utility.INSTANCE;
                                    Intrinsics.checkNotNull(object3);
                                    bl3 = ((Utility)object5).checkVisibility((ViewGroup)object3, n3);
                                    if (!bl3) break block63;
                                    object3 = this.g;
                                    if (object3 != null) {
                                        ((t)object3).c();
                                    }
                                    if ((object3 = this.g) != null) {
                                        ((t)object3).d();
                                    }
                                    if (bl3 = this.q) {
                                        this.b();
                                        object3 = this.d;
                                        String string11 = Constants$HeaderKeys.X_Jio_VIM.getKey();
                                        object3 = ((f)object3).a(string11);
                                        n3 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
                                        if (n3 == 0) {
                                            j j3 = new j(this, (String)object3);
                                            j3.start();
                                        }
                                        object3 = this.d;
                                        String string12 = com.jio.jioads.utils.e.d(this.e());
                                        object3 = (f)object3;
                                        object3.getClass();
                                        Intrinsics.checkNotNullParameter(string12, "campaignid");
                                        object5 = "i";
                                        String string13 = "type";
                                        Intrinsics.checkNotNullParameter(object5, string13);
                                        object3 = ((f)object3).a;
                                        ((com.jio.jioads.controller.o)object3).v(string12, (String)object5);
                                        this.l = bl2;
                                    }
                                    break block61;
                                }
                                if (!(bl3 = this.l)) break block61;
                                object3 = Utility.INSTANCE;
                                object5 = this.a;
                                Intrinsics.checkNotNull(object5);
                                bl3 = ((Utility)object3).checkVisibility((ViewGroup)object5, n3);
                                if (!bl3 || (object3 = this.a) == null || (object3 = this.g) == null) break block61;
                                object3 = ((t)object3).f;
                                if (object3 != null) {
                                    bl4 = ((a)object3).f;
                                }
                                if ((bl3 = bl4 ^ true) && !(bl3 = (object3 = this.c).l())) {
                                    object3 = new StringBuilder();
                                    com.jio.jioads.common.b b11 = this.c;
                                    object5 = " : start Refresh timer as wasWebImpressionFired is true.";
                                    com.jio.jioads.jioreel.tracker.model.b.a(b11, (StringBuilder)object3, (String)object5);
                                    object3 = this.g;
                                    if (object3 != null) {
                                        ((t)object3).c();
                                    }
                                    if ((object3 = this.g) != null) {
                                        ((t)object3).d();
                                    }
                                }
                                break block61;
                            }
                            object3 = new StringBuilder();
                            String string14 = this.c.P();
                            ((StringBuilder)object3).append(string14);
                            ((StringBuilder)object3).append(": adContainer not set proper Html ad issue ");
                            com.jio.jioads.util.j.b(((StringBuilder)object3).toString());
                            object3 = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
                            String string15 = "initWebView";
                            object5 = "AdContainer is null for HTML Ad";
                            this.a(string15, (String)object5, (JioAdError$JioAdErrorType)((Object)object3));
                        }
                        this.p = object2;
                        object4 = Unit.a;
                        break block58;
                    }
                    object3 = this.c;
                    bl3 = object3.W();
                    if (bl3 == bl2 && ((object3 = this.c.K()) == (object2 = JioAdView$AD_TYPE.INSTREAM_VIDEO) || (object3 = this.c.K()) == (object2 = JioAdView$AD_TYPE.INTERSTITIAL) || (object3 = this.c.K()) == (object2 = JioAdView$AD_TYPE.DYNAMIC_DISPLAY))) {
                        object3 = new StringBuilder();
                        object2 = this.c;
                        object5 = ": Native onShowAdView: response-type VAST :";
                        j_0.n((com.jio.jioads.common.b)object2, (StringBuilder)object3, (String)object5);
                        object2 = this.a;
                        ((StringBuilder)object3).append(object2);
                        com.jio.jioads.util.j.a(((StringBuilder)object3).toString());
                        object3 = this.a;
                        if (object3 != null) {
                            object3.removeAllViews();
                        }
                        if ((object3 = this.i) != null) {
                            ((NativeAdViewRenderer)object3).setViewUpdate$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(bl2);
                        }
                        object3 = this.a;
                        if (object3 != null) {
                            object2 = this.i;
                            if (object2 != null) {
                                Intrinsics.checkNotNull(object3);
                                ((NativeAdViewRenderer)object2).loadNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((ViewGroup)object3, bl2);
                            }
                        } else {
                            object3 = new StringBuilder();
                            object2 = this.c;
                            object5 = ": adContainer is null inside onShowAdView() type Vast ";
                            com.jio.jioads.jioreel.tracker.model.b.a((com.jio.jioads.common.b)object2, (StringBuilder)object3, (String)object5);
                        }
                        this.p = string2;
                        object4 = Unit.a;
                    } else {
                        object3 = new StringBuilder();
                        object2 = this.c.P();
                        ((StringBuilder)object3).append((String)object2);
                        object2 = ": else ";
                        ((StringBuilder)object3).append((String)object2);
                        object3 = ((StringBuilder)object3).toString();
                        com.jio.jioads.util.j.b((String)object3);
                        object4 = Unit.a;
                    }
                }
                if (object4 != null) break block64;
            }
            object3 = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
            object2 = "Error in loading: adContainer is null  loadNativeViewFromNativeAd";
            this.a((String)object, (String)object2, (JioAdError$JioAdErrorType)((Object)object3));
            object3 = Unit.a;
        }
        return this.a;
    }

    public void pauseAd(boolean bl2) {
        Object object = new StringBuilder();
        com.jio.jioads.common.b b2 = this.c;
        String string2 = ": Native ad pauseAd called";
        j_0.i(b2, (StringBuilder)object, string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.w;
        if (object != null) {
            b2 = null;
            string2 = null;
            int n3 = 1;
            com.jio.jioads.common.d.pauseAd$default((com.jio.jioads.common.d)object, false, n3, null);
        }
        if ((object = this.g) != null) {
            ((t)object).c();
        }
        if ((object = this.i) != null) {
            ((NativeAdViewRenderer)object).pause$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        }
    }

    public void resumeAd(boolean n3) {
        String string2;
        boolean bl2;
        Object object = new StringBuilder();
        com.jio.jioads.common.b b2 = this.c;
        j_0.i(b2, (StringBuilder)object, ": Native ad resumeAd called");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.w;
        int n4 = 1;
        int n7 = 0;
        Object object2 = null;
        if (object != null) {
            bl2 = false;
            string2 = null;
            com.jio.jioads.common.d.resumeAd$default((com.jio.jioads.common.d)object, false, n4, null);
        }
        if ((n3 = (object = this.c).p()) == 0 && (object = this.g) != null && !(bl2 = ((t)object).e) && (object = ((t)object).f) != null) {
            bl2 = ((a)object).i;
            if (bl2) {
                ((a)object).i = false;
            }
            ((a)object).c();
        }
        if ((object = this.i) != null) {
            ((NativeAdViewRenderer)object).resume$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        }
        if ((n3 = this.l) == 0) {
            object = ((f)this.d).a;
            n3 = ((com.jio.jioads.controller.o)object).A;
            if (n3 == 0 && (object = this.c.K()) == (object2 = JioAdView$AD_TYPE.DYNAMIC_DISPLAY) && (n3 = (object = this.c).W()) == (n7 = 2)) {
                object = this.g;
                if (object != null) {
                    ((t)object).c();
                }
                if ((object = this.g) != null) {
                    ((t)object).d();
                }
                if ((n3 = (int)(this.q ? 1 : 0)) != 0) {
                    this.b();
                    object = this.d;
                    object2 = Constants$HeaderKeys.X_Jio_VIM.getKey();
                    object = ((f)object).a((String)object2);
                    n7 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
                    if (n7 == 0) {
                        object2 = new j(this, (String)object);
                        object2.start();
                    }
                    object = this.d;
                    object2 = com.jio.jioads.utils.e.d(this.e());
                    object = (f)object;
                    object.getClass();
                    Intrinsics.checkNotNullParameter(object2, "campaignid");
                    string2 = "i";
                    String string3 = "type";
                    Intrinsics.checkNotNullParameter(string2, string3);
                    object = ((f)object).a;
                    ((com.jio.jioads.controller.o)object).v((String)object2, string2);
                    this.l = n4;
                }
            }
        }
    }

    public final int[] setDisplayAdSizeToJioAdController$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(ViewGroup object) {
        int n3;
        int n4;
        Object object2;
        Object object3;
        int n7;
        int n8;
        int n10;
        block26: {
            Object object4;
            Object object5;
            Exception exception2;
            block29: {
                block28: {
                    block27: {
                        n10 = 1;
                        n8 = 0;
                        n7 = 2;
                        try {
                            object3 = this.d;
                            object2 = "wh";
                        }
                        catch (Exception exception2) {}
                        object3 = (f)object3;
                        object3 = ((f)object3).a((String)object2);
                        object2 = this.c;
                        n4 = object2.W();
                        if (n4 != n7) break block26;
                        n4 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
                        if (n4 != 0) break block26;
                        n4 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
                        if (n4 != 0) break block27;
                        n4 = 120;
                        object5 = new char[n10];
                        object5[0] = n4;
                        object5 = StringsKt.Z((CharSequence)object3, (char[])object5);
                        object5 = object5.get(0);
                        object5 = (String)object5;
                        int n14 = Integer.parseInt((String)object5);
                        object4 = new char[n10];
                        object4[0] = n4;
                        object3 = StringsKt.Z((CharSequence)object3, (char[])object4);
                        object3 = object3.get(n10);
                        object3 = (String)object3;
                        n3 = Integer.parseInt((String)object3);
                        object = new int[]{n14, n3};
                        break block28;
                        break block29;
                    }
                    boolean bl2 = false;
                    float f5 = 0.0f;
                    object = null;
                }
                return object;
            }
            object2 = new StringBuilder();
            object5 = this.c;
            object4 = ": issue in translating display ad-size value coming from server: ";
            j_0.n((com.jio.jioads.common.b)object5, (StringBuilder)object2, (String)object4);
            object5 = Utility.INSTANCE;
            com.jio.jioads.jioreel.tracker.model.b.c((Utility)object5, exception2, (StringBuilder)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = JioAds$LogLevel.NONE;
        }
        if ((n3 = ((String)(object3 = this.c())).length()) > 0 && (n3 = Integer.parseInt((String)(object3 = this.d()))) >= (n4 = 250) && (n3 = Integer.parseInt((String)(object3 = this.c()))) >= n4) {
            object = new int[n7];
            n7 = Integer.parseInt(this.d());
            object[0] = n7;
            String string2 = this.c();
            n7 = Integer.parseInt(string2);
            object[n10] = n7;
        } else {
            object3 = this.f();
            n3 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
            if (n3 == 0) {
                object = this.f();
                object3 = new String[]{"x"};
                n4 = 6;
                object = StringsKt.a0((CharSequence)object, (String[])object3, false, 0, n4);
                object3 = (String)object.get(0);
                float f6 = Float.parseFloat((String)object3);
                object2 = Utility.INSTANCE;
                n3 = ((Utility)object2).convertDpToPixel(f6);
                float f7 = Float.parseFloat((String)object.get(n10));
                int n15 = ((Utility)object2).convertDpToPixel(f7);
                int[] nArray = new int[n7];
                nArray[0] = n3;
                nArray[n10] = n15;
                object = nArray;
            } else {
                String string3 = Constants$DynamicDisplaySize.SIZE_970x250.getDynamicSize();
                Intrinsics.checkNotNull(object);
                object3 = this.c;
                object = com.jio.jioads.native.utils.b.b(string3, object, (com.jio.jioads.common.b)object3);
            }
        }
        if (object != null) {
            n7 = Utility.convertPixelsToDp((int)object[0]);
            object[0] = n7;
            n8 = Utility.convertPixelsToDp((int)object[n10]);
            object[n10] = n8;
        }
        return object;
    }

    public void setParentContainer(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "adContainer");
        Object object = ((f)this.d).a;
        boolean bl2 = ((com.jio.jioads.controller.o)object).A;
        if (bl2 && (object = this.w) != null) {
            ((JioAdMediationController)object).setParentContainer(viewGroup);
        }
        this.a = viewGroup;
    }

    public final void stopViewableImpressionTimer$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        Object object = this.x.a.e;
        if (object != null) {
            object = this.x.a.e;
            if (object != null) {
                object.cancel();
            }
            object = this.x.a;
            com.jio.jioads.common.b b2 = null;
            ((NativeAdController)object).e = null;
            object = this.z;
            if (object != null) {
                object.cancel();
            }
            this.z = null;
            object = new StringBuilder();
            b2 = this.c;
            String string2 = ": removing viewable timer";
            j_0.i(b2, (StringBuilder)object, string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
    }

    public void unmuteVideoAd() {
        super.unmuteVideoAd();
        NativeAdViewRenderer nativeAdViewRenderer = this.i;
        if (nativeAdViewRenderer != null) {
            boolean bl2 = true;
            nativeAdViewRenderer.unMute(bl2);
        }
    }
}

