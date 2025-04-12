/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  com.google.ads.interactivemedia.v3.api.AdDisplayContainer
 *  com.google.ads.interactivemedia.v3.api.AdErrorEvent
 *  com.google.ads.interactivemedia.v3.api.AdErrorEvent$AdErrorListener
 *  com.google.ads.interactivemedia.v3.api.AdEvent
 *  com.google.ads.interactivemedia.v3.api.AdEvent$AdEventListener
 *  com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType
 *  com.google.ads.interactivemedia.v3.api.AdsLoader
 *  com.google.ads.interactivemedia.v3.api.AdsLoader$AdsLoadedListener
 *  com.google.ads.interactivemedia.v3.api.AdsManager
 *  com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent
 *  com.google.ads.interactivemedia.v3.api.AdsRenderingSettings
 *  com.google.ads.interactivemedia.v3.api.AdsRequest
 *  com.google.ads.interactivemedia.v3.api.ImaSdkFactory
 *  com.google.ads.interactivemedia.v3.api.ImaSdkSettings
 *  com.google.ads.interactivemedia.v3.api.player.AdMediaInfo
 *  com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
 */
package com.jioads.mediation.partners.videoutils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.AdsLoader;
import com.google.ads.interactivemedia.v3.api.AdsManager;
import com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.ImaSdkFactory;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.common.b;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.k;
import com.jio.jioads.videomodule.s;
import com.jioads.mediation.partners.JioMediationListener;
import com.jioads.mediation.partners.videoutils.JioMediationVideoController$WhenMappings;
import com.jioads.mediation.partners.videoutils.JioMediationVideoController$requestAds$1$4;
import com.jioads.mediation.partners.videoutils.JioMediationVideoController$setVideoPlayer$1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class JioMediationVideoController
implements AdErrorEvent.AdErrorListener,
AdsLoader.AdsLoadedListener,
AdEvent.AdEventListener {
    public boolean a;
    public boolean b;
    public boolean c;
    public JioMediationVideoController$requestAds$1$4 d;
    public AdMediaInfo e;
    public boolean f;
    public boolean g;
    public s h;
    public FrameLayout i;
    public boolean j;
    public ImaSdkFactory k;
    public AdsManager l;
    public AdsLoader m;
    public String n;
    public final b o;
    public final JioMediationListener p;
    public final ArrayList q;

    public JioMediationVideoController(JioMediationListener arrayList, JioAdView object, String string2) {
        Intrinsics.checkNotNullParameter(arrayList, "customListener");
        Intrinsics.checkNotNullParameter(object, "jioAdView");
        Intrinsics.checkNotNullParameter(string2, "adTagUrl");
        this.n = string2;
        this.o = object = ((JioAdView)object).getIjioAdView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        this.p = arrayList;
        this.q = arrayList = new ArrayList(1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void a(JioMediationVideoController jioMediationVideoController) {
        Object object;
        Object object2;
        int n3;
        Object object3;
        ImaSdkFactory imaSdkFactory;
        Object object4;
        Object object5;
        block23: {
            block22: {
                String string2;
                String string3;
                object5 = "this$0";
                Intrinsics.checkNotNullParameter(jioMediationVideoController, (String)object5);
                try {
                    object5 = new k();
                    object4 = jioMediationVideoController.o;
                    imaSdkFactory = null;
                    object4 = object4 != null ? object4.Y() : null;
                    ((k)object5).p = object4;
                    object4 = jioMediationVideoController.o;
                    object4 = object4 != null ? object4.P() : null;
                    ((k)object5).q = object4;
                    ((k)object5).a = object4 = jioMediationVideoController.n;
                    object4 = Utility.INSTANCE;
                    object3 = jioMediationVideoController.o;
                    if (object3 != null) {
                        object3 = object3.P();
                    } else {
                        n3 = 0;
                        object3 = null;
                    }
                    ((k)object5).b = object3 = ((Utility)object4).getCcbValue((String)object3);
                    object3 = jioMediationVideoController.o;
                    object2 = "";
                    object = null;
                    if (object3 == null || (object3 = object3.Y()) == null) break block22;
                    string3 = "context";
                    Intrinsics.checkNotNullParameter(object3, string3);
                    string3 = "common_prefs";
                    string2 = "advid";
                }
                catch (Exception exception) {
                    return;
                }
                try {
                    object3 = j_0.d((Context)object3, string3, 0, object2, string2);
                    string3 = "null cannot be cast to non-null type kotlin.String";
                    Intrinsics.checkNotNull(object3, string3);
                    object3 = (String)object3;
                    break block23;
                }
                catch (Exception exception) {}
            }
            n3 = 0;
            object3 = null;
        }
        ((k)object5).r = object3;
        object3 = jioMediationVideoController.o;
        if (object3 != null && (object3 = object3.Y()) != null) {
            object3 = ((Utility)object4).getUidFromPreferences((Context)object3);
        } else {
            n3 = 0;
            object3 = null;
        }
        ((k)object5).s = object3;
        ((k)object5).l = object3 = Integer.valueOf(0);
        ((k)object5).e = object3 = Boolean.FALSE;
        object = jioMediationVideoController.o;
        object = object != null ? object.q0() : null;
        ((k)object5).w = object;
        ((k)object5).m = object = Boolean.TRUE;
        ((k)object5).o = object3;
        ((k)object5).n = object3;
        object3 = jioMediationVideoController.o;
        if (object3 != null) {
            object3 = object3.R();
        } else {
            n3 = 0;
            object3 = null;
        }
        ((k)object5).t = object3;
        object3 = jioMediationVideoController.o;
        if (object3 != null) {
            object3.L();
        }
        if ((object3 = jioMediationVideoController.o) != null) {
            n3 = object3.W();
            object3 = n3;
        } else {
            n3 = 0;
            object3 = null;
        }
        ((k)object5).F = object3;
        object3 = jioMediationVideoController.o;
        if (object3 != null) {
            object3 = object3.K();
        } else {
            n3 = 0;
            object3 = null;
        }
        ((k)object5).u = object3;
        object3 = jioMediationVideoController.p;
        ((k)object5).I = object3 = object3.getLeftoverAdCount();
        object3 = jioMediationVideoController.p;
        ((k)object5).J = object3 = object3.getLeftoverAdDuration();
        object3 = jioMediationVideoController.o;
        if (object3 != null && (object3 = object3.Y()) != null) {
            object3 = ((Utility)object4).getCbValue((Context)object3, (String)object2);
        } else {
            n3 = 0;
            object3 = null;
        }
        ((k)object5).i = object3;
        jioMediationVideoController.n = object5 = ((Utility)object4).replaceMacros((k)object5);
        object5 = new StringBuilder();
        object4 = jioMediationVideoController.o;
        object4 = object4 != null ? object4.P() : null;
        ((StringBuilder)object5).append((String)object4);
        object4 = ": requestAds adTagUrl: ";
        ((StringBuilder)object5).append((String)object4);
        object4 = jioMediationVideoController.n;
        ((StringBuilder)object5).append((String)object4);
        object5 = ((StringBuilder)object5).toString();
        object4 = "message";
        Intrinsics.checkNotNullParameter(object5, (String)object4);
        object5 = JioAds.Companion;
        object5 = ((JioAds$Companion)object5).getInstance();
        ((JioAds)object5).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object5 = JioAds$LogLevel.NONE;
        object5 = new JioMediationVideoController$requestAds$1$4(jioMediationVideoController);
        jioMediationVideoController.d = object5;
        object5 = jioMediationVideoController.o;
        if (object5 == null) return;
        if ((object5 = object5.Y()) == null) return;
        object4 = new FrameLayout((Context)object5);
        jioMediationVideoController.i = object4;
        object5 = jioMediationVideoController.d;
        if (object5 == null) {
            return;
        }
        Intrinsics.checkNotNull(object4);
        object5 = jioMediationVideoController.d;
        Intrinsics.checkNotNull(object5);
        object5 = ImaSdkFactory.createAdDisplayContainer((ViewGroup)object4, (VideoAdPlayer)object5);
        object4 = "createAdDisplayContainer(...)";
        Intrinsics.checkNotNullExpressionValue(object5, (String)object4);
        object4 = ImaSdkFactory.getInstance();
        jioMediationVideoController.k = object4;
        Intrinsics.checkNotNull(object4);
        object4 = object4.createAdsRequest();
        object3 = "createAdsRequest(...)";
        Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
        object3 = jioMediationVideoController.n;
        object4.setAdTagUrl((String)object3);
        object3 = jioMediationVideoController.k;
        Intrinsics.checkNotNull(object3);
        object3 = object3.createImaSdkSettings();
        object2 = "createImaSdkSettings(...)";
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object2 = jioMediationVideoController.o;
        if (object2 != null && (object2 = object2.Y()) != null) {
            imaSdkFactory = jioMediationVideoController.k;
            Intrinsics.checkNotNull(imaSdkFactory);
            imaSdkFactory = imaSdkFactory.createAdsLoader((Context)object2, (ImaSdkSettings)object3, (AdDisplayContainer)object5);
        }
        jioMediationVideoController.m = imaSdkFactory;
        if (imaSdkFactory != null) {
            imaSdkFactory.addAdErrorListener((AdErrorEvent.AdErrorListener)jioMediationVideoController);
        }
        if ((object5 = jioMediationVideoController.m) != null) {
            object5.addAdsLoadedListener((AdsLoader.AdsLoadedListener)jioMediationVideoController);
        }
        if ((jioMediationVideoController = jioMediationVideoController.m) == null) return;
        jioMediationVideoController.requestAds((AdsRequest)object4);
    }

    public static final /* synthetic */ AdsManager access$getMAdsManager$p(JioMediationVideoController jioMediationVideoController) {
        return jioMediationVideoController.l;
    }

    public static final /* synthetic */ AdMediaInfo access$getMCurrentMediaInfo$p(JioMediationVideoController jioMediationVideoController) {
        return jioMediationVideoController.e;
    }

    public static final /* synthetic */ JioMediationListener access$getMCustomListener$p(JioMediationVideoController jioMediationVideoController) {
        return jioMediationVideoController.p;
    }

    public static final /* synthetic */ b access$getMIJioAdView$p(JioMediationVideoController jioMediationVideoController) {
        return jioMediationVideoController.o;
    }

    public static final /* synthetic */ boolean access$getMIsPauseCalledByDev$p(JioMediationVideoController jioMediationVideoController) {
        return jioMediationVideoController.f;
    }

    public static final /* synthetic */ boolean access$getMIsResumeCalledByDev$p(JioMediationVideoController jioMediationVideoController) {
        return jioMediationVideoController.g;
    }

    public static final /* synthetic */ s access$getMJioInStreamVideo$p(JioMediationVideoController jioMediationVideoController) {
        return jioMediationVideoController.h;
    }

    public static final /* synthetic */ VideoAdPlayer access$getVideoAdPlayer$p(JioMediationVideoController jioMediationVideoController) {
        return jioMediationVideoController.d;
    }

    public static final /* synthetic */ ArrayList access$getVideoPlayerCallbacks$p(JioMediationVideoController jioMediationVideoController) {
        return jioMediationVideoController.q;
    }

    public static final /* synthetic */ boolean access$isAdStarted$p(JioMediationVideoController jioMediationVideoController) {
        return jioMediationVideoController.j;
    }

    public static final /* synthetic */ boolean access$isFirstResumed$p(JioMediationVideoController jioMediationVideoController) {
        return jioMediationVideoController.b;
    }

    public static final /* synthetic */ boolean access$isSkipped$p(JioMediationVideoController jioMediationVideoController) {
        return jioMediationVideoController.c;
    }

    public static final /* synthetic */ boolean access$isStartCalled$p(JioMediationVideoController jioMediationVideoController) {
        return jioMediationVideoController.a;
    }

    public static final /* synthetic */ void access$resetStates(JioMediationVideoController jioMediationVideoController) {
        jioMediationVideoController.getClass();
    }

    public static final /* synthetic */ void access$setMCurrentMediaInfo$p(JioMediationVideoController jioMediationVideoController, AdMediaInfo adMediaInfo) {
        jioMediationVideoController.e = adMediaInfo;
    }

    public static final /* synthetic */ void access$setStartCalled$p(JioMediationVideoController jioMediationVideoController, boolean bl2) {
        jioMediationVideoController.a = bl2;
    }

    public final void a() {
        Object object;
        Object object2 = this.o;
        object2 = object2 != null ? object2.k0() : null;
        if (object2 == (object = JioAdView$AdState.DESTROYED)) {
            return;
        }
        object = Looper.getMainLooper();
        object2 = new Handler((Looper)object);
        object = new wl1_2(this);
        try {
            object2.post((Runnable)object);
        }
        catch (Exception exception) {
            object2 = this.p;
            object = JioAdError$JioAdErrorType.ERROR_NOFILL.getErrorCode();
            String string2 = "GoogleIMA initialization exception";
            object2.onAdFailed((String)object, string2);
        }
    }

    public final void attachAdUiContainer(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "container");
        Object object = this.i;
        if (object != null) {
            Object object2;
            if ((object = object.getParent()) != null) {
                object = this.i;
                object = object != null ? object.getParent() : null;
                Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.view.ViewGroup");
                object = (ViewGroup)object;
                object2 = this.i;
                object.removeView((View)object2);
            }
            if ((object = this.i) != null) {
                int n3 = -1;
                object2 = new RelativeLayout.LayoutParams(n3, n3);
                object.setLayoutParams((ViewGroup.LayoutParams)object2);
            }
            object2 = "message";
            Intrinsics.checkNotNullParameter("mAdUiContainer attach success", (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object = this.i;
            viewGroup.addView((View)object);
        }
    }

    public final void destroy() {
        Object object = new StringBuilder();
        Object object2 = this.o;
        object2 = object2 != null ? object2.P() : null;
        object.append((String)object2);
        object.append(": JioMediationVideoController destroy() ");
        object2 = this.l;
        object2 = object2 != null && (object2 = object2.getCurrentAd()) != null ? object2.getAdId() : null;
        l_0.i((String)object2, object);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.l;
        if (object != null) {
            object.destroy();
            this.l = null;
        }
        if ((object = this.m) != null) {
            object.release();
        }
        this.m = null;
    }

    public void onAdError(AdErrorEvent object) {
        String string2;
        Object object2;
        Object object3;
        String string3;
        block23: {
            char c2;
            block22: {
                block21: {
                    string3 = "message";
                    object3 = "adErrorEvent";
                    Intrinsics.checkNotNullParameter(object, (String)object3);
                    object3 = new StringBuilder();
                    object2 = this.o;
                    string2 = null;
                    if (object2 == null) break block21;
                    object2 = object2.P();
                    break block22;
                }
                c2 = '\u0000';
                object2 = null;
            }
            ((StringBuilder)object3).append((String)object2);
            object2 = ": on IMA Ad Error: ";
            ((StringBuilder)object3).append((String)object2);
            object2 = object.getError();
            object2 = object2.getErrorCode();
            ((StringBuilder)object3).append(object2);
            c2 = ' ';
            ((StringBuilder)object3).append(c2);
            object2 = this.l;
            if (object2 == null) break block23;
            object2 = object2.getCurrentAd();
            if (object2 == null) break block23;
            string2 = object2.getAdId();
        }
        ((StringBuilder)object3).append(string2);
        object3 = ((StringBuilder)object3).toString();
        Intrinsics.checkNotNullParameter(object3, string3);
        object3 = JioAds.Companion;
        object3 = ((JioAds$Companion)object3).getInstance();
        ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object3 = JioAds$LogLevel.NONE;
        object3 = this.p;
        object2 = JioAdError$JioAdErrorType.ERROR_NOFILL;
        object2 = ((JioAdError$JioAdErrorType)((Object)object2)).getErrorCode();
        string2 = object.getError();
        string2 = string2.getMessage();
        try {
            object3.onAdFailed((String)object2, string2);
        }
        catch (Exception exception) {
            object3 = new StringBuilder("Error Occurred in onAdError fun From IMA: ");
            object2 = Utility.INSTANCE;
            object = object.getError();
            string2 = "getError(...)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            object = ((Utility)object2).printStacktrace((Exception)object);
            ((StringBuilder)object3).append((String)object);
            Intrinsics.checkNotNullParameter(((StringBuilder)object3).toString(), string3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
    }

    public void onAdEvent(AdEvent object) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "adEvent");
        Object object3 = this.o;
        Object object4 = 0;
        Object object5 = null;
        if (object3 != null) {
            object3 = object3.k0();
        } else {
            object2 = 0;
            object3 = null;
        }
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.DESTROYED;
        if (object3 == jioAdView$AdState) {
            object = new StringBuilder();
            object3 = this.o;
            if (object3 != null) {
                object5 = object3.P();
            }
            j_0.k((StringBuilder)object, (String)object5, ": JioAdView state is destroyed so returning from onAdEvent()");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return;
        }
        object3 = object.getType();
        if (object3 != (object5 = AdEvent.AdEventType.AD_PROGRESS)) {
            object3 = new StringBuilder("onAdEvent() ");
            object5 = object.getType();
            ((StringBuilder)object3).append(object5);
            object3 = ((StringBuilder)object3).toString();
            object5 = "message";
            Intrinsics.checkNotNullParameter(object3, (String)object5);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = JioAds$LogLevel.NONE;
        }
        object = object.getType();
        object3 = JioMediationVideoController$WhenMappings.$EnumSwitchMapping$0;
        Object object6 = ((Enum)object).ordinal();
        object2 = 1;
        if ((object6 = (Object)object3[object6]) != object2) {
            object4 = 2;
            if (object6 != object4) {
                object4 = 3;
                if (object6 != object4) {
                    object4 = 4;
                    if (object6 != object4) {
                        object4 = 5;
                        if (object6 == object4) {
                            this.j = object2;
                        }
                    } else {
                        this.c = object2;
                    }
                } else {
                    object = this.p;
                    object.onAdSkippable();
                }
            } else {
                object = this.p;
                object.onAdClicked();
            }
        } else {
            object = this.p;
            object.onAdLoaded();
        }
    }

    public void onAdsManagerLoaded(AdsManagerLoadedEvent object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "adsManagerLoadedEvent");
        Object object2 = "{";
        Object object3 = new StringBuilder((String)object2);
        Object object4 = this.o;
        String string2 = null;
        if (object4 != null) {
            object4 = object4.P();
        } else {
            n3 = 0;
            object4 = null;
        }
        Object object5 = "}: onAdsManagerLoaded";
        j_0.k((StringBuilder)object3, (String)object4, object5);
        object3 = JioAds.Companion;
        ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object4 = JioAds$LogLevel.NONE;
        object4 = this.o;
        if (object4 != null) {
            object4 = object4.k0();
        } else {
            n3 = 0;
            object4 = null;
        }
        object5 = JioAdView$AdState.DESTROYED;
        if (object4 == object5) {
            return;
        }
        object = object.getAdsManager();
        this.l = object;
        object = new StringBuilder((String)object2);
        object2 = this.o;
        if (object2 != null) {
            string2 = object2.P();
        }
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append("}: onAdsManagerLoaded+ ");
        object2 = this.l;
        ((StringBuilder)object).append(object2);
        object = ((StringBuilder)object).toString();
        object2 = "message";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = this.k;
        if (object != null) {
            object = this.l;
            if (object != null) {
                object.addAdErrorListener((AdErrorEvent.AdErrorListener)this);
            }
            if ((object = this.l) != null) {
                object.addAdEventListener((AdEvent.AdEventListener)this);
            }
            object = this.k;
            Intrinsics.checkNotNull(object);
            object = object.createAdsRenderingSettings();
            Intrinsics.checkNotNullExpressionValue(object, "createAdsRenderingSettings(...)");
            n3 = 1;
            object.setEnablePreloading(n3 != 0);
            object4 = this.o;
            n3 = object4 != null ? object4.g() : 20;
            object.setLoadVideoTimeout(n3 *= 1000);
            string2 = "application/x-mpegURL";
            object4 = xx_2.i("video/mp4", string2);
            object.setMimeTypes((List)object4);
            object4 = this.l;
            if (object4 != null) {
                object4.init((AdsRenderingSettings)object);
            }
            object = new StringBuilder("Ad manager init ");
            object4 = this.l;
            ((StringBuilder)object).append(object4);
            Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), (String)object2);
            object = ((JioAds$Companion)object3).getInstance();
            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        }
    }

    public final void pause(boolean bl2) {
        Object object = new StringBuilder();
        Object object2 = this.o;
        String string2 = null;
        object2 = object2 != null ? object2.P() : null;
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(": JioMediationVideoController pause() ");
        object2 = this.l;
        object2 = object2 != null && (object2 = object2.getCurrentAd()) != null ? object2.getAdId() : null;
        l_0.i((String)object2, (StringBuilder)object);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        this.f = bl2;
        if (bl2) {
            object2 = null;
            this.g = false;
        }
        if ((object2 = this.l) != null) {
            object2 = new StringBuilder();
            b b2 = this.o;
            if (b2 != null) {
                string2 = b2.P();
            }
            ((StringBuilder)object2).append(string2);
            string2 = ": pause() in mediation, IsCalledByDev: ";
            ((StringBuilder)object2).append(string2);
            ((StringBuilder)object2).append(bl2);
            String string3 = ((StringBuilder)object2).toString();
            object2 = "message";
            Intrinsics.checkNotNullParameter(string3, (String)object2);
            ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            string3 = this.l;
            if (string3 != null) {
                string3.pause();
            }
        }
    }

    public final void prepare() {
        Object object = new StringBuilder();
        Object object2 = this.o;
        object2 = object2 != null ? object2.P() : null;
        j_0.k(object, (String)object2, ": requesting IMA ad");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        this.a();
    }

    public final void resume(boolean bl2) {
        Object object = new StringBuilder();
        Object object2 = this.o;
        String string2 = null;
        object2 = object2 != null ? object2.P() : null;
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(": JioMediationVideoController resume() ");
        object2 = this.l;
        object2 = object2 != null && (object2 = object2.getCurrentAd()) != null ? object2.getAdId() : null;
        l_0.i((String)object2, (StringBuilder)object);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        this.g = bl2;
        if (bl2) {
            object2 = null;
            this.f = false;
        }
        if ((object2 = this.l) != null) {
            object2 = new StringBuilder();
            b b2 = this.o;
            if (b2 != null) {
                string2 = b2.P();
            }
            ((StringBuilder)object2).append(string2);
            string2 = ": resume() in mediation, isCalledByDev: ";
            ((StringBuilder)object2).append(string2);
            ((StringBuilder)object2).append(bl2);
            String string3 = ((StringBuilder)object2).toString();
            object2 = "message";
            Intrinsics.checkNotNullParameter(string3, (String)object2);
            ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            string3 = this.l;
            if (string3 != null) {
                string3.resume();
            }
            if (!(bl2 = this.b)) {
                this.b = bl2 = true;
            }
        }
    }

    public final void setVideoPlayer$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(s s7) {
        Intrinsics.checkNotNullParameter(s7, "jioInStreamVideo");
        Object object = new StringBuilder();
        Object object2 = this.o;
        object2 = object2 != null ? object2.P() : null;
        String string2 = ": JioMediationVideoController  inside setVideoPlayer";
        j_0.k(object, (String)object2, string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        this.h = s7;
        if (s7 != null) {
            object = new JioMediationVideoController$setVideoPlayer$1(this);
            s7.z = object;
        }
    }
}

