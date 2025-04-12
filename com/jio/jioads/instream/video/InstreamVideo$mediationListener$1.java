/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.jio.jioads.instream.video;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.instream.video.InstreamVideo;
import com.jio.jioads.instreamads.vastparser.n;
import com.jio.jioads.videomodule.s;
import com.jioads.mediation.JioAdsMediationCallback;
import com.jioads.mediation.partners.videoutils.JioMediationVideoController;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class InstreamVideo$mediationListener$1
implements JioAdsMediationCallback {
    public final /* synthetic */ InstreamVideo a;

    public InstreamVideo$mediationListener$1(InstreamVideo instreamVideo) {
        this.a = instreamVideo;
    }

    public final void addMediationUrl(String string2, JioMediationVideoController jioMediationVideoController, int n3, int n4, Integer n7, Integer n8, String string3) {
        Intrinsics.checkNotNullParameter(string2, "url");
        Intrinsics.checkNotNullParameter(jioMediationVideoController, "jioMediationVideoController");
        Object object = new StringBuilder();
        Object object2 = this.a;
        Object object3 = InstreamVideo.access$getIJioAdView$p((InstreamVideo)object2).P();
        object.append((String)object3);
        object.append(": value an jioVastParsingHelper is ");
        object3 = InstreamVideo.access$getJioVastParsingHelper$p((InstreamVideo)object2);
        object.append(object3);
        object = object.toString();
        object3 = "message";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object2 = InstreamVideo.access$getJioVastParsingHelper$p((InstreamVideo)object2);
        if (object2 != null) {
            object3 = n3;
            ((n)object2).j(string2, jioMediationVideoController, (Integer)object3, n4, n7, n8, string3);
        }
    }

    public final int getCurrentPosition() {
        int n3;
        Object object = InstreamVideo.access$getJioVideoView$p(this.a);
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
        Object object = InstreamVideo.access$getJioVideoView$p(this.a);
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
        s s7 = InstreamVideo.access$getJioVideoView$p(this.a);
        if (s7 != null) {
            n3 = s7.X();
        } else {
            n3 = 0;
            s7 = null;
        }
        return n3;
    }

    public final void mediationData(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "nativejson");
    }

    public final void onLoadAdCalledForVideoMediationIMA() {
        Intrinsics.checkNotNullParameter("onLoadAdCalledForVideoMediationIMA called in InStream Video Ad", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object = JioAds$LogLevel.NONE;
        object = this.a;
        HashMap hashMap = InstreamVideo.access$getHeaders((InstreamVideo)object);
        ((InstreamVideo)object).onAdDataUpdate(null, hashMap);
    }

    public final void pauseAdFromMediation(boolean bl2) {
        this.a.pauseAd(bl2);
    }

    public final void resumeAdFromMediation(boolean bl2) {
        this.a.resumeAd(bl2);
    }

    public final void stopAds(boolean bl2) {
        s s7 = InstreamVideo.access$getJioVideoView$p(this.a);
        if (s7 != null) {
            s7.u();
        }
    }
}

