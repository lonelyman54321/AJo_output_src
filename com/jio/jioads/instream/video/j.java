/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 */
package com.jio.jioads.instream.video;

import android.os.CountDownTimer;
import com.jio.jioads.adinterfaces.JioAdView$VideoAdType;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.instream.video.InstreamVideo;
import com.jio.jioads.instream.video.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j
extends Lambda
implements Function0 {
    public final /* synthetic */ InstreamVideo c;

    public j(InstreamVideo instreamVideo) {
        this.c = instreamVideo;
        super(0);
    }

    public final Object invoke() {
        Object object;
        Object object2;
        long l2;
        InstreamVideo instreamVideo = this.c;
        long l3 = InstreamVideo.access$getRequiredAdDuration(instreamVideo);
        long l4 = l3 - (l2 = 0L);
        Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object3 > 0 && (object2 = InstreamVideo.access$getIJioAdView$p(instreamVideo).E()) == (object = JioAdView$VideoAdType.STREAMING) && (object2 = InstreamVideo.access$getPodViewingTimer$p(instreamVideo)) == null) {
            object2 = new StringBuilder();
            object = InstreamVideo.access$getIJioAdView$p(instreamVideo).P();
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(": Starting Vast Pod Timer");
            object2 = ((StringBuilder)object2).toString();
            object = "message";
            Intrinsics.checkNotNullParameter(object2, (String)object);
            object2 = JioAds.Companion;
            ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            Object object4 = JioAds$LogLevel.NONE;
            object4 = new StringBuilder();
            String string2 = InstreamVideo.access$getIJioAdView$p(instreamVideo).P();
            ((StringBuilder)object4).append(string2);
            string2 = ": time considered ";
            ((StringBuilder)object4).append(string2);
            long l7 = InstreamVideo.access$getRequiredAdDuration(instreamVideo);
            ((StringBuilder)object4).append(l7);
            object4 = ((StringBuilder)object4).toString();
            Intrinsics.checkNotNullParameter(object4, (String)object);
            ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            long l8 = System.currentTimeMillis();
            l3 = InstreamVideo.access$getRequiredAdDuration(instreamVideo) + 1L;
            int n3 = 1000;
            l2 = (long)n3 * l3;
            InstreamVideo instreamVideo2 = this.c;
            object = object2;
            object2 = new i(l2, instreamVideo2, l8);
            object2 = object2.start();
            InstreamVideo.access$setPodViewingTimer$p(instreamVideo, (CountDownTimer)object2);
        }
        return Unit.a;
    }
}

