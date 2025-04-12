/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.jio.jioads.instreamads.vastparser;

import android.view.View;
import com.jio.jioads.adinterfaces.JioAdView$AdPodVariant;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.common.b;
import com.jio.jioads.controller.f;
import com.jio.jioads.controller.o;
import com.jio.jioads.instream.video.InstreamVideo;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.instreamads.vastparser.n;
import com.jio.jioads.multiad.N;
import com.jio.jioads.videomodule.s;
import com.jioads.mediation.partners.JioMediationListener;
import com.jioads.mediation.partners.videoutils.JioMediationVideoController;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

public final class JioVastParsingHelper$tryLoadingMediationAd$1
implements JioMediationListener {
    public final int a;
    public final int b;
    public final /* synthetic */ n c;

    public JioVastParsingHelper$tryLoadingMediationAd$1(n n3) {
        int n4;
        int n7;
        this.c = n3;
        this.a = n7 = n3.i;
        this.b = n4 = n3.g;
    }

    public final void addMediationUrl(String string2, JioMediationVideoController jioMediationVideoController, int n3, int n4, Integer n7, Integer n8, String string3) {
        Intrinsics.checkNotNullParameter(string2, "url");
        Intrinsics.checkNotNullParameter(jioMediationVideoController, "jioMediationVideoController");
        Object object = this.c;
        boolean bl2 = object.G;
        if (bl2) {
            StringBuilder stringBuilder = new StringBuilder();
            j_0.j(object, stringBuilder, ": returning from addMediationUrl");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        j_0.i(object.b, stringBuilder, ": calling addMediationUrl from JioVastParsingHelper");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        Integer n10 = n3;
        this.c.j(string2, jioMediationVideoController, n10, n4, n7, n8, string3);
    }

    public final int getCurrentPosition() {
        Object object = this.c.y;
        int n3 = 0;
        if (object != null && (object = InstreamVideo.access$getJioVideoView$p(((com.jio.jioads.instream.video.o)object).a)) != null && (object = ((s)object).Z()) != null) {
            n3 = (Integer)object;
        }
        return n3;
    }

    public final Integer getLeftoverAdCount() {
        return this.b;
    }

    public final Integer getLeftoverAdDuration() {
        return this.a;
    }

    public final int getVideoAdDuration() {
        Object object = this.c.y;
        int n3 = 0;
        if (object != null && (object = InstreamVideo.access$getJioVideoView$p(((com.jio.jioads.instream.video.o)object).a)) != null && (object = ((s)object).b0()) != null) {
            n3 = (Integer)object;
        }
        return n3;
    }

    public final int getVolume() {
        Object object = this.c.y;
        int n3 = 0;
        if (object != null && (object = InstreamVideo.access$getJioVideoView$p(((com.jio.jioads.instream.video.o)object).a)) != null) {
            n3 = ((s)object).X();
        }
        return n3;
    }

    public final void logMediationImpression() {
        Intrinsics.checkNotNullParameter("Callback Mediation ad logMediationImpression()", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public final void onAdClicked() {
        JioAdView$AdState jioAdView$AdState;
        Object object = this.c;
        Object object2 = ((n)object).b.k0();
        if (object2 != (jioAdView$AdState = JioAdView$AdState.DESTROYED)) {
            Intrinsics.checkNotNullParameter("Callback Mediation ad onAdClicked()", "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object2 = ((n)object).b;
            jioAdView$AdState = JioAdView$AdState.INTERACTED;
            object2.j(jioAdView$AdState);
            object = (V)((n)object).e;
            ((V)object).a();
        }
    }

    public final void onAdCollapsed() {
        Intrinsics.checkNotNullParameter("Callback Mediation ad onAdCollapsed()", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object = JioAds$LogLevel.NONE;
        object = this.c;
        b b2 = ((n)object).b;
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.COLLAPSED;
        b2.j(jioAdView$AdState);
        ((V)((n)object).e).j();
    }

    public final void onAdDismissed(boolean bl2, boolean bl3) {
        Intrinsics.checkNotNullParameter("Callback Mediation ad onAdDismissed()", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public final void onAdExpand() {
        Intrinsics.checkNotNullParameter("Callback Mediation ad onAdExpand()", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object = JioAds$LogLevel.NONE;
        object = this.c;
        b b2 = ((n)object).b;
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.EXPANDED;
        b2.j(jioAdView$AdState);
        ((V)((n)object).e).k();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onAdFailed(String object, String object2) {
        JioAdView$AdState jioAdView$AdState;
        object = this.c;
        int n3 = ((n)object).G;
        if (n3 != 0) {
            object2 = new StringBuilder();
            j_0.j((n)object, (StringBuilder)object2, ": returning from onAdFailed");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return;
        }
        Object object3 = ((n)object).b;
        JioAdView$AdState jioAdView$AdState2 = object3.k0();
        if (jioAdView$AdState2 == (jioAdView$AdState = JioAdView$AdState.DESTROYED)) return;
        StringBuilder stringBuilder = new StringBuilder("JioVastParsingHelper inside onAdFailed() of mediation ad mediationIndexCounter= ");
        int n4 = ((n)object).B;
        stringBuilder.append(n4);
        stringBuilder.append(" and errorDesc= ");
        stringBuilder.append((String)object2);
        object2 = stringBuilder.toString();
        String string2 = "message";
        Intrinsics.checkNotNullParameter(object2, string2);
        object2 = JioAds.Companion;
        ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        m m2 = ((n)object).E;
        if (m2 == null) return;
        n4 = (int)(m2.f ? 1 : 0);
        if (n4 != 0) return;
        JSONArray jSONArray = ((n)object).A;
        int n7 = 1;
        if (jSONArray != null) {
            JioAdView$AdPodVariant jioAdView$AdPodVariant;
            JioAdView$AdPodVariant jioAdView$AdPodVariant2;
            Intrinsics.checkNotNull(jSONArray);
            n4 = jSONArray.length();
            int n8 = ((n)object).B + n7;
            if (n4 > n8 && (jioAdView$AdPodVariant2 = object3.L()) == (jioAdView$AdPodVariant = JioAdView$AdPodVariant.NONE)) {
                ((n)object).B = n3 = ((n)object).B + n7;
                object3 = new StringBuilder("Mediation ad failed for index ");
                n4 = ((n)object).B - n7;
                ((StringBuilder)object3).append(n4);
                String string3 = " so trying for index ";
                ((StringBuilder)object3).append(string3);
                n4 = ((n)object).B;
                ((StringBuilder)object3).append(n4);
                object3 = ((StringBuilder)object3).toString();
                Intrinsics.checkNotNullParameter(object3, string2);
                ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = ((n)object).A;
                Intrinsics.checkNotNull(object2);
                n3 = ((n)object).B;
                object2 = object2.optJSONObject(n3);
                ((n)object).m((JSONObject)object2);
                return;
            }
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        j_0.j((n)object, stringBuilder2, ": Mediation ad getting failed so set IsContinueToSelectMediationAd as false to avoid further mediation selection");
        ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = ((f)((n)object).c).a;
        Object var5_9 = null;
        ((o)object2).B = false;
        ((o)object2).A = false;
        ((o)object2).C = n7;
        object2 = N.a;
        object2 = object3.P();
        Intrinsics.checkNotNullParameter(object2, "adSpotId");
        object3 = N.e;
        Boolean bl2 = Boolean.TRUE;
        ((HashMap)object3).put(object2, bl2);
        object2 = new JSONArray();
        ((n)object).A = object2;
        ((n)object).B = 0;
        ((n)object).H();
    }

    public final void onAdLoaded() {
        Object object;
        Object object2 = this.c;
        Enum enum_ = ((n)object2).b.k0();
        if (enum_ != (object = JioAdView$AdState.DESTROYED)) {
            object = "message";
            Intrinsics.checkNotNullParameter("Video ad onAdLoaded()", (String)object);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            enum_ = JioAds$LogLevel.NONE;
            object2 = ((f)((n)object2).c).a.p;
        }
    }

    public final void onAdMediaStart() {
        Intrinsics.checkNotNullParameter("Callback Mediation ad onAdMediaStart()", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        ((V)this.c.e).m();
    }

    public final void onAdRender() {
        Intrinsics.checkNotNullParameter("Callback Mediation ad onAdRender()", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object = JioAds$LogLevel.NONE;
        object = this.c;
        Object object2 = ((n)object).b;
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.STARTED;
        object2.j(jioAdView$AdState);
        object2 = ((n)object).o;
        ((V)((n)object).e).i((String)object2);
    }

    public final void onAdShown() {
    }

    public final void onAdSkippable() {
    }

    public final void onBannerAdLoaded(View view) {
    }

    public final void onNativeAdLoaded(Object[] objectArray) {
        Intrinsics.checkNotNullParameter(objectArray, "objAarry");
    }

    public final void onVideoAdEnd(boolean bl2) {
        Intrinsics.checkNotNullParameter("Callback Mediation ad onVideoAdEnd()", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object = JioAds$LogLevel.NONE;
        object = this.c;
        Object object2 = ((n)object).b.M();
        if (object2 != null) {
            object2 = ((n)object).b;
            JioAdView$AdState jioAdView$AdState = JioAdView$AdState.CLOSED;
            object2.j(jioAdView$AdState);
            object = (V)((n)object).e;
            ((V)object).l();
        }
    }

    public final void pauseAdFromMediation(boolean bl2) {
        Object object = this.c.y;
        if (object != null) {
            object = ((com.jio.jioads.instream.video.o)object).a;
            ((InstreamVideo)object).pauseAd(bl2);
        }
    }

    public final void resumeFromMediation(boolean bl2) {
        Object object = this.c.y;
        if (object != null) {
            object = ((com.jio.jioads.instream.video.o)object).a;
            ((InstreamVideo)object).resumeAd(bl2);
        }
    }

    public final void stopAds(boolean bl2) {
        Object object = this.c.y;
        if (object != null && (object = InstreamVideo.access$getJioVideoView$p(((com.jio.jioads.instream.video.o)object).a)) != null) {
            ((s)object).u();
        }
    }
}

