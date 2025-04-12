/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 */
package com.jio.jioads.instream.video;

import android.os.CountDownTimer;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.instream.video.InstreamVideo;
import com.jio.jioads.videomodule.s;
import kotlin.jvm.internal.Intrinsics;

public final class i
extends CountDownTimer {
    public final /* synthetic */ InstreamVideo a;
    public final /* synthetic */ long b;

    public i(long l2, InstreamVideo instreamVideo, long l3) {
        this.a = instreamVideo;
        this.b = l3;
        super(l2, 1000L);
    }

    public final void onFinish() {
        Object object = new StringBuilder();
        InstreamVideo instreamVideo = this.a;
        String string2 = InstreamVideo.access$getIJioAdView$p(instreamVideo).P();
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(": Ad pod time up. Closing All ads");
        object = ((StringBuilder)object).toString();
        string2 = "message";
        Intrinsics.checkNotNullParameter(object, string2);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object2 = JioAds$LogLevel.NONE;
        long l2 = System.currentTimeMillis();
        long l3 = this.b;
        l2 -= l3;
        int n3 = 1000;
        l3 = n3;
        l2 /= l3;
        l3 = 1L;
        l2 -= l3;
        StringBuilder stringBuilder = new StringBuilder();
        String string3 = InstreamVideo.access$getIJioAdView$p(instreamVideo).P();
        stringBuilder.append(string3);
        string3 = ": AdPod closed in ";
        stringBuilder.append(string3);
        stringBuilder.append(l2);
        stringBuilder.append(" sec");
        object2 = stringBuilder.toString();
        Intrinsics.checkNotNullParameter(object2, string2);
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = InstreamVideo.access$getJioVideoView$p(instreamVideo);
        if (object != null) {
            ((s)object).u();
        }
        InstreamVideo.access$releaseInstream(instreamVideo);
    }

    public final void onTick(long l2) {
    }
}

