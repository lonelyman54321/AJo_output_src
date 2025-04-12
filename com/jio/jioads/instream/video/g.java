/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 */
package com.jio.jioads.instream.video;

import android.os.CountDownTimer;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.instream.video.InstreamVideo;
import com.jio.jioads.videomodule.s;
import kotlin.jvm.internal.Intrinsics;

public final class g
extends CountDownTimer {
    public final /* synthetic */ InstreamVideo a;

    public g(InstreamVideo instreamVideo, long l2) {
        this.a = instreamVideo;
        super(l2, 1000L);
    }

    public final void onFinish() {
        Object object = this.a;
        boolean bl2 = InstreamVideo.access$isAdPrepared$p((InstreamVideo)object);
        if (!bl2) {
            bl2 = true;
            InstreamVideo.access$setPodTimeOut$p((InstreamVideo)object, bl2);
            Object object2 = new StringBuilder();
            Object object3 = InstreamVideo.access$getIJioAdView$p((InstreamVideo)object).P();
            ((StringBuilder)object2).append((String)object3);
            ((StringBuilder)object2).append(": Calling cleanup from onFinish of pod timer");
            Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object2 = InstreamVideo.access$getJioVideoView$p((InstreamVideo)object);
            object3 = null;
            if (object2 != null) {
                ((s)object2).z = null;
            }
            if ((object2 = InstreamVideo.access$getJioVideoView$p((InstreamVideo)object)) != null) {
                ((s)object2).l();
            }
            InstreamVideo.access$setJioVideoView$p((InstreamVideo)object, null);
            InstreamVideo.access$closeAdPod((InstreamVideo)object);
            object2 = InstreamVideo.access$getPodSelectionTimer$p((InstreamVideo)object);
            if (object2 != null) {
                object2.cancel();
            }
            InstreamVideo.access$setPodSelectionTimer$p((InstreamVideo)object, null);
            object2 = InstreamVideo.access$getJioAdCallbacks$p((InstreamVideo)object);
            object3 = JioAdView$AdState.FAILED;
            ((V)object2).e((JioAdView$AdState)((Object)object3));
            object2 = JioAdError.Companion;
            object3 = JioAdError$JioAdErrorType.ERROR_ADPOD_TIMEOUT;
            String string2 = "AdPod Timeout error";
            JioAdError jioAdError = j_0.c((t_0)object2, (JioAdError$JioAdErrorType)((Object)object3), string2);
            object = InstreamVideo.access$getJioAdCallbacks$p((InstreamVideo)object);
            d d2 = d.b;
            Object object4 = object;
            object4 = (V)object;
            String string3 = "AdPod Timer Issue";
            String string4 = "startPodTimer";
            String string5 = "JioAdViewController";
            ((V)object4).d(jioAdError, false, d2, string4, string5, string3, null);
        }
    }

    public final void onTick(long l2) {
        Object object;
        Object object2;
        InstreamVideo instreamVideo = this.a;
        boolean bl2 = InstreamVideo.access$isInstreamVideoClassReleased$p(instreamVideo);
        String string2 = "message";
        if (bl2) {
            object2 = new StringBuilder();
            object = InstreamVideo.access$getIJioAdView$p(instreamVideo).P();
            ((StringBuilder)object2).append((String)object);
            object = ": canceling pod timer";
            ((StringBuilder)object2).append((String)object);
            Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object2 = InstreamVideo.access$getPodSelectionTimer$p(instreamVideo);
            if (object2 != null) {
                object2.cancel();
            }
            InstreamVideo.access$setPodSelectionTimer$p(instreamVideo, null);
        }
        object2 = new StringBuilder();
        object = InstreamVideo.access$getIJioAdView$p(instreamVideo).P();
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append(": onTick of podTimer");
        Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), string2);
        object2 = JioAds.Companion;
        ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        boolean bl3 = InstreamVideo.access$isAdPrepared$p(instreamVideo);
        if (bl3) {
            object = new StringBuilder();
            String string3 = InstreamVideo.access$getIJioAdView$p(instreamVideo).P();
            ((StringBuilder)object).append(string3);
            string3 = ": Cancelling the pod timer";
            ((StringBuilder)object).append(string3);
            object = ((StringBuilder)object).toString();
            Intrinsics.checkNotNullParameter(object, string2);
            ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = InstreamVideo.access$getPodSelectionTimer$p(instreamVideo);
            if (object2 != null) {
                object2.cancel();
            }
            InstreamVideo.access$setPodSelectionTimer$p(instreamVideo, null);
        }
    }
}

