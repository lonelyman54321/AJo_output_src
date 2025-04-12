/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  org.json.JSONObject
 */
package com.jioads.mediation;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.ads.AdView;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.common.b;
import com.jio.jioads.common.c;
import com.jio.jioads.common.l;
import com.jio.jioads.controller.f;
import com.jio.jioads.controller.o;
import com.jio.jioads.native.t;
import com.jioads.mediation.JioAdMediationController;
import com.jioads.mediation.JioMediationSelector;
import com.jioads.mediation.a;
import com.jioads.mediation.partners.JioMediationListener;
import com.jioads.mediation.partners.videoutils.JioMediationVideoController;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class JioAdMediationController$cacheMediationAd$3
implements JioMediationListener {
    public final /* synthetic */ JioAdMediationController a;
    public final /* synthetic */ String b;

    public JioAdMediationController$cacheMediationAd$3(JioAdMediationController jioAdMediationController, String string2) {
        this.a = jioAdMediationController;
        this.b = string2;
    }

    public final void addMediationUrl(String string2, JioMediationVideoController jioMediationVideoController, int n3, int n4, Integer n7, Integer n8, String string3) {
        Intrinsics.checkNotNullParameter(string2, "url");
        Intrinsics.checkNotNullParameter(jioMediationVideoController, "jioMediationVideoController");
        Object object = new StringBuilder();
        JioAdMediationController jioAdMediationController = this.a;
        Object object2 = JioAdMediationController.access$getIJioAdView$p(jioAdMediationController).P();
        object.append((String)object2);
        object.append(": JioAdMediationController calling addMediationUrl ");
        object2 = JioAdMediationController.access$getJioAdsMediationCallback$p(jioAdMediationController);
        object.append(object2);
        Intrinsics.checkNotNullParameter(object.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        JioAdMediationController.access$getJioAdsMediationCallback$p(jioAdMediationController).addMediationUrl(string2, jioMediationVideoController, n3, n4, n7, n8, string3);
    }

    public final int getCurrentPosition() {
        return JioAdMediationController.access$getJioAdsMediationCallback$p(this.a).getCurrentPosition();
    }

    public final Integer getLeftoverAdCount() {
        return null;
    }

    public final Integer getLeftoverAdDuration() {
        return null;
    }

    public final int getVideoAdDuration() {
        return JioAdMediationController.access$getJioAdsMediationCallback$p(this.a).getVideoAdDuration();
    }

    public final int getVolume() {
        return JioAdMediationController.access$getJioAdsMediationCallback$p(this.a).getVolume();
    }

    public final void logMediationImpression() {
        Object object = new StringBuilder();
        String string2 = JioAdMediationController.access$getIJioAdView$p(this.a).P();
        object.append(string2);
        object.append(": Callback Mediation ad logMediationImpression()");
        Intrinsics.checkNotNullParameter(object.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }

    public final void onAdClicked() {
        Object object;
        Object object2 = this.a;
        Object object3 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object2).k0();
        if (object3 != (object = JioAdView$AdState.DESTROYED)) {
            object3 = new StringBuilder();
            object = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object2).P();
            ((StringBuilder)object3).append((String)object);
            ((StringBuilder)object3).append(": Callback Mediation ad onAdClicked()");
            Intrinsics.checkNotNullParameter(((StringBuilder)object3).toString(), "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = JioAds$LogLevel.NONE;
            object3 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object2);
            object = JioAdView$AdState.INTERACTED;
            object3.j((JioAdView$AdState)((Object)object));
            object2 = (V)JioAdMediationController.access$getJioAdCallback$p((JioAdMediationController)object2);
            ((V)object2).a();
        }
    }

    public final void onAdCollapsed() {
        Object object;
        JioAdMediationController jioAdMediationController = this.a;
        Object object2 = JioAdMediationController.access$getIJioAdView$p(jioAdMediationController).k0();
        if (object2 != (object = JioAdView$AdState.DESTROYED)) {
            object2 = new StringBuilder();
            object = JioAdMediationController.access$getIJioAdView$p(jioAdMediationController).P();
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(": Callback Mediation ad onAdCollapsed()");
            Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object2 = JioAdMediationController.access$getIJioAdView$p(jioAdMediationController);
            object = JioAdView$AdState.COLLAPSED;
            object2.j((JioAdView$AdState)((Object)object));
            object2 = JioAdMediationController.access$getIJioAdView$p(jioAdMediationController).n();
            object2 = object2 != null ? ((JioAdView)object2).getMAdListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() : null;
            if (object2 != null) {
                object = Looper.getMainLooper();
                object2 = new Handler((Looper)object);
                object = new bl1_1(jioAdMediationController);
                object2.post((Runnable)object);
            }
        }
    }

    public final void onAdDismissed(boolean bl2, boolean bl3) {
        Object object;
        JioAdMediationController jioAdMediationController = this.a;
        Object object2 = JioAdMediationController.access$getIJioAdView$p(jioAdMediationController).k0();
        if (object2 != (object = JioAdView$AdState.DESTROYED)) {
            object2 = new StringBuilder();
            object = JioAdMediationController.access$getIJioAdView$p(jioAdMediationController).P();
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(": Callback Mediation ad onAdDismissed()");
            object2 = ((StringBuilder)object2).toString();
            object = "message";
            Intrinsics.checkNotNullParameter(object2, (String)object);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object2 = JioAdMediationController.access$getJioMediationSelector$p(jioAdMediationController);
            if (object2 != null) {
                ((JioMediationSelector)object2).destroyView();
            }
            if ((object2 = JioAdMediationController.access$getIJioAdView$p(jioAdMediationController).K()) == (object = JioAdView$AD_TYPE.INTERSTITIAL)) {
                object2 = JioAdMediationController.access$getIJioAdView$p(jioAdMediationController);
                object = JioAdView$AdState.CLOSED;
                object2.j((JioAdView$AdState)((Object)object));
                object2 = JioAdMediationController.access$getIJioAdView$p(jioAdMediationController).n();
                object2 = object2 != null ? ((JioAdView)object2).getMAdListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() : null;
                if (object2 != null) {
                    object = Looper.getMainLooper();
                    object2 = new Handler((Looper)object);
                    object = new yk1_2(jioAdMediationController, bl3);
                    object2.post((Runnable)object);
                }
            }
        }
    }

    public final void onAdExpand() {
        Object object;
        JioAdMediationController jioAdMediationController = this.a;
        Object object2 = JioAdMediationController.access$getIJioAdView$p(jioAdMediationController).k0();
        if (object2 != (object = JioAdView$AdState.DESTROYED)) {
            object2 = new StringBuilder();
            object = JioAdMediationController.access$getIJioAdView$p(jioAdMediationController).P();
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(": Callback Mediation ad onAdExpand()");
            Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object2 = JioAdMediationController.access$getIJioAdView$p(jioAdMediationController);
            object = JioAdView$AdState.EXPANDED;
            object2.j((JioAdView$AdState)((Object)object));
            object2 = JioAdMediationController.access$getIJioAdView$p(jioAdMediationController).n();
            object2 = object2 != null ? ((JioAdView)object2).getMAdListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() : null;
            if (object2 != null) {
                object = Looper.getMainLooper();
                object2 = new Handler((Looper)object);
                object = new al1_2(jioAdMediationController, 0);
                object2.post((Runnable)object);
            }
        }
    }

    public final void onAdFailed(String object, String object2) {
        Object object3;
        object = this.a;
        Object object4 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object).k0();
        if (object4 != (object3 = JioAdView$AdState.DESTROYED)) {
            boolean bl2;
            object4 = new StringBuilder();
            object3 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object).P();
            ((StringBuilder)object4).append((String)object3);
            ((StringBuilder)object4).append(": inside onAdFailed() of mediation ad errorDesc= ");
            ((StringBuilder)object4).append((String)object2);
            object2 = ((StringBuilder)object4).toString();
            object4 = "message";
            Intrinsics.checkNotNullParameter(object2, (String)object4);
            object2 = JioAds.Companion;
            ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = JioAds$LogLevel.NONE;
            ((f)JioAdMediationController.access$getIJioAdViewController$p((JioAdMediationController)object)).a.A = false;
            object3 = ((f)JioAdMediationController.access$getIJioAdViewController$p((JioAdMediationController)object)).a;
            ((o)object3).C = bl2 = true;
            object3 = new StringBuilder();
            String string2 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object).P();
            ((StringBuilder)object3).append(string2);
            string2 = ": Mediation ad failed so trying mediation Promotion ad";
            ((StringBuilder)object3).append(string2);
            object3 = ((StringBuilder)object3).toString();
            Intrinsics.checkNotNullParameter(object3, (String)object4);
            ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAdMediationController.access$getIJioAdViewController$p((JioAdMediationController)object);
            object2 = this.b;
            object = (f)object;
            ((f)object).h((String)object2);
        }
    }

    public final void onAdLoaded() {
        Object object;
        Object object2 = this.a;
        Object object3 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object2).k0();
        if (object3 != (object = JioAdView$AdState.DESTROYED)) {
            Object object4;
            object3 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object2).K();
            if (object3 == null) {
                object4 = -1;
            } else {
                object = com.jioads.mediation.a.$EnumSwitchMapping$0;
                object4 = ((Enum)object3).ordinal();
                object4 = (Object)object[object4];
            }
            object = "message";
            int n3 = 1;
            if (object4 != n3) {
                int n4 = 2;
                if (object4 != n4) {
                    object3 = JioAdMediationController.access$getJioMediationSelector$p((JioAdMediationController)object2);
                    if (object3 != null) {
                        ((JioMediationSelector)object3).destroyView();
                    }
                    object4 = 0;
                    JioAdMediationController.access$setJioMediationSelector$p((JioAdMediationController)object2, null);
                    object3 = new StringBuilder();
                    String string2 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object2).P();
                    ((StringBuilder)object3).append(string2);
                    ((StringBuilder)object3).append(": Error while loading mediation video ad");
                    Intrinsics.checkNotNullParameter(((StringBuilder)object3).toString(), (String)object);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object3 = JioAds$LogLevel.NONE;
                    object3 = JioAdError.Companion;
                    object = JioAdError$JioAdErrorType.ERROR_NOFILL;
                    string2 = "No Ad in inventory";
                    JioAdError jioAdError = j_0.c((t_0)object3, (JioAdError$JioAdErrorType)((Object)object), string2);
                    object2 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object2);
                    JioAdView jioAdView = object2.n();
                    if (jioAdView != null) {
                        String string3 = "";
                        int n7 = 64;
                        JioAdView.adFailedToLoad$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease$default(jioAdView, jioAdError, false, null, null, null, string3, null, n7, null);
                    }
                } else {
                    ((f)JioAdMediationController.access$getIJioAdViewController$p((JioAdMediationController)object2)).a.A = n3;
                    object3 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object2);
                    object = JioAdView$AdState.PREPARED;
                    object3.j((JioAdView$AdState)((Object)object));
                    object2 = (V)JioAdMediationController.access$getJioAdCallback$p((JioAdMediationController)object2);
                    ((V)object2).n();
                }
            } else {
                object3 = new StringBuilder();
                String string4 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object2).P();
                ((StringBuilder)object3).append(string4);
                string4 = ": Video ad onAdLoaded()";
                ((StringBuilder)object3).append(string4);
                Intrinsics.checkNotNullParameter(((StringBuilder)object3).toString(), (String)object);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object3 = JioAds$LogLevel.NONE;
                JioAdMediationController.access$prepareMediationVideoAd((JioAdMediationController)object2);
            }
        }
    }

    public final void onAdMediaStart() {
        Object object;
        JioAdMediationController jioAdMediationController = this.a;
        Object object2 = JioAdMediationController.access$getIJioAdView$p(jioAdMediationController).k0();
        if (object2 != (object = JioAdView$AdState.DESTROYED)) {
            object2 = new StringBuilder();
            object = JioAdMediationController.access$getIJioAdView$p(jioAdMediationController).P();
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(": Callback Mediation ad onAdMediaStart()");
            object2 = ((StringBuilder)object2).toString();
            object = "message";
            Intrinsics.checkNotNullParameter(object2, (String)object);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object2 = JioAdMediationController.access$getIJioAdView$p(jioAdMediationController).n();
            object2 = object2 != null ? ((JioAdView)object2).getMAdListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() : null;
            if (object2 != null) {
                object = Looper.getMainLooper();
                object2 = new Handler((Looper)object);
                int n3 = 1;
                object = new Dl0(jioAdMediationController, n3);
                object2.post((Runnable)object);
            }
        }
    }

    public final void onAdRender() {
        Object object;
        Object object2 = this.a;
        Object object3 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object2).k0();
        if (object3 != (object = JioAdView$AdState.DESTROYED)) {
            object3 = new StringBuilder();
            object = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object2).P();
            ((StringBuilder)object3).append((String)object);
            ((StringBuilder)object3).append(": inside mediation onAdRender(): ");
            object = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object2).K();
            ((StringBuilder)object3).append(object);
            object3 = ((StringBuilder)object3).toString();
            object = "message";
            Intrinsics.checkNotNullParameter(object3, (String)object);
            object3 = JioAds.Companion;
            ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            Object object4 = JioAds$LogLevel.NONE;
            object4 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object2).K();
            Object object5 = JioAdView$AD_TYPE.INTERSTITIAL;
            String string2 = "";
            if (object4 == object5) {
                object4 = new StringBuilder();
                object5 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object2).P();
                ((StringBuilder)object4).append((String)object5);
                object5 = ": Callback Mediation Interstitial ad onAdRender()";
                ((StringBuilder)object4).append((String)object5);
                object4 = ((StringBuilder)object4).toString();
                Intrinsics.checkNotNullParameter(object4, (String)object);
                ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object3 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object2);
                object = JioAdView$AdState.STARTED;
                object3.j((JioAdView$AdState)((Object)object));
                object2 = (V)JioAdMediationController.access$getJioAdCallback$p((JioAdMediationController)object2);
                ((V)object2).i(string2);
            } else {
                object4 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object2).K();
                if (object4 != (object5 = JioAdView$AD_TYPE.INSTREAM_VIDEO)) {
                    object4 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object2);
                    boolean bl2 = object4.l();
                    if (!bl2) {
                        object4 = new StringBuilder();
                        object5 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object2).P();
                        ((StringBuilder)object4).append((String)object5);
                        object5 = ": Callback Mediation ad onAdRender() inside onAdRender";
                        ((StringBuilder)object4).append((String)object5);
                        object4 = ((StringBuilder)object4).toString();
                        Intrinsics.checkNotNullParameter(object4, (String)object);
                        ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object3 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object2);
                        object = JioAdView$AdState.STARTED;
                        object3.j((JioAdView$AdState)((Object)object));
                        object2 = (V)JioAdMediationController.access$getJioAdCallback$p((JioAdMediationController)object2);
                        ((V)object2).i(string2);
                    } else {
                        object4 = JioAdMediationController.access$getRefreshTimeHandler$p((JioAdMediationController)object2);
                        if (object4 != null) {
                            ((t)object4).d();
                        }
                        object4 = new StringBuilder();
                        object5 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object2).P();
                        ((StringBuilder)object4).append((String)object5);
                        object5 = ": Callback Mediation adRefresh() inside onAdRender";
                        ((StringBuilder)object4).append((String)object5);
                        object4 = ((StringBuilder)object4).toString();
                        Intrinsics.checkNotNullParameter(object4, (String)object);
                        object3 = ((JioAds$Companion)object3).getInstance();
                        ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object2 = (V)JioAdMediationController.access$getJioAdCallback$p((JioAdMediationController)object2);
                        ((V)object2).g(string2);
                    }
                }
            }
        }
    }

    public final void onAdShown() {
        Object object = new StringBuilder();
        Object object2 = this.a;
        Object object3 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object2).P();
        ((StringBuilder)object).append((String)object3);
        ((StringBuilder)object).append(": Callback Mediation ad onAdShown()");
        object = ((StringBuilder)object).toString();
        object3 = "message";
        Intrinsics.checkNotNullParameter(object, object3);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object4 = JioAds$LogLevel.NONE;
        object4 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object2).K();
        Object object5 = JioAdView$AD_TYPE.INTERSTITIAL;
        if (object4 == object5) {
            object4 = new StringBuilder();
            object5 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object2).P();
            ((StringBuilder)object4).append((String)object5);
            object5 = ":JioAdMediationController Callback Mediation Interstitial ad onAdRender() from onAdShown";
            ((StringBuilder)object4).append((String)object5);
            object4 = ((StringBuilder)object4).toString();
            Intrinsics.checkNotNullParameter(object4, object3);
            ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object2);
            object3 = JioAdView$AdState.STARTED;
            object.j((JioAdView$AdState)((Object)object3));
            object = (V)JioAdMediationController.access$getJioAdCallback$p((JioAdMediationController)object2);
            object2 = "";
            ((V)object).i((String)object2);
        }
    }

    public final void onAdSkippable() {
        int n3;
        int n4;
        Object object;
        JioAdMediationController jioAdMediationController = this.a;
        Enum enum_ = JioAdMediationController.access$getIJioAdView$p(jioAdMediationController).k0();
        if (enum_ != (object = JioAdView$AdState.DESTROYED) && (enum_ = JioAdMediationController.access$getIJioAdView$p(jioAdMediationController).K()) == (object = JioAdView$AD_TYPE.INSTREAM_VIDEO) && (n4 = jioAdMediationController.getRequestedDuration$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) == (n3 = -1)) {
            object = Looper.getMainLooper();
            enum_ = new Handler((Looper)object);
            object = new zk1_1(jioAdMediationController);
            enum_.post((Runnable)object);
        }
    }

    public final void onBannerAdLoaded(View object) {
        Object object2;
        Object object3 = this.a;
        Object object4 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object3).k0();
        if (object4 != (object2 = JioAdView$AdState.DESTROYED)) {
            boolean bl2;
            boolean bl3;
            object4 = new StringBuilder();
            object2 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object3).P();
            ((StringBuilder)object4).append((String)object2);
            ((StringBuilder)object4).append(": Mediation Banner Ad prepared");
            object4 = ((StringBuilder)object4).toString();
            object2 = "message";
            Intrinsics.checkNotNullParameter(object4, (String)object2);
            object4 = JioAds.Companion;
            ((JioAds$Companion)object4).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            Object object5 = JioAds$LogLevel.NONE;
            object5 = ((f)JioAdMediationController.access$getIJioAdViewController$p((JioAdMediationController)object3)).a;
            ((o)object5).A = bl3 = true;
            object5 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object3);
            Object object6 = JioAdView$AdState.PREPARED;
            object5.j((JioAdView$AdState)((Object)object6));
            object5 = (V)JioAdMediationController.access$getJioAdCallback$p((JioAdMediationController)object3);
            ((V)object5).n();
            if (object != null) {
                object5 = JioAdMediationController.access$getIJioAdViewController$p((JioAdMediationController)object3);
                object = (AdView)((Object)object);
                object5 = (f)object5;
                object5.getClass();
                object6 = "gmaBannerAdView";
                Intrinsics.checkNotNullParameter(object, (String)object6);
                object5 = ((f)object5).a;
                ((o)object5).H = object;
            }
            if (bl2 = (object = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object3)).l()) {
                object = new StringBuilder();
                object5 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object3).P();
                ((StringBuilder)object).append((String)object5);
                ((StringBuilder)object).append(": Mediation Banner Ad Refresh Inprogress");
                Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), (String)object2);
                ((JioAds$Companion)object4).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = (f)JioAdMediationController.access$getIJioAdViewController$p((JioAdMediationController)object3);
                object3 = new StringBuilder();
                object2 = ((f)object).a.a;
                object5 = ": called loadAd() as refresh ad started";
                l.a((b)object2, (StringBuilder)object3, (String)object5, (JioAds$Companion)object4);
                object = ((f)object).a;
                ((o)object).c();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onNativeAdLoaded(Object[] jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "objAarry");
        Object object = this.a;
        JioAdView$AdState jioAdView$AdState = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object).k0();
        JioAdView$AdState jioAdView$AdState2 = JioAdView$AdState.DESTROYED;
        if (jioAdView$AdState == jioAdView$AdState2) return;
        int n3 = ((JSONObject)jSONObject).length;
        Object var4_13 = null;
        int n4 = 1;
        if (n3 == 0) {
            n3 = 1;
        } else {
            n3 = 0;
            Object var3_4 = null;
        }
        if ((n3 ^= n4) == 0) return;
        jSONObject = jSONObject[0];
        Intrinsics.checkNotNull(jSONObject, "null cannot be cast to non-null type org.json.JSONObject");
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object).P();
        stringBuilder.append(string2);
        stringBuilder.append(": Mediation NativeAdListener onAdLoaded:= ");
        stringBuilder.append(jSONObject);
        String string3 = stringBuilder.toString();
        String string4 = "message";
        Intrinsics.checkNotNullParameter(string3, string4);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        try {
            c c2 = JioAdMediationController.access$getIJioAdViewController$p((JioAdMediationController)object);
            f f5 = (f)c2;
            o o3 = f5.a;
            o3.A = n4;
            object = JioAdMediationController.access$getJioAdsMediationCallback$p((JioAdMediationController)object);
            object.mediationData(jSONObject);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void onVideoAdEnd(boolean bl2) {
        Object object;
        JioAdMediationController jioAdMediationController = this.a;
        Object object2 = JioAdMediationController.access$getIJioAdView$p(jioAdMediationController).k0();
        if (object2 != (object = JioAdView$AdState.DESTROYED)) {
            object2 = new StringBuilder();
            object = JioAdMediationController.access$getIJioAdView$p(jioAdMediationController).P();
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(": Callback Mediation ad onVideoAdEnd()");
            Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object2 = JioAdMediationController.access$getIJioAdView$p(jioAdMediationController).n();
            object = null;
            object2 = object2 != null ? ((JioAdView)object2).getMAdListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() : null;
            if (object2 != null) {
                object2 = JioAdMediationController.access$getIJioAdView$p(jioAdMediationController);
                JioAdView$AdState jioAdView$AdState = JioAdView$AdState.CLOSED;
                object2.j(jioAdView$AdState);
                object2 = JioAdMediationController.access$getIJioAdView$p(jioAdMediationController).n();
                if (object2 != null) {
                    object = ((JioAdView)object2).getMAdListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                }
                if (object != null) {
                    object = Looper.getMainLooper();
                    object2 = new Handler((Looper)object);
                    object = new xk1_2(jioAdMediationController, bl2);
                    object2.post((Runnable)object);
                }
            }
        }
    }

    public final void pauseAdFromMediation(boolean bl2) {
        JioAdMediationController.access$getJioAdsMediationCallback$p(this.a).pauseAdFromMediation(bl2);
    }

    public final void resumeFromMediation(boolean bl2) {
        JioAdMediationController.access$getJioAdsMediationCallback$p(this.a).resumeAdFromMediation(bl2);
    }

    public final void stopAds(boolean bl2) {
        JioAdMediationController.access$getJioAdsMediationCallback$p(this.a).stopAds(bl2);
    }
}

