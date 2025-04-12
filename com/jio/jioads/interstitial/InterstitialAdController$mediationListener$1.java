/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.jio.jioads.interstitial;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.interstitial.InterstitialAdController;
import com.jio.jioads.videomodule.s;
import com.jioads.mediation.JioAdsMediationCallback;
import com.jioads.mediation.partners.videoutils.JioMediationVideoController;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class InterstitialAdController$mediationListener$1
implements JioAdsMediationCallback {
    public final /* synthetic */ InterstitialAdController a;

    public InterstitialAdController$mediationListener$1(InterstitialAdController interstitialAdController) {
        this.a = interstitialAdController;
    }

    public final void addMediationUrl(String string2, JioMediationVideoController jioMediationVideoController, int n3, int n4, Integer n7, Integer n8, String string3) {
        Intrinsics.checkNotNullParameter(string2, "url");
        Intrinsics.checkNotNullParameter(jioMediationVideoController, "jioMediationVideoController");
    }

    public final int getCurrentPosition() {
        int n3;
        Object object = InterstitialAdController.access$getJioVideoView$p(this.a);
        if (object != null && (object = ((s)object).Z()) != null) {
            n3 = (Integer)object;
        } else {
            n3 = 0;
            object = null;
        }
        return n3;
    }

    public final int getVideoAdDuration() {
        int n3;
        Object object = InterstitialAdController.access$getJioVideoView$p(this.a);
        if (object != null && (object = ((s)object).b0()) != null) {
            n3 = (Integer)object;
        } else {
            n3 = 0;
            object = null;
        }
        return n3;
    }

    public final int getVolume() {
        int n3;
        s s7 = InterstitialAdController.access$getJioVideoView$p(this.a);
        if (s7 != null) {
            n3 = s7.X();
        } else {
            n3 = 0;
            s7 = null;
        }
        return n3;
    }

    public final void mediationData(JSONObject object) {
        Intrinsics.checkNotNullParameter(object, "nativejson");
        Object object2 = new StringBuilder();
        InterstitialAdController interstitialAdController = this.a;
        String string2 = interstitialAdController.getIJioAdView().P();
        object2.append(string2);
        object2.append(": InterstitialAdController mediationData() Called");
        Intrinsics.checkNotNullParameter(object2.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        object = object.toString();
        object2 = interstitialAdController.getHeaders();
        interstitialAdController.onAdDataUpdate((String)object, (Map)object2);
    }

    public final void onLoadAdCalledForVideoMediationIMA() {
    }

    public final void pauseAdFromMediation(boolean bl2) {
    }

    public final void resumeAdFromMediation(boolean bl2) {
    }

    public final void stopAds(boolean bl2) {
    }
}

